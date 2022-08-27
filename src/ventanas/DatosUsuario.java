/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import conectarSQL.Conexion;
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
            int id;

    public DatosUsuario() {
        nombre = Login.nombreUsuario;
        initComponents();
        this.setTitle("Datos del usuario " + nombre);
        this.setLocationRelativeTo(null);
         this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon fondoInterfaz = new ImageIcon("src/imagenes/wallpaper1.jpg");
        Icon fondo = new ImageIcon(fondoInterfaz.getImage().getScaledInstance(lbl_wallpaper.getWidth(),
                lbl_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lbl_wallpaper.setIcon(fondo);
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
        txt_nombre2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        txt_nombre7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jradio_true = new javax.swing.JRadioButton();
        jradio_false = new javax.swing.JRadioButton();
        btn_nuevo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Datos de " + userUpdate, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombre2.setBackground(new java.awt.Color(153, 204, 255));
        txt_nombre2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_nombre2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txt_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 160, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        lbl_apellido.setBackground(new java.awt.Color(0, 0, 0));
        lbl_apellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_apellido.setForeground(new java.awt.Color(0, 0, 0));
        lbl_apellido.setText("Nombre");
        jPanel1.add(lbl_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        txt_nombre7.setBackground(new java.awt.Color(153, 204, 255));
        txt_nombre7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_nombre7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txt_nombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 160, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Dni usuario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txt_nombre6.setBackground(new java.awt.Color(153, 204, 255));
        txt_nombre6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_nombre6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txt_nombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Apellido");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, -1));

        txt_nombre1.setBackground(new java.awt.Color(153, 204, 255));
        txt_nombre1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_nombre1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txt_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Clave");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        txt_nombre3.setBackground(new java.awt.Color(153, 204, 255));
        txt_nombre3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_nombre3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txt_nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Permisos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(153, 204, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Superusuario", "Administrador" }));
        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 130, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Estado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 20));

        jradio_true.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jradio_true.setForeground(new java.awt.Color(0, 0, 0));
        jradio_true.setText("TRUE");
        jPanel1.add(jradio_true, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jradio_false.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jradio_false.setForeground(new java.awt.Color(0, 0, 0));
        jradio_false.setText("FALSE");
        jPanel1.add(jradio_false, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        btn_nuevo.setBackground(new java.awt.Color(153, 204, 255));
        btn_nuevo.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btn_nuevo.setForeground(new java.awt.Color(0, 0, 0));
        btn_nuevo.setText("NUEVO USUARIO");
        btn_nuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 140, 30));

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("ELIMINAR");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 100, 30));

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("BUSCAR");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 100, 30));

        jButton4.setBackground(new java.awt.Color(153, 204, 255));
        jButton4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("MODIFICAR");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 560));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Realizado por Euclides Perez ©");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 250, 20));
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jradio_false;
    private javax.swing.JRadioButton jradio_true;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JTextField txt_nombre1;
    private javax.swing.JTextField txt_nombre2;
    private javax.swing.JTextField txt_nombre3;
    private javax.swing.JTextField txt_nombre6;
    private javax.swing.JTextField txt_nombre7;
    // End of variables declaration//GEN-END:variables
    
   
}
