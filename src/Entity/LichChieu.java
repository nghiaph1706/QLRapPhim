/* @author nghiacubu */


package Entity;

import java.util.Date;


public class LichChieu {
    private int ID;
    private String MaLichChieu;
    private Date NgayChieu;
    private String GioChieu;
    private String MaPhim;
    private String MaPhong;
    private boolean HIDE;

    @Override
    public String toString() {
        return this.MaLichChieu;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaLichChieu() {
        return MaLichChieu;
    }

    public void setMaLichChieu(String MaLichChieu) {
        this.MaLichChieu = MaLichChieu;
    }

    public Date getNgayChieu() {
        return NgayChieu;
    }

    public void setNgayChieu(Date NgayChieu) {
        this.NgayChieu = NgayChieu;
    }

    public String getGioChieu() {
        return GioChieu;
    }

    public void setGioChieu(String GioChieu) {
        this.GioChieu = GioChieu;
    }

    public String getMaPhim() {
        return MaPhim;
    }

    public void setMaPhim(String MaPhim) {
        this.MaPhim = MaPhim;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public boolean isHIDE() {
        return HIDE;
    }

    public void setHIDE(boolean HIDE) {
        this.HIDE = HIDE;
    }
    
    
    
}
