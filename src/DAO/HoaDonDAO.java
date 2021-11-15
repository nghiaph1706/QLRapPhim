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


public class HoaDonDAO extends QLRapPhimDAO<HoaDon, String> {

    String insertSql = "INSERT INTO [HoaDon]([TongTien],[MaKM],[MaKHTT],[MucGiamGia],[ThanhTien],"
            + "                     [NgayLap],[MaNhanVien],[HIDE]) "
            + "                      VALUES (?,?,?,?,?,?,?,?)";
    
    String updateSql = "UPDATE [HoaDon] SET [TongTien] = ?, [MaKM] = ?, [MaKHTT] = ?, [MucGiamGia] = ?, "
            + "                             [ThanhTien] = ?, [NgayLap] = ?, [MaNhanVien] = ?, [HIDE] = ? "
            + "                             WHERE [MaHoaDon] = ?";
    String deleteSql = "UPDATE [HoaDon] SET [HIDE] = 1 WHERE [MaHoaDon] = ?";
    String select_All_Sql = "Select * from [HoaDon] where hide = 0";
    String select_sql_byID = "Select * from [HoaDon] WHERE [MaHoaDon] = ? and hide = 0";

    @Override
    public void insert(HoaDon entity) {
        XJdbc.update(insertSql, entity.getTongTien(), entity.getMaKM(), entity.getMaKHTT(), 
                                entity.getMucGiamGia(),entity.getThanhTien(),entity.getNgayLap(),
                                entity.getMaNhanVien(),entity.isHIDE());
        
    }

    @Override
    public void update(HoaDon entity) {
        XJdbc.update(updateSql, entity.getTongTien(), entity.getMaKM(), entity.getMaKHTT(), 
                                entity.getMucGiamGia(),entity.getThanhTien(),entity.getNgayLap(),
                                entity.getMaNhanVien(),entity.isHIDE(),entity.getMaHoaDon());
    }

    @Override
    public void delete(String key) {
        XJdbc.update(deleteSql, key);
    }

    @Override
    public List<HoaDon> selectAll() {
        return  selectBySql(select_All_Sql);
    }

    @Override
    public HoaDon selectById(String key) {
        return selectBySql(select_sql_byID, key).get(0);
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                list.add(new HoaDon(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getString(4), 
                                    rs.getInt(5), rs.getDouble(6), rs.getDate(7),
                                    rs.getString(8),rs.getBoolean(9)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DichVuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
