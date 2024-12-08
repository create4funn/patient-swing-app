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
}
