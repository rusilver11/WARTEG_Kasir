/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siperpus;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Noobman
 */
public class Radmin11 extends javax.swing.JInternalFrame {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
      DefaultTableModel model;
      
    public Radmin11() {
        initComponents();
        conn = MainClassKoneksi1.getKoneksi();
         model = (DefaultTableModel) tbdttr.getModel();
       loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdttr = new javax.swing.JTable();
        tfsearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtkodetr = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdate = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtmenu = new javax.swing.JLabel();
        txtcategory = new javax.swing.JLabel();
        txtprice = new javax.swing.JLabel();
        txtqty = new javax.swing.JLabel();
        txtamount = new javax.swing.JLabel();
        txttotal = new javax.swing.JLabel();
        txtpayment = new javax.swing.JLabel();
        txtcashback = new javax.swing.JLabel();
        txtcashier = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        tbdttr.setBackground(new java.awt.Color(51, 51, 51));
        tbdttr.setForeground(new java.awt.Color(255, 255, 255));
        tbdttr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tbdttr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdttrMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdttr);

        tfsearch.setBackground(new java.awt.Color(51, 51, 51));
        tfsearch.setFont(new java.awt.Font("Lao UI", 0, 14)); // NOI18N
        tfsearch.setForeground(new java.awt.Color(255, 255, 255));
        tfsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfsearchKeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail"));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        txtkodetr.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        txtkodetr.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Menu :");
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 25));

        jLabel3.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Category :");
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 25));

        jLabel4.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Price :");
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 25));

        jLabel5.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Qty :");
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 25));

        jLabel6.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Amount :");
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 25));

        txtdate.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        txtdate.setForeground(new java.awt.Color(51, 51, 51));

        jLabel8.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Total :");
        jLabel8.setPreferredSize(new java.awt.Dimension(50, 25));

        jLabel9.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Payment :");
        jLabel9.setPreferredSize(new java.awt.Dimension(50, 25));

        jLabel10.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Cashback :");
        jLabel10.setPreferredSize(new java.awt.Dimension(50, 25));

        jLabel11.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Cashier :");
        jLabel11.setPreferredSize(new java.awt.Dimension(50, 25));

        txtmenu.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        txtmenu.setForeground(new java.awt.Color(51, 51, 51));
        txtmenu.setPreferredSize(new java.awt.Dimension(50, 25));

        txtcategory.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        txtcategory.setForeground(new java.awt.Color(51, 51, 51));
        txtcategory.setPreferredSize(new java.awt.Dimension(50, 25));

        txtprice.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        txtprice.setForeground(new java.awt.Color(51, 51, 51));
        txtprice.setPreferredSize(new java.awt.Dimension(50, 25));

        txtqty.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        txtqty.setForeground(new java.awt.Color(51, 51, 51));
        txtqty.setPreferredSize(new java.awt.Dimension(50, 25));

        txtamount.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        txtamount.setForeground(new java.awt.Color(51, 51, 51));
        txtamount.setPreferredSize(new java.awt.Dimension(50, 25));

        txttotal.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        txttotal.setForeground(new java.awt.Color(51, 51, 51));
        txttotal.setPreferredSize(new java.awt.Dimension(50, 25));

        txtpayment.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        txtpayment.setForeground(new java.awt.Color(51, 51, 51));
        txtpayment.setPreferredSize(new java.awt.Dimension(50, 25));

        txtcashback.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        txtcashback.setForeground(new java.awt.Color(51, 51, 51));
        txtcashback.setPreferredSize(new java.awt.Dimension(50, 25));

        txtcashier.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        txtcashier.setForeground(new java.awt.Color(51, 51, 51));
        txtcashier.setPreferredSize(new java.awt.Dimension(50, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtkodetr, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtqty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtamount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcashback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcashier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkodetr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcashback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Search_40px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tfsearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfsearchKeyReleased
        loadData(tfsearch.getText());
    }//GEN-LAST:event_tfsearchKeyReleased

    private void tbdttrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdttrMouseClicked
       int row=tbdttr.getSelectedRow();
       String to=tbdttr.getModel().getValueAt(row, 0).toString();
        try {
            Connection conn = MainClassKoneksi1.getKoneksi();
            Statement st = conn.createStatement();
            String sql1 = "SELECT tr_transaction.id_transaction,tr_transaction.kode_tr,Menu,Category,Price,Qty,tr_transaction.Amount,detail_transaction.amount,payment,cashback,unm_user,detail_transaction.dt "
                    + "FROM tr_transaction JOIN detail_transaction ON tr_transaction.kode_tr=detail_transaction.kode_tr "
                    + "WHERE id_transaction='"+to+"'";
            ResultSet rs = st.executeQuery(sql1);
          while (rs.next()) {
              String ktr=rs.getString("kode_tr");
              String mn=rs.getString("Menu");
              String ctgry=rs.getString("Category");
              int prc=rs.getInt("Price");
              int qty=rs.getInt("Qty");
              int amot=rs.getInt("Amount");
              int total=rs.getInt("amount");
              int pey=rs.getInt("payment");
              int cshb=rs.getInt("cashback");
              String unm=rs.getString("unm_user");
              Date tgl=rs.getDate("dt");
              
              txtkodetr.setText(ktr);
              txtmenu.setText(mn);
              txtcategory.setText(ctgry);
              txtprice.setText(""+prc);
              txtqty.setText(""+qty);
              txtamount.setText(""+amot);
              txtpayment.setText(""+pey);
              txtcashback.setText(""+cshb);
              txttotal.setText(""+total);
              txtcashier.setText(unm);
              txtdate.setText(""+tgl);
//                txtkodetr.setText(rs.getString("kode_tr"));
//                txtkodetr.setText(tbdttr.getValueAt(row, "id_tr").toString());
//                txtdate.setText(tbdttr.getValueAt(i, 11).toString());
//                txtmenu.setText(tbdttr.getValueAt(i, 2).toString());
//                txtcategory.setText(tbdttr.getValueAt(i, 3).toString());
//                txtprice.setText(tbdttr.getValueAt(i, 4).toString());
//                txtqty.setText(tbdttr.getValueAt(i, 5).toString());
//                txtamount.setText(tbdttr.getValueAt(rs, 6).toString());
//                txttotal.setText(tbdttr.getValueAt(i, 7).toString());
//                txtpayment.setText(tbdttr.getValueAt(i, 8).toString());
//                txtcashback.setText(tbdttr.getValueAt(i, 9).toString());
//                txtcashier.setText(tbdttr.getValueAt(i, 10).toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Radmin11.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tbdttrMouseClicked

    
    private void loadData(String key) {
        DefaultTableModel model = new DefaultTableModel();
        tbdttr.setModel(model);
        model.addColumn("ID TR");
        model.addColumn("Code TR");
        model.addColumn("Qty");
        model.addColumn("Amount");
        model.addColumn("Total");
        model.addColumn("Cashier");
        model.addColumn("Date");

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            Connection conn = MainClassKoneksi1.getKoneksi();
            Statement st = conn.createStatement();
//            String sql = "Select * from tr_transaction where kode_tr like'%"+key+"%'";
            String sql1 = "SELECT tr_transaction.id_transaction,tr_transaction.kode_tr,Menu,Category,Price,Qty,tr_transaction.Amount,detail_transaction.amount,payment,cashback,unm_user,detail_transaction.dt FROM tr_transaction JOIN detail_transaction ON tr_transaction.kode_tr=detail_transaction.kode_tr WHERE tr_transaction.kode_tr LIKE '%" + key + "%'OR tr_transaction.Menu LIKE '%" + key + "%'";
            ResultSet rs = st.executeQuery(sql1);
            while (rs.next()) {
                Object[] o = new Object[7];
                o[0] = rs.getString(1);
                o[1] = rs.getString(2);
                o[2] = rs.getString(6);
                o[3] = rs.getString(7);
                o[4] = rs.getString(8);
                o[5] = rs.getString(11);
                o[6] = rs.getString(12);

                model.addRow(o);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi Error");
        }

    }
    public void loadData() {
        DefaultTableModel model = new DefaultTableModel();
        tbdttr.setModel(model);
        model.addColumn("ID TR");
        model.addColumn("Code TR");
        model.addColumn("Qty");
        model.addColumn("Amount");
        model.addColumn("Total");
        model.addColumn("Cashier");
        model.addColumn("Date");
        TableColumn column;
        tbdttr.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS); 
        column = tbdttr.getColumnModel().getColumn(0); 
        column.setPreferredWidth(40);
        column = tbdttr.getColumnModel().getColumn(1); 
        column.setPreferredWidth(50);
        column = tbdttr.getColumnModel().getColumn(2); 
        column.setPreferredWidth(40);
        column = tbdttr.getColumnModel().getColumn(3); 
        column.setPreferredWidth(80);
        column = tbdttr.getColumnModel().getColumn(4); 
        column.setPreferredWidth(80);
        column = tbdttr.getColumnModel().getColumn(5); 
        column.setPreferredWidth(60);
        column = tbdttr.getColumnModel().getColumn(6); 
        column.setPreferredWidth(100);


        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            Connection conn = MainClassKoneksi1.getKoneksi();
            Statement st = conn.createStatement();
            String sql1 = "SELECT tr_transaction.id_transaction,tr_transaction.kode_tr,Menu,Category,Price,Qty,tr_transaction.Amount,detail_transaction.amount,payment,cashback,unm_user,detail_transaction.dt "
                    + "FROM tr_transaction JOIN detail_transaction ON tr_transaction.kode_tr=detail_transaction.kode_tr ORDER BY kode_tr ASC";
            ResultSet rs = st.executeQuery(sql1);
            while (rs.next()) {
                Object[] o = new Object[7];
                o[0] = rs.getString(1);
                o[1] = rs.getString(2);
                o[2] = rs.getString(6);
                o[3] = rs.getString(7);
                o[4] = rs.getString(8);
                o[5] = rs.getString(11);
                o[6] = rs.getString(12);
                
                model.addRow(o);
            }
            rs.close();

            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi Error");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbdttr;
    private javax.swing.JTextField tfsearch;
    private javax.swing.JLabel txtamount;
    private javax.swing.JLabel txtcashback;
    private javax.swing.JLabel txtcashier;
    private javax.swing.JLabel txtcategory;
    private javax.swing.JLabel txtdate;
    private javax.swing.JLabel txtkodetr;
    private javax.swing.JLabel txtmenu;
    private javax.swing.JLabel txtpayment;
    private javax.swing.JLabel txtprice;
    private javax.swing.JLabel txtqty;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables
}
