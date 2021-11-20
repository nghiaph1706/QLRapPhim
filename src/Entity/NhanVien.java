/* @author nghiacubu */


package Entity;


public class NhanVien {
    private String MaNhanVien;
    private String HoTen;
    private String SDT;
    private String Email;
    private boolean GioiTinh;
    private boolean ChucVu;
    private String MatKhau;
    private String Hinh;
    private boolean HIDE;

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
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

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public boolean isChucVu() {
        return ChucVu;
    }

    public void setChucVu(boolean ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public boolean isHIDE() {
        return HIDE;
    }

    public void setHIDE(boolean HIDE) {
        this.HIDE = HIDE;
    }

    public NhanVien(String MaNhanVien, String HoTen, String SDT, String Email, boolean GioiTinh, boolean ChucVu, String MatKhau, String Hinh, boolean HIDE) {
        this.MaNhanVien = MaNhanVien;
        this.HoTen = HoTen;
        this.SDT = SDT;
        this.Email = Email;
        this.GioiTinh = GioiTinh;
        this.ChucVu = ChucVu;
        this.MatKhau = MatKhau;
        this.Hinh = Hinh;
        this.HIDE = HIDE;
    }

    public NhanVien() {
    }

    
}
