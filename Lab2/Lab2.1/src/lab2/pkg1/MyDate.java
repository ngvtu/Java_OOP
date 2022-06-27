package lab2.pkg1;
import java.util.Scanner;
import java.io.*;
public class MyDate { // Lớp MyDate có 3 thuộc tính day, month và year.

    private int day;
    private int month;
    private int year;

// Phương thức khởi tạo thứ nhất: Không có tham số 
public MyDate(){
}

// Phương thức khởi tạo thứ hai: Phương thức có tham số có kiểu là chính lớp đó
public MyDate(int day,int month, int year)
{
        this.day = day;
        this.month = month;
        this.year = year;
}
public void NhapIn()
{
    Scanner ip = new Scanner(System.in);
    System.out.print("\nMời bạn nhập ngày: ");
    day=ip.nextInt();
    System.out.print("\nMời bạn nhập tháng: ");
    month=ip.nextInt();
    System.out.print("\nMời bạn nhập năm: ");
    year=ip.nextInt();
    System.out.println("Hôm ngay ngày " +day+ " tháng " +month+ " năm " +year);
}

}

