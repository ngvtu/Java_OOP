package lab22;
import java.util.Scanner;
import java.io.*;
public class Lab22 {

    public static void main(String[] args) {
        PS ps1 = new PS(1,2);
        PS ps2 = new PS(4,5);
        /*ps1.Nhap();
        ps2.Nhap();*/
        ps1.in();
        ps2.in();
       ps1.Tong(ps1, ps2);
        ps1.Hieu(ps1, ps2);
        ps1.Tich(ps1, ps2);
        ps1.Thuong(ps1, ps2);
    }
}
