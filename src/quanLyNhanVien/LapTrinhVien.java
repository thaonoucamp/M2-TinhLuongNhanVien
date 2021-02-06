package quanLyNhanVien;

public class LapTrinhVien extends NhanVien {
    private int soGioLamThem;

    public LapTrinhVien() {
    }

    public LapTrinhVien(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    public LapTrinhVien(String maNhanVien, String hoTen, String soDienThoai, String mail, int tuoi, int luong, int luongCoBan, int soGioLamThem) {
        super(maNhanVien, hoTen, soDienThoai, mail, tuoi, luong, luongCoBan);
        this.soGioLamThem = soGioLamThem;
    }

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    public LapTrinhVien(String maNhanVien, String hoTen, String soDienThoai, String mail, int tuoi, int luong, int luongCoBan) {
        super(maNhanVien, hoTen, soDienThoai, mail, tuoi, luong, luongCoBan);
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap so gio lam them: ");
        soGioLamThem = sc.nextInt();
    }

    @Override
    public int tinhLuong() {
        this.luong = this.luongCoBan + this.soGioLamThem * 200000;
        return this.luong;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n So gio lam them: " + this.soGioLamThem +
                "\n Tong luong: " + this.luong;
    }
}
