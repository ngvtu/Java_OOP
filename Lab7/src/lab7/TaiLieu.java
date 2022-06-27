package lab7;
import java.util.Scanner;
public class TaiLieu {
    private String MaTL;
    private String TenNXB;
    private String Sobanphathanh;

    public TaiLieu() {
    }

    public TaiLieu(String MaTL, String TenNXB, String Sobanphathanh) {
        this.MaTL = MaTL;
        this.TenNXB = TenNXB;
        this.Sobanphathanh = Sobanphathanh;
    }

    public String getMaTL() {
        return MaTL;
    }

    public void setMaTL(String MaTL) {
        this.MaTL = MaTL;
    }

    public String getTenNXB() {
        return TenNXB;
    }

    public void setTenNXB(String TenNXB) {
        this.TenNXB = TenNXB;
    }

    public String getSobanphathanh() {
        return Sobanphathanh;
    }

    public void setSobanphathanh(String Sobanphathanh) {
        this.Sobanphathanh = Sobanphathanh;
    }
    public void Nhap()
    {
        System.out.println("Nhập mã tài liệu: ");
        setMaTL(new Scanner(System.in).nextLine());
        System.out.println("Nhập tên nhà xuất bản: ");
        setTenNXB(new Scanner(System.in).nextLine());
        System.out.println("Nhập số bản phát hành: ");
        setSobanphathanh(new Scanner(System.in).nextLine());
    }
    public void In()
    {
        System.out.println("Mã tài liệu: "+getMaTL());
        System.out.println("Tên nhà xuất bản: "+getTenNXB());
        System.out.println("Số bản phát hành: "+getSobanphathanh());
    }
}
