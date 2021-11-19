package Utilities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class ValidateCheck implements Serializable {
//Check Null & Max Length String

    static SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");

    public boolean CheckString(String NameString, String string, int length, boolean constraint) {
        if (constraint) {
            if (string.equals("")) {
                JOptionPane.showMessageDialog(null, NameString + " Đang Để Trống!", "Lỗi", 0);
                return false;
            }
            if (string.length() != length) {
                JOptionPane.showMessageDialog(null, NameString + " Phải Dài " + length + " Kí Tự!", "Lỗi", 0);
                return false;
            } else {
                return true;
            }
        } else if (constraint == false) {
            if (string.equals("")) {
                JOptionPane.showMessageDialog(null, NameString + " Đang Để Trống!", "Lỗi", 0);
                return false;
            }
            if (string.length() > length && length != -1) {
                JOptionPane.showMessageDialog(null, NameString + " Quá Dài!", "Lỗi", 0);
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
//Check Duplicase Key

    public boolean CheckDulicase(String NameStringAfter, String string, String NameStringBefore, String string1) {
        if (string.equals(string1)) {
            JOptionPane.showMessageDialog(null, NameStringAfter + " Trùng Mã Với " + NameStringBefore + "!", "Lỗi", 0);
            return false;
        }
        return true;
    }
//Check String to Float 

    public boolean CheckFloat(String NameString, String string) {
        try {
            Float x = Float.parseFloat(string);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, NameString + " Nhập Vào Sai Kiểu Dữ Liệu!", "Lỗi", 0);
            return false;
        }
    }
//Check String to Date

    public boolean CheckDate(String NameString, String string) {
        try {
            Date CheckDate = formater.parse(string);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, NameString + " Nhập Vào Sai Kiểu Dữ Liệu!", "Lỗi", 0);
            return false;
        }
    }
//Check Null Date

    public boolean CheckNullDate(String NameString, Date date) {
        if (date == null) {
            JOptionPane.showMessageDialog(null, NameString + " Để Trống!", "Lỗi", 0);
            return false;
        }
        return true;
    }
//Check Date After And Before

    public boolean CheckAfterAndBefore(String NameStringAfter, Date after, String NameStringBefore, Date before) {
        if (after.getYear() <= before.getYear()) {
            if (after.getYear() == before.getYear()) {
                if (after.getMonth() <= before.getMonth()) {
                    if (after.getMonth() == before.getMonth()) {
                        if (after.getDay() <= before.getDay()) {
                            return true;
                        }
                    }
                    if (after.getMonth() < before.getMonth()) {
                        return true;
                    }
                }
            }
            if (after.getYear() < before.getYear()) {
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, NameStringAfter + " Sau Ngày " + NameStringBefore + "!", "Lỗi", 0);
        return false;
    }

//regex string
    public boolean RegexString(String NameString, String string) {
        if (string.matches("[a-zA-Z]")) {
            return true;
        }
        JOptionPane.showMessageDialog(null, NameString + " Nhập Vào Sai Kiểu Dữ Liệu!", "Lỗi", 0);
        return false;
    }
//regex numbers

    public boolean RegexNumber(String NameString, String number) {
        if (number.matches("[0-9]")) {
            return true;
        }
        JOptionPane.showMessageDialog(null, NameString + " Nhập Vào Sai Kiểu Dữ Liệu!", "Lỗi", 0);
        return false;
    }
//regex numbers

    public boolean RegexPhoneNumber(String NameString, String number, int length) {
        if (number.matches("[0-9]") && number.length() == length) {
            return true;
        }
        if (number.matches("[0-9]") && number.length() < length || number.matches("[0-9]") && number.length() > length) {
            JOptionPane.showMessageDialog(null, NameString + " Nhập Vào Phải Dài " + length + " Kí Tự!", "Lỗi", 0);
            return false;
        }
        JOptionPane.showMessageDialog(null, NameString + " Nhập Vào Sai Kiểu Dữ Liệu!", "Lỗi", 0);
        return false;
    }
//regex string and number

    public boolean RegexStringAndNumber(String NameString, String string) {
        if (string.matches("[a-zA-Z_0-9]")) {
            return true;
        }
        JOptionPane.showMessageDialog(null, NameString + " Nhập Vào Sai Kiểu Dữ Liệu!", "Lỗi", 0);
        return false;
    }
//regex Email

    public boolean RegexEmail(String NameString, String email) {
        if (email.matches("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$")) {
            return true;
        }
        JOptionPane.showMessageDialog(null, NameString + " Nhập Vào Sai Kiểu Dữ Liệu!", "Lỗi", 0);
        return false;
    }
//Check Password and ConfirmPassword

    public boolean CheckValuesPassAndConFirmPass(String NameString1, String pass1, String NameString2, String Pass2) {
        if (pass1.equals(Pass2)) {
            return true;
        }
        JOptionPane.showMessageDialog(null, NameString1 + " Không Giống "+NameString2, "Lỗi", 0);
        return false;
    }
}
