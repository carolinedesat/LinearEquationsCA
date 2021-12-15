/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class RegularUserRegistration extends javax.swing.JFrame {

    /**
     * Creates new form RegularUserRegistration
     */
    public RegularUserRegistration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        lastNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        passwordWarning = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Linear Equations Calculator");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Regular User Registration");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("First Name:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Last Name:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Username:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Password:");

        cancelBtn.setText("Cancel");
        cancelBtn.setPreferredSize(new java.awt.Dimension(100, 29));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        passwordWarning.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordWarning.setForeground(new java.awt.Color(255, 0, 0));
        passwordWarning.setText("");

        registerBtn.setText("Register");
        registerBtn.setPreferredSize(new java.awt.Dimension(100, 29));
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField)
                            .addComponent(lastNameField)
                            .addComponent(passwordField)
                            .addComponent(passwordWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNameField)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(passwordWarning)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        
        //brings the user back to the login page
        LoginForm login = new LoginForm();
        login.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed

        //stores the text fields inside variables
        String first_name = firstNameField.getText();
        String last_name = lastNameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();

        //checks if all the fields are filled out
        if (first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() || password.isEmpty()) {

            JOptionPane.showMessageDialog(null, "A required field is missing. Please fill out all required fields and try again.");

            //checks if the password contains at least 8 characters
        } else if (password.length() < 8) {
            passwordWarning.setText("Please enter at least 8 characters.");

        } else {

            try {

                //loads the database driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                //gets a connection to the database
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "*Dun04061620");

                //retrieves and stores the query
                String isTaken = "SELECT * FROM user WHERE username=?";

                //gets a statement from the connection
                PreparedStatement pstIsTaken = conn.prepareStatement(isTaken);

                //passses the parameters
                pstIsTaken.setString(1, usernameField.getText());

                //executes the query
                ResultSet rs = pstIsTaken.executeQuery();

                //checks is the username is already taken
                if (rs.next()) {

                    JOptionPane.showMessageDialog(null, "Username already taken!");

                } else {

                    //loads the database driver
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    //retrieves and stores the query
                    String insert = "INSERT INTO user (first_name, last_name, username, password) VALUES (?, ?, ?, ?)";

                    //gets a statement from the connection
                    PreparedStatement pstInsert = conn.prepareStatement(insert);

                    //passes all the parameters
                    pstInsert.setString(1, first_name);
                    pstInsert.setString(2, last_name);
                    pstInsert.setString(3, username);
                    pstInsert.setString(4, password);
                    pstInsert.execute();
                    JOptionPane.showMessageDialog(null, "The registration was successful!");

                    //changes to login form
                    LoginForm login = new LoginForm();
                    login.setVisible(true);
                    dispose();

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

    }//GEN-LAST:event_registerBtnActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed

         /**
         * Allows the user to use the enter key instead of the register button.
         */        
        
        //stores the text fields inside variables
        String first_name = firstNameField.getText();
        String last_name = lastNameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            //checks if all the fields are filled out
            if (first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() || password.isEmpty()) {

                JOptionPane.showMessageDialog(null, "A required field is missing. Please fill out all required fields and try again.");

                //checks if the password contains at least 8 characters
            } else if (password.length() < 8) {
                passwordWarning.setText("Please enter at least 8 characters.");

            } else {

                try {

                    //loads the database driver
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    //gets a connection to the database
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "*Dun04061620");

                    //retrieves and stores the query
                    String isTaken = "SELECT * FROM user WHERE username=?";

                    //gets a statement from the connection
                    PreparedStatement pstIsTaken = conn.prepareStatement(isTaken);

                    //passses the parameters
                    pstIsTaken.setString(1, usernameField.getText());

                    //executes the query
                    ResultSet rs = pstIsTaken.executeQuery();

                    //checks is the username is already taken
                    if (rs.next()) {

                        JOptionPane.showMessageDialog(null, "Username already taken!");

                    } else {

                        //loads the database driver
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        //retrieves and stores the query
                        String insert = "INSERT INTO user (first_name, last_name, username, password) VALUES (?, ?, ?, ?)";

                        //gets a statement from the connection
                        PreparedStatement pstInsert = conn.prepareStatement(insert);

                        //passes all the parameters
                        pstInsert.setString(1, first_name);
                        pstInsert.setString(2, last_name);
                        pstInsert.setString(3, username);
                        pstInsert.setString(4, password);
                        pstInsert.execute();
                        JOptionPane.showMessageDialog(null, "The registration was successful!");

                        //changes to login form
                        LoginForm login = new LoginForm();
                        login.setVisible(true);
                        dispose();

                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }

        }

    }//GEN-LAST:event_passwordFieldKeyPressed

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        passwordField.setText("");
        passwordWarning.setText("");
    }//GEN-LAST:event_passwordFieldMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegularUserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegularUserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegularUserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegularUserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegularUserRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordWarning;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
