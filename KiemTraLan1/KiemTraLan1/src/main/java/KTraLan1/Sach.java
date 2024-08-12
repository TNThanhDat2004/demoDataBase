/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTraLan1;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class Sach 
{


    private String MaSach;
    private String TenSach;
    private double GiaBia;
    private int NamXuatBan;
    public Sach(){
         this.MaSach="";
        this.TenSach="";
        this.GiaBia=0.0;
        this.NamXuatBan=0;
    }
    public Sach(String MaSach, String TenSach, double GiaBia, int NamXuatBan)
    {
        this.MaSach=MaSach;
        this.TenSach=TenSach;
        this.GiaBia=GiaBia;
        this.NamXuatBan=NamXuatBan;
    }
    
    public String getMaSach(){
        return MaSach;
    }
    
    public void setMaSach(String MaSach){
        this.MaSach=MaSach;
    }
    
    public String getTenSach(){
        return MaSach;
    }
    
    public void setTenSach(String TenSach){
        this.TenSach=TenSach;
    }
    
    public double getGiaBia(){
        return GiaBia;
    }
    
    public void setGiaBia(double GiaBia){
        this.GiaBia=GiaBia;
    }
    
    public int getNamXuatBan(){
        return NamXuatBan;
    }
    
    public void setNamXuatBan(int NamXuatBan){
        this.NamXuatBan=NamXuatBan;
    }
    
    @Override
    public String toString(){
        return "Sach{"+
                "MaSach="+ MaSach + '\''+
                ", TenSach"+ TenSach + '\''+
                ", GiaBia"+ GiaBia +
                ", NamXuatBan=" + NamXuatBan +
                '}';
    }
}