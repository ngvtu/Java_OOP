package lab6_2;
import java.util.Scanner;
public class QLCB {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CanBo [] cn = new CongNhan[50];
        CanBo [] ks = new KySu[50];
        CanBo [] nv = new NhanVien[50];
        int m=0,n=0,p=0,i,a;
        do
        {
            System.out.println("Nhập danh sách cán bộ: ");
            System.out.println("1. Nhập công nhân");
            System.out.println("2. Nhập kỹ sư");
            System.out.println("3. Nhập nhân viên phục vụ");
            System.out.println("4. Danh sách cán bộ đã nhập");
            System.out.println("5. Tìm kiếm cán bộ theo họ tên");
            System.out.println("6. Thoát chương trình");
            System.out.println();
            System.out.println("Mời bạn chọn chức năng: ");
            a = sc.nextInt();
            switch(a)
            {
                case 1:
                {
                    cn[++m] = new CongNhan();
                    cn[m].Nhap();
                    break;
                }
                case 2:
                {
                    ks[++n] = new KySu();
                    ks[n].Nhap();
                    break;
                }
                case 3:
                {
                    nv[++p] = new NhanVien();
                    nv[p].Nhap();
                    break;
                }
                case 4: 
                {   System.out.println();
                    System.out.println("Danh sách cán bộ đã nhập: ");
                    System.out.println("A. Danh sách công nhân");
                    for(i=1;i<=m;i++)
                    {
                        System.out.print(i+". ");
                        cn[i].In();
                    }
                    System.out.println();
                    System.out.println("B. Danh sách kỹ sư");
                    for(i=1;i<=n;i++)
                    {
                        System.out.print(i+". ");
                        ks[i].In();
                    }
                    System.out.println();
                    System.out.println("C. Danh sách nhân viên");
                    for(i=1;i<=p;i++)
                    {
                        System.out.print(i+". ");
                        nv[i].In();
                    }
                    System.out.println();
                    break;
                }
                case 5:
                {
                    System.out.println("Mời bạn nhập tên cần tìm");
        
                    String ten = new Scanner(System.in).nextLine();
                    int kt=0;
                    for( i=1;i<=m;i++)
                    {
                        if(cn[i].getHoten().equals(ten)==true)
                        {
                        kt=1;
                        System.out.println("Cán bộ cần tìm là : ");
                        cn[i].In();
                        }
                    }
                    if(kt!=1)
                    {
                        for(i=1;i<=n;i++)
                        {
                            if(ks[i].getHoten().equals(ten)==true)
                            {
                                kt=1;
                                System.out.println("Cán bộ cần tìm là: ");
                                ks[i].In();
                            }
                        }
                    }
                    if(kt!=1)
                    {
                        for(i=1;i<=p;i++)
                        {
                            if(nv[i].getHoten().equals(ten)==true)
                            {
                                kt=1;
                                System.out.println("Cán bộ cần tìm là: ");
                                nv[i].In();
                            }
                        }
                    }
                    if(kt!=1)
                    {
                        System.out.println("Không có cán bộ trong danh sách");
                    }
                    break;
                    
                }
                default:
                    System.out.println();
                    System.out.println("Nhập sai mời bạn nhập lại");
                    System.out.println();
                
            }
        }while(a!=6);
    }
    
}
