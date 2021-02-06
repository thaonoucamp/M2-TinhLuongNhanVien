package quanLyNhanVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so nhan vien: ");
        int soNhanVien = sc.nextInt();

        NhanVien[] nhanVien = new NhanVien[soNhanVien];

        System.out.println("Nhap thong tin nhan vien: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhap nhan vien thu " + (i+1) + ":");

            System.out.println("Chon loai nhan vien (1 - Lap Trinh Vien; 2 - Kiem Chung Vien): ");
            int choice = sc.nextInt();

            if (choice == 1) {
                nhanVien[i] = new LapTrinhVien();
            } else if (choice == 2) {
                nhanVien[i] =new KiemChungVien();
            }
            nhanVien[i].nhap();
            nhanVien[i].tinhLuong();
        }
        System.out.println("Thong tin cua cac nhan vien trong cong ty: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println(nhanVien[i].toString());
        }

    }
}
