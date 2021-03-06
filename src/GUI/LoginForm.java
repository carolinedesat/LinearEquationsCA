/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import SQL.SQLConnection;
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
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
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
        usernameField = new javax.swing.JTextField();
        usernameWarning = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordWarning = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Linear Equations Calculator");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login Form");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Username:");

        usernameWarning.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usernameWarning.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password:");

        passwordWarning.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordWarning.setForeground(new java.awt.Color(255, 0, 0));

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        registerBtn.setText("Register for new users");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(loginBtn)
                                .addGap(18, 18, 18)
                                .addComponent(registerBtn))
                            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameField)
                            .addComponent(usernameWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordWarning)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(registerBtn))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        usernameWarning.getAccessibleContext().setAccessibleName("");

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

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed

        /**
         * Allows the user to login after entering the right details.
         */
        //stores the text fields inside variables
        String username = usernameField.getText();
        String password = passwordField.getText();

        //checks if there is any input inside the username and password fields
        if (username.isEmpty()) {

            usernameWarning.setText("Enter a username");
            passwordWarning.setText("");

        } else if (password.isEmpty()) {

            passwordWarning.setText("Enter a password");
            usernameWarning.setText("");

        } else {

            try {

                //loads the database driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                //retrieves and stores the query
                String query = "SELECT * FROM user WHERE username=? and password=?";

                //gets a connection to the database
                SQLConnection conn = new SQLConnection();

                //gets a statement from the connection
                conn.prepareStatement(query);

                //passses all the parameters
                conn.getPst().setString(1, usernameField.getText());
                conn.getPst().setString(2, passwordField.getText());

                //executes the query
                ResultSet rs = conn.getPst().executeQuery();

                //checks if the user is an admin; if not, change to regular user menu; if yes, change to admin menu
                if (rs.next()) {

                    if (null == rs.getString("is_admin")) {

                        //stores the usernameField content inside the variable str and carries the username to the following Jframe
                        String str = usernameField.getText();
                        RegularUserMenu obj = new RegularUserMenu();
                        obj.my_update(str);
                        obj.setVisible(true);
                        dispose();

                    } else if (null != rs.getString("is_admin")) {

                        //stores the usernameField content inside the variable str and carries the username to the following Jframe
                        String str = usernameField.getText();
                        AdminMenu obj = new AdminMenu();
                        obj.my_update(str);
                        obj.setVisible(true);
                        dispose();

                    }

                } else {

                    //if username and password are incorrect, show error message and clear fields
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                    usernameField.setText("");
                    passwordField.setText("");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed

        //brings the user to the registration page
        RegularUserRegistration registration = new RegularUserRegistration();
        registration.setVisible(true);
        dispose();

    }//GEN-LAST:event_registerBtnActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed

        /**
         * Allows the user to use the enter key instead of the login button.
         */
        //stores the text fields inside variables
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            //checks if there is any input inside the username and password fields
            if (username.isEmpty()) {

                usernameWarning.setText("Enter a username");
                passwordWarning.setText("");

            } else if (password.isEmpty()) {

                passwordWarning.setText("Enter a password");
                usernameWarning.setText("");

            } else {

                try {

                    //loads the database driver
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    //retrieves and stores the query
                    String query = "SELECT * FROM user WHERE username=? and password=?";

                    //gets a connection to the database
                    SQLConnection conn = new SQLConnection();

                    //gets a statement from the connection
                    conn.prepareStatement(query);

                    //passses all the parameters
                    conn.getPst().setString(1, usernameField.getText());
                    conn.getPst().setString(2, passwordField.getText());

                    //executes the query
                    ResultSet rs = conn.getPst().executeQuery();

                    //checks if the user is an admin; if not, change to regular user menu; if yes, change to admin menu
                    if (rs.next()) {

                        if (null == rs.getString("is_admin")) {

                            String str = usernameField.getText();
                            RegularUserMenu obj = new RegularUserMenu();
                            obj.my_update(str);
                            obj.setVisible(true);
                            dispose();

                        } else if (null != rs.getString("is_admin")) {

                            String str = usernameField.getText();
                            AdminMenu obj = new AdminMenu();
                            obj.my_update(str);
                            obj.setVisible(true);
                            dispose();

                        }

                    } else {

                        //if username and password are incorrect, show error message and clear fields
                        JOptionPane.showMessageDialog(null, "Incorrect username or password");
                        usernameField.setText("");
                        passwordField.setText("");

                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }

        }

    }//GEN-LAST:event_passwordFieldKeyPressed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    protected javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordWarning;
    private javax.swing.JButton registerBtn;
    protected javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameWarning;
    // End of variables declaration//GEN-END:variables
}
