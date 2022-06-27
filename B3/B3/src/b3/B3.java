package b3;

import java.io.*;
import java.util.Scanner;

public class B3 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a, b, c;
        System.out.println("Mời bạn nhập cạnh thứ 1: ");
        a = ip.nextInt();
        System.out.println("Mời bạn nhập cạnh thứ 2: ");
        b = ip.nextInt();
        System.out.println("Mời bạn nhập cạnh thứ 3: ");
        c = ip.nextInt();
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("Đây là 3 cạnh của tam giác");
                if (a == b && b == c) {
                    System.out.println("Đây là tam giác đều");
                }
                else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
                {
                    System.out.println("Đây là tam giác vuông");
                }
                else if (a==b || b==c || a==c)
                {
                    System.out.println("Đây là tam giác cân");
                }
                 else 
                {
                    System.out.println("Đây là tam giác thường");
                }
            
        } else {
            System.out.println("Đây không phải là 3 cạnh của tam giác");
        }

    }

}
