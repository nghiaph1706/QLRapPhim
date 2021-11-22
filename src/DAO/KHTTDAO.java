/* @author nghiacubu */


package DAO;

import Entity.KHTT;
import Utilities.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KHTTDAO extends QLRapPhimDAO<KHTT, String> {

    String insertSql = "INSERT INTO [KhachHangThanThiet]([Ten],[SDT],[Email],[NgayDK],[MucGiamGia],[SoLanSuDung],[MaNhanVien],[HIDE]) VALUES (?,?,?,?,?,?,?,?)";
    String updateSql = "UPDATE [KhachHangThanThiet] SET [Ten] = ?, [SDT] = ?, [Email] = ?, [NgayDK] = ?, "
            + "                                         [MucGiamGia] = ?, [SoLanSuDung] = ?, [MaNhanVien] = ?,"
            + "                                         [HIDE] = ? WHERE [MaKHTT] = ?";
    String deleteSql = "UPDATE [KhachHangThanThiet] SET [HIDE] = 1 WHERE [MaKHTT] = ?";
    String select_All_Sql = "Select * from [KhachHangThanThiet] where hide = 0";
    String select_sql_byID = "Select * from [KhachHangThanThiet] where [MaKHTT] = ? and hide = 0";
    String select_All_byID = "select MaKHTT from KhachHangThanThiet";

    @Override
    public void insert(KHTT entity) {
        XJdbc.update(insertSql, entity.getTen(), entity.getSDT(), entity.getEmail(), 
                                entity.getNgayDK(),entity.getMucGiacGia(),entity.getSoLanSuDung(),
                                entity.getMaNhanVien(),entity.isHIDE());
        
    }

    @Override
    public void update(KHTT entity) {
        XJdbc.update(updateSql, entity.getTen(), entity.getSDT(), entity.getEmail(), 
                                entity.getNgayDK(),entity.getMucGiacGia(),entity.getSoLanSuDung(),
                                entity.getMaNhanVien(),entity.isHIDE(),entity.getMAKHTT());
    }

    @Override
    public void delete(String key) {
        XJdbc.update(deleteSql, key);
    }

    @Override
    public List<KHTT> selectAll() {
        return  selectBySql(select_All_Sql);
    }

    @Override
    public KHTT selectById(String key) {
        return selectBySql(select_sql_byID, key).get(0);
    }

    @Override
    protected List<KHTT> selectBySql(String sql, Object... args) {
        List<KHTT> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                list.add(new KHTT(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), 
                        rs.getDouble(6), rs.getInt(7), rs.getString(8), rs.getBoolean(9)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DichVuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public int selectMucGiamGia(String maKHTT){
        String sql = "select MucGiamGia from KhachHangThanThiet WHERE MaKHTT = ?";
        try {
            ResultSet rs = XJdbc.query(sql, maKHTT);
            while(rs.next()) {
                return rs.getInt(1);
            }
            rs.getStatement().getConnection().close();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
    
    public List<String> selectMaKHTT() {
        List<String> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(select_All_byID);
            while(rs.next()) {
                list.add(rs.getString(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

}
