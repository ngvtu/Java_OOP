package de3;

public class Person {
    protected String Hoten;
    protected String Ngaysinh;
    protected String Diachi;
    protected String Gioitinh;

    public Person(String Hoten, String Ngaysinh, String Diachi, String Gioitinh) {
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.Gioitinh = Gioitinh;
    }
    
    public void Hienthi()
    {
        System.out.println("Họ tên: "+this.Hoten);
        System.out.println("Ngày sinh: "+this.Ngaysinh);
        System.out.println("Địa chỉ: "+this.Diachi);
        System.out.println("Giới tính: "+this.Gioitinh);
    }
}
