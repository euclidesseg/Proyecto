
package ventanas;

import conectarSQL.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class DatosUsuario extends javax.swing.JFrame {
    String nombre = "", userUpdate = "";
    
    int dniU = 0;
    String nombreU = "";
    String apellidoU = "";
    String usuarioU = "";
    String claveU = "";
    String estadoU = "";
    String permisosU = "";
    
    public DatosUsuario() {
        userUpdate = ListUser.userUpdate;
        cargarFormulario();
        initComponents();
        this.setTitle("Datos del usuario " + nombre);
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        txt_dni.setEditable(false);

        ImageIcon fondoInterfaz = new ImageIcon("src/imagenes/wallpaper1.jpg");
        Icon fondo = new ImageIcon(fondoInterfaz.getImage().getScaledInstance(lbl_wallpaper.getWidth(),
                lbl_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lbl_wallpaper.setIcon(fondo);
        lbl_user.setText("Informacion de " + userUpdate);
        
        txt_dni.setText(String.valueOf(dniU));
        txt_nombre.setText(nombreU);
        txt_apellido.setText(apellidoU);
        txt_usuario.setText(usuarioU);
        txt_clave.setText(claveU);
        check.setSelectedItem(permisosU);
        
        if(estadoU.equals("TRUE")){
            jradio_true.setSelected(true);  
            jradio_false.setEnabled(false);
        }else{         
            jradio_false.setSelected(true);
            jradio_true.setEnabled(false);
        } 
          
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Administrador.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        check = new javax.swing.JComboBox<>();
        lbl_estado = new javax.swing.JLabel();
        jradio_true = new javax.swing.JRadioButton();
        jradio_false = new javax.swing.JRadioButton();
        btn_nuevo = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txt_clave = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_usuario.setBackground(new java.awt.Color(153, 204, 255));
        txt_usuario.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txt_usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 160, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 60, -1));

        lbl_apellido.setBackground(new java.awt.Color(0, 0, 0));
        lbl_apellido.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl_apellido.setForeground(new java.awt.Color(0, 0, 0));
        lbl_apellido.setText("Nombre");
        jPanel1.add(lbl_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 60, -1));

        txt_nombre.setBackground(new java.awt.Color(153, 204, 255));
        txt_nombre.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 160, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Dni usuario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, -1));

        txt_dni.setBackground(new java.awt.Color(153, 204, 255));
        txt_dni.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txt_dni.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Apellido");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, -1));

        txt_apellido.setBackground(new java.awt.Color(153, 204, 255));
        txt_apellido.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txt_apellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Clave");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Permisos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 80, -1));

        check.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        check.setForeground(new java.awt.Color(153, 204, 255));
        check.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Superusuario", "Administrador" }));
        check.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 160, 30));

        lbl_estado.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl_estado.setForeground(new java.awt.Color(0, 0, 0));
        lbl_estado.setText("Estado");
        jPanel1.add(lbl_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 60, 20));

        jradio_true.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jradio_true.setForeground(new java.awt.Color(0, 0, 0));
        jradio_true.setText("TRUE");
        jradio_true.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jradio_trueMouseClicked(evt);
            }
        });
        jPanel1.add(jradio_true, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        jradio_false.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jradio_false.setForeground(new java.awt.Color(0, 0, 0));
        jradio_false.setText("FALSE");
        jradio_false.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jradio_falseMouseClicked(evt);
            }
        });
        jPanel1.add(jradio_false, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        btn_nuevo.setBackground(new java.awt.Color(153, 204, 255));
        btn_nuevo.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btn_nuevo.setForeground(new java.awt.Color(0, 0, 0));
        btn_nuevo.setText("NUEVO ");
        btn_nuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 90, 30));

        btn_eliminar.setBackground(new java.awt.Color(153, 204, 255));
        btn_eliminar.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 100, 30));

        jButton4.setBackground(new java.awt.Color(153, 204, 255));
        jButton4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("MODIFICAR");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 100, 30));

        txt_clave.setBackground(new java.awt.Color(153, 204, 255));
        txt_clave.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txt_clave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txt_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 252, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 430, 510));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Realizado por Euclides Perez ©");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 250, 20));

        lbl_user.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 230, 30));
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jradio_trueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jradio_trueMouseClicked
        if(jradio_true.isSelected()){
            jradio_false.setEnabled(false);
        }else{
            jradio_false.setEnabled(true);
        }
    }//GEN-LAST:event_jradio_trueMouseClicked

    private void jradio_falseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jradio_falseMouseClicked
        if(jradio_false.isSelected()){
            jradio_true.setEnabled(false);
        }else{
            jradio_true.setEnabled(true);
        }
    }//GEN-LAST:event_jradio_falseMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String permisos = check.getSelectedItem().toString();
        
        if(jradio_true.isSelected()){
            estadoU = "TRUE";
        }else if(jradio_false.isSelected()){
            estadoU = "FALSE";
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona un estado");   
        }
        try{
            Conexion cnx = new Conexion();
            PreparedStatement pst = cnx.getConnection().prepareStatement(""
                    + "UPDATE USUARIOS SET NOMBRE = ?, APELLIDO = ?, USERNAME = ?, CLAVE = ?, PERMISOS = ?, ESTADO = ? WHERE DNI_USUARIO = " + dniU ); 
            
            pst.setString(1,txt_nombre.getText().trim());
            pst.setString(2,txt_apellido.getText().trim());
            pst.setString(3,txt_usuario.getText().trim());
            pst.setString(4,txt_clave.getText().trim());
            pst.setString(5,check.getSelectedItem().toString());
            pst.setString(6,estadoU);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Actualizado");
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Error intentando actualizar");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        try{
            Conexion cnx = new Conexion();
             PreparedStatement pst = cnx.getConnection().prepareStatement("DELETE FROM USUARIOS WHERE DNI_USUARIO = " + dniU);
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "Usuario eliminado");
             this.setVisible(false);
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, "Error eliminando este usuario");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        RegisterUser register = new RegisterUser();
        this.setVisible(false);
        register.setVisible(true);
    }//GEN-LAST:event_btn_nuevoActionPerformed

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
            java.util.logging.Logger.getLogger(DatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox<String> check;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jradio_false;
    private javax.swing.JRadioButton jradio_true;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JPasswordField txt_clave;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
    
public void cargarFormulario(){
        try{   
        Conexion cnx = new Conexion();
        PreparedStatement pst = cnx.getConnection().prepareStatement("SELECT DNI_USUARIO,NOMBRE,APELLIDO,USERNAME,CLAVE,PERMISOS,ESTADO FROM USUARIOS WHERE USERNAME = '"+userUpdate+"'");
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
        dniU = rs.getInt("DNI_USUARIO");
        nombreU = rs.getString("NOMBRE");
        apellidoU = rs.getString("APELLIDO");
        usuarioU = rs.getString("USERNAME");
        claveU = rs.getString("CLAVE");
        permisosU = rs.getString("PERMISOS");
        estadoU = rs.getString("ESTADO");
        }
    }catch(SQLException err){
        JOptionPane.showMessageDialog(null,"Error al cargfar formulario contacte al administrador");
    }
}
}
