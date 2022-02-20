/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Herif.Program;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
/**
 *
 * @author Be Humble
 */
public class Form1 extends javax.swing.JFrame {
    
    public Connection conn;
   public Statement cn;
    
    
    public void koneksi(){
         try {
             Class.forName("com.mysql.jdbc.Driver");
             conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
             cn=conn.createStatement();
             
                     }
         catch(ClassNotFoundException | SQLException e) {
             JOptionPane.showMessageDialog(null,"koneksi gagal. . ."+e);
             System.out.println(e.getMessage());
         }
     }
    
    private void kosongkan_form(){
        txtNama.setEditable(true);
        txtNama.setText(null);
        txtJumlah.setText(null);
        txtPabrik.setText(null);
        cbDana.setSelectedItem(this);
        cbKelompok.setSelectedItem(this);
        txtBatch.setText(null);
        txtKadarluarsa.setText(null);
        txtTerima.setText(null);
    }

      
  
      public void tampil(){
         DefaultTableModel table=new DefaultTableModel();
         table.addColumn("Nama");
         table.addColumn("Jumlah");
         table.addColumn("Pabrik");
         table.addColumn("Dana");
         table.addColumn("Kelompok");
         table.addColumn("Batch");
         table.addColumn("Kadaluarsa");
         table.addColumn("Terima");
         
         try{
             koneksi();
             String sql = "select * from db_input1 order by Nm_Obat asc";
             ResultSet rs=cn.executeQuery(sql);
             while(rs.next())
             {
                 table.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),
                     rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                 
             }
             tabel.setModel(table);
             }catch (Exception e){
                 JOptionPane.showMessageDialog(null,"Ada Kesalahan");
             }
     }
    /**
     * Creates new form Form1
     */
    public Form1() {
        initComponents();
        tampil();
        kosongkan_form();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        txtPabrik = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBatch = new javax.swing.JTextField();
        txtKadarluarsa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbDana = new javax.swing.JComboBox<>();
        cbKelompok = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtTerima = new javax.swing.JTextField();
        btNew = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        stak = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Data Input");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("DATA INPUT OBAT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 16, 224, 39));

        jLabel2.setText("Nama Obat");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 64, 122, 31));
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 64, 116, 31));

        jLabel3.setText("Jumlah Diterima");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 111, 122, 31));
        getContentPane().add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 111, 116, 31));
        getContentPane().add(txtPabrik, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 151, 116, 31));

        jLabel4.setText("Nama Pabrik");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 151, 122, 31));

        jLabel5.setText("Nomor Batch");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 192, 122, 31));

        txtBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchActionPerformed(evt);
            }
        });
        getContentPane().add(txtBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 192, 116, 31));
        getContentPane().add(txtKadarluarsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 232, 116, 31));

        jLabel6.setText("Tanggal Kadarluarsa");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 232, 122, 31));

        jLabel7.setText("Sumber Dana");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 64, 122, 31));

        jLabel8.setText("Kelompok Obat");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 104, 122, 31));

        cbDana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "APBN", "APBD", "DONASI" }));
        getContentPane().add(cbDana, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 64, 136, 31));

        cbKelompok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PKD", "PROGRAM", "LOGISTIK" }));
        getContentPane().add(cbKelompok, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 104, 136, 31));

        jLabel9.setText("Tanggal Terima");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 272, 122, 31));
        getContentPane().add(txtTerima, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 272, 116, 31));

        btNew.setText("NEW");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });
        getContentPane().add(btNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 191, 91, 32));

        btAdd.setText("SAVE");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        getContentPane().add(btAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 153, 91, 32));

        btOut.setText("OUT");
        btOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOutActionPerformed(evt);
            }
        });
        getContentPane().add(btOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 203, 91, 32));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Obat", "Jumah Diterima", "Nama Pabrik", "Sumber Dana", "Kelompok Obat", "Nomor Batch", "Tgl Kadarluarsa", "Tanggal Terima"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 321, 616, 92));

        jLabel10.setText("Stok Obat");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 277, 86, -1));
        getContentPane().add(stak, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 274, 134, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchActionPerformed

    private void btOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOutActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btOutActionPerformed

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
    kosongkan_form();
    
    }//GEN-LAST:event_btNewActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
    try{
        String sql = "INSERT INTO db_input1 VALUES ('"+txtNama.getText()+"','"+txtJumlah.getText()+"','"+txtPabrik.getText()+"','"+cbDana.getSelectedItem()+"','"+cbKelompok.getSelectedItem()+"','"+txtBatch.getText()+"','"+txtKadarluarsa.getText()+"','"+txtTerima.getText()+"')";
        java.sql.Connection conn = (Connection)Konfig.configDB();
        java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "Proses Simpan data Berhasil..");
        tampil();
        kosongkan_form();
    }catch(HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_btAddActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelMouseClicked

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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btOut;
    private javax.swing.JComboBox<String> cbDana;
    private javax.swing.JComboBox<String> cbKelompok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField stak;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtBatch;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKadarluarsa;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPabrik;
    private javax.swing.JTextField txtTerima;
    // End of variables declaration//GEN-END:variables
}
