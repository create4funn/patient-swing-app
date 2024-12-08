/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card;

/**
 *
 * @author pc
 */
public class Patient {

    private String hoten;
    private String ngaysinh;
    private String quequan;
    private String mabn;
    private String gioitinh;
    private String mapin;

    public Patient(String hoten, String ngaysinh, String quequan, String mabn, String gioitinh, String mapin) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.mabn = mabn;
        this.gioitinh = gioitinh;
        this.mapin = mapin;
    }

    public Patient() {
    }

    public String getHoten() {
        return hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public String getMabn() {
        return mabn;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getMapin() {
        return mapin;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public void setMabn(String mabn) {
        this.mabn = mabn;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setMapin(String mapin) {
        this.mapin = mapin;
    }
    
}