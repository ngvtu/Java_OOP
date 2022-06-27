package lab1;
import java.util.Scanner;
import java.io.*;
public class Lab1 {
    public String HT;
    public String MSV;
    public String Lop;
    public String Email;
    public void Nhap()
    {
        Scanner ip = new Scanner(System.in);
        System.out.println("------Mời bạn nhập thông tin cá nhân------");
        System.out.println("Họ tên: ");
        HT = ip.nextLine();
        System.out.println("Mã sinh viên: ");
        MSV = ip.nextLine();
        System.out.println("Lớp: ");
        Lop = ip.nextLine();
        System.out.println("Email: ");
        Email = ip.nextLine();
    }
    public void In1()
    {
        System.out.println("Thông tin cá nhân của bạn là: ");
        System.out.println("Họ tên--------- Mã sinh viên---Lop------------Email");
        System.out.println(HT + "\t" + MSV + "\t" + Lop + "\t" + Email );
    }
    public void In2()
    {
        int i;
        for(i=9;i>=1;i--)
        {
            System.out.println(i +" bottles of beer on the wall, "+ i+ " bottles of beer");
            System.out.println("Take one down, pass it round");
        }
        if (i==0)
        {
            System.out.println("No more bottles of beer on the wall");
        }
    }
    public static void main(String[] args) {
        Lab1 a = new Lab1();
        a.Nhap();
        a.In1();
        a.In2();
    }
    
}
