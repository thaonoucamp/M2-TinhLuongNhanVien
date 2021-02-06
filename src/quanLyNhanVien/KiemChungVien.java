package quanLyNhanVien;

public class KiemChungVien extends NhanVien{
    private int soLoiPhatHien;

    public KiemChungVien() {
    }

    public KiemChungVien(int soLoiPhatHien) {
        this.soLoiPhatHien = soLoiPhatHien;
    }

    public KiemChungVien(String maNhanVien, String hoTen, String soDienThoai, String mail, int tuoi, int luong, int luongCoBan, int soLoiPhatHien) {
        super(maNhanVien, hoTen, soDienThoai, mail, tuoi, luong, luongCoBan);
        this.soLoiPhatHien = soLoiPhatHien;
    }

    public int getSoLoiPhatHien() {
        return soLoiPhatHien;
    }

    public void setSoLoiPhatHien(int soLoiPhatHien) {
        this.soLoiPhatHien = soLoiPhatHien;
    }

    public KiemChungVien(String maNhanVien, String hoTen, String soDienThoai, String mail, int tuoi, int luong, int luongCoBan) {
        super(maNhanVien, hoTen, soDienThoai, mail, tuoi, luong, luongCoBan);
    }

    @Override
    public void nhap() {
        super.nhap();

        System.out.println("Nhap so loi phat hien: ");
        soLoiPhatHien = sc.nextInt();
    }

    @Override
    public int tinhLuong() {
        this.luong = this.luongCoBan + this.soLoiPhatHien * 50000;
        return this.luong;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n So gio lam them la: " + this.soLoiPhatHien +
                "\n Tong luong la: " + this.luong;
    }
}
