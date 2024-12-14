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
    private String balance;
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

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public BufferedImage getPicture() { // Updated getter for picture
        return picture;
    }

    public void setPicture(BufferedImage picture) { // Updated setter for picture
        this.picture = picture;
    }
}
