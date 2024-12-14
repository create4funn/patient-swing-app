package Card;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class HelpMethod {

    // Method to convert a string to a byte array
    public static byte[] ConvertStringToByteArr(String input) {
        // Log the input string
        // System.out.println("Input String: " + input);

        // Initialize a byte array to hold the hexadecimal representation of the input string
        byte[] byteArray = new byte[input.length()];
        // System.out.println("Initialized byte array of length: " + byteArray.length);

        // Convert each character to a byte
        for (int i = 0; i < input.length(); i++) {
            // Log the character and its index
            // System.out.println("Processing character at index " + i + ": " + input.charAt(i));

            // Convert the character to a byte and store it in the array
            byteArray[i] = (byte) input.charAt(i);

            // Log the converted byte value
            // System.out.println("Converted byte: " + byteArray[i]);
        }

        // Log the resulting byte array as a string
        // System.out.println("Resulting byte array: " + java.util.Arrays.toString(byteArray));

        return byteArray;
    }

    // Method to convert byte array to string array using a delimiter
    /* Mảng Byte sẽ được chuyển sang mảng String, thứ tự các giá trị trong mảng String như sau:
        String[0]: Hoten
        String[1]: NgaySinh
        String[2]: QueQuan(diaChi)
        String[3]: GioiTinh
        String[4]: SDT
        String[5]: MaBenhNhan(SoBHYT)
     */
    public static String[] convertByteToStringArr(byte[] byteArray, char delimiter) {
        // Convert byte array to string
        String str = new String(byteArray);
        // System.out.println("Converted String: " + str); // Debug print

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
        String[] result;
        parts.add(currentPart.toString());
        result = parts.toArray(new String[0]);

        // Debug print each element in the result array
        // System.out.println("Split result length: " + result.length);
        // for (int i = 0; i < result.length; i++) {
        //     System.out.println("String[" + i + "]: " + result[i]);
        // }

        return result;
    }

    // Method to convert byte array to image
    public static BufferedImage convertByteArrayToImage(byte[] byteArray) {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(byteArray);
            return ImageIO.read(bis);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to convert image to byte array
    public static byte[] convertImageToByteArray(BufferedImage image) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "png", baos);
            return baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
