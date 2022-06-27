package b12;

import java.util.Scanner;
import java.io.*;

public class B12 {

    Scanner ip = new Scanner(System.in);
    int n;
    int A[];

    public void Nhap() {
        System.out.println("Mời bạn nhập vào độ dài của mảng");
        System.out.print("\nn = ");
        n = ip.nextInt();
        A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nA" + i + " = ");
            A[i] = ip.nextInt();
        }
    }

    public void In() {
        System.out.println("Mảng bạn vừa nhập là ");
        for (int i = 0; i < n; i++) {
            System.out.print("  " + A[i]);
        }
        System.out.println();
    }

    public void max() {
        int max;
        max = A[0];
        for (int i = 0; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Phần tử max = " + max);
    }

    public void min() {
        int min;
        min = A[0];
        for (int i = 0; i < n; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        System.out.println("Phần tử max = " + min);
    }

    public void dempt() {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                dem++;
            }
        }
        System.out.println("Số phần tử chẵn trong mà là " + dem);
    }

    public int Nguyento(int n) {
        int i;
        if (n < 2) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n % 2 == 0) {
            return 0;
        } else {
            for (i = 3; i <= n / 2; i += 2) {
                if (n % i == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }

    public void Innguyento() {
        System.out.print("\nCác số nguyên tố cần tìm là ");
        for (int i = 0; i < n; i++) {
            if (Nguyento(A[i]) == 1) {
                System.out.print(A[i] + " ");
            }
        }
    }

    public void sapxep() {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int tmp;
                    tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }
        System.out.println("Mảng vừa sắp xếp là: ");
        for (int i = 0; i < n; i++) {
            System.out.println(+A[i] + "  ");
        }
    }

    public void timx() {
        int x, b = 0;
        System.out.println("Mời bạn nhập phần tử x cần tìm");
        System.out.print("\nx = ");
        x = ip.nextInt();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                b++;
            }
        }
        if (b == 0) {
            System.out.println("Không có phần tử " + x + " trong mảng ");
        } else {
            System.out.println("Có phần tử " + x + " trong mảng ");
        }
    }

    public static void main(String[] args) {
        B12 x = new B12();
        Scanner ip = new Scanner(System.in);
        x.Nhap();
        int a;
        System.out.println("1. Xuất giá trị các phần tử của mảng");
        System.out.println("2. Tìm phần tử có giá trị lớn nhất, nhỏ nhất");
        System.out.println("3. Đếm số phần tử là số chẵn");
        System.out.println("4. Tìm các phần tử là số nguyên tố");
        System.out.println("5. Sắp xếp mảng tăng dần");
        System.out.println("6. Tìm phần tử có giá trị x");
        System.out.println("7. Thoát chương trình");
        do {
            System.out.println("\nMời bạn chọn chức năng");
            a = ip.nextInt();
            switch (a) {
                case 1: {
                    x.In();
                    break;
                }
                case 2: {
                    x.max();
                    x.min();
                    break;
                }
                case 3: {
                    x.dempt();
                    break;
                }
                case 4: {
                    x.Innguyento();
                    break;
                }
                case 5: {
                    x.sapxep();
                    break;
                }
                case 6: {
                    x.timx();
                    break;
                }
                case 7:{
                    break;
                }
            }
        } while (a != 7);
    }

}
