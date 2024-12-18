/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalsproject;
import javax.swing.DefaultComboBoxModel; // Import statement for DefaultComboBoxModel
import javax.swing.JOptionPane; // Import statement for JOptionPane
import javax.swing.table.DefaultTableModel; // Import for DefaultTableModel
import java.sql.Connection; // Import for SQL Connection
import java.sql.PreparedStatement; // Import for PreparedStatement
import java.sql.ResultSet; // Import for ResultSet
import java.sql.SQLException; // Import for SQLException
import java.util.ArrayList; // Import statement for ArrayList
import java.util.List; // Import statement for List

/**
 *
 * @author User
 */
public class UserManagement extends javax.swing.JFrame {
    
    /**
     * Creates new form ListUsers
     */
    public UserManagement() {
        initComponents();
        setLocationRelativeTo(null);
        populateAgeBox(); // Populate the AgeBox with ages
        fetchAndDisplayUserData(); // Fetch and display user data in the table
        AddUserButton.setEnabled(false); // Disable the button by default
        InstructionBox.setEditable(false);
        
        FNameField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            checkFields(); // Check fields after user input
        }
        });
        LNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkFields();
            }
        });
        EmailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkFields();
            }
        });
        PassField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkFields();
            }
        });
        AgeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFields();
            }
        });
        RoleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFields();
            }
});
    }
    private void populateAgeBox() {
        List<Integer> age = new ArrayList<>(); // Create a List to hold ages from 18 to 100
        for (int i = 18; i <= 100; ++i) {
            age.add(i); // Add ages from 18 to 100 to the list
        }

        // Convert the List to an Integer array and set it as the model for AgeBox
        AgeBox.setModel(new DefaultComboBoxModel<>(age.toArray(new Integer[0]))); // Populate AgeBox
    }
    
    private void checkFields() {
    boolean isValid = !FNameField.getText().trim().isEmpty() && // First name
                      !LNameField.getText().trim().isEmpty() && // Last name
                      AgeBox.getSelectedItem() != null && // Age selection
                      !EmailField.getText().trim().isEmpty() && // Email
                      !PassField.getText().trim().isEmpty() && // Password
                      RoleBox.getSelectedItem() != null; // Role selection
                      
    AddUserButton.setEnabled(isValid); // Enable or disable the button based on validation
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LNameLabel1 = new javax.swing.JLabel();
        AgeLabel1 = new javax.swing.JLabel();
        AddUserButton = new javax.swing.JButton();
        FNameField = new javax.swing.JTextField();
        EmailLabel1 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        LNameField = new javax.swing.JTextField();
        FNameLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AgeBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        PassField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RoleBox = new javax.swing.JComboBox<>();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        InstructionBox = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 650));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LNameLabel1.setText("Last Name");

        AgeLabel1.setText("Age");

        AddUserButton.setBackground(new java.awt.Color(102, 255, 102));
        AddUserButton.setText("Add User");
        AddUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserButtonActionPerformed(evt);
            }
        });

        FNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameFieldActionPerformed(evt);
            }
        });

        EmailLabel1.setText("Email");

        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        LNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameFieldActionPerformed(evt);
            }
        });

        FNameLabel1.setText("First Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("User Form");

        AgeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[0]));
        AgeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Password");

        jLabel3.setText("Role");

        RoleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "staff   ", "user"}));

        EditButton.setBackground(new java.awt.Color(255, 255, 102));
        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(255, 51, 51));
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(AddUserButton)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditButton)
                                    .addComponent(DeleteButton)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AgeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(FNameLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LNameField)
                                        .addComponent(FNameField)
                                        .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AgeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RoleBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel8)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FNameLabel1))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNameLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeLabel1)
                    .addComponent(AgeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RoleBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmailLabel1)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(EditButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(AddUserButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "USC ID", "First Name", "Last Name", "Role", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        InstructionBox.setColumns(20);
        InstructionBox.setRows(5);
        InstructionBox.setText("Add - To add a user, fill out the form and add.\nEdit - To edit a user, prefil the form with the details, \nthen click on desired user, then press the edit button.\nDelete - To delete, simply click a user and press delete.");
        InstructionBox.setEditable(false);
        jScrollPane2.setViewportView(InstructionBox);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("USER MANAGEMENT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BackButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserButtonActionPerformed
        // TODO add your handling code here:
        String firstName = FNameField.getText(); // Get the first name
        String lastName = LNameField.getText(); // Get the last name
        int age = (int) AgeBox.getSelectedItem(); // Get the selected age
        String email = EmailField.getText(); // Get the email
        String password = PassField.getText(); // Get the password
        String role = (String) RoleBox.getSelectedItem(); // Get the selected role

        // Call the method to add user information to the database
        addUserToDatabase(firstName, lastName, age, email, password, role);

        // Clear the input fields after adding the user
        clearInputFields();
    }//GEN-LAST:event_AddUserButtonActionPerformed

    private void clearInputFields() {
        FNameField.setText(""); // Clear first name field
        LNameField.setText(""); // Clear last name field
        AgeBox.setSelectedIndex(0); // Reset age box to the first item (18)
        EmailField.setText(""); // Clear email field
        PassField.setText(""); // Clear password field
        RoleBox.setSelectedIndex(0); // Reset role box to the first item (admin)
}
    
    private void addUserToDatabase(String firstName, String lastName, int age, String email, String password, String role) {
        String query = "INSERT INTO Users (FName, LName, Age, Email, Password, Role) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = connectDB.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setInt(3, age);
            pstmt.setString(4, email);
            pstmt.setString(5, password);
            pstmt.setString(6, role);

            int rowsAffected = pstmt.executeUpdate(); // Execute the insert statement

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "User added successfully!"); // Show success message
            } else {
                JOptionPane.showMessageDialog(this, "Error adding user. Please try again."); // Show error message
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage()); // Show database error
        }
    }
    
    private void fetchAndDisplayUserData() {
        String query = "SELECT USC_ID, FName, LName, Role, Email FROM Users"; // Update to your actual query
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // Get the table model
        model.setRowCount(0); // Clear the table before populating

        try (Connection conn = connectDB.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                // Get data from result set
                int uscId = rs.getInt("USC_ID");
                String firstName = rs.getString("FName");
                String lastName = rs.getString("LName");
                String role = rs.getString("Role");
                String email = rs.getString("Email");

                // Add data to the table model
                model.addRow(new Object[]{uscId, firstName, lastName, role, email});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        }
    }
    
     
     private void updateUserInDatabase(int uscId, String firstName, String lastName, int age, String email, String password, String role) {
        String query = "UPDATE Users SET FName=?, LName=?, Age=?, Email=?, Password=?, Role=? WHERE USC_ID=?";

        try (Connection conn = connectDB.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setInt(3, age);
            pstmt.setString(4, email);
            pstmt.setString(5, password);
            pstmt.setString(6, role);
            pstmt.setInt(7, uscId); // Set USC_ID for the WHERE clause

            int rowsAffected = pstmt.executeUpdate(); // Execute the update statement

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "User updated successfully!"); // Show success message
                fetchAndDisplayUserData(); // Refresh the table data
            } else {
                JOptionPane.showMessageDialog(this, "Error updating user. Please try again."); // Show error message
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage()); // Show database error
        }
    }
     
     private void deleteUserFromDatabase(int uscId) {
        String query = "DELETE FROM Users WHERE USC_ID=?";

        try (Connection conn = connectDB.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, uscId); // Set USC_ID for the WHERE clause
            int rowsAffected = pstmt.executeUpdate(); // Execute the delete statement

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "User deleted successfully!"); // Show success message
                fetchAndDisplayUserData(); // Refresh the table data
            } else {
                JOptionPane.showMessageDialog(this, "Error deleting user. Please try again."); // Show error message
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage()); // Show database error
        }
    }
    
    private void LNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNameFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        new AdminLanding().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void FNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameFieldActionPerformed

    private void AgeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeBoxActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        int selectedRow = jTable1.getSelectedRow(); // Get selected row index

        if (selectedRow >= 0) {
            // Retrieve data from the selected row
            int uscId = (int) jTable1.getValueAt(selectedRow, 0);
            String firstName = FNameField.getText();
            String lastName = LNameField.getText();
            int age = (int) AgeBox.getSelectedItem();
            String email = EmailField.getText();
            String password = PassField.getText();
            String role = (String) RoleBox.getSelectedItem();

            // Update the user in the database
            updateUserInDatabase(uscId, firstName, lastName, age, email, password, role);
            clearInputFields(); // Clear the fields after update
        } else {
            JOptionPane.showMessageDialog(this, "Please select a user to edit.");
        }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow(); // Get selected row index

        if (selectedRow >= 0) {
            int uscId = (int) jTable1.getValueAt(selectedRow, 0); // Get USC ID from the selected row
            deleteUserFromDatabase(uscId); // Delete the user
        } else {
            JOptionPane.showMessageDialog(this, "Please select a user to delete.");
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUserButton;
    private javax.swing.JComboBox<Integer> AgeBox;
    private javax.swing.JLabel AgeLabel1;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabel1;
    private javax.swing.JTextField FNameField;
    private javax.swing.JLabel FNameLabel1;
    private javax.swing.JTextArea InstructionBox;
    private javax.swing.JTextField LNameField;
    private javax.swing.JLabel LNameLabel1;
    private javax.swing.JTextField PassField;
    private javax.swing.JComboBox<String> RoleBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
