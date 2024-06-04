
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;


public class ManageProfile extends javax.swing.JFrame {

    
    private String accountNumber; // Declare accountNumber variable

    public ManageProfile(String accountNumber) {
        this.accountNumber = accountNumber;
        initComponents();
         displayDateTime();
         startTimer(); // Start the timer for continuous time update
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timeanddate = new javax.swing.JLabel();
        changepin = new javax.swing.JButton();
        updateProfilebtn = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        fundtransfer = new javax.swing.JButton();
        checkbalance = new javax.swing.JButton();
        transactions = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeanddate.setBackground(new java.awt.Color(255, 255, 255));
        timeanddate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        timeanddate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(timeanddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 490, 50));

        changepin.setBorderPainted(false);
        changepin.setContentAreaFilled(false);
        changepin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                changepinMousePressed(evt);
            }
        });
        changepin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepinActionPerformed(evt);
            }
        });
        getContentPane().add(changepin, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 160, 40));

        updateProfilebtn.setBorderPainted(false);
        updateProfilebtn.setContentAreaFilled(false);
        updateProfilebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateProfilebtnMousePressed(evt);
            }
        });
        getContentPane().add(updateProfilebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 160, 40));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Account.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateProfilebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateProfilebtnMousePressed
        // TODO add your handling code here:
        dispose();
        new EditProfile(this.accountNumber).setVisible(true);
    }//GEN-LAST:event_updateProfilebtnMousePressed

    private void changepinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepinMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_changepinMousePressed

    private void changepinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepinActionPerformed
       new ChangePin(accountNumber).setVisible(true);
        dispose();
    }//GEN-LAST:event_changepinActionPerformed

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

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        new LoginFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_exitActionPerformed
private void openManageProfile(String accountNumber) {
    // Open the ManageProfile frame and pass the account number
    ManageProfile manageProfile = new ManageProfile(accountNumber);
    manageProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    manageProfile.setVisible(true);
    dispose(); // Close the current frame
}
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProfile("1234567890").setVisible(true);
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
private void openBalanceInquiry(String accountNumber){
   // Open BalanceInquiry frame and pass the account number
        BalanceInquiry balanceInquiry = new BalanceInquiry(accountNumber);
        balanceInquiry.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        balanceInquiry.setVisible(true);
        dispose(); // Close the current frame
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
    private javax.swing.JButton changepin;
    private javax.swing.JButton checkbalance;
    private javax.swing.JButton deposit;
    private javax.swing.JButton exit;
    private javax.swing.JButton fundtransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel timeanddate;
    private javax.swing.JButton transactions;
    private javax.swing.JButton updateProfilebtn;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables

  // Getter method for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }


 // Method to get the current user's balance
    public double getCurrentUserBalance() {
         double balance = 0.0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("transactions.csv"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2 && parts[0].equals(accountNumber)) {
                    balance = Double.parseDouble(parts[1]);
                    break;
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return balance;
    }
  private void openFundTransfer() {
    // Pass the account number to the FundTransfer constructor
    FundTransfer fundTransfer = new FundTransfer(accountNumber);
    fundTransfer.setVisible(true);
    dispose(); // Close the current frame
}
    // Method to fetch the current user's balance from the database (dummy implementation)
    private double getCurrentUserBalanceFromDatabase() {
        // Logic to fetch the balance from the database based on the accountNumber
        // For now, let's return a dummy balance of 1000.0
        return 1000.0;
    }

    // Method to update the current user's balance in the database (dummy implementation)
    private boolean updateBalanceInDatabase(double amount) {
        // Logic to update the balance in the database based on the accountNumber
        // For now, let's return true to indicate that the balance was updated successfully
        return true;
    }
 // Method to update the user's balance in the CSV file
    public boolean updateBalance(double amount) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("transactions.csv"));
            ArrayList<String> lines = new ArrayList<>();
            String line;
            boolean isUpdated = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2 && parts[0].equals(accountNumber)) {
                    double balance = Double.parseDouble(parts[1]);
                    balance += amount;
                    parts[1] = String.valueOf(balance);
                    line = String.join(",", parts);
                    isUpdated = true;
                }
                lines.add(line);
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv"));
            for (String updatedLine : lines) {
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
}