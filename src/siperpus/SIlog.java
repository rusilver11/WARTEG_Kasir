/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siperpus;

import com.mysql.jdbc.Connection;
import com.sun.awt.AWTUtilities;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SIlog extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
//    String hakakses;
//    String id;
//    String level;
   

    public SIlog() {
        initComponents();
        conn = MainClassKoneksi1.getKoneksi();
        setLocationRelativeTo(this);
        setTitle(" Login  -  WartegLuxury ");
        AWTUtilities.setWindowShape(this, new RoundRectangle2D.Double(0,0,500,500,30,30));
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pfpw = new javax.swing.JPasswordField();
        tfuser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setName(""); // NOI18N

        pfpw.setBackground(new java.awt.Color(51, 51, 51));
        pfpw.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        pfpw.setForeground(new java.awt.Color(255, 255, 255));
        pfpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfpwActionPerformed(evt);
            }
        });
        pfpw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfpwKeyPressed(evt);
            }
        });

        tfuser.setBackground(new java.awt.Color(51, 51, 51));
        tfuser.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        tfuser.setForeground(new java.awt.Color(255, 255, 255));
        tfuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfuserActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Lao UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGN IN");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lao UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER LOGIN");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Key_40px.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Customer_40px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/close-circle-512(1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pfpw)
                    .addComponent(tfuser)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfuser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pfpw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conn = MainClassKoneksi1.getKoneksi();
     
        try{
            st = conn.createStatement();
            String sql = "SELECT * FROM c_user WHERE unm_user = '"+tfuser.getText()+"' and pw_user = '"+pfpw.getText()+"'";
            rs = st.executeQuery(sql);
            if(rs.next()){

            }if (rs.getString("lvl_user").equalsIgnoreCase("Owner")){
                     Hmain Hm = new Hmain(); Ordered od = new Ordered();
                JOptionPane.showMessageDialog(rootPane, "Login Success");
                Hm.id_kasir().setText(rs.getString("unm_user"));
                Hm.id_kasir2().setText(rs.getString("lvl_user"));
                Hm.jbutton2().setEnabled(true);
                Hm.jbutton1().setEnabled(false);
                Hm.setVisible(true);
                this.dispose();
                od.dispose();
            }else if (rs.getString("lvl_user").equalsIgnoreCase("Admin")){
                   Hmain Hm = new Hmain(); 
                JOptionPane.showMessageDialog(rootPane, "Login Success");
                Hm.id_kasir().setText(rs.getString("unm_user"));
                Hm.id_kasir2().setText(rs.getString("lvl_user"));
                Hm.jbutton1().setEnabled(true);
                Hm.jbutton2().setEnabled(false);
                Hm.setVisible(true);
                this.dispose();

            }else if (rs.getString("lvl_user").equalsIgnoreCase("Cashier")){
                   Hmain Hm = new Hmain(); Ordered od = new Ordered();
                JOptionPane.showMessageDialog(rootPane, "Login Success");
                od.id_kasir().setText(rs.getString("unm_user"));
                od.setVisible(true);
                this.dispose();
                Hm.dispose();
            }
            else
            JOptionPane.showMessageDialog(rootPane, "Gagal Login", "Pesan", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //        login();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfuserActionPerformed

    private void pfpwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfpwKeyPressed
        //        // TODO add your handling code here:
        //        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //
            //            login();
            //
            //        }
    }//GEN-LAST:event_pfpwKeyPressed

    private void pfpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfpwActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
this.dispose(); 
    }//GEN-LAST:event_jLabel2MouseClicked

//    private void login() {
//        try {
//            
//            String sql = "SELECT * FROM ms_user WHERE Username='"
//                    + tfuser.getText() + "' AND Password='"
//                    + pfpw.getText() + "'";
//            conn = MainClassKoneksi1.getKoneksi();
//            Statement st = conn.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()) {
//                hakakses = rs.getString(4);
//            }
//
//            if (hakakses.equals("")) {
//                JOptionPane.showMessageDialog(this, "Masukan User dan Password", "Error",
//                        JOptionPane.ERROR_MESSAGE);
//            } else {
//                JOptionPane.showMessageDialog(null, "Silahkan Masuk");
//                menuLogin();
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Periksa Nama dan Password Anda !", "Information",
//                    JOptionPane.INFORMATION_MESSAGE);
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    private void menuLogin(){
//if(hakakses.equals("CO"))
//{
//     new Hmain().setVisible(true);
//JOptionPane.showMessageDialog(null, "Anda Masuk Sebagai Administrator");
//
//}
//else if(hakakses.equals("Cashier"))
//{
//     new Ordered().setVisible(true);
//JOptionPane.showMessageDialog(null, "Anda Masuk Sebagai Technician");
//
//}
//}
//    public void login() {
//
//        try {
//            conn = MainClassKoneksi1.getKoneksi();
//            Statement st = conn.createStatement();
//            String sql = "SELECT * FROM c_user WHERE unm_user='" + tfuser.getText() + "' AND pw_user='" + pfpw.getText() + "'";
//            rs = st.executeQuery(sql);
////            while(rs.next()){
////                 UserID.setid(tfuser.getText());
////////                level = rs.getString("Position");
////            }
//           if(rs.next()){
//    
// 
//
////                if(tfuser.getText().equals(rs.getString("Username"))
////                        && pfpw.getText().equals(rs.getString("Password"))){
//          if (rs.getString("lvl_user").equalsIgnoreCase("Owner")) {
//                st1();
//                new Hmain().setVisible(true);
//                this.dispose();
//              
//            }   else if (rs.getString("lvl_user").equalsIgnoreCase("Admin")) {
//
//                new Hmain().setVisible(true);
//                this.dispose();
//            }   else if (rs.getString("lvl_user").equalsIgnoreCase("Cashier")) {
//
//                new Ordered().setVisible(true);
//                this.dispose();
//            }
//        }else{
//               JOptionPane.showMessageDialog(null, "username atau password salah");
//           }
//        } catch (Exception ex) {
//            Logger.getLogger(SIlog.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    public void st1(){
//        try {
//            conn = MainClassKoneksi1.getKoneksi();
//            Statement st = conn.createStatement();
//
//            String sql = "SELECT * FROM ms_user WHERE unm_user='" + tfuser.getText() + "' AND pw_user='" + pfpw.getText() + "'";
//            rs = st.executeQuery(sql);
//            while(rs.next()){
//                UserID.setid(tfuser.getText());
////                level = rs.getString("lvl_user");
//                
//            }
//                if(rs.getRow()==1){
//                    UserID.setid(id);
////                    UserID.setlvl(level);
//                }
//                
//            
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(SIlog.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//        public void st2(){
//        try {
//            conn = MainClassKoneksi1.getKoneksi();
//            Statement st = conn.createStatement();
//
//            String sql = "SELECT * FROM ms_user WHERE usnm_user='" + tfuser.getText() + "' AND pw_user='" + pfpw.getText() + "'";
//            rs = st.executeQuery(sql);
//            while(rs.next()){
//                UserID.setid(tfuser.getText());
////                level = rs.getString("lvl_user");
//                
//            }
//                if(rs.getRow()==1){
//                    UserID.setid(id);
////                    UserID.setlvl(level);
//                }
//                
//            
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(SIlog.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

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
            java.util.logging.Logger.getLogger(SIlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIlog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pfpw;
    private javax.swing.JTextField tfuser;
    // End of variables declaration//GEN-END:variables
}
