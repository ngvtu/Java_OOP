package kethua;
import java.util.Scanner;
import java.io.*;
public class Person {
    private String name;
    private String address;
    private String deparment;
    
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
    
    public void in()
    {
        System.out.println("Họ tên: " +this.name);
        System.out.println("Địa chỉ: "+this.address);
        System.out.println("Bộ môn: "+this.deparment);
    }
    
}
