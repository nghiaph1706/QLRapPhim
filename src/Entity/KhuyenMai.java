/* @author nghiacubu */


package Entity;

import java.util.Date;


public class KhuyenMai {
    private String MaKM;
    private String ThongTinKM;
    private double MucGiamGia;
    private Date NgayBatDau;
    private Date NgayKetThuc;
    private String MaNhanVien;
    private boolean HIDE;
    
    @Override
    public String toString() {
        return this.ThongTinKM;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getThongTinKM() {
        return ThongTinKM;
    }

    public void setThongTinKM(String ThongTinKM) {
        this.ThongTinKM = ThongTinKM;
    }

    public double getMucGiamGia() {
        return MucGiamGia;
    }

    public void setMucGiamGia(double MucGiamGia) {
        this.MucGiamGia = MucGiamGia;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
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
