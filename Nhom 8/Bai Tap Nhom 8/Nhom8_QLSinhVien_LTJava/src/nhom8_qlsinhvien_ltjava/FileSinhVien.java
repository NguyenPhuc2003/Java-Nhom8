/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nhom8_qlsinhvien_ltjava;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class FileSinhVien {
    
    
    public void WriteList(ArrayList<SinhVien> dssv , String fileName){
        try{
            
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream  oos = new ObjectOutputStream(fos);
            oos.writeObject(dssv);
            fos.close();
            oos.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
     public ArrayList<SinhVien> ReadList(String fileName){
         
         ArrayList<SinhVien>  dssv = new ArrayList<SinhVien>();
        try{
            
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream  ois = new ObjectInputStream(fis);
            dssv =(ArrayList<SinhVien>) ois.readObject();
            fis.close();
            ois.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dssv;
    }
}
