package entities;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String hoten;
    private String ngaysinh;
    private String quequan;
    private String mabn;
    private String gioitinh;
    private String mapin;
    private String balance;
    private byte[] picture; // Updated to byte[] to store binary image data

    public User(Integer id, byte[] picture, String balance, String mapin, String gioitinh, String mabn, String quequan, String ngaysinh, String hoten) {
        this.id = id;
        this.picture = picture;
        this.balance = balance;
        this.mapin = mapin;
        this.gioitinh = gioitinh;
        this.mabn = mabn;
        this.quequan = quequan;
        this.ngaysinh = ngaysinh;
        this.hoten = hoten;
    }

    public User() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
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

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
