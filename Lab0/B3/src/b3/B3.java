package b3;
import java.util.Scanner;
import java.io.*;
public class B3 {
    public static void main(String[] args) {
        float a,b;
        Scanner ip = new Scanner(System.in);
        System.out.println("Mời bạn nhập hệ số a, b của phương trình");
        System.out.print("\na = ");
        a = ip.nextFloat();
        System.out.print("\nb = ");
        b = ip.nextFloat();
        if (a==0)
        {
            if(b==0)
                    {
                    System.out.println("Phương trình có vô số nghiệm");
                    }
            else
            {
                System.out.println("Phương trình vô nghiệm");
            }
            
        }
        else
        {
            System.out.println("Phương trình có nghiệm x = " +(-b/a));
        }
    }
    
}
