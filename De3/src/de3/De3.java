
package de3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class De3 {

    public static void main(String[] args) {
        ArrayList DSsinhvien = new ArrayList();
        try
        {
            FileReader fr = new FileReader("C:\\test\\nhanvien1.dat");
            BufferedReader br = new BufferedReader(fr);
            String line ="";
            while((line = br.readLine())!=null)
            {
                String a[] = line.split("\\$");
                Nhanvien nv = new Nhanvien(a[0],a[1],a[2],a[3],a[4],Float.parseFloat(a[5]),Integer.parseInt(a[6]),Float.parseFloat(a[7]));
                DSsinhvien.add(nv);
            }
            br.close();
            fr.close();
            
            for(int i=0;i<DSsinhvien.size();i++)
            {
                Nhanvien nv = (Nhanvien) DSsinhvien.get(i);
                nv.Hienthi();
            }
            
            Form3 f3 = new Form3();
            f3.setData(DSsinhvien);// Ghi dữ liệu vào form
            f3.setVisible(true); // Cho phép cửa sổ hiện thị ra
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}
