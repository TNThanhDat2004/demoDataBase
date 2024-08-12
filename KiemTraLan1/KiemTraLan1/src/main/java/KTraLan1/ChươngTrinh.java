/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTraLan1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChươngTrinh{

   public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
       try (Scanner scanner = new Scanner(System.in)) {
           int luaChon;
           
           do {
               // Hiển thị menu
               System.out.println("=== Menu Quan Ly Sach ===");
               System.out.println("1. Xuat danh sach sach va tong tri gia");
               System.out.println("2. Lay sach xuat ban truoc nam 2015");
               System.out.println("3. Tim sach co ten bat dau voi 'Lap trinh'");
               System.out.println("4. Sap xep sach theo gia tang dan");
               System.out.println("5. Xoa sach theo ma sach");
               System.out.println("6. Sua gia sach theo ma sach");
               System.out.println("7. Tinh tong tri gia cua sach");
               System.out.println("0. Thoat");
               System.out.print("Nhap lua chon: ");
               luaChon = scanner.nextInt();
               scanner.nextLine();  // Đọc ký tự newline còn lại sau nextInt()
               
               switch (luaChon) {
                   case 1:
                       quanLySach.xuatDanhSachSach();
                       break;
                       
                   case 2:
                       System.out.println("Sach xuat ban truoc nam 2015:");
                       quanLySach.laySachTruocNam2015().forEach(System.out::println);
                       break;
                       
                   case 3:
                       System.out.println("Nhap tu khoa (e.g., 'Lap trinh'):");
                       String tuKhoa = scanner.nextLine();
                       System.out.println("Sach co ten bat dau voi '" + tuKhoa + "':");
                       quanLySach.timSachTheoTen(tuKhoa).forEach(System.out::println);
                       break;
                       
                   case 4:
                       quanLySach.sapXepTheoGia();
                       System.out.println("Danh sach sach sau khi sap xep theo gia:");
                       quanLySach.xuatDanhSachSach();
                       break;
                       
                   case 5:
                       System.out.println("Nhap ma sach can xoa:");
                       String maSachXoa = scanner.nextLine();
                       quanLySach.xoaSachTheoMa(maSachXoa);
                       System.out.println("Danh sach sach sau khi xoa:");
                       quanLySach.xuatDanhSachSach();
                       break;
                       
                   case 6:
                       System.out.println("Nhap ma sach can sua gia:");
                       String maSachSuaGia = scanner.nextLine();
                       System.out.println("Nhap gia moi:");
                       double giaMoi = scanner.nextDouble();
                       scanner.nextLine();  // Đọc ký tự newline còn lại sau nextDouble()
                       quanLySach.suaGiaSach(maSachSuaGia, giaMoi);
                       System.out.println("Danh sach sach sau khi sua gia:");
                       quanLySach.xuatDanhSachSach();
                       break;
                       
                   case 7:
                       System.out.println("Tong tri gia cua cac sach: " + quanLySach.tinhTongTriGia());
                       break;
                       
                   case 0:
                       System.out.println("Thoat chuong trinh.");
                       break;
                       
                   default:
                       System.out.println("Lua chon khong hop le. Vui long nhap lai.");
               }
               
           } while (luaChon != 0);
       }
    }
   
}
