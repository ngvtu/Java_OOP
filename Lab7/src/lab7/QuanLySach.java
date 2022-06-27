package lab7;

import java.util.Scanner;

public class QuanLySach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaiLieu[] tc = new TapChi[50];
        TaiLieu[] b = new Bao[50];
        TaiLieu[] s = new Sach[50];
        int m = 0, n = 0, p = 0, i,a;
        do {
            System.out.println("Thông tin về các tài liệu ");
            System.out.println("1. Nhập thông tin sách");
            System.out.println("2. Nhập thông tin tạp chí");
            System.out.println("3. Nhập thông tin báo");
            System.out.println("4. Thông tin các tài liệu đã nhập");
            System.out.println("5. Tìm kiếm tài liệu theo loại");
            System.out.println("6. Thoát chương trình");
            System.out.println();
            System.out.println("Mời bạn chọn chức năng: ");
            a = sc.nextInt();
            switch (a) {
                case 1: {
                    s[++m] = new Sach();
                    s[m].Nhap();
                    break;
                }
                case 2: {
                    tc[++n] = new TapChi();
                    tc[n].Nhap();
                    break;
                }
                case 3: {
                    b[++p] = new Bao();
                    b[p].Nhap();
                    break;
                }
                case 4: {
                    System.out.println();
                    System.out.println("Thông tin các tài liệu đã nhập: ");
                    System.out.println("\tA. Sách");
                    for (i = 1; i <= m; i++) {
                        System.out.print(i + ". ");
                        s[i].In();
                    }
                    System.out.println();
                    System.out.println("\tB. Tạp chí");
                    for (i = 1; i <= n; i++) {
                        System.out.print(i + ". ");
                        tc[i].In();
                    }
                    System.out.println();
                    System.out.println("\tC. Báo");
                    for (i = 1; i <= p; i++) {
                        System.out.print(i + ". ");
                        b[i].In();
                    }
                    System.out.println();
                    break;
                }

                case 5: {
                    System.out.println("Mời bạn nhập loại tài liệu cần tìm (Sach, Tapchi, Bao)");
                    String loai = new Scanner(System.in).nextLine();
                    if (loai.equalsIgnoreCase("Sach")==true) {
                        System.out.println("\tA. Sách");
                        for (i = 1; i <= m; i++) {
                            System.out.print(i + ". ");
                            s[i].In();
                        }
                          System.out.println();
                    }
                    if (loai.equalsIgnoreCase("Tapchi")==true) {
                        System.out.println("\tB. Tạp chí");
                        for (i = 1; i <= n; i++) {
                            System.out.print(i + ". ");
                            tc[i].In();
                        }
                          System.out.println();
                    }
                    if (loai.equalsIgnoreCase("Bao")==true) {
                        System.out.println("\tC. Báo");
                        for (i = 1; i <= p; i++) {
                            System.out.print(i + ". ");
                            b[i].In();
                        }
                        System.out.println();
                    }
                    break;
                }
                default:
                    System.out.println();
                    System.out.println("Nhập sai mời bạn nhập lại");
                    System.out.println();

            }
        } while (a != 6);
    }
}
