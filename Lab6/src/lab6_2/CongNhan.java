package lab6_2;
import java.util.Scanner;
public class CongNhan extends CanBo{
    private String Bac;

    public CongNhan() {
    }

    public CongNhan(String Bac, String Hoten, int Namsinh, String GT, String Diachi) {
        super(Hoten, Namsinh, GT, Diachi);
        this.Bac = Bac;
    }

    public String getBac() {
        return Bac;
    }

    public void setBac(String Bac) {
        this.Bac = Bac;
    }
    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Mời bạn nhập bậc công nhân");
        setBac(new Scanner(System.in).nextLine());
    }
    @Override
    public void In()
    {
        super.In();
        System.out.println("Bậc: "+getBac());
    }
}
