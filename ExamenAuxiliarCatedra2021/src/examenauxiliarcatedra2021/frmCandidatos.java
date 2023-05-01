package examenauxiliarcatedra2021;

import javax.swing.JOptionPane;

public class frmCandidatos extends javax.swing.JFrame {

    int codigo;

    public frmCandidatos() {
        initComponents();
        codigo = 1;
        txtCodigo.setText(""+codigo);
        txtNombre.requestFocus(); //pasar el control a este objeto
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btngSexo = new javax.swing.ButtonGroup();
        jCheckBox2 = new javax.swing.JCheckBox();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        rbtnHombre = new javax.swing.JRadioButton();
        rbtnMujer = new javax.swing.JRadioButton();
        lblEstudios = new javax.swing.JLabel();
        chkBachillerato = new javax.swing.JCheckBox();
        chkUniversitarios = new javax.swing.JCheckBox();
        chkMaestria = new javax.swing.JCheckBox();
        chkDoctorado = new javax.swing.JCheckBox();
        lblDepartamento = new javax.swing.JLabel();
        cmbDepartamento = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCandidatos = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        jCheckBox2.setText("jCheckBox2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Evaluacion de Candidatos ");

        lblCodigo.setText("CODIGO:");

        txtCodigo.setEditable(false);

        lblNombre.setText("NOMBRE:");

        lblSexo.setText("SEXO:");

        btngSexo.add(rbtnHombre);
        rbtnHombre.setText("HOMBRE");

        btngSexo.add(rbtnMujer);
        rbtnMujer.setText("MUJER");

        lblEstudios.setText("ESTUDIOS:");

        chkBachillerato.setText("BACHILLERATO");
        chkBachillerato.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBachilleratoItemStateChanged(evt);
            }
        });

        chkUniversitarios.setText("UNIVERSITARIOS");
        chkUniversitarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkUniversitariosItemStateChanged(evt);
            }
        });

        chkMaestria.setText("MAESTRIA");
        chkMaestria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkMaestriaItemStateChanged(evt);
            }
        });

        chkDoctorado.setText("DOCTORADO");
        chkDoctorado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkDoctoradoItemStateChanged(evt);
            }
        });

        lblDepartamento.setText("DEPARTAMENTO:");

        cmbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECCIONE UNO>", "AHUACHAPÁN", "SONSONATE", "SANTA ANA", "LA LIBERTAD", "CHALATENANGO", "SAN SALVADOR", "CUSCATLÁN", "CABAÑAS", "LA PAZ", "SAN VICENTE", "SAN MIGUEL", "USULUTÁN", "MORAZÁN", "LA UNIÓN" }));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tblCandidatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "PUNTOS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCandidatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEstudios)
                                    .addComponent(lblNombre)
                                    .addComponent(lblCodigo)
                                    .addComponent(lblSexo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkDoctorado)
                                    .addComponent(chkMaestria)
                                    .addComponent(chkUniversitarios)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnHombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtnMujer))
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkBachillerato)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDepartamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregar)
                                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSexo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnHombre)
                        .addComponent(rbtnMujer)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstudios)
                    .addComponent(chkBachillerato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkUniversitarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkMaestria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkDoctorado)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartamento)
                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void limpiarControles(){
    
        codigo = codigo + 1;
        txtCodigo.setText("" + codigo);
        txtNombre.setText("");
        btngSexo.clearSelection();
        chkBachillerato.setSelected(false);
        chkUniversitarios.setSelected(false);
        chkMaestria.setSelected(false);
        chkDoctorado.setSelected(false);
        cmbDepartamento.setSelectedIndex(0);
        txtNombre.requestFocus();
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        int puntos = 0;
        if (txtNombre.getText().isEmpty() || txtNombre.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el nombre del candidato ");
            txtNombre.requestFocus();
        } else {
            if (!rbtnHombre.isSelected() && !rbtnMujer.isSelected()) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar el sexo del candidato ");
            } else {
                if (!chkBachillerato.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar los estudios del candidato ");
                } else {
                    if (cmbDepartamento.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar el departamento de procedencia del canditado del candidato ");
                    } else {
                            if (chkBachillerato.isSelected()) {
                                puntos = puntos + 15;
                            }
                            if (chkUniversitarios.isSelected()) {
                                puntos = puntos + 30;
                            }
                            if (chkMaestria.isSelected()) {
                                puntos = puntos + 45;
                            }
                            if (chkDoctorado.isSelected()) {
                                puntos = puntos + 60;
                            }
                            switch (cmbDepartamento.getSelectedIndex()) {
                            case 1:
                            case 2:
                            case 3:
                                puntos = puntos + 50;
                            break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                puntos = puntos + 40;
                            break;
                            case 8:
                            case 9:
                            case 10:
                                puntos = puntos + 30;
                            break;
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                                puntos = puntos + 20;
                            break;
                            default:
                                throw new AssertionError();
                        }
                           tblCandidatos.setValueAt(txtCodigo.getText(), (codigo - 1), 0);
                           tblCandidatos.setValueAt(txtNombre.getText(), (codigo - 1), 1);
                           tblCandidatos.setValueAt(puntos, (codigo - 1), 2);
                           JOptionPane.showMessageDialog(null, "Candidato Ingresado con Exito");
                           limpiarControles();
                    }

                }
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed
    //
    private void chkUniversitariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkUniversitariosItemStateChanged
        if (chkUniversitarios.isSelected()) {
            chkBachillerato.setSelected(true);
        } else {
            chkBachillerato.setSelected(false);
            chkUniversitarios.setSelected(false);
            chkMaestria.setSelected(false);
            chkDoctorado.setSelected(false);
        }
    }//GEN-LAST:event_chkUniversitariosItemStateChanged

    private void chkMaestriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkMaestriaItemStateChanged
        if (chkMaestria.isSelected()) {
            chkBachillerato.setSelected(true);
            chkUniversitarios.setSelected(true);
        } else {
            chkBachillerato.setSelected(false);
            chkUniversitarios.setSelected(false);
            chkMaestria.setSelected(false);
            chkDoctorado.setSelected(false);
        }
    }//GEN-LAST:event_chkMaestriaItemStateChanged

    private void chkDoctoradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkDoctoradoItemStateChanged
         if (chkDoctorado.isSelected()) {
            chkBachillerato.setSelected(true);
            chkUniversitarios.setSelected(true);
            chkMaestria.setSelected(true);
        } else {
            chkBachillerato.setSelected(false);
            chkUniversitarios.setSelected(false);
            chkMaestria.setSelected(false);
            chkDoctorado.setSelected(false);
        }
    }//GEN-LAST:event_chkDoctoradoItemStateChanged

    private void chkBachilleratoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBachilleratoItemStateChanged
         if (!chkBachillerato.isSelected()) {
            chkBachillerato.setSelected(false);
            chkUniversitarios.setSelected(false);
            chkMaestria.setSelected(false);
            chkDoctorado.setSelected(false);
        } 
    }//GEN-LAST:event_chkBachilleratoItemStateChanged
    
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
            java.util.logging.Logger.getLogger(frmCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCandidatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.ButtonGroup btngSexo;
    private javax.swing.JCheckBox chkBachillerato;
    private javax.swing.JCheckBox chkDoctorado;
    private javax.swing.JCheckBox chkMaestria;
    private javax.swing.JCheckBox chkUniversitarios;
    private javax.swing.JComboBox<String> cmbDepartamento;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblEstudios;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JRadioButton rbtnHombre;
    private javax.swing.JRadioButton rbtnMujer;
    private javax.swing.JTable tblCandidatos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
