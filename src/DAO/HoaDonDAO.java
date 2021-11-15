/* @author nghiacubu */


package DAO;

import Model.HoaDon;
import Utilities.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HoaDonDAO  extends QLRapPhimDAO<HoaDon, String>{
    private String insertSql = "INSERT INTO [HoaDon]([Ten],[SDT],[Email],[NgayDK],"
                              + "[MucGiamGia],[SoLanSuDung],[MaNhanVien],[HIDE]) VALUES (?,?,?,?,?,?,?,?)";
    private String updateSql = "UPDATE [HoaDon] SET [TongTien] = ?, [MaKM] = ?, [MaKHTT] = ?, [MucGiamGia] = ?,"
                           + " [ThanhTien] = ?, [NgayLap] = ?, [MaNhanVien] = ?, [HIDE] = ? WHERE [MaHoaDon] = ?";
    private String deleteSql = "update hoadon set hide = 1 where [MaHoaDon]=?";
    private String select_All_Sql = "Select * from HoaDon where hide = 0";
    private String select_sql_byID = "Select * from HoaDon where [MaKHTT]=? and hide =0";
    
    @Override
    public void insert(HoaDon enity) {
        XJdbc.update(insertSql, );
    }

    @Override
    public void update(HoaDon enity) {
        XJdbc.update(updateSql, enity.getTenDichVu(),enity.getGiaDichVu(),enity.getHide(),enity.getMaDichVu());
    }

    @Override
    public void delete(String key) {
        XJdbc.update(deleteSql, key);
    }

    @Override
    public List<HoaDon> selectAll() {
        return selectBySql(select_All_Sql);
    }

    @Override
    public HoaDon selectById(String key) {
        return selectBySql(select_sql_byID, key).get(0);
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
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
