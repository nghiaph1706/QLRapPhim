/* @author nghiacubu */
package DAO;

import Entity.Ve;
import Utilities.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VeDAO extends QLRapPhimDAO<Ve, String> {

    static String insert = "INSERT INTO [Ve]([MaPhim],[MaLichChieu],[MaPhong],[MaGhe]) VALUES (?,?,?,?)";
    static String update = "Update Ve Set Sohang =? Where maphim like ?";
    static String delete = "delete from Ve Where maphim like ?";
    static String selectall = "Select * from Ve";
    static String selectbyid = "Select * from Ve where maphim like";

    @Override
    public void insert(Ve entity) {
        XJdbc.update(insert, entity.getMaphim(), entity.getMalichchieu(), entity.getMaphong(), entity.getMaghe());
    }

    @Override
    public void update(Ve entity) {
        XJdbc.update(update, entity.getMaphong(), entity.getMaghe(), entity.getMalichchieu(), entity.getMaphim());
    }

    @Override
    public void delete(String key) {
        XJdbc.update(delete, key);
    }

    @Override
    public List<Ve> selectAll() {
        return selectBySql(selectall);
    }

    @Override
    public Ve selectById(String key) {
        List<Ve> list = selectBySql(selectbyid, key);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<Ve> selectBySql(String sql, Object... args) {
        List<Ve> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Ve v = new Ve();
                list.add(v);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Ve readFromResultSet(ResultSet rs) throws SQLException {
        Ve obj = new Ve();
        return obj;
    }

}
