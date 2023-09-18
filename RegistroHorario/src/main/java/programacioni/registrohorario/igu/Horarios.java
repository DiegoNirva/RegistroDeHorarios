package programacioni.registrohorario.igu;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import programacioni.registrohorario.logica.Controladora;
import programacioni.registrohorario.logica.Horario;
import programacioni.registrohorario.logica.Usuario;

public class Horarios extends javax.swing.JFrame {

    //incamos a otras clases: 
    Controladora control = null;
    Usuario usuario;
    Horario hora;

    public Horarios() {
        control = new Controladora();
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordUsuario = new javax.swing.JPasswordField();
        BtnVerificar = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();
        jTxtUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 28, 112));

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\JAVA\\RegistroHorario\\iconos\\iconUser.png")); // NOI18N

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña");

        jPasswordUsuario.setBackground(new java.awt.Color(187, 187, 187));
        jPasswordUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordUsuario.setActionCommand("<Not Set>");
        jPasswordUsuario.setCaretColor(new java.awt.Color(70, 73, 75));
        jPasswordUsuario.setDisabledTextColor(new java.awt.Color(187, 187, 187));

        BtnVerificar.setText("Resgistrar");
        BtnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerificarActionPerformed(evt);
            }
        });

        jLabelError.setBackground(new java.awt.Color(0, 0, 0));
        jLabelError.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(0, 0, 0));
        jLabelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTxtUsuario.setBackground(new java.awt.Color(187, 187, 187));
        jTxtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTxtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtUsuario.setText("Ingrese DNI");
        jTxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTxtUsuarioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(BtnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(BtnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
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

    private void BtnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerificarActionPerformed
        //traemos datos ingresados
        String usuario = jTxtUsuario.getText();
        String contrasenia = String.valueOf(jPasswordUsuario.getPassword());

        //traemos el usuario
        List<Usuario> listaUsuario = control.listaUsuarios();
        //verificamos que los datos existan.
        if (listaUsuario != null) {
            for (Usuario ver : listaUsuario) {
                if (usuario.equals("admin")) {
                    Admin verAdmin = new Admin();
                    verAdmin.setVisible(true);
                    verAdmin.setLocationRelativeTo(null);
                    break;
                }
                if (usuario.equals(ver.getDni()) && contrasenia.equals(ver.getContrasenia())) {
                    registroHorario(usuario);
                    jLabelError.setText("");
                    break;
                } else {
                    jLabelError.setText("Usuario o contraseña incorrecta");
                }
            }
        }


    }//GEN-LAST:event_BtnVerificarActionPerformed

    private void jTxtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtUsuarioMousePressed
        jTxtUsuario.setText("");
    }//GEN-LAST:event_jTxtUsuarioMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Horarios vista = new Horarios();
                vista.setVisible(true);
                vista.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordUsuario;
    private javax.swing.JTextField jTxtUsuario;
    // End of variables declaration//GEN-END:variables

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

    //metodo de toma de horario
    public void registroHorario(String id) {
        //buscar usuario
        usuario = control.buscarUsuario(id);

        //lista para recorrer horarios
        Deque<Horario> listaHorario = new LinkedList<>(control.buscarHorario());
        //formateamos hora y fecha
        SimpleDateFormat formatoDia = new SimpleDateFormat("dd-MM-yyyy");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        //registra fecha de ingreso
        Date fecha = new Date();
        String dia = formatoDia.format(fecha);
        //registra hora de ingreso
        LocalTime ingreso = LocalTime.now();
        String horaEntrada = ingreso.format(formato);
        //primer registro de tabla
        if (listaHorario.isEmpty()) {
            control.guardarHorarioIn(dia, horaEntrada, null, usuario);
            mostrarMensaje("Usuario correcto", "info", "Usuario correcto");

        } else {
            //desiganamos un iterador para el recorrido
            Iterator<Horario> Horarios = listaHorario.descendingIterator();

            //recorremos el iterador
            while (Horarios.hasNext()) {

                Horario usuarioRegistro = Horarios.next();
                //registro de horarios usuarios
                if (usuarioRegistro.getUsuario().getDni().equals(usuario.getDni())) {
                    //registro de dia diferentes
                    if (!usuarioRegistro.getDia().equalsIgnoreCase(dia)) {
                        control.guardarHorarioIn(dia, horaEntrada, null, usuario);
                        break;

                    } //registro de salida
                    else if (usuarioRegistro.getDia().equalsIgnoreCase(dia) && !usuarioRegistro.getHoraEntrada().equalsIgnoreCase("")) {
                        String horaSalida = ingreso.format(formato);
                        int idRegistro = usuarioRegistro.getRegistro(); //traemos el registro correspondiente al dia
                        this.hora = control.buscarHorarioId(idRegistro); // buscamos por Id de registro
                        control.editarSalida(horaSalida, hora);
                        mostrarMensaje("Usuario correcto", "info", "Usuario correcto");
                        break;
                    }

                } else { //guardamos otro usuario
                    control.guardarHorarioIn(dia, horaEntrada, null, usuario);
                    mostrarMensaje("Usuario correcto", "info", "Usuario correcto");
                    break;
                }
            }
        }

    }

}
