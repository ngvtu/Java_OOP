package lab6_2;
import java.util.Scanner;
public class NhanVien extends CanBo{
    private String CongViec;

    public NhanVien() {
    }

    public NhanVien(String CongViec, String Hoten, int Namsinh, String GT, String Diachi) {
        super(Hoten, Namsinh, GT, Diachi);
        this.CongViec = CongViec;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String CongViec) {
        this.CongViec = CongViec;
    }
    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Mời bạn nhập công việc: ");
        setCongViec(new Scanner(System.in).nextLine());
    }
    @Override
    public void In()
    {
        super.In();
        System.out.println("Công việc: "+getCongViec());
    }
}
