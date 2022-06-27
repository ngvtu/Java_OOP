package lab22;
import java.util.Scanner;
import static java.lang.Math.abs;
public class PS {
    int tu;
    int mau;
public PS()
{
}

public PS(int a, int b)
{
    tu=a;
    mau=b;
}

public void Nhap(){
       Scanner ip = new Scanner(System.in);
       System.out.print("\nTử số = ");
       tu=ip.nextInt();
       System.out.print("\nMẫu số = ");
       mau=ip.nextInt();
   }
   public void in(){
       System.out.println();
       System.out.println("Phân số đã nhập: "+tu+"/"+mau);
   }
   public void Tong(PS a, PS b){
       int tuso = a.tu*b.mau + b.tu*a.mau;
       int mauso = a.mau*b.mau;
       PS Tongtg =new PS(tuso,mauso);
       Tongtg.toigian();
       System.out.println("Tổng = "+Tongtg.tu+"/"+Tongtg.mau);
   }
   public void Hieu(PS a, PS b){
       int tuso = a.tu*b.mau - b.tu*a.mau;
       int mauso = a.mau*b.mau;
       PS Hieutg = new PS(abs(tuso),mauso);
       Hieutg.toigian();
       System.out.println("Hiệu = "+Hieutg.tu+"/"+Hieutg.mau);
   }
   public void Tich(PS a, PS b){
       int tuso = a.tu*b.tu;
       int mauso = a.mau*b.mau;
       PS Tichtg = new PS(tuso,mauso);
       Tichtg.toigian();
       System.out.println("Tích = "+Tichtg.tu+"/"+Tichtg.mau);
   }
   public void Thuong(PS a, PS b){
       int tuso = a.tu*b.mau;
       int mauso = a.mau*b.tu;
       PS Thuongtg = new PS(tuso,mauso);
       Thuongtg.toigian();
       System.out.println("Thương = "+Thuongtg.tu+"/"+Thuongtg.mau);
   }
   public int UCLN(int a, int b)
   {
       while(a!=b)
       {
           if(a>b)
           {
               a=a-b;
           }
           else 
               b=b-a;         
       }
       return a;
   }
   public void toigian()
   {
       int i = UCLN(tu, mau);
       tu = tu/i;
       mau = mau/i;
   }
}