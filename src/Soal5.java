/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlifM
 */
public class Soal5 extends javax.swing.JFrame {

    /**
     * Creates new form Soal5
     */
    public Soal5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        emas = new javax.swing.JRadioButton();
        besi = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        perak = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        buttonGroup1.add(emas);
        emas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        emas.setText("Emas");
        getContentPane().add(emas);
        emas.setBounds(20, 120, 200, 30);

        buttonGroup1.add(besi);
        besi.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        besi.setText("Besi");
        besi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                besiActionPerformed(evt);
            }
        });
        getContentPane().add(besi);
        besi.setBounds(20, 180, 160, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("<html> \nLalu Anda keluar dari gubuk tersebut. Saat berjalan Anda melihat sejumlah kunci. <br> <br>\nTerbuat dari apakah kunci tersebut?\n\n</html>");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 50, 380, 60);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Lihat Hasilnya");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 230, 140, 30);

        buttonGroup1.add(perak);
        perak.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        perak.setText("Perak");
        perak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perakActionPerformed(evt);
            }
        });
        getContentPane().add(perak);
        perak.setBounds(20, 150, 140, 30);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("SOAL 5");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 120, 30);

        setBounds(500, 200, 416, 311);
    }// </editor-fold>//GEN-END:initComponents

    private void besiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_besiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_besiActionPerformed

    private void perakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perakActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String hasil5;

        if(emas.isSelected())
            hasil5 = "Berjiwa besar, penolong dan ramah.";
        else if(perak.isSelected())
            hasil5 = "Percaya diri dan kreatif.";
        else
            hasil5 = "Anda orang yang biasa-biasa saja.";

        new Hasil5(hasil5).setVisible(true);          
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Soal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soal5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton besi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton emas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton perak;
    // End of variables declaration//GEN-END:variables
}