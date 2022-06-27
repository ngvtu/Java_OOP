package kethua;
import java.util.Scanner;
import java.io.*;
public class Teacher extends Person {
    private String rank;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public void nhapgv()
    {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhập tên giáo viên");
        setName(ip.nextLine());
        System.out.println("Địa chỉ: ");
        setAddress(ip.nextLine());
        System.out.println("Bộ môn giảng dạy");
        setDeparment(ip.nextLine());
        System.out.println("Cấp bậc (TS,ThS,CN)");
        setRank(ip.nextLine());
    }
    public void in()
    {
        super.in();
        System.out.println("Trình độ: "+this.rank);
    }
}
