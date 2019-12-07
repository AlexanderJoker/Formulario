package formulario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Alexander Tinoco
 */
public class Formulario extends javax.swing.JFrame {
    DefaultTableModel modelo= new DefaultTableModel();
    static String nombrefu;
    public Formulario() {
        initComponents();
        modelo.addColumn("N. de cuenta");
        modelo.addColumn("Nombre completo");
        modelo.addColumn("Carrera");
        tabla.setModel(modelo);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        txtcuenta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtnombre = new javax.swing.JTextField();
        seleccion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setText("Numero de cuenta:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 50, 116, 15);

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 110, 52, 15);

        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 110, 55, 15);

        jLabel4.setText("Carrera:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 170, 48, 15);

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtapellido);
        txtapellido.setBounds(310, 100, 120, 30);

        txtcuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcuentaKeyTyped(evt);
            }
        });
        jPanel1.add(txtcuenta);
        txtcuenta.setBounds(150, 40, 190, 30);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 150, 83, 25);

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(370, 180, 85, 25);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N de Cuenta", "Nombre Completo", "Carrera"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 220, 380, 160);

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre);
        txtnombre.setBounds(100, 100, 120, 30);

        seleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lic. en Gerencia de Negocios", "Lic. en Marketing", "Lic. en Contaduria Financiera", "Lic. en Comercio y Negocios Int", "Lic. en Relaciones Industriales", "Lic. en Derecho", "Lic en Turismo", "Ing. en produccion Industrial", "Ing. Electronica", "Ing. en Computacion", "Ing. Financiera", " " }));
        jPanel1.add(seleccion);
        seleccion.setBounds(100, 160, 210, 24);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Formulario");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 10, 110, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String carrera= seleccion.getSelectedItem().toString();
        nombrefu=txtnombre.getText()+" "+txtapellido.getText();
        String dato[]= new String [3];
        dato[0]=txtcuenta.getText();
        dato[1]=nombrefu;
        dato[2]=carrera;
        modelo.addRow(dato);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int filas=tabla.getSelectedRow();
       txtnombre.setText("");
       txtapellido.setText("");
       txtcuenta.setText("");
       if(filas>=0)
       {
        modelo.removeRow(filas);
       }
       else
       {
        JOptionPane.showMessageDialog(null,"No a seleccionado una fila");
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtcuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuentaKeyTyped
        char n= evt.getKeyChar();
        if(n<'0' ||n>'9') evt.consume();
    }//GEN-LAST:event_txtcuentaKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char n= evt.getKeyChar();
        if(n<'a' ||n>'z') evt.consume();
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        char n= evt.getKeyChar();
        if(n<'a' ||n>'z' ) evt.consume();
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
    
    }//GEN-LAST:event_txtnombreActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> seleccion;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcuenta;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}