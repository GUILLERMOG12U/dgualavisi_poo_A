package automovil;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class visual extends javax.swing.JFrame {

    private Timer run1;
    private Timer run2;

    private int sentecimas = 0;
    private int segundos = 0;

    private ActionListener movimiento1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            sentecimas++;
            if (sentecimas == 5) {
                segundos++;
                sentecimas = 0;
            }
            if (segundos == 100) {
                segundos = 100;
                run1.stop();
                JOptionPane.showMessageDialog(null, "El automovil llego a su límite", "Advertencia", javax.swing.JOptionPane.ERROR_MESSAGE);
                
            }
            actualizar();
        }
    };

    private void actualizar() {
        String texto = (segundos <= 100 ? "0" : "") + segundos;
        if (segundos == 100) {
            segundos = 0;
            run1.stop();
       
        }
        lblRun.setText(texto);
    }

    private ActionListener movimiento2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            segundos--;
            if (segundos == 5) {
                segundos = 0;
            }
            sentecimas++;
            if (sentecimas == 100) {
                sentecimas = 0;
            }
            actualizar2();
                   }
    };

    private void actualizar2() {
        String texto2 = (segundos == 0 ? "" : "") + segundos + (sentecimas == 0 ? "" : "") + sentecimas;
        if (segundos == 0) {
            run2.stop();
        }
        lblRun.setText(texto2);
    }

    public visual() {
        initComponents();
        setLocationRelativeTo(null);
        listaMarcas.addItem("CHEVROLET");
        listaMarcas.addItem("TOYOTA");
        run1 = new Timer(10, movimiento1);
        run2 = new Timer(10, movimiento2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        listaMarcas = new javax.swing.JComboBox<>();
        listaModelos = new javax.swing.JComboBox<>();
        listaColores = new javax.swing.JComboBox<>();
        checkGasolina = new javax.swing.JCheckBox();
        checkEnergia = new javax.swing.JCheckBox();
        btnEncender = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnAcelerar = new javax.swing.JButton();
        btnFrenar = new javax.swing.JButton();
        btnAutor = new javax.swing.JButton();
        btnVerAuto = new javax.swing.JButton();
        lblCargaImagen = new javax.swing.JLabel();
        lblRun = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 0, 0));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 51, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText(" Emulador Automovil");
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 0), null, null));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 470, 60));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(51, 0, 0));
        jTextField2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 51, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Elija el automovil");
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 0), null, null));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 230, 50));

        listaMarcas.setBackground(new java.awt.Color(51, 51, 255));
        listaMarcas.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        listaMarcas.setForeground(new java.awt.Color(255, 255, 255));
        listaMarcas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        listaMarcas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaMarcasItemStateChanged(evt);
            }
        });
        listaMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMarcasMouseClicked(evt);
            }
        });
        listaMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMarcasActionPerformed(evt);
            }
        });
        getContentPane().add(listaMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 160, 30));

        listaModelos.setBackground(new java.awt.Color(51, 51, 255));
        listaModelos.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        listaModelos.setForeground(new java.awt.Color(255, 255, 255));
        listaModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaModelosActionPerformed(evt);
            }
        });
        getContentPane().add(listaModelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 170, 30));

        listaColores.setBackground(new java.awt.Color(51, 51, 255));
        listaColores.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        listaColores.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(listaColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 160, 30));

        checkGasolina.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        checkGasolina.setForeground(new java.awt.Color(255, 102, 0));
        checkGasolina.setText("GASOLINA");
        checkGasolina.setBorder(new javax.swing.border.MatteBorder(null));
        checkGasolina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkGasolinaActionPerformed(evt);
            }
        });
        getContentPane().add(checkGasolina, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 100, 50));

        checkEnergia.setBackground(new java.awt.Color(255, 0, 0));
        checkEnergia.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        checkEnergia.setForeground(new java.awt.Color(255, 102, 0));
        checkEnergia.setText("ENERGIA");
        checkEnergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEnergiaActionPerformed(evt);
            }
        });
        getContentPane().add(checkEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 100, 50));

        btnEncender.setBackground(new java.awt.Color(255, 0, 0));
        btnEncender.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnEncender.setText("ENCENDER");
        btnEncender.setEnabled(false);
        btnEncender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEncenderMouseClicked(evt);
            }
        });
        btnEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncenderActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 130, 30));

        btnApagar.setBackground(new java.awt.Color(255, 0, 0));
        btnApagar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnApagar.setText("APAGAR");
        btnApagar.setEnabled(false);
        btnApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApagarMouseClicked(evt);
            }
        });
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 130, 30));

        btnAcelerar.setBackground(new java.awt.Color(0, 0, 0));
        btnAcelerar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnAcelerar.setForeground(new java.awt.Color(255, 255, 255));
        btnAcelerar.setText("ACELERAR");
        btnAcelerar.setEnabled(false);
        btnAcelerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcelerarMouseClicked(evt);
            }
        });
        btnAcelerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcelerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcelerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 130, 30));

        btnFrenar.setBackground(new java.awt.Color(0, 0, 0));
        btnFrenar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnFrenar.setForeground(new java.awt.Color(255, 255, 255));
        btnFrenar.setText("FRENAR");
        btnFrenar.setEnabled(false);
        btnFrenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFrenarMouseClicked(evt);
            }
        });
        btnFrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrenarActionPerformed(evt);
            }
        });
        getContentPane().add(btnFrenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 130, 30));

        btnAutor.setBackground(new java.awt.Color(51, 0, 0));
        btnAutor.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        btnAutor.setForeground(new java.awt.Color(255, 51, 0));
        btnAutor.setText("AUTOR");
        btnAutor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(255, 0, 0), null, null));
        btnAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAutorMouseClicked(evt);
            }
        });
        btnAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 170, 100, 50));

        btnVerAuto.setBackground(new java.awt.Color(51, 0, 0));
        btnVerAuto.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        btnVerAuto.setForeground(new java.awt.Color(255, 51, 0));
        btnVerAuto.setText("Visualizar automovil");
        btnVerAuto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVerAuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerAutoMouseClicked(evt);
            }
        });
        btnVerAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 210, 30));

        lblCargaImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargaImagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        getContentPane().add(lblCargaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 1070, 390));

        lblRun.setBackground(new java.awt.Color(0, 0, 0));
        lblRun.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblRun.setForeground(new java.awt.Color(255, 102, 0));
        lblRun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRun.setText("000");
        lblRun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        getContentPane().add(lblRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 90, 30));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Colores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("Marcas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("Modelos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1190, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void checkGasolinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkGasolinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkGasolinaActionPerformed

    private void listaMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMarcasActionPerformed

    }//GEN-LAST:event_listaMarcasActionPerformed

    private void listaMarcasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMarcasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaMarcasMouseClicked

    private void listaMarcasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaMarcasItemStateChanged

        listaModelos.removeAllItems();
        listaColores.removeAllItems();
        String mar = listaMarcas.getSelectedItem().toString();
        switch (mar) {
            case "CHEVROLET":
                listaModelos.addItem("MALIBU");
                listaModelos.addItem("CORVETTE");
                listaColores.addItem("Rojo");
                 listaColores.addItem("Negro");
                break;
                
            case "TOYOTA":
                listaModelos.addItem("AYGO X");
                listaModelos.addItem("COROLLA");
                listaColores.addItem("Dorado");
                listaColores.addItem("Blanco");
                break;
        }
    }//GEN-LAST:event_listaMarcasItemStateChanged

    private void btnAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAutorMouseClicked

    private void btnAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorActionPerformed

        javax.swing.JOptionPane.showMessageDialog(this, "Gualavisi Dennis 3A DS", null, javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnAutorActionPerformed

    private void btnEncenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncenderMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEncenderMouseClicked

    private void btnEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncenderActionPerformed

        if (checkEnergia.isSelected() == true && checkGasolina.isSelected() == true) {
            javax.swing.JOptionPane.showMessageDialog(this, "Automovil encendido", "Aviso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            btnApagar.setEnabled(true);
            btnEncender.setEnabled(false);
            btnAcelerar.setEnabled(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Automovil sin energia o gasolina", "Aviso", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEncenderActionPerformed

    private void btnApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApagarMouseClicked

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        if (checkEnergia.isSelected() == true && checkGasolina.isSelected() == true) {
            javax.swing.JOptionPane.showMessageDialog(this, "Automovil apagado \n", "Aviso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            btnEncender.setEnabled(true);
            btnApagar.setEnabled(false);
            btnAcelerar.setEnabled(false);
           
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Automovil sin encender \n", "Aviso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        String texto = null;
      lblRun.setText(texto);
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnVerAutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerAutoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerAutoMouseClicked

    private void btnVerAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAutoActionPerformed

        String modelo = listaModelos.getSelectedItem().toString();
        String color = listaColores.getSelectedItem().toString();
        String unir = modelo + color;
        System.out.println(unir);
        switch (unir) {
            case "CORVETTERojo":
                lblCargaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ChevroletCorvetteRojo.jpeg")));
                break;
            case "CORVETTENegro":
                lblCargaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ChevroletCorvetteNegro.jpg")));
                break;
            case "MALIBURojo":
                lblCargaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ChevroletMalibuRojo.jpg")));
                break;
            case "MALIBUNegro":
                lblCargaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ChevroletMalibuNegro.jpeg")));
                break;
            case "AYGO XBlanco":
                lblCargaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ToyotaAygoxBlanco.jpg")));
                break;
            case "AYGO XDorado":
                lblCargaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ToyotaAygoxDorado.jpeg")));
                break;
            case "COROLLABlanco":
                lblCargaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ToyotaCorollaBlanco.jpeg")));
                break;
            case "COROLLADorado":
                lblCargaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ToyotaCorollaDorado.jpg")));
                break;
        }
        btnEncender.setEnabled(true);
    }//GEN-LAST:event_btnVerAutoActionPerformed

    private void btnAcelerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcelerarActionPerformed

        run1.start();
        btnAcelerar.setEnabled(false);
        btnFrenar.setEnabled(true);
        
    }//GEN-LAST:event_btnAcelerarActionPerformed

    private void btnAcelerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcelerarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcelerarMouseClicked

    private void btnFrenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFrenarMouseClicked

    private void btnFrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrenarActionPerformed

        run2.start();
        btnAcelerar.setEnabled(true);
        btnFrenar.setEnabled(false);
    }//GEN-LAST:event_btnFrenarActionPerformed

    private void listaModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaModelosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaModelosActionPerformed

    private void checkEnergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEnergiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkEnergiaActionPerformed

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
            java.util.logging.Logger.getLogger(visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new visual().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcelerar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnAutor;
    private javax.swing.JButton btnEncender;
    private javax.swing.JButton btnFrenar;
    private javax.swing.JButton btnVerAuto;
    private javax.swing.JCheckBox checkEnergia;
    private javax.swing.JCheckBox checkGasolina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblCargaImagen;
    private javax.swing.JLabel lblRun;
    private javax.swing.JComboBox<String> listaColores;
    private javax.swing.JComboBox<String> listaMarcas;
    private javax.swing.JComboBox<String> listaModelos;
    // End of variables declaration//GEN-END:variables
}
