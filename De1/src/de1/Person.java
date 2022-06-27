package de1;
public class Person {
    protected String Hoten;
    protected String Diachi;
    protected String Gioitinh;
    protected String Ngaysinh;

    public Person() {
    }

    public Person(String Hoten, String Diachi, String Gioitinh, String Ngaysinh) {
        this.Hoten = Hoten;
        this.Diachi = Diachi;
        this.Gioitinh = Gioitinh;
        this.Ngaysinh = Ngaysinh;
    }
    
    
    
    public void In()
    {
        System.out.println("Họ tên: "+this.Hoten);
        System.out.println("Ngày sinh: "+this.Ngaysinh);
        System.out.println("Địa chỉ: "+this.Diachi);
        System.out.println("Giới tính: "+this.Gioitinh);
    }
    
}
