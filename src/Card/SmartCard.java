package Card;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.CommandAPDU;
import javax.smartcardio.ResponseAPDU;
import javax.smartcardio.TerminalFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class SmartCard {

    public static final byte[] AID_APPLET = {(byte) 0x11, (byte) 0x22, (byte) 0x33, (byte) 0x44, (byte) 0x55, (byte) 0x00, (byte) 0x00};
    private Card card;
    private TerminalFactory factory;
    private CardChannel channel;
    private CardTerminal terminal;
    private List<CardTerminal> terminals;
    private ResponseAPDU response;
    public static boolean isCardBlocked = false;

    public SmartCard() {
    }

    public boolean connectCard() {
        try {
            factory = TerminalFactory.getDefault();
            terminals = factory.terminals().list();
            terminal = terminals.get(0);
            card = terminal.connect("T=0");
            channel = card.getBasicChannel();
            if (channel == null) {
                return false;
            }
            response = channel.transmit(new CommandAPDU(0x00, (byte) 0xA4, 0x04, 0x00, AID_APPLET));
            String check = Integer.toHexString(response.getSW());
            if (check.equals("9000")) {
                return true;
            } else if (check.equals("6400")) {
                JOptionPane.showMessageDialog(null, "Thẻ đã bị vô hiệu hóa");
                return true;
            } else {
                return false;
            }
        } catch (HeadlessException | CardException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public boolean disconnect() {
        try {
            card.disconnect(false);
            return true;
        } catch (CardException e) {
            System.out.println("Loi: " + e);
        }
        return false;
    }

    // Method to send a command APDU to the applet
    public ResponseAPDU sendCommandAPDU(byte[] command) {
        try {
            CommandAPDU commandAPDU = new CommandAPDU(command);
            response = channel.transmit(commandAPDU);
            return response;
        } catch (CardException e) {
            System.out.println("Error sending APDU: " + e);
            return null;
        }
    }

    // Method to get patient info from the applet
    public String[] getPatientInfo() {
        byte[] command; // Example command, adjust as needed
        command = new byte[]{(byte) 0x00, (byte) 0x13, (byte) 0x00, (byte) 0x00, (byte) 0x00};
        ResponseAPDU response = sendCommandAPDU(command);
        if (response != null && response.getSW() == 0x9000) {
            byte[] data = response.getData();
            return convertByteToStringArr(data, '.');
        } else {
            System.out.println("Failed to get patient info, SW: " + Integer.toHexString(response.getSW()));
            return null;
        }
    }

    // Method to get patient info from the applet
    public String[] getPatientPin() {
        byte[] command; // Example command, adjust as needed
        command = new byte[]{(byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x00, (byte) 0x00};
        ResponseAPDU response = sendCommandAPDU(command);
        if (response != null && response.getSW() == 0x9000) {
            byte[] data = response.getData();
            return convertByteToStringArr(data, '.');
        } else {
            System.out.println("Failed to get patient info, SW: " + Integer.toHexString(response.getSW()));
            return null;
        }
    }

    public boolean updatePatientInfo(String hoTen, String ngaySinh, String queQuan, String gioiTinh, String maBenhNhan, String sdt, String maPin) {
        try {
            // Build the patient info string with delimiters in the reverse order (to match init_bn)
            StringBuilder dataBuilder = new StringBuilder();
            dataBuilder.append(hoTen).append(".") // hoTen
                    .append(ngaySinh).append(".") // ngaySinh
                    .append(queQuan).append(".") // queQuan
                    .append(gioiTinh).append(".") // gioiTinh
                    .append(maBenhNhan).append(".") // maBenhNhan
                    .append(sdt).append(".") // sdt
                    .append(maPin).append(".");  // maPin (last field)

            // Convert the string to a byte array
            byte[] dataBytes = ConvertStringToByteArr(dataBuilder.toString());

            // Create the APDU command with the constructed byte array
            byte[] command = new byte[5 + dataBytes.length]; // Header (5 bytes) + data
            command[0] = (byte) 0x00; // CLA
            command[1] = (byte) 0x10; // INS for UPDATE_BN
            command[2] = (byte) 0x00; // P1
            command[3] = (byte) 0x00; // P2
            command[4] = (byte) dataBytes.length; // Lc: length of the data
            System.arraycopy(dataBytes, 0, command, 5, dataBytes.length); // Append data

            // Send the command APDU to the applet
            ResponseAPDU response = sendCommandAPDU(command);

            // Check the response status word (SW)
            if (response != null && response.getSW() == 0x9000) {
                System.out.println("Patient info updated successfully.");
                return true;
            } else {
                System.out.println("Failed to update patient info, SW: " + Integer.toHexString(response.getSW()));
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error updating patient info: " + e);
            return false;
        }
    }

    public boolean updatePatientPin(String newPin) {
        try {
            // Convert the new PIN string to a byte array
            byte[] pinBytes = ConvertStringToByteArr(newPin);

            // Create the APDU command for updating the PIN
            byte[] command = new byte[5 + pinBytes.length]; // Header (5 bytes) + PIN data
            command[0] = (byte) 0x00; // CLA
            command[1] = (byte) 0x31; // INS for UPDATE_PIN
            command[2] = (byte) 0x00; // P1
            command[3] = (byte) 0x00; // P2
            command[4] = (byte) pinBytes.length; // Lc: length of the new PIN
            System.arraycopy(pinBytes, 0, command, 5, pinBytes.length); // Append PIN data

            // Send the command APDU to the applet
            ResponseAPDU response = sendCommandAPDU(command);

            // Check the response status word (SW)
            if (response != null && response.getSW() == 0x9000) {
                System.out.println("Patient PIN updated successfully.");
                return true;
            } else {
                System.out.println("Failed to update PIN, SW: " + Integer.toHexString(response.getSW()));
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error updating PIN: " + e);
            return false;
        }
    }

    public boolean CheckPin(String userPin) {
        try {
            // Convert the PIN string to a byte array
            byte[] pinBytes = ConvertStringToByteArr(userPin);

            // Create the APDU command with the PIN
            byte[] command = new byte[5 + pinBytes.length]; // Header (5 bytes) + PIN data
            command[0] = (byte) 0x00; // CLA
            command[1] = (byte) 0x20; // INS for VERIFY_PIN
            command[2] = (byte) 0x00; // P1
            command[3] = (byte) 0x00; // P2
            command[4] = (byte) pinBytes.length; // Lc: length of the PIN
            System.arraycopy(pinBytes, 0, command, 5, pinBytes.length); // Append PIN data

            // Send the command APDU to the applet
            ResponseAPDU response = sendCommandAPDU(command);

            // Check the response status word (SW) and data
            if (response != null) {
                byte[] responseBytes = response.getBytes();
                int sw = response.getSW();

                // Check for correct PIN
                if (responseBytes.length >= 3 && responseBytes[0] == (byte) 0x00 && sw == 0x9000) {
                    isCardBlocked = false; // Card is not blocked
                    System.out.println("PIN verified successfully.");
                    return true;
                } // Check for wrong PIN
                else if (responseBytes.length >= 3 && responseBytes[0] == (byte) 0x01 && sw == 0x9000) {
                    System.out.println("Incorrect PIN entered.");
                    return false;
                } // Check if the card is blocked
                else if (sw == 0x6983) {
                    isCardBlocked = true; // Card is blocked
                    System.out.println("Card is blocked.");
                    return false;
                } else {
                    System.out.println("Unexpected response. SW: " + Integer.toHexString(sw));
                    return false;
                }
            } else {
                System.out.println("No response from the card.");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error verifying PIN: " + e);
            return false;
        }
    }

    // Method to convert byte array to string array using a delimiter
    /* Mảng Byte sẽ được chuyển sang mảng String, thứ tự các giá trị trong mảng String như sau:
        String[0]: Hoten
        String[1]: NgaySinh
        String[2]: QueQuan(diaChi)
        String[3]: GioiTinh
        String[4]: MaBenhNhan(SoBHYT)
        String[5]: SDT
     */
    public static String[] convertByteToStringArr(byte[] byteArray, char delimiter) {
        // Convert byte array to string
        String str = new String(byteArray);
//        System.out.println("Converted String: " + str); // Debug print

        // Manually split the string using the delimiter
        List<String> parts = new ArrayList<>();
        StringBuilder currentPart = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == delimiter) {
                parts.add(currentPart.toString());
                currentPart.setLength(0); // Reset the StringBuilder
            } else {
                currentPart.append(c);
            }
        }
        // Add the last part
        parts.add(currentPart.toString());

        // Convert the list to an array
        String[] result = parts.toArray(new String[0]);

//        // Debug print each element in the result array
//        System.out.println("Split result length: " + result.length);
//        for (int i = 0; i < result.length; i++) {
//            System.out.println("String[" + i + "]: " + result[i]);
//        }
        return result;
    }

    // Method to convert a string to a byte array
    public static byte[] ConvertStringToByteArr(String input) {
        // Initialize aA byte array to hold the hexadecimal representation of the input string
        byte[] byteArray = new byte[input.length()];

        // Convert each character to a byte
        for (int i = 0; i < input.length(); i++) {
            byteArray[i] = (byte) input.charAt(i);
        }

        return byteArray;
    }
}
