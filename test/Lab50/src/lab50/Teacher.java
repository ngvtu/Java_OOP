package lab50;
import java.util.Scanner;
public class Teacher extends Person {
    private String rank;

    public Teacher() {
    }

    public Teacher(String rank, String name, String address, String deparment) {
        super(name, address, deparment);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public void print()
    {
        super.print();
        System.out.println("Rank: "+getRank());
    }
    public void input()
    {
        super.input();
        System.out.println("Nhập Rank: ");
        setRank(new Scanner(System.in).nextLine());
    }
}
