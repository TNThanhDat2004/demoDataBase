package cautrucmang1chieu;

import java.util.Arrays;
import java.util.Scanner;

public class Bai20 {

    public static void main(String[] args) {
        // Khai báo mảng lưu số nguyên
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử từ bàn phím
        n = docSoPhanTu(sc);
        // Cấp phát bộ nhớ cho mảng
        a = new int[n];

        // Nhập giá trị cho mảng từ bàn phím
        nhapMang(a, sc);

        // Xuất mảng ra màn hình
        System.out.println("\nMang da nhap:");
        xuatMang(a);

        // Sắp xếp mảng theo thứ tự tăng dần
        sapXepTang(a);
        System.out.println("\nMang sau khi sap xep tang:");
        xuatMang(a);

        // a. Nhập số nguyên x và kiểm tra sự xuất hiện của x trong mảng
        System.out.print("\nNhap so nguyen x: ");
        int x = sc.nextInt();
        int viTri = timViTri(a, x);
        if (viTri != -1) {
            System.out.println("So " + x + " xuat hien tai vi tri: " + viTri);
        } else {
            System.out.println("So " + x + " khong xuat hien trong mang.");
        }

        // b. Kiểm tra mảng có tính chất tăng dần không
        if (kiemTraTangDan(a)) {
            System.out.println("Mang da duoc sap xep theo thu tu tang dan.");
        } else {
            System.out.println("Mang khong theo thu tu tang dan.");
        }
    }

    // Định nghĩa phương thức sắp xếp tăng dần
    public static void sapXepTang(int[] a) {
        Arrays.sort(a);
    }

    // Định nghĩa phương thức xuất mảng
    public static void xuatMang(int[] a) {
        System.out.print(Arrays.toString(a));
    }

    // Định nghĩa phương thức nhập mảng từ bàn phím
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap gia tri a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    // Định nghĩa phương thức đọc số phần tử
    public static int docSoPhanTu(Scanner sc) {
        int n;
        do {
            System.out.print("Cho biet so phan tu mang (1 <= n <= 20): ");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);
        return n;
    }

    // Định nghĩa phương thức tìm vị trí của số x trong mảng
    public static int timViTri(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1; 
    }

    // Định nghĩa phương thức kiểm tra mảng có tính chất tăng dần
    public static boolean kiemTraTangDan(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
