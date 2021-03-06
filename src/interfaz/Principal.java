/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karrieta9
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatico, cmdOperaciones};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroFilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdOperaciones = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblTablaResultado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblTablaInicial = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel1.setText("Operaciones Matrices");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 240, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", 0, 0, new java.awt.Font("Times New Roman", 3, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 11)); // NOI18N
        jLabel2.setText("No de Filas :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        jPanel2.add(txtNumeroFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 50, 30));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 11)); // NOI18N
        jLabel3.setText("No de Columnas :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        txtNumeroColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroColumnasActionPerformed(evt);
            }
        });
        jPanel2.add(txtNumeroColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 50, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 390, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", 0, 0, new java.awt.Font("Times New Roman", 3, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, -1));

        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 90, -1));

        cmdAutomatico.setText("Automatico");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        cmdOperaciones.setText("Operaciones");
        cmdOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionesActionPerformed(evt);
            }
        });
        jPanel3.add(cmdOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 90, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 580, 80));

        TblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TblTablaResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 340, 260));

        TblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TblTablaInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 340, 260));

        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cant. No. Pares", "Numeros Pares", "Letra C", "Diagonal Principal", "Letra H", "Recorrido Uno", "Recorrido Dos", "Recorrido Tres" }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 120, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", 0, 0, new java.awt.Font("Times New Roman", 3, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane3.setViewportView(txtResultado);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 670, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 710, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroColumnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroColumnasActionPerformed

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int nf, nc;
        DefaultTableModel tm, tm2;

        nf = Integer.parseInt((txtNumeroFilas).getText());
        nc = Integer.parseInt((txtNumeroColumnas).getText());

        tm = (DefaultTableModel) TblTablaInicial.getModel();
        tm2 = (DefaultTableModel) TblTablaResultado.getModel();

        tm.setRowCount(nf);
        tm.setColumnCount(nc);

        tm2.setRowCount(nf);
        tm2.setColumnCount(nc);

        JButton botonesH[] = {cmdManual, cmdAutomatico, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdOperaciones};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed
        int nf, nc, n;

        nc = TblTablaInicial.getColumnCount();
        nf = TblTablaResultado.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                TblTablaInicial.setValueAt(n, i, j);
            }

        }

        JButton botonesH[] = {cmdOperaciones, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdManual, cmdAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed

        txtNumeroFilas.setText("");
        txtNumeroColumnas.setText("");
        txtNumeroFilas.requestFocusInWindow();
        txtResultado.setText("");
        cmbOperaciones.setSelectedIndex(0);

        Helper.porDefectoTabla(TblTablaInicial);
        Helper.porDefectoTabla(TblTablaResultado);

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatico, cmdOperaciones};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionesActionPerformed
        int op, cantPares = 0;
        op = cmbOperaciones.getSelectedIndex();
        Helper.limpiadoTabla(TblTablaResultado);

        switch (op) {

            case 0:
                cantPares = Helper.cantidadPares(TblTablaInicial);
                txtResultado.setText("El numero de elementos pares es: " + cantPares);
                break;

            case 1:
                Helper.pares(TblTablaInicial, TblTablaResultado);
                break;

            case 2:
                Helper.letraC(TblTablaInicial, TblTablaResultado);

                break;

            case 3:
                Helper.diagonalPrincipal(TblTablaInicial, TblTablaResultado);

                break;

            case 4:
                Helper.letraH(TblTablaInicial, TblTablaResultado);
                break;

            case 5:
                txtResultado.setText(Helper.recorridoUno(TblTablaInicial));
                break;

            case 6:
                txtResultado.setText(Helper.recorridoDos(TblTablaInicial));
                break;
                
            case 7:
                txtResultado.setText(Helper.recorridoTres(TblTablaInicial));
                break;
        }

        JButton botonesH[] = {cmdOperaciones, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatico, cmdCrear};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdOperacionesActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        int nf, nc, n;

        int sw, res;

        nc = TblTablaInicial.getColumnCount();
        nf = TblTablaResultado.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elemento el la posicion [" + i + "]" + "[" + j + "]").trim());
                        TblTablaInicial.setValueAt(n, i, j);

                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un Numero Valido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "Seguro que deseas salir", "Salir", JOptionPane.YES_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = nf;
                            j = nc;

                            Helper.porDefectoTabla(TblTablaInicial);
                            Helper.porDefectoTabla(TblTablaResultado);

                        } else {
                            sw = 0;
                        }

                    }
                } while (sw == 0);

            }

        }


    }//GEN-LAST:event_cmdManualActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblTablaInicial;
    private javax.swing.JTable TblTablaResultado;
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtNumeroColumnas;
    private javax.swing.JTextField txtNumeroFilas;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
