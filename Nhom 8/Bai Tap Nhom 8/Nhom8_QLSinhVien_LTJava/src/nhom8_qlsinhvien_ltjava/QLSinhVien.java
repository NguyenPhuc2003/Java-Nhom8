/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nhom8_qlsinhvien_ltjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class QLSinhVien {
    ArrayList<SinhVien> list_sv = new ArrayList<SinhVien>();
    String filename="sinhvien.txt";
     Scanner input = new Scanner(System.in); 
     
     public QLSinhVien(ArrayList<SinhVien> list_sv) {
        this.list_sv=list_sv;
    }

    public QLSinhVien() {
        this.list_sv = new ArrayList<SinhVien>();
    }
    
    public void insert(SinhVien sv){
      
       System.out.print("\n");
       System.out.print("Nhap vao maSV: ");
       sv.setMaMonHoc(input.nextLine());
       
        System.out.print("Nhap vao ten SV: ");
        sv.setHoTen(input.nextLine());
        
        System.out.print("Nhap vao lop cho SV: ");
        sv.setLop(input.nextLine());
        
        System.out.print("Nhap vao so dien thoai cua SV: ");
        sv.setSoDienThoai(input.nextLine());
        
        System.out.print("Nhap vao ngay sinh cua sv : ");
        sv.setNgaySinh(input.nextLine());
        
        System.out.print("Nhap vao dia chi cua sv : ");
        sv.setDiaChi(input.nextLine());
        
        input.nextLine();
        
         list_sv.add(sv);
       
    }
    
     
    public ArrayList<SinhVien> select(){
        return list_sv;
    }
    
    public void find(){
        System.out.print("Moi ban chon sinh vien muon tim: ");
        String tenSV;
        tenSV = input.nextLine();
        
        
        boolean TimThay = false;
        if(list_sv.size() == 0){
            System.out.print("\n");
            System.out.println("Khong co sinh vien nao danh sach !");
            System.out.print("\n");
        }
        if(tenSV.equals("")){
            tenSV = input.nextLine();
        }
        for(SinhVien sv : list_sv){
            if(sv.getHoTen().equals(tenSV))
            {
                sv.toString();
                TimThay = true;
            }
        }
        if(TimThay == false){
            System.out.print("Khong tim thay sinh vien "+ tenSV +"\n");
        }
    }
    public void delete(){
        System.out.print("Moi ban chon sinh vien muon xoa: ");
        String tenSV;
        tenSV = input.nextLine();
        if(tenSV.equals("")){
            tenSV = input.nextLine();
        }
        boolean TimThay = false;
        for(SinhVien sv : list_sv){
            if(sv.getHoTen().equals(tenSV)){
                list_sv.remove(sv);
                 System.out.println("Da xoa sinh vien " + tenSV);
                 TimThay = true;
                 break;
            }
        }
        if(TimThay == false){
              System.out.print("Khong tim thay sinh vien "+ tenSV +"\n");
        }
    }
     public void ghiFile(){
        FileSinhVien fm = new FileSinhVien();
          fm.WriteList(list_sv, filename);
    }
     public void docFile(){
        FileSinhVien fm = new FileSinhVien();
        list_sv = fm.ReadList(filename);
    }
    public void Nhap(){
        this.insert(new SinhVien());
    }
    public void XuatTT(){
        
        if(list_sv.size() == 0){
            System.out.print("\n");
            System.out.println("Khong co sinh vien nao danh sach !");
            System.out.print("\n");
        }
        // for(int i = 0; i < list_sv.size() ;i++){
             int i =0;
          for(SinhVien sv : list_sv){
            System.out.print(" =================Thong Tin Sinh Vien==============\n ");
            System.out.print("\n");
            System.out.print("Sinh vien thu " +(i+=1) +" \n");
            System.out.print(sv.toString());
           }
        // }
             
    }      
}
