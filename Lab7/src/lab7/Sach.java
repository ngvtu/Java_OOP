package lab7;
import java.util.Scanner;
public class Sach extends TaiLieu {
    private String Tentacgia;
    private String Sotrang;

    public Sach() {
    }

    public Sach(String Tentacgia, String Sotrang, String MaTL, String TenNXB, String Sobanphathanh) {
        super(MaTL, TenNXB, Sobanphathanh);
        this.Tentacgia = Tentacgia;
        this.Sotrang = Sotrang;
    }

    public String getTentacgia() {
        return Tentacgia;
    }

    public void setTentacgia(String Tentacgia) {
        this.Tentacgia = Tentacgia;
    }

    public String getSotrang() {
        return Sotrang;
    }

    public void setSotrang(String Sotrang) {
        this.Sotrang = Sotrang;
    }
    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Tên tác giả: ");
        setTentacgia(new Scanner(System.in).nextLine());
        System.out.println("Số trang: ");
        setSotrang(new Scanner(System.in).nextLine());
    }
    @Override
    public void In()
    {
        super.In();
        System.out.println("Số trang: "+getSotrang());
        System.out.println("Tên tác giả: "+getTentacgia());
    }
}
