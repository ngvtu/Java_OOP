package lab7;
import java.util.Scanner;
public class TapChi extends TaiLieu {
    private int Sophathanh;
    private int Thangphathanh;

    public TapChi() {
    }

    public TapChi(int Sophathanh, int Thangphathanh, String MaTL, String TenNXB, String Sobanphathanh) {
        super(MaTL, TenNXB, Sobanphathanh);
        this.Sophathanh = Sophathanh;
        this.Thangphathanh = Thangphathanh;
    }

    public int getSophathanh() {
        return Sophathanh;
    }

    public void setSophathanh(int Sophathanh) {
        this.Sophathanh = Sophathanh;
    }

    public int getThangphathanh() {
        return Thangphathanh;
    }

    public void setThangphathanh(int Thangphathanh) {
        this.Thangphathanh = Thangphathanh;
    }

    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Số phát hành: ");
        setSophathanh(new Scanner(System.in).nextInt());
        System.out.println("Tháng phát hành: ");
        setThangphathanh(new Scanner(System.in).nextInt());
    }
    
    @Override
    public void In()
    {
        super.In();
        System.out.println("Số phát hành: "+getSophathanh());
        System.out.println("Tháng phát hành: "+getThangphathanh());
    }
    
}
