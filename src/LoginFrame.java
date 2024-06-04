import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;

public class LoginFrame extends javax.swing.JFrame {

public LoginFrame() {
        initComponents();
        limitTextField(Accnum, 10); // Limit Accnum JTextField to 10 digits
        CreateAcc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openManageAccount();
            }
        });
        LoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
      
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Accpin = new javax.swing.JPasswordField();
        Accnum = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        CreateAcc = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Accpin.setBackground(new java.awt.Color(255, 255, 255));
        Accpin.setForeground(new java.awt.Color(0, 0, 0));
        Accpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccpinActionPerformed(evt);
            }
        });
        getContentPane().add(Accpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 240, 40));

        Accnum.setBackground(new java.awt.Color(255, 255, 255));
        Accnum.setForeground(new java.awt.Color(0, 0, 0));
        Accnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccnumActionPerformed(evt);
            }
        });
        getContentPane().add(Accnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 240, 40));

        LoginButton.setBorderPainted(false);
        LoginButton.setContentAreaFilled(false);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 90, 40));

        CreateAcc.setBorderPainted(false);
        CreateAcc.setContentAreaFilled(false);
        CreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccActionPerformed(evt);
            }
        });
        getContentPane().add(CreateAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 100, 40));

        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginPage.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccActionPerformed
 // Open the ManageAccount frame
        ManageAccount ManageAccount = new ManageAccount();
        ManageAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ManageAccount.setVisible(true);
        dispose(); // Close the current frame
    }//GEN-LAST:event_CreateAccActionPerformed

    private void AccpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccpinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccpinActionPerformed

    private void AccnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccnumActionPerformed

    }//GEN-LAST:event_AccnumActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
  
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        new AdminLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_exitActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Accnum;
    private javax.swing.JPasswordField Accpin;
    private javax.swing.JButton CreateAcc;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    
    
    private void openManageAccount() {
        ManageAccount manageAccount = new ManageAccount();
        manageAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        manageAccount.setVisible(true);
        dispose(); // Close the current frame
    }

    private void limitTextField(JTextField textField, int limit) {
        AbstractDocument doc = (AbstractDocument) textField.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                if (newText.length() <= limit) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
    }

 private void login() {
    String username = Accnum.getText();
    String password = new String(Accpin.getPassword());
    try {
            BufferedReader reader = new BufferedReader(new FileReader("accounts.csv"));
            String line;
            
            while ((line = reader.readLine())!=null) {
                String[] accountDetails = line.split(",");
                
                if (accountDetails[0].equals(username) && accountDetails[7].equals("FOR APPROVAL")) {
                   JOptionPane.showMessageDialog(null, "ACCOUNT FOR APPROVAL");
                   return;
                }
                else if (accountDetails[0].equals(username) && accountDetails[7].equals("DECLINED")) {
                   JOptionPane.showMessageDialog(null, "ACCOUNT IS DECLINED");
                   return;
                }
        }} 
        catch (FileNotFoundException ex) {
        Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    // Check credentials from CSV
    if (verifyCredentials(username, password)) {
        JOptionPane.showMessageDialog(null, "Login successful!");
        openManageProfile(username); // Pass the account number to open ManageProfile
    } else {
        JOptionPane.showMessageDialog(null, "Invalid username or password!");
    }
}

 private void openManageProfile(String accountNumber) {
    // Open the ManageProfile frame and pass the account number
    ManageProfile manageProfile = new ManageProfile(accountNumber);
    manageProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    manageProfile.setVisible(true);
    dispose(); // Close the current frame
}


    private boolean verifyCredentials(String username, String password) {
        String csvFile = "accounts.csv";
        String line;
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] account = line.split(cvsSplitBy);
                if (account.length >= 2 && account[0].equals(username) && account[6].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void openWithDrawAndCashDeposit() {
    // Open WithDraw frame and pass the account number
    WithDraw withDraw = new WithDraw(Accnum.getText());
    withDraw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    withDraw.setVisible(true);
    
    // Open CashDeposit frame and pass the account number
    CashDeposit cashDeposit = new CashDeposit(Accnum.getText());
    cashDeposit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    cashDeposit.setVisible(true);
    
    dispose(); // Close the current frame
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }
}