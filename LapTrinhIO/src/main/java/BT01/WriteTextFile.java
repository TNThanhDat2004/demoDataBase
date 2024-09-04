/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class WriteTextFile {
    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        ds.add(new SanPham("SP01","Gạo",25000));
        ds.add(new SanPham("SP02","Đường",85000));
        ds.add(new SanPham("SP03","Kẹo",15000));
         try{
            try ( //tao luong ghi du lieu ra tap tin van ban
                    FileWriter fw = new FileWriter("SanPham.txt")) {
                for (SanPham sp : ds) {
                    //ghi du lieu file
                    fw.write(sp.getMaso() + ":" + sp.getTen() + ":" +sp.getGia() + "\n");
                }
                //dong luong
            }
            System.out.println("Ghi thanh cong");
        }catch (IOException ex){
            System.out.println("Loi xay ra:" + ex.toString());
            System.out.println("Ghi file that bai");
        }
    }
}
