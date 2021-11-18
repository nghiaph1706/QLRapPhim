/* @author nghiacubu */


package DAO;

import Entity.KhuyenMai;
import Utilities.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class KhuyenMaiDAO extends QLRapPhimDAO<KhuyenMai, String>{

    static String insert = "INSERT INTO [KhuyenMai]([MaKM],[ThongTinKM],[MucGiamGia],[NgayBatDau],[NgayKetThuc],[MaNhanVien],[HIDE]) VALUES"
            + "(?,?,?,?,?,?,0)";
    static String update = "Update KhuyenMai Set  ThongTinKM=?,MucGiamGia=?,NgayBatDau=?,NgayKetThuc=?,MaNhanVien=? Where maphong like ?";
    static String delete = "Update KhuyenMai Set Hide = 1 Where MaKM like ?";
    static String selectall = "Select * from KhuyenMai";
    static String selectbyid = "Select * from KhuyenMai Where MaKM like ?";
    private String SELECT_MAKM = "SELECT MaKM FROM KhuyenMai";

    @Override
    public void insert(KhuyenMai entity) {
        XJdbc.update(insert, entity.getMaKM(), entity.getThongTinKM(),entity.getMucGiamGia(),entity.getNgayBatDau(),entity.getNgayKetThuc(),entity.getMaNhanVien());
    }

    @Override
    public void update(KhuyenMai entity) {
        XJdbc.update(update,entity.getThongTinKM(),entity.getMucGiamGia(),entity.getNgayBatDau(),entity.getNgayKetThuc(),entity.getMaNhanVien(),entity.getMaKM());
    }

    @Override
    public void delete(String key) {
        XJdbc.update(delete, key);
    }

    @Override
    public List<KhuyenMai> selectAll() {
        return selectBySql(selectall);
    }

    @Override
    public KhuyenMai selectById(String key) {
        List<KhuyenMai> list = selectBySql(selectbyid, key);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<KhuyenMai> selectBySql(String sql, Object... args) {
        List<KhuyenMai> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                KhuyenMai km = new KhuyenMai();
                km.setMaKM(rs.getString("MaKM"));
                km.setThongTinKM(rs.getNString("ThongTinKM"));
                km.setMucGiamGia(rs.getDouble("MucGiamGia"));
                km.setNgayBatDau(rs.getDate("NgayBatDau"));
                km.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                km.setMaNhanVien(rs.getString("MaNhanVien"));
                km.setHIDE(rs.getBoolean("HIDE"));
                list.add(km);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public KhuyenMai readFromResultSet(ResultSet rs) throws SQLException {
       KhuyenMai obj = new KhuyenMai();
        return obj;
    }
    public List<String> listKhuyenMai()
    {
        try {
            List<String> list = new ArrayList<>();
            ResultSet rs = XJdbc.query(SELECT_MAKM);
            while(rs.next()) {
                list.add(rs.getString(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<KhuyenMai> selectByMaKM(String id) {
        String sql = "SELECT * FROM KhuyenMai WHERE MaKM = ?";
        return this.selectBySql(sql, id);
    }
}