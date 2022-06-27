package b13;

import java.util.Scanner;
import java.io.*;

public class B13 {

    Scanner ip = new Scanner(System.in);
    int A[][];
    int m, n;

    public void Nhapmt() {
        System.out.println("Mời bạn nhập kích thước của ma trận");
        System.out.print("\nn = ");
        n = ip.nextInt();
        System.out.print("\nm = ");
        m = ip.nextInt();
        A = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("\nA" + i + j + " = ");
                A[i][j] = ip.nextInt();
            }
        }
    }

    public void Xuat() {
        System.out.println("   MA trận bạn vừa nhập ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("    " + A[i][j]);
            }
            System.out.println();
        }
    }
    
    public void min()
    {
        int min=A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(A[i][j]<min)
                {
                    min = A[i][j];
                }
            }
        }
        System.out.println("Phần tử nhỏ nhất = " +min);
    }
           
    public void max()
    {
        int max = A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if((A[i][j]%2!=0)&&(A[i][j]>max)||max%2==0)
                {
                    max = A[i][j];
                }
            
            }
        }
        if(max%2!=0)
        {
        System.out.println("Phần tử lẻ lớn nhất = " +max);
        }
        else
        {
            System.out.println("Không có phần tử lẻ lớn nhất trong mảng");
        }
    }
    
    public void tongmax()
    {
        int max = 0;
        for(int i=0;i<n;i++)
        {
            int tong=0;
            for(int j=0;j<m;j++)
            {
                tong +=A[i][j];
            }
            if(tong>max)
        {
            max = tong;
        }
        }
        System.out.println("Tổng hàng lớn nhất = " + max);
    }
    
    public static void main(String[] args) {
        B13 x = new B13();
        Scanner ip = new Scanner(System.in);
        int a;
        System.out.println("1. Nhập ma trận");
        System.out.println("2. In ma trận");
        System.out.println("3. Tìm phần tử nhỏ nhất");
        System.out.println("4. Tìm phần từ lẻ lớn nhất");
        System.out.println("5. Tìm dòng có tổng lớn nhất");
        System.out.println("6. Thoát chương trình");
        do {
            System.out.println("\nMời bạn chọn chức năng");
            a = ip.nextInt();
            switch (a) {
                case 1: {
                    x.Nhapmt();
                    break;
                }
                case 2: {
                    x.Xuat();
                    break;
                }
                case 3: {
                    x.min();
                    break;
                }
                case 4: {
                    x.max();
                    break;
                }
                case 5: {
                    x.tongmax();
                    break;
                }
                case 6: {
                    break;
                }
            }
        } while (a != 6);
    }
}
