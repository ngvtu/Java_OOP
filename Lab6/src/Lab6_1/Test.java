package Lab6_1;
import java.util.Scanner;
public class Test {
    public static void main (String[] args)
    {
    int a;
    Scanner sc = new Scanner(System.in);
    PS ps = new PS();
    do
    {
        System.out.println("1. Cộng trừ nhân chia 2 phân số");
        System.out.println("2. Kiểm tra phân số có tối giản hay không");
        System.out.println("3. Tìm dạng tối giản của phân số");
        System.out.println("4. Nhập vào 1 dãy phân số và in ra dạng tối giản");
        System.out.println("5. Thoát khỏi chương trình");
        System.out.println();
        System.out.println("Mời bạn chọn chức năng");
        a=sc.nextInt();
        switch(a)
        {
            case 1:
            {
                PS ps1 = new PS();
                PS ps2 = new PS();
                ps1.Nhap();
                ps2.Nhap();
                ps1.in();
                ps2.in();
                ps.Tong(ps1, ps2);
                ps.Hieu(ps1, ps2);
                ps.Tich(ps1, ps2);
                ps.Thuong(ps1, ps2);
                break;
            }
            case 2:
            {
                ps.Nhap();
                ps.in();
                ps.kttoigian(ps.tu, ps.mau);
                break;
            }
            case 3:
            {
                ps.Nhap();
                ps.in();
                System.out.println("Phân số tối giản là: " );
                ps.toigian(ps.tu, ps.mau);
                break;
            }
            case 4:
            {
                DayPS dps = new DayPS();
                dps.nhapday();
                dps.inpstoigian();
                break;
            }
            case 5:
            {
                break;
            }
            default: 
            {
                System.out.println("Nhập sai mời bạn nhập lại");
            }
        }
    }while(a!=5);
    }
}
