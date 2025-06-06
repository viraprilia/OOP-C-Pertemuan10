package pertemuan10;

import static pertemuan10.dbkoneksi.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aprilia
 * TGL:24 Mei 2025
 */
public class fMahasiswa extends javax.swing.JFrame {
    DefaultTableModel DTM = new DefaultTableModel();
    

    /**
     * Creates new form fMahasiswa
     */
    public fMahasiswa() throws SQLException {
        initComponents();
        
        tblmhs.setModel(DTM);
        DTM.addColumn("NIM");
        DTM.addColumn("Nama Mahasiswa");
        DTM.addColumn("Jurusan");
        DTM.addColumn("Alamat");
        
        lsdtmhs();
        clearform();
        
        
        
        
        
        
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
        txNIM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txNAMA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txJUR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txALAMAT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmhs = new javax.swing.JTable();
        cHAPUS = new javax.swing.JButton();
        cUBAH = new javax.swing.JButton();
        cBARU = new javax.swing.JButton();
        cTUTUP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Data Mahasiswa");

        jLabel2.setText("NIM");

        txNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNIMActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Mahasiswa");

        txNAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNAMAActionPerformed(evt);
            }
        });

        jLabel4.setText("Jurusan");

        txJUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txJURActionPerformed(evt);
            }
        });

        jLabel5.setText("Alamat");

        txALAMAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txALAMATActionPerformed(evt);
            }
        });

        tblmhs.setModel(new javax.swing.table.DefaultTableModel(
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
        tblmhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblmhs);

        cHAPUS.setText("Hapus");
        cHAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cHAPUSActionPerformed(evt);
            }
        });

        cUBAH.setText("Ubah");
        cUBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUBAHActionPerformed(evt);
            }
        });

        cBARU.setText("Baru");
        cBARU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cBARUMouseClicked(evt);
            }
        });
        cBARU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBARUActionPerformed(evt);
            }
        });

        cTUTUP.setText("Tutup");
        cTUTUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTUTUPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(txNAMA, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(txALAMAT, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addComponent(txNIM)
                                .addComponent(txJUR))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cBARU)
                                .addGap(18, 18, 18)
                                .addComponent(cUBAH)
                                .addGap(18, 18, 18)
                                .addComponent(cHAPUS)
                                .addGap(18, 18, 18)
                                .addComponent(cTUTUP)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txJUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txALAMAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cBARU)
                            .addComponent(cUBAH)
                            .addComponent(cHAPUS)
                            .addComponent(cTUTUP))))
                .addGap(240, 240, 240))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txJURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txJURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txJURActionPerformed

    private void txALAMATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txALAMATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txALAMATActionPerformed

    private void txNAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNAMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNAMAActionPerformed

    private void txNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNIMActionPerformed

    private void cHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cHAPUSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cHAPUSActionPerformed

    private void cUBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cUBAHActionPerformed
        if(cUBAH.getText().equals("Uvah")){
        clearform();
        cUBAH.setText("Simpan");
        }else{
        cUBAH.setText("Ubah");
        }
    }//GEN-LAST:event_cUBAHActionPerformed

    private void cBARUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBARUActionPerformed
        
        if(cBARU.getText().equals("Baru")){
        clearform();
        cBARU.setText("Simpan");
        cTUTUP.setText("Batal");
        cUBAH.setEnabled(false);
        cHAPUS.setEnabled(false);
        }else{
        cBARU.setText("Baru");
        cTUTUP.setText("Tutup");
        cUBAH.setEnabled(true);
        cHAPUS.setEnabled(true);
        }
    }//GEN-LAST:event_cBARUActionPerformed

    private void cTUTUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTUTUPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTUTUPActionPerformed

    private void tblmhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmhsMouseClicked
        // TODO add your handling code here:
        txNIM.setText( tblmhs.getValueAt(tblmhs.getSelectedRow(), 0).toString());
        txNAMA.setText( tblmhs.getValueAt(tblmhs.getSelectedRow(), 1).toString());
        txJUR.setText( tblmhs.getValueAt(tblmhs.getSelectedRow(), 2).toString());
        txALAMAT.setText( tblmhs.getValueAt(tblmhs.getSelectedRow(), 3).toString());
        
    }//GEN-LAST:event_tblmhsMouseClicked

    private void cBARUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cBARUMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cBARUMouseClicked

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
            java.util.logging.Logger.getLogger(fMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new fMahasiswa().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(fMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cBARU;
    private javax.swing.JButton cHAPUS;
    private javax.swing.JButton cTUTUP;
    private javax.swing.JButton cUBAH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblmhs;
    private javax.swing.JTextField txALAMAT;
    private javax.swing.JTextField txJUR;
    private javax.swing.JTextField txNAMA;
    private javax.swing.JTextField txNIM;
    // End of variables declaration//GEN-END:variables

    private void lsdtmhs() throws SQLException {
        Connection cnn = koneksi();
        
        if( !cnn.isClosed()){
        
            PreparedStatement PS = cnn.prepareStatement("SELECT * FROM mhs;");
            ResultSet RS = PS.executeQuery();
            while ( RS.next()){
                Object[] dtmhs = new Object[4];
                    dtmhs[0] = RS.getString("NIM");
                    dtmhs[1] = RS.getString("NAMA");
                    dtmhs[2] = RS.getString("JURUSAN");
                    dtmhs[3] = RS.getString("ALAMAT");


                    DTM.addRow(dtmhs);

            }      
        }
    }
    
    private void clearform(){
        txNIM.setText("");
        txNAMA.setText("");
        txJUR.setText("");
        txALAMAT.setText("");
    }
}
