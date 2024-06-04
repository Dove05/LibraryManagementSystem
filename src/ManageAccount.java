
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Calendar;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class ManageAccount extends javax.swing.JFrame {

    /**
     * Creates new form ManageAccount
     */
    public ManageAccount() {
        initComponents();
        
        // For the month spinner
String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
SpinnerListModel monthModel = new SpinnerListModel(months);
month.setModel(monthModel);

// For the day spinner
SpinnerNumberModel dayModel = new SpinnerNumberModel(1, 1, 31, 1);
day.setModel(dayModel);

// For the year spinner
int currentYear = Calendar.getInstance().get(Calendar.YEAR);
SpinnerNumberModel yearModel = new SpinnerNumberModel(currentYear, currentYear - 100, currentYear, 1);
year.setModel(yearModel);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        address = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        Fullname = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        year = new javax.swing.JSpinner();
        day = new javax.swing.JSpinner();
        month = new javax.swing.JSpinner();
        pin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 350, 30));
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 350, 30));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 350, 30));

        Fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullnameActionPerformed(evt);
            }
        });
        getContentPane().add(Fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 350, 30));

        cancel.setBorderPainted(false);
        cancel.setContentAreaFilled(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 110, 50));

        confirm.setBorderPainted(false);
        confirm.setContentAreaFilled(false);
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 100, 50));
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 80, -1));
        getContentPane().add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 80, -1));
        getContentPane().add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 80, -1));
        getContentPane().add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManageAccount (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullnameActionPerformed
      
    }//GEN-LAST:event_FullnameActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
      saveAccountDetails();
    }//GEN-LAST:event_confirmActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
      // Open the LoginFrame
        LoginFrame LoginFrame = new LoginFrame();
        LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginFrame.setVisible(true);
        dispose(); // Close the current frame
    }//GEN-LAST:event_cancelActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fullname;
    private javax.swing.JTextField address;
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirm;
    private javax.swing.JSpinner day;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner month;
    private javax.swing.JTextField phone;
    private javax.swing.JPasswordField pin;
    private javax.swing.JSpinner year;
    // End of variables declaration//GEN-END:variables
// Method to deposit funds into an existing account
    private void depositFunds(long accountNumber, long depositAmount) {
        try {
            File file = new File("transactions.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(accountNumber + "," + depositAmount);
            writer.newLine();
            writer.close();
            JOptionPane.showMessageDialog(null, "Funds deposited successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while depositing funds.");
        }
    }

    // Method to read account details from a CSV file
    private String[] readAccountDetails(long accountNumber) {
        String line;
        String[] accountDetails = new String[7]; // Assuming there are 7 fields in the CSV
        try (BufferedReader br = new BufferedReader(new FileReader("accounts.csv"))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (Long.parseLong(data[0]) == accountNumber) {
                    accountDetails = data;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return accountDetails;
    }

    // Method to update account balance after depositing funds
    private void updateAccountBalance(long accountNumber, long depositAmount) {
        String[] accountDetails = readAccountDetails(accountNumber);
        if (accountDetails.length > 0) {
            long currentBalance = Long.parseLong(accountDetails[6]); // Assuming balance is at index 6
            long newBalance = currentBalance + depositAmount;
            accountDetails[6] = String.valueOf(newBalance);
            writeUpdatedAccountDetails(accountDetails);
        } else {
            JOptionPane.showMessageDialog(null, "Account not found.");
        }
    }

    // Method to write updated account details to the CSV file
    private void writeUpdatedAccountDetails(String[] accountDetails) {
        try {
            File file = new File("accounts.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(String.join(",", accountDetails));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while updating account details.");
        }
    }

    
    private void saveAccountDetails() {
    // Check if any required field is empty
    if (Fullname.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty() ||
            address.getText().isEmpty() || pin.getPassword().length == 0) {
        JOptionPane.showMessageDialog(null, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit method if any required field is empty
    }

    // Check if pin is a valid 6-digit integer
    String pinText = pin.getText();
    try {
        int pinValue = Integer.parseInt(pinText);
        if (pinText.length() != 6) {
            JOptionPane.showMessageDialog(null, "Pin must be a 6-digit number.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method if pin is not a 6-digit number
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Pin must be a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit method if pin is not a valid integer
    }

    // Check if email is in the correct format
    String emailText = email.getText();
    if (!isValidEmail(emailText)) {
        JOptionPane.showMessageDialog(null, "Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit method if email format is incorrect
    }

    // Check if phone number is in the correct format
    String phoneText = phone.getText();
    if (!isValidPhoneNumber(phoneText)) {
        JOptionPane.showMessageDialog(null, "Please enter a valid phone number.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit method if phone number format is incorrect
    }

    // Generate a random 10-digit account number
    long accountNumber = generateAccountNumber();

    String fullName = Fullname.getText();
    String addressText = address.getText();
    String birthDate = month.getValue() + "/" + day.getValue() + "/" + year.getValue();

    // Attempt to write data to CSV
    boolean success = writeDataToCSV(accountNumber, fullName, emailText, phoneText, addressText, birthDate, pinText, "FOR APPROVAL");

    if (success) {
        // Display the account number to the user only if saving was successful
        JOptionPane.showMessageDialog(null, "Account details saved successfully!\nYour account number is: " + accountNumber);
        
        // Clear all fields
        clearFields();
    }
}

private void clearFields() {
    Fullname.setText("");
    email.setText("");
    phone.setText("");
    address.setText("");
    pin.setText("");
    month.setValue("Jan");
    day.setValue(1);
    year.setValue(Calendar.getInstance().get(Calendar.YEAR));
}

private boolean isValidEmail(String email) {
    // Regular expression for validating email addresses
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    return email.matches(emailRegex);
}

private boolean isValidPhoneNumber(String phoneNumber) {
    // Regular expression for validating phone numbers (10 digits)
    String phoneRegex = "\\d{10}";
    return phoneNumber.matches(phoneRegex);
}

    private boolean writeDataToCSV(long accountNumber, String fullName, String email, String phone, String address, String birthDate, String pin,String Status) {
        try {
            File file = new File("accounts.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(accountNumber + "," + fullName + "," + email + "," + phone + "," + address + "," + birthDate + "," + pin +","+ Status);
            writer.newLine();
            writer.close();
            JOptionPane.showMessageDialog(null, "Account details saved successfully!");
            return true; // Indicate success
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while saving account details.");
            return false; // Indicate failure
        }
    }

    private long generateAccountNumber() {
        Random random = new Random();
        return (long) (random.nextDouble() * 10000000000L);
    }
}