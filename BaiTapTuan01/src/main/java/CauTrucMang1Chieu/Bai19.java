/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CauTrucMang1Chieu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class Bai19 {

    public static void main(String[] args) {
        //khai bao mang luu so nguyen
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        n=docSoPhanTu(sc);
//cap phat so phan tu cho mang
        a = new int[n];
        phatSinhMang(a);
//a.xuat mang ra man hinh
        System.out.println("\nMang duoc phat sinh");
        xuatMang(a);

        sapXepTang(a);
        System.out.println("\nMang sau khi sap xep tang");
        xuatMang(a);
    }

    public static void sapXepTang(int[] a) {
        Arrays.sort(a);
    }
    
//dinh nghia phuong thuc xuat mang

    public static void xuatMang(int[] a) {
       System.out.print(Arrays.toString(a));
    }
    public static void phatSinhMang(int[] a){
        //Nhap gia tri cac phan tu tu bab phim
        Random rd=new Random();
        for (int i =0; i<a.length; i++){
            a[i]=rd.nextInt(100);
        }
    }
    //dinh nghia phuong thuc dem phan duong le
    public static int tinhTong(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum += x; //s=s+x;
        }
        return sum;
    }
    public static int docSoPhanTu(Scanner sc){
        int n=0;
        do{
            System.out.print("Cho biet so phan tu mang (1<=n<=20):");
            n=sc.nextInt();
        }while (n<=0 || n>20);
        return n;
    }
    public static void lietKeUocSo(int[] a, int x){
        for (int item : a){
            if(x%item==0)
            {
                System.out.print(item + " ");
            }
        }
    }
}
