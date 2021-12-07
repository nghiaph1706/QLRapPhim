
package Entity;

public class Ve {

    int id;
    String mave, maphim, malichchieu, maphong, maghe;

    public Ve() {
    }

    public Ve(String mave, String maphim, String malichchieu, String maphong, String maghe) {
        this.mave = mave;
        this.maphim = maphim;
        this.malichchieu = malichchieu;
        this.maphong = maphong;
        this.maghe = maghe;
    }

    public int getId() {
        return id;
    }

    public String getMave() {
        return mave;
    }

    public void setMave(String mave) {
        this.mave = mave;
    }

    public String getMaphim() {
        return maphim;
    }

    public void setMaphim(String maphim) {
        this.maphim = maphim;
    }

    public String getMalichchieu() {
        return malichchieu;
    }

    public void setMalichchieu(String malichchieu) {
        this.malichchieu = malichchieu;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getMaghe() {
        return maghe;
    }

    public void setMaghe(String maghe) {
        this.maghe = maghe;
    }
    
}
