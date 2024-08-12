/*
Nhập vào điểm 3 môn toán, văn, anh của 1 học sinh, viết chương trình đưa
ra xếp loại của học sinh đó theo điểm trung bình như sau:
– [0, 4.0): Yếu
– [4.0, 6.5): Trung bình
– [6.5, 8.0): Khá
– [8.0, 10]: Giỏi
 */
package CauTrucReNhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double toan,anh,van;
        double DTB;
        String kq="";
        Scanner sc = new Scanner(System.in);
        System.err.println("---Xếp loại học lực---");
        //B1: Nhập điểm 
        System.out.print("Nhập điểm Toán: ");
            toan=sc.nextDouble();
        System.out.print("Nhập điểm Anh: ");
            anh=sc.nextDouble();
        System.out.print("Nhập điểm Văn: ");
            van=sc.nextDouble();
        //B2: Tính điểm trung bình
        DTB= (toan+anh+van)/3;
        //B3: Xếp loại dựa trên điểm trung bình
        if(DTB<4)
        {
            kq="Yếu";
        }
        else if(DTB<6.5)
        {
            kq="Khá";
        }
        else
        {
            kq="Giỏi";
        }
        //B4: Xuất kết quả
        System.out.println("DTB: " + DTB + " - Xếp loại " + kq);
    }
    
}
