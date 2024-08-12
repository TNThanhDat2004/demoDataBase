/*
    Giai Phuong Trinh Bat 1: ax+b=0
 */
package CauTrucReNhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double a,b;
        String kq="";
        Scanner sc = new Scanner(System.in);
        System.err.println("---GIAI PHUONG TRINH BAT NHAT---");
        //B1: Nhap he so 
        System.out.print("Nhap he so a: ");
            a=sc.nextDouble();
        System.out.print("Nhap he so b: ");
            b=sc.nextDouble();
        //B2:Giai va bien luan
        if (a==0) {
            if (b==0) {
                kq="Phuong Trinh VSN";
            }
            else{
                kq="Phuong Trinh Vo Nguyem";
            }
        }else//a!=0
        {
            kq="Phuong trinh co ngiem";
        }
        //B3:Xuat ket qua
        System.out.println(kq);
    }
    
}
