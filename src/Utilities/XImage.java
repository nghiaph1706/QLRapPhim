
package Utilities;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

public class XImage {
    
    public static void saveImagePhim(File src){
        File dst = new File("imagePhim/",src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from,to,StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void saveImageNhanVien(File src){
        File dst = new File("imageNhanVien/", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from,to,StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void saveImageSuKien(File src){
        File dst = new File("imageSuKien/", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from,to,StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static ImageIcon readImagePhim(String fileName){
        File path = new File("imagePhim/",fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
    
    public static ImageIcon readImageNhanVien(String fileName){
        File path = new File("imageNhanVien/",fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
    
    public static ImageIcon readImageSuKien(String fileName){
        File path = new File("imageSuKien/",fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
