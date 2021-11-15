/* @author nghiacubu */


package DAO;
import Model.DichVu;
import Utilities.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DichVuDAO extends QLRapPhimDAO<DichVu, String>{
    private String insertSql = "INSERT INTO [DichVu]([MaDichVu],[TenDichVu],[GiaDichVu],[HIDE]) VALUES (?,?,?,?)";
    private String updateSql = "UPDATE [DichVu] SET [TenDichVu] = ?, [GiaDichVu] = ?, [HIDE] = ? WHERE [MaDichVu] = ?";
    private String deleteSql = "delete from dichvu where MaDichVu=?";
    private String select_All_Sql = "Select * from dichvu";
    private String select_sql_byID = "Select * from dichvu where MaDichVu=?";
    
    @Override
    public void insert(DichVu enity) {
        XJdbc.update(insertSql, enity.getMaDichVu(),enity.getTenDichVu(),enity.getGiaDichVu(),enity.getHide());
    }

    @Override
    public void update(DichVu enity) {
        XJdbc.update(updateSql, enity.getTenDichVu(),enity.getGiaDichVu(),enity.getHide(),enity.getMaDichVu());
    }

    @Override
    public void delete(String key) {
        XJdbc.update(deleteSql, key);
    }

    @Override
    public List<DichVu> selectAll() {
        return selectBySql(select_All_Sql);
    }

    @Override
    public DichVu selectById(String key) {
        return selectBySql(select_sql_byID, key).get(0);
    }

    @Override
    protected List<DichVu> selectBySql(String sql, Object... args) {
        List<DichVu> list = new ArrayList<>();
        ResultSet rs = XJdbc.query(sql, args);
        try {
            while(rs.next()){
                list.add(new DichVu(rs.getString("MaDichVu"),rs.getString("TenDichVu"),
                                    rs.getFloat("GiaDichVu"),rs.getBoolean("Hide")));             
            }
        } catch (SQLException ex) {
            Logger.getLogger(DichVuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
