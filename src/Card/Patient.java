package Card;

import java.awt.image.BufferedImage; // Import for BufferedImage

public class Patient {

    private String hoten;
    private String ngaysinh;
    private String quequan;
    private String mabn;
    private String gioitinh;
    private String mapin;
    private String sdt;
    private int balance;
    private BufferedImage picture; // Changed to BufferedImage

    // Private static instance of the class
    private static Patient instance;

    // Private constructor to prevent instantiation
    private Patient() {
    }

    // Public method to provide the Singleton instance
    public static Patient getInstance() {
        if (instance == null) {
            instance = new Patient();
        }
        return instance;
    }

    // Getters and setters for fields
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getMabn() {
        return mabn;
    }

    public void setMabn(String mabn) {
        this.mabn = mabn;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getMapin() {
        return mapin;
    }

    public void setMapin(String mapin) {
        this.mapin = mapin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        try {
                // Parse the current balance and the new amount as doubles
                int currentBalance = this.balance;
                int amountToAdd = amount;

                // Perform the addition
                int newBalance = currentBalance + amountToAdd;

                // Update the balance as a string
                this.balance = newBalance;
        } catch (NumberFormatException e) {
            System.out.println("Invalid balance or amount: " + e.getMessage());
        }
    }

    public BufferedImage getPicture() { // Updated getter for picture
        return picture;
    }

    public void setPicture(BufferedImage picture) { // Updated setter for picture
        this.picture = picture;
    }
}
