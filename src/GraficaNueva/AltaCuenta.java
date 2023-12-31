/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraficaNueva;

import Logica.Fachada;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class AltaCuenta extends javax.swing.JFrame {

    private static String nom_cuenta = "", nom_dominio = "", cedula = "";

    /**
     * Creates new form AltaCuenta
     */
    public AltaCuenta() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logotipoAltaCuenta = new javax.swing.JLabel();
        AltaCuentaNombre = new javax.swing.JLabel();
        AltaCuentaNombre1 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        CrearCuenta = new javax.swing.JButton();
        RegresarCuenta = new javax.swing.JButton();
        Habilitada = new javax.swing.JLabel();
        habilitado = new javax.swing.JRadioButton();
        cedulaUser = new javax.swing.JTextField();
        AltaCuentaCedula = new javax.swing.JLabel();
        cbDominios = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        logotipoAltaCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/isoLaCalera.png"))); // NOI18N

        AltaCuentaNombre.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        AltaCuentaNombre.setText("Nombre");

        AltaCuentaNombre1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        AltaCuentaNombre1.setText("Dominio");

        CrearCuenta.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        CrearCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear.jpg"))); // NOI18N
        CrearCuenta.setText("Crear Cuenta");
        CrearCuenta.setToolTipText("Crear Cuenta");
        CrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCuentaActionPerformed(evt);
            }
        });

        RegresarCuenta.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        RegresarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCasa.png"))); // NOI18N
        RegresarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarCuentaActionPerformed(evt);
            }
        });

        Habilitada.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        Habilitada.setText("Habilitada");

        cedulaUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cedulaUserMouseClicked(evt);
            }
        });

        AltaCuentaCedula.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        AltaCuentaCedula.setText("Cédula");

        cbDominios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDominiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Habilitada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(AltaCuentaCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AltaCuentaNombre1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AltaCuentaNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textName, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(cedulaUser, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(habilitado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDominios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(CrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                .addComponent(RegresarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(logotipoAltaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltaCuentaCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltaCuentaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltaCuentaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDominios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Habilitada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habilitado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addComponent(CrearCuenta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 35, Short.MAX_VALUE)
                            .addComponent(logotipoAltaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegresarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarCuentaActionPerformed
        new Cuenta().setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarCuentaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            cbDominios.setModel(Fachada.getInstancia().listar_dominios_cb());
        } catch (IOException | SQLException ex) {
            Logger.getLogger(AltaCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void CrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCuentaActionPerformed
        try {
            // TODO add your handling code here:
            cedula = cedulaUser.getText();
            nom_cuenta = textName.getText();
            nom_dominio = String.valueOf(cbDominios.getSelectedItem());

            Fachada.getInstancia().alta_cuenta(nom_cuenta, nom_dominio, cedula);
            JOptionPane.showMessageDialog(null, "Cuenta creada con éxito");

        } catch (IOException ex) {
            Logger.getLogger(AltaCuenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AltaCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CrearCuentaActionPerformed

    private void cedulaUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaUserMouseClicked
        // TODO add your handling code here:
//        new FrmCuentaUsuarios().setVisible(true);

//        new asdasd(this, rootPaneCheckingEnabled).setVisible(true);
        new DialogCuentaUsuarios(this, rootPaneCheckingEnabled).setVisible(true);
        System.out.println("txt " + cedula);
        cedulaUser.setText(cedula);
    }//GEN-LAST:event_cedulaUserMouseClicked

    private void cbDominiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDominiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDominiosActionPerformed

    public static void setCedula(String cedula) {
        AltaCuenta.cedula = cedula;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AltaCuentaCedula;
    private javax.swing.JLabel AltaCuentaNombre;
    private javax.swing.JLabel AltaCuentaNombre1;
    private javax.swing.JButton CrearCuenta;
    private javax.swing.JLabel Habilitada;
    private javax.swing.JButton RegresarCuenta;
    private javax.swing.JComboBox<String> cbDominios;
    private javax.swing.JTextField cedulaUser;
    private javax.swing.JRadioButton habilitado;
    private javax.swing.JLabel logotipoAltaCuenta;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables
}
