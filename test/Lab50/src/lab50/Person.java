package lab50;
import java.util.Scanner;
public class Person {
    private String name;
    private String address;
    private String deparment;

    public Person() {
    }

    public Person(String name, String address, String deparment) {
        this.name = name;
        this.address = address;
        this.deparment = deparment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }
    public void print()
    {
        System.out.println("Họ tên: "+getName());
        System.out.println("Địa chỉ: "+getAddress());
        System.out.println("Phòng ban: "+getDeparment());
    }
    public void input()
    {
        System.out.println("Họ tên: ");
        setName(new Scanner(System.in).nextLine());
        System.out.println("Địa chỉ: ");
        setAddress(new Scanner(System.in).nextLine());
        System.out.println("Phòng ban: ");
        setDeparment(new Scanner(System.in).nextLine());
    }
}
