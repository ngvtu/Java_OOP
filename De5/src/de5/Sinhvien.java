package de5;

public class Sinhvien {
    protected String masv;
    protected String hoten;
    protected String ngaysinh;
    protected String gioitinh;
    protected Float dtb;

    public Sinhvien() {
    }

    public Sinhvien(String masv, String hoten, String ngaysinh, String gioitinh, Float dtb) {
        this.masv = masv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.dtb = dtb;
    }
    
    public void hienthi()
    {
        System.out.println("Mã sinh viên: "+this.masv);
        System.out.println("Họ tên: "+this.hoten);
        System.out.println("Ngày sinh: "+this.ngaysinh);
        System.out.println("Giới tính: "+this.gioitinh);
        System.out.println("Điểm trung bình: "+this.dtb);
    }
}
