package lab50;
import java.util.Scanner;
public class Student extends Person {
    private String Classname;

    public Student() {
    }

    public Student(String Classname, String name, String address, String deparment) {
        super(name, address, deparment);
        this.Classname = Classname;
    }

    public String getClassname() {
        return Classname;
    }

    public void setClassname(String Classname) {
        this.Classname = Classname;
    }
    public void print()
    {
        super.print();
    }
    public void input()
    {
        super.input();
    }

}
