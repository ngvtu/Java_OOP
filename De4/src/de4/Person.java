package de4;
public class Person {
    protected String hoten;
    protected String ngaysinh;
    protected String diachi;
    protected String gioitinh;

    public Person() {
    }

    public Person(String hoten, String ngaysinh, String diachi, String gioitinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }
    
    public void hienthi()
    {
        System.out.println("Họ tên: "+this.hoten);
        System.out.println("Ngày sinh: "+this.ngaysinh);
        System.out.println("Địa chỉ: "+this.diachi);
        System.out.println("Giới tính: "+this.gioitinh);
    }
}
