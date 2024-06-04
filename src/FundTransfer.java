
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class FundTransfer extends javax.swing.JFrame {
  private static String accountNumber;
    private ManageProfile manageProfile;
    private ArrayList<String> accountNumbers = new ArrayList<>();

    public FundTransfer(ManageProfile manageProfile) {
        initComponents();
        this.manageProfile = manageProfile;
        populateComboBox(); // Populate the combo box
        displayDateTime();
         startTimer(); // Start the timer for continuous time update
    }

    public FundTransfer(String accountNumber) {
        initComponents();
        this.accountNumber = accountNumber;
        // Initialize the ManageProfile object with the provided account number
        this.manageProfile = new ManageProfile(accountNumber);
        populateComboBox(); // Populate the combo box
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Accounts = new javax.swing.JComboBox<>();
        actualamount = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        fundtransfer = new javax.swing.JButton();
        checkbalance = new javax.swing.JButton();
        transactions = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        timeanddate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Accounts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Accounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountsActionPerformed(evt);
            }
        });
        getContentPane().add(Accounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 290, 40));
        getContentPane().add(actualamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 290, 40));

        confirm.setBorderPainted(false);
        confirm.setContentAreaFilled(false);
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 100, 40));

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
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 110, 40));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FundTransfer.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountsActionPerformed

    }//GEN-LAST:event_AccountsActionPerformed
private boolean writeAmountToCSV(String accountNumber, double amount) {
    try {
        // Read the current balance from the transactions.csv file
        double currentBalance = readCurrentBalanceFromCSV(accountNumber);
        
        // Add the transfer amount to the current balance
        double newBalance = currentBalance + amount;

        // Open the file for appending
        BufferedWriter depositsMonitorWriter = new BufferedWriter(new FileWriter("usertransactions.csv", true));
        
        // Write the account number, new balance, transfer amount, and transfer type to the file
        depositsMonitorWriter.write(accountNumber + "," + newBalance + "," + amount + ",FUND TRANSFER\n");
        
        // Close the writer
        depositsMonitorWriter.close();

        return true; // Return true to indicate success
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error occurred while writing to usertransactions.csv.", "Error", JOptionPane.ERROR_MESSAGE);
        return false; // Return false to indicate failure
    }
}
    
    
    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
    // Get the selected account number
        String selectedAccount = (String) Accounts.getSelectedItem();
        // Get the amount to be transferred
        String amountText = actualamount.getText().trim(); // Trim to remove any leading or trailing spaces
        if (amountText.isEmpty()) {
            // Show an error message if no amount is entered
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter the amount to transfer.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return; // Exit the method
        }
        double amount;
        try {
            amount = Double.parseDouble(amountText);
        } catch (NumberFormatException e) {
            // Show an error message if the entered amount is not a valid number
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid amount entered. Please enter a valid number.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return; // Exit the method
        }

        // Check if the selected account is different from the current user's account
        if (!selectedAccount.equals(accountNumber)) {
            // Get the current user's account balance
            double currentUserBalance = manageProfile.getCurrentUserBalance();

            // Check if the current user has sufficient balance
            if (currentUserBalance >= amount) {
                // Deduct the amount from the current user's account
                boolean isTransferSuccessful = manageProfile.updateBalance(-amount); // Deduct from current user
                if (isTransferSuccessful) {
                    // Add the amount to the selected account
                    boolean isAddedToSelectedAccount = updateBalance(selectedAccount, amount);
                    if (isAddedToSelectedAccount) {
                        // Show a success message
                        javax.swing.JOptionPane.showMessageDialog(this, "Transfer successful.");
                    } else {
                        // Rollback the deducted amount from the current user's account if adding to the selected account failed
                        manageProfile.updateBalance(amount);
                        javax.swing.JOptionPane.showMessageDialog(this, "Transfer failed. Please try again.");
                    }
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Transfer failed. Please try again.");
                }
            } else {
                // Show an error message if the current user doesn't have sufficient balance
                javax.swing.JOptionPane.showMessageDialog(this, "Insufficient balance. Transfer failed.");
            }
        } else {
            // Show an error message if the selected account is the same as the current user's account
            javax.swing.JOptionPane.showMessageDialog(this, "Cannot transfer to the same account.");
        }

        // Add to deposit monitoring file
        File transferMonitorFile = new File("usertransactions.csv");
        boolean depositsMonitorFileFound = transferMonitorFile.exists();
        try {
            BufferedWriter depositsMonitorWriter = new BufferedWriter(new FileWriter(transferMonitorFile, true)); // Append to file
            double newBalance = manageProfile.getCurrentUserBalance() + amount;
            // Write account number, updated balance, transfer amount, and transfer type
            depositsMonitorWriter.write(accountNumber + "," + newBalance + "," + amount + ",FUND TRANSFER\n"); 
            depositsMonitorWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while writing to usertransactions.csv.", "Error", JOptionPane.ERROR_MESSAGE);
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

   
   
 
    private void populateComboBox() {
       try {
        BufferedReader reader = new BufferedReader(new FileReader("accounts.csv"));
        String line;
        boolean isFirstLine = true; // Flag to skip the first line
        while ((line = reader.readLine()) != null) {
            if (isFirstLine) {
                isFirstLine = false;
                continue; // Skip the first line
            }
            String[] parts = line.split(",");
            if (parts.length >= 8) { // Check if the line has at least 8 columns
                String accountNumber = parts[0];
                String status = parts[7]; // Assuming status is in the 8th column (index 7)
                if (status.equals("APPROVED")) {
                    // Add the account number to the ArrayList
                    accountNumbers.add(accountNumber);
                }
            }
        }
        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    // Clear existing items in the JComboBox
    Accounts.removeAllItems();
    // Add the account numbers from the ArrayList to the JComboBox
    for (String accountNumber : accountNumbers) {
        Accounts.addItem(accountNumber);
    }
    }

    private boolean updateBalance(String accountNumber, double amount) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("transactions.csv"));
            String line;
            ArrayList<String> updatedLines = new ArrayList<>();
            boolean isUpdated = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    String accNumber = parts[0];
                    if (accNumber.equals(accountNumber)) {
                        double balance = Double.parseDouble(parts[1]);
                        balance += amount;
                        // Convert the updated balance to string format
                        String updatedBalance = String.format("%.2f", balance);
                        // Update the line with the new balance
                        line = accNumber + "," + updatedBalance;
                        isUpdated = true;
                    }
                }
                updatedLines.add(line);
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv"));
            for (String updatedLine : updatedLines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();

            return isUpdated;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
 private void openFundTransfer() {
       // Open the FundTransfer frame and pass the ManageProfile object
        FundTransfer fundTransfer = new FundTransfer(manageProfile);
        fundTransfer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fundTransfer.setVisible(true);
        dispose(); // Close the current frame
    }
    private String getCurrentUserAccountNumber() {
        // For simplicity, let's assume the current user's account number is hardcoded
        return "current_user_account_number";
    
}
     // Method to display the current balance and account number in jLabel2


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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Accounts;
    private javax.swing.JTextField actualamount;
    private javax.swing.JButton cancel;
    private javax.swing.JButton checkbalance;
    private javax.swing.JButton confirm;
    private javax.swing.JButton deposit;
    private javax.swing.JButton exit;
    private javax.swing.JButton fundtransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel timeanddate;
    private javax.swing.JButton transactions;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables

    private void opencheckbalance() {
         // Open BalanceInquiry frame and pass the account number
        BalanceInquiry balanceInquiry = new BalanceInquiry(accountNumber);
        balanceInquiry.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        balanceInquiry.setVisible(true);
        dispose(); // Close the current frame
}

    private double readCurrentBalanceFromCSV(String accountNumber) {
       try {
        BufferedReader reader = new BufferedReader(new FileReader("transactions.csv"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 2) {
                String accNumber = parts[0];
                if (accNumber.equals(accountNumber)) {
                    // Parse and return the current balance
                    return Double.parseDouble(parts[1]);
                }
            }
        }
        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error occurred while reading transactions.csv: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    // Return 0 if the account number is not found or if an error occurs
    return 0;
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
    }}
