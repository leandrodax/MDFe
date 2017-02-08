
package cadastro;

import ClassesFirebird.Tabusu;
import ConexaoDB.Conectar;
import Utilitarios.LimitaField;
import Utilitarios.Utilitarios;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class TelaContratante extends javax.swing.JInternalFrame {

    public Integer codmax, selecionada;
    String sql, ordnar, situacao, tag_acao;
    DefaultTableCellRenderer direita  = new DefaultTableCellRenderer();
    DefaultTableCellRenderer centro   = new DefaultTableCellRenderer();
    DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
    Utilitarios util                  = new Utilitarios();
    Tabusu tabusu                     = new Tabusu();
    
    public TelaContratante() {
        initComponents();
        DefinirFormulario();
        CarregaTudo();
        SairEsc();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPnlPrincipal = new javax.swing.JPanel();
        jPnlBusca = new javax.swing.JPanel();
        jLblBusca = new javax.swing.JLabel();
        jFldBusca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCmbBxBusca = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jCmbBxOrdem = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrincipal = new javax.swing.JTable();
        jPnlBotao = new javax.swing.JPanel();
        jBtPrimeiro = new javax.swing.JButton();
        jBtAnterior = new javax.swing.JButton();
        jBtProximo = new javax.swing.JButton();
        jBtUltimo = new javax.swing.JButton();
        jBtInserir = new javax.swing.JButton();
        jBtAlterar = new javax.swing.JButton();
        jBtExcluir = new javax.swing.JButton();
        jPnlEdit = new javax.swing.JPanel();
        jPnlNorte = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jFldCodContratante = new javax.swing.JTextField();
        jFldNomeContratante = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioCPF = new javax.swing.JRadioButton();
        jRadioCNPJ = new javax.swing.JRadioButton();
        jFldCNPJ = new javax.swing.JTextField();
        jFldCPF = new javax.swing.JTextField();
        jPnlEditBotoes = new javax.swing.JPanel();
        jBtCancelar = new javax.swing.JButton();
        jBtGravar = new javax.swing.JButton();
        jLblAcao = new javax.swing.JLabel();

        jPnlPrincipal.setLayout(new java.awt.CardLayout());

        jLblBusca.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLblBusca.setText("Código:");

        jFldBusca.setDocument(new LimitaField(100, 0)
        );
        jFldBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFldBuscaActionPerformed(evt);
            }
        });
        jFldBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldBuscaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFldBuscaKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Buscar por:");

        jCmbBxBusca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCmbBxBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "CNPJ", "CPF" }));
        jCmbBxBusca.setToolTipText("");
        jCmbBxBusca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCmbBxBuscaItemStateChanged(evt);
            }
        });
        jCmbBxBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbBxBuscaActionPerformed(evt);
            }
        });
        jCmbBxBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCmbBxBuscaKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Ordem:");

        jCmbBxOrdem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCmbBxOrdem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome" }));
        jCmbBxOrdem.setToolTipText("");
        jCmbBxOrdem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCmbBxOrdemItemStateChanged(evt);
            }
        });
        jCmbBxOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbBxOrdemActionPerformed(evt);
            }
        });
        jCmbBxOrdem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCmbBxOrdemKeyPressed(evt);
            }
        });

        jTablePrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Código", "Nome da Contratante", "CPF", "CNPJ", "Cód. Usuário", "Usuário", "Data", "Evento"
            }
        ){
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            };

        });
        jTablePrincipal.getTableHeader().setResizingAllowed(false);
        jTablePrincipal.getTableHeader().setReorderingAllowed(false);
        jTablePrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePrincipalMouseClicked(evt);
            }
        });
        jTablePrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTablePrincipalKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePrincipal);

        jPnlBotao.setLayout(new java.awt.GridLayout(1, 0));

        jBtPrimeiro.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Primeiro.png"))); // NOI18N
        jBtPrimeiro.setText("Primeiro");
        jBtPrimeiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtPrimeiro.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBtPrimeiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPrimeiroActionPerformed(evt);
            }
        });
        jPnlBotao.add(jBtPrimeiro);

        jBtAnterior.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Anterior.png"))); // NOI18N
        jBtAnterior.setText("Anterior");
        jBtAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtAnterior.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBtAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAnteriorActionPerformed(evt);
            }
        });
        jPnlBotao.add(jBtAnterior);

        jBtProximo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Proximo.png"))); // NOI18N
        jBtProximo.setText("Próximo");
        jBtProximo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtProximo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBtProximo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtProximoActionPerformed(evt);
            }
        });
        jPnlBotao.add(jBtProximo);

        jBtUltimo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ultimo.png"))); // NOI18N
        jBtUltimo.setText("Último");
        jBtUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtUltimo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBtUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtUltimoActionPerformed(evt);
            }
        });
        jPnlBotao.add(jBtUltimo);

        jBtInserir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/file_add.png"))); // NOI18N
        jBtInserir.setText("Inserir");
        jBtInserir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtInserir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBtInserir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtInserirActionPerformed(evt);
            }
        });
        jBtInserir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtInserirKeyPressed(evt);
            }
        });
        jPnlBotao.add(jBtInserir);

        jBtAlterar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/text_edit.png"))); // NOI18N
        jBtAlterar.setText("Alterar");
        jBtAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtAlterar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBtAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAlterarActionPerformed(evt);
            }
        });
        jPnlBotao.add(jBtAlterar);

        jBtExcluir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/deletar.png"))); // NOI18N
        jBtExcluir.setText("Excluir");
        jBtExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtExcluir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBtExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtExcluirActionPerformed(evt);
            }
        });
        jPnlBotao.add(jBtExcluir);

        javax.swing.GroupLayout jPnlBuscaLayout = new javax.swing.GroupLayout(jPnlBusca);
        jPnlBusca.setLayout(jPnlBuscaLayout);
        jPnlBuscaLayout.setHorizontalGroup(
            jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBuscaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlBuscaLayout.createSequentialGroup()
                        .addGroup(jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCmbBxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCmbBxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1)
                    .addComponent(jPnlBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        jPnlBuscaLayout.setVerticalGroup(
            jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBuscaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnlBuscaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCmbBxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCmbBxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jPnlBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPnlPrincipal.add(jPnlBusca, "card2");

        jPnlEdit.setLayout(new java.awt.BorderLayout());

        jPnlNorte.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Código");
        jPnlNorte.add(jLabel4);
        jLabel4.setBounds(10, 0, 34, 30);

        jFldCodContratante.setEditable(false);
        jFldCodContratante.setBackground(new java.awt.Color(255, 255, 204));
        jFldCodContratante.setFocusable(false);
        jFldCodContratante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFldCodContratanteFocusLost(evt);
            }
        });
        jFldCodContratante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFldCodContratanteActionPerformed(evt);
            }
        });
        jFldCodContratante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldCodContratanteKeyPressed(evt);
            }
        });
        jPnlNorte.add(jFldCodContratante);
        jFldCodContratante.setBounds(10, 20, 90, 25);

        jFldNomeContratante.setDocument(new LimitaField(60, 0));
        jFldNomeContratante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFldNomeContratanteActionPerformed(evt);
            }
        });
        jFldNomeContratante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldNomeContratanteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFldNomeContratanteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFldNomeContratanteKeyTyped(evt);
            }
        });
        jPnlNorte.add(jFldNomeContratante);
        jFldNomeContratante.setBounds(10, 70, 560, 25);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setText("Contratante");
        jLabel18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel18KeyPressed(evt);
            }
        });
        jPnlNorte.add(jLabel18);
        jLabel18.setBounds(10, 55, 160, 13);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Identificação do Contratante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        jPanel1.setLayout(null);

        buttonGroup1.add(jRadioCPF);
        jRadioCPF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jRadioCPF.setSelected(true);
        jRadioCPF.setText("CPF");
        jRadioCPF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioCPFItemStateChanged(evt);
            }
        });
        jRadioCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCPFActionPerformed(evt);
            }
        });
        jRadioCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioCPFKeyPressed(evt);
            }
        });
        jPanel1.add(jRadioCPF);
        jRadioCPF.setBounds(10, 15, 50, 22);

        buttonGroup1.add(jRadioCNPJ);
        jRadioCNPJ.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jRadioCNPJ.setText("CNPJ");
        jRadioCNPJ.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioCNPJItemStateChanged(evt);
            }
        });
        jRadioCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCNPJActionPerformed(evt);
            }
        });
        jRadioCNPJ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioCNPJKeyPressed(evt);
            }
        });
        jPanel1.add(jRadioCNPJ);
        jRadioCNPJ.setBounds(80, 15, 60, 22);

        jFldCNPJ.setDocument(new LimitaField(18, 0)
        );
        jFldCNPJ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFldCNPJFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFldCNPJFocusLost(evt);
            }
        });
        jFldCNPJ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldCNPJKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFldCNPJKeyTyped(evt);
            }
        });
        jPanel1.add(jFldCNPJ);
        jFldCNPJ.setBounds(360, 15, 190, 25);

        jFldCPF.setDocument(new LimitaField(18, 0)
        );
        jFldCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFldCPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFldCPFFocusLost(evt);
            }
        });
        jFldCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldCPFKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFldCPFKeyTyped(evt);
            }
        });
        jPanel1.add(jFldCPF);
        jFldCPF.setBounds(160, 15, 190, 25);

        jPnlNorte.add(jPanel1);
        jPanel1.setBounds(10, 110, 560, 50);

        jPnlEdit.add(jPnlNorte, java.awt.BorderLayout.CENTER);

        jPnlEditBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPnlEditBotoes.setPreferredSize(new java.awt.Dimension(0, 60));

        jBtCancelar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtCancelar.setText("Cancelar");
        jBtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCancelarActionPerformed(evt);
            }
        });
        jBtCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtCancelarKeyPressed(evt);
            }
        });

        jBtGravar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ok-icon.png"))); // NOI18N
        jBtGravar.setText("Gravar");
        jBtGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtGravarActionPerformed(evt);
            }
        });
        jBtGravar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtGravarKeyPressed(evt);
            }
        });

        jLblAcao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblAcao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblAcao.setText("jLabel6");
        jLblAcao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPnlEditBotoesLayout = new javax.swing.GroupLayout(jPnlEditBotoes);
        jPnlEditBotoes.setLayout(jPnlEditBotoesLayout);
        jPnlEditBotoesLayout.setHorizontalGroup(
            jPnlEditBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlEditBotoesLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jBtGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(jLblAcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(130, 130, 130)
                .addComponent(jBtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jPnlEditBotoesLayout.setVerticalGroup(
            jPnlEditBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlEditBotoesLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPnlEditBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnlEditBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLblAcao)
                        .addComponent(jBtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        jPnlEdit.add(jPnlEditBotoes, java.awt.BorderLayout.SOUTH);

        jPnlPrincipal.add(jPnlEdit, "card3");

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

    private void jFldBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldBuscaActionPerformed

    private void jFldBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldBuscaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jCmbBxBusca.requestFocus();
        }
    }//GEN-LAST:event_jFldBuscaKeyPressed

    private void jFldBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldBuscaKeyReleased

        BuscaParametro(jFldBusca.getText().toUpperCase());
    }//GEN-LAST:event_jFldBuscaKeyReleased

    private void jCmbBxBuscaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCmbBxBuscaItemStateChanged
        jLblBusca.setText(jCmbBxBusca.getSelectedItem().toString());
        BuscaParametro(jFldBusca.getText());
    }//GEN-LAST:event_jCmbBxBuscaItemStateChanged

    private void jCmbBxBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbBxBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbBxBuscaActionPerformed

    private void jCmbBxBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCmbBxBuscaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jCmbBxOrdem.requestFocus();
        }
    }//GEN-LAST:event_jCmbBxBuscaKeyPressed

    private void jCmbBxOrdemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCmbBxOrdemItemStateChanged
        BuscaParametro(jFldBusca.getText());
    }//GEN-LAST:event_jCmbBxOrdemItemStateChanged

    private void jCmbBxOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbBxOrdemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbBxOrdemActionPerformed

    private void jCmbBxOrdemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCmbBxOrdemKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (jTablePrincipal.getRowCount() > 0) {
                jTablePrincipal.requestFocus();
                jTablePrincipal.addRowSelectionInterval(0, 0);
            } else {
                jBtInserir.requestFocus();
            }
        }
    }//GEN-LAST:event_jCmbBxOrdemKeyPressed

    private void jTablePrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePrincipalMouseClicked
        selecionada = jTablePrincipal.getSelectedRow();
        if (evt.getClickCount() == 2) {
            if (selecionada == -1) {
                return;
            }
            jBtAlterar.doClick();

        }
    }//GEN-LAST:event_jTablePrincipalMouseClicked

    private void jTablePrincipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTablePrincipalKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            selecionada = jTablePrincipal.getSelectedRow();
            jBtAlterar.doClick();
        }
    }//GEN-LAST:event_jTablePrincipalKeyPressed

    private void jBtPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPrimeiroActionPerformed
        //Se o numero de linhas da tabela for 0
        if (jTablePrincipal.getRowCount() > 0) {
            //Foca a barra de rolagem
            jScrollPane1.requestFocus();
            //Foca na tabela
            jTablePrincipal.requestFocus();
            //Seta a value da barra de rolagem para 1
            jScrollPane1.getVerticalScrollBar().setValue(1);
            //seleciona a primeira linha
            jTablePrincipal.addRowSelectionInterval(0, 0);
            //habilita e desablita dos respectivos botões
            jBtPrimeiro.setEnabled(false);
            jBtAnterior.setEnabled(false);
            jBtProximo.setEnabled(true);
            jBtUltimo.setEnabled(true);
        }
    }//GEN-LAST:event_jBtPrimeiroActionPerformed

    private void jBtAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAnteriorActionPerformed
        selecionada = jTablePrincipal.getSelectedRow();
        //Verifica se a tabela possui mais de 0 linhas
        if (jTablePrincipal.getRowCount() > 0) {
            //se a selecionada for diferente de -1  e 0
            if (selecionada != -1 && selecionada != 0) {
                //Foca a barra de rolagem
                jScrollPane1.requestFocus();
                //Seleciona a linha anterior
                jTablePrincipal.setRowSelectionInterval(selecionada - 1, selecionada - 1);
                //Seta a value da barra de rolagem para acompanhar a linha selecionada
                jScrollPane1.getVerticalScrollBar().setValue(jTablePrincipal.getRowHeight() * jTablePrincipal.getSelectedRow());
                jBtPrimeiro.setEnabled(true);
                jBtAnterior.setEnabled(true);
                jBtProximo.setEnabled(true);
                jBtUltimo.setEnabled(true);

                //Se a linha selecionada for igual a zero
            } else if (selecionada == 0) {
                //seta as linhas e a os botoes
                jTablePrincipal.setRowSelectionInterval(0, 0);
                jBtPrimeiro.setEnabled(false);
                jBtAnterior.setEnabled(false);
                jBtProximo.setEnabled(true);
                jBtUltimo.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jBtAnteriorActionPerformed

    private void jBtProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtProximoActionPerformed
        selecionada = jTablePrincipal.getSelectedRow();
        //Se o numeros de linhas da tabela for maior que zero
        if (jTablePrincipal.getRowCount() > 0) {
            //Se a linha selecionada for diferente de -1 e do total de linhas - 1
            if (selecionada != -1 && selecionada != jTablePrincipal.getRowCount() - 1) {
                //Foca na barra de rolagem da tabela
                jScrollPane1.requestFocus();
                //Selecionada a proxima linha
                jTablePrincipal.setRowSelectionInterval(selecionada + 1, selecionada + 1);
                //Seta a value da barra de rolagem para que acompanhe a linha selecionada
                jScrollPane1.getVerticalScrollBar().setValue(jTablePrincipal.getRowHeight() * jTablePrincipal.getSelectedRow());
                jBtPrimeiro.setEnabled(true);
                jBtAnterior.setEnabled(true);
                jBtProximo.setEnabled(true);
                jBtUltimo.setEnabled(true);
                //Se a linha selecionada tiver o mesmo valor do total de linhas da tabela -1
            } else if (selecionada == jTablePrincipal.getRowCount() - 1) {
                //selecionada a ultima linha
                jTablePrincipal.setRowSelectionInterval(jTablePrincipal.getRowCount() - 1, jTablePrincipal.getRowCount() - 1);
                jBtPrimeiro.setEnabled(true);
                jBtAnterior.setEnabled(true);
                jBtProximo.setEnabled(false);
                jBtUltimo.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jBtProximoActionPerformed

    private void jBtUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtUltimoActionPerformed
        selecionada = jTablePrincipal.getSelectedRow();
        //Se o total de linhas da tabela for maior que 0
        if (jTablePrincipal.getRowCount() > 0) {
            //Seleciona a ultima linha
            jTablePrincipal.setRowSelectionInterval(jTablePrincipal.getRowCount() - 1, jTablePrincipal.getRowCount() - 1);
            //Seta a value da barra de rolagem para acompanhar a linha selecionada
            jScrollPane1.getVerticalScrollBar().setValue(jScrollPane1.getVerticalScrollBar().getMaximum());
            jBtPrimeiro.setEnabled(true);
            jBtAnterior.setEnabled(true);
            jBtProximo.setEnabled(false);
            jBtUltimo.setEnabled(false);
        }
    }//GEN-LAST:event_jBtUltimoActionPerformed

    private void jBtInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtInserirActionPerformed
        //        if(util.VerificarPermissao("01.01.01", tabusu.getCodigo()) == true){
            tag_acao = "1";
            jLblAcao.setText("Inserir");
            LimpaField();
            BuscaCodMax();
            jPnlBusca.setVisible(false);
            jPnlEdit.setVisible(true);
            jFldNomeContratante.requestFocus();
            //      }else{
            //        JOptionPane.showMessageDialog(null, "Usuário não habilitado para este tipo de operação!");
            //  }
    }//GEN-LAST:event_jBtInserirActionPerformed

    private void jBtInserirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtInserirKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jBtInserir.doClick();
        }
    }//GEN-LAST:event_jBtInserirKeyPressed

    private void jBtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAlterarActionPerformed
        //    if(util.VerificarPermissao("01.01.02", tabusu.getCodigo()) == true){
            if (selecionada != -1 && jTablePrincipal.getRowCount() > 0) {
                jLblAcao.setText("Alterar");
                LimpaField();
                jPnlBusca.setVisible(false);
                jPnlEdit.setVisible(true);
                tag_acao = "2";
                CarregaCampoEdit(jTablePrincipal.getValueAt(selecionada, 0).toString());
                jFldNomeContratante.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma agência de navegação selecionada");
            }
            //  }else{
            //    JOptionPane.showMessageDialog(null, "Usuário não habilitado para este tipo de operação!");
            //}
    }//GEN-LAST:event_jBtAlterarActionPerformed

    private void jBtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExcluirActionPerformed
        //if (util.VerificarPermissao("01.01.03", tabusu.getCodigo()) == true) {
            if (selecionada != -1 && jTablePrincipal.getRowCount() > 0) {
                jLblAcao.setText("Excluir");
                LimpaField();
                jPnlBusca.setVisible(false);
                jPnlEdit.setVisible(true);
                tag_acao = "3";
                jFldNomeContratante.requestFocus();
                CarregaCampoEdit(jTablePrincipal.getValueAt(selecionada, 0).toString());
                int option = JOptionPane.showConfirmDialog(null, "Confirma Exclusão do Registro", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    jBtGravar.doClick();
                } else if (option == JOptionPane.NO_OPTION) {
                    jBtCancelar.doClick();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma agência de navegação selecionada");
            }
            // } else {
            //   JOptionPane.showMessageDialog(null, "Usuário não habilitado para este tipo de operação!");
            //}
    }//GEN-LAST:event_jBtExcluirActionPerformed

    private void jFldCodContratanteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldCodContratanteFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldCodContratanteFocusLost

    private void jFldCodContratanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldCodContratanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldCodContratanteActionPerformed

    private void jFldCodContratanteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldCodContratanteKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jFldNomeContratante.requestFocus();
        }
    }//GEN-LAST:event_jFldCodContratanteKeyPressed

    private void jFldCNPJFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldCNPJFocusGained
        jFldCNPJ.setText(util.ExtraiNumeros(jFldCNPJ.getText()));
    }//GEN-LAST:event_jFldCNPJFocusGained

    private void jFldCNPJFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldCNPJFocusLost
        
        if (jFldCNPJ.getText().length() > 0) {
            
            
            if(jRadioCNPJ.isSelected() == true){
                
                if (util.VerificaCNPJ(jFldCNPJ.getText()) == true) {
                    
                    jFldCNPJ.setText(util.FormataCnpj(jFldCNPJ.getText()));
                    
                } else {
                    
                    JOptionPane.showMessageDialog(null, "CNPJ Inválido");
                    jFldCNPJ.requestFocus();
                    
                }
            }
            
        }
    }//GEN-LAST:event_jFldCNPJFocusLost

    private void jFldCNPJKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldCNPJKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jBtGravar.requestFocus();
        }
    }//GEN-LAST:event_jFldCNPJKeyPressed

    private void jFldCNPJKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldCNPJKeyTyped
        String Caracteres = "0123456789";
        if (!Caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jFldCNPJKeyTyped

    private void jFldNomeContratanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldNomeContratanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldNomeContratanteActionPerformed

    private void jFldNomeContratanteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldNomeContratanteKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if(jRadioCPF.isSelected() == true){
                jRadioCPF.requestFocus();
            }else if(jRadioCNPJ.isSelected() == true){
                jRadioCNPJ.requestFocus();
            }
        }
    }//GEN-LAST:event_jFldNomeContratanteKeyPressed

    private void jFldNomeContratanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldNomeContratanteKeyReleased

    }//GEN-LAST:event_jFldNomeContratanteKeyReleased

    private void jFldNomeContratanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldNomeContratanteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldNomeContratanteKeyTyped

    private void jLabel18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel18KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18KeyPressed

    private void jBtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelarActionPerformed
        jPnlEdit.setVisible(false);
        jPnlBusca.setVisible(true);
        jFldBusca.requestFocus();
    }//GEN-LAST:event_jBtCancelarActionPerformed

    private void jBtCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtCancelarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jPnlBusca.setVisible(true);
            jPnlEdit.setVisible(false);

        }

        if (evt.getKeyCode() == evt.VK_LEFT) {
            jBtGravar.requestFocus();
        }

        if (evt.getKeyCode() == evt.VK_RIGHT) {
            jFldNomeContratante.requestFocus();
        }
    }//GEN-LAST:event_jBtCancelarKeyPressed

    private void jBtGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGravarActionPerformed
        if (tag_acao == "1" && VerificaField() == true) {
            Inserir(jFldCodContratante.getText(), jFldNomeContratante.getText(), util.ExtraiNumeros(jFldCPF.getText()), util.ExtraiNumeros(jFldCNPJ.getText()));
        }

        if (tag_acao == "2" && VerificaField() == true) {
            Alterar(jFldCodContratante.getText(), jFldNomeContratante.getText(), util.ExtraiNumeros(jFldCPF.getText()), util.ExtraiNumeros(jFldCNPJ.getText()));
        }

        if (tag_acao == "3" && VerificaField() == true) {
            Deletar(jFldCodContratante.getText());
        }
    }//GEN-LAST:event_jBtGravarActionPerformed

    private void jBtGravarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtGravarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jBtGravar.doClick();
        }

        if (evt.getKeyCode() == evt.VK_RIGHT) {
            jBtCancelar.requestFocus();

        }
    }//GEN-LAST:event_jBtGravarKeyPressed

    private void jRadioCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCPFActionPerformed
       
    }//GEN-LAST:event_jRadioCPFActionPerformed

    private void jRadioCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCNPJActionPerformed
        
    }//GEN-LAST:event_jRadioCNPJActionPerformed

    private void jRadioCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioCPFKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(jFldCNPJ.isEnabled() == true){
                jFldCNPJ.requestFocus();
            }else if(jFldCPF.isEnabled() == true){
                jFldCPF.requestFocus();
            }
        }
        
        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_RIGHT){
            jRadioCNPJ.setSelected(true);
            jRadioCNPJ.requestFocus();
        }else if(evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_LEFT){
            jRadioCNPJ.setSelected(true);
            jRadioCNPJ.requestFocus();
        }
    }//GEN-LAST:event_jRadioCPFKeyPressed

    private void jRadioCNPJKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioCNPJKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jFldCNPJ.requestFocus();
        }
        
        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_RIGHT){
            jRadioCPF.setSelected(true);
            jRadioCPF.requestFocus();
        }else if(evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_LEFT){
            jRadioCPF.setSelected(true);
            jRadioCPF.requestFocus();
        }
    }//GEN-LAST:event_jRadioCNPJKeyPressed

    private void jFldCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldCPFFocusGained
        jFldCPF.setText(util.ExtraiNumeros(jFldCPF.getText()));
    }//GEN-LAST:event_jFldCPFFocusGained

    private void jFldCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldCPFFocusLost
        if (jFldCPF.getText().length() > 0) {   
            
            if(jRadioCPF.isSelected() == true){
                
                if (util.VerificaCPF(jFldCPF.getText()) == true) {
                    
                    try {
                        jFldCPF.setText(util.FormataCpf(jFldCPF.getText()));
                    } catch (ParseException ex) {
                        Logger.getLogger(TelaContratante.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                } else {
                    
                    JOptionPane.showMessageDialog(null, "CPF Inválido");
                    jFldCPF.requestFocus();
                    
                }
            }
            
        }
    }//GEN-LAST:event_jFldCPFFocusLost

    private void jFldCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldCPFKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtGravar.requestFocus();
        }
    }//GEN-LAST:event_jFldCPFKeyPressed

    private void jFldCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldCPFKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldCPFKeyTyped

    private void jRadioCNPJItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioCNPJItemStateChanged
        
        if(jRadioCNPJ.isSelected() == true){
            jFldCPF.setText("");
            jFldCPF.setEnabled(false);
            jFldCNPJ.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioCNPJItemStateChanged

    private void jRadioCPFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioCPFItemStateChanged
        if(jRadioCPF.isSelected() == true){
            jFldCNPJ.setText("");
            jFldCNPJ.setEnabled(false);
            jFldCPF.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioCPFItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaContratante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaContratante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaContratante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaContratante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaContratante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtAlterar;
    private javax.swing.JButton jBtAnterior;
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jBtExcluir;
    private javax.swing.JButton jBtGravar;
    private javax.swing.JButton jBtInserir;
    private javax.swing.JButton jBtPrimeiro;
    private javax.swing.JButton jBtProximo;
    private javax.swing.JButton jBtUltimo;
    private javax.swing.JComboBox<String> jCmbBxBusca;
    private javax.swing.JComboBox<String> jCmbBxOrdem;
    private javax.swing.JTextField jFldBusca;
    private javax.swing.JTextField jFldCNPJ;
    private javax.swing.JTextField jFldCPF;
    private javax.swing.JTextField jFldCodContratante;
    private javax.swing.JTextField jFldNomeContratante;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLblAcao;
    private javax.swing.JLabel jLblBusca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPnlBotao;
    private javax.swing.JPanel jPnlBusca;
    private javax.swing.JPanel jPnlEdit;
    private javax.swing.JPanel jPnlEditBotoes;
    private javax.swing.JPanel jPnlNorte;
    private javax.swing.JPanel jPnlPrincipal;
    private javax.swing.JRadioButton jRadioCNPJ;
    private javax.swing.JRadioButton jRadioCPF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePrincipal;
    // End of variables declaration//GEN-END:variables

    public void LimpaTabela(){
        DefaultTableModel dtm = (DefaultTableModel) jTablePrincipal.getModel();
        dtm.setNumRows(0);
    }
    
    public void DefinirFormulario() {
        
        //Nao permite o jFrame ser redimensionado
        setResizable(true);
        //Define o tamanho minimo do jFrame
        setMinimumSize(new Dimension(600, 450));
        //Define o tamanho do jFrame
        setSize(600, 450);
        //Define o título do jFrame
        setTitle("Cadastro de Contratante");

        //setLocationRelativeTo(null);
        //Define o tamanho do jPnlPrincipal
        jPnlPrincipal.setSize(600, 450);
        //Seta a o tamanho e a fonte do cabeçalho da tabela
        jTablePrincipal.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 11));
        //Tira a opacidade
        jTablePrincipal.getTableHeader().setOpaque(false);
        //Seta a cor do foreground para branco
        jTablePrincipal.getTableHeader().setForeground(Color.white);
        
        for (int col = 0; col < jTablePrincipal.getColumnCount(); col++) {
            jTablePrincipal.getColumnModel().getColumn(col).setHeaderRenderer(new MeuRenderizador());
        }

        //Seta a cor do background pata azul
        //jTableAgNaveg.getTableHeader().setBackground(Color.blue);
        //Permite que seja selecianada apenas uma linha por vez da jTable
        jTablePrincipal.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //Ativa o barra de rolagem horizontal
        jTablePrincipal.setAutoResizeMode(jTablePrincipal.AUTO_RESIZE_OFF);

        centro.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);

        //Define o tamanho das colunas e posicoes das celulas
        jTablePrincipal.getColumnModel().getColumn(0).setMinWidth(90);
        jTablePrincipal.getColumnModel().getColumn(0).setMaxWidth(90);
        jTablePrincipal.getColumnModel().getColumn(0).setCellRenderer(centro);

        jTablePrincipal.getColumnModel().getColumn(1).setMinWidth(500);
        jTablePrincipal.getColumnModel().getColumn(1).setMaxWidth(500);
        jTablePrincipal.getColumnModel().getColumn(1).setCellRenderer(esquerda);

        jTablePrincipal.getColumnModel().getColumn(2).setMinWidth(200);
        jTablePrincipal.getColumnModel().getColumn(2).setMaxWidth(200);
        jTablePrincipal.getColumnModel().getColumn(2).setCellRenderer(esquerda);
        
        jTablePrincipal.getColumnModel().getColumn(3).setMinWidth(200);
        jTablePrincipal.getColumnModel().getColumn(3).setMaxWidth(200);
        jTablePrincipal.getColumnModel().getColumn(3).setCellRenderer(esquerda);
        
        jTablePrincipal.getColumnModel().getColumn(4).setMinWidth(120);
        jTablePrincipal.getColumnModel().getColumn(4).setMaxWidth(120);
        jTablePrincipal.getColumnModel().getColumn(4).setCellRenderer(esquerda);
        
        jTablePrincipal.getColumnModel().getColumn(5).setMinWidth(120);
        jTablePrincipal.getColumnModel().getColumn(5).setMaxWidth(120);
        jTablePrincipal.getColumnModel().getColumn(5).setCellRenderer(esquerda);
                
        jTablePrincipal.getColumnModel().getColumn(6).setMinWidth(120);
        jTablePrincipal.getColumnModel().getColumn(6).setMaxWidth(120);
        jTablePrincipal.getColumnModel().getColumn(6).setCellRenderer(esquerda);
        

        //Seta a tecla de atalho Alt + nos seguntos botoes
        jBtInserir.setMnemonic(KeyEvent.VK_I);
        jBtAlterar.setMnemonic(KeyEvent.VK_A);
        jBtExcluir.setMnemonic(KeyEvent.VK_E);
        jBtGravar.setMnemonic(KeyEvent.VK_G);
        jBtCancelar.setMnemonic(KeyEvent.VK_C);
    }
    
    /**
     * Método que carrega a lista de dados do banco para mostrar na tabela.
     */
    public void CarregaTudo() {
        try {
            Conectar.ConectarBD();
            LimpaTabela();
            Conectar.result = Conectar.stam.executeQuery("SELECT * FROM MDFE_CAD_CONTRATANTE WHERE RGEVENTO <> '3'");
            DefaultTableModel dtm = (DefaultTableModel) jTablePrincipal.getModel();
            while (Conectar.result.next()) {
                dtm.addRow(new Object[]{
                    Conectar.result.getString("COD_CONTRATANTE"),
                    Conectar.result.getString("CONT_NOME"),
                    util.FormataCpf(Conectar.result.getString("CONT_CPF")),
                    util.FormataCnpj(Conectar.result.getString("CONT_CNPJ")),
                    Conectar.result.getString("RGCODUSU"),
                    Conectar.result.getString("RGUSUARIO"),
                    Conectar.result.getDate("RGDATA"),
                    Conectar.result.getString("RGEVENTO")
                });
            }
            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados na tabela...\n" + e.getLocalizedMessage());
        }
    }

    
    public void CarregaCampoEdit(String CodContratante) {
        try {
            Conectar.ConectarBD();
            Conectar.result = Conectar.stam.executeQuery("SELECT * FROM MDFE_CAD_CONTRATANTE WHERE COD_CONTRATANTE = '" + CodContratante + "' ");
            while (Conectar.result.next()) {
                jFldCodContratante.setText(Conectar.result.getString("COD_CONTRATANTE"));
                jFldNomeContratante.setText(Conectar.result.getString("CONT_NOME"));
                
                if(Conectar.result.getString("CONT_CNPJ").length() > 0){
                    jRadioCNPJ.setSelected(true);
                    jFldCNPJ.setText(util.FormataCnpj(Conectar.result.getString("CONT_CNPJ")));
                    jFldCPF.setEnabled(false);
                }else if(Conectar.result.getString("CONT_CPF").length() > 0){
                    jRadioCPF.setSelected(true);
                    jFldCPF.setText(util.FormataCpf(Conectar.result.getString("CONT_CPF")));
                    jFldCNPJ.setEnabled(false);
                }
                
            }
            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro carregaedit...\n" + e.getLocalizedMessage());
        }
    }
    
    public void BuscaParametro(String busca) {
        try {
            Conectar.ConectarBD();

            sql = "";
            if(jCmbBxBusca.getSelectedItem().equals("Código")){
                sql = "WHERE COD_CONTRATANTE like '"+ busca +"%' ";
            }else if(jCmbBxBusca.getSelectedItem().equals("Nome")){
                sql = "WHERE CONT_NOME like '"+ busca +"%' ";
            }else if(jCmbBxBusca.getSelectedItem().equals("CPF")){
                sql = "WHERE CONT_CPF like '"+ busca +"%' "; 
            }else if(jCmbBxBusca.getSelectedItem().equals("CNPJ")){
                sql = "WHERE CONT_CNPJ like '"+ busca +"%' ";
            }

            if (jCmbBxOrdem.getSelectedItem().equals("Código")) {
                ordnar = "COD_CONTRATANTE";
            } else if (jCmbBxOrdem.getSelectedItem().equals("Nome")) {
                ordnar = "CONT_NOME";
            }

            LimpaTabela();
            Conectar.ConectarBD();
            System.out.println("SELECT * FROM MDFE_CAD_CONTRATANTE " + sql + " AND RGEVENTO <> '3' ORDER BY " + ordnar + " ");
            Conectar.result = Conectar.stam.executeQuery("SELECT * FROM MDFE_CAD_CONTRATANTE " + sql + " AND RGEVENTO <> '3' ORDER BY " + ordnar + " ");
            DefaultTableModel dtm = (DefaultTableModel) jTablePrincipal.getModel();
            while (Conectar.result.next()) {
                dtm.addRow(new Object[]{
                    Conectar.result.getString("COD_CONTRATANTE"),
                    Conectar.result.getString("CONT_NOME"),
                    util.FormataCpf(Conectar.result.getString("CONT_CPF")),
                    util.FormataCnpj(Conectar.result.getString("CONT_CNPJ")),
                    Conectar.result.getString("RGCODUSU"),
                    Conectar.result.getString("RGUSUARIO"),
                    Conectar.result.getDate("RGDATA"),
                    Conectar.result.getString("RGEVENTO")
                });
            }

            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar agência...\n" + e.getLocalizedMessage());
        }
    }
    
    /**
     * Método responsável por incrementar o próximo número do código.
     */
    public void BuscaCodMax() {
        try {
            Conectar.ConectarBD();
            Conectar.result = Conectar.stam.executeQuery("SELECT MAX(COD_CONTRATANTE) + 1 FROM MDFE_CAD_CONTRATANTE ");
            while (Conectar.result.next()) {
                if (Conectar.result.getString(1) == null) {
                    codmax = 1;
                } else {
                    codmax = Integer.parseInt(Conectar.result.getString(1));
                }
                
                jFldCodContratante.setText(codmax.toString());
            }
            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao gerar código...\n" + e.getLocalizedMessage());
        }
    }
    
    /**
     * Método para inserir os dados da agência de navegação na tabela
     * MDFE_CAD_AGENCIA_NAVEG.
     */
    public void Inserir(String CodContratante, String NomeContratante, String CPF, String CNPJ) {
        try {
            Conectar.ConectarBD();

            System.out.println("INSERT INTO MDFE_CAD_CONTRATANTE (COD_CONTRATANTE, CONT_NOME, CONT_CPF, CONT_CNPJ, RGCODUSU, RGUSUARIO, RGDATA, RGEVENTO )"
                    + " VALUES('" + CodContratante + "', '" + NomeContratante + "', '" + CPF + "', '"+ CNPJ +"', " + tabusu.getCodigo() + ", '" + tabusu.getNome() + "', "
                    + " '" + util.FormataDataBanco(new Date()) + "', 1)"
            );

            Conectar.stam.executeUpdate("INSERT INTO MDFE_CAD_CONTRATANTE (COD_CONTRATANTE, CONT_NOME, CONT_CPF, CONT_CNPJ, RGCODUSU, RGUSUARIO, RGDATA, RGEVENTO )"
                    + " VALUES('" + CodContratante + "', '" + NomeContratante + "', '" + CPF + "', '"+ CNPJ +"', " + tabusu.getCodigo() + ", '" + tabusu.getNome() + "', "
                    + " '" + util.FormataDataBanco(new Date()) + "', 1)"
            );

            jPnlEdit.setVisible(false);
            jPnlBusca.setVisible(true);
            CarregaTudo();
            int resposta = JOptionPane.showConfirmDialog(null, "Registro inserido com sucesso!\n Deseja inserir outro?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                jBtInserir.doClick();
            }else{
                jFldBusca.requestFocus();
            }

            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir...\n" + e.getLocalizedMessage());
        }
    }

    /**
     * Método para alterar os dados da agência de navegação na tabela
     * MDFE_CAD_AGENCIA_NAVEG.
     */
    public void Alterar(String CodContratante, String NomeContratante, String CPF, String CNPJ) {
        try {
            Conectar.ConectarBD();

            System.out.println("UPDATE MDFE_CAD_CONTRATANTE SET "
                    + "CONT_NOME = '" + NomeContratante + "', "
                    + "CONT_CPF  = '"+ CPF +"', "
                    + "CONT_CNPJ = '" + CNPJ + "', "
                    + "RGCODUSU  = " + tabusu.getCodigo() + ", "
                    + "RGUSUARIO = '" + tabusu.getNome() + "', "
                    + "RGDATA    = '" + util.FormataDataBanco(new Date()) + "', "
                    + "RGEVENTO  = 2 "
                    + "WHERE COD_CONTRATANTE = '" + CodContratante + "' "
            );

            Conectar.stam.executeUpdate("UPDATE MDFE_CAD_CONTRATANTE SET "
                    + "CONT_NOME = '" + NomeContratante + "', "
                    + "CONT_CPF  = '"+ CPF +"', "
                    + "CONT_CNPJ = '" + CNPJ + "', "
                    + "RGCODUSU  = " + tabusu.getCodigo() + ", "
                    + "RGUSUARIO = '" + tabusu.getNome() + "', "
                    + "RGDATA    = '" + util.FormataDataBanco(new Date()) + "', "
                    + "RGEVENTO  = 2 "
                    + "WHERE COD_CONTRATANTE = '" + CodContratante + "' "
            );

            jPnlEdit.setVisible(false);
            jPnlBusca.setVisible(true);
            CarregaTudo();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            Conectar.DesconectarBD();
            
            jFldBusca.requestFocus();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao alterar...\n" + e.getLocalizedMessage());
        }
    }

    /**
     * Método para deletar os dados da agência de navegação na tabela
     * MDFE_CAD_AGENCIA_NAVEG.
     */
    public void Deletar(String codContratante) {
        try {
            Conectar.ConectarBD();

            System.out.println("UPDATE MDFE_CAD_CONTRATANTE SET "
                    + "RGCODUSU  = " + tabusu.getCodigo() + ", "
                    + "RGUSUARIO = '" + tabusu.getNome() + "', "
                    + "RGDATA    = '" + util.FormataDataBanco(new Date()) + "', "
                    + "RGEVENTO  = 3 "
                    + "WHERE COD_CONTRATANTE = '" + codContratante + "' "
            );

            Conectar.stam.executeUpdate("UPDATE MDFE_CAD_CONTRATANTE SET "
                    + "RGCODUSU  = " + tabusu.getCodigo() + ", "
                    + "RGUSUARIO = '" + tabusu.getNome() + "', "
                    + "RGDATA    = '" + util.FormataDataBanco(new Date()) + "', "
                    + "RGEVENTO  = 3 "
                    + "WHERE COD_CONTRATANTE = '" + codContratante + "' "
            );

            jPnlEdit.setVisible(false);
            jPnlBusca.setVisible(true);
            CarregaTudo();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            Conectar.DesconectarBD();
            jFldBusca.requestFocus();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao deletar...\n" + e.getLocalizedMessage());
        }
    }
    
    public void LimpaField() {
        jFldCodContratante.setText("");
        jFldNomeContratante.setText("");
        jFldCPF.setText("");
        jFldCNPJ.setText("");
        
        jRadioCPF.setSelected(true);
        jFldCPF.setEnabled(true);
        jFldCNPJ.setEnabled(false);
    }
    
     public boolean VerificaField() {
         if(jFldNomeContratante.getText().length() == 0){
             JOptionPane.showMessageDialog(null, "Contrante não preechido!");
             jFldNomeContratante.requestFocus();
             return false;
         }else if(jFldCPF.getText().length() == 0 && jFldCNPJ.getText().length() == 0){
             JOptionPane.showMessageDialog(null, "Preencha o CPF ou CNPJ do contratante!");
             if (jFldCNPJ.isEnabled() == true) {
                 jFldCNPJ.requestFocus();
             }else if(jFldCPF.isEnabled() == true){
                 jFldCPF.requestFocus();
             }
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
                if (jPnlBusca.isVisible() == true) {
                    dispose();
                } else if (jPnlEdit.isVisible() == true) {
                    jPnlEdit.setVisible(false);
                    jPnlBusca.setVisible(true);
                    jFldBusca.requestFocus();
                }
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
            setOpaque(false);
            setBorder(new LineBorder(Color.WHITE, 1, true));
            setForeground(Color.WHITE);
            setFont(getFont().deriveFont(Font.BOLD));
            setHorizontalAlignment(SwingConstants.LEFT);

            setText(value.toString());

            return this;
        }
    } 
     
     

}
