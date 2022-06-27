package b1;

import java.io.*;
import java.util.Scanner;

public class B1 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Kiểm tra và in ra vị trí số 9 đầu tiên trong mảng");
        int n;
        System.out.println();
        System.out.print("Mời bạn nhập độ dài mảng: ");
        n = ip.nextInt();
        int A[];
        A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            A[i] = ip.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (A[i] == 9) {
                System.out.println("Trong mảng có số 9");
                System.out.print("Vị trí số 9 đầu tiên trong mảng là: ");
                System.out.print((i + 1)+"\n");
                break;
            } else {
                System.out.println("Trong mảng không có số 9");
            }
            System.out.println();
        }
    }
}
