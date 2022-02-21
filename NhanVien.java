package de5;

public class NhanVien extends Person {
    String maNV;
    int heSoluong;
    String donVi;

    public NhanVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String maNV, int heSoluong, String donVi) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maNV = maNV;
        this.heSoluong = heSoluong;
        this.donVi = donVi;
    }

    public NhanVien(String maNV, int heSoluong, String donVi) {
        this.maNV = maNV;
        this.heSoluong = heSoluong;
        this.donVi = donVi;
    }

    public NhanVien(){

    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getHeSoluong() {
        return heSoluong;
    }

    public void setHeSoluong(int heSoluong) {
        this.heSoluong = heSoluong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", heSoluong=" + heSoluong +
                ", donVi='" + donVi + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                '}';
    }
}
