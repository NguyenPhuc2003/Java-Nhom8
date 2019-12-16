/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nhom8_qlsinhvien_ltjava;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);  
     int nChon;
    
    
    QLSinhVien sv= new QLSinhVien();
    do{
      System.out.println("======================= Quan Ly Sinh Vien ==================");
      
      System.out.println("1.Them Sinh Vien");
      System.out.println("2.Xem TT Sinh Vien");
      System.out.println("3.Update Sinh Vien");
      System.out.println("4.Tim Sinh Vien");
      System.out.println("5.Xoa Sinh Vien");
      System.out.println("6.Thoat");
      
     System.out.print("Moi ban chon tac vu: ");
     System.out.print("");
    nChon = input.nextInt();
      switch(nChon){
          case 1: // them sinh vien
              sv.Nhap();
              sv.ghiFile();
              break;
          case 2: // xem thong tin sinh vien
              sv.XuatTT();
              sv.ghiFile();
              break;
              
          case 3:
              
              break;
          case 4: // tim sv
              sv.find();
              break;
              
          case 5:// xoa sinh vien
              sv.delete();
              break;
          case 6: return;
      }

    }while(nChon <=5);
   }
}
