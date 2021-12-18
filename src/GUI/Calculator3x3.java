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
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class Calculator3x3 extends javax.swing.JFrame {

    /**
     * Method that receives the username from the previous page.
     */
    public void my_update(String str) {
        greeting.setText(str);
    }

    /**
     * Creates new form Calculator3x3
     */
    public Calculator3x3() {
        initComponents();
    }

    Calculator3x3(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        x1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        x2 = new javax.swing.JTextField();
        y1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        z1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        r1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        y2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        z2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        r2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        calculateBtn = new javax.swing.JButton();
        resultX = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        x3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        y3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        z3 = new javax.swing.JTextField();
        r3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        resultZ = new javax.swing.JLabel();
        resultY = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        greeting = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Linear Equations Calculator");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Type the constants for the following equations:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("1.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("2.");

        x1.setPreferredSize(new java.awt.Dimension(35, 26));

        jLabel3.setText("x +");

        x2.setPreferredSize(new java.awt.Dimension(35, 26));

        y1.setPreferredSize(new java.awt.Dimension(35, 26));

        jLabel7.setText("y +");

        z1.setPreferredSize(new java.awt.Dimension(35, 26));

        jLabel8.setText("z =");

        r1.setPreferredSize(new java.awt.Dimension(35, 26));

        jLabel9.setText("x +");

        y2.setPreferredSize(new java.awt.Dimension(35, 26));

        jLabel10.setText("y +");

        z2.setPreferredSize(new java.awt.Dimension(35, 26));

        jLabel12.setText("z =");

        r2.setPreferredSize(new java.awt.Dimension(35, 26));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Result:");

        saveBtn.setText("Save");
        saveBtn.setPreferredSize(new java.awt.Dimension(100, 29));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.setPreferredSize(new java.awt.Dimension(100, 29));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        resultX.setText("   ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("3.");

        x3.setPreferredSize(new java.awt.Dimension(35, 26));

        jLabel15.setText("x +");

        y3.setPreferredSize(new java.awt.Dimension(35, 26));

        jLabel16.setText("y +");

        z3.setPreferredSize(new java.awt.Dimension(35, 26));

        r3.setPreferredSize(new java.awt.Dimension(35, 26));
        r3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                r3KeyPressed(evt);
            }
        });

        jLabel17.setText("z =");

        resultZ.setText("   ");

        resultY.setText("   ");

        clearBtn.setText("Clear All");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        greeting.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        greeting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greeting.setText("greeting");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(greeting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultZ))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clearBtn)
                                .addGap(18, 18, 18)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(greeting)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(calculateBtn)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(resultX)
                    .addComponent(resultY)
                    .addComponent(resultZ))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        //stores the username content inside the variable str and carries the username to the previous Jframe
        String str = greeting.getText();
        RegularUserMenu obj = new RegularUserMenu();
        obj.my_update(str);
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_backBtnActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed

        /**
         * When the calculate button is clicked, perform the calculation using 3
         * variables.
         */
        if (x1.getText().matches("[a-zA-Z]+") || y1.getText().matches("[a-zA-Z]+") || z1.getText().matches("[a-zA-Z]+")
                || r1.getText().matches("[a-zA-Z]+") || x2.getText().matches("[a-zA-Z]+") || y2.getText().matches("[a-zA-Z]+")
                || z2.getText().matches("[a-zA-Z]+") || r2.getText().matches("[a-zA-Z]+") || x3.getText().matches("[a-zA-Z]+")
                || y3.getText().matches("[a-zA-Z]+") || z3.getText().matches("[a-zA-Z]+") || r3.getText().matches("[a-zA-Z]+")) {

            JOptionPane.showMessageDialog(null, "Enter a number; characters and symbols are not allowed.");

        } else {

            try {

                float[][] originalEquation = new float[3][3];
                float[] resultColum = new float[3];
                float[][] detAMinors = new float[3][3];
                float detA;
                float[][] adjoint = new float[3][3];
                float[][] inverse = new float[3][3];
                float[] results = new float[3];

                originalEquation[0][0] = Float.parseFloat(x1.getText());
                originalEquation[0][1] = Float.parseFloat(y1.getText());
                originalEquation[0][2] = Float.parseFloat(z1.getText());
                resultColum[0] = Float.parseFloat(r1.getText());
                originalEquation[1][0] = Float.parseFloat(x2.getText());
                originalEquation[1][1] = Float.parseFloat(y2.getText());
                originalEquation[1][2] = Float.parseFloat(z2.getText());
                resultColum[1] = Float.parseFloat(r2.getText());
                originalEquation[2][0] = Float.parseFloat(x3.getText());
                originalEquation[2][1] = Float.parseFloat(y3.getText());
                originalEquation[2][2] = Float.parseFloat(z3.getText());
                resultColum[2] = Float.parseFloat(r3.getText());

                detAMinors[0][0] = (originalEquation[1][1] * originalEquation[2][2]) - (originalEquation[1][2] * originalEquation[2][1]);
                detAMinors[0][1] = ((originalEquation[1][0] * originalEquation[2][2]) - (originalEquation[1][2] * originalEquation[2][0])) * -1;
                detAMinors[0][2] = (originalEquation[1][0] * originalEquation[2][1]) - (originalEquation[1][1] * originalEquation[2][0]);
                detAMinors[1][0] = ((originalEquation[0][1] * originalEquation[2][2]) - (originalEquation[0][2] * originalEquation[2][1])) * -1;
                detAMinors[1][1] = (originalEquation[0][0] * originalEquation[2][2]) - (originalEquation[0][2] * originalEquation[2][0]);
                detAMinors[1][2] = ((originalEquation[0][0] * originalEquation[2][1]) - (originalEquation[0][1] * originalEquation[2][0])) * -1;
                detAMinors[2][0] = (originalEquation[0][1] * originalEquation[1][2]) - (originalEquation[0][2] * originalEquation[1][1]);
                detAMinors[2][1] = ((originalEquation[0][0] * originalEquation[1][2]) - (originalEquation[0][2] * originalEquation[1][0])) * -1;
                detAMinors[2][2] = (originalEquation[0][0] * originalEquation[1][1]) - (originalEquation[0][1] * originalEquation[1][0]);

                detA = (originalEquation[0][0] * detAMinors[0][0]) + (originalEquation[0][1] * detAMinors[0][1]) + (originalEquation[0][2] * detAMinors[0][2]);

                if (detA == 0) {
                    JOptionPane.showMessageDialog(null, "Determinante is 0. It is not possible calculate the variables values.");

                } else {

                    for (int row = 0; row < adjoint.length; row++) {
                        for (int col = 0; col < adjoint[row].length; col++) {
                            adjoint[row][col] = detAMinors[col][row];
                        }
                    }

                    for (int row = 0; row < adjoint.length; row++) {
                        for (int col = 0; col < adjoint[row].length; col++) {
                            inverse[row][col] = (1 / detA) * adjoint[row][col];
                        }
                    }

                    results[0] = (inverse[0][0] * resultColum[0]) + (inverse[0][1] * resultColum[1]) + (inverse[0][2] * resultColum[2]);
                    results[1] = (inverse[1][0] * resultColum[0]) + (inverse[1][1] * resultColum[1]) + (inverse[1][2] * resultColum[2]);
                    results[2] = (inverse[2][0] * resultColum[0]) + (inverse[2][1] * resultColum[1]) + (inverse[2][2] * resultColum[2]);

                    DecimalFormat df = new DecimalFormat("####0.00");
                    resultX.setText("(" + df.format(results[0]) + " ;");
                    resultY.setText(df.format(results[1]) + " ;");
                    resultZ.setText(df.format(results[2]) + ")");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error.");
            }

        }

    }//GEN-LAST:event_calculateBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed

        /**
         * Allows the user clear all the fields.
         */
        x1.setText("");
        y1.setText("");
        z1.setText("");
        r1.setText("");
        x2.setText("");
        y2.setText("");
        z2.setText("");
        r2.setText("");
        x3.setText("");
        y3.setText("");
        z3.setText("");
        r3.setText("");
        resultX.setText("");
        resultY.setText("");
        resultZ.setText("");

    }//GEN-LAST:event_clearBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        /**
         * Saves the operation into the database.
         */
        try {

            if (resultX.getText().isEmpty() || resultY.getText().isEmpty() || resultZ.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nothing to save.");

            } else {

                int user_id = 0;
                String first_equation;
                String second_equation;
                String third_equation;
                String result;

                //loads the database driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                //retrieves and stores the query
                String selectUser = "SELECT user_id FROM user WHERE username=?";
                String insertOperation = "INSERT INTO operations (user_id, first_equation, second_equation, third_equation, result) VALUES (?, ?, ?, ?, ?)";

                //gets a connection to the database
                //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "Putyourh@1rup");
                SQLConnection conn = new SQLConnection();

                //gets a statement from the connection
                //PreparedStatement pstUser = conn.prepareStatement(selectUser);
                conn.prepareStatement(selectUser);

                //pstUser.setString(1, greeting.getText());
                conn.getPst().setString(1, greeting.getText());

                //executes the query
                //ResultSet rs = pstUser.executeQuery();
                ResultSet rs = conn.getPst().executeQuery();

                if (rs.next()) {
                    user_id = rs.getInt("user_id");
                }

                first_equation = (x1.getText() + "x + " + y1.getText() + "y + " + z1.getText() + "z = " + r1.getText());
                second_equation = (x2.getText() + "x + " + y2.getText() + "y + " + z2.getText() + "z = " + r2.getText());
                third_equation = (x3.getText() + "x + " + y3.getText() + "y + " + z3.getText() + "z = " + r3.getText());
                result = (resultX.getText() + resultY.getText() + resultZ.getText());

                //PreparedStatement pstOperation = conn.prepareStatement(insertOperation);
                conn.prepareStatement(insertOperation);

//                pstOperation.setInt(1, user_id);
//                pstOperation.setString(2, first_equation);
//                pstOperation.setString(3, second_equation);
//                pstOperation.setString(4, third_equation);
//                pstOperation.setString(5, result);
//                pstOperation.execute();
                conn.getPst().setInt(1, user_id);
                conn.getPst().setString(2, first_equation);
                conn.getPst().setString(3, second_equation);
                conn.getPst().setString(4, third_equation);
                conn.getPst().setString(5, result);
                conn.getPst().execute();

                JOptionPane.showMessageDialog(null, "Operation saved!");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error.");
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void r3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_r3KeyPressed

        /**
         * Allows the user to use the enter key instead of the calculate button.
         */
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (x1.getText().matches("[a-zA-Z]+") || y1.getText().matches("[a-zA-Z]+") || z1.getText().matches("[a-zA-Z]+")
                    || r1.getText().matches("[a-zA-Z]+") || x2.getText().matches("[a-zA-Z]+") || y2.getText().matches("[a-zA-Z]+")
                    || z2.getText().matches("[a-zA-Z]+") || r2.getText().matches("[a-zA-Z]+") || x3.getText().matches("[a-zA-Z]+")
                    || y3.getText().matches("[a-zA-Z]+") || z3.getText().matches("[a-zA-Z]+") || r3.getText().matches("[a-zA-Z]+")) {

                JOptionPane.showMessageDialog(null, "Enter a number; characters and symbols are not allowed.");

            } else {

                try {

                    float[][] originalEquation = new float[3][3];
                    float[] resultColum = new float[3];
                    float[][] detAMinors = new float[3][3];
                    float detA;
                    float[][] adjoint = new float[3][3];
                    float[][] inverse = new float[3][3];
                    float[] results = new float[3];

                    originalEquation[0][0] = Float.parseFloat(x1.getText());
                    originalEquation[0][1] = Float.parseFloat(y1.getText());
                    originalEquation[0][2] = Float.parseFloat(z1.getText());
                    resultColum[0] = Float.parseFloat(r1.getText());
                    originalEquation[1][0] = Float.parseFloat(x2.getText());
                    originalEquation[1][1] = Float.parseFloat(y2.getText());
                    originalEquation[1][2] = Float.parseFloat(z2.getText());
                    resultColum[1] = Float.parseFloat(r2.getText());
                    originalEquation[2][0] = Float.parseFloat(x3.getText());
                    originalEquation[2][1] = Float.parseFloat(y3.getText());
                    originalEquation[2][2] = Float.parseFloat(z3.getText());
                    resultColum[2] = Float.parseFloat(r3.getText());

                    detAMinors[0][0] = (originalEquation[1][1] * originalEquation[2][2]) - (originalEquation[1][2] * originalEquation[2][1]);
                    detAMinors[0][1] = ((originalEquation[1][0] * originalEquation[2][2]) - (originalEquation[1][2] * originalEquation[2][0])) * -1;
                    detAMinors[0][2] = (originalEquation[1][0] * originalEquation[2][1]) - (originalEquation[1][1] * originalEquation[2][0]);
                    detAMinors[1][0] = ((originalEquation[0][1] * originalEquation[2][2]) - (originalEquation[0][2] * originalEquation[2][1])) * -1;
                    detAMinors[1][1] = (originalEquation[0][0] * originalEquation[2][2]) - (originalEquation[0][2] * originalEquation[2][0]);
                    detAMinors[1][2] = ((originalEquation[0][0] * originalEquation[2][1]) - (originalEquation[0][1] * originalEquation[2][0])) * -1;
                    detAMinors[2][0] = (originalEquation[0][1] * originalEquation[1][2]) - (originalEquation[0][2] * originalEquation[1][1]);
                    detAMinors[2][1] = ((originalEquation[0][0] * originalEquation[1][2]) - (originalEquation[0][2] * originalEquation[1][0])) * -1;
                    detAMinors[2][2] = (originalEquation[0][0] * originalEquation[1][1]) - (originalEquation[0][1] * originalEquation[1][0]);

                    detA = (originalEquation[0][0] * detAMinors[0][0]) + (originalEquation[0][1] * detAMinors[0][1]) + (originalEquation[0][2] * detAMinors[0][2]);

                    if (detA == 0) {
                        JOptionPane.showMessageDialog(null, "Determinante is 0. It is not possible calculate the variables values.");

                    } else {

                        for (int row = 0; row < adjoint.length; row++) {
                            for (int col = 0; col < adjoint[row].length; col++) {
                                adjoint[row][col] = detAMinors[col][row];
                            }
                        }

                        for (int row = 0; row < adjoint.length; row++) {
                            for (int col = 0; col < adjoint[row].length; col++) {
                                inverse[row][col] = (1 / detA) * adjoint[row][col];
                            }
                        }

                        results[0] = (inverse[0][0] * resultColum[0]) + (inverse[0][1] * resultColum[1]) + (inverse[0][2] * resultColum[2]);
                        results[1] = (inverse[1][0] * resultColum[0]) + (inverse[1][1] * resultColum[1]) + (inverse[1][2] * resultColum[2]);
                        results[2] = (inverse[2][0] * resultColum[0]) + (inverse[2][1] * resultColum[1]) + (inverse[2][2] * resultColum[2]);

                        DecimalFormat df = new DecimalFormat("####0.00");
                        resultX.setText("(" + df.format(results[0]) + " ;");
                        resultY.setText(df.format(results[1]) + " ;");
                        resultZ.setText(df.format(results[2]) + ")");

                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error.");
                }

            }

        }

    }//GEN-LAST:event_r3KeyPressed

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
            java.util.logging.Logger.getLogger(Calculator3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator3x3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel greeting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField r2;
    private javax.swing.JTextField r3;
    private javax.swing.JLabel resultX;
    private javax.swing.JLabel resultY;
    private javax.swing.JLabel resultZ;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    private javax.swing.JTextField y3;
    private javax.swing.JTextField z1;
    private javax.swing.JTextField z2;
    private javax.swing.JTextField z3;
    // End of variables declaration//GEN-END:variables
}
