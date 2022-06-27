package lab6_2;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class KySu extends CanBo{
    private String Nganh;

    public KySu() {
    }

    public KySu(String Nganh, String Hoten, int Namsinh, String GT, String Diachi) {
        super(Hoten, Namsinh, GT, Diachi);
        this.Nganh = Nganh;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }
    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Mời bạn nhập ngành đào tạo: ");
        setNganh(new Scanner(System.in).nextLine());
    }
    @Override
    public void In()
    {
        super.In();
        System.out.println("Ngành đào tạo: "+getNganh());
    }
    
}
