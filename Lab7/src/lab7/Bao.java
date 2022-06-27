package lab7;
import java.util.Scanner;
public class Bao extends TaiLieu {
    private int Ngayphathanh;

    public Bao() {
    }

    public Bao(int Ngayphathanh, String MaTL, String TenNXB, String Sobanphathanh) {
        super(MaTL, TenNXB, Sobanphathanh);
        this.Ngayphathanh = Ngayphathanh;
    }

    public int getNgayphathanh() {
        return Ngayphathanh;
    }

    public void setNgayphathanh(int Ngayphathanh) {
        this.Ngayphathanh = Ngayphathanh;
    }
    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Ngày phát hành: ");
        setNgayphathanh(new Scanner(System.in).nextInt());
    }
}
