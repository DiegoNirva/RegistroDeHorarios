package Calculadora;

public class Calculadora extends javax.swing.JFrame {

    public Float primerNumero, segundoNumero;
    public String operador;

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        panelPrincipal = new javax.swing.JPanel();
        btbClean = new java.awt.Button();
        btmPorcentaje = new java.awt.Button();
        button3 = new java.awt.Button();
        btm9 = new java.awt.Button();
        btm8 = new java.awt.Button();
        btm7 = new java.awt.Button();
        btm6 = new java.awt.Button();
        btm2 = new java.awt.Button();
        btm4 = new java.awt.Button();
        btm5 = new java.awt.Button();
        btm1 = new java.awt.Button();
        btm3 = new java.awt.Button();
        btmBorrar = new java.awt.Button();
        btmDiv = new java.awt.Button();
        btmResta = new java.awt.Button();
        btmSuma = new java.awt.Button();
        btmPosNeg = new java.awt.Button();
        btmZero = new java.awt.Button();
        btmComa = new java.awt.Button();
        btmIgual = new java.awt.Button();
        txtPantalla = new javax.swing.JLabel();

        textField1.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        btbClean.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btbClean.setLabel("C");
        btbClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCleanActionPerformed(evt);
            }
        });

        btmPorcentaje.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btmPorcentaje.setLabel("%");

        button3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button3.setLabel("CE");

        btm9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btm9.setLabel("9");
        btm9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm9ActionPerformed(evt);
            }
        });

        btm8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btm8.setLabel("8");
        btm8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm8ActionPerformed(evt);
            }
        });

        btm7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btm7.setLabel("7");
        btm7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm7ActionPerformed(evt);
            }
        });

        btm6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btm6.setLabel("6");
        btm6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm6ActionPerformed(evt);
            }
        });

        btm2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btm2.setLabel("2");
        btm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm2ActionPerformed(evt);
            }
        });

        btm4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btm4.setLabel("4");
        btm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm4ActionPerformed(evt);
            }
        });

        btm5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btm5.setLabel("5");
        btm5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm5ActionPerformed(evt);
            }
        });

        btm1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btm1.setLabel("1");
        btm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm1ActionPerformed(evt);
            }
        });

        btm3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btm3.setLabel("3");
        btm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm3ActionPerformed(evt);
            }
        });

        btmBorrar.setBackground(new java.awt.Color(204, 204, 204));
        btmBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btmBorrar.setLabel("*");
        btmBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBorrarActionPerformed(evt);
            }
        });

        btmDiv.setBackground(new java.awt.Color(204, 204, 204));
        btmDiv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btmDiv.setLabel(" ÷");
        btmDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmDivActionPerformed(evt);
            }
        });

        btmResta.setBackground(new java.awt.Color(204, 204, 204));
        btmResta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btmResta.setLabel("-");
        btmResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmRestaActionPerformed(evt);
            }
        });

        btmSuma.setBackground(new java.awt.Color(204, 204, 204));
        btmSuma.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btmSuma.setLabel("+");
        btmSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSumaActionPerformed(evt);
            }
        });

        btmPosNeg.setLabel("+/-");
        btmPosNeg.setName(""); // NOI18N

        btmZero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btmZero.setLabel("0");
        btmZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmZeroActionPerformed(evt);
            }
        });

        btmComa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btmComa.setLabel(".");
        btmComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmComaActionPerformed(evt);
            }
        });

        btmIgual.setBackground(new java.awt.Color(204, 204, 204));
        btmIgual.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btmIgual.setLabel("=");
        btmIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmIgualActionPerformed(evt);
            }
        });

        txtPantalla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPantalla.setForeground(new java.awt.Color(0, 0, 0));
        txtPantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtPantalla.setText("0");
        txtPantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btm7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btmPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(btm8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btm9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btbClean, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                    .addComponent(btmPosNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btmZero, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btmComa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btm4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btm1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                                            .addComponent(btm5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btm6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                                            .addComponent(btm2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btm3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btmResta, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btmSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btmDiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btmBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmIgual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbClean, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btmBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(btmResta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btm4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btm6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btm5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btm2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btm1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btm3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btmZero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmPosNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmComa, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }



//botones
    private void btm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm1ActionPerformed
        if (txtPantalla.getText().equalsIgnoreCase("0")) {
            txtPantalla.setText("1");

        } else {
            txtPantalla.setText(txtPantalla.getText() + "1");
        }
    }//GEN-LAST:event_btm1ActionPerformed

    //metodo quitar ceros
    public String sinCero(Float resultado){
        String retorno = "";
        retorno = Float.toString(resultado);
        if(resultado%1==0){
            retorno = retorno.substring(0, retorno.length()-2);
        }
        return retorno;
    }
    
    
    private void btmIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmIgualActionPerformed
        this.segundoNumero = Float.parseFloat(txtPantalla.getText());

        switch (operador) {
            case "+":
                txtPantalla.setText(sinCero(primerNumero + segundoNumero));
                break;
            case "-":
                txtPantalla.setText(sinCero(primerNumero - segundoNumero));
                break;
            case "*":
                txtPantalla.setText(sinCero(primerNumero * segundoNumero));
                break;
            case "/":
                if (segundoNumero == 0) {
                    txtPantalla.setText("No se puede dividir entre cero");
                } else {
                    txtPantalla.setText(sinCero(primerNumero / segundoNumero));

                }
                break;
                default:
        }
    }//GEN-LAST:event_btmIgualActionPerformed

    private void btbCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCleanActionPerformed
        txtPantalla.setText("");
    }//GEN-LAST:event_btbCleanActionPerformed

    private void btmZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmZeroActionPerformed
        if (txtPantalla.getText().equalsIgnoreCase("0")) {
            txtPantalla.setText("0");

        } else {
            txtPantalla.setText(txtPantalla.getText() + "0");
        }

    }//GEN-LAST:event_btmZeroActionPerformed

    private void btmComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmComaActionPerformed
        if(!(txtPantalla.getText().contains("."))){
            if (txtPantalla.getText().equalsIgnoreCase("0")) {
            txtPantalla.setText("0.");
            }else {
            txtPantalla.setText(txtPantalla.getText() + ".");
        }
        }
    }//GEN-LAST:event_btmComaActionPerformed

    private void btm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm2ActionPerformed
        if (txtPantalla.getText().equalsIgnoreCase("0")) {
            txtPantalla.setText("2");

        } else {
            txtPantalla.setText(txtPantalla.getText() + "2");
        }

    }//GEN-LAST:event_btm2ActionPerformed

    private void btm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm3ActionPerformed
        if (txtPantalla.getText().equalsIgnoreCase("0")) {
            txtPantalla.setText("3");

        } else {
            txtPantalla.setText(txtPantalla.getText() + "3");
        }

    }//GEN-LAST:event_btm3ActionPerformed

    private void btm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm4ActionPerformed
        if (txtPantalla.getText().equalsIgnoreCase("0")) {
            txtPantalla.setText("4");

        } else {
            txtPantalla.setText(txtPantalla.getText() + "4");
        }

    }//GEN-LAST:event_btm4ActionPerformed

    private void btm5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm5ActionPerformed
        if (txtPantalla.getText().equalsIgnoreCase("0")) {
            txtPantalla.setText("5");

        } else {
            txtPantalla.setText(txtPantalla.getText() + "5");
        }

    }//GEN-LAST:event_btm5ActionPerformed

    private void btm6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm6ActionPerformed
        if (txtPantalla.getText().equalsIgnoreCase("0")) {
            txtPantalla.setText("6");

        } else {
            txtPantalla.setText(txtPantalla.getText() + "6");
        }

    }//GEN-LAST:event_btm6ActionPerformed

    private void btm7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm7ActionPerformed
        if (txtPantalla.getText().equalsIgnoreCase("0")) {
            txtPantalla.setText("7");

        } else {
            txtPantalla.setText(txtPantalla.getText() + "7");
        }

    }//GEN-LAST:event_btm7ActionPerformed

    private void btm8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm8ActionPerformed
        if (txtPantalla.getText().equalsIgnoreCase("0")) {
            txtPantalla.setText("8");

        } else {
            txtPantalla.setText(txtPantalla.getText() + "8");
        }

    }//GEN-LAST:event_btm8ActionPerformed

    private void btm9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm9ActionPerformed
        if (txtPantalla.getText().equalsIgnoreCase("0")) {
            txtPantalla.setText("9");

        } else {
            txtPantalla.setText(txtPantalla.getText() + "9");
        }

    }//GEN-LAST:event_btm9ActionPerformed

    private void btmBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBorrarActionPerformed
        this.primerNumero = Float.parseFloat(txtPantalla.getText());
        this.operador = "*";
        txtPantalla.setText("");
    }//GEN-LAST:event_btmBorrarActionPerformed

    private void btmSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSumaActionPerformed
        this.primerNumero = Float.parseFloat(txtPantalla.getText());
        this.operador = "+";
        txtPantalla.setText("");
    }//GEN-LAST:event_btmSumaActionPerformed

    private void btmRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmRestaActionPerformed
        this.primerNumero = Float.parseFloat(txtPantalla.getText());
        this.operador = "-";
        txtPantalla.setText("");
    }//GEN-LAST:event_btmRestaActionPerformed

    private void btmDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmDivActionPerformed
        this.primerNumero = Float.parseFloat(txtPantalla.getText());
        this.operador = "/";
        txtPantalla.setText("");
    }//GEN-LAST:event_btmDivActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btbClean;
    private java.awt.Button btm1;
    private java.awt.Button btm2;
    private java.awt.Button btm3;
    private java.awt.Button btm4;
    private java.awt.Button btm5;
    private java.awt.Button btm6;
    private java.awt.Button btm7;
    private java.awt.Button btm8;
    private java.awt.Button btm9;
    private java.awt.Button btmBorrar;
    private java.awt.Button btmComa;
    private java.awt.Button btmDiv;
    private java.awt.Button btmIgual;
    private java.awt.Button btmPorcentaje;
    private java.awt.Button btmPosNeg;
    private java.awt.Button btmResta;
    private java.awt.Button btmSuma;
    private java.awt.Button btmZero;
    private java.awt.Button button3;
    private javax.swing.JPanel panelPrincipal;
    private java.awt.TextField textField1;
    private javax.swing.JLabel txtPantalla;
    // End of variables declaration//GEN-END:variables

}
