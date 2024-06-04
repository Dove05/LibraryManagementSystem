
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Transactions extends javax.swing.JFrame {
    private String loggedInAccountNumber;

    public Transactions(String accountNumber) {
        this.loggedInAccountNumber = accountNumber;
        initComponents();
        displayTransactions();
        displayDateTime();
         startTimer(); // Start the timer for continuous time update
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        deposit = new javax.swing.JButton();
        fundtransfer = new javax.swing.JButton();
        checkbalance = new javax.swing.JButton();
        transactions = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        timeanddate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 510, 270));

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

        timeanddate.setBackground(new java.awt.Color(255, 255, 255));
        timeanddate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        timeanddate.setForeground(new java.awt.Color(0, 0, 0));
        timeanddate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(timeanddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 490, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Transactions.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        // Open the CashDeposit
        new CashDeposit(this.loggedInAccountNumber).setVisible(true);
        dispose();
    }//GEN-LAST:event_depositActionPerformed

    private void fundtransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundtransferActionPerformed
        // Open FundTransfer frame and pass the ManageProfile object
        new FundTransfer(this.loggedInAccountNumber).setVisible(true);
        dispose();
    }//GEN-LAST:event_fundtransferActionPerformed

    private void checkbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbalanceActionPerformed
        new BalanceInquiry(this.loggedInAccountNumber).setVisible(true);
        dispose();
    }//GEN-LAST:event_checkbalanceActionPerformed

    private void transactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsActionPerformed
        new Transactions(this.loggedInAccountNumber).setVisible(true);
        dispose();
    }//GEN-LAST:event_transactionsActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        new WithDraw(this.loggedInAccountNumber).setVisible(true);
        dispose();
    }//GEN-LAST:event_withdrawActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      new LoginFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_exitActionPerformed


    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transactions("1234567890").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkbalance;
    private javax.swing.JButton deposit;
    private javax.swing.JButton exit;
    private javax.swing.JButton fundtransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel timeanddate;
    private javax.swing.JButton transactions;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables

private void displayTransactions() {
 try {
        // Define the file where user transactions are stored
        File userTransactionsFile = new File("usertransactions.csv");
        
        // Ensure that the file exists, otherwise create it
        if (!userTransactionsFile.exists()) {
            userTransactionsFile.createNewFile();
        }
        
        // Create a reader for the user transactions file
        BufferedReader userTransactionsReader = new BufferedReader(new FileReader(userTransactionsFile));
        
        // Initialize a StringBuilder to store transaction information
        StringBuilder text = new StringBuilder();
        
        // Read user transactions
        String transactionLine;
        boolean firstRow = true; // Flag to skip the first row
        while ((transactionLine = userTransactionsReader.readLine()) != null) {
            if (firstRow) {
                firstRow = false;
                continue; // Skip the first row
            }
            String[] parts = transactionLine.split(",");
            if (parts.length >= 4 && parts[0].equals(loggedInAccountNumber)) {
                String transactionType;
                if (parts[3].equals("DEPOSIT")) {
                    transactionType = "Deposit";
                } else if (parts[3].equals("WITHDRAW")) {
                    transactionType = "Withdraw";
                } else if (parts[3].equals("FUND TRANSFER")) {
                    transactionType = "Fund Transfer";
                } else {
                    transactionType = "Unknown";
                }
                text.append(transactionType).append(": ").append(parts[2]).append("\n");
            }
        }
        
        // Close the reader
        userTransactionsReader.close();
        
        // Set the text to the JTextArea to display transactions
        jTextArea1.setText(text.toString());
    } catch (Exception e) {
        // Handle exceptions
        JOptionPane.showMessageDialog(null, "Error occurred while reading transactions file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
    }}