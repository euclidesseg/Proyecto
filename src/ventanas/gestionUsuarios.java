/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import conectarSQL.Conexion;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class gestionUsuarios extends javax.swing.JFrame {


    public gestionUsuarios() {
        initComponents();
        this.setTitle("Gestion de usuarios");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.cargarTabla();;

        ImageIcon fondoInterfaz = new ImageIcon("src/imagenes/wallpaper1.jpg");
        Icon fondo = new ImageIcon(fondoInterfaz.getImage().getScaledInstance(lbl_wallpaper.getWidth(),
                lbl_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lbl_wallpaper.setIcon(fondo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_usuarios = new javax.swing.JTable();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtable_usuarios.setBackground(new java.awt.Color(51, 204, 255));
        jtable_usuarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtable_usuarios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtable_usuarios.setForeground(new java.awt.Color(0, 0, 0));
        jtable_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICACION", "NOMBRE", "APELLIDO", "USUARIO", "CLAVE", "PERMISOS", "ESTADO", "REGISTRADO POR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_usuarios.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jtable_usuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 960, 560));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N
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

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("MODIFICAR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 100, 30));

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("ELIMINAR");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 90, 30));

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("BUSCAR");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 40, 430, 560));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuarios");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Realizado por Euclides Perez ©");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 250, 20));
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 660));

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
            java.util.logging.Logger.getLogger(gestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jradio_false;
    private javax.swing.JRadioButton jradio_true;
    private javax.swing.JTable jtable_usuarios;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JTextField txt_nombre1;
    private javax.swing.JTextField txt_nombre2;
    private javax.swing.JTextField txt_nombre3;
    private javax.swing.JTextField txt_nombre6;
    private javax.swing.JTextField txt_nombre7;
    // End of variables declaration//GEN-END:variables
    
    private void cargarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) jtable_usuarios.getModel();
        modeloTabla.setRowCount(0);//esto se hace para que cada vez que se ingrese un registro o se modifique este se actualice
        
        int columnas;
        
        try{
            Conexion cnx = new Conexion();
            PreparedStatement pst = cnx.getConnection().prepareStatement("SELECT DNI_USUARIO,NOMBRE,APELLIDO,USERNAME,CLAVE,PERMISOS,ESTADO,"
                    + "REGISTRADO_POR FROM USUARIOS");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
                    
            while(rs.next()){
                /* creamos un arreglol de tipo objeto que se llame fila para */
                Object[] fila = new Object[columnas];
                for(int indice = 0; indice < columnas; indice ++){
                    //a continuacion llenamos nuestro objeto
                    fila[indice] = rs.getObject(indice +1);  
                
                }
                modeloTabla.addRow(fila);  
            }
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,"Error al cargar datos contacte al administrador");
        }
    }
}
