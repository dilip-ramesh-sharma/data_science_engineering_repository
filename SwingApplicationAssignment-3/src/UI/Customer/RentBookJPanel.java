/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.Customer;

import BookDetails.Author;
import BookDetails.Genre;
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
public class RentBookJPanel extends javax.swing.JPanel {

    private ApplicationSystem applicationsystem;
    private Branch branch;
    private UserAccount useraccount;
    DefaultTableModel viewTableModel;
    
    public RentBookJPanel() {
        initComponents();

    }

    public RentBookJPanel(ApplicationSystem applicationsystem, Branch branch, UserAccount useraccount) {
        initComponents();
        this.viewTableModel = (DefaultTableModel) tableBookTable.getModel();  
        this.applicationsystem = applicationsystem;
        this.branch = branch;
        this.useraccount = useraccount;
        displayLocationDp();
        displayAuthorNameDp();
        displayGenreNameDp();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboLocation = new javax.swing.JComboBox<>();
        comboAuthorName = new javax.swing.JComboBox<>();
        comboGenre = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBookTable = new javax.swing.JTable();
        btnRent = new javax.swing.JButton();
        btnViewGenre = new javax.swing.JButton();
        btnViewLocation = new javax.swing.JButton();
        btnViewAuthor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboLocation.setBorder(null);
        comboLocation.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboLocationItemStateChanged(evt);
            }
        });
        comboLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboLocationKeyPressed(evt);
            }
        });
        add(comboLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 150, 30));

        comboAuthorName.setBorder(null);
        add(comboAuthorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 150, 30));

        comboGenre.setBorder(null);
        add(comboGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 150, 30));

        tableBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK NAME", "No. of Pages", "Languages", "Author", "Genre", "Type of Binding", "Date", "Available", "Rent Price", "Rent Duration", "Serial Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBookTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 840, 200));

        btnRent.setText("RENT");
        btnRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentActionPerformed(evt);
            }
        });
        add(btnRent, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 100, 20));

        btnViewGenre.setText("View");
        btnViewGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewGenreActionPerformed(evt);
            }
        });
        add(btnViewGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 70, -1));

        btnViewLocation.setText("View");
        btnViewLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLocationActionPerformed(evt);
            }
        });
        add(btnViewLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 70, 20));

        btnViewAuthor.setText("View");
        btnViewAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAuthorActionPerformed(evt);
            }
        });
        add(btnViewAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 70, 20));

        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Rent Book");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 70, -1));

        jLabel5.setText("Select Location");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel6.setText("Select Author");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel7.setText("Select Genre");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void comboLocationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboLocationKeyPressed
        // TODO add your handling code here:
       
        
        
        
    }//GEN-LAST:event_comboLocationKeyPressed

    private void comboLocationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboLocationItemStateChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_comboLocationItemStateChanged

    private void btnViewLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLocationActionPerformed
        // TODO add your handling code here:
         String location = (String) comboLocation.getSelectedItem();
        displayBookTableDetails(location);
    }//GEN-LAST:event_btnViewLocationActionPerformed

    private void btnRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableBookTable.getSelectedRow();
        if(selectedRow >= 0 ){
            String selectSerialNumber = tableBookTable.getValueAt(selectedRow, 10).toString();
            Library lib = this.branch.getLib();
             ArrayList<Book> bookcollection = lib.getBooklist().getBooklistCollection();
 
              for(int i =0;i< bookcollection.size();i++ ){
                  long serialNumber = bookcollection.get(i).getRt().getSerialNumber();
                  
               if( serialNumber == Long.valueOf(selectSerialNumber)  )
               {
                   Book bk= bookcollection.get(i);
                  Rent rt = bk.getRt();
                  rt.setBookRequested("SENT");
                  bk.setRt(rt);
                  this.applicationsystem.UpdateBookToBranch(bookcollection.get(i).getLocation(),bk);
                  this.applicationsystem.getCustomerList().updateCustomer(this.useraccount.getAccountId(), rt);
                  break;
               }
               
              }
               JOptionPane.showMessageDialog(null, "Rent Request Sent to Librarian");
              
        }
        
    }//GEN-LAST:event_btnRentActionPerformed

    private void btnViewGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewGenreActionPerformed
        // TODO add your handling code here:
  String GenreName = (String) comboGenre.getSelectedItem();
        displayGenreName(GenreName);
    }//GEN-LAST:event_btnViewGenreActionPerformed

    private void btnViewAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAuthorActionPerformed
        // TODO add your handling code here:  String location = (String) comboLocation.getSelectedItem();
          String AuthorName = (String) comboAuthorName.getSelectedItem();
         displayAuthorName(AuthorName);
    }//GEN-LAST:event_btnViewAuthorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRent;
    private javax.swing.JButton btnViewAuthor;
    private javax.swing.JButton btnViewGenre;
    private javax.swing.JButton btnViewLocation;
    private javax.swing.JComboBox<String> comboAuthorName;
    private javax.swing.JComboBox<String> comboGenre;
    private javax.swing.JComboBox<String> comboLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBookTable;
    // End of variables declaration//GEN-END:variables




    private void displayLocationDp() {
            comboLocation.removeAllItems();
         ArrayList<String> br = this.applicationsystem.getBranchName();
        for (int i = 0; i < br.size(); i++)
        {
            comboLocation.addItem(br.get(i));
        }
        
    }
    
    private void displayAuthorNameDp() {
            comboAuthorName.removeAllItems();
         ArrayList<Branch> br = this.applicationsystem.getBranches();
         ArrayList<String> displayAuthor = new ArrayList<String>() ;

        for (int i = 0; i < br.size(); i++)
        {
                ArrayList<Author> author = br.get(i).getLib().getAuthorCompleteList().getAuthorlist();
                
                    for(int j=0;j< author.size();j++){
                        displayAuthor.add(author.get(j).getAuthorName());
                    } 
        }
        
        
        int authorSize = displayAuthor.size();
        if(authorSize < 2){
            authorSize = 1;
        }else if(authorSize > 2) {
            authorSize = displayAuthor.size() / 2;
           
        }
        

         for(int j = 0 ;j < authorSize ;j++)
             {
                   comboAuthorName.addItem(displayAuthor.get(j));
             }
          
    }
    
        private void displayGenreNameDp() {
                comboGenre.removeAllItems();
         ArrayList<Branch> br = this.applicationsystem.getBranches();
         ArrayList<String> displayAuthor = new ArrayList<String>() ;

        for (int i = 0; i < br.size(); i++)
        {
                ArrayList<Genre> author = br.get(i).getLib().getGenreCompleteList().getGenrelist();
                
                    for(int j=0;j< author.size();j++){
                        displayAuthor.add(author.get(j).getGenreName());
                    } 
        }
        
        
        int authorSize = displayAuthor.size();
        if(authorSize < 2){
            authorSize = 1;
        }else if(authorSize > 2) {
            authorSize = displayAuthor.size() / 2;
           
        }
        
         for(int j = 0 ;j < authorSize ;j++)
             {
                   comboGenre.addItem(displayAuthor.get(j));
             }
            
    }

    private void displayBookTableDetails(String location) {
        
        System.out.println("Display book details in customer ");
        
        viewTableModel.setRowCount(0);
        Library lib = this.branch.getLib();
        ArrayList<Book> bookcollection = lib.getBooklist().getBooklistCollection();
        

          for(int i =0;i< bookcollection.size();i++ ){
              Object row[] = new Object[11];
              
               if(bookcollection.get(i).getLocation().equals(location) && bookcollection.get(i).getIsAvailableFlag()!= false)
               {
                   System.out.println("Inside display book function");
                     row[0] = bookcollection.get(i).getMaterialName();
                     row[1] = bookcollection.get(i).getNoOfPages();
                     row[2] = bookcollection.get(i).getLanguages();
                     row[3] = bookcollection.get(i).getAuthorName();
                     row[4] = bookcollection.get(i).getGenre();
                     
                     row[5] = bookcollection.get(i).getTypeOfBinding();
                     row[6] = String.valueOf(bookcollection.get(i).getRegisteredDate());
                     row[7] = bookcollection.get(i).getIsAvailableFlag();
                     row[8] = bookcollection.get(i).getRt().getRentPrice();
                     row[9] = bookcollection.get(i).getRt().getRentDuration();
                     row[10] = bookcollection.get(i).getRt().getSerialNumber();
                    
                    viewTableModel.addRow(row);
               }
               
              
                  
             
              }    
          }

    private void displayGenreName(String GenreName) {
         //To change body of generated methods, choose Tools | Templates.
          viewTableModel.setRowCount(0);
        Library lib = this.branch.getLib();
        ArrayList<Book> bookcollection = lib.getBooklist().getBooklistCollection();
        
        
          for(int i =0;i< bookcollection.size();i++ ){
              Object row[] = new Object[11];
              
               if(bookcollection.get(i).getGenre().equals(GenreName) && bookcollection.get(i).getIsAvailableFlag()!= false)
               {
                   System.out.println("Inside display book function");
                     row[0] = bookcollection.get(i).getMaterialName();
                     row[1] = bookcollection.get(i).getNoOfPages();
                     row[2] = bookcollection.get(i).getLanguages();
                     row[3] = bookcollection.get(i).getAuthorName();
                     row[4] = bookcollection.get(i).getGenre();
                     
                     row[5] = bookcollection.get(i).getTypeOfBinding();
                     row[6] = String.valueOf(bookcollection.get(i).getRegisteredDate());
                     row[7] = bookcollection.get(i).getIsAvailableFlag();
                     row[8] = bookcollection.get(i).getRt().getRentPrice();
                     row[9] = bookcollection.get(i).getRt().getRentDuration();
                     row[10] = bookcollection.get(i).getRt().getSerialNumber();
                    
                    viewTableModel.addRow(row);
               }
          }
              
                  
             
    }

    private void displayAuthorName(String AuthorName) {
         viewTableModel.setRowCount(0);
        Library lib = this.branch.getLib();
        ArrayList<Book> bookcollection = lib.getBooklist().getBooklistCollection();
        
        
          for(int i =0;i< bookcollection.size();i++ ){
              Object row[] = new Object[11];
              
               if(bookcollection.get(i).getAuthorName().equals(AuthorName) && bookcollection.get(i).getIsAvailableFlag()!= false)
               {
                   System.out.println("Inside display book function");
                     row[0] = bookcollection.get(i).getMaterialName();
                     row[1] = bookcollection.get(i).getNoOfPages();
                     row[2] = bookcollection.get(i).getLanguages();
                     row[3] = bookcollection.get(i).getAuthorName();
                     row[4] = bookcollection.get(i).getGenre();
                     
                     row[5] = bookcollection.get(i).getTypeOfBinding();
                     row[6] = String.valueOf(bookcollection.get(i).getRegisteredDate());
                     row[7] = bookcollection.get(i).getIsAvailableFlag();
                     row[8] = bookcollection.get(i).getRt().getRentPrice();
                     row[9] = bookcollection.get(i).getRt().getRentDuration();
                     row[10] = bookcollection.get(i).getRt().getSerialNumber();
                    
                    viewTableModel.addRow(row);
               }
               
              
                  
             
              }    
    }
    }