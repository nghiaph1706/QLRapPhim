/* @author nghiacubu */


package DAO;

import Model.HDCT;
import Utilities.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HDCTDAO extends QLRapPhimDAO<HDCT, String> {

    String insertSqlVe = "INSERT INTO [HoaDonChiTiet]([MaVe],[GiaTien],"
            + "                       [SoLuong],[ThanhTien],[MaHoaDon],[HIDE]) "
            + "                       VALUES (?,?,?,?,?,?)";
    String insertSqlDichVu = "INSERT INTO [HoaDonChiTiet]([MaDichVu],"
            + "               [GiaTien],[SoLuong],[ThanhTien],[MaHoaDon],[HIDE]) "
            + "               VALUES (?,?,?,?,?,?)";
    String updateSql = "UPDATE [HoaDonChiTiet] SET [MaDichVu] = ?, [GiaTien] = ?, "
            + "                                    [SoLuong] = ?, [ThanhTien] = ?, [MaHoaDon] = ?, "
            + "                                    [HIDE] = ? WHERE [MaHoaDonChiTiet] = ?";
    String deleteSql = "UPDATE [HoaDonChiTiet] SET [HIDE] = 1 WHERE [MaHoaDonChiTiet] = ?";
    String select_All_Sql = "Select * from [HoaDonChiTiet] where hide = 0";
    String select_sql_byID = "Select * from [HoaDonChiTiet] WHERE [MaHoaDonChiTiet] = ? and hide = 0";

    @Override
    public void insert(HDCT entity) {
       
        
    }

    @Override
    public void update(HDCT entity) {
        XJdbc.update(updateSql, entity.getMaDichVu(),entity.getGiaTien(),
                entity.getSoLuong(),entity.getThanhTien(),entity.getMaHoaDon(),
                entity.isHIDE(),entity.getMaHoaDonChiTiet());       
    }

    @Override
    public void delete(String key) {
        XJdbc.update(deleteSql, key);
    }

    @Override
    public List<HDCT> selectAll() {
        return  selectBySql(select_All_Sql);
    }

    @Override
    public HDCT selectById(String key) {
        return selectBySql(select_sql_byID, key).get(0);
    }

    @Override
    protected List<HDCT> selectBySql(String sql, Object... args) {
        List<HDCT> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                list.add(new HDCT(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5), rs.getDouble(6), rs.getString(7), rs.getBoolean(8)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DichVuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public void insertVe(HDCT entity) {
        XJdbc.update(insertSqlDichVu, entity.getMaVe(),entity.getGiaTien(),entity.getSoLuong(),entity.getThanhTien(),entity.getMaHoaDon(),entity.isHIDE());
    }
    public void insertDichVu(HDCT entity) {
        XJdbc.update(insertSqlDichVu, entity.getMaDichVu(),entity.getGiaTien(),entity.getSoLuong(),entity.getThanhTien(),entity.getMaHoaDon(),entity.isHIDE());
    }
}


/*

   String insertSqlVe = "INSERT INTO [HoaDonChiTiet]([MaVe],[GiaTien],"
            + "                       [SoLuong],[ThanhTien],[MaHoaDon],[HIDE]) "
            + "                       VALUES (?,?,?,?,?,?)";
    String insertSqlDichVu = "INSERT INTO [HoaDonChiTiet]([MaDichVu],"
            + "               [GiaTien],[SoLuong],[ThanhTien],[MaHoaDon],[HIDE]) "
            + "               VALUES (?,?,?,?,?,?)";


*/
