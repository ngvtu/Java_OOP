package kethua;
import java.util.Scanner;
import java.io.*;
public class Kethua {

    public static void main(String[] args) {
       Scanner ip = new Scanner(System.in);
       Class lop = new Class();
       Teacher tc = new Teacher();                  
       tc.nhapgv();
       lop.Nhapdshs();
       tc.in();
       lop.inlist();
}
}

