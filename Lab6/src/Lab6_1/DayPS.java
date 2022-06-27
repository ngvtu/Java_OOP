package Lab6_1;
import java.util.ArrayList;
import java.util.Scanner;
public class DayPS {
    ArrayList<PS> listPS = new ArrayList<PS>();
    int a;
    public void nhapday()
    {
        Scanner sc = new Scanner(System.in);
        int i=1;
        do
        {
            PS ps = new PS();
            System.out.println(i+". Nhập tử số: ");
            ps.tu=sc.nextInt();
            System.out.println("Nhập mẫu số: ");
            ps.mau=sc.nextInt();
            listPS.add(ps);
            i=i+1;
            System.out.println("Nhập tiếp: 1-Có hoặc 2-Không");
            a=sc.nextInt();
        }while (a!=2);
    }
    public void inpstoigian()
    {
        PS ps = new PS();
        System.out.println("Dãy phân số tối giản là: ");
        for(int i=0;i<listPS.size();i++)
        {
            ps.toigian(listPS.get(i).tu, listPS.get(i).mau);
        }
    }
}
