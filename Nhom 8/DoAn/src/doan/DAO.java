/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admintrator
 */
public class DAO {

    private Connection conn;

    public DAO() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLiNT;integratedSecurity=true");
           conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=QuanLiNT;"
                  + "username=sa;password=123");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean themThuoc(Thuoc t) {
        String sql = "INSERT INTO NHAPTHUOC(MATHUOC,TENTHUOC,HANSUDUNG,NGAYNHAP,LOAITHUOC,SOLUONG,NGUOINHAP,DONGIA)"
                + "VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getMaThuoc());
            ps.setString(2, t.getTenThuoc());
            ps.setString(3, t.getHSD());
            ps.setString(4, t.getNgayNhap());
            ps.setString(5, t.getLoaiThuoc());
            ps.setInt(6, t.getSoLuong());
            ps.setString(7, t.getNguoiNhap());
            ps.setInt(8, t.getDonGia());
            return ps.executeUpdate() >0;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean themHoaDonNhap(HoaDonNhap t) {
        String sql = "INSERT INTO HOADONNHAP(MATHUOC,TENTHUOC,HANSUDUNG,NGAYNHAP,LOAITHUOC,SOLUONG,NGUOINHAP,DONGIA)"
                + "VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getMaThuoc());
            ps.setString(2, t.getTenThuoc());
            ps.setString(3, t.getHSD());
            ps.setString(4, t.getNgayNhap());
            ps.setString(5, t.getLoaiThuoc());
            ps.setInt(6, t.getSoLuong());
            ps.setString(7, t.getNguoiNhap());
            ps.setInt(8, t.getDonGia());
             return ps.executeUpdate() >0;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
        public boolean xuatThuoc(XuatThuoc xt) {
        String sql = "INSERT INTO XUATTHUOC(NGUOIBAN,TENTHUOC,TENKH,NGAYXUAT,LOAITHUOC,SOLUONG,DONGIA,THANHTIEN)"
                + "VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1,xt.getNguoiBan());
            ps.setString(2, xt.getTenThuoc());
            ps.setString(3, xt.getTenKH());
            ps.setString(4, xt.getNgayXuat());
            ps.setString(5, xt.getLoaiThuoc());
            ps.setInt(6, xt.getSoLuong());
            ps.setInt(7, xt.getDonGia());
            ps.setInt(8, xt.getThanhTien());
            return ps.executeUpdate() >0;
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    
      public boolean themHoaDonXuat(HoaDonXuat xt) {
        String sql = "INSERT INTO HOADONXUAT(NGUOIBAN,TENTHUOC,TENKH,NGAYXUAT,LOAITHUOC,SOLUONG,DONGIA,THANHTIEN)"
                + "VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1,xt.getNguoiBan());
            ps.setString(2, xt.getTenThuoc());
            ps.setString(3, xt.getTenKH());
            ps.setString(4, xt.getNgayXuat());
            ps.setString(5, xt.getLoaiThuoc());
            ps.setInt(6, xt.getSoLuong());
            ps.setInt(7, xt.getDonGia());
            ps.setInt(8, xt.getThanhTien());
             return ps.executeUpdate() >0;
        }
        catch(Exception e){
            e.printStackTrace();
        }
       return false;
    }
      public boolean xoaThuoc(Thuoc t) {
        String sql = "DELETE FROM NHAPTHUOC WHERE MATHUOC = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getMaThuoc());         
            return ps.executeUpdate() >0;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
     
     public boolean xoaHDNhapThuoc(HoaDonNhap t) {
        String sql = "DELETE FROM HOADONNHAP WHERE ID = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getID());         
            return ps.executeUpdate() >0;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }  
     
      public boolean xoaXuatThuoc(XuatThuoc t) {
        String sql = "DELETE FROM XUATTHUOC WHERE ID = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getID());         
            return ps.executeUpdate() >0;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }  
      
      
      public boolean xoaHDXuatThuoc(HoaDonXuat t) {
        String sql = "DELETE FROM HOADONXUAT WHERE ID = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getID());         
            return ps.executeUpdate() >0;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }  
      
     public boolean suaThuoc(Thuoc t) {
        String sql = "UPDATE NHAPTHUOC SET TENTHUOC = ?, HANSUDUNG = ?, NGAYNHAP = ?, LOAITHUOC = ?, SOLUONG = ?, NGUOINHAP = ?, DONGIA = ? WHERE MATHUOC = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, t.getTenThuoc());
            ps.setString(2, t.getHSD());
            ps.setString(3, t.getNgayNhap());
            ps.setString(4, t.getLoaiThuoc());
            ps.setInt(5, t.getSoLuong());
            ps.setString(6, t.getNguoiNhap());
            ps.setInt(7, t.getDonGia());
            ps.setString(8, t.getMaThuoc());
           return ps.executeUpdate() >0;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
     
     
     
        public boolean suaXuatThuoc(XuatThuoc t) {
        String sql = "UPDATE XUATTHUOC SET TENTHUOC = ?, TENKH= ?, NGAYXUAT = ?, LOAITHUOC = ?, SOLUONG = ?, NGUOIBAN = ?, DONGIA = ?, THANHTIEN = ? WHERE ID = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, t.getTenThuoc());
            ps.setString(2, t.getTenKH());
            ps.setString(3, t.getNgayXuat());
            ps.setString(4, t.getLoaiThuoc());
            ps.setInt(5, t.getSoLuong());
            ps.setString(6, t.getNguoiBan());
            ps.setInt(7, t.getDonGia());
            ps.setInt(8, t.getThanhTien());
            ps.setInt(9, t.getID());
           return ps.executeUpdate() >0;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<Thuoc> searchThuoc(String tuKhoa) {

        ArrayList<Thuoc> listThuoc = new ArrayList<>();
        String sql = "SELECT * FROM NHAPTHUOC WHERE MATHUOC= ? OR TENTHUOC = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tuKhoa);
            ps.setString(2, tuKhoa);
            
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Thuoc thuoc = new Thuoc();
                 thuoc.setMaThuoc(rs.getString("MATHUOC"));
                 thuoc.setNguoiNhap(rs.getString("NGUOINHAP"));
                 thuoc.setNgayNhap(rs.getString("NGAYNHAP"));
                 thuoc.setHSD(rs.getString("HANSUDUNG"));
                 thuoc.setTenThuoc(rs.getString("TENTHUOC"));
                 thuoc.setLoaiThuoc(rs.getString("LOAITHUOC"));
                 thuoc.setDonGia(rs.getInt("DONGIA"));
                 thuoc.setSoLuong(rs.getInt("SOLUONG"));
                listThuoc.add(thuoc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listThuoc;
    }
    
    
     public ArrayList<XuatThuoc> searchXuatThuoc(String tuKhoa) {

        ArrayList<XuatThuoc> listThuoc = new ArrayList<>();
        String sql = "SELECT * FROM XUATTHUOC WHERE NGUOIBAN = ? OR TENTHUOC = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tuKhoa);
            ps.setString(2, tuKhoa);
            
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
    
                XuatThuoc xuatthuoc = new XuatThuoc();
                 xuatthuoc.setID(rs.getInt("ID"));
                 xuatthuoc.setNguoiBan(rs.getString("NGUOIBAN"));
                 xuatthuoc.setTenKH(rs.getString("TENKH"));
                 xuatthuoc.setNgayXuat(rs.getString("NGAYXUAT"));
                 xuatthuoc.setTenThuoc(rs.getString("TENTHUOC"));
                 xuatthuoc.setLoaiThuoc(rs.getString("LOAITHUOC"));
                 xuatthuoc.setDonGia(rs.getInt("DONGIA"));
                 xuatthuoc.setSoLuong(rs.getInt("SOLUONG"));
                  xuatthuoc.setThanhTien(rs.getInt("THANHTIEN"));
                listThuoc.add(xuatthuoc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listThuoc;
    }
     
     public ArrayList<HoaDonNhap> searchHDNhap(String tuKhoa) {

        ArrayList<HoaDonNhap> listHoaDon = new ArrayList<>();
        String sql = "SELECT * FROM HOADONNHAP WHERE MATHUOC = ? OR TENTHUOC = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tuKhoa);
            ps.setString(2, tuKhoa);
            
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
    
                HoaDonNhap thuoc = new HoaDonNhap();
                thuoc.setID(rs.getInt("ID"));
                 thuoc.setMaThuoc(rs.getString("MATHUOC"));
                 thuoc.setNguoiNhap(rs.getString("NGUOINHAP"));
                 thuoc.setNgayNhap(rs.getString("NGAYNHAP"));
                 thuoc.setHSD(rs.getString("HANSUDUNG"));
                 thuoc.setTenThuoc(rs.getString("TENTHUOC"));
                 thuoc.setLoaiThuoc(rs.getString("LOAITHUOC"));
                 thuoc.setDonGia(rs.getInt("DONGIA"));
                 thuoc.setSoLuong(rs.getInt("SOLUONG"));
                listHoaDon.add(thuoc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }
     
     
     public ArrayList<HoaDonXuat> searchHDXuat(String tuKhoa) {

        ArrayList<HoaDonXuat> listHoaDon = new ArrayList<>();
        String sql = "SELECT * FROM HOADONXUAT WHERE NGUOIBAN = ? OR TENTHUOC = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tuKhoa);
            ps.setString(2, tuKhoa);
            
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
    
                 HoaDonXuat xuatthuoc = new HoaDonXuat();
                 xuatthuoc.setID(rs.getInt("ID"));
                 xuatthuoc.setNguoiBan(rs.getString("NGUOIBAN"));
                 xuatthuoc.setTenKH(rs.getString("TENKH"));
                 xuatthuoc.setNgayXuat(rs.getString("NGAYXUAT"));
                 xuatthuoc.setTenThuoc(rs.getString("TENTHUOC"));
                 xuatthuoc.setLoaiThuoc(rs.getString("LOAITHUOC"));
                 xuatthuoc.setDonGia(rs.getInt("DONGIA"));
                 xuatthuoc.setSoLuong(rs.getInt("SOLUONG"));
                  xuatthuoc.setThanhTien(rs.getInt("THANHTIEN"));
                listHoaDon.add(xuatthuoc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }
  public ArrayList<Thuoc> getListThuoc() {

        ArrayList<Thuoc> listThuoc = new ArrayList<>();
        String sql = "SELECT * FROM NHAPTHUOC";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Thuoc thuoc = new Thuoc();
                 thuoc.setMaThuoc(rs.getString("MATHUOC"));
                 thuoc.setNguoiNhap(rs.getString("NGUOINHAP"));
                 thuoc.setNgayNhap(rs.getString("NGAYNHAP"));
                 thuoc.setHSD(rs.getString("HANSUDUNG"));
                 thuoc.setTenThuoc(rs.getString("TENTHUOC"));
                 thuoc.setLoaiThuoc(rs.getString("LOAITHUOC"));
                 thuoc.setDonGia(rs.getInt("DONGIA"));
                 thuoc.setSoLuong(rs.getInt("SOLUONG"));
                listThuoc.add(thuoc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listThuoc;
    }
    
  
   public ArrayList<HoaDonNhap> getListHDNhapThuoc() {

        ArrayList<HoaDonNhap> listHDNhap = new ArrayList<>();
        String sql = "SELECT * FROM HOADONNHAP";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonNhap thuoc = new HoaDonNhap();
                 thuoc.setID(rs.getInt("ID"));
                 thuoc.setMaThuoc(rs.getString("MATHUOC"));
                 thuoc.setNguoiNhap(rs.getString("NGUOINHAP"));
                 thuoc.setNgayNhap(rs.getString("NGAYNHAP"));
                 thuoc.setHSD(rs.getString("HANSUDUNG"));
                 thuoc.setTenThuoc(rs.getString("TENTHUOC"));
                 thuoc.setLoaiThuoc(rs.getString("LOAITHUOC"));
                 thuoc.setDonGia(rs.getInt("DONGIA"));
                 thuoc.setSoLuong(rs.getInt("SOLUONG"));
                listHDNhap.add(thuoc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHDNhap;
    }
  
  public ArrayList<XuatThuoc> getListXuatThuoc() {

        ArrayList<XuatThuoc> listXuatThuoc = new ArrayList<>();
        String sql = "SELECT * FROM XUATTHUOC";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                XuatThuoc xuatthuoc = new XuatThuoc();
                xuatthuoc.setID(rs.getInt("ID"));
                 xuatthuoc.setNguoiBan(rs.getString("NGUOIBAN"));
                 xuatthuoc.setTenKH(rs.getString("TENKH"));
                 xuatthuoc.setNgayXuat(rs.getString("NGAYXUAT"));
                 xuatthuoc.setTenThuoc(rs.getString("TENTHUOC"));
                 xuatthuoc.setLoaiThuoc(rs.getString("LOAITHUOC"));
                 xuatthuoc.setDonGia(rs.getInt("DONGIA"));
                 xuatthuoc.setSoLuong(rs.getInt("SOLUONG"));
                  xuatthuoc.setThanhTien(rs.getInt("THANHTIEN"));
                listXuatThuoc.add(xuatthuoc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listXuatThuoc;
    }
  
  
  
   public ArrayList<HoaDonXuat> getListHDXuatThuoc() {

        ArrayList<HoaDonXuat> listXuatThuoc = new ArrayList<>();
        String sql = "SELECT * FROM HOADONXUAT";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonXuat xuatthuoc = new HoaDonXuat();
                xuatthuoc.setID(rs.getInt("ID"));
                 xuatthuoc.setNguoiBan(rs.getString("NGUOIBAN"));
                 xuatthuoc.setTenKH(rs.getString("TENKH"));
                 xuatthuoc.setNgayXuat(rs.getString("NGAYXUAT"));
                 xuatthuoc.setTenThuoc(rs.getString("TENTHUOC"));
                 xuatthuoc.setLoaiThuoc(rs.getString("LOAITHUOC"));
                 xuatthuoc.setDonGia(rs.getInt("DONGIA"));
                 xuatthuoc.setSoLuong(rs.getInt("SOLUONG"));
                  xuatthuoc.setThanhTien(rs.getInt("THANHTIEN"));
                listXuatThuoc.add(xuatthuoc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listXuatThuoc;
    }
  
  
    public ArrayList<User> getListUser() {

        ArrayList<User> listUser = new ArrayList<>();
        String sql = "SELECT * FROM NGUOIDUNG";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setTaiKhoan(rs.getString("TAIKHOAN"));
                user.setMatKhau(rs.getString("MATKHAU"));
                listUser.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listUser;
    }

    public static void main(String[] args) {
        new DAO();
    }

}
