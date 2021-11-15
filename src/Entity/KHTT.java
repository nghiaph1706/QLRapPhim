/* @author nghiacubu */


package Entity;

import java.util.Date;


public class KHTT {
    private int ID;
    private String MAKHTT;
    private String Ten;
    private String SDT;
    private String Email;
    private Date NgayDK;
    private double MucGiacGia;
    private int SoLanSuDung;
    private String MaNhanVien;
    private boolean HIDE;

    @Override
    public String toString() {
        return this.Ten;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMAKHTT() {
        return MAKHTT;
    }

    public void setMAKHTT(String MAKHTT) {
        this.MAKHTT = MAKHTT;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getNgayDK() {
        return NgayDK;
    }

    public void setNgayDK(Date NgayDK) {
        this.NgayDK = NgayDK;
    }

    public double getMucGiacGia() {
        return MucGiacGia;
    }

    public void setMucGiacGia(double MucGiacGia) {
        this.MucGiacGia = MucGiacGia;
    }

    public int getSoLanSuDung() {
        return SoLanSuDung;
    }

    public void setSoLanSuDung(int SoLanSuDung) {
        this.SoLanSuDung = SoLanSuDung;
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
