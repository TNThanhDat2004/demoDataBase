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
public class Bai17 {

    public static void main(String[] args) {
        double[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("nhap so phan tu cua mang (1 <= n <= 20): ");
            n = sc.nextInt();
            if (n < 1 || n > 20) {
                System.out.println("nhap so phan tu cua mang");
            }
        } while (n < 1 || n > 20);
        a = new double[n];

        // a. Nhap gia tri
        nhapMang(a, sc);

        // b. Xuat mang ra man hinh
        System.out.println("=== Mang da nhap ===");
        xuatMang(a);

        // c. Tinh trung binh gia tri cua mang
        double trungBinh = tinhTrungBinh(a);
        System.out.println("gia tri chung binh cua mang: " + trungBinh);

        // d. Tim phan tu co gia tri nho nhat trong mang
        double min = timMin(a);
        System.out.println("phan tu co gia tri nho nhat mang: " + min);
    }

    // Phuong thuc nhap mang
    public static void nhapMang(double[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("nhap gia tri a[" + i + "]: ");
            a[i] = sc.nextDouble();
        }
    }

    // Phuong thuc xuat mang
    public static void xuatMang(double[] a) {
        for (double x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Phuong thuc tinh trung binh gia tri cua mang
    public static double tinhTrungBinh(double[] a) {
        double sum = 0;
        for (double x : a) {
            sum += x;
        }
        return sum / a.length;
    }

    // Phuong thuc tim phan tu co gia tri nho nhat
    public static double timMin(double[] a) {
        double min = a[0];
        for (double x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
}
