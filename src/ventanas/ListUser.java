
package ventanas;

import conectarSQL.Conexion;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class ListUser extends javax.swing.JFrame {
    public static String userUpdate = "";
    String nombre = Login.nombreUsuario;
    
    public ListUser() {
        initComponents();
        this.cargarTabla();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Lista de usuarios sesión de " + nombre);
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_usuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setForeground(new java.awt.Color(0, 204, 255));

        jtable_usuarios.setBackground(new java.awt.Color(51, 204, 255));
        jtable_usuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jtable_usuarios.setGridColor(new java.awt.Color(0, 51, 255));
        jtable_usuarios.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtable_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_usuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_usuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 980, 330));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("Usuarios Registrados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 6, 170, 30));

        btn_actualizar.setBackground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(0, 0, 0));
        btn_actualizar.setText("REFRESCAR");
        btn_actualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 100, 30));
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /*este metodo contien el evento que me permite obtener los datos del registro seleccionado*/
    private void jtable_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_usuariosMouseClicked
        try{
            int fila = jtable_usuarios.getSelectedRow();//tomaremos la fila seleccionada y guardaremos su indice en el campo fila
            userUpdate = jtable_usuarios.getValueAt(fila,3).toString();
            
            /* obtenermos el id que se encuentra en la columna 0 de la fila seleccionada*/
            DatosUsuario datosusuario = new DatosUsuario();
            datosusuario.setVisible(true);
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, "Error al obtener los datos contacte al administrador" );
        }
    }//GEN-LAST:event_jtable_usuariosMouseClicked

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
       cargarTabla();
    }//GEN-LAST:event_btn_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(ListUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable_usuarios;
    private javax.swing.JLabel lbl_wallpaper;
    // End of variables declaration//GEN-END:variables

    //este metodo me cargara la tabla desde la base de datos 
    private void cargarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) jtable_usuarios.getModel();
        jScrollPane1.setViewportView(jtable_usuarios);//de esta forma se hace que la tabla obtenga un scroll en caso de tener bastantes registros
        modeloTabla.setRowCount(0);//esto se hace para que cada vez que se ingrese un registro o se modifique este se actualice
        
        int columnas;
        
        try{
            Conexion cnx = new Conexion();
            PreparedStatement pst = cnx.getConnection().prepareStatement("SELECT DNI_USUARIO,NOMBRE,APELLIDO,USERNAME,CLAVE,PERMISOS,ESTADO,"
                    + "REGISTRADO_POR FROM USUARIOS");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData(); /* esto es para que nos traiga los metadatos
                                                        * de nuestra consulta y poder determinar cuantas columnas trae esta consulta */
            columnas = rsmd.getColumnCount();
                    
            while(rs.next()){//primer indice es 1
                /* creamos un vector(arreglo)  de tipo objeto que se llame fila para llenarlo con cada fila que traiga la consulta*/
                Object[] fila = new Object[columnas];
                for(int indice = 0; indice < columnas; indice ++){
                    
                    //a continuacion llenamos nuestro vector
                    fila[indice] = rs.getObject(indice +1);  
                    /* se le esta sumando 1 al indice debido a que el primer indice del ojeto rs
                     * el cual biene desde la base de datos es 1 */
                
                }
                modeloTabla.addRow(fila);  
            }
            /* desde aqui le creamos el evento a la tabla para que me lleve hasta la interfaz donde podremos actualizar los datos del usuario*/
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,"Error al cargar la tabla contacte al Administrador");
        }
    }
}
/*Actualizacion*/