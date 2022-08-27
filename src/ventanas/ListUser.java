/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import conectarSQL.Conexion;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt. event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eucli
 */
public class ListUser extends javax.swing.JFrame {
    public static String userUpdate = "";
    String nombre = Login.nombreUsuario;
    /**
     * Creates new form ListUser
     */
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
        jScrollPane1.setViewportView(jtable_usuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 980, 330));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("Usuarios Registrados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 6, 170, 30));
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 420));

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
            jtable_usuarios.addMouseListener(new MouseAdapter() {
 
            @Override
            public void mouseClicked(MouseEvent e) {
               int filaPoint = jtable_usuarios.rowAtPoint(e.getPoint());//e.getPint Obtiene la fila que se selecciono 
               int columnPoint = 4;//indicamos la columna que vamos a selecconar
               
                if (filaPoint > -1) {
                    userUpdate = (String)modeloTabla.getValueAt(filaPoint,columnPoint);
                    /* en el campo userUpdate guardamos lo que esta tanto en la fila como en la columna seleeccionada*/
                    DatosUsuario datos = new DatosUsuario();
                    datos.setVisible(true);  
                }
            }
            });
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,"Error al cargar la tabla contacte al Administrador");
        }
    }
}
