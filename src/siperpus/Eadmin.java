package siperpus;


import java.beans.PropertyVetoException;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Noobman
 */
public class Eadmin extends javax.swing.JFrame {
String tglsekarang ;
String wktsekarang ;
    public Eadmin() {
        initComponents();
        tampilwaktu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bLogout4 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bEM = new javax.swing.JToggleButton();
        bEML = new javax.swing.JToggleButton();
        bM = new javax.swing.JToggleButton();
        bC = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        player = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        bLogout4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        bLogout4.setText("Exit");
        bLogout4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogout4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setSize(new java.awt.Dimension(1024, 768));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(109, 495));

        bEM.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(bEM);
        bEM.setFont(new java.awt.Font("Lao UI", 0, 11)); // NOI18N
        bEM.setForeground(new java.awt.Color(255, 255, 255));
        bEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Add_User_Group_Woman_Man_50px.png"))); // NOI18N
        bEM.setText("Employe");
        bEM.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        bEM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bEM.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEMActionPerformed(evt);
            }
        });

        bEML.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(bEML);
        bEML.setFont(new java.awt.Font("Lao UI", 0, 11)); // NOI18N
        bEML.setForeground(new java.awt.Color(255, 255, 255));
        bEML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Restaurant_Menu_50px.png"))); // NOI18N
        bEML.setText("Menu");
        bEML.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        bEML.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bEML.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bEML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEMLActionPerformed(evt);
            }
        });

        bM.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(bM);
        bM.setFont(new java.awt.Font("Lao UI", 0, 11)); // NOI18N
        bM.setForeground(new java.awt.Color(255, 255, 255));
        bM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Staff_50px.png"))); // NOI18N
        bM.setText("User");
        bM.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        bM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bM.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMActionPerformed(evt);
            }
        });

        bC.setBackground(new java.awt.Color(102, 102, 102));
        bC.setFont(new java.awt.Font("Lao UI", 0, 11)); // NOI18N
        bC.setForeground(new java.awt.Color(255, 255, 255));
        bC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Exit_50px.png"))); // NOI18N
        bC.setText("Logout");
        bC.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        bC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bC.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/WartegLux(1)(1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bEM, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
            .addComponent(bEML, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bEM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEML, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        player.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout playerLayout = new javax.swing.GroupLayout(player);
        player.setLayout(playerLayout);
        playerLayout.setHorizontalGroup(
            playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        playerLayout.setVerticalGroup(
            playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Clock_30px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lao UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("00:00:00");
        jLabel4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel4PropertyChange(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lao UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("000/00/00");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Calendar_30px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lao UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Manager_100px.png"))); // NOI18N
        jLabel2.setText("Welcome Admin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 445, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
                .addGap(25, 25, 25))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLogout4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogout4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bLogout4ActionPerformed

    private void bEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEMActionPerformed
    try {
        Eadmin2 ED2 = new Eadmin2();
        ED2.setVisible(true);
        player.removeAll();
        player.add(ED2);
        ED2.setMaximum(true);
    } catch (PropertyVetoException ex) {
        Logger.getLogger(Eadmin.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_bEMActionPerformed

    private void bCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCActionPerformed
player.removeAll();
new SIlog().setVisible(true);
this.dispose();
    }//GEN-LAST:event_bCActionPerformed

    private void bMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMActionPerformed
    try {
        Eadmin3 ED3 = new Eadmin3();
        ED3.setVisible(true);
        player.removeAll();
        player.add(ED3);
        ED3.setMaximum(true);
    } catch (PropertyVetoException ex) {
        Logger.getLogger(Eadmin.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_bMActionPerformed

    private void bEMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEMLActionPerformed
    try {
        Radmin2 RD2 = new Radmin2();
        RD2.setVisible(true);
        player.removeAll();
        player.add(RD2);
        RD2.setMaximum(true);
    } catch (PropertyVetoException ex) {
        Logger.getLogger(Eadmin.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_bEMLActionPerformed

    private void jLabel4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel4PropertyChange

    }//GEN-LAST:event_jLabel4PropertyChange

 private void tampilwaktu(){
        Thread t2 = new Thread(){
            public void run(){
                for(;;){
                    try {
                        
                        Calendar cal = new GregorianCalendar();
                        wktsekarang = (cal.get(Calendar.HOUR)+" : "
                                +cal.get(Calendar.MINUTE)+" : "
                                +cal.get(Calendar.SECOND));
                       tglsekarang = (cal.get(Calendar.DATE)+" / "
                                +(cal.get(Calendar.MONTH)+1)+" / "
                                +cal.get(Calendar.YEAR));
                       jLabel4.setText(wktsekarang);
                       jLabel7.setText(tglsekarang);
                        sleep(1000);
                    } catch (InterruptedException ex) {
                      
                    }
                }
            };
        };
        t2.start();
    }
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
            java.util.logging.Logger.getLogger(Eadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bC;
    private javax.swing.JToggleButton bEM;
    private javax.swing.JToggleButton bEML;
    private javax.swing.JButton bLogout4;
    private javax.swing.JToggleButton bM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel player;
    // End of variables declaration//GEN-END:variables
}