/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.Librarian;

import Employee.Employee;
import Employee.EmployeeDirectory;
import Library.Library;
import Material.Book;
import Material.BookDirectory;
import Material.General;
import Material.Magazine;
import Rental.Rent;
import Role.LibrarianRole;
import Role.Role;
import Role.SystemAdminRole;
import System.ApplicationSystem;
import System.Branch;
import System.UserAccount;
import System.UserAccountDirectory;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 91730
 */
public class AddMagazineJPanel extends javax.swing.JPanel {

    private ApplicationSystem applicationsystem;
    private Branch branch;
    private UserAccount useraccount;
    DefaultTableModel viewTableModel;
    /** Creates new form CreateBranchJPanel */

    
    public AddMagazineJPanel() {
        initComponents();

    }

    public AddMagazineJPanel(ApplicationSystem applicationsystem, Branch branch, UserAccount useraccount) {
        initComponents();
        this.viewTableModel = (DefaultTableModel) tableBookTable.getModel();  
        this.applicationsystem = applicationsystem;
        this.branch = branch;
        this.useraccount = useraccount;
        displayMag();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBookAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBookTable = new javax.swing.JTable();
        txtCompanyName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboBoxRentDuration = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtRentPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        comboBoxAvailable = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        comboBoxIssueType = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Company Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, 40));

        btnBookAdd.setText("Add");
        btnBookAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAddActionPerformed(evt);
            }
        });
        add(btnBookAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 100, 20));

        tableBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Company Name", "issue type", "Date", "Available", "Rent Price", "Rent Duration", "Serial Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBookTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 650, 240));

        txtCompanyName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCompanyNameFocusLost(evt);
            }
        });
        txtCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyNameActionPerformed(evt);
            }
        });
        add(txtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 140, 30));

        jLabel8.setText("Issue Type");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 120, 40));

        comboBoxRentDuration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "one week", "two week", "three week" }));
        add(comboBoxRentDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 140, 30));

        jLabel6.setText("Rental Rate");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 130, 40));

        txtRentPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRentPriceFocusLost(evt);
            }
        });
        add(txtRentPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 140, 30));

        jLabel9.setText("Registered Date");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, 40));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 140, 30));

        jLabel10.setText("Can be obtained?");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 130, 40));

        comboBoxAvailable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        add(comboBoxAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 140, 30));

        jLabel11.setText("Rental Period");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 130, 40));

        comboBoxIssueType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "weekly", "fortnightly" }));
        add(comboBoxIssueType, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 140, 30));

        jLabel13.setText("Serial Number");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 130, 40));

        txtSerialNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSerialNumberFocusLost(evt);
            }
        });
        add(txtSerialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 140, 30));

        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Add Magazine");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAddActionPerformed

          String bookName = txtCompanyName.getText();
      
          String issueType = (String) comboBoxIssueType.getSelectedItem();
          Date dateValue = jDateChooser1.getDate();
          String isAvailable =  (String) comboBoxAvailable.getSelectedItem();
          Boolean isAvailableValue;
          if(isAvailable == "Yes")
          {
              isAvailableValue = true;
          }
          else {
              isAvailableValue = false;
          }
          
          //Rent information
          String rentPrice = txtRentPrice.getText();
          String rentDuration = (String) comboBoxRentDuration.getSelectedItem();
          String serialNumber = txtSerialNumber.getText();
          
          
          Library lib = this.branch.getLib();
          Magazine mag = new Magazine();
          General magList = lib.getGeneralList();
          
          mag.setMaterialName(bookName);

          mag.setIssueType(issueType);
          mag.setRegisteredDate(dateValue);
          mag.setIsAvailableFlag(isAvailableValue);
          mag.setLocation(this.useraccount.getAccessTo());
          Rent rt = mag.getRt();
          rt.setRentDuration(rentDuration);
          rt.setRentPrice(Double.valueOf(rentPrice));
          rt.setSerialNumber(Long.valueOf(serialNumber));
          rt.setStatus("Available");
          
  
          
          mag.setRt(rt);
          
          magList.getMagazineCollection().add(mag);
          
          lib.setGeneralList(magList);
          

         
          
          this.applicationsystem.AddMagazineToBranch(this.branch.getName(), lib);

          JOptionPane.showMessageDialog(null, "Magazine Added");

          
          displayMag();
          
          
       
          
          
    }//GEN-LAST:event_btnBookAddActionPerformed

    private void txtCompanyNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCompanyNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyNameFocusLost

    private void txtCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyNameActionPerformed

    private void txtRentPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRentPriceFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRentPriceFocusLost

    private void txtSerialNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSerialNumberFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumberFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookAdd;
    private javax.swing.JComboBox<String> comboBoxAvailable;
    private javax.swing.JComboBox<String> comboBoxIssueType;
    private javax.swing.JComboBox<String> comboBoxRentDuration;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBookTable;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtRentPrice;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables



    private void displayMag(){
        viewTableModel.setRowCount(0);
//        ArrayList<Branch> br = this.applicationsystem.getBranches();
       
          
          Library lib = this.branch.getLib();
          ArrayList<Magazine> magList = lib.getGeneralList().getMagazineCollection();
          
        
//        String branchNameFunc = fetchBranchName();
          for(int i =0;i< magList.size();i++ ){
               Object row[] = new Object[11];
               if(magList.get(i).getLocation().equals(useraccount.getAccessTo()))
               {
                     row[0] = magList.get(i).getMaterialName();
                     row[1] = magList.get(i).getIssueType();
                     row[2] = String.valueOf(magList.get(i).getRegisteredDate());
                     row[3] = magList.get(i).getIsAvailableFlag();
                     row[4] = magList.get(i).getRt().getRentPrice();
                     row[5] = magList.get(i).getRt().getRentDuration();
                     row[6] = magList.get(i).getRt().getSerialNumber();
                    
                    viewTableModel.addRow(row);
               }
                  
             
              }    
          }
    }
    
 
     

