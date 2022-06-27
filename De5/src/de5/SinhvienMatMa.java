package de5;

public class SinhvienMatMa extends Sinhvien{
    private String donvi;
    private float luong;

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public SinhvienMatMa() {
    }

    public SinhvienMatMa(String donvi, float luong, String masv, String hoten, String ngaysinh, String gioitinh, Float dtb) {
        super(masv, hoten, ngaysinh, gioitinh, dtb);
        this.donvi = donvi;
        this.luong = luong;
    }
    
    @Override
    public void hienthi()
    {
        super.hienthi();
        System.out.println("Đơn vị: "+getDonvi());
        System.out.println("Lương: "+getLuong());
    }
    
}
