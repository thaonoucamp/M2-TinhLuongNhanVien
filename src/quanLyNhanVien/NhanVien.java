package quanLyNhanVien;

import java.util.Scanner;

public class NhanVien {
    private String maNhanVien, hoTen, soDienThoai, mail;
    private int tuoi;
    protected int luong, luongCoBan;

    Scanner sc = new Scanner(System.in);

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String hoTen, String soDienThoai, String mail, int tuoi, int luong, int luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.mail = mail;
        this.tuoi = tuoi;
        this.luong = luong;
        this.luongCoBan = luongCoBan;
    }

    public void nhap() {
        System.out.println("Nhap ma nhan vien: ");
        maNhanVien = sc.nextLine();

        System.out.println("Nhap ten nhan vien: ");
        hoTen = sc.nextLine();

        System.out.println("Nhap so dien thoai: ");
        soDienThoai = sc.nextLine();

        System.out.println("Nhap email: ");
        mail = sc.nextLine();

        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();

        System.out.println("Nhap luong co ban: ");
        luongCoBan = sc.nextInt();
    }

    public int tinhLuong() {
        return 0;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", mail='" + mail + '\'' +
                ", tuoi=" + tuoi +
                ", luongCoBan=" + luongCoBan +
                '}';
    }
}
