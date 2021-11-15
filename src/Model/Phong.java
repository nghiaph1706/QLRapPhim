/* @author nghiacubu */
package Model;

public class Phong {

    int id, sohang;
    String maphong;
    boolean hide;

    public Phong() {
    }

    public Phong(int id, int sohang, String maphong, boolean hide) {
        this.id = id;
        this.sohang = sohang;
        this.maphong = maphong;
        this.hide = hide;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSohang() {
        return sohang;
    }

    public void setSohang(int sohang) {
        this.sohang = sohang;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }
    
}
