/* @author nghiacubu */


package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class XJdbc {
    static String url = "jdbc:sqlserver://localhost;databaseName=Edusys1;user=sa;password=123";

    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        PreparedStatement stmt;
        Connection cn = DriverManager.getConnection(url);
        if (sql.trim().startsWith("{")) {
            stmt = cn.prepareCall(sql);

        } else {
            stmt = cn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }

    public static ResultSet query(String sql, Object... args) {
        try {
            PreparedStatement stmt = XJdbc.getStmt(sql, args);
            return stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(XJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static int update(String sql, Object... args) {
//        try {
//            PreparedStatement stmt = null;
//            try {
//                return stmt.executeUpdate();
//            } finally{
//                 stmt.getConnection().close();
//            }
//        } catch (Exception e) {
//            throw new RuntimeException();
//        }

        PreparedStatement stmt = null;
        try {
            stmt = XJdbc.getStmt(sql, args);
            return stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                stmt.getConnection().close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }   
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = XJdbc.query(sql, args);
            if (rs.next()) {
                return rs.getObject(1);
            }
            rs.getStatement().getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(XJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}