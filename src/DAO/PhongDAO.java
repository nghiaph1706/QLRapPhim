/* @author nghiacubu */
package DAO;

import Entity.Phong;
import Utilities.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhongDAO extends QLRapPhimDAO<Phong, String> {

    static String insert = "INSERT INTO [Phong]([SoHang],[HIDE]) VALUES (?,?)";
    static String update = "Update Phong Set Sohang =? Where maphong like ?";
    static String delete = "Update Phong Set Hide = 1 Where maphong like ?";
    static String selectall = "Select * from Phong where hide = 0";
    static String selectbyid = "Select * from Phong where maphong like ? and hide = 0";

    @Override
    public void insert(Phong entity) {
        XJdbc.update(insert, entity.getSohang(), entity.isHide());
    }

    @Override
    public void update(Phong entity) {
        XJdbc.update(update, entity.getSohang(), entity.getMaphong());
    }

    @Override
    public void delete(String key) {
        XJdbc.update(delete, key);
    }

    @Override
    public List<Phong> selectAll() {
        return selectBySql(selectall);
    }

    @Override
    public Phong selectById(String key) {
        List<Phong> list = selectBySql(selectbyid, key);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<Phong> selectBySql(String sql, Object... args) {
        List<Phong> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Phong p = new Phong(rs.getInt("id"),rs.getInt("sohang"),rs.getString("maphong"),rs.getBoolean("hide"));
                list.add(p);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public Phong readFromResultSet(ResultSet rs) throws SQLException {
       Phong obj = new Phong();
        return obj;
    }
}
