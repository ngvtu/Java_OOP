package b1;
import java.util.Scanner;
import java.io.*;
public class B1 {
    Scanner ip = new Scanner(System.in);
    public void nhapin()
    {
        float a;
        System.out.println("Mời bạn nhập vào 1 số ");
        a = ip.nextFloat();
        System.out.println("Số bạn vừa nhập là: " +a);
    }
    public void tinhtoan()
    {
        float a,b;
        System.out.println("Mời bạn nhập 2 số a và b: ");
        System.out.print("a = ");
        a=ip.nextFloat();
        System.out.print("\nb = ");
        b=ip.nextFloat();
        System.out.println("\nTổng = " +(a+b));
        System.out.println("\nHiệu = " +(a-b));
        System.out.println("\nTích = " +(a*b));
        if(b!=0)
        {
        System.out.println("\nThương = " +(a/b));
        }
        else
        {
        System.out.println("Phép chia không hợp lệ mời bạn nhập b khác 0");
        }
    }
    public static void main(String[] args) {
        B1 a = new B1();
        System.out.println("Chương trình in ra một số vừa nhập");
        a.nhapin();
        System.out.println("Chương trình tính tổng hiệu tích thương của 2 số");
        a.tinhtoan();
    }
    
}
