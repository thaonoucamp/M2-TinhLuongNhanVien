package quanLyNhanVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng nhân viên;
        System.out.println("Nhap so nhan vien: ");
        int soNhanVien = sc.nextInt();

        // Tạo 1 mảng danh sách nhân viên;
        NhanVien[] nhanVien = new NhanVien[soNhanVien];

        // Duyệt mảng chọn nhân viên nhập thông tin;
        System.out.println("Nhap thong tin nhan vien: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhap nhan vien thu " + (i+1) + ":");

            // Chọn nhân viên muốn nhập trước;
            System.out.println("Chon loai nhan vien (1 - Lap Trinh Vien; 2 - Kiem Chung Vien): ");
            int choice = sc.nextInt();

            if (choice == 1) {
                nhanVien[i] = new LapTrinhVien();
            } else if (choice == 2) {
                nhanVien[i] =new KiemChungVien();
            }
            // Sau khi chọn nhân viên gọi phương thức nhập thông tin;
            nhanVien[i].nhap();

            // Sau khi đã có thông tin gọi phương thức tính lương của nhân viên;
            nhanVien[i].tinhLuong();
        }

        // Duyệt mảng danh sách và hiển thị tất cả thông tin của nhân viên;
        System.out.println("Thong tin cua cac nhan vien trong cong ty: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println(nhanVien[i].toString());
        }

    }
}
