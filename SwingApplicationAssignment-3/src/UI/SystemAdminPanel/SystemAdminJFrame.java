/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminPanel;

import System.ApplicationSystem;
import System.Branch;
import System.UserAccount;
import UI.MainJFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 91730
 */

public class SystemAdminJFrame extends javax.swing.JFrame {

    DefaultTableModel viewTableModel;
    private ApplicationSystem applicationsystem;
    private Branch branch;
    private UserAccount useraccount;
    public SystemAdminJFrame() {
        initComponents();
    }

    public SystemAdminJFrame(ApplicationSystem applicationsystem, Branch branch, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.applicationsystem = applicationsystem;
        this.branch = branch;
        this.useraccount = useraccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        btnBranch = new javax.swing.JButton();
        btnLibrarian = new javax.swing.JButton();
        btnBranchManager = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        txtLogOut = new javax.swing.JButton();
        displayJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlJPanel.setBackground(new java.awt.Color(0, 255, 204));
        controlJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBranch.setText("Create Branch");
        btnBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBranchActionPerformed(evt);
            }
        });
        controlJPanel.add(btnBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 140, 20));

        btnLibrarian.setText("Add Librarian");
        btnLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrarianActionPerformed(evt);
            }
        });
        controlJPanel.add(btnLibrarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 20));

        btnBranchManager.setText("Add Branch Manager");
        btnBranchManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBranchManagerActionPerformed(evt);
            }
        });
        controlJPanel.add(btnBranchManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 140, 20));

        btnCustomer.setText("Add Customer");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });
        controlJPanel.add(btnCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, -1));

        txtLogOut.setText("Logout");
        txtLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogOutActionPerformed(evt);
            }
        });
        controlJPanel.add(txtLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 90, 20));

        jSplitPane1.setLeftComponent(controlJPanel);

        displayJPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout displayJPanelLayout = new javax.swing.GroupLayout(displayJPanel);
        displayJPanel.setLayout(displayJPanelLayout);
        displayJPanelLayout.setHorizontalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        displayJPanelLayout.setVerticalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(displayJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchActionPerformed
        // TODO add your handling code here:
        
        jSplitPane1.setRightComponent(new CreateBranchJPanel(this.applicationsystem,this.branch, this.useraccount));
    }//GEN-LAST:event_btnBranchActionPerformed

    private void btnBranchManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchManagerActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ManageBranchMJPanel(this.applicationsystem,this.branch, this.useraccount));
    }//GEN-LAST:event_btnBranchManagerActionPerformed

    private void btnLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrarianActionPerformed
        jSplitPane1.setRightComponent(new ManageLibrarian(this.applicationsystem,this.branch, this.useraccount)); // TODO add your handling code here:
    }//GEN-LAST:event_btnLibrarianActionPerformed

    private void txtLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainJFrame(this.applicationsystem,this.branch, this.useraccount);
    }//GEN-LAST:event_txtLogOutActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CustomerJPanel(this.applicationsystem,this.branch, this.useraccount));
        
    }//GEN-LAST:event_btnCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBranch;
    private javax.swing.JButton btnBranchManager;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnLibrarian;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton txtLogOut;
    // End of variables declaration//GEN-END:variables
}
