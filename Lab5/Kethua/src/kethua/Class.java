package kethua;
import java.util.Scanner;
import java.io.*;
public class Class  {
    private String name;
    private Student[] studentlist;
    private int numofstudent;
    private Teacher advisor;
    
   public Class(String name, int numofstudent, Teacher advisor)
   {
       this.name = name;
       this.numofstudent = numofstudent;
       this.advisor = advisor;
   }
    public Class() {
    numofstudent =0;
    }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(Student[] studentlist) {
        this.studentlist = studentlist;
    }

    public int getNumofstudent() {
        return numofstudent;
    }

    public void setNumofstudent(int numofstudent) {
        this.numofstudent = numofstudent;
    }

    public Teacher getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Teacher advisor) {
        this.advisor = advisor;
    }


    public void Nhapdshs()
    {
        Scanner ip = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng học sinh: ");
        this.numofstudent = ip.nextInt();
        this.studentlist = new Student[numofstudent];
        System.out.println("Mời bạn nhập tên lớp");
        this.name = ip.nextLine();
        this.name = ip.nextLine();
        System.out.println("Nhập danh sách học sinh lớp "+this.name);
        for(int i=0;i<this.numofstudent;i++)
        {
            System.out.println((i+1)+". Họ và tên: ");
            studentlist[i] = new Student();
            studentlist[i].setName(ip.nextLine());
            System.out.println("Địa chỉ: ");
            studentlist[i].setAddress(ip.nextLine());
        }
    }
    
    // kiểu array list
    public void inlist()
    {
        System.out.println("\t Danh sách học sinh lớp " +this.name);
        for(int i=0;i<this.numofstudent;i++)
        {
            System.out.println(i+".Họ tên: "+this.studentlist[i].getName());
            System.out.println(i+".Địa chỉ: "+this.studentlist[i].getAddress());
        }
        //System.out.println("advised by: "+advisor.getRank()+" và Tên: "+advisor.getName());
        //System.out.println("Số lượng học sinh: "+numofstudent);
    }
    
}
