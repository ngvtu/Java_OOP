package de2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Form2 extends javax.swing.JFrame {

    Vector DSnhanvien = new Vector();
    Vector headers = new Vector();
    public Form2() {
        initComponents();
        setLocationRelativeTo(null);// Cho giữa ra màn hình
        setResizable(false); // Không cho kéo giãn màn hình
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        txtngaysinh = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        rbtnam = new javax.swing.JRadioButton();
        rbtnu = new javax.swing.JRadioButton();
        txthesoluong = new javax.swing.JTextField();
        txtthamnien = new javax.swing.JTextField();
        txtluongcoban = new javax.swing.JTextField();
        btthem = new javax.swing.JButton();
        btluu = new javax.swing.JButton();
        cbbphongban = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nhập thông tin nhân viên");
        jLabel1.setToolTipText("");

        jLabel2.setText("Họ tên: ");

        jLabel3.setText("Ngày sinh: ");

        jLabel4.setText("Địa chỉ: ");

        jLabel5.setText("Giới tính: ");

        jLabel6.setText("Phòng ban: ");

        jLabel7.setText("Hệ số lương: ");

        jLabel8.setText("Thâm niên");

        jLabel9.setText("Lương cơ bản: ");

        rbtnam.setText("Nam");

        rbtnu.setText("Nữ");

        txtthamnien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtthamnienActionPerformed(evt);
            }
        });

        btthem.setText("Thêm nhân viên");
        btthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemActionPerformed(evt);
            }
        });

        btluu.setText("Lưu dữ liệu");
        btluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btluuActionPerformed(evt);
            }
        });

        cbbphongban.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mời bạn chọn phòng ban", "1. Thiết bị", "2. Nhân sự", "3. R&D", "4. Kinh doanh" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btthem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btluu))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtnam)
                        .addGap(40, 40, 40)
                        .addComponent(rbtnu))
                    .addComponent(txthoten, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(txtngaysinh)
                    .addComponent(txtdiachi)
                    .addComponent(txthesoluong)
                    .addComponent(txtthamnien)
                    .addComponent(txtluongcoban)
                    .addComponent(cbbphongban, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnam)
                        .addComponent(rbtnu)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbbphongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txthesoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtthamnien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtluongcoban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btthem)
                    .addComponent(btluu))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemActionPerformed
        if(txthoten.getText().equals("") || txtngaysinh.getText().equals("") || txtdiachi.getText().equals("") || ((!rbtnam.isSelected()) && (!rbtnu.isSelected())) || cbbphongban.getSelectedIndex()<=0 || txthesoluong.getText().equals("") || txtthamnien.getText().equals("") || txtluongcoban.getText().equals("")  )
        {
            JOptionPane.showMessageDialog(null, "Mời bạn nhập đầy đủ thông tin");
        }
        
        //Kiểm tra hệ số lương
        try
        {
            Float.parseFloat(txthesoluong.getText());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Bạn nhập sai hệ số lương");
            return;
        }
        
        //Kiểm tra thâm niên:
        try
        {
        Integer.parseInt(txtthamnien.getText());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Bạn nhập sai thâm niên");
            return;
        }
        
        //Kiểm tra lương cơ bản
        try
        {
            Float.parseFloat(txtluongcoban.getText());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Bạn nhập sai lương cơ bản");
            return;
        }
        
        Float hesoluong = Float.parseFloat(txthesoluong.getText());
        int thamnien = Integer.parseInt(txtthamnien.getText());
        Float luongcoban = Float.parseFloat(txtluongcoban.getText());
        if(hesoluong <=0 || thamnien <=0 || luongcoban <=0)
        {
            JOptionPane.showMessageDialog(null, "Các giá trị bạn nhập phải là số dương");
            return;
        }
        
        Nhanvien nv = new Nhanvien((String)cbbphongban.getSelectedItem(), hesoluong, thamnien, luongcoban, txthoten.getText(), txtngaysinh.getText(), txtdiachi.getText(), rbtnam.isSelected()? "Nam" : "Nữ");
        nv.Hienthi();
        JOptionPane.showMessageDialog(null, "Thêm thông tin thành công");
        DSnhanvien.add(nv);
        txthoten.setText("");
        txtngaysinh.setText("");
        txtdiachi.setText("");
        txthesoluong.setText("");
        txtthamnien.setText("");
        txtluongcoban.setText("");
        
    }//GEN-LAST:event_btthemActionPerformed

    private void btluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btluuActionPerformed
        try
        {
            FileWriter fw = new FileWriter("C:\\test\\nhanvien.dat");
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i<DSnhanvien.size();i++)
            {
                Nhanvien nvv = (Nhanvien) DSnhanvien.get(i);
                bw.append(nvv.Hoten + "$" + nvv.Ngaysinh + "$" +nvv.Diachi+ "$" + nvv.Gioitinh + "$" +cbbphongban.getSelectedItem()+ "$"+ nvv.getHesoluong() + "$" + nvv.getThamnien()+ "$" + nvv.getLuongcoban()); // nối chuỗi
                bw.newLine();
            }
            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(null, "Lưu file thành công");
        }
        catch(Exception ex)
        {
            JOptionPane.showConfirmDialog(null, "Lưu file thất bại");
        }
    }//GEN-LAST:event_btluuActionPerformed

    private void txtthamnienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtthamnienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtthamnienActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btluu;
    private javax.swing.JButton btthem;
    private javax.swing.JComboBox<String> cbbphongban;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbtnam;
    private javax.swing.JRadioButton rbtnu;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txthesoluong;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtluongcoban;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txtthamnien;
    // End of variables declaration//GEN-END:variables
}
