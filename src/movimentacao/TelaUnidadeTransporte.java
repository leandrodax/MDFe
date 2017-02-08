
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

public class TelaUnidadeTransporte extends javax.swing.JDialog {

    public Integer codmax;
    private static String tag_acao = "1", sCOD_TRANSP = "1", sTIPO_DOC = "", sCHAVE = "";
    Utilitarios util = new Utilitarios();

    public TelaUnidadeTransporte() {
        initComponents();
        DefinirFormulario();
    }

    /**
     * Construtor para chamar a tela de unidade de transporte.<br>
     *
     * @param sDAD_CODIGO O código do MDF-e;
     * @param sCOD_TRANSP O código da unidade de transporte. Pode ser null se a
     * tag_acao for 1;
     * @param sTIPO_DOC O código do tipo do documento: C -> CT-e, N -> NF-e, M
     * -> MDF-e;
     * @param sCHAVE A chave do documento;
     * @param sTAG_ACAO A tag de ação: 1 - Inserir, 2 - Alterar;
     */
    public TelaUnidadeTransporte(String sDAD_CODIGO, String sCOD_TRANSP, String sTIPO_DOC, String sCHAVE, String sTAG_ACAO) {
        initComponents();

        //Passa os valores dos parametros para as variaveis da classe
        TelaUnidadeTransporte.sCOD_TRANSP = sCOD_TRANSP;
        TelaUnidadeTransporte.sTIPO_DOC = sTIPO_DOC;
        TelaUnidadeTransporte.sCHAVE = sCHAVE;
        tag_acao = sTAG_ACAO;

        DefinirFormulario();
        SairEsc();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlPrincipal = new javax.swing.JPanel();
        jPnlUndTransporte = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFldUndRateada = new javax.swing.JTextField();
        jCmbBxTipoRodoviario = new javax.swing.JComboBox<>();
        jFldIdentificacao = new javax.swing.JTextField();
        jPnlLacres = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jFldNrLacres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLacres = new javax.swing.JTable();
        jBtIncluirLacres = new javax.swing.JButton();
        jBtExcluirLacres = new javax.swing.JButton();
        jPnlUndCarga = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUndCargas = new javax.swing.JTable();
        jBtIncluirUnidadesDeCarga = new javax.swing.JButton();
        jBtExcluirUnidadesDeCarga = new javax.swing.JButton();
        jBtEditar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jFldCodTransp = new javax.swing.JTextField();
        jBtOkUnidadeTransporte = new javax.swing.JButton();
        jBFecharUnidadeTransporte = new javax.swing.JButton();
        jFldCodDoc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPnlPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Unidade de Transporte", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jPnlUndTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Unidades de Transporte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("*Tipo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("*Identificação:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("*Unidade Rateada:");

        jFldUndRateada.setText("0,00");
        jFldUndRateada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFldUndRateadaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFldUndRateadaFocusLost(evt);
            }
        });
        jFldUndRateada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldUndRateadaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFldUndRateadaKeyTyped(evt);
            }
        });

        jCmbBxTipoRodoviario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rodoviário Tração", "Rodoviário Reboque", "Navio", "Balsa", "Aeronave", "Vagão", "Outros" }));
        jCmbBxTipoRodoviario.setSelectedIndex(-1);
        jCmbBxTipoRodoviario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbBxTipoRodoviarioActionPerformed(evt);
            }
        });
        jCmbBxTipoRodoviario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCmbBxTipoRodoviarioKeyPressed(evt);
            }
        });

        jFldIdentificacao.setDocument(new LimitaField(20, 1));
        jFldIdentificacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldIdentificacaoKeyPressed(evt);
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

        jTableLacres.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableLacres.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableLacres);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlLacresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPnlLacresLayout.createSequentialGroup()
                .addGroup(jPnlLacresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlLacresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtIncluirLacres)
                        .addGap(18, 18, 18)
                        .addComponent(jBtExcluirLacres))
                    .addGroup(jPnlLacresLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(17, 17, 17)
                        .addComponent(jFldNrLacres, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlLacresLayout.setVerticalGroup(
            jPnlLacresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlLacresLayout.createSequentialGroup()
                .addGroup(jPnlLacresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFldNrLacres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnlLacresLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(jPnlLacresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtIncluirLacres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtExcluirLacres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPnlUndCarga.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Unidades de Carga", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        jTableUndCargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "", "Código", "Tipo de Carga", "Identificação", "Qtd. Rateada", "Qtd. de Lacres"
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
                java.lang.Boolean.class, java.lang.Object.class  ,java.lang.Object.class ,java.lang.Object.class ,java.lang.Object.class ,java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableUndCargas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableUndCargas);

        jBtIncluirUnidadesDeCarga.setText("Incluir");
        jBtIncluirUnidadesDeCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtIncluirUnidadesDeCargaActionPerformed(evt);
            }
        });

        jBtExcluirUnidadesDeCarga.setText("Excluir");
        jBtExcluirUnidadesDeCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtExcluirUnidadesDeCargaActionPerformed(evt);
            }
        });

        jBtEditar.setText("Editar");
        jBtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlUndCargaLayout = new javax.swing.GroupLayout(jPnlUndCarga);
        jPnlUndCarga.setLayout(jPnlUndCargaLayout);
        jPnlUndCargaLayout.setHorizontalGroup(
            jPnlUndCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlUndCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlUndCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPnlUndCargaLayout.createSequentialGroup()
                        .addComponent(jBtIncluirUnidadesDeCarga)
                        .addGap(18, 18, 18)
                        .addComponent(jBtEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtExcluirUnidadesDeCarga)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPnlUndCargaLayout.setVerticalGroup(
            jPnlUndCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlUndCargaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlUndCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtIncluirUnidadesDeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtExcluirUnidadesDeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Cód.  Transporte");

        jFldCodTransp.setEditable(false);
        jFldCodTransp.setBackground(new java.awt.Color(255, 255, 204));
        jFldCodTransp.setEnabled(false);

        jBtOkUnidadeTransporte.setText("Ok");
        jBtOkUnidadeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtOkUnidadeTransporteActionPerformed(evt);
            }
        });

        jBFecharUnidadeTransporte.setText("Fechar");
        jBFecharUnidadeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharUnidadeTransporteActionPerformed(evt);
            }
        });

        jFldCodDoc.setEditable(false);
        jFldCodDoc.setBackground(new java.awt.Color(255, 255, 204));
        jFldCodDoc.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Cód. Documento");

        javax.swing.GroupLayout jPnlUndTransporteLayout = new javax.swing.GroupLayout(jPnlUndTransporte);
        jPnlUndTransporte.setLayout(jPnlUndTransporteLayout);
        jPnlUndTransporteLayout.setHorizontalGroup(
            jPnlUndTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlLacres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPnlUndCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPnlUndTransporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtOkUnidadeTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBFecharUnidadeTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPnlUndTransporteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPnlUndTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jFldCodDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPnlUndTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFldCodTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(jPnlUndTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jCmbBxTipoRodoviario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPnlUndTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFldIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPnlUndTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jFldUndRateada, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPnlUndTransporteLayout.setVerticalGroup(
            jPnlUndTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlUndTransporteLayout.createSequentialGroup()
                .addGroup(jPnlUndTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlUndTransporteLayout.createSequentialGroup()
                        .addGroup(jPnlUndTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlUndTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5))
                            .addGroup(jPnlUndTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)))
                        .addGap(2, 2, 2)
                        .addGroup(jPnlUndTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCmbBxTipoRodoviario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFldIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFldUndRateada, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlUndTransporteLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(2, 2, 2)
                        .addGroup(jPnlUndTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFldCodDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFldCodTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jPnlLacres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnlUndCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnlUndTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBFecharUnidadeTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtOkUnidadeTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPnlPrincipalLayout = new javax.swing.GroupLayout(jPnlPrincipal);
        jPnlPrincipal.setLayout(jPnlPrincipalLayout);
        jPnlPrincipalLayout.setHorizontalGroup(
            jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlUndTransporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPnlPrincipalLayout.setVerticalGroup(
            jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlUndTransporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtIncluirLacresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtIncluirLacresActionPerformed
        if (VerificaNrLacre() == true) {
            InserirLacres(util.sCODDOC, jFldCodTransp.getText(), util.sDAD_CODIGO.toString(), jFldNrLacres.getText(), util.sTIPO_DOC, util.sCOD_MUN);
            jFldNrLacres.requestFocus();
        }
    }//GEN-LAST:event_jBtIncluirLacresActionPerformed

    private void jBtExcluirLacresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExcluirLacresActionPerformed
        Integer option = JOptionPane.showConfirmDialog(null, "Deseja excluir o(s) lacre(s) selecionado(s)?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
           DeletarLacres(util.sDAD_CODIGO.toString(), jFldCodTransp.getText(),util.sCODDOC, util.sTIPO_DOC, util.sCOD_MUN);
        }
    }//GEN-LAST:event_jBtExcluirLacresActionPerformed

    private void jBtOkUnidadeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtOkUnidadeTransporteActionPerformed
        if(VerificaField() == true){
            Alterar(jFldCodTransp.getText(), util.sDAD_CODIGO.toString(), BuscaTpUndTransporte(), jFldIdentificacao.getText(), Double.parseDouble(util.TrocaVirgulaPorPonto(jFldUndRateada.getText())),
                sTIPO_DOC, QtdUnidadeCarga(), QtdLacreTransporte(), sCHAVE,  util.sCODDOC, util.sCOD_MUN);
        }
    }//GEN-LAST:event_jBtOkUnidadeTransporteActionPerformed

    private void jFldUndRateadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldUndRateadaFocusLost
        if (jFldUndRateada.getText().length() == 0) {
            jFldUndRateada.setText(new DecimalFormat("#,##0.00").format(0.0));
        } else {
            jFldUndRateada.setText(new DecimalFormat("#,##0.00").format(Double.parseDouble(util.TrocaVirgulaPorPonto(jFldUndRateada.getText()))));
        }
    }//GEN-LAST:event_jFldUndRateadaFocusLost

    private void jFldUndRateadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldUndRateadaKeyTyped
        String Caracateres = "01233456789,";
        if (!Caracateres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jFldUndRateadaKeyTyped

    private void jCmbBxTipoRodoviarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCmbBxTipoRodoviarioKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jFldIdentificacao.requestFocus();
        }
    }//GEN-LAST:event_jCmbBxTipoRodoviarioKeyPressed

    private void jFldIdentificacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldIdentificacaoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jFldUndRateada.requestFocus();
        }
    }//GEN-LAST:event_jFldIdentificacaoKeyPressed

    private void jBFecharUnidadeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharUnidadeTransporteActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharUnidadeTransporteActionPerformed

    private void jFldUndRateadaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldUndRateadaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jFldNrLacres.requestFocus();
        }
    }//GEN-LAST:event_jFldUndRateadaKeyPressed

    private void jFldNrLacresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldNrLacresKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jBtIncluirLacres.requestFocus();
        }
    }//GEN-LAST:event_jFldNrLacresKeyPressed

    private void jBtIncluirLacresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtIncluirLacresKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jBtIncluirLacres.doClick();
        }
    }//GEN-LAST:event_jBtIncluirLacresKeyPressed

    private void jFldUndRateadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldUndRateadaFocusGained
        jFldUndRateada.selectAll();
    }//GEN-LAST:event_jFldUndRateadaFocusGained

    private void jBtIncluirUnidadesDeCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtIncluirUnidadesDeCargaActionPerformed
         // TODO add your handling code here:
        TelaUnidadeCarga telauncarga = new TelaUnidadeCarga(jFldCodTransp.getText(), "1");
        telauncarga.setVisible(true);
        CarregaTudoUnidadeCarga(util.sDAD_CODIGO.toString(), jFldCodTransp.getText(), util.sCODDOC, util.sTIPO_DOC, util.sCOD_MUN);
    }//GEN-LAST:event_jBtIncluirUnidadesDeCargaActionPerformed

    private void jBtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEditarActionPerformed
         for (int linha = 0; linha < jTableUndCargas.getRowCount(); linha++) {
                if (((boolean) jTableUndCargas.getValueAt(linha, 0)) == true) {
                    util.sCOD_CARGA =  jTableUndCargas.getValueAt(linha, 1).toString();
                }
            }

        TelaUnidadeCarga telauncarga = new TelaUnidadeCarga(jFldCodTransp.getText(), "2");
        telauncarga.setVisible(true);
        CarregaTudoUnidadeCarga(util.sDAD_CODIGO.toString(), jFldCodTransp.getText(), util.sCODDOC, util.sTIPO_DOC, util.sCOD_MUN);
    }//GEN-LAST:event_jBtEditarActionPerformed

    private void jBtExcluirUnidadesDeCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExcluirUnidadesDeCargaActionPerformed
        Integer option = JOptionPane.showConfirmDialog(null, "Deseja excluir a(s) unidade(s) de carga(s) selecionada(s)?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            for (int linha = 0; linha < jTableUndCargas.getRowCount(); linha++) {
                if(((boolean)jTableUndCargas.getValueAt(linha, 0)) == true){
                    DeletarUndCarga(jTableUndCargas.getValueAt(linha, 1).toString(), util.sDAD_CODIGO.toString(), util.sCOD_TRANSPORTE, util.sCODDOC, util.sTIPO_DOC, util.sCOD_MUN);
                    DeletarLacresUndCarga(util.sDAD_CODIGO.toString(), util.sCOD_TRANSPORTE, jTableUndCargas.getValueAt(linha, 1).toString(), util.sCODDOC, util.sTIPO_DOC, util.sCOD_MUN);
                }
            }
        }
        
        CarregaTudoUnidadeCarga(util.sDAD_CODIGO.toString(), util.sCOD_TRANSPORTE, util.sCODDOC, util.sTIPO_DOC, util.sCOD_MUN);
    }//GEN-LAST:event_jBtExcluirUnidadesDeCargaActionPerformed

    private void jCmbBxTipoRodoviarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbBxTipoRodoviarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbBxTipoRodoviarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUnidadeTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUnidadeTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUnidadeTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUnidadeTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUnidadeTransporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFecharUnidadeTransporte;
    private javax.swing.JButton jBtEditar;
    private javax.swing.JButton jBtExcluirLacres;
    private javax.swing.JButton jBtExcluirUnidadesDeCarga;
    private javax.swing.JButton jBtIncluirLacres;
    private javax.swing.JButton jBtIncluirUnidadesDeCarga;
    private javax.swing.JButton jBtOkUnidadeTransporte;
    private javax.swing.JComboBox<String> jCmbBxTipoRodoviario;
    private javax.swing.JTextField jFldCodDoc;
    private javax.swing.JTextField jFldCodTransp;
    private javax.swing.JTextField jFldIdentificacao;
    private javax.swing.JTextField jFldNrLacres;
    private javax.swing.JTextField jFldUndRateada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPnlLacres;
    private javax.swing.JPanel jPnlPrincipal;
    private javax.swing.JPanel jPnlUndCarga;
    private javax.swing.JPanel jPnlUndTransporte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableLacres;
    private javax.swing.JTable jTableUndCargas;
    // End of variables declaration//GEN-END:variables

    /**
     * Define as especificações do formulário.
     */
    public void DefinirFormulario() {
        //Define o tamanho do jframe
        setSize(900, 650);

        //Define o titulo
        setTitle("Unidades de Transporte");

        //Centraliza o jframe
        setLocationRelativeTo(null);

        //Seta o renderizador personalizado no cabecalho da tabela
        for (int col = 0; col < jTableLacres.getColumnCount(); col++) {
            jTableLacres.getColumnModel().getColumn(col).setHeaderRenderer(new MeuRenderizador());
        }

        //Define o tamanho minimo e maximo das seguintes colunas
        jTableLacres.getColumnModel().getColumn(0).setMaxWidth(30);
        jTableLacres.getColumnModel().getColumn(0).setMinWidth(30);

        //Define o modo de selecao da tabela para apenas uma linha
        jTableLacres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Seta o renderizador personalizado no cabecalho da tabela
        for (int col = 0; col < jTableUndCargas.getColumnCount(); col++) {
            jTableUndCargas.getColumnModel().getColumn(col).setHeaderRenderer(new MeuRenderizador());
        }

        jTableUndCargas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jTableUndCargas.getColumnModel().getColumn(0).setMaxWidth(30);
        jTableUndCargas.getColumnModel().getColumn(0).setMinWidth(30);

        //Dependedo do valor da tag_acao, a tela iniciará com métodos diferentes
        if (tag_acao == "1") {
            BuscaCodMax();
            jFldCodTransp.setText(util.sCOD_TRANSPORTE);
            jFldCodDoc.setText(util.sCODDOC);
            Inserir(util.sCOD_TRANSPORTE, util.sDAD_CODIGO.toString(), util.sCODDOC, util.sTIPO_DOC, util.sCOD_MUN);
        } else if (tag_acao == "2") {
            jFldCodTransp.setText(util.sCOD_TRANSPORTE);
            jFldCodDoc.setText(util.sCODDOC);
            CarregaCampoEdit(util.sDAD_CODIGO.toString(), jFldCodTransp.getText(), util.sCODDOC, util.sCOD_MUN);
            CarregaTudoNrLacres(jFldCodTransp.getText(), util.sDAD_CODIGO.toString(), util.sCODDOC, util.sTIPO_DOC, util.sCOD_MUN);
            CarregaTudoUnidadeCarga(util.sDAD_CODIGO.toString(), jFldCodTransp.getText(), util.sCODDOC,  util.sTIPO_DOC, util.sCOD_MUN);
        } else if (tag_acao == "3") {
            
        }

        jBtOkUnidadeTransporte.setMnemonic(KeyEvent.VK_O);
        jBFecharUnidadeTransporte.setMnemonic(KeyEvent.VK_F);

        setModal(true);

    }

    public void LimpaTabela(JTable jtable) {
        DefaultTableModel dtm = (DefaultTableModel) jtable.getModel();
        dtm.setRowCount(0);
    }

    public void CarregaTudoNrLacres(String codTransp, String dadCodigo, String CodDoc, String Tipo, String CodMun) {
        try {
            Conectar.ConectarBD();
            LimpaTabela(jTableLacres);
            Conectar.result = Conectar.stam.executeQuery("SELECT * FROM MDFE_LACRES_TRANSPORTE WHERE DAD_CODIGO = '" + dadCodigo + "' AND COD_TRANSP = '" + codTransp + "' AND CODDOC = '" + CodDoc+"' AND TP_DOC = '"+Tipo+"' AND COD_MUN = '"+ CodMun +"' " );
            DefaultTableModel dtm = (DefaultTableModel) jTableLacres.getModel();
            while (Conectar.result.next()) {
                dtm.addRow(new Object[]{
                    false,
                    Conectar.result.getString("NR_LACRE")
                });
            }
            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados na tabela...\n" + e.getLocalizedMessage());
        }
    }
    
    //    "", "Código", "Tipo de Carga", "Identificação", "Qtd. Rateada", "Qtd. de Lacres"
    

    public void CarregaTudoUnidadeCarga(String dadCodigo, String codTransp, String CodDoc, String Tipo, String CodMun) {
        try {
            Conectar.ConectarBD();
            DefaultTableModel dtm = (DefaultTableModel) jTableUndCargas.getModel();
            LimpaTabela(jTableUndCargas);
            Conectar.result = Conectar.stam.executeQuery("SELECT * FROM MDFE_UN_CARGA WHERE DAD_CODIGO = '" + dadCodigo + "' AND COD_TRANSP = '" + codTransp + "' "
                    + "AND CODDOC = '" + CodDoc+"' AND TP_DOC ='"+Tipo+"' AND COD_MUN = '"+ CodMun +"' ");
            while (Conectar.result.next()) {
                dtm.addRow(new Object[]{
                    false,
                    Conectar.result.getString("COD_CARGA"),
                    CampoCalcTpUnCarga(Conectar.result.getString("TP_UN_CARGA")),
                    Conectar.result.getString("ID_UN_CARGA"),
                    util.TrocaPontoPorVirgula(Conectar.result.getFloat("QTD_RAT_CARGA")),
                    Conectar.result.getString("QTD_LACRE")
                });
            }

            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados na tabela...\n" + e.getLocalizedMessage());
        }
    }

    public void CarregaCampoEdit(String dadCodigo, String codTransp, String DocCodigo, String CodMun) {
        try {
            Conectar.ConectarBD();

            Conectar.result = Conectar.stam.executeQuery("SELECT * FROM MDFE_UN_TRANSPORTE WHERE DAD_CODIGO = '" + dadCodigo + "' "
                    + "AND COD_TRANSP = '" + codTransp + "' AND CODDOC = '" + DocCodigo + "' AND COD_MUN = '"+ CodMun +"' "
            );

            while (Conectar.result.next()) {
                jFldCodTransp.setText(Conectar.result.getString("COD_TRANSP"));
                if (Conectar.result.getString("TP_UN_TRANS") != null) {
                    if (Conectar.result.getString("TP_UN_TRANS").equals("1")) {
                        jCmbBxTipoRodoviario.setSelectedIndex(0);
                    } else if (Conectar.result.getString("TP_UN_TRANS").equals("2")) {
                        jCmbBxTipoRodoviario.setSelectedIndex(1);
                    } else if (Conectar.result.getString("TP_UN_TRANS").equals("3")) {
                        jCmbBxTipoRodoviario.setSelectedIndex(2);
                    } else if (Conectar.result.getString("TP_UN_TRANS").equals("4")) {
                        jCmbBxTipoRodoviario.setSelectedIndex(3);
                    } else if (Conectar.result.getString("TP_UN_TRANS").equals("5")) {
                        jCmbBxTipoRodoviario.setSelectedIndex(4);
                    } else if (Conectar.result.getString("TP_UN_TRANS").equals("6")) {
                        jCmbBxTipoRodoviario.setSelectedIndex(5);
                    } else if (Conectar.result.getString("TP_UN_TRANS").equals("7")) {
                        jCmbBxTipoRodoviario.setSelectedIndex(6);
                    }
                }
                jFldIdentificacao.setText(Conectar.result.getString("ID_UN_TRANS"));
                jFldUndRateada.setText(util.TrocaPontoPorVirgula(Conectar.result.getFloat("QTD_RAT_TRANS")));
            }
            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados...\n" + e.getLocalizedMessage());
        }
    }

    public void Inserir(String codTransp, String dadCodigo, String DocCodigo, String TpDoc, String CodMun){
        try {
            Conectar.ConectarBD();

            System.out.println("INSERT INTO MDFE_UN_TRANSPORTE "
                    + "(COD_TRANSP, DAD_CODIGO, CODDOC, TP_DOC, COD_MUN)"
                    + "values('" + codTransp + "', '" + dadCodigo + "', '" + DocCodigo + "', '"+ TpDoc +"', '"+ CodMun +"')"
            );

            Conectar.stam.executeUpdate("INSERT INTO MDFE_UN_TRANSPORTE "
                    + "(COD_TRANSP, DAD_CODIGO, CODDOC, TP_DOC, COD_MUN)"
                    + "values('" + codTransp + "', '" + dadCodigo + "', '" + DocCodigo + "', '"+ TpDoc +"', '"+ CodMun +"')"
            );

            Conectar.DesconectarBD();

            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir...\n" + e.getLocalizedMessage());
        }
    }

    public void InserirLacres(String CodDoc, String codTransp, String dadCodigo, String nrLacres, String Tipo, String CodMun) {
        try {
            Conectar.ConectarBD();

            System.out.println("INSERT INTO MDFE_LACRES_TRANSPORTE "
                    + "(CODDOC, COD_TRANSP, DAD_CODIGO, NR_LACRE, TP_DOC, COD_MUN)"
                    + "values('" + CodDoc + "','" + codTransp + "', '" + dadCodigo + "', '" + nrLacres + "', '" + Tipo + "', '"+ CodMun +"')"
            );

            Conectar.stam.executeUpdate("INSERT INTO MDFE_LACRES_TRANSPORTE "
                    + "(CODDOC, COD_TRANSP, DAD_CODIGO, NR_LACRE, TP_DOC, COD_MUN)"
                    + "values('" + CodDoc + "','" + codTransp + "', '" + dadCodigo + "', '" + nrLacres + "', '" + Tipo + "', '"+ CodMun +"')"
            );

            Conectar.DesconectarBD();

            jFldNrLacres.setText("");

            CarregaTudoNrLacres(codTransp, dadCodigo, CodDoc, Tipo, CodMun);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir...\n" + e.getLocalizedMessage());
        }
    }
    
    
     public Integer QtdUnidadeCarga(){
       Integer qtd =0;
        try {  
            Conectar.ConectarBD();
            System.out.println("SELECT count(*) "
                               + "FROM MDFE_UN_CARGA "
                               + "WHERE CODDOC = '"+util.sCODDOC+"' AND COD_TRANSP = '"+util.sCOD_TRANSPORTE+"' AND DAD_CODIGO = '"+util.sDAD_CODIGO+"' "
                                       + "AND TP_DOC ='"+util.sTIPO_DOC+"' AND COD_MUN = '"+ util.sCOD_MUN +"' ");
            
            Conectar.result = Conectar.stam.executeQuery("SELECT count(*) "
                               + "FROM MDFE_UN_CARGA "
                               + "WHERE CODDOC = '"+util.sCODDOC+"' AND COD_TRANSP = '"+util.sCOD_TRANSPORTE+"' AND DAD_CODIGO = '"+util.sDAD_CODIGO+"' "
                                       + "AND TP_DOC ='"+util.sTIPO_DOC+"' AND COD_MUN = '"+ util.sCOD_MUN +"' ");
               
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

     public Integer QtdLacreTransporte(){
        Integer qtd =0;
        try {  
            Conectar.ConectarBD();
            System.out.println("");
            Conectar.result = Conectar.stam.executeQuery("SELECT count(*) "
                                      + "FROM MDFE_LACRES_TRANSPORTE "
                                      + "WHERE CODDOC = '"+util.sCODDOC+"' AND COD_TRANSP = '"+util.sCOD_TRANSPORTE+"' "
                                              + "AND DAD_CODIGO = '"+util.sDAD_CODIGO+"' AND TP_DOC ='"+util.sTIPO_DOC+"' "
                                                      + "AND COD_MUN = '"+ util.sCOD_MUN +"' ");
                                                        
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
    
    public void Alterar(String codTransp, String dadCodigo, String tpUnTrans, String idUnTrans, Double qtdRatTrans, String tpDoc,
            Integer qtdCarga, Integer qtdLacre, String chave, String DocCod, String CodMun) {
        try {
            Conectar.ConectarBD();

            System.out.println("UPDATE MDFE_UN_TRANSPORTE SET "
                    + "TP_UN_TRANS   = '" + tpUnTrans + "', "
                    + "ID_UN_TRANS   = '" + idUnTrans + "', "
                    + "QTD_RAT_TRANS = '" + qtdRatTrans + "', "
                    + "QTD_CARGA     = '" + qtdCarga + "', "
                    + "QTD_LACRE     = '" + qtdLacre + "', "
                    + "CHAVE         = '" + chave + "' "
                    + "WHERE COD_TRANSP = '" + codTransp + "' AND DAD_CODIGO   = '" + dadCodigo + "' AND CODDOC = '"+ DocCod + "'"
                            + " AND TP_DOC = '"+ tpDoc +"' AND COD_MUN = '"+ CodMun+"'  "
            );

            Conectar.stam.executeUpdate("UPDATE MDFE_UN_TRANSPORTE SET "
                    + "TP_UN_TRANS   = '" + tpUnTrans + "', "
                    + "ID_UN_TRANS   = '" + idUnTrans + "', "
                    + "QTD_RAT_TRANS = '" + qtdRatTrans + "', "
                    + "QTD_CARGA     = '" + qtdCarga + "', "
                    + "QTD_LACRE     = '" + qtdLacre + "', "
                    + "CHAVE         = '" + chave + "' "
                    + "WHERE COD_TRANSP = '" + codTransp + "' AND DAD_CODIGO   = '" + dadCodigo + "' AND CODDOC = '"+ DocCod + "'"
                            + " AND TP_DOC = '"+ tpDoc +"' AND COD_MUN = '"+ CodMun+"'  "
            );

            Conectar.DesconectarBD();

            dispose();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao alterar...\n" + e.getLocalizedMessage());
        }
    }

    public void DeletarLacres(String dadCodigo, String dadTransp, String CodDoc, String Tipo, String CodMun) {
        try {
            for (int linha = 0; linha < jTableLacres.getRowCount(); linha++) {
                if (((boolean) jTableLacres.getValueAt(linha, 0) == true)) {
                    Conectar.ConectarBD();

                    System.out.println("DELETE FROM MDFE_LACRES_TRANSPORTE "
                            + "WHERE NR_LACRE = '" + jTableLacres.getValueAt(linha, 1) + "' "
                            + "AND DAD_CODIGO = '" + dadCodigo + "' AND COD_TRANSP = '" + dadTransp + "' AND CODDOC = '"+CodDoc +"' "
                                    + "AND TP_DOC = '"+Tipo+"' AND COD_MUN = '"+ CodMun +"' "
                    );

                    Conectar.stam.executeUpdate("DELETE FROM MDFE_LACRES_TRANSPORTE "
                            + "WHERE NR_LACRE = '" + jTableLacres.getValueAt(linha, 1) + "' "
                            + "AND DAD_CODIGO = '" + dadCodigo + "' AND COD_TRANSP = '" + dadTransp + "' AND CODDOC = '"+CodDoc +"' "
                                    + "AND TP_DOC = '"+Tipo+"' AND COD_MUN = '"+ CodMun +"' "
                    );

                    Conectar.DesconectarBD();
                }
            }

            CarregaTudoNrLacres(dadTransp, dadCodigo, CodDoc, Tipo, CodMun);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao deletar...\n" + e.getLocalizedMessage());
        }
    }
    
    public void DeletarUndCarga(String CodCarga, String DadCodigo, String CodTransp, String CodDoc, String TpDoc, String CodMun){
        try{
            Conectar.ConectarBD();
            
            System.out.println("DELETE FROM MDFE_UN_CARGA WHERE "
                            + "COD_CARGA   = '"+ CodCarga +"'  AND "
                            + "DAD_CODIGO  = '"+ DadCodigo +"' AND "
                            + "COD_TRANSP  = '"+ CodTransp +"' AND "
                            + "CODDOC      = '"+ CodDoc +"' AND "
                            + "TP_DOC      = '"+ TpDoc +"' AND "
                            + "COD_MUN     = '"+ CodMun +"' "
            );
            
            Conectar.stam.executeUpdate("DELETE FROM MDFE_UN_CARGA WHERE "
                            + "COD_CARGA   = '"+ CodCarga +"'  AND "
                            + "DAD_CODIGO  = '"+ DadCodigo +"' AND "
                            + "COD_TRANSP  = '"+ CodTransp +"' AND "
                            + "CODDOC      = '"+ CodDoc +"' AND "
                            + "TP_DOC      = '"+ TpDoc +"' AND "
                            + "COD_MUN     = '"+ CodMun +"' "
                    
            );
            
            Conectar.DesconectarBD();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao deletar...\n" + e.getLocalizedMessage());
        }
    }

    public void DeletarLacresUndCarga(String dadCodigo, String dadTransp,  String CodCarga, String CodDoc, String TipoDoc, String CodMun){
        try{
            Conectar.ConectarBD();

            System.out.println("DELETE FROM MDFE_LACRES_CARGA WHERE"
                    + " DAD_CODIGO = '" + dadCodigo + "' AND COD_TRANSP = '" + dadTransp + "' AND COD_CARGA = '" + CodCarga + "' AND CODDOC ='" + CodDoc + "' "
                    + "AND TP_DOC = '" + TipoDoc + "' AND COD_MUN = '" + CodMun + "' "
            );

            Conectar.stam.executeUpdate("DELETE FROM MDFE_LACRES_CARGA WHERE"
                    + " DAD_CODIGO = '" + dadCodigo + "' AND COD_TRANSP = '" + dadTransp + "' AND COD_CARGA = '" + CodCarga + "' AND CODDOC ='" + CodDoc + "' "
                    + "AND TP_DOC = '" + TipoDoc + "' AND COD_MUN = '" + CodMun + "' "
            );

            Conectar.DesconectarBD();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao deletar...\n" + e.getLocalizedMessage());
        }
    }
   

    public String BuscaTpUndTransporte() {
        String codigo = "";
        if (jCmbBxTipoRodoviario.getSelectedIndex() == 0) {
            codigo = "1";
        } else if (jCmbBxTipoRodoviario.getSelectedIndex() == 1) {
            codigo = "2";
        } else if (jCmbBxTipoRodoviario.getSelectedIndex() == 2) {
            codigo = "3";
        } else if (jCmbBxTipoRodoviario.getSelectedIndex() == 3) {
            codigo = "4";
        } else if (jCmbBxTipoRodoviario.getSelectedIndex() == 4) {
            codigo = "5";
        } else if (jCmbBxTipoRodoviario.getSelectedIndex() == 5) {
            codigo = "6";
        } else if (jCmbBxTipoRodoviario.getSelectedIndex() == 6) {
            codigo = "7";
        }

        return codigo;
    }

   
    public String CampoCalcTpUnCarga(String codigo) {
        String tipo = ""; 
        if(codigo != null){
            
            if (codigo.equals("1")) {
                tipo = "Container";
            } else if (codigo.equals("2")) {
                tipo = "ULD";
            } else if (codigo.equals("3")) {
                tipo = "Pallet";
            } else if (codigo.equals("4")) {
                tipo = "Outros";
            }
            
        }else{
        
        }
        return tipo;
    }

    public boolean VerificaNrLacre() {
        for (int linha = 0; linha < jTableLacres.getRowCount(); linha++) {
            if (jFldNrLacres.getText().equals(jTableLacres.getValueAt(linha, 1).toString())) {
                JOptionPane.showMessageDialog(null, "Número do Lacre já inserido!");
                return false;
            }
        }

        if (jFldNrLacres.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Insira o número do lacre!");
            return false;
        } else {
            return true;
        }
    }

    public boolean VerificaField() {
        if (jCmbBxTipoRodoviario.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o tipo de unidade de transporte!");
            jCmbBxTipoRodoviario.requestFocus();
            return false;
        } else if (jFldIdentificacao.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Campo 'Identificação' não preechido!");
            jFldIdentificacao.requestFocus();
            return false;
        } else if (jFldUndRateada.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Campo 'Unidade Rateada' não preechido!");
            jFldUndRateada.requestFocus();
            return false;
        } else {
            return true;
        }
    }
    
    
     public void BuscaCodMax() {
        try {  
            Conectar.ConectarBD();
 
            System.out.println("SELECT MAX(COD_TRANSP) + 1 FROM MDFE_UN_TRANSPORTE  WHERE DAD_CODIGO = '" + util.sDAD_CODIGO +  "' AND CODDOC = '" + util.sCODDOC + "' "
                    + "AND TP_DOC = '"+ util.sTIPO_DOC +"' AND COD_MUN = '"+ util.sCOD_MUN +"' ");
            Conectar.result = Conectar.stam.executeQuery("SELECT MAX(COD_TRANSP) + 1 FROM MDFE_UN_TRANSPORTE  WHERE DAD_CODIGO = '" + util.sDAD_CODIGO +  "' AND CODDOC = '" + util.sCODDOC + "' "
                    + " AND TP_DOC = '"+ util.sTIPO_DOC +"' AND COD_MUN = '"+ util.sCOD_MUN +"' ");
            while (Conectar.result.next()) {
                if (Conectar.result.getString(1) != null) {
                    util.sCOD_TRANSPORTE = Conectar.result.getString(1);
                } else {
                    util.sCOD_TRANSPORTE = "1";
                }

            }

            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao gerar código...\n" + e.getLocalizedMessage());
        }
    }


    /**
     * Classe que implementa o método abstrato TableCellRenderer para poder
     * fazer a troca de cor de fundo e fonte do cabeçalho da tabela.
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

}
