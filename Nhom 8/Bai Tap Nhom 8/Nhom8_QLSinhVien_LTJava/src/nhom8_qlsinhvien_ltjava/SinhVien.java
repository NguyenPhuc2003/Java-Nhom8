/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nhom8_qlsinhvien_ltjava;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class SinhVien implements  Serializable  {
    private String maMonHoc;
    private  String lop;
    private String hoTen;
    private String ngaySinh;
    private String soDienThoai;
    private String diaChi;

    public SinhVien() {
    }

    public SinhVien(String maMonHoc, String lop, String hoTen, String ngaySinh, String soDienThoai, String diaChi) {
        this.maMonHoc = maMonHoc;
        this.lop = lop;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        
        
    }
    
    

    /**
     * @return the maMonHoc
     */
    public String getMaMonHoc() {
        return maMonHoc;
    }

    /**
     * @param maMonHoc the maMonHoc to set
     */
    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    /**
     * @return the lop
     */
    public String getLop() {
        return lop;
    }

    /**
     * @param lop the lop to set
     */
    public void setLop(String lop) {
        this.lop = lop;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the ngaySinh
     */
    public String getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the soDienThoai
     */
    public String getSoDienThoai() {
        return soDienThoai;
    }

    /**
     * @param soDienThoai the soDienThoai to set
     */
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return  "  Ma mon hoc :" + maMonHoc +"\n"+ "  Lop : " + lop + "\n" + "  Ho Ten : " + hoTen + "\n"+ "  Ngay Sinh : " + ngaySinh +"\n"+"  So Dien Thoai : " + soDienThoai +"\n"+ "  Dia chi " + getDiaChi() +"\n" ;
    }

    /**
     * @return the diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * @param diaChi the diaChi to set
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    
}
