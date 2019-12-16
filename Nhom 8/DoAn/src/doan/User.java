/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan;

/**
 *
 * @author Admintrator
 */
public class User {

    private String TaiKhoan;
    private String MatKhau;

    public User() {
    }

    public User(String TaiKhoan, String MatKhau) {
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
    }

    /**
     * @return the TaiKhoan
     */
    public String getTaiKhoan() {
        return TaiKhoan;
    }

    /**
     * @param TaiKhoan the TaiKhoan to set
     */
    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    /**
     * @return the MatKhau
     */
    public String getMatKhau() {
        return MatKhau;
    }

    /**
     * @param MatKhau the MatKhau to set
     */
    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    
    
}
