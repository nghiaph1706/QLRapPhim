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


public class HDCTDAO extends QLRapPhimDAO<HDCT, String>{
    private String insertSqlVe = "INSERT INTO [HoaDonChiTiet]([MaVe],[GiaTien],[SoLuong],[ThanhTien],[MaHoaDon],[HIDE]) VALUES (?,?,?,?,?,?)";
    private String insertSqlDichVu = "INSERT INTO [HoaDonChiTiet]([MaDichVu],[GiaTien],[SoLuong],[ThanhTien],[MaHoaDon],[HIDE]) VALUES (?,?,?,?,?,?)";
    private String updateSql = "UPDATE [HoaDonChiTiet] SET [MaDichVu] = ?, [GiaTien] = ?, [SoLuong] = ?, [ThanhTien] = ?, [MaHoaDon] = ?, [HIDE] = ? WHERE [MaHoaDonChiTiet] = ?";
    private String deleteSql = "UPDATE [HoaDonChiTiet] set [HIDE] = 1 WHERE [MaHoaDonChiTiet] = ?";
    private String select_All_Sql = "Select * from [HoaDonChiTiet] where hide = 0";
    private String select_sql_byID = "Select * from [HoaDonChiTiet] where [MaHoaDonChiTiet]=? and hide =0";
    
    @Override
    public void insert(HDCT enity) {
        
    }

    @Override
    public void update(HDCT enity) {
        XJdbc.update(updateSql, enity.getTenDichVu(),enity.getGiaDichVu(),enity.getHide(),enity.getMaDichVu());
    }

    @Override
    public void delete(String key) {
        XJdbc.update(deleteSql, key);
    }

    @Override
    public List<HDCT> selectAll() {
        return selectBySql(select_All_Sql);
    }

    @Override
    public HDCT selectById(String key) {
        return selectBySql(select_sql_byID, key).get(0);
    }

    @Override
    protected List<HDCT> selectBySql(String sql, Object... args) {
        List<HDCT> list = new ArrayList<>();
        ResultSet rs = XJdbc.query(sql, args);
        try {
            while(rs.next()){
                list.add();             
            }
        } catch (SQLException ex) {
            Logger.getLogger(DichVuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public void insertVe(HDCT entity){
        XJdbc.update(insertSqlVe);
    }
    public void insertDichVu(HDCT entity){
        XJdbc.update(insertSqlDichVu);
    }
}
