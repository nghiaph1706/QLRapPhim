/* @author nghiacubu */
package DAO;

import Model.Phong;
import Utilities.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhongDAO extends QLRapPhimDAO<Phong, Integer> {

    static String insert = "";
    static String update = "";
    static String delete = "";
    static String selectall = "";
    static String selectbyid = "";

    @Override
    public void insert(Phong enity) {
//
    }

    @Override
    public void update(Phong enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Phong> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Phong selectById(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Phong> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Phong readValuesFromRS(ResultSet rs){
        try {
            Phong xphong = new Phong();
            xphong.setId(Integer.valueOf(rs.getString("id")));
            xphong.setMaphong(rs.getString("maphong"));
            xphong.setSohang(Integer.valueOf(rs.getString("sohang")));
            xphong.setHide(rs.getBoolean("hide"));
            return xphong;
        } catch (SQLException ex) {
            Logger.getLogger(PhongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
