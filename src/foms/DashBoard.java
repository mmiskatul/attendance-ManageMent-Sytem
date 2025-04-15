package foms;

import java.awt.Color;
import javax.swing.BorderFactory;
import utility.DBUtility;

/**
 *
 * @author user
 */
public class DashBoard extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public DashBoard() {
        initComponents();
        DBUtility.SetImage(this, "/utility/images/A.jpg", 1024, 600);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.YELLOW));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegisterUser = new javax.swing.JButton();
        btnviewuser = new javax.swing.JButton();
        btnupdateuser = new javax.swing.JButton();
        btngenerateqr = new javax.swing.JButton();
        btnviewqrs = new javax.swing.JButton();
        btnmarkattendance = new javax.swing.JButton();
        btndeleteuser = new javax.swing.JButton();
        btnviewattendance = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);

        btnRegisterUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegisterUser.setText("Register User");
        btnRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterUserActionPerformed(evt);
            }
        });

        btnviewuser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnviewuser.setText("View User");
        btnviewuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewuserActionPerformed(evt);
            }
        });

        btnupdateuser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnupdateuser.setText("Update User");
        btnupdateuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateuserActionPerformed(evt);
            }
        });

        btngenerateqr.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btngenerateqr.setText("Generate QR");
        btngenerateqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateqrActionPerformed(evt);
            }
        });

        btnviewqrs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnviewqrs.setText("View QRS");
        btnviewqrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewqrsActionPerformed(evt);
            }
        });

        btnmarkattendance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnmarkattendance.setText("Mark Attendance");
        btnmarkattendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmarkattendanceActionPerformed(evt);
            }
        });

        btndeleteuser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndeleteuser.setText("Delete User");
        btndeleteuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteuserActionPerformed(evt);
            }
        });

        btnviewattendance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnviewattendance.setText("View Attendance");
        btnviewattendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewattendanceActionPerformed(evt);
            }
        });

        btnExit1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit1.setText("X");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnviewuser)
                .addGap(18, 18, 18)
                .addComponent(btnupdateuser)
                .addGap(34, 34, 34)
                .addComponent(btndeleteuser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btngenerateqr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnviewqrs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmarkattendance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnviewattendance)
                .addGap(19, 19, 19)
                .addComponent(btnExit1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnviewuser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdateuser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndeleteuser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngenerateqr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnviewqrs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmarkattendance, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnviewattendance, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(551, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnExit1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterUserActionPerformed
        DBUtility.openForm(UserRegistration.class.getSimpleName(), new UserRegistration());
    }//GEN-LAST:event_btnRegisterUserActionPerformed

    private void btnviewuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewuserActionPerformed
        DBUtility.openForm(ViewUser.class.getSimpleName(), new ViewUser());
    }//GEN-LAST:event_btnviewuserActionPerformed

    private void btnupdateuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateuserActionPerformed
        DBUtility.openForm(UpdateUser.class.getSimpleName(), new UpdateUser());
    }//GEN-LAST:event_btnupdateuserActionPerformed

    private void btngenerateqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateqrActionPerformed
       DBUtility.openForm(GenerateQR.class.getSimpleName(),new GenerateQR());
    }//GEN-LAST:event_btngenerateqrActionPerformed

    private void btnviewqrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewqrsActionPerformed
        DBUtility.openForm(ViewQR.class.getSimpleName(),new ViewQR());
    }//GEN-LAST:event_btnviewqrsActionPerformed

    private void btnmarkattendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmarkattendanceActionPerformed
//       DBUtility.openForm(Markattendance.class.getSimpleName(),new MarkAttendance());
    }//GEN-LAST:event_btnmarkattendanceActionPerformed

    private void btndeleteuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteuserActionPerformed
        DBUtility.openForm(DeleteUser.class.getSimpleName(), new DeleteUser());
    }//GEN-LAST:event_btndeleteuserActionPerformed

    private void btnviewattendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewattendanceActionPerformed
       DBUtility.openForm(ViewAttandance.class.getSimpleName(),new  ViewAttandance());
    }//GEN-LAST:event_btnviewattendanceActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExit1ActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnRegisterUser;
    private javax.swing.JButton btndeleteuser;
    private javax.swing.JButton btngenerateqr;
    private javax.swing.JButton btnmarkattendance;
    private javax.swing.JButton btnupdateuser;
    private javax.swing.JButton btnviewattendance;
    private javax.swing.JButton btnviewqrs;
    private javax.swing.JButton btnviewuser;
    // End of variables declaration//GEN-END:variables

    private static class Markattendance {

        public Markattendance() {
        }
    }
}
