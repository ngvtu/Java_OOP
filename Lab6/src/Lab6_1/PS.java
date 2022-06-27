package Lab6_1;

import static java.lang.Math.abs;
import java.util.Scanner;
import static java.lang.Math.abs;
public class PS {
    int tu,mau;
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
       System.out.println("Tổng 2 phân số là: ");
       this.toigian(tuso,mauso);
   }
   public void Hieu(PS a, PS b){
       int tuso = a.tu*b.mau - b.tu*a.mau;
       int mauso = a.mau*b.mau;
       System.out.println("Hiệu 2 phân số là: ");
      this.toigian(tuso,mauso);

   }
   public void Tich(PS a, PS b){
       int tuso = a.tu*b.tu;
       int mauso = a.mau*b.mau;
       System.out.println("Tích 2 phân số là: ");
       this.toigian(tuso,mauso);

   }
   public void Thuong(PS a, PS b){
       int tuso = a.tu*b.mau;
       int mauso = a.mau*b.tu;
       System.out.println("Thương 2 phân số là : ");
       this.toigian(tuso,mauso); 
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
   public void toigian(int a,int b)
   {
       if(UCLN(a,b)!=1)
       {
       int i = UCLN(a, b);
       a = a/i;
       b = b/i;
           System.out.println(a+"/"+b);
       }
       else
       {
           System.out.println(a+"/"+b);
       }
   }
   public boolean kttoigian(int a, int b)
   {
       if(UCLN(a,b)==1)
       {
        System.out.println("Phân số đã tối giản");
        return true;
       }
       else
       {
           System.out.println("Phân số chưa tối giản");
           return false;
       }
   }
   
}
