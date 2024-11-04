
package UI;

public class Calculator extends javax.swing.JFrame {

    double NumEnter1, NumEnter2, Result;
    String operation;
    
    public Calculator() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtscreen = new javax.swing.JTextField();
        button1 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        buttonDot = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        buttonMultiplication = new javax.swing.JButton();
        buttonDivide = new javax.swing.JButton();
        buttonSubtract = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearEntryButton = new javax.swing.JButton();
        positiveNegative = new javax.swing.JButton();
        powerON = new javax.swing.JRadioButton();
        powerOFF = new javax.swing.JRadioButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        txtscreen.setBackground(new java.awt.Color(255, 232, 241));
        txtscreen.setFont(new java.awt.Font("Segoe UI Variable", 0, 48)); // NOI18N
        txtscreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtscreen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.darkGray));
        txtscreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtscreenActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(255, 211, 231));
        button1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        button1.setForeground(new java.awt.Color(102, 102, 102));
        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(255, 211, 231));
        button4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        button4.setForeground(new java.awt.Color(102, 102, 102));
        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(255, 211, 231));
        button7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        button7.setForeground(new java.awt.Color(102, 102, 102));
        button7.setText("7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        buttonDot.setBackground(new java.awt.Color(255, 211, 231));
        buttonDot.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        buttonDot.setForeground(new java.awt.Color(102, 102, 102));
        buttonDot.setText(".");
        buttonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDotActionPerformed(evt);
            }
        });

        button0.setBackground(new java.awt.Color(255, 211, 231));
        button0.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        button0.setForeground(new java.awt.Color(102, 102, 102));
        button0.setText("0");
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(255, 211, 231));
        button8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        button8.setForeground(new java.awt.Color(102, 102, 102));
        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button5.setBackground(new java.awt.Color(255, 211, 231));
        button5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        button5.setForeground(new java.awt.Color(102, 102, 102));
        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(255, 211, 231));
        button2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        button2.setForeground(new java.awt.Color(102, 102, 102));
        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(255, 211, 231));
        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clearButton.setForeground(new java.awt.Color(102, 102, 102));
        clearButton.setText("AC");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        button9.setBackground(new java.awt.Color(255, 211, 231));
        button9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        button9.setForeground(new java.awt.Color(102, 102, 102));
        button9.setText("9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(255, 211, 231));
        button6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        button6.setForeground(new java.awt.Color(102, 102, 102));
        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(255, 211, 231));
        button3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        button3.setForeground(new java.awt.Color(102, 102, 102));
        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        equalsButton.setBackground(new java.awt.Color(255, 211, 231));
        equalsButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        equalsButton.setForeground(new java.awt.Color(102, 102, 102));
        equalsButton.setText("=");
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });

        buttonAdd.setBackground(new java.awt.Color(235, 242, 244));
        buttonAdd.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(102, 102, 102));
        buttonAdd.setText("+");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonMultiplication.setBackground(new java.awt.Color(235, 242, 244));
        buttonMultiplication.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        buttonMultiplication.setForeground(new java.awt.Color(102, 102, 102));
        buttonMultiplication.setText("*");
        buttonMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiplicationActionPerformed(evt);
            }
        });

        buttonDivide.setBackground(new java.awt.Color(235, 242, 244));
        buttonDivide.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        buttonDivide.setForeground(new java.awt.Color(102, 102, 102));
        buttonDivide.setText("/");
        buttonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivideActionPerformed(evt);
            }
        });

        buttonSubtract.setBackground(new java.awt.Color(235, 242, 244));
        buttonSubtract.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        buttonSubtract.setForeground(new java.awt.Color(102, 102, 102));
        buttonSubtract.setText("-");
        buttonSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubtractActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(235, 242, 244));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(102, 102, 102));
        deleteButton.setText("Del");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearEntryButton.setBackground(new java.awt.Color(255, 211, 231));
        clearEntryButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearEntryButton.setForeground(new java.awt.Color(102, 102, 102));
        clearEntryButton.setText("CE");
        clearEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearEntryButtonActionPerformed(evt);
            }
        });

        positiveNegative.setBackground(new java.awt.Color(255, 211, 231));
        positiveNegative.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        positiveNegative.setForeground(new java.awt.Color(102, 102, 102));
        positiveNegative.setText("+/-");
        positiveNegative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positiveNegativeActionPerformed(evt);
            }
        });

        buttonGroup1.add(powerON);
        powerON.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        powerON.setForeground(new java.awt.Color(255, 102, 102));
        powerON.setText("ON");
        powerON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerONActionPerformed(evt);
            }
        });

        buttonGroup1.add(powerOFF);
        powerOFF.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        powerOFF.setForeground(new java.awt.Color(255, 102, 102));
        powerOFF.setText("OFF");
        powerOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerOFFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(positiveNegative, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(powerON, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(powerOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonSubtract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonMultiplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(txtscreen, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(positiveNegative, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(powerON, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(powerOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(buttonMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterNumbers(String q){
        String Nums = txtscreen.getText() + q;
        txtscreen.setText(Nums);
    }
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        EnterNumbers("1");
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        EnterNumbers("2");
    }//GEN-LAST:event_button2ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        EnterNumbers("4");
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        EnterNumbers("5");
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
       EnterNumbers("6");
    }//GEN-LAST:event_button6ActionPerformed

    private void buttonMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultiplicationActionPerformed
        NumEnter1 = Double.parseDouble(txtscreen.getText());
        txtscreen.setText("");
        operation = "*";
    }//GEN-LAST:event_buttonMultiplicationActionPerformed

    private void buttonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivideActionPerformed
        NumEnter1 = Double.parseDouble(txtscreen.getText());
        txtscreen.setText("");
        operation = "/";
    }//GEN-LAST:event_buttonDivideActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        EnterNumbers("3");
    }//GEN-LAST:event_button3ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        EnterNumbers("7");
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        EnterNumbers("8");
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        EnterNumbers("9");
    }//GEN-LAST:event_button9ActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        EnterNumbers("0");
    }//GEN-LAST:event_button0ActionPerformed

    private void buttonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDotActionPerformed
        if (!txtscreen.getText().contains(".")){
            txtscreen.setText(txtscreen.getText() + buttonDot.getText());
        }
        
    }//GEN-LAST:event_buttonDotActionPerformed

    private void buttonSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubtractActionPerformed
        NumEnter1 = Double.parseDouble(txtscreen.getText());
        txtscreen.setText("");
        operation = "-";
    }//GEN-LAST:event_buttonSubtractActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        NumEnter1 = Double.parseDouble(txtscreen.getText());
        txtscreen.setText("");
        operation = "+";
    }//GEN-LAST:event_buttonAddActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        txtscreen.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String del = null;
        
        if (txtscreen.getText().length() > 0){
            
            StringBuilder sb = new StringBuilder(txtscreen.getText());
            sb.deleteCharAt(txtscreen.getText().length() - 1);
            del = sb.toString();
            txtscreen.setText(del);
            
            
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearEntryButtonActionPerformed
        txtscreen.setText("");
        
        String Fn, Sn;
        Fn = String.valueOf(NumEnter1);
        Sn = String.valueOf(NumEnter2);
        
        Fn = "";
        Sn = "";
    }//GEN-LAST:event_clearEntryButtonActionPerformed

    private void positiveNegativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positiveNegativeActionPerformed
        double nums = Double.parseDouble(txtscreen.getText());
        nums = nums * (-1);
        if(Result % 1 == 0){
                txtscreen.setText(String.valueOf((int)nums));
            }
            else{
                txtscreen.setText(String.valueOf(nums));
            }
        
        
    }//GEN-LAST:event_positiveNegativeActionPerformed

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed
        NumEnter2 = Double.parseDouble(txtscreen.getText());
        if(operation == "+"){
            Result = NumEnter1 + NumEnter2;
            if(Result % 1 == 0){
                txtscreen.setText(String.valueOf((int)Result));
            }
            else{
                txtscreen.setText(String.valueOf(Result));
            }
        }
        else if(operation == "-"){
            Result = NumEnter1 - NumEnter2;
            if(Result % 1 == 0){
                txtscreen.setText(String.valueOf((int)Result));
            }
            else{
                txtscreen.setText(String.valueOf(Result));
            }
            
        }
        else if(operation == "*"){
            Result = NumEnter1 * NumEnter2;
            if(Result % 1 == 0){
                txtscreen.setText(String.valueOf((int)Result));
            }
            else{
                txtscreen.setText(String.valueOf(Result));
            }
            
        }
        else if(operation == "/"){
            Result = NumEnter1 / NumEnter2;
            if(Result % 1 == 0){
                txtscreen.setText(String.valueOf((int)Result));
            }
            else{
                txtscreen.setText(String.valueOf(Result));
            }
            
        }
    }//GEN-LAST:event_equalsButtonActionPerformed

    //POWER ON
    private void powerONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerONActionPerformed
        //enable all buttons
        txtscreen.setText("");
        txtscreen.setEnabled(true);
        
        button0.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonAdd.setEnabled(true);
        buttonSubtract.setEnabled(true);
        buttonMultiplication.setEnabled(true);
        buttonDivide.setEnabled(true);
        equalsButton.setEnabled(true);
        deleteButton.setEnabled(true);
        clearButton.setEnabled(true);
        clearEntryButton.setEnabled(true);
        positiveNegative.setEnabled(true);
    }//GEN-LAST:event_powerONActionPerformed

    private void txtscreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtscreenActionPerformed
        txtscreen.setText(txtscreen.getText()+ "1");
    }//GEN-LAST:event_txtscreenActionPerformed

    private void powerOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerOFFActionPerformed
        txtscreen.setText("POWER OFF");
        txtscreen.setEnabled(false);
        
        button0.setEnabled(false);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        buttonDot.setEnabled(false);
        buttonAdd.setEnabled(false);
        buttonSubtract.setEnabled(false);
        buttonMultiplication.setEnabled(false);
        buttonDivide.setEnabled(false);
        equalsButton.setEnabled(false);
        deleteButton.setEnabled(false);
        clearButton.setEnabled(false);
        clearEntryButton.setEnabled(false);
        positiveNegative.setEnabled(false);
    }//GEN-LAST:event_powerOFFActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDivide;
    private javax.swing.JButton buttonDot;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonMultiplication;
    private javax.swing.JButton buttonSubtract;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearEntryButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton positiveNegative;
    private javax.swing.JRadioButton powerOFF;
    private javax.swing.JRadioButton powerON;
    private javax.swing.JTextField txtscreen;
    // End of variables declaration//GEN-END:variables
}
