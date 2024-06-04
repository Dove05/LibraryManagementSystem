
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


public class Approval extends javax.swing.JFrame {

    DefaultTableModel ACCOUNTSFORAPPROVALDTM;
    
    
    
    
    public Approval() {
        initComponents();
        displayDateTime();
         startTimer(); // Start the timer for continuous time update
        ACCOUNTSFORAPPROVALDTM = (DefaultTableModel) ACCOUNTSFORAPPROVAL.getModel();
    displayAccountsForApprovals();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ACCOUNTSFORAPPROVAL = new javax.swing.JTable();
        clients = new javax.swing.JButton();
        decline = new javax.swing.JButton();
        accept = new javax.swing.JButton();
        approvals = new javax.swing.JButton();
        banktransac = new javax.swing.JButton();
        bankreserve = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        timeanddate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ACCOUNTSFORAPPROVAL.setBackground(new java.awt.Color(255, 255, 255));
        ACCOUNTSFORAPPROVAL.setForeground(new java.awt.Color(0, 0, 0));
        ACCOUNTSFORAPPROVAL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ACCOUNT NUMBER", "FULLNAME", "EMAIL", "PHONE", "ADDRESS", "BIRTHDAY"
            }
        ));
        jScrollPane1.setViewportView(ACCOUNTSFORAPPROVAL);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 950, 210));

        clients.setBorderPainted(false);
        clients.setContentAreaFilled(false);
        clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsActionPerformed(evt);
            }
        });
        getContentPane().add(clients, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 220, 100));

        decline.setBackground(new java.awt.Color(255, 255, 255));
        decline.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        decline.setForeground(new java.awt.Color(0, 0, 0));
        decline.setText("DECLINE");
        decline.setToolTipText("");
        decline.setBorder(new javax.swing.border.MatteBorder(null));
        decline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineActionPerformed(evt);
            }
        });
        getContentPane().add(decline, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 230, 50));

        accept.setBackground(new java.awt.Color(255, 255, 255));
        accept.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        accept.setForeground(new java.awt.Color(0, 0, 0));
        accept.setText("APPROVE");
        accept.setBorder(new javax.swing.border.MatteBorder(null));
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });
        getContentPane().add(accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 230, 50));

        approvals.setBorderPainted(false);
        approvals.setContentAreaFilled(false);
        approvals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvalsActionPerformed(evt);
            }
        });
        getContentPane().add(approvals, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 170, 100));

        banktransac.setBorderPainted(false);
        banktransac.setContentAreaFilled(false);
        banktransac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banktransacActionPerformed(evt);
            }
        });
        getContentPane().add(banktransac, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 170, 100));

        bankreserve.setBorderPainted(false);
        bankreserve.setContentAreaFilled(false);
        bankreserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankreserveActionPerformed(evt);
            }
        });
        getContentPane().add(bankreserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 170, 100));

        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 130, 110));

        timeanddate.setBackground(new java.awt.Color(255, 255, 255));
        timeanddate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        timeanddate.setForeground(new java.awt.Color(0, 0, 0));
        timeanddate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(timeanddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 490, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Approval (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
     
        String accountNumber = ACCOUNTSFORAPPROVALDTM.getValueAt(ACCOUNTSFORAPPROVAL.getSelectedRow(), 0).toString();

// transfer the file to a temporary file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("accounts.csv"));
            PrintWriter writer = new PrintWriter(new FileWriter("TemporaryFile.csv"));
            String line;
            
            while ((line = reader.readLine())!=null) {
                String[] accountDetails = line.split(",");
                
                writer.append(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                        accountDetails[0],
                        accountDetails[1],
                        accountDetails[2],
                        accountDetails[3],
                        accountDetails[4],
                        accountDetails[5],
                        accountDetails[6],
                        accountDetails[7]));
            }
            
            reader.close();
            writer.close();
        } 
        catch (FileNotFoundException ex) {
        Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // transfer the temporary file to original file 
        try {
            BufferedReader reader = new BufferedReader(new FileReader("TemporaryFile.csv"));
            PrintWriter writer = new PrintWriter(new FileWriter("accounts.csv"));
            String line;
            
            while ((line = reader.readLine())!=null) {
                String[] accountDetails = line.split(",");
                
                // Search for the account
                if (!accountDetails[0].equals(accountNumber)) {
                    writer.append(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                            accountDetails[0],
                            accountDetails[1],
                            accountDetails[2],
                            accountDetails[3],
                            accountDetails[4],
                            accountDetails[5],
                            accountDetails[6],
                            accountDetails[7]));
                }
                else {
                    // edit the specific account
                    writer.append(String.format("%s,%s,%s,%s,%s,%s,%s,APPROVED\n",
                            accountDetails[0],
                            accountDetails[1],
                            accountDetails[2],
                            accountDetails[3],
                            accountDetails[4],
                            accountDetails[5],
                            accountDetails[6]
                            ));
                }
            }
            
            reader.close();
            writer.close();
        } 
        catch (FileNotFoundException ex) {
        Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
         displayAccountsForApprovals();

    }//GEN-LAST:event_acceptActionPerformed

    private void declineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineActionPerformed
          String accountNumber = ACCOUNTSFORAPPROVALDTM.getValueAt(ACCOUNTSFORAPPROVAL.getSelectedRow(), 0).toString();

// transfer the file to a temporary file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("accounts.csv"));
            PrintWriter writer = new PrintWriter(new FileWriter("TemporaryFile.csv"));
            String line;
            
            while ((line = reader.readLine())!=null) {
                String[] accountDetails = line.split(",");
                
                writer.append(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                        accountDetails[0],
                        accountDetails[1],
                        accountDetails[2],
                        accountDetails[3],
                        accountDetails[4],
                        accountDetails[5],
                        accountDetails[6],
                        accountDetails[7]));
            }
            
            reader.close();
            writer.close();
        } 
        catch (FileNotFoundException ex) {
        Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // transfer the temporary file to original file 
        try {
            BufferedReader reader = new BufferedReader(new FileReader("TemporaryFile.csv"));
            PrintWriter writer = new PrintWriter(new FileWriter("accounts.csv"));
            String line;
            
            while ((line = reader.readLine())!=null) {
                String[] accountDetails = line.split(",");
                
                // Search for the account
                if (!accountDetails[0].equals(accountNumber)) {
                    writer.append(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                            accountDetails[0],
                            accountDetails[1],
                            accountDetails[2],
                            accountDetails[3],
                            accountDetails[4],
                            accountDetails[5],
                            accountDetails[6],
                            accountDetails[7]));
                }
                else {
                    // edit the specific account
                    writer.append(String.format("%s,%s,%s,%s,%s,%s,%s,DECLINED\n",
                            accountDetails[0],
                            accountDetails[1],
                            accountDetails[2],
                            accountDetails[3],
                            accountDetails[4],
                            accountDetails[5],
                            accountDetails[6]
                            ));
                }
            }
            
            reader.close();
            writer.close();
        } 
        catch (FileNotFoundException ex) {
        Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        displayAccountsForApprovals();
    }//GEN-LAST:event_declineActionPerformed

    private void bankreserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankreserveActionPerformed
        new BankReserve().setVisible(true);
        dispose();
    }//GEN-LAST:event_bankreserveActionPerformed

    private void banktransacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banktransacActionPerformed
   new BankTransactions().setVisible(true);
   dispose();
    }//GEN-LAST:event_banktransacActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        new AdminLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void approvalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvalsActionPerformed
       new Approval().setVisible(true);
        dispose();
    }//GEN-LAST:event_approvalsActionPerformed

    private void clientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientsActionPerformed
      new Clients().setVisible(true);
      dispose();
    }//GEN-LAST:event_clientsActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(Approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Approval().setVisible(true);
            }
        });
    }
    
    
public void displayAccountsForApprovals(){
    ACCOUNTSFORAPPROVALDTM.setRowCount(0);
    try {
            BufferedReader reader = new BufferedReader(new FileReader("accounts.csv"));
            String line;
            
            while ((line = reader.readLine())!=null) {
                String[] accountDetails = line.split(",");
                
                if (accountDetails[7].equals("FOR APPROVAL") ) {
                  
                    ACCOUNTSFORAPPROVALDTM.insertRow(ACCOUNTSFORAPPROVAL.getRowCount(), new Object[]{
                        accountDetails[0],
                        accountDetails[1],
                        accountDetails[2],
                        accountDetails[3],
                        accountDetails[4],
                        accountDetails[5],
                        accountDetails[7],
                        
                    });
                    
                }
            }
        } 
        catch (FileNotFoundException ex) {
        Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }


}

    

        
        
        
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ACCOUNTSFORAPPROVAL;
    private javax.swing.JButton accept;
    private javax.swing.JButton approvals;
    private javax.swing.JButton bankreserve;
    private javax.swing.JButton banktransac;
    private javax.swing.JButton clients;
    private javax.swing.JButton decline;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel timeanddate;
    // End of variables declaration//GEN-END:variables

  // Method to display the current date and time in the timeanddate label
    private void displayDateTime() {
        // Create a SimpleDateFormat object to format the date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        // Get the current date and time
        Date currentDate = new Date();
        // Format the current date and time
        String formattedDateTime = dateFormat.format(currentDate);
        // Set the formatted date and time to the timeanddate label
        timeanddate.setText(formattedDateTime);
    }

   
     // Method to start a timer to update the displayed time every second
    private void startTimer() {
        Timer timer = new Timer(1000, (e) -> {
            displayDateTime();
        });
        timer.start();
    }}
