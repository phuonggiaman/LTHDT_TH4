package main;
 
import java.util.Scanner;
 
public class GiaoDich {
    private String maGiaoDich, ngayGiaoDich;
    private long donGia;
    private float dienTich;
    Scanner scanner = new Scanner(System.in);
     
    public GiaoDich() {
        super();
    }
 
    public GiaoDich(String maGiaoDich, String ngayGiaoDich, long donGia, float dienTich) {
        super();
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
 
    public String getMaGiaoDich() {
        return maGiaoDich;
    }
 
    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
 
    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }
 
    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
 
    public long getDonGia() {
        return donGia;
    }
 
    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }
 
    public float getDienTich() {
        return dienTich;
    }
 
    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }
     
    public void nhap() {
        System.out.print("Nhap ma giao dich: ");
        maGiaoDich = scanner.nextLine();
        System.out.print("Nhap ngay giao dich (ngay/thang/nam): ");
        ngayGiaoDich = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = Long.parseLong(scanner.nextLine());
        System.out.print("Nhap dien tich: ");
        dienTich = Float.parseFloat(scanner.nextLine());
    }
     
    @Override
    public String toString() {
        return "Ma giao dich:" + this.maGiaoDich + ", Ngay giao dich: " + this.ngayGiaoDich + 
            ", Don gia: " + this.donGia + ", Dien tich: " + this.dienTich;
    }
}