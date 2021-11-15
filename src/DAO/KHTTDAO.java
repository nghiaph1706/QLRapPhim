/* @author nghiacubu */


package DAO;

import Model.KHTT;
import Utilities.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KHTTDAO extends QLRapPhimDAO<KHTT, String>{
    private String insertSql = "INSERT INTO [KhachHangThanThiet]([Ten],[SDT],[Email],[NgayDK],"
                              + "[MucGiamGia],[SoLanSuDung],[MaNhanVien],[HIDE]) VALUES (?,?,?,?,?,?,?,?)";
    private String updateSql = "UPDATE [KhachHangThanThiet] SET [Ten] = ?, [SDT] = ?, [Email] = ?, [NgayDK] = ?, "
            + "                 [MucGiamGia] = ?, [SoLanSuDung] = ?, [MaNhanVien] = ?, [HIDE] = ? WHERE [MaKHTT] = ?";
    private String deleteSql = "update [KhachHangThanThiet] set hide = 1 where [MaKHTT]=?";
    private String select_All_Sql = "Select * from KhachHangThanThiet where hide = 0";
    private String select_sql_byID = "Select * from KhachHangThanThiet where [MaKHTT]=? and where hide =0";
    
    @Override
    public void insert(KHTT enity) {
        XJdbc.update(insertSql, );
    }

    @Override
    public void update(KHTT enity) {
        XJdbc.update(updateSql, enity.getTenDichVu(),enity.getGiaDichVu(),enity.getHide(),enity.getMaDichVu());
    }

    @Override
    public void delete(String key) {
        XJdbc.update(deleteSql, key);
    }

    @Override
    public List<KHTT> selectAll() {
        return selectBySql(select_All_Sql);
    }

    @Override
    public KHTT selectById(String key) {
        return selectBySql(select_sql_byID, key).get(0);
    }

    @Override
    protected List<KHTT> selectBySql(String sql, Object... args) {
        List<KHTT> list = new ArrayList<>();
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

}
