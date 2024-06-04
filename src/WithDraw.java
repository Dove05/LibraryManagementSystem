
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class WithDraw extends javax.swing.JFrame {

    private String accountNumber;
private long depositBalance;
    public WithDraw(String accountNumber) {
        this.accountNumber = accountNumber;
        initComponents();
         displayDateTime();
         startTimer(); // Start the timer for continuous time update
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exactamount = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        hundredbtn = new javax.swing.JButton();
        fivehundredbtn = new javax.swing.JButton();
        thousandbtn = new javax.swing.JButton();
        fivethousandbtn = new javax.swing.JButton();
        tenthousandbtn = new javax.swing.JButton();
        twentythousandbtn = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        timeanddate = new javax.swing.JLabel();
        deposit = new javax.swing.JButton();
        fundtransfer = new javax.swing.JButton();
        checkbalance = new javax.swing.JButton();
        transactions = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exactamount.setBackground(new java.awt.Color(255, 255, 255));
        exactamount.setForeground(new java.awt.Color(0, 0, 0));
        exactamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exactamountActionPerformed(evt);
            }
        });
        getContentPane().add(exactamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 290, 40));

        cancel.setBorderPainted(false);
        cancel.setContentAreaFilled(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 100, 40));

        hundredbtn.setBorderPainted(false);
        hundredbtn.setContentAreaFilled(false);
        hundredbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hundredbtnActionPerformed(evt);
            }
        });
        getContentPane().add(hundredbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 140, 60));

        fivehundredbtn.setBorderPainted(false);
        fivehundredbtn.setContentAreaFilled(false);
        fivehundredbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivehundredbtnActionPerformed(evt);
            }
        });
        getContentPane().add(fivehundredbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 140, 60));

        thousandbtn.setBorderPainted(false);
        thousandbtn.setContentAreaFilled(false);
        thousandbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thousandbtnActionPerformed(evt);
            }
        });
        getContentPane().add(thousandbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 140, 60));

        fivethousandbtn.setBorderPainted(false);
        fivethousandbtn.setContentAreaFilled(false);
        fivethousandbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivethousandbtnActionPerformed(evt);
            }
        });
        getContentPane().add(fivethousandbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 140, 60));

        tenthousandbtn.setBorderPainted(false);
        tenthousandbtn.setContentAreaFilled(false);
        tenthousandbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenthousandbtnActionPerformed(evt);
            }
        });
        getContentPane().add(tenthousandbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 140, 60));

        twentythousandbtn.setBorderPainted(false);
        twentythousandbtn.setContentAreaFilled(false);
        twentythousandbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twentythousandbtnActionPerformed(evt);
            }
        });
        getContentPane().add(twentythousandbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 140, 60));

        confirm.setBorderPainted(false);
        confirm.setContentAreaFilled(false);
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 100, 40));

        timeanddate.setBackground(new java.awt.Color(255, 255, 255));
        timeanddate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        timeanddate.setForeground(new java.awt.Color(0, 0, 0));
        timeanddate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(timeanddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 490, 50));

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

        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 130, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Withdraw.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exactamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exactamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exactamountActionPerformed

    private void hundredbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hundredbtnActionPerformed
        updateExactAmount(100);
    }//GEN-LAST:event_hundredbtnActionPerformed

    private void fivehundredbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivehundredbtnActionPerformed
        updateExactAmount(500);
    }//GEN-LAST:event_fivehundredbtnActionPerformed

    private void thousandbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thousandbtnActionPerformed
        updateExactAmount(1000);
    }//GEN-LAST:event_thousandbtnActionPerformed

    private void fivethousandbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivethousandbtnActionPerformed
        updateExactAmount(5000);
    }//GEN-LAST:event_fivethousandbtnActionPerformed

    private void tenthousandbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenthousandbtnActionPerformed
        updateExactAmount(10000);
    }//GEN-LAST:event_tenthousandbtnActionPerformed

    private void twentythousandbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twentythousandbtnActionPerformed
        updateExactAmount(20000);
    }//GEN-LAST:event_twentythousandbtnActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
    long currentAmount = readCurrentAmountFromCSV();

        String exactAmountText = exactamount.getText();
        if (!exactAmountText.isEmpty()) {
            try {
                long withdrawalAmount = Long.parseLong(exactAmountText);

                if (withdrawalAmount > 0 && withdrawalAmount <= currentAmount) {
                    currentAmount -= withdrawalAmount;

                    boolean success = writeAmountToCSV(currentAmount, accountNumber, withdrawalAmount, true);
                    if (success) {
                        JOptionPane.showMessageDialog(null, "Withdrawal successful!");
                        exactamount.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to update amount.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid withdrawal amount.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid integer amount.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a withdrawal amount.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
}
        private String readAccountNumberFromCSV() {
            String accountNumber = null;
            try {
                BufferedReader reader = new BufferedReader(new FileReader("accounts.csv"));
                String line;
                if ((line = reader.readLine()) != null) {
                    accountNumber = line.split(",")[0]; // Assuming account number is in the first column
                } else {
                    JOptionPane.showMessageDialog(null, "No data found in account.csv", "Error", JOptionPane.ERROR_MESSAGE);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error occurred while reading account.csv: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            return accountNumber;
        }
       private long readCurrentAmountFromCSV() {
       long currentAmount = 0;
    try {
        BufferedReader reader = new BufferedReader(new FileReader("transactions.csv"));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 2 && parts[0].equals(accountNumber)) {
                // Use Double.parseDouble() instead of Long.parseLong()
                currentAmount = (long) Double.parseDouble(parts[1]);
                break;
            }
        }

        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return currentAmount;
}

  private boolean writeAmountToCSV(long currentAmount, String accountNumber, long withdrawalAmount, boolean isWithdrawn) {
    try {
        
        // transfer the temporary file to original file 
        try {
            BufferedReader reader = new BufferedReader(new FileReader("TemporaryFile.csv"));
            PrintWriter writer = new PrintWriter(new FileWriter("transactions.csv"));
            String line;
            
            while ((line = reader.readLine())!=null) {
                String[] accountDetails = line.split(",");
                
                // Search for the account
                if (!accountDetails[0].equals("BANK")) {
                    writer.append(String.format("%s,%s\n",
                            accountDetails[0],
                            accountDetails[1]));
                }
                else {
                    // edit the specific account
                    writer.append(String.format("%s,%s\n",
                            accountDetails[0],
                            String.valueOf(Double.valueOf(accountDetails[1]) + Double.valueOf(exactamount.getText()))
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
        // Create the file path for transactions.csv
        String transactionFilePath = "transactions.csv";
        File transactionFile = new File(transactionFilePath);
        boolean found = false;

        if (!transactionFile.exists()) {
            transactionFile.createNewFile();
        }

        // Update transactions.csv with the new balance
        BufferedReader reader = new BufferedReader(new FileReader(transactionFile));
        String line;
        StringBuffer transactionBuffer = new StringBuffer();

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 2 && parts[0].equals(accountNumber)) {
                found = true;
                // Update the current amount for the account and mark it as withdrawn if needed
                transactionBuffer.append(accountNumber).append(",").append(currentAmount).append(",").append('\n');
            } else {
                transactionBuffer.append(line).append('\n');
            }
        }

        reader.close();
 
        // If the account was not found, append a new entry
        if (!found) {
            transactionBuffer.append(accountNumber).append(",").append(currentAmount).append(",").append(isWithdrawn ? "WITHDRAW" : "").append('\n');
        }

        BufferedWriter transactionWriter = new BufferedWriter(new FileWriter(transactionFile));
        transactionWriter.write(transactionBuffer.toString());
        transactionWriter.close();

        // Append the new withdrawal transaction to usertransactions.csv
        String userTransactionsFilePath = "usertransactions.csv";
        File userTransactionsFile = new File(userTransactionsFilePath);

        if (!userTransactionsFile.exists()) {
            userTransactionsFile.createNewFile();
        }

        BufferedWriter userTransactionsWriter = new BufferedWriter(new FileWriter(userTransactionsFile, true)); // Append mode
        userTransactionsWriter.write(accountNumber + "," + currentAmount + "," + withdrawalAmount + "," + (isWithdrawn ? "WITHDRAW" : "not withdrawn") + "\n");
        userTransactionsWriter.close();

        return true;
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error occurred while writing to CSV.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }


    }//GEN-LAST:event_confirmActionPerformed

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

    private void updateExactAmount(int amount) {
        String currentAmount = exactamount.getText();
        if (!currentAmount.isEmpty()) {
            try {
                int current = Integer.parseInt(currentAmount);
                current += amount;
                exactamount.setText(String.valueOf(current));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            exactamount.setText(String.valueOf(amount));
        }
    }

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WithDraw("1234567890").setVisible(true);
            }
        });
    }
private void openWithDraw(String accountNumber) {
        // Open the CashDeposit frame and pass the account number
        WithDraw WithDraw = new WithDraw(accountNumber);
        WithDraw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WithDraw.setVisible(true);
        dispose(); // Close the current frame
    }

    private void openCashDeposit(String accountNumber) {
        // Open the CashDeposit frame and pass the account number
        CashDeposit cashDeposit = new CashDeposit(accountNumber);
        cashDeposit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cashDeposit.setVisible(true);
        dispose(); // Close the current frame
    }
     private void updateTransactionForAccount(String accountNumber, long withdrawalAmount) {
    try {
        // Read the current amount from the CSV file
        long currentAmount = readCurrentAmountFromCSV();
        
        // Subtract the withdrawal amount from the current amount
        currentAmount -= withdrawalAmount;
        
        // Write the updated amount back to the CSV file
        boolean success = writeAmountToCSV(currentAmount, accountNumber, withdrawalAmount, true);
        
        if (success) {
            JOptionPane.showMessageDialog(null, "Withdrawal successful!");
            exactamount.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update amount.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Please enter a valid integer amount.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
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
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton checkbalance;
    private javax.swing.JButton confirm;
    private javax.swing.JButton deposit;
    private javax.swing.JTextField exactamount;
    private javax.swing.JButton exit;
    private javax.swing.JButton fivehundredbtn;
    private javax.swing.JButton fivethousandbtn;
    private javax.swing.JButton fundtransfer;
    private javax.swing.JButton hundredbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton tenthousandbtn;
    private javax.swing.JButton thousandbtn;
    private javax.swing.JLabel timeanddate;
    private javax.swing.JButton transactions;
    private javax.swing.JButton twentythousandbtn;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
 private boolean writeDepositBalanceToCashDeposit(long depositBalance) {
        // Implement writing the deposit balance to CashDeposit
        return false;
    }
 private void openFundTransfer() {
    // Open the FundTransfer frame and pass the account number
    FundTransfer fundTransfer = new FundTransfer(accountNumber);
    fundTransfer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fundTransfer.setVisible(true);
    dispose(); // Close the current frame
}
}
