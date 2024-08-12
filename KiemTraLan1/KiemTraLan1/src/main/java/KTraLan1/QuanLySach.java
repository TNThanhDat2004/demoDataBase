/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTraLan1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ADMIN
 */
public class QuanLySach {
   private final List<Sach> danhSachSach;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
        danhSachSach.add(new Sach("K011", "Lap trinh java", 95000, 2017));
        danhSachSach.add(new Sach("K012", "Co so du lieu", 85000, 2001));
        danhSachSach.add(new Sach("K013", "Nhap mon Lap trinh", 72000, 2013));
        danhSachSach.add(new Sach("K014", "Lap trinh Python", 39000, 2018));
        danhSachSach.add(new Sach("K015", "Lap trinh C#", 82000, 2015));
    }
   
     public void xuatDanhSachSach() {
        danhSachSach.forEach(System.out::println);
        System.out.println("Tong tri gia: " + tinhTongTriGia());
     }  
     
    public List<Sach> laySachTruocNam2015() {
        return danhSachSach.stream()
                           .filter(sach -> sach.getNamXuatBan() < 2015)
                           .collect(Collectors.toList());
    }

   
    public List<Sach> timSachTheoTen(String tuKhoa) {
        return danhSachSach.stream()
                           .filter(sach -> sach.getTenSach().startsWith(tuKhoa))
                           .collect(Collectors.toList());
    }

   
    public void sapXepTheoGia() {
        danhSachSach.sort(Comparator.comparingDouble(Sach::getGiaBia));
    }

   
    public void xoaSachTheoMa(String maSach) {
        danhSachSach.removeIf(sach -> sach.getMaSach().equals(maSach));
    }

   
    public void suaGiaSach(String maSach, double giaMoi) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                sach.setGiaBia(giaMoi);
                break;
            }
        }
    }

   
    public double tinhTongTriGia() {
        return danhSachSach.stream()
                           .mapToDouble(Sach::getGiaBia)
                           .sum();
    }

    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();

        System.out.println("Danh sach sach:");
        quanLySach.xuatDanhSachSach();

        System.out.println("\nSach xuat ban truoc nam 2015:");
        List<Sach> sachTruoc2015 = quanLySach.laySachTruocNam2015();
        sachTruoc2015.forEach(System.out::println);

        System.out.println("\nSach co ten bat dau voi 'Lap trinh':");
        List<Sach> sachLapTrinh = quanLySach.timSachTheoTen("Lap trinh");
        sachLapTrinh.forEach(System.out::println);

        System.out.println("\nDanh sach sach sau khi sap xep theo gia:");
        quanLySach.sapXepTheoGia();
        quanLySach.xuatDanhSachSach();

        System.out.println("\nXoa sach co ma 'K014':");
        quanLySach.xoaSachTheoMa("K014");
        quanLySach.xuatDanhSachSach();

        System.out.println("\nSua gia sach co ma 'K015':");
        quanLySach.suaGiaSach("K015", 90000);
        quanLySach.xuatDanhSachSach();
    }
}
