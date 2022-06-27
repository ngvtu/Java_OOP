package lab6_2;
import java.util.Scanner;
public class CanBo {
    private String Hoten;
    private int Namsinh;
    private String GT;
    private String Diachi;

    public CanBo() {
    }

    public CanBo(String Hoten, int Namsinh, String GT, String Diachi) {
        this.Hoten = Hoten;
        this.Namsinh = Namsinh;
        this.GT = GT;
        this.Diachi = Diachi;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public int getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(int Namsinh) {
        this.Namsinh = Namsinh;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }
    public void Nhap()
    {
        System.out.println("Nhập họ tên: ");
        setHoten(new Scanner(System.in).nextLine());
        System.out.println("Nhập năm sinh: ");
        setNamsinh(new Scanner(System.in).nextInt());
        System.out.println("Nhập giới tính: ");
        setGT(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ: ");
        setDiachi(new Scanner(System.in).nextLine());
    }
    public void In()
    {
        System.out.println("Họ tên: "+getHoten());
        System.out.println("Năm sinh: "+getNamsinh());
        System.out.println("Giới tính: "+getGT());
        System.out.println("Địa chỉ: "+getDiachi());
    }
}
