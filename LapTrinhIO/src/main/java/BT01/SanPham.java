/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package BT01;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class SanPham  implements Serializable{
    String MaSo;
    String Ten;
    int Gia;

    public String getMaSo() {
        return MaSo;
    }

    public String getTen() {
        return Ten;
    }

    public int getGia() {
        return Gia;
    }

    public void setMaSo(String MaSo) {
        this.MaSo = MaSo;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public SanPham(String MaSo, String Ten, int Gia) {
        this.MaSo = MaSo;
        this.Ten = Ten;
        this.Gia = Gia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "MaSo=" + MaSo + ", Ten=" + Ten + ", Gia=" + Gia + '}';
    }

    String getMaso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
