
import java.awt.image.BufferedImage;
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
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class EditProfile extends javax.swing.JFrame {

    // Declare a variable holding the account number requesting for editing information
    String accountNumber;
   
    
    public EditProfile(String number) {
        initComponents();
        displayDateTime();
         startTimer(); // Start the timer for continuous time update
        // Initialize the variable holding the account number
        accountNumber = number;

        // displays the account details
        displayAccountDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Fullname = new javax.swing.JTextField();
        month = new javax.swing.JSpinner();
        day = new javax.swing.JSpinner();
        year = new javax.swing.JSpinner();
        email = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        fundtransfer = new javax.swing.JButton();
        checkbalance = new javax.swing.JButton();
        transactions = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        timeanddate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullnameActionPerformed(evt);
            }
        });
        getContentPane().add(Fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 350, 30));

        month.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthMouseClicked(evt);
            }
        });
        getContentPane().add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 80, 20));
        getContentPane().add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 80, -1));
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 80, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 350, 30));
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 350, 30));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 350, 30));

        updateBtn.setBorderPainted(false);
        updateBtn.setContentAreaFilled(false);
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateBtnMousePressed(evt);
            }
        });
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 110, 30));

        deposit.setBackground(new java.awt.Color(255, 255, 255));
        deposit.setBorderPainted(false);
        deposit.setContentAreaFilled(false);
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });
        getContentPane().add(deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 90, 100));

        fundtransfer.setBackground(new java.awt.Color(255, 255, 255));
        fundtransfer.setBorderPainted(false);
        fundtransfer.setContentAreaFilled(false);
        fundtransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundtransferActionPerformed(evt);
            }
        });
        getContentPane().add(fundtransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 130, 100));

        checkbalance.setBackground(new java.awt.Color(255, 255, 255));
        checkbalance.setBorderPainted(false);
        checkbalance.setContentAreaFilled(false);
        checkbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbalanceActionPerformed(evt);
            }
        });
        getContentPane().add(checkbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 130, 100));

        transactions.setBackground(new java.awt.Color(255, 255, 255));
        transactions.setBorderPainted(false);
        transactions.setContentAreaFilled(false);
        transactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsActionPerformed(evt);
            }
        });
        getContentPane().add(transactions, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 130, 100));

        withdraw.setBackground(new java.awt.Color(255, 255, 255));
        withdraw.setBorderPainted(false);
        withdraw.setContentAreaFilled(false);
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });
        getContentPane().add(withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 180, 40));

        cancel.setBorderPainted(false);
        cancel.setContentAreaFilled(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 100, 30));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EditProfile.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public void displayAccountDetails() {
        
        // fetch the initial data
        String initialName = "";
        Integer initialMonth = 0;
        Integer initialDay = 0;
        Integer initialYear = 0;
        String initialEmail = "";
        String initialPhone = "";
        String initialAddress = "";
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("accounts.csv"));
            String line;
            
            while ((line = reader.readLine())!=null) {
                String[] accountDetails = line.split(",");
                
                if (accountDetails[0].equals(accountNumber)) {
                    Fullname.setText(accountDetails[1]);
                    month.setValue(Integer.valueOf(accountDetails[5].split("/")[0]));
                    day.setValue(Integer.valueOf(accountDetails[5].split("/")[1]));
                    year.setValue(Integer.valueOf(accountDetails[5].split("/")[2]));
                    email.setText(accountDetails[2]);
                    phone.setText(accountDetails[3]);
                    address.setText(accountDetails[4]);
                }
            }
        } 
        catch (FileNotFoundException ex) {
        Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void FullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullnameActionPerformed

    }//GEN-LAST:event_FullnameActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtnActionPerformed

    private void updateBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMousePressed
        // fetch the input
        String newName = Fullname.getText();
        String newMonth = String.valueOf(month.getValue());
        String newDay = String.valueOf(day.getValue());
        String newYear = String.valueOf(year.getValue());
        String newEmail = email.getText();
        String newPhone = phone.getText();  
        String newAddress = address.getText();
        
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
                        accountDetails[7],
                        "APPROVED"));
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
                    writer.append(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                            accountDetails[0],
                            newName,
                            newEmail,
                            newPhone,
                            newAddress,
                            String.format("%s/%s/%s", newMonth, newDay, newYear),
                           accountDetails[6],
                            accountDetails[7]));
                }
            }
            
            reader.close();
            writer.close();
            
              // Show success message
        JOptionPane.showMessageDialog(this, "Changes saved successfully.");
        } 
        catch (FileNotFoundException ex) {
        Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_updateBtnMousePressed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        // Open the CashDeposit
        new CashDeposit(accountNumber).setVisible(true);
        dispose();
    }//GEN-LAST:event_depositActionPerformed

    private void fundtransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundtransferActionPerformed
        // Open FundTransfer frame and pass the ManageProfile object
        new FundTransfer(accountNumber).setVisible(true);
        dispose();
    }//GEN-LAST:event_fundtransferActionPerformed

    private void checkbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbalanceActionPerformed
        new BalanceInquiry(accountNumber).setVisible(true);
        dispose();
    }//GEN-LAST:event_checkbalanceActionPerformed

    private void transactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsActionPerformed
        new Transactions(accountNumber).setVisible(true);
        dispose();
    }//GEN-LAST:event_transactionsActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        new WithDraw(accountNumber).setVisible(true);
        dispose();
    }//GEN-LAST:event_withdrawActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        new ManageProfile(accountNumber).setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        new LoginFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void monthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_monthMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfile(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fullname;
    private javax.swing.JTextField address;
    private javax.swing.JButton cancel;
    private javax.swing.JButton checkbalance;
    private javax.swing.JSpinner day;
    private javax.swing.JButton deposit;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JButton fundtransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JSpinner month;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel timeanddate;
    private javax.swing.JButton transactions;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton withdraw;
    private javax.swing.JSpinner year;
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
