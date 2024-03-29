/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.BranchManager;

import Customer.Customer;
import Employee.Employee;
import Employee.EmployeeDirectory;
import Library.Library;
import Material.Book;
import Material.BookDirectory;
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
public class ViewRentalJPanel extends javax.swing.JPanel {

    private ApplicationSystem applicationsystem;
    private Branch branch;
    private UserAccount useraccount;
    DefaultTableModel viewTableModel;

    
    public ViewRentalJPanel() {
        initComponents();

    }

    public ViewRentalJPanel(ApplicationSystem applicationsystem, Branch branch, UserAccount useraccount) {
        initComponents();
        this.viewTableModel = (DefaultTableModel) tableBookTable.getModel();  
        this.applicationsystem = applicationsystem;
        this.branch = branch;
        this.useraccount = useraccount;
        displayRentalTableDetails();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBookTable = new javax.swing.JTable();
        txtGenerateRevenue = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("RENTAL REQUEST IN LIBRARY");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 320, 20));

        tableBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "BookName", "Rent Price", "Rent Duration", "Serial Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBookTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 810, 150));
        add(txtGenerateRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 100, 30));

        jLabel2.setText("Revenue");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 50, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBookTable;
    private javax.swing.JTextField txtGenerateRevenue;
    // End of variables declaration//GEN-END:variables


    private void displayRentalTableDetails() {
        ArrayList<Customer> cust = this.applicationsystem.getCustomerList().getCustomerlist();
        ArrayList<String> rentArray = new ArrayList<String>();
        ArrayList<Double> rentArrayPrice = new ArrayList<Double>();
         ArrayList<String> custArray = new ArrayList<String>();
      for(int i =0; i< cust.size();i++){
            ArrayList<Rent> rt = cust.get(i).getRentlist();
          for(int j=0;j<rt.size();j++){
              rentArray.add(rt.get(j).getRentId());
              rentArrayPrice.add(rt.get(j).getRentPrice());
              custArray.add(cust.get(i).getCustomerName());
          }  
      }

      Library lib = this.branch.getLib();
        ArrayList<Book> bookcollection = lib.getBooklist().getBooklistCollection();
        
             for(int i =0;i< bookcollection.size();i++ ){
               if(bookcollection.get(i).getLocation().equals(useraccount.getAccessTo()))
               {
                   for(int j=0;j<rentArray.size();j++){
                   
                   if(rentArray.get(j) == bookcollection.get(i).getRt().getRentId() )
                   {
                     Object row[] = new Object[6];  
                     row[0] = custArray.get(j);
                     row[1] = bookcollection.get(i).getMaterialName();
                     row[2] = bookcollection.get(i).getRt().getRentPrice();
                     row[3] = bookcollection.get(i).getRt().getRentDuration();
                     row[4] = bookcollection.get(i).getRt().getSerialNumber();
                     viewTableModel.addRow(row);
                   }
                   }
               }
             }
             double sum=0;
             for(int i = 0;i < rentArrayPrice.size() ;i++){
                 sum = sum + rentArrayPrice.get(i);
                 
    
    }
             txtGenerateRevenue.setText(String.valueOf(sum));
    }
    
}