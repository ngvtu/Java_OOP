package de1;

public class Student extends Person{
    private String MaSV;
    private String Email;
    private Float DTK;

    public Student() {
    }

    public Student(String MaSV, String Email, String Ngaysinh, String Hoten, String Diachi, String Gioitinh, Float DTK) {
        super(Hoten, Diachi, Gioitinh, Ngaysinh);
        this.MaSV = MaSV;
        this.Email = Email;
        this.DTK = DTK;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Float getDTK() {
        return DTK;
    }

    public void setDTK(Float DTK) {
        this.DTK = DTK;
    }
    
    public void In()
    {
        super.In();
        System.out.println("Mã sinh viên: "+getMaSV());
        System.out.println("Email: "+getEmail());
        System.out.println("Điểm tổng kết: "+getDTK());
    }
}
