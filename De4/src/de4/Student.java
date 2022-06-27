package de4;

public class Student extends Person {
    private String masv;
    private String email;
    private Float dtk;

    public Student() {
    }

    public Student(String masv, String email, Float dtk, String hoten, String ngaysinh, String diachi, String gioitinh) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.masv = masv;
        this.email = email;
        this.dtk = dtk;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getDtk() {
        return dtk;
    }

    public void setDtk(Float dtk) {
        this.dtk = dtk;
    }

    public void hienthi()
    {
        super.hienthi();
        System.out.println("Mã sinh viên: "+getMasv());
        System.out.println("Email: "+getEmail());
        System.out.println("Điểm tổng kết"+getDtk());
    }
    
}
