package b5;

import java.util.Scanner;
import java.io.*;

public class B5 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n;
        float tongduong = 0, tongam = 0, a = 0, b = 0;
        System.out.println("Mời bạn nhập độ dài dãy số");
        n = ip.nextInt();
        int A[];
        A = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("A"+i+" = ");
            A[i]=ip.nextInt();
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            if (A[i] > 0) {
                tongduong = tongduong + A[i];
                a++;

            } else {
                tongam = tongam + A[i];
                b++;
            }
        }
        if(a>0)
        {
        System.out.println("Trung bình cộng của các số dương là: " + ((float)tongduong / a ));
        }
        else
        {
            System.out.println("Không tồn tại số dương trong dãy");
        }
        if(b>0)
        {
        System.out.println("Trung bình cộng của các số âm là: " + ((float)tongam / b ) );
        }
        else
        {
            System.out.println("Không tồn tại số âm trong dãy");
        }
    }
        

}


