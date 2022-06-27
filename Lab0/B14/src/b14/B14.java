package b14;

import java.util.Scanner;
import java.io.*;

public class B14 {

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

    public int timmax(int A[][], int n, int m) {
        int Max = A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (Max < A[i][j]) {
                    Max = A[i][j];
                }
            }
        }
        return (Max);
    }

    public void max() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == timmax(A, n, m)) {
                    System.out.println("\nPhan tu lon hang " + i + " cot " + j + " dat Max: A[" + i + "][" + j + "]= " + A[i][j]);
                }

            }
        }
    }

    public void nguyento() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] < 2) {
                    A[i][j] = 0;
                } else if (A[i][j] == 2) {
                    A[i][j] = A[i][j];
                } else if (A[i][j] % 2 == 0) {
                    A[i][j] = 0;
                } else {
                    for (int k = 3; k < A[i][j]/2; k += 2) {
                        if (A[i][j] % k == 0) {
                            A[i][j] = 0;
                        }
                    }
                }
            }
        }
        System.out.println("Các phần tử là số nguyên tố là(phần tử 0 không là số nguyên tố)" );
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(+A[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void sapxep()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                if(A[j][i]>A[j+1][i])
                {
                    int tmp;
                    tmp = A[j][i];
                    A[j][i]=A[j+1][i];
                    A[j+1][i]=tmp;
                }
            }
        }
        System.out.println("Mảng bạn vừa sắp xếp tăng dần theo cột");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(+A[i][j]+"  ");
            }
            System.out.println();
        }
    }
        

    public static void main(String[] args) {
        B14 x = new B14();
        Scanner ip = new Scanner(System.in);
        int a;
        System.out.println("1. Tìm phần tử lớn nhất của ma trận cùng chỉ số của số đó");
        System.out.println("2. Tìm và in ra các phần tử là số nguyên tố của ma trận");
        System.out.println("3. Sắp xếp các cột của ma trận theo thứ tự tăng dần và in ra màn hình");
        System.out.println("4. Thoát chương trình");
        x.Nhapmt();
        do {
            System.out.println("\nMời bạn chọn chức năng");
            a = ip.nextInt();
            switch (a) {
                case 1: {
                    x.max();
                    break;
                }
                case 2: {
                    x.nguyento();
                    break;
                }
                case 3: {
                   x.sapxep();
                    break;
                }
                case 4: {
                    break;
                }
            }
        } while (a != 4);

    }

}
