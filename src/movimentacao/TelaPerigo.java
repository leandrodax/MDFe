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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class TelaPerigo extends javax.swing.JDialog {

  public Integer codmax;
  private static String tag_acao = "1", TagAcao = "";
  Utilitarios util = new Utilitarios();
  DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
  DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
  DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();

  public TelaPerigo() {
    initComponents();
    jPnlCadastro.setVisible(false);
    DefinirFormulario();

    CarregaTudoProdutoPerigoso(util.sDAD_CODIGO.toString(), util.sCOD_MUN, util.sCODDOC, util.sTIPO_DOC, util.CODTRANSPORTE);
    SairEsc();
  }
  //util.sDAD_CODIGO.toString(), util.sCOD_MUN, util.sCODDOC, util.sTIPO_DOC
  // DAD_CODIGO,         COD_MUN,        CODDOC,        TP_DOC

  /* public TelaPerigo(){
        initComponents();               
        DefinirFormulario();
       
    }*/

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlPrincipal = new javax.swing.JPanel();
        jPnlSecundario = new javax.swing.JPanel();
        jPnlCadastro = new javax.swing.JPanel();
        jFldGruEmb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFldNR_UNO = new javax.swing.JTextField();
        jFldNmAproEmb = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFldQtdTotProd = new javax.swing.JTextField();
        jFldQtdTpVolume = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jFldClassRisco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBtnGravar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jFldCodigo = new javax.swing.JTextField();
        jBtnNovo = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePeri = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPnlPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jPnlSecundario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), " Informação de Produtos Perigosos Inseridos ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        jPnlCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro do Prod. Perigoso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jFldGruEmb.setDocument(new LimitaField(6, 1));
        jFldGruEmb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFldGruEmbFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFldGruEmbFocusLost(evt);
            }
        });
        jFldGruEmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFldGruEmbActionPerformed(evt);
            }
        });
        jFldGruEmb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldGruEmbKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFldGruEmbKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("Grupo da Embalagem");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Número UNO");

        jFldNR_UNO.setDocument(new LimitaField(4, 1)
        );
        jFldNR_UNO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFldNR_UNOFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFldNR_UNOFocusLost(evt);
            }
        });
        jFldNR_UNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFldNR_UNOActionPerformed(evt);
            }
        });
        jFldNR_UNO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldNR_UNOKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFldNR_UNOKeyTyped(evt);
            }
        });

        jFldNmAproEmb.setDocument(new LimitaField(150, 1));
        jFldNmAproEmb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldNmAproEmbKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Nome Apropriado para Embarque");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Quatidade Total por Produto");

        jFldQtdTotProd.setDocument(new LimitaField(20, 1));
        jFldQtdTotProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFldQtdTotProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFldQtdTotProdFocusLost(evt);
            }
        });
        jFldQtdTotProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFldQtdTotProdActionPerformed(evt);
            }
        });
        jFldQtdTotProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldQtdTotProdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFldQtdTotProdKeyTyped(evt);
            }
        });

        jFldQtdTpVolume.setDocument(new LimitaField(60, 1)
        );
        jFldQtdTpVolume.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFldQtdTpVolumeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFldQtdTpVolumeFocusLost(evt);
            }
        });
        jFldQtdTpVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFldQtdTpVolumeActionPerformed(evt);
            }
        });
        jFldQtdTpVolume.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldQtdTpVolumeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFldQtdTpVolumeKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("Quatidade e Tipo de Volume");

        jFldClassRisco.setDocument(new LimitaField(40, 1));
        jFldClassRisco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldClassRiscoKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Classe ou Subclasse e Risco Secundário");

        jBtnGravar.setText("Gravar");
        jBtnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGravarActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("Código");

        jFldCodigo.setBackground(new java.awt.Color(255, 255, 204));
        jFldCodigo.setEnabled(false);
        jFldCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFldCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFldCodigoFocusLost(evt);
            }
        });
        jFldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFldCodigoActionPerformed(evt);
            }
        });
        jFldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldCodigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFldCodigoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPnlCadastroLayout = new javax.swing.GroupLayout(jPnlCadastro);
        jPnlCadastro.setLayout(jPnlCadastroLayout);
        jPnlCadastroLayout.setHorizontalGroup(
            jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlCadastroLayout.createSequentialGroup()
                .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlCadastroLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jBtnGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnExcluir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlCadastroLayout.createSequentialGroup()
                        .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jFldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnlCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jFldNR_UNO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jFldNmAproEmb, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlCadastroLayout.createSequentialGroup()
                        .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnlCadastroLayout.createSequentialGroup()
                                .addComponent(jFldClassRisco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPnlCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                .addGap(183, 183, 183)))
                        .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jFldGruEmb, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jFldQtdTotProd, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jFldQtdTpVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );
        jPnlCadastroLayout.setVerticalGroup(
            jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jFldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFldNR_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPnlCadastroLayout.createSequentialGroup()
                            .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel5))
                            .addGap(25, 25, 25)))
                    .addComponent(jFldNmAproEmb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)))
                .addGap(5, 5, 5)
                .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, 0)
                        .addComponent(jFldClassRisco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPnlCadastroLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(25, 25, 25))
                        .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPnlCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, 0)
                                .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFldQtdTotProd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFldQtdTpVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFldGruEmb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jBtnNovo.setText("Novo");
        jBtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNovoActionPerformed(evt);
            }
        });

        jBtnSair.setText("Sair");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jTablePeri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "", "Código", "Número UNO", "Nome Apropriado Embarque","Classe do Risco","Grupo da Embalagem","Qtd. Total por Produto","Qtd. e Tipo de Volume"
            }
        ){
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                if(colIndex == 0){
                    return true;
                }else{
                    return false;
                }
                //Disallow the editing of any cell
            };

            Class[] types = new Class [] {

                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class , java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class

            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

        });
        jTablePeri.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTablePeriPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePeri);

        javax.swing.GroupLayout jPnlSecundarioLayout = new javax.swing.GroupLayout(jPnlSecundario);
        jPnlSecundario.setLayout(jPnlSecundarioLayout);
        jPnlSecundarioLayout.setHorizontalGroup(
            jPnlSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPnlSecundarioLayout.createSequentialGroup()
                .addComponent(jBtnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPnlSecundarioLayout.setVerticalGroup(
            jPnlSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlSecundarioLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnlCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addGroup(jPnlSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPnlPrincipalLayout = new javax.swing.GroupLayout(jPnlPrincipal);
        jPnlPrincipal.setLayout(jPnlPrincipalLayout);
        jPnlPrincipalLayout.setHorizontalGroup(
            jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPnlSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPnlPrincipalLayout.setVerticalGroup(
            jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlPrincipalLayout.createSequentialGroup()
                .addComponent(jPnlSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void jBtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNovoActionPerformed
    TagAcao = "1";
    CarregaTudoProdutoPerigoso(util.sDAD_CODIGO.toString(), util.sCOD_MUN, util.sCODDOC, util.sTIPO_DOC, util.CODTRANSPORTE);
    BuscaCodMax();
    jFldNR_UNO.setText("");    
    jFldNmAproEmb.setText("");
    jFldClassRisco.setText("");
    jFldGruEmb.setText("");
    jFldQtdTotProd.setText("");
    jFldQtdTpVolume.setText("");
    jPnlCadastro.setVisible(true);    
    jFldNR_UNO.requestFocus();
  }//GEN-LAST:event_jBtnNovoActionPerformed

  private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
    // TODO add your handling code here:
    dispose();
    // jTablePeri.getSelectionModel().clearSelection();
  }//GEN-LAST:event_jBtnSairActionPerformed

  private void jFldNmAproEmbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldNmAproEmbKeyPressed
    if (evt.getKeyCode() == evt.VK_ENTER) {
      jFldClassRisco.requestFocus();
    }
  }//GEN-LAST:event_jFldNmAproEmbKeyPressed

  private void jFldNR_UNOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldNR_UNOKeyTyped
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldNR_UNOKeyTyped

  private void jFldNR_UNOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldNR_UNOKeyPressed
    // TODO add your handling code here:
    if (evt.getKeyCode() == evt.VK_ENTER) {
      jFldNmAproEmb.requestFocus();
    }
  }//GEN-LAST:event_jFldNR_UNOKeyPressed

  private void jFldNR_UNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldNR_UNOActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldNR_UNOActionPerformed

  private void jFldNR_UNOFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldNR_UNOFocusLost
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldNR_UNOFocusLost

  private void jFldNR_UNOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldNR_UNOFocusGained
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldNR_UNOFocusGained

  private void jFldCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldCodigoKeyTyped
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldCodigoKeyTyped

  private void jFldCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldCodigoKeyPressed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldCodigoKeyPressed

  private void jFldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldCodigoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldCodigoActionPerformed

  private void jFldCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldCodigoFocusLost
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldCodigoFocusLost

  private void jFldCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldCodigoFocusGained
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldCodigoFocusGained

  private void jFldClassRiscoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldClassRiscoKeyPressed
    if (evt.getKeyCode() == evt.VK_ENTER) {
      jFldGruEmb.requestFocus();
    }
  }//GEN-LAST:event_jFldClassRiscoKeyPressed

  private void jFldGruEmbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldGruEmbKeyTyped

  }//GEN-LAST:event_jFldGruEmbKeyTyped

  private void jFldGruEmbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldGruEmbKeyPressed
    if (evt.getKeyCode() == evt.VK_ENTER) {
      jFldQtdTotProd.requestFocus();
    }
  }//GEN-LAST:event_jFldGruEmbKeyPressed

  private void jFldGruEmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldGruEmbActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldGruEmbActionPerformed

  private void jFldGruEmbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldGruEmbFocusLost
    
  }//GEN-LAST:event_jFldGruEmbFocusLost

  private void jFldGruEmbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldGruEmbFocusGained
//;    jFldGruEmb.selectAll();
  }//GEN-LAST:event_jFldGruEmbFocusGained

  private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
    if (jTablePeri.getSelectedRow() > -1) {

      Deletar(util.sDAD_CODIGO.toString(), util.sCOD_MUN, util.sCODDOC, util.sTIPO_DOC, util.CODTRANSPORTE);
      CarregaTudoProdutoPerigoso(util.sDAD_CODIGO.toString(), util.sCOD_MUN, util.sCODDOC, util.sTIPO_DOC, util.CODTRANSPORTE);
      jBtnNovo.doClick();
    } else {
      JOptionPane.showMessageDialog(null, "Selecione um item para Deletar!");
    }
  }//GEN-LAST:event_jBtnExcluirActionPerformed

  private void jBtnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGravarActionPerformed
    // util.sDAD_CODIGO.toString(), util.sCOD_MUN, util.sCODDOC, util.sTIPO_DOC
    int selecionada = 0;
    for (int linha = 0; linha < jTablePeri.getRowCount(); linha++) {
      if (((boolean) jTablePeri.getValueAt(linha, 0)) == true) {
        selecionada++;
      }
    }

    

    if (((selecionada == 0) && (VerificaField() == true)) || (TagAcao == "1")){

      Inserir(util.CODIGOPERI, util.sDAD_CODIGO.toString(), util.sCOD_MUN, util.sCODDOC, util.sTIPO_DOC, util.CODTRANSPORTE,
              jFldNR_UNO.getText(), jFldNmAproEmb.getText(), jFldClassRisco.getText(), jFldGruEmb.getText(),
              jFldQtdTotProd.getText(), jFldQtdTpVolume.getText());
      CarregaTudoProdutoPerigoso(util.sDAD_CODIGO.toString(), util.sCOD_MUN, util.sCODDOC, util.sTIPO_DOC, util.CODTRANSPORTE);
      jBtnNovo.doClick();
    } else if (((selecionada == 1) && (VerificaField() == true)) && (TagAcao == "2")) {
      if (jTablePeri.getSelectedRow() > -1) {
        Alterar(util.CODIGOPERI, util.sDAD_CODIGO.toString(), util.sCOD_MUN, util.sCODDOC, util.sTIPO_DOC, util.CODTRANSPORTE,
                jFldNR_UNO.getText(), jFldNmAproEmb.getText(), jFldClassRisco.getText(), jFldGruEmb.getText(),
                jFldQtdTotProd.getText(), jFldQtdTpVolume.getText());
        CarregaTudoProdutoPerigoso(util.sDAD_CODIGO.toString(), util.sCOD_MUN, util.sCODDOC, util.sTIPO_DOC, util.CODTRANSPORTE);
        jBtnNovo.doClick();
      } else {
        JOptionPane.showMessageDialog(null, "Selecione um item para Editar!");
      }
    }
  }//GEN-LAST:event_jBtnGravarActionPerformed

  private void jFldQtdTpVolumeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldQtdTpVolumeKeyTyped
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldQtdTpVolumeKeyTyped

  private void jFldQtdTpVolumeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldQtdTpVolumeKeyPressed
    // TODO add your handling code here:

    if (evt.getKeyCode() == evt.VK_ENTER) {
      jBtnGravar.requestFocus();
    }
  }//GEN-LAST:event_jFldQtdTpVolumeKeyPressed

  private void jFldQtdTpVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldQtdTpVolumeActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldQtdTpVolumeActionPerformed

  private void jFldQtdTpVolumeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldQtdTpVolumeFocusLost
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldQtdTpVolumeFocusLost

  private void jFldQtdTpVolumeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldQtdTpVolumeFocusGained
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldQtdTpVolumeFocusGained

  private void jFldQtdTotProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldQtdTotProdKeyTyped
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldQtdTotProdKeyTyped

  private void jFldQtdTotProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldQtdTotProdKeyPressed
    // TODO add your handling code here:
    if (evt.getKeyCode() == evt.VK_ENTER) {
      jFldQtdTpVolume.requestFocus();
    }
  }//GEN-LAST:event_jFldQtdTotProdKeyPressed

  private void jFldQtdTotProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldQtdTotProdActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldQtdTotProdActionPerformed

  private void jFldQtdTotProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldQtdTotProdFocusLost
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldQtdTotProdFocusLost

  private void jFldQtdTotProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldQtdTotProdFocusGained
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldQtdTotProdFocusGained

  private void jTablePeriPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTablePeriPropertyChange
    // TODO add your handling code here:

    int linha = 0;
    int Selecionada = 0;
    for (linha = 0; linha < jTablePeri.getRowCount(); linha++) {
      if (((boolean) jTablePeri.getValueAt(linha, 0)) == true) {
        Selecionada++;
      }

    }

    if (Selecionada > 1 || Selecionada == 0) {
      jPnlCadastro.setVisible(false);
    }

    if (Selecionada == 1) {
      jPnlCadastro.setVisible(true);
      TagAcao = "2";
      
      for (linha = 0; linha < jTablePeri.getRowCount(); linha++) {
        if (((boolean) jTablePeri.getValueAt(linha, 0)) == true) {
          Selecionada++;          
          CarregaCampoEdit(jTablePeri.getValueAt(linha, 1).toString(), util.sDAD_CODIGO.toString(), util.sCOD_MUN, util.sCODDOC, util.sTIPO_DOC);
        }

      }

    }

  }//GEN-LAST:event_jTablePeriPropertyChange

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
      java.util.logging.Logger.getLogger(TelaPerigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaPerigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaPerigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaPerigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        new TelaPerigo().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnGravar;
    private javax.swing.JButton jBtnNovo;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JTextField jFldClassRisco;
    private javax.swing.JTextField jFldCodigo;
    private javax.swing.JTextField jFldGruEmb;
    private javax.swing.JTextField jFldNR_UNO;
    private javax.swing.JTextField jFldNmAproEmb;
    private javax.swing.JTextField jFldQtdTotProd;
    private javax.swing.JTextField jFldQtdTpVolume;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPnlCadastro;
    private javax.swing.JPanel jPnlPrincipal;
    private javax.swing.JPanel jPnlSecundario;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePeri;
    // End of variables declaration//GEN-END:variables

  /**
   * Define as especificações do formulário.
   */
  public void DefinirFormulario() {
    //Define o tamanho do jframe
    setSize(1040, 450);

    //Define o titulo
    setTitle("Produtos Perigosos");

    //Centraliza o jframe
    setLocationRelativeTo(null);
    //Permite que seja selecianada apenas uma linha por vez da jTable
    jTablePeri.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    //Ativa o barra de rolagem horizontal
    jTablePeri.setAutoResizeMode(jTablePeri.AUTO_RESIZE_OFF);

    centro.setHorizontalAlignment(SwingConstants.CENTER);
    direita.setHorizontalAlignment(SwingConstants.RIGHT);
    esquerda.setHorizontalAlignment(SwingConstants.LEFT);

    //Seta o renderizador personalizado no cabecalho da tabela
    for (int col = 0; col < jTablePeri.getColumnCount(); col++) {
      jTablePeri.getColumnModel().getColumn(col).setHeaderRenderer(new MeuRenderizador());
    }

    //Define o tamanho minimo e maximo das seguintes colunas
    jTablePeri.getColumnModel().getColumn(0).setMaxWidth(30);
    jTablePeri.getColumnModel().getColumn(0).setMinWidth(30);
    //  jTablePeri.getColumnModel().getColumn(0).setCellRenderer(esquerda);

    //Número UNO
    jTablePeri.getColumnModel().getColumn(1).setMinWidth(100);
    jTablePeri.getColumnModel().getColumn(1).setMaxWidth(300);
    jTablePeri.getColumnModel().getColumn(1).setCellRenderer(esquerda);

    jTablePeri.getColumnModel().getColumn(2).setMinWidth(100);
    jTablePeri.getColumnModel().getColumn(2).setMaxWidth(200);
    jTablePeri.getColumnModel().getColumn(2).setCellRenderer(esquerda);

    jTablePeri.getColumnModel().getColumn(3).setMinWidth(200);
    jTablePeri.getColumnModel().getColumn(3).setMaxWidth(300);
    jTablePeri.getColumnModel().getColumn(3).setCellRenderer(esquerda);

    jTablePeri.getColumnModel().getColumn(4).setMinWidth(200);
    jTablePeri.getColumnModel().getColumn(4).setMaxWidth(300);
    jTablePeri.getColumnModel().getColumn(4).setCellRenderer(esquerda);

    jTablePeri.getColumnModel().getColumn(5).setMinWidth(150);
    jTablePeri.getColumnModel().getColumn(5).setMaxWidth(200);
    jTablePeri.getColumnModel().getColumn(5).setCellRenderer(esquerda);

    jTablePeri.getColumnModel().getColumn(6).setMinWidth(150);
    jTablePeri.getColumnModel().getColumn(6).setMaxWidth(200);
    jTablePeri.getColumnModel().getColumn(6).setCellRenderer(esquerda);

    jTablePeri.getColumnModel().getColumn(7).setMinWidth(150);
    jTablePeri.getColumnModel().getColumn(7).setMaxWidth(200);
    jTablePeri.getColumnModel().getColumn(7).setCellRenderer(esquerda);
    //Define o modo de selecao da tabela para apenas uma linha

    jBtnNovo.setMnemonic(KeyEvent.VK_O);
    //jBFecharUnidadeCarga.setMnemonic(KeyEvent.VK_F);

    setModal(true);

  }

  public void LimpaTabela(JTable jtable) {
    DefaultTableModel dtm = (DefaultTableModel) jtable.getModel();
    dtm.setRowCount(0);

  }
  //util.sDAD_CODIGO.toString(), util.sCOD_MUN, util.sCODDOC, util.sTIPO_DOC

  public void CarregaTudoProdutoPerigoso(String DAD_CODIGO, String COD_MUN, String CODDOC, String TP_DOC, String CODTRANSPORTE) {
    try {
      Conectar.ConectarBD();
      LimpaTabela(jTablePeri);
      Conectar.result = Conectar.stam.executeQuery("SELECT * FROM  MDFE_PERIGO WHERE DAD_CODIGO = '" + DAD_CODIGO + "' AND COD_MUN = '" + COD_MUN + "'"
              + "AND CODDOC ='" + CODDOC + "' AND TP_DOC ='" + TP_DOC + "' AND CODTRANSPORTE ='" + CODTRANSPORTE + "'");
      DefaultTableModel dtm = (DefaultTableModel) jTablePeri.getModel();//CODDOC, COD_TRANSP, DAD_CODIGO, COD_CARGA
      while (Conectar.result.next()) {
        dtm.addRow(new Object[]{
          false,
          Conectar.result.getString("CODIGO"),
          Conectar.result.getString("NRONU"),
          Conectar.result.getString("NOME_APROP_EMB"),
          Conectar.result.getString("CLARISCO"),
          Conectar.result.getString("GREMB"),
          Conectar.result.getString("QTOTPROD"),
          Conectar.result.getString("VALTIPO")});
      }
      Conectar.DesconectarBD();
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Erro ao carregar dados na tabela...\n" + e.getLocalizedMessage());
    }
  }

  public void Inserir(String CODIGO, String DAD_CODIGO, String COD_MUN, String CODDOC, String TP_DOC, String CODTRANSPORTE, String NRONU, String NOME_APROP_EMB, String CLARISCO, String GREMB, String QTOTPROD, String VALTIPO) {

    try {
      Conectar.ConectarBD();

      System.out.println("INSERT INTO  MDFE_PERIGO "
              + "(CODIGO, DAD_CODIGO, COD_MUN, CODDOC, TP_DOC, CODTRANSPORTE, NRONU, NOME_APROP_EMB, CLARISCO, GREMB, QTOTPROD, VALTIPO)"
              + "values('" + CODIGO + "','" + DAD_CODIGO + "', '" + COD_MUN + "', '" + CODDOC + "','" + TP_DOC + "','" + CODTRANSPORTE + "','" + NRONU + "', '" + NOME_APROP_EMB + "', '" + CLARISCO + "', '" + GREMB + "', '" + QTOTPROD + "', '" + VALTIPO + "' )"
      );

      Conectar.stam.executeUpdate("INSERT INTO  MDFE_PERIGO "
              + "(CODIGO, DAD_CODIGO, COD_MUN, CODDOC, TP_DOC, CODTRANSPORTE, NRONU, NOME_APROP_EMB, CLARISCO, GREMB, QTOTPROD, VALTIPO)"
              + "values('" + CODIGO + "','" + DAD_CODIGO + "', '" + COD_MUN + "', '" + CODDOC + "','" + TP_DOC + "','" + CODTRANSPORTE + "','" + NRONU + "', '" + NOME_APROP_EMB + "', '" + CLARISCO + "', '" + GREMB + "', '" + QTOTPROD + "', '" + VALTIPO + "' )"
      );

      Conectar.DesconectarBD();
      JOptionPane.showMessageDialog(null, "Inserido com Sucesso!");

    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Erro ao inserir...\n" + e.getLocalizedMessage());
    }
  }

  public void Deletar(String DAD_CODIGO, String COD_MUN, String CODDOC, String TP_DOC, String CODTRANSPORTE) {
    try {
      for (int linha = 0; linha < jTablePeri.getRowCount(); linha++) {
        if (((boolean) jTablePeri.getValueAt(linha, 0) == true)) {
          Conectar.ConectarBD();

          System.out.println("DELETE FROM  MDFE_PERIGO "
                  + "WHERE CODIGO = '" + jTablePeri.getValueAt(linha, 1) + "' "
                  + "AND DAD_CODIGO = '" + DAD_CODIGO + "' AND COD_MUN = '" + COD_MUN + "' AND CODDOC = '" + CODDOC + "' AND TP_DOC ='" + TP_DOC + "' AND CODTRANSPORTE = ' " + CODTRANSPORTE + "'");

          Conectar.stam.executeUpdate("DELETE FROM  MDFE_PERIGO "
                  + "WHERE CODIGO = '" + jTablePeri.getValueAt(linha, 1) + "' "
                  + "AND DAD_CODIGO = '" + DAD_CODIGO + "' AND COD_MUN = '" + COD_MUN + "' AND CODDOC = '" + CODDOC + "' AND TP_DOC ='" + TP_DOC + "' AND CODTRANSPORTE = ' " + CODTRANSPORTE + "'");

          Conectar.DesconectarBD();
          JOptionPane.showMessageDialog(null, "Deletado com Sucesso!");
        }
      }

      CarregaTudoProdutoPerigoso(DAD_CODIGO, COD_MUN, CODDOC, TP_DOC, CODTRANSPORTE);

    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Erro ao deletar...\n" + e.getLocalizedMessage());
    }
  }

  public void Alterar(String CODIGO, String DAD_CODIGO, String COD_MUN, String CODDOC, String TP_DOC, String CODTRANSPORTE, String NRONU, String NOME_APROP_EMB, String CLARISCO, String GREMB, String QTOTPROD, String VALTIPO) {
    try {
      Conectar.ConectarBD();

      System.out.println("UPDATE  MDFE_PERIGO SET "
              + "NRONU            = '" + NRONU + "', "
              + "NOME_APROP_EMB   = '" + NOME_APROP_EMB + "', "
              + "CLARISCO         = '" + CLARISCO + "', "
              + "GREMB            = '" + GREMB + "', "
              + "QTOTPROD         = '" + QTOTPROD + "', "
              + "VALTIPO          = '" + VALTIPO + "' "
              + "WHERE CODIGO = '" + CODIGO + "' "
              + "AND DAD_CODIGO = '" + DAD_CODIGO + "' AND COD_MUN = '" + COD_MUN + "' AND CODDOC = '" + CODDOC + "' AND TP_DOC ='" + TP_DOC + "' AND CODTRANSPORTE = '" + CODTRANSPORTE + "'"
      );

      Conectar.stam.executeUpdate("UPDATE  MDFE_PERIGO SET "
              + "NRONU            = '" + NRONU + "', "
              + "NOME_APROP_EMB   = '" + NOME_APROP_EMB + "', "
              + "CLARISCO         = '" + CLARISCO + "', "
              + "GREMB            = '" + GREMB + "', "
              + "QTOTPROD         = '" + QTOTPROD + "', "
              + "VALTIPO          = '" + VALTIPO + "' "
              + "WHERE CODIGO = '" + CODIGO + "' "
              + "AND DAD_CODIGO = '" + DAD_CODIGO + "' AND COD_MUN = '" + COD_MUN + "' AND CODDOC = '" + CODDOC + "' AND TP_DOC ='" + TP_DOC + "' AND CODTRANSPORTE = '" + CODTRANSPORTE + "'"
      );

      Conectar.DesconectarBD();
      JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");

    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Erro ao alterar...\n" + e.getLocalizedMessage());
    }
  }

  public void BuscaCodMax() {
    try {
      Conectar.ConectarBD();
      System.out.println("SELECT MAX(CODIGO) + 1 FROM  MDFE_PERIGO  WHERE DAD_CODIGO = '" + util.sDAD_CODIGO + "'  AND CODDOC ='" + util.sCODDOC + "' AND TP_DOC = '" + util.sTIPO_DOC + "' AND COD_MUN = '" + util.sCOD_MUN + "' AND CODTRANSPORTE = '" + util.CODTRANSPORTE + "'");
      Conectar.result = Conectar.stam.executeQuery("SELECT MAX(CODIGO) + 1 FROM  MDFE_PERIGO  WHERE DAD_CODIGO = '" + util.sDAD_CODIGO + "'  AND CODDOC ='" + util.sCODDOC + "' AND TP_DOC = '" + util.sTIPO_DOC + "' AND COD_MUN = '" + util.sCOD_MUN + "' AND CODTRANSPORTE = '" + util.CODTRANSPORTE + "'");
      while (Conectar.result.next()) {
        if (Conectar.result.getString(1) != null) {
          util.CODIGOPERI = Conectar.result.getString(1);
          jFldCodigo.setText(util.CODIGOPERI);
        } else {
          util.CODIGOPERI = "1";
          jFldCodigo.setText(util.CODIGOPERI);
        }

      }

      Conectar.DesconectarBD();
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Erro ao gerar código...\n" + e.getLocalizedMessage());
    }
  }

  public boolean VerificaField() {
    if (jFldClassRisco.getText().length() == 0 ) {
      JOptionPane.showMessageDialog(null, "Campo Identificação não preechido!");
      return false;
    } else if (jFldGruEmb.getText().length() == 0) {
      JOptionPane.showMessageDialog(null, "Campo Unidade Rateada não preechido!");
      return false;
    } else if (jFldNR_UNO.getText().length() == 0 || jFldNR_UNO.getText().length() < 4) {
      JOptionPane.showMessageDialog(null, "Campo NR UNO deve conter 4 caracteres!");
      return false;
    } else if (jFldNmAproEmb.getText().length() == 0) {
      JOptionPane.showMessageDialog(null, "Campo Nome Apropriado para Embarque  não preechido!");
      return false;
    } else if (jFldQtdTotProd.getText().length() == 0) {
      JOptionPane.showMessageDialog(null, "Campo Quatidade Total por Produto não preechido!");
      return false;
    } else if (jFldQtdTpVolume.getText().length() == 0) {
      JOptionPane.showMessageDialog(null, "Campo Quatidade e Tipo de Volume não preechido!");
      return false;
    } else {
      return true;
    }

  }

  public void CarregaCampoEdit(String CODIGO, String DAD_CODIGO, String COD_MUN, String CODDOC, String TP_DOC) {
    try {
      Conectar.ConectarBD();

      Conectar.result = Conectar.stam.executeQuery("SELECT * FROM  MDFE_PERIGO WHERE CODIGO = '" + CODIGO + "' "
              + "AND DAD_CODIGO = '" + DAD_CODIGO + "' AND COD_MUN = '" + COD_MUN + "' AND CODDOC = '" + CODDOC + "' AND TP_DOC = '" + TP_DOC + "' AND CODTRANSPORTE = '" + util.CODTRANSPORTE + "'"
      );

      while (Conectar.result.next()) {
        util.CODIGOPERI = Conectar.result.getString("CODIGO");
        jFldCodigo.setText(util.CODIGOPERI);
        jFldNR_UNO.setText(Conectar.result.getString("NRONU"));
        jFldNmAproEmb.setText(Conectar.result.getString("NOME_APROP_EMB"));
        jFldClassRisco.setText(Conectar.result.getString("CLARISCO"));
        jFldGruEmb.setText(Conectar.result.getString("GREMB"));
        jFldQtdTotProd.setText(Conectar.result.getString("QTOTPROD"));
        jFldQtdTpVolume.setText(Conectar.result.getString("VALTIPO"));
      }
      Conectar.DesconectarBD();
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Erro ao carregar dados...\n" + e.getLocalizedMessage());
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
   * Classe que implementa o método abstrato TableCellRenderer para poder fazer
   * a troca de cor de fundo e fonte do cabeçalho da tabela.
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
