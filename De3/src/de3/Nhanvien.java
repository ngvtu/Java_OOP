
package de3;

public class Nhanvien extends Person{
    private String Phongban;
    private Float Hesoluong;
    private int Thamnien;
    private float Luongcoban;


    public Nhanvien(String Hoten, String Ngaysinh, String Diachi, String Gioitinh,String Phongban, float Hesoluong, int Thamnien, float Luongcoban) {
        super(Hoten, Ngaysinh, Diachi, Gioitinh);
        this.Phongban = Phongban;
        this.Hesoluong = Hesoluong;
        this.Thamnien = Thamnien;
        this.Luongcoban = Luongcoban;
    }

    public String getPhongban() {
        return Phongban;
    }

    public void setPhongban(String Phongban) {
        this.Phongban = Phongban;
    }

    public Float getHesoluong() {
        return Hesoluong;
    }

    public void setHesoluong(Float Hesoluong) {
        this.Hesoluong = Hesoluong;
    }

    public int getThamnien() {
        return Thamnien;
    }

    public void setThamnien(int Thamnien) {
        this.Thamnien = Thamnien;
    }

    public float getLuongcoban() {
        return Luongcoban;
    }

    public void setLuongcoban(float Luongcoban) {
        this.Luongcoban = Luongcoban;
    }
    
    public void Hienthi()
    {
        super.Hienthi();
        System.out.println("Phòng ban: "+getPhongban());
        System.out.println("Hệ số lương: "+getHesoluong());
        System.out.println("Thâm niên: "+getThamnien());
        System.out.println("Lương cơ bản: "+getLuongcoban());
        System.out.println("Lương thực lĩnh: "+Luongthuclinh());
    }
    
    public float Luongthuclinh(){
        return (float) (this.getLuongcoban() * this.getHesoluong() * (1 + this.getThamnien()/100.0));
    }
        
    
}