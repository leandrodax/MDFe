/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movimentacao;

import ConexaoDB.Conectar;
import Utilitarios.LimitaField;
import Utilitarios.Utilitarios;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class TelaUnidadeCarga extends javax.swing.JDialog {
   
    public Integer codmax;
    private static String tag_acao = "1";
    Utilitarios util = new Utilitarios();
    
    public TelaUnidadeCarga(){
        initComponents();
        DefinirFormulario();
    }
    
   
    public TelaUnidadeCarga( String sCOD_TRANSP, String sTAG_ACAO){
        initComponents();
        
        //Passa os valores dos parametros para as variaveis da classe
        util.sCOD_TRANSPORTE = sCOD_TRANSP;        
        tag_acao = sTAG_ACAO;
        DefinirFormulario();
        SairEsc();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlPrincipal = new javax.swing.JPanel();
        jPnlUndCarga = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFldQtdRateadaCarga = new javax.swing.JTextField();
        jCmbBxTipoCarga = new javax.swing.JComboBox<>();
        jFldIdentificacaoCarga = new javax.swing.JTextField();
        jPnlLacres = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jFldNrLacres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLacresCarga = new javax.swing.JTable();
        jBtIncluirLacres = new javax.swing.JButton();
        jBtExcluirLacres = new javax.swing.JButton();
        jBtOkUnidadeCarga = new javax.swing.JButton();
        jBFecharUnidadeCarga = new javax.swing.JButton();
        jFldCodCarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPnlPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Unidade de Carga", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jPnlUndCarga.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Unidades de Carga", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("*Tipo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("*Identificação:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("*Quantidade Rateada:");

        jFldQtdRateadaCarga.setText("0,00");
        jFldQtdRateadaCarga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFldQtdRateadaCargaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFldQtdRateadaCargaFocusLost(evt);
            }
        });
        jFldQtdRateadaCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFldQtdRateadaCargaActionPerformed(evt);
            }
        });
        jFldQtdRateadaCarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldQtdRateadaCargaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFldQtdRateadaCargaKeyTyped(evt);
            }
        });

        jCmbBxTipoCarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Container", "ULD", "Pallet", "Outros" }));
        jCmbBxTipoCarga.setSelectedIndex(-1);
        jCmbBxTipoCarga.setToolTipText("");
        jCmbBxTipoCarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCmbBxTipoCargaKeyPressed(evt);
            }
        });

        jFldIdentificacaoCarga.setDocument(new LimitaField(20, 1));
        jFldIdentificacaoCarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldIdentificacaoCargaKeyPressed(evt);
            }
        });

        jPnlLacres.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lacres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("*N° Lacres:");

        jFldNrLacres.setDocument(new LimitaField(20, 2));
        jFldNrLacres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldNrLacresKeyPressed(evt);
            }
        });

        jTableLacresCarga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "", "Lacres"
            }
        ){
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                if(colIndex == 0){
                    return true;
                }else{
                    return false;
                }

            };

            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableLacresCarga.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableLacresCarga);

        jBtIncluirLacres.setText("Incluir");
        jBtIncluirLacres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtIncluirLacresActionPerformed(evt);
            }
        });
        jBtIncluirLacres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtIncluirLacresKeyPressed(evt);
            }
        });

        jBtExcluirLacres.setText("Excluir");
        jBtExcluirLacres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtExcluirLacresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlLacresLayout = new javax.swing.GroupLayout(jPnlLacres);
        jPnlLacres.setLayout(jPnlLacresLayout);
        jPnlLacresLayout.setHorizontalGroup(
            jPnlLacresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlLacresLayout.createSequentialGroup()
                .addGroup(jPnlLacresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlLacresLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(17, 17, 17)
                        .addComponent(jFldNrLacres, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 294, Short.MAX_VALUE))
                    .addGroup(jPnlLacresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPnlLacresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPnlLacresLayout.createSequentialGroup()
                                .addComponent(jBtIncluirLacres)
                                .addGap(18, 18, 18)
                                .addComponent(jBtExcluirLacres)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPnlLacresLayout.setVerticalGroup(
            jPnlLacresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlLacresLayout.createSequentialGroup()
                .addGroup(jPnlLacresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFldNrLacres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnlLacresLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnlLacresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtIncluirLacres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtExcluirLacres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jBtOkUnidadeCarga.setText("Ok");
        jBtOkUnidadeCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtOkUnidadeCargaActionPerformed(evt);
            }
        });

        jBFecharUnidadeCarga.setText("Fechar");
        jBFecharUnidadeCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharUnidadeCargaActionPerformed(evt);
            }
        });

        jFldCodCarga.setEditable(false);
        jFldCodCarga.setBackground(new java.awt.Color(255, 255, 204));
        jFldCodCarga.setEnabled(false);
        jFldCodCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFldCodCargaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Código");

        javax.swing.GroupLayout jPnlUndCargaLayout = new javax.swing.GroupLayout(jPnlUndCarga);
        jPnlUndCarga.setLayout(jPnlUndCargaLayout);
        jPnlUndCargaLayout.setHorizontalGroup(
            jPnlUndCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlUndCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlUndCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlUndCargaLayout.createSequentialGroup()
                        .addGroup(jPnlUndCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlUndCargaLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFldCodCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCmbBxTipoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFldIdentificacaoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFldQtdRateadaCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPnlLacres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPnlUndCargaLayout.createSequentialGroup()
                        .addComponent(jBtOkUnidadeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBFecharUnidadeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPnlUndCargaLayout.setVerticalGroup(
            jPnlUndCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlUndCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlUndCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCmbBxTipoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFldCodCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFldIdentificacaoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFldQtdRateadaCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPnlLacres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlUndCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBFecharUnidadeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtOkUnidadeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPnlPrincipalLayout = new javax.swing.GroupLayout(jPnlPrincipal);
        jPnlPrincipal.setLayout(jPnlPrincipalLayout);
        jPnlPrincipalLayout.setHorizontalGroup(
            jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlUndCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPnlPrincipalLayout.setVerticalGroup(
            jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlUndCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtIncluirLacresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtIncluirLacresActionPerformed
        if(VerificaNrLacre() == true){
            InserirLacres(util.sCOD_CARGA, util.sCOD_TRANSPORTE, util.sDAD_CODIGO.toString(), jFldNrLacres.getText(),util.sCODDOC, util.sTIPO_DOC, util.sCOD_MUN );
            jFldNrLacres.requestFocus();
        } 
    }//GEN-LAST:event_jBtIncluirLacresActionPerformed

    private void jBtExcluirLacresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExcluirLacresActionPerformed
        Integer option = JOptionPane.showConfirmDialog(null, "Deseja excluir o(s) lacre(s) selecionado(s)?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            DeletarLacres(util.sDAD_CODIGO.toString(), util.sCOD_TRANSPORTE, util.sCOD_CARGA,util.sCODDOC, util.sTIPO_DOC, util.sCOD_MUN);
        }
    }//GEN-LAST:event_jBtExcluirLacresActionPerformed

    private void jBtOkUnidadeCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtOkUnidadeCargaActionPerformed
        if(VerificaUnidadeCarga() == true){
            Alterar(util.sCOD_TRANSPORTE, jFldCodCarga.getText(), util.sDAD_CODIGO.toString(), BuscaTpUnCarga(),
                    jFldIdentificacaoCarga.getText(), Double.parseDouble(util.TrocaVirgulaPorPonto(jFldQtdRateadaCarga.getText())),
                    util.sTIPO_DOC, QtdLacreCarga(), util.sCODDOC, util.sCOD_MUN);

            dispose();
        }
        
    }//GEN-LAST:event_jBtOkUnidadeCargaActionPerformed

    private void jFldQtdRateadaCargaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldQtdRateadaCargaFocusLost
       if(jFldQtdRateadaCarga.getText().length() == 0){
            jFldQtdRateadaCarga.setText(new DecimalFormat("#,##0.00").format(0.0));
        }else{
            jFldQtdRateadaCarga.setText(new DecimalFormat("#,##0.00").format(Double.parseDouble(util.TrocaVirgulaPorPonto(jFldQtdRateadaCarga.getText()))));
        }
    }//GEN-LAST:event_jFldQtdRateadaCargaFocusLost

    private void jFldQtdRateadaCargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldQtdRateadaCargaKeyTyped
        String Caracateres = "01233456789,";
        if(!Caracateres.contains(evt.getKeyChar() + "")){
            evt.consume();
        }
    }//GEN-LAST:event_jFldQtdRateadaCargaKeyTyped

    private void jCmbBxTipoCargaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCmbBxTipoCargaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jFldIdentificacaoCarga.requestFocus();
        }
    }//GEN-LAST:event_jCmbBxTipoCargaKeyPressed

    private void jFldIdentificacaoCargaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldIdentificacaoCargaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jFldQtdRateadaCarga.requestFocus();
        }
    }//GEN-LAST:event_jFldIdentificacaoCargaKeyPressed

    private void jBFecharUnidadeCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharUnidadeCargaActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharUnidadeCargaActionPerformed

    private void jFldQtdRateadaCargaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldQtdRateadaCargaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jFldNrLacres.requestFocus();
        }
    }//GEN-LAST:event_jFldQtdRateadaCargaKeyPressed

    private void jFldNrLacresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldNrLacresKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtIncluirLacres.requestFocus();
        }
    }//GEN-LAST:event_jFldNrLacresKeyPressed

    private void jBtIncluirLacresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtIncluirLacresKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtIncluirLacres.doClick();
        }
    }//GEN-LAST:event_jBtIncluirLacresKeyPressed

    private void jFldQtdRateadaCargaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldQtdRateadaCargaFocusGained
        jFldQtdRateadaCarga.selectAll();
    }//GEN-LAST:event_jFldQtdRateadaCargaFocusGained

    private void jFldQtdRateadaCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldQtdRateadaCargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldQtdRateadaCargaActionPerformed

    private void jFldCodCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldCodCargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldCodCargaActionPerformed

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
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaUnidadeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUnidadeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUnidadeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUnidadeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaUnidadeCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFecharUnidadeCarga;
    private javax.swing.JButton jBtExcluirLacres;
    private javax.swing.JButton jBtIncluirLacres;
    private javax.swing.JButton jBtOkUnidadeCarga;
    private javax.swing.JComboBox<String> jCmbBxTipoCarga;
    private javax.swing.JTextField jFldCodCarga;
    private javax.swing.JTextField jFldIdentificacaoCarga;
    private javax.swing.JTextField jFldNrLacres;
    private javax.swing.JTextField jFldQtdRateadaCarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPnlLacres;
    private javax.swing.JPanel jPnlPrincipal;
    private javax.swing.JPanel jPnlUndCarga;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLacresCarga;
    // End of variables declaration//GEN-END:variables

    
    
    /**
     * Define as especificações do formulário.
     */
    public void DefinirFormulario(){
        //Define o tamanho do jframe
        setSize(1000, 410);
        
        //Define o titulo
        setTitle("Unidade de Carga");
        
        //Centraliza o jframe
        setLocationRelativeTo(null);
        
        if (tag_acao == "1") {             
            BuscaCodMax();  
            jFldCodCarga.setText(util.sCOD_CARGA);
            Inserir(util.sCOD_CARGA, util.sCOD_TRANSPORTE, util.sDAD_CODIGO.toString(), util.sCODDOC, util.sTIPO_DOC, util.sCOD_MUN);
            
        } else if (tag_acao == "2") {              
           jFldCodCarga.setText(util.sCOD_CARGA);
           CarregaCampoEdit(util.sDAD_CODIGO.toString(), util.sCOD_TRANSPORTE, util.sCOD_CARGA,util.sCODDOC, util.sTIPO_DOC, util.sCOD_MUN);
           CarregaTudoNrLacres(util.sDAD_CODIGO.toString(), util.sCOD_TRANSPORTE, util.sCOD_CARGA, util.sCODDOC, util.sTIPO_DOC, util.sCOD_MUN); 
           
        } 
        
        //Seta o renderizador personalizado no cabecalho da tabela
        for (int col = 0; col < jTableLacresCarga.getColumnCount(); col++) {
            jTableLacresCarga.getColumnModel().getColumn(col).setHeaderRenderer(new MeuRenderizador());
        }
        
        //Define o tamanho minimo e maximo das seguintes colunas
        jTableLacresCarga.getColumnModel().getColumn(0).setMaxWidth(30);
        jTableLacresCarga.getColumnModel().getColumn(0).setMinWidth(30);
        
        //Define o modo de selecao da tabela para apenas uma linha
        jTableLacresCarga.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
       
      
        jBtOkUnidadeCarga.setMnemonic(KeyEvent.VK_O);
        jBFecharUnidadeCarga.setMnemonic(KeyEvent.VK_F);
        
        setModal(true);
        
    }
    
    public void LimpaTabela(JTable jtable){
        DefaultTableModel dtm = (DefaultTableModel) jtable.getModel();
        dtm.setRowCount(0);
    }
    
    public void CarregaTudoNrLacres( String dadCodigo, String codTransp, String CodCarga, String CodDoc, String TipoDoc, String CodMun){
        try{
            Conectar.ConectarBD();
            LimpaTabela(jTableLacresCarga);
            Conectar.result = Conectar.stam.executeQuery("SELECT * FROM MDFE_LACRES_CARGA WHERE DAD_CODIGO = '"+ dadCodigo +"' AND COD_TRANSP = '"+ codTransp+"' "
                    + "AND COD_CARGA = '"+CodCarga+"' AND CODDOC ='"+CodDoc+"' AND TP_DOC ='"+TipoDoc+"' AND COD_MUN = '"+ CodMun +"' ");
            DefaultTableModel dtm = (DefaultTableModel) jTableLacresCarga.getModel();//CODDOC, COD_TRANSP, DAD_CODIGO, COD_CARGA
            while(Conectar.result.next()){
                dtm.addRow(new Object[]{
                    false,
                    Conectar.result.getString("NR_LACRE")
                });
            }
            Conectar.DesconectarBD();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados na tabela...\n" + e.getLocalizedMessage());
        }
    }
    
    
       
    public void Inserir(String codcarga, String codTransp, String dadCodigo, String CodDoc, String TipoDoc, String CodMun){
        try{
            Conectar.ConectarBD();
            
            System.out.println("INSERT INTO MDFE_UN_CARGA "
                    + "(COD_CARGA, COD_TRANSP, DAD_CODIGO, CODDOC, TP_DOC, COD_MUN)"
                    + "values('"+ codcarga +"','"+ codTransp +"', '"+ dadCodigo +"', '"+ CodDoc +"', '"+ TipoDoc +"', '"+ CodMun +"' )"
            );
            
            Conectar.stam.executeUpdate("INSERT INTO MDFE_UN_CARGA "
                    + "(COD_CARGA, COD_TRANSP, DAD_CODIGO, CODDOC, TP_DOC, COD_MUN)"
                    + "values('"+ codcarga +"','"+ codTransp +"', '"+ dadCodigo +"', '"+ CodDoc +"', '"+ TipoDoc +"', '"+ CodMun +"' )"
            );
            
            Conectar.DesconectarBD();
            
            dispose();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir...\n" + e.getLocalizedMessage());
        }
    }
    
    public void InserirLacres(String CodCarga,String CodTransp, String dadCodigo, String nrLacres, String CodDoc, String TpDoc, String CodMun){
        try{
            Conectar.ConectarBD();
            
            System.out.println("INSERT INTO MDFE_LACRES_CARGA "
                    + "( COD_CARGA, COD_TRANSP, DAD_CODIGO, NR_LACRE, CODDOC, TP_DOC, COD_MUN)"
                    + "values('"+ CodCarga +"','"+ CodTransp +"','"+ dadCodigo +"','"+ nrLacres +"','"+ CodDoc +"','"+ TpDoc +"', '"+ CodMun +"')"
            );
            
            Conectar.stam.executeUpdate("INSERT INTO MDFE_LACRES_CARGA "
                    + "( COD_CARGA, COD_TRANSP, DAD_CODIGO, NR_LACRE, CODDOC, TP_DOC, COD_MUN)"
                    + "values('"+ CodCarga +"', '"+ CodTransp +"','"+ dadCodigo +"','"+ nrLacres +"','"+ CodDoc +"','"+ TpDoc +"', '"+ CodMun +"')"
            );
            
            Conectar.DesconectarBD();
            
            jFldNrLacres.setText("");
            
            CarregaTudoNrLacres(dadCodigo, CodTransp, CodCarga, CodDoc, TpDoc, CodMun);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir...\n" + e.getLocalizedMessage());
        }
    }
    
  
    
    public void DeletarLacres(String dadCodigo, String dadTransp,  String CodCarga, String CodDoc, String TipoDoc, String CodMun){
        try{
            for (int linha = 0; linha < jTableLacresCarga.getRowCount(); linha++) {
                if(((boolean) jTableLacresCarga.getValueAt(linha, 0) == true)){
                    Conectar.ConectarBD();

                    System.out.println("DELETE FROM MDFE_LACRES_CARGA "
                            + "WHERE NR_LACRE = '"+ jTableLacresCarga.getValueAt(linha, 1) + "' "
                            + "AND DAD_CODIGO = '"+ dadCodigo +"' AND COD_TRANSP = '"+ dadTransp +"' AND COD_CARGA = '"+CodCarga+"' AND CODDOC ='"+CodDoc+"' "
                                    + "AND TP_DOC = '"+TipoDoc+"' AND COD_MUN = '"+ CodMun +"' "
                    );
                    
                    Conectar.stam.executeUpdate("DELETE FROM MDFE_LACRES_CARGA "
                            + "WHERE NR_LACRE = '"+ jTableLacresCarga.getValueAt(linha, 1) + "' "
                            + "AND DAD_CODIGO = '"+ dadCodigo +"' AND COD_TRANSP = '"+ dadTransp +"' AND COD_CARGA = '"+CodCarga+"' AND CODDOC ='"+CodDoc+"' "
                                    + "AND TP_DOC = '"+TipoDoc+"' AND COD_MUN = '"+ CodMun +"' "
                    );

                    Conectar.DesconectarBD();
                }
            }
            
            CarregaTudoNrLacres(dadCodigo, dadTransp,CodCarga,CodDoc, TipoDoc, CodMun);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao deletar...\n" + e.getLocalizedMessage());
        }
    }
    
   
  public void Alterar(String codTransp, String codCarga, String dadCodigo, String tpUnCarga, String idUnCarga, Double qtdRatCarga, String tpDoc,
             Integer qtdLacre, String CodDoc, String CodMun) {
        try {
            Conectar.ConectarBD();
            
            

            System.out.println("UPDATE MDFE_UN_CARGA SET "
                    + "TP_UN_CARGA   = '" + tpUnCarga + "', "
                    + "ID_UN_CARGA   = '" + idUnCarga + "', "
                    + "QTD_RAT_CARGA = '" + qtdRatCarga + "', "
                    + "TP_DOC        = '" + tpDoc     + "', "                   
                    + "QTD_LACRE     = '" + qtdLacre  + "' "
                    
                    + "WHERE COD_CARGA = '" + codCarga + "' AND DAD_CODIGO   = '" + dadCodigo + "' AND COD_TRANSP = '"+codTransp + "' "
                            + "AND TP_DOC = '"+tpDoc+"' AND CODDOC = '"+CodDoc+"' AND COD_MUN = '"+ CodMun +"' "
            );

            Conectar.stam.executeUpdate("UPDATE MDFE_UN_CARGA SET "
                    + "TP_UN_CARGA   = '" + tpUnCarga + "', "
                    + "ID_UN_CARGA   = '" + idUnCarga + "', "
                    + "QTD_RAT_CARGA = '" + qtdRatCarga + "', "
                    + "TP_DOC        = '" + tpDoc     + "', "                   
                    + "QTD_LACRE     = '" + qtdLacre  + "' "
                    
                    + "WHERE COD_CARGA = '" + codCarga + "' AND DAD_CODIGO   = '" + dadCodigo + "' AND COD_TRANSP = '"+codTransp + "' "
                            + "AND TP_DOC = '"+tpDoc+"' AND CODDOC = '"+CodDoc+"' AND COD_MUN = '"+ CodMun +"' "
            );

            Conectar.DesconectarBD();

           
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao alterar...\n" + e.getLocalizedMessage());
        }
    } 
   public void BuscaCodMax() {
        try {  
            Conectar.ConectarBD();
            System.out.println("SELECT MAX(COD_CARGA) + 1 FROM MDFE_UN_CARGA  WHERE DAD_CODIGO = '" + util.sDAD_CODIGO + "' and COD_TRANSP = '" + util.sCOD_TRANSPORTE+"' and CODDOC ='"+util.sCODDOC+"' AND TP_DOC = '"+util.sTIPO_DOC+"' AND COD_MUN = '"+ util.sCOD_MUN +"' ");
            Conectar.result = Conectar.stam.executeQuery("SELECT MAX(COD_CARGA) + 1 FROM MDFE_UN_CARGA  WHERE DAD_CODIGO = '" + util.sDAD_CODIGO + "' and COD_TRANSP = '" + util.sCOD_TRANSPORTE+"' and CODDOC ='"+util.sCODDOC+"' AND TP_DOC = '"+util.sTIPO_DOC+"' AND COD_MUN = '"+ util.sCOD_MUN +"' ");
            while (Conectar.result.next()) {
                if (Conectar.result.getString(1) != null) {
                    util.sCOD_CARGA  = Conectar.result.getString(1);
                } else {
                    util.sCOD_CARGA = "1";
                }

            }

            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao gerar código...\n" + e.getLocalizedMessage());
        }
    } 
   
   
   
   
   
   
   
                  
   public Integer QtdLacreCarga(){
       Integer qtd =0;
        try {  
            Conectar.ConectarBD();
            System.out.println("");
            Conectar.result = Conectar.stam.executeQuery("SELECT count(*) "
                                                       + "FROM MDFE_LACRES_CARGA "
                                                       + "WHERE CODDOC = '"+util.sCODDOC+"' AND COD_TRANSP = '"+util.sCOD_TRANSPORTE+"' AND DAD_CODIGO = '"+util.sDAD_CODIGO+"'  AND COD_CARGA = '"+util.sCOD_CARGA+"' AND TP_DOC ='"+util.sTIPO_DOC+"'");
               
            while (Conectar.result.next()) {
                if (Conectar.result.getString(1) != null) {
                   qtd = Conectar.result.getInt(1);
                } 
                
            }
            
            Conectar.DesconectarBD();
           
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao gerar código...\n" + e.getLocalizedMessage());
        }
          return qtd;
    } 
   
   public String BuscaTpUnCarga() {
        String codigo = "";
        if (jCmbBxTipoCarga.getSelectedIndex() == 0) {
            codigo = "1";
        } else if (jCmbBxTipoCarga.getSelectedIndex() == 1) {
            codigo = "2";
        } else if (jCmbBxTipoCarga.getSelectedIndex() == 2) {
            codigo = "3";
        } else if (jCmbBxTipoCarga.getSelectedIndex() == 3) {
            codigo = "4";
        } 

        return codigo;
    } 
    
   public String CampoCalcTpUnCarga(String codigo){
       String tipo = "";
       if(codigo.equals("1")){
           tipo = "Container";
       }else if(codigo.equals("2")){
           tipo = "ULD";
       }else if(codigo.equals("3")){
           tipo = "Pallet";
       }else if(codigo.equals("")){
           tipo = "Outros";
       }
       
       return tipo;
   }
    
    public boolean VerificaNrLacre(){
        for (int linha = 0; linha < jTableLacresCarga.getRowCount(); linha++) {
            if(jFldNrLacres.getText().equals(jTableLacresCarga.getValueAt(linha, 1).toString())){
                JOptionPane.showMessageDialog(null, "Número do Lacre já inserido!");
                return false;
            }
        }
        
        if(jFldNrLacres.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Insira o número do lacre!");
            return false;
        }else{
            return true;
        }
    }
    
    public boolean VerificaField(){
        if(jCmbBxTipoCarga.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Escolha o tipo de unidade de Carga!");
            return false;
        }else if(jFldIdentificacaoCarga.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Campo Identificação não preechido!");
            return false;
        }else if(jFldQtdRateadaCarga.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Campo Unidade Rateada não preechido!");
            return false;
        }else{
            return true;
        }
    }
    
    public void CarregaCampoEdit(String dadCodigo, String codTransp, String codcarga,  String CodDoc , String TipoDoc, String CodMun) {
        try {
            Conectar.ConectarBD();

            Conectar.result = Conectar.stam.executeQuery("SELECT * FROM MDFE_UN_CARGA WHERE DAD_CODIGO = '" + dadCodigo + "' "
                    + "AND COD_TRANSP = '" + codTransp + "' AND COD_CARGA = '"+codcarga+"' AND CODDOC = '"+CodDoc+"' AND TP_DOC = '"+TipoDoc+"' "
                            + "AND COD_MUN = '"+ CodMun +"' "
            );

            while (Conectar.result.next()) {
               
                if (Conectar.result.getString("TP_UN_CARGA") != null) {
                    if (Conectar.result.getString("TP_UN_CARGA").equals("1")) {
                        jCmbBxTipoCarga.setSelectedIndex(0);
                    } else if (Conectar.result.getString("TP_UN_CARGA").equals("2")) {
                        jCmbBxTipoCarga.setSelectedIndex(1);
                    } else if (Conectar.result.getString("TP_UN_CARGA").equals("3")) {
                        jCmbBxTipoCarga.setSelectedIndex(2);
                    } else if (Conectar.result.getString("TP_UN_CARGA").equals("4")) {
                        jCmbBxTipoCarga.setSelectedIndex(3);
                    } 
                }
                jFldIdentificacaoCarga.setText(Conectar.result.getString("ID_UN_CARGA"));
                jFldQtdRateadaCarga.setText(util.TrocaPontoPorVirgula(Conectar.result.getFloat("QTD_RAT_CARGA")));
            }
            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados...\n" + e.getLocalizedMessage());
        }
    }
    
    public boolean VerificaUnidadeCarga(){
        if(jCmbBxTipoCarga.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Selecione o tipo da unidade de carga!");
            jCmbBxTipoCarga.requestFocus();
            return false;
        }else if(jFldIdentificacaoCarga.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Campo Indentifação não preechido!");
            jFldIdentificacaoCarga.requestFocus();
            return false;
        }else{
            return true;
        }
    }
    
    //Evento para sair da tela com a tecla esc
    //Chamar evento no construtor principal da classe
    public void SairEsc() {
        KeyStroke ks = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, true);
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(ks, "esc");
        getRootPane().getActionMap().put("esc", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
            }
        });
    }
    
    /**
     * Classe que implementa o método abstrato TableCellRenderer para poder fazer a troca de cor de fundo e fonte
     * do cabeçalho da tabela. 
     */
    private class MeuRenderizador extends JLabel implements TableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int rowIndex, int vColIndex) {

            table.getTableHeader().setBackground(Color.BLUE);
            table.getTableHeader().setOpaque(false);
            //table.getTableHeader().setFont(new Font("Dialog", 11, Font.BOLD));
            setBorder(new LineBorder(Color.WHITE, 1, true));
            setForeground(Color.WHITE);
            setFont(getFont().deriveFont(Font.BOLD));
            setHorizontalAlignment(SwingConstants.LEFT);

            setText(value.toString());

            return this;
        }
    }
    
}
