package de4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class De4 {

    public static void main(String[] args) {
        ArrayList listStudent = new ArrayList();
        try
        {
            FileReader fr = new FileReader("C:\\test\\sinhvien.dat");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while((line=br.readLine())!=null)
            {
                String a[] = line.split("\\$");
                Student st = new Student(a[0], a[1], Float.parseFloat(a[2]), a[3], a[4], a[5], a[6]);
                listStudent.add(st);
                        
            }
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        for(int i=0;i<listStudent.size();i++)
        {
            Student st = (Student) listStudent.get(i);// Lấy ra phần tử thứ i của danh sách
            st.hienthi();
        }
    }
    
}
