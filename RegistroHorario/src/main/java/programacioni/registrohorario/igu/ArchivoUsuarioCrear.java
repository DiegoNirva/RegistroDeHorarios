package programacioni.registrohorario.igu;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import programacioni.registrohorario.logica.Controladora;

public class ArchivoUsuarioCrear extends javax.swing.JFrame {

    Controladora control;

    public ArchivoUsuarioCrear() {
        initComponents();
        control = new Controladora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContraseia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRoll = new javax.swing.JTextField();
        btnCrearUsuario = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jlabelErrorDni = new javax.swing.JLabel();
        jlabelErrorContrasenia = new javax.swing.JLabel();
        jlabelErrorNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Alta de usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setText("DNI");

        txtDni.setText("DNI sin puntos");
        txtDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDniMousePressed(evt);
            }
        });
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        jLabel3.setText("NOMBRE DE USUARIO");

        jLabel4.setText("CONTRASEÑA");

        txtContraseia.setText("maximo 8 caracteres ");
        txtContraseia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseiaMousePressed(evt);
            }
        });
        txtContraseia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseiaActionPerformed(evt);
            }
        });

        jLabel5.setText("ROLL");

        txtRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRollActionPerformed(evt);
            }
        });

        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jlabelErrorDni.setForeground(new java.awt.Color(255, 0, 51));

        jlabelErrorContrasenia.setForeground(new java.awt.Color(255, 0, 51));

        jlabelErrorNombre.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContraseia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnCrearUsuario)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlabelErrorContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlabelErrorDni, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlabelErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabelErrorDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlabelErrorNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jlabelErrorContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        String dni = null, contrasenia = null, nombreUsuario = null, roll = null; //variables de usuario
        boolean bandera = true; //condicionador de guardado
        //guardamos datos en variables.
        if (txtDni.getText().equalsIgnoreCase("") || txtDni.getText().equalsIgnoreCase("DNI sin puntos")) {
            jlabelErrorDni.setText("Debe ingresar un Dni");
            bandera = false;
        } else {
            dni = txtDni.getText();
            jlabelErrorDni.setText("");
        }
        //condicon para contrasenia
        if (txtContraseia.getText().equalsIgnoreCase("") || txtContraseia.getText().equalsIgnoreCase("maximo 8 caracteres ")) {
            jlabelErrorContrasenia.setText("Debe ingresar una contraseña");
            bandera = false;

        } else {
            contrasenia = txtContraseia.getText();
            jlabelErrorContrasenia.setText("");
        }
        //condicion para nombre de usuario
        if (txtNombreUsuario.getText().equalsIgnoreCase("") || txtNombreUsuario.getText().equalsIgnoreCase("maximo 8 caracteres ")) {
            jlabelErrorNombre.setText("Debe ingresar un Nombre");
            bandera = false;

        } else {
            nombreUsuario = txtNombreUsuario.getText();
            jlabelErrorNombre.setText("");
        }
        //no es necesario definir un roll
        roll = txtRoll.getText();

        //guardamos en la DB
        if (bandera) {
            control.guardarUsuario(dni, contrasenia, nombreUsuario, roll);

            //dialogo de exitoso
            JOptionPane opcionPane = new JOptionPane("Usuario Creado");
            opcionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = opcionPane.createDialog("Usuario Creado");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }


    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void txtContraseiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseiaActionPerformed

    private void txtRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRollActionPerformed

    private void txtDniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDniMousePressed
        txtDni.setText(""); //seteamos para ingresar datos
    }//GEN-LAST:event_txtDniMousePressed

    private void txtContraseiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseiaMousePressed
        txtContraseia.setText("");//seteamos para ingresar contraseña
    }//GEN-LAST:event_txtContraseiaMousePressed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //se borra todo los campos
        txtDni.setText("");
        jlabelErrorDni.setText("");
        txtContraseia.setText("");
        jlabelErrorContrasenia.setText("");
        txtNombreUsuario.setText("");
        jlabelErrorNombre.setText("");
        txtRoll.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabelErrorContrasenia;
    private javax.swing.JLabel jlabelErrorDni;
    private javax.swing.JLabel jlabelErrorNombre;
    private javax.swing.JTextField txtContraseia;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtRoll;
    // End of variables declaration//GEN-END:variables
}
