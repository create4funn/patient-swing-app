package Card;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class HelpMethod {

    // Method to convert a string to a byte array
    public static byte[] ConvertStringToByteArr(String input) {
        // Log the input string
        // System.out.println("Input String: " + input);

        // Convert string to byte array using UTF-8 encoding
        byte[] byteArray = input.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        // System.out.println("Initialized byte array of length: " + byteArray.length);

        // Debug print the resulting byte array
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
        // Check if the byte array is null
        if (byteArray == null) {
            return null;
        }

        // Convert byte array to string with UTF-8 decoding
        String str = new String(byteArray, java.nio.charset.StandardCharsets.UTF_8);

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

        // Convert the list to an array and return
        return parts.toArray(new String[0]);
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
    
    public static SecretKey generateRandomKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        return keyGen.generateKey();
    }
    
    public static String encrypt(String plainText, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
    }
}
