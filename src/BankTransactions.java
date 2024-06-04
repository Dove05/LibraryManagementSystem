import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class BankTransactions extends javax.swing.JFrame {

    public BankTransactions() {
        initComponents();
        showTransactions();
        ALLTRANSACTIONS.setEnabled(false);
        displayDateTime();
         startTimer(); // Start the timer for continuous time update
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ALLTRANSACTIONS = new javax.swing.JTable();
        exit = new javax.swing.JButton();
        approvals = new javax.swing.JButton();
        banktransac = new javax.swing.JButton();
        bankreserve = new javax.swing.JButton();
        clients = new javax.swing.JButton();
        timeanddate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ALLTRANSACTIONS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ACCOUNT NUMBER", "CURRENT BALANCE", "AMOUNT", "TYPE"
            }
        ));
        jScrollPane1.setViewportView(ALLTRANSACTIONS);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 510, 270));

        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 130, 110));

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

        clients.setBorderPainted(false);
        clients.setContentAreaFilled(false);
        clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsActionPerformed(evt);
            }
        });
        getContentPane().add(clients, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 220, 100));

        timeanddate.setBackground(new java.awt.Color(255, 255, 255));
        timeanddate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        timeanddate.setForeground(new java.awt.Color(0, 0, 0));
        timeanddate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(timeanddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 490, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankTransactions.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        new AdminLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void approvalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvalsActionPerformed
        new Approval().setVisible(true);
        dispose();
    }//GEN-LAST:event_approvalsActionPerformed

    private void banktransacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banktransacActionPerformed
        new BankTransactions().setVisible(true);
        dispose();
    }//GEN-LAST:event_banktransacActionPerformed

    private void bankreserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankreserveActionPerformed
        new BankReserve().setVisible(true);
        dispose();
    }//GEN-LAST:event_bankreserveActionPerformed

    private void clientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientsActionPerformed
        new Clients().setVisible(true);
        dispose();
    }//GEN-LAST:event_clientsActionPerformed

    private void showTransactions() {
        DefaultTableModel model = (DefaultTableModel) ALLTRANSACTIONS.getModel();
        // Read the CSV file and populate the table
        try (BufferedReader br = new BufferedReader(new FileReader("usertransactions.csv"))) {
            String line;
            int row = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (row >= 2) { // Start populating from row 2
                    model.addRow(new Object[]{data[0], data[1], data[2], data[3]});
                }
                row++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    public static void main(String args[]) {
    
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankTransactions().setVisible(true);
            }
        });
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ALLTRANSACTIONS;
    private javax.swing.JButton approvals;
    private javax.swing.JButton bankreserve;
    private javax.swing.JButton banktransac;
    private javax.swing.JButton clients;
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
