/* @author nghiacubu */
package DAO;

import Utilities.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThongKeDAO {

    private List<Object[]> getList(String sql, String cols[], Object... args) throws SQLException {
        List<Object[]> list = new ArrayList<>();
        ResultSet rs = XJdbc.query(sql, args);
        while (rs.next()) {
            Object[] vals = new Object[cols.length];
            for (int i = 0; i < vals.length; i++) {
                vals[i] = rs.getObject(cols[i]);                                        
            }
            list.add(vals);
        }
        return list;
    }

    public List<Object[]> getDoanhThuNam() throws SQLException {
        List<Object[]> list = new ArrayList<>();
        String sql = "{CALL SP_DOANHTHUNAM}";
        ResultSet rs = XJdbc.query(sql);
        while (rs.next()) {
            Object[] a = {rs.getString(2), rs.getString(3)};
            list.add(a);
        }
        return list;
    }

    public Double[] getDoanhThuTheoVeVaDichvu() {
        Double[] db = new Double[2];
        try {
            String sql = "select count(mave), count(madichvu) from HoaDonChiTiet";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                db[0] = rs.getDouble(1);
                db[1] = rs.getDouble(2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return db;
    }

    public List<Object[]> getDTTungThangTheoNam(String year) {
        List<String> fullMonthList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            fullMonthList.add(String.valueOf(i + 1));
        }
        List<Object[]> list = new ArrayList<>();
        for(int i = 0 ; i < 12 ; i ++){
            list.add(new Object[]{i+1,0});
        }
        try {
            String sql = "{CALL sp_TKDT_TungThangTheoNam(?)}";
            ResultSet rs = XJdbc.query(sql, year);
            while (rs.next()) {
                Object[] a = {rs.getString(1), rs.getString(2)};
                for(int i = 0 ; i < list.size();i++){
                    if(rs.getString(1).equals((String.valueOf(list.get(i)[0])).trim())){
                        list.set(i, a);
                    }
                }
            }            
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    public List<Object[]> getDTTungNgayTheoThang(String year, String month){
        try {
            String sql = "{CALL sp_TKDT_TungNgayTheoThang(?,?)}";
            String cols[] = {"Ngay","TongVe","TongDichVu","TongTienNgay"};
            return this.getList(sql, cols, year, month);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<Object[]> getThongKeNguoiHoc() throws SQLException {
        String sql = "{CALL sp_ThongKeNguoiHoc}";
        String[] cols = {"Nam", "SoNH", "DKSomNhat", "DKMuonNhat"};
        return getList(sql, cols);
    }

}
