package main;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class main {
 
    public static void main(String[] args) {
        ArrayList<GiaoDichNha> arrGiaoDichNha = new ArrayList<>();
        ArrayList<GiaoDichDat> arrGiaoDichDat = new ArrayList<>();
        int soGiaoDichDat = 0, soGiaoDichNha = 0;
        long tongTienGiaoDichDat = 0, trungBinhThanhTien = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Nhap so giao dich dat : ");
        soGiaoDichDat = scanner.nextInt();
        System.out.print("Nhap so giao dich nha : ");
        soGiaoDichNha = scanner.nextInt();
         
        System.out.println("Nhap thong tin giao dich dat ");
        for (int i = 0; i < soGiaoDichDat; i++) {
            System.out.println("Nhap thong tin giao dich dat thu " + (i + 1) + ":");
            GiaoDichDat giaoDichDat = new GiaoDichDat();
            giaoDichDat.nhap();
            arrGiaoDichDat.add(giaoDichDat);
        }
         
        System.out.println("Nhap thong tin giao dich nha ");
        for (int i = 0; i < soGiaoDichNha; i++) {
            System.out.println("Nhap thong tin giao dich nha thu " + (i + 1) + ":");
            GiaoDichNha giaoDichNha = new GiaoDichNha();
            giaoDichNha.nhap();
            arrGiaoDichNha.add(giaoDichNha);
        }
         
        System.out.println("---Thong tin cac giao dich dat---");
        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
            System.out.println(arrGiaoDichDat.get(i).toString());
        }
         
        System.out.println("---Thong tin cac giao dich nha---");
        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
            System.out.println(arrGiaoDichNha.get(i).toString());
        }
         
        for (int i = 0; i < arrGiaoDichDat.size(); i++) {
            if (arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("A")) {
                tongTienGiaoDichDat += arrGiaoDichDat.get(i).getDienTich() * 
                    arrGiaoDichDat.get(i).getDonGia() * 1.5;
            } else if (arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("B") || 
                    arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("C")) {
                tongTienGiaoDichDat += arrGiaoDichDat.get(i).getDienTich() * 
                    arrGiaoDichDat.get(i).getDonGia();
            }
        }
        trungBinhThanhTien = tongTienGiaoDichDat / (arrGiaoDichDat.size());
        System.out.println("Trung binh thanh tien cua giao dich dat = " + trungBinhThanhTien);
         
        System.out.println("Cac giao dich dat cua thang 5/2023 : ");
        for (int i = 0; i < arrGiaoDichDat.size(); i++) {
            String[] dateGiaoDichDat = arrGiaoDichDat.get(i).getNgayGiaoDich().split("/");
            if (dateGiaoDichDat[1].equals("5") && dateGiaoDichDat[2].equals("2023")) {
                System.out.println(arrGiaoDichDat.get(i).toString());
            }
        }
         
        System.out.println("Cac giao dich nha cua thang 5/2023 : ");
        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
            String[] dateGiaoDichNha = arrGiaoDichNha.get(i).getNgayGiaoDich().split("/");
            if (dateGiaoDichNha[1].equals("5") && dateGiaoDichNha[2].equals("2023")) {
                System.out.println(arrGiaoDichNha.get(i).toString());
            }
        }
    }
 
}