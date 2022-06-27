package lab50;
import java.util.Scanner;
import java.util.ArrayList;
public class Class {
    private String Classname;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private int numOfStudents;
    Teacher advisor;

    public Class() {
    }

    public Class(String Classname, int numOfStudents, Teacher advisor) {
        this.Classname = Classname;
        this.numOfStudents = numOfStudents;
        this.advisor = advisor;
    }

    public String getClassname() {
        return Classname;
    }

    public void setClassname(String Classname) {
        this.Classname = Classname;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public Teacher getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Teacher advisor) {
        this.advisor = advisor;
    }

    public void input()
    {
        System.out.println("Nhập tên lớp: ");
        setClassname(new Scanner(System.in).nextLine());
        System.out.println("Nhập giáo viên chủ nhiệm");
        Teacher teacher = new Teacher();
        teacher.input();
        setAdvisor(teacher);
        System.out.println("Số lượng sinh viên");
        setNumOfStudents(new Scanner(System.in).nextInt());
        for(int i=0;i<getNumOfStudents();i++)
        {
            System.out.println("1.Nhập thông tin sinh viên thứ "+(i+1));
            Student st = new Student();
            st.input();
            studentList.add(st);
    }
    }
    public void print()
    {
        System.out.println("Danh sách học sinh lớp: "+getClassname());
        for (int i=0;i<getNumOfStudents();i++)
        {
            System.out.println("1.Sinh viên thứ "+(i+1));
            Student student = (Student)studentList.get(i);
            student.print();
        }
        System.out.println("Giáo viên chủ nhiệm là: "+getAdvisor().getName());
    }
}
