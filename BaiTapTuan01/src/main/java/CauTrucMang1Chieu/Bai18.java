/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CauTrucMang1Chieu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai18 {

    public static void main(String[] args) {
        //Khai bao mang luu tru so nguyen
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);

        // Nhap so phan tu tu ban phim
        do {
            System.out.print("Nhap so phan tu cua mang (1 <= n <= 50): ");
            n = sc.nextInt();
            if (n < 1 || n > 50) {
                System.out.println("So phan tu phai trong khoang tu 1 den 50.");
            }
        } while (n < 1 || n > 50);
        a = new int[n];
        // a. nhap gia tri cho mang tu ban phim
        nhapMang(a, sc);
        // b. Xuat mang ra man hinh
        System.out.println("=== Mang da nhap ===");
        xuatMang(a);
        // c. Liet ke cac phan tu khong phai so nguyen to
        System.out.println("\nCac phan tu khong phai so nguyen to:");
        lietKeKhongSoNguyenTo(a);
        // d. Tinh trung binh cac so nguyen to
        double trungBinh = tinhTrungBinhSoNguyenTo(a);
        System.out.println("\nTrung binh gia tri cua cac so nguyen to: " + trungBinh);
    }

    // Phuong thuc nhap mang
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap gia tri a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    // Phuong thuc xuat mang
    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Kiem tra so nguyen to
    public static boolean isSoNguyenTo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Phuong thuc liet ke cac phan tu khong phai so nguyen to
    public static void lietKeKhongSoNguyenTo(int[] a) {
        boolean hasNonPrime = false;
        for (int x : a) {
            if (!isSoNguyenTo(x)) {
                System.out.print(x + " ");
                hasNonPrime = true;
            }
        }
        if (!hasNonPrime) {
            System.out.println("Tat ca cac phan tu la so nguyen to.");
        }
    }

    // Phuong thuc tinh trung binh cac so nguyen to
    public static double tinhTrungBinhSoNguyenTo(int[] a) {
        int tong = 0;
        int dem = 0;
        for (int x : a) {
            if (isSoNguyenTo(x)) {
                tong += x;
                dem++;
            }
        }
        if (dem == 0) {
            return 0;
        }
        return (double) tong / dem;
    }
}
