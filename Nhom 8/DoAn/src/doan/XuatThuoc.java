/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doan;

/**
 *
 * @author Administrator
 */
public class XuatThuoc {

   
    private int id;
    private String nguoiBan;
    private  String maThuoc;
    private  String tenThuoc;
    private  String loaiThuoc;
    private String tenKH;
    private  int  donGia;
    private String ngayXuat;
    private  int soLuong;
    private int thanhTien;
    public XuatThuoc() {
    }

    public XuatThuoc(int id,String nguoiBan, String maThuoc, String tenThuoc, String loaiThuoc, String tenKH, int donGia, String ngayXuat, int soLuong,int thanhTien) {
        this.id = id;
        this.nguoiBan = nguoiBan;
        this.maThuoc = maThuoc;
        this.tenThuoc = tenThuoc;
        this.loaiThuoc = loaiThuoc;
        this.tenKH = tenKH;
        this.donGia = donGia;
        this.ngayXuat = ngayXuat;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    /**
     * @return the nguoiBan
     */
    
    
    
     public int getID() {
        return id;
    }

    /**
     * @param nguoiBan the nguoiBan to set
     */
    public void setID(int ID) {
        this.id = ID;
    }
    public String getNguoiBan() {
        return nguoiBan;
    }

    /**
     * @param nguoiBan the nguoiBan to set
     */
    public void setNguoiBan(String nguoiBan) {
        this.nguoiBan = nguoiBan;
    }
     public int getThanhTien() {
        return thanhTien;
    }

    /**
     * @param nguoiBan the nguoiBan to set
     */
    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }
    /**
     * @return the maThuoc
     */
    public String getMaThuoc() {
        return maThuoc;
    }

    /**
     * @param maThuoc the maThuoc to set
     */
    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    /**
     * @return the tenThuoc
     */
    public String getTenThuoc() {
        return tenThuoc;
    }

    /**
     * @param tenThuoc the tenThuoc to set
     */
    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    /**
     * @return the loaiThuoc
     */
    public String getLoaiThuoc() {
        return loaiThuoc;
    }

    /**
     * @param loaiThuoc the loaiThuoc to set
     */
    public void setLoaiThuoc(String loaiThuoc) {
        this.loaiThuoc = loaiThuoc;
    }

    /**
     * @return the tenKH
     */
    public String getTenKH() {
        return tenKH;
    }

    /**
     * @param tenKH the tenKH to set
     */
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    /**
     * @return the donGia
     */
    public int getDonGia() {
        return donGia;
    }

    /**
     * @param donGia the donGia to set
     */
    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    /**
     * @return the ngayXuat
     */
    public String getNgayXuat() {
        return ngayXuat;
    }

    /**
     * @param ngayXuat the ngayXuat to set
     */
    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    
                
}
