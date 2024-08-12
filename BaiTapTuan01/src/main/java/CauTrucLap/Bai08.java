/*
Viết chương trình tính tổng các số nguyên từ 1 N. N được nhập từ bàn
phím.
 */
package CauTrucLap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai08 {
    public static void main(String[] args) {
        int n;
        int s;
        Scanner sc=new Scanner(System.in);
        System.out.println("---TINH TOAN DAY SO : 1+2+3...+5---");
        //b1. doc so nguyen tu ban phim
        System.out.print("Nhap gia tri n:");
        n=sc.nextInt();
        //b2. tinh tong day so
        s=0;
        for (int i = 1; i <=n ; i++) {
            s=s+i; //s+=i;
        }
        //b3. xuat ket qua
        System.out.println("Trong day so:" + s);
    }
}