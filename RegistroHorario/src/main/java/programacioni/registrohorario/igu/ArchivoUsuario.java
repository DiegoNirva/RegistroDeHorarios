
package programacioni.registrohorario.igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import programacioni.registrohorario.logica.Controladora;
import programacioni.registrohorario.logica.Usuario;


public class ArchivoUsuario extends javax.swing.JFrame {

    //traemos el controlador de persistencia
     Controladora control;
    public ArchivoUsuario() {
        initComponents();
        control = new Controladora();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnCrearUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Usuario"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setText("Eliminar Usuario");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnEditarUsuario.setText("Editar Usuario");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEliminarUsuario)
                    .addComponent(btnCrearUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrearUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarUsuario))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        if(tablaUsuarios.getRowCount() > 0){
            if(tablaUsuarios.getSelectedRow() != -1){ //selecionamos un valor, que tiene que ser mayor a -1
                String dni = String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0)); //traemos el objeto selecionado
                control.eliminarUsuario(dni);
                mostrarMensaje("Usuario Elimiado", "info", "Se Elimino Usuario");
                cargarTablaUsuarios();
            }
            else {
                mostrarMensaje("No se selecciono ninguna Usuario", "Error", "Error al editar");
            }

        } else {
            mostrarMensaje("No hay registro para eliminar", "Error", "Error al editar");
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTablaUsuarios();
    }//GEN-LAST:event_formWindowOpened

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        ArchivoUsuarioCrear ver = new ArchivoUsuarioCrear();
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        this.dispose();
        //verificamos que la tabla no este vacia
        if(tablaUsuarios.getRowCount() > 0){
            if(tablaUsuarios.getSelectedRow() != -1){ //selecionamos un valor, que tiene que ser mayor a -1
                String dni = String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0)); //traemos el objeto selecionado
                ArchivoUsuarioEditar ver = new ArchivoUsuarioEditar(dni);
                ver.setVisible(true);
                ver.setLocationRelativeTo(null);
            }
            else {
                mostrarMensaje("No se selecciono ninguna Usuario", "Error", "Error al editar");
            }

        } else {
            mostrarMensaje("No hay registro para eliminar", "Error", "Error al editar");
        }
        
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaUsuarios() {
         //definir el modeto de tabla 
        DefaultTableModel modeloTabla = new DefaultTableModel(){

            //que fila y columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        //editamos nombres de columnas 
        String titulos[] = {"DNI","CONTRASEÑA","NOMBRE_USUARIO","ROLL"};
        //aplicamos los nombres a la tabla
        modeloTabla.setColumnIdentifiers(titulos);
        
        //traemos todos los usuarios
        List<Usuario> listaUsuario = control.traerUsuario();
        
        //verificamos que la lista no este vacia
        if(listaUsuario!=null){
            //recorremos lista
            for(Usuario ver: listaUsuario){
                //guardamos los datos en un objeto
            Object [] objeto ={ver.getDni(),ver.getContrasenia(),ver.getNombreUsuario(),ver.getRool()};
            
            //agregamos datos en tabla
            modeloTabla.addRow(objeto);
            }
            //actualizamos tabla
            tablaUsuarios.setModel(modeloTabla);
        }
            
        
    }
   
     //metodo de mensaje de accion
    private void mostrarMensaje(String mensaje, String tipo, String titulo) {

        JOptionPane opcionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            opcionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);

        } else if (tipo.equals("Error")) {
            opcionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }

        JDialog dialog = opcionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }
    
}
