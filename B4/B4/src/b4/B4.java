package b4;

import java.util.Scanner;
import java.io.*;

public class B4 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t, n;
        System.out.println("Mời bạn nhập tháng: ");
        t = ip.nextInt();
        System.out.println("Mời bạn nhập năm");
        n = ip.nextInt();
        switch (t) {
            case 1: {
                System.out.println("Tháng 1 năm " + n + " có 31 ngày");
                break;
            }
            case 2: {
                if (n % 4 == 0 && n % 100 != 0) {
                    System.out.println("Tháng 2 năm " + n + " có 29 ngày");
                } else {
                    System.out.println("Tháng 2 năm " + n + " có 28 ngày");
                }
                break;
            }
            case 3: {
                System.out.println("Tháng 3 năm " + n + " có 31 ngày");
                break;

            }
            case 4: {
                System.out.println("Tháng 4 năm " + n + " có 30 ngày");
                break;

            }
            case 5: {
                System.out.println("Tháng 5 năm " + n + " có 31 ngày");
                break;

            }
            case 6: {
                System.out.println("Tháng 6 năm " + n + " có 30 ngày");
                break;

            }
            case 7: {
                System.out.println("Tháng 7 năm " + n + " có 31 ngày");
                break;

            }
            case 8: {
                System.out.println("Tháng 8 năm " + n + " có 31 ngày");
                break;

            }
            case 9: {
                System.out.println("Tháng 9 năm " + n + " có 30 ngày");
                break;
            }
            case 10: {
                System.out.println("Tháng 10 năm " + n + " có 31 ngày");
                break;
            }
            case 11: {
                System.out.println("Tháng 11 năm " + n + " có 30 ngày");
                break;
            }
            case 12: {
                System.out.println("Tháng 12 năm " + n + " có 31 ngày");
                break;
            }
        }
    }

}
