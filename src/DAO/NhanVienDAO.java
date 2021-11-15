/* @author nghiacubu */


package DAO;

import Entity.NhanVien;
import Utilities.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NhanVienDAO extends QLRapPhimDAO<NhanVien, String> {
    
    private String INSERT_SQL = "INSERT INTO [NhanVien]([HoTen],[SDT],[GioiTinh],[ChucVu],[MatKhau],[Hinh],[HIDE]) VALUES (?,?,?,?,?,?,?)";
    private String UPDATE_SQL = "UPDATE [NhanVien] SET [HoTen] = ?, [SDT] = ?, [GioiTinh] = ?, [ChucVu] = ?, [MatKhau] = ?, [Hinh] = ?, [HIDE] = ? WHERE [MaNhanVien] = ?";
    private String DELETE_SQL = "UPDATE [NhanVien] SET HIDE = 1 WHERE [MaNhanVien] = ?";
    private String SELECT_BY_ID = "SELECT * FROM NhanVien WHERE [HIDE] = 0 AND [MaNhanVien] = ?";
    private String SELECT_ALL = "SELECT * FROM NhanVien WHERE [HIDE] = 0";

    @Override
    public void insert(NhanVien entity) {
        try {
            XJdbc.update(INSERT_SQL, entity.getHoTen(), entity.getSDT(), entity.isGioiTinh(), entity.isChucVu(), entity.getMatKhau(), entity.getHinh(), entity.isHIDE());
        } catch (Exception e) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void update(NhanVien entity) {
        try {
            XJdbc.update(UPDATE_SQL, entity.getHoTen(), entity.getSDT(), entity.isGioiTinh(), entity.isChucVu(), entity.getMatKhau(), entity.getHinh(), entity.isHIDE(), entity.getMaNhanVien());
        } catch (Exception e) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void delete(String key) {
        try {
            XJdbc.update(DELETE_SQL, key);
        } catch (Exception e) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL);
    }

    @Override
    public NhanVien selectById(String key) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID, key);
        if(list.isEmpty())
            return null;
        return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString("MaNhanVien"));
                nv.setHoTen(rs.getNString("HoTen"));
                nv.setSDT(rs.getString("SDT"));
                nv.setGioiTinh(rs.getBoolean("GioiTinh"));
                nv.setChucVu(rs.getBoolean("ChucVu"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setHinh(rs.getString("Hinh"));
                nv.setHIDE(rs.getBoolean("HIDE"));
                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
