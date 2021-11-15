/* @author nghiacubu */


package Model;

import java.util.Date;

public class HoaDon {
    private int ID;
    private String MaHoaDon;
    private double TongTien;
    private String MaKM;
    private String MaKHTT;
    private int MucGiamGia;
    private double ThanhTien;
    private Date NgayLap;
    private String MaNhanVien;
    private boolean HIDE;

    @Override
    public String toString() {
        return this.MaHoaDon;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getMaKHTT() {
        return MaKHTT;
    }

    public void setMaKHTT(String MaKHTT) {
        this.MaKHTT = MaKHTT;
    }

    public int getMucGiamGia() {
        return MucGiamGia;
    }

    public void setMucGiamGia(int MucGiamGia) {
        this.MucGiamGia = MucGiamGia;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public boolean isHIDE() {
        return HIDE;
    }

    public void setHIDE(boolean HIDE) {
        this.HIDE = HIDE;
    }
    
    
    
}