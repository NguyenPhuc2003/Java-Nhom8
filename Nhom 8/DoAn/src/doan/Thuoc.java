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
public class Thuoc {
    private String nguoiNhap;
    private String maThuoc;
      private String tenThuoc;
        private String loaiThuoc;
          private int  donGia;
            private String NgayNhap;
              private int soLuong;
                private String HSD;

    public Thuoc() {
    }

    public Thuoc(String nguoiNhap, String maThuoc, String tenThuoc, String loaiThuoc, int donGia, String NgayNhap, int soLuong, String HSD) {
        this.nguoiNhap = nguoiNhap;
        this.maThuoc = maThuoc;
        this.tenThuoc = tenThuoc;
        this.loaiThuoc = loaiThuoc;
        this.donGia = donGia;
        this.NgayNhap = NgayNhap;
        this.soLuong = soLuong;
        this.HSD = HSD;
    }
 
    /**
     * @return the nguoiNhap
     */
    public String getNguoiNhap() {
        return nguoiNhap;
    }

    /**
     * @param nguoiNhap the nguoiNhap to set
     */
    public void setNguoiNhap(String nguoiNhap) {
        this.nguoiNhap = nguoiNhap;
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
     * @return the NgayNhap
     */
    public String getNgayNhap() {
        return NgayNhap;
    }

    /**
     * @param NgayNhap the NgayNhap to set
     */
    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
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

    /**
     * @return the HSD
     */
    public String getHSD() {
        return HSD;
    }

    /**
     * @param HSD the HSD to set
     */
    public void setHSD(String HSD) {
        this.HSD = HSD;
    }
                
}
