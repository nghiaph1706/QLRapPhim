/* @author nghiacubu */


package newpackage;

import Utilities.XExcel;
import java.sql.SQLException;


public class NewClass {
    public static void main(String[] args) throws SQLException {
        XExcel.exportDTThang(2021,11);
    }
}
