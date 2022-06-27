package de5;

public class SinhvienATTT extends Sinhvien{
    private float hocphi;

    public float getHocphi() {
        return hocphi;
    }

    public void setHocphi(float hocphi) {
        this.hocphi = hocphi;
    }

    public SinhvienATTT() {
    }

    public SinhvienATTT(float hocphi, String masv, String hoten, String ngaysinh, String gioitinh, Float dtb) {
        super(masv, hoten, ngaysinh, gioitinh, dtb);
        this.hocphi = hocphi;
    }
    
    @Override
    public void hienthi()
    {
        super.hienthi();
        System.out.println("Học phí: "+getHocphi());
    }
}
