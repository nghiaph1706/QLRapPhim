/* @author nghiacubu */


package DAO;

import Entity.LichChieu;
import Utilities.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LichChieuDAO extends QLRapPhimDAO<LichChieu, String> {
    
    private String INSERT_SQL = "INSERT INTO [LichChieu]([NgayChieu],[GioChieu],[MaPhim],[MaPhong],[HIDE]) VALUES (?,?,?,?,?)";
    private String UPDATE_SQL = "UPDATE [LichChieu] SET [NgayChieu] = ?, [GioChieu] = ?,[MaPhim] = ?,[MaPhong] = ?,[HIDE] = ? WHERE [MaLichChieu] = ?";
    private String DELETE_SQL = "UPDATE [LichChieu] SET [HIDE] = 1 WHERE [MaLichChieu] = ?";
    private String SELECT_BY_ID = "SELECT * FROM LichChieu WHERE [HIDE] = 0 AND [MaLichChieu] = ?";
    private String SELECT_ALL = "SELECT * FROM LichChieu WHERE [HIDE] = 0";
    
    @Override
    public void insert(LichChieu entity) {
        try {
            XJdbc.update(INSERT_SQL, entity);
        } catch (SQLException e) {
            Logger.getLogger(LichChieuDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void update(LichChieu entity) {
        try {
            XJdbc.update(UPDATE_SQL, entity);
        } catch (SQLException e) {
            Logger.getLogger(LichChieuDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void delete(String key) {
        try {
            XJdbc.update(DELETE_SQL, key)
        } catch (SQLException e) {
            Logger.getLogger(LichChieuDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public List<LichChieu> selectAll() {
        return this.selectBySql(SELECT_ALL);
    }

    @Override
    public LichChieu selectById(String key) {
        List<LichChieu> list = this.selectBySql(SELECT_BY_ID, key);
        if(list.isEmpty())
            return null;
        return list.get(0);
    }

    @Override
    protected List<LichChieu> selectBySql(String sql, Object... args) {
        List<LichChieu> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()) {
                LichChieu lc = new LichChieu();
                list.add(lc);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
