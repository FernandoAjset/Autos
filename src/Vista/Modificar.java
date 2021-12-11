package Vista;

import Controlador.Registro;
import Modelo.Vehiculo;
import java.awt.event.ItemEvent;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Modificar extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar
     */
    Vehiculo vehiculo = new Vehiculo();
    Registro registro;

    public Modificar() {
        initComponents();
        jLabel1.setOpaque(true);
        jLabel2.setOpaque(true);
        jLabel3.setOpaque(true);
        vehiculo.setMarca((String) comboMarca.getSelectedItem());
        guardar.setEnabled(false);
        setLocationRelativeTo(null);
    }
    
        public Modificar(Registro registro) {
        initComponents();
        jLabel1.setOpaque(true);
        jLabel2.setOpaque(true);
        jLabel3.setOpaque(true);
        vehiculo.setMarca((String) comboMarca.getSelectedItem());
        guardar.setEnabled(false);
        setLocationRelativeTo(null);
        this.registro=registro;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoEstado = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextPatente = new javax.swing.JTextField();
        jTextModelo = new javax.swing.JTextField();
        jTextAnno = new javax.swing.JTextField();
        jTextMotor = new javax.swing.JTextField();
        jTextChasis = new javax.swing.JTextField();
        comboMarca = new javax.swing.JComboBox<>();
        jRadioNuevo = new javax.swing.JRadioButton();
        jRadioUsado = new javax.swing.JRadioButton();
        salir = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Patente :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Marca : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Modelo :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Año :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("N° Motor :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("N° Chasis :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));
        getContentPane().add(jTextPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 180, -1));
        getContentPane().add(jTextModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 240, -1));
        getContentPane().add(jTextAnno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, -1));
        getContentPane().add(jTextMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 240, -1));
        getContentPane().add(jTextChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 240, -1));

        comboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honda", "Mazda", "Toyota", "Chevrolete", "Ford", "BMW" }));
        comboMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMarcaItemStateChanged(evt);
            }
        });
        getContentPane().add(comboMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 240, -1));

        GrupoEstado.add(jRadioNuevo);
        jRadioNuevo.setText("Nuevo");
        getContentPane().add(jRadioNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        GrupoEstado.add(jRadioUsado);
        jRadioUsado.setText("Usado");
        getContentPane().add(jRadioUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 70, -1));

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, -1));

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 153, 51));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 386, 495, 90));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("    Modificar Vehiculos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 500, 86));

        jLabel1.setBackground(new java.awt.Color(0, 204, 51));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 495, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMarcaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            vehiculo.setMarca((String) comboMarca.getSelectedItem());
            //System.out.println(vehiculo.getMarca());
        }
    }//GEN-LAST:event_comboMarcaItemStateChanged

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        comboMarca.setSelectedIndex(0);
        jTextModelo.setText("");
        jTextPatente.setText("");
        jTextAnno.setText("");
        jTextMotor.setText("");
        jTextChasis.setText("");
        jTextPatente.setEnabled(true);
        guardar.setEnabled(false);
    }//GEN-LAST:event_limpiarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Principal nuevo = new Principal(registro);
        nuevo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if (jRadioNuevo.isSelected()) {
            vehiculo.setEstado(1);
        }
        if (jRadioUsado.isSelected()) {
            vehiculo.setEstado(2);
        }

        if (jTextPatente.getText().equals("") || jTextModelo.getText().equals("") || jTextAnno.getText().equals("") || jTextMotor.getText().equals("") || jTextChasis.getText().equals("") || vehiculo.getEstado() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Llene todos los campos", "Error", HEIGHT);
        } else {
            vehiculo.setPatente(jTextPatente.getText());
            vehiculo.setModelo(jTextModelo.getText());
            try {
                vehiculo.setAnno(Integer.parseInt(jTextAnno.getText()));
                vehiculo.setNumero_motor(jTextMotor.getText());
                vehiculo.setNumero_chasis(jTextChasis.getText());
                if (registro.modificar(vehiculo)) {
                    JOptionPane.showMessageDialog(rootPane, "Cambios Guardados");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(rootPane, "El año no es valido", "Error", HEIGHT);
            }
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        Vector resultado = new Vector();
        resultado = registro.buscarPorPatente(jTextPatente.getText());

        if (resultado.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Patente no existe", "Alerta", HEIGHT);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Registro encontrado");
            guardar.setEnabled(true);
            jTextPatente.setEnabled(false);
            jTextPatente.setText((String) resultado.get(0));
            comboMarca.setSelectedItem((String) resultado.get(1));
            jTextModelo.setText((String) resultado.get(2));
            int anno = (int) resultado.get(3);
            jTextAnno.setText(String.valueOf(anno));
            jTextMotor.setText((String) resultado.get(4));
            jTextChasis.setText((String) resultado.get(5));
            String estado = (String) resultado.get(6);
            if (estado.equals("Nuevo")) {
                jRadioNuevo.setSelected(true);
                jRadioUsado.setSelected(false);
            } else if (estado.equals("Usado")) {
                jRadioNuevo.setSelected(false);
                jRadioUsado.setSelected(true);
            }
        }
    }//GEN-LAST:event_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoEstado;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> comboMarca;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioNuevo;
    private javax.swing.JRadioButton jRadioUsado;
    private javax.swing.JTextField jTextAnno;
    private javax.swing.JTextField jTextChasis;
    private javax.swing.JTextField jTextModelo;
    private javax.swing.JTextField jTextMotor;
    private javax.swing.JTextField jTextPatente;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
