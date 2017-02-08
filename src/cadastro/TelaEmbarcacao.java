
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
import java.text.DecimalFormat;
import java.util.Date;
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

public class TelaEmbarcacao extends javax.swing.JInternalFrame {

    public Integer codmax, selecionada;
    String sql, ordnar, situacao, tag_acao;
    DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
    DefaultTableCellRenderer centro = new DefaultTableCellRenderer() ;
    DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
    Utilitarios util = new Utilitarios();
    Tabusu tabusu = new Tabusu();
    DecimalFormat df = new DecimalFormat("00");

    public TelaEmbarcacao() {
        initComponents();
        DefinirFormulario();
        CarregaTudo();
        SairEsc();
    }

    
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPnlPrincipal = new javax.swing.JPanel();
    jPnlBusca = new javax.swing.JPanel();
    jLblBusca = new javax.swing.JLabel();
    jFldBusca = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
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
    jCmbBxPesquisaPor = new javax.swing.JComboBox<>();
    jLabel7 = new javax.swing.JLabel();
    jPnlEdit = new javax.swing.JPanel();
    jPnlNorte = new javax.swing.JPanel();
    jFldTpEmb = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jFldCodEmb = new javax.swing.JTextField();
    jFldNomeEmb = new javax.swing.JTextField();
    jLabel18 = new javax.swing.JLabel();
    jFldCodigo = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jFldIrin = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    jPnlSul = new javax.swing.JPanel();
    jButton10 = new javax.swing.JButton();
    jBtCancelar = new javax.swing.JButton();
    jBtGravar = new javax.swing.JButton();
    jLblAcao = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
      public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
        formInternalFrameClosing(evt);
      }
      public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
      }
    });

    jPnlPrincipal.setLayout(new java.awt.CardLayout());

    jLblBusca.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
    jLblBusca.setText("Código:");

    jFldBusca.setDocument(new LimitaField(100, 0)
    );
    jFldBusca.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
    jLabel2.setText("Ordem:");

    jCmbBxOrdem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jCmbBxOrdem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Cód. Embarcação", "Cód. Tipo" }));
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
        "Código", "Cód. Embarcação", "Nome da Embarcação", "Tipo", "IRIN", "Cód. Usuário", "Usuário", "Data", "Evento"
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

    jPnlBotao.setPreferredSize(new java.awt.Dimension(557, 30));
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

    jCmbBxPesquisaPor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jCmbBxPesquisaPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome da Embarcação", "Cód. Embarcação", "Cód. Tipo", "IRIN" }));
    jCmbBxPesquisaPor.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        jCmbBxPesquisaPorItemStateChanged(evt);
      }
    });
    jCmbBxPesquisaPor.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jCmbBxPesquisaPorKeyPressed(evt);
      }
    });

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
    jLabel7.setText("Buscar por:");

    javax.swing.GroupLayout jPnlBuscaLayout = new javax.swing.GroupLayout(jPnlBusca);
    jPnlBusca.setLayout(jPnlBuscaLayout);
    jPnlBuscaLayout.setHorizontalGroup(
      jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPnlBuscaLayout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addGroup(jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPnlBuscaLayout.createSequentialGroup()
            .addGroup(jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLblBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jFldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jCmbBxPesquisaPor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jCmbBxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addComponent(jScrollPane1)
          .addComponent(jPnlBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(11, 11, 11))
    );
    jPnlBuscaLayout.setVerticalGroup(
      jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPnlBuscaLayout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addGroup(jPnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPnlBuscaLayout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jLblBusca)
            .addGap(2, 2, 2)
            .addComponent(jFldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPnlBuscaLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jCmbBxPesquisaPor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPnlBuscaLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jCmbBxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPnlBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(22, 22, 22))
    );

    jPnlPrincipal.add(jPnlBusca, "card2");

    jPnlEdit.setLayout(new java.awt.BorderLayout());

    jPnlNorte.setPreferredSize(new java.awt.Dimension(590, 500));
    jPnlNorte.setLayout(null);

    jFldTpEmb.setDocument(new LimitaField(2, 2)
    );
    jFldTpEmb.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        jFldTpEmbFocusLost(evt);
      }
    });
    jFldTpEmb.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jFldTpEmbActionPerformed(evt);
      }
    });
    jFldTpEmb.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jFldTpEmbKeyPressed(evt);
      }
    });
    jPnlNorte.add(jFldTpEmb);
    jFldTpEmb.setBounds(10, 170, 170, 25);

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
    jLabel6.setText("Código da Embarcação");
    jPnlNorte.add(jLabel6);
    jLabel6.setBounds(10, 60, 140, 10);

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
    jLabel5.setText("Código");
    jPnlNorte.add(jLabel5);
    jLabel5.setBounds(10, 0, 34, 30);

    jFldCodEmb.setDocument(new LimitaField(10, 1));
    jFldCodEmb.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jFldCodEmbActionPerformed(evt);
      }
    });
    jFldCodEmb.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jFldCodEmbKeyPressed(evt);
      }
    });
    jPnlNorte.add(jFldCodEmb);
    jFldCodEmb.setBounds(10, 70, 140, 25);

    jFldNomeEmb.setDocument(new LimitaField(60, 0));
    jFldNomeEmb.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jFldNomeEmbActionPerformed(evt);
      }
    });
    jFldNomeEmb.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jFldNomeEmbKeyPressed(evt);
      }
      public void keyReleased(java.awt.event.KeyEvent evt) {
        jFldNomeEmbKeyReleased(evt);
      }
      public void keyTyped(java.awt.event.KeyEvent evt) {
        jFldNomeEmbKeyTyped(evt);
      }
    });
    jPnlNorte.add(jFldNomeEmb);
    jFldNomeEmb.setBounds(10, 120, 560, 25);

    jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
    jLabel18.setText("Nome da Embarcação");
    jLabel18.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jLabel18KeyPressed(evt);
      }
    });
    jPnlNorte.add(jLabel18);
    jLabel18.setBounds(10, 103, 150, 20);

    jFldCodigo.setEditable(false);
    jFldCodigo.setBackground(new java.awt.Color(255, 255, 204));
    jFldCodigo.setFocusable(false);
    jFldCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
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
    });
    jPnlNorte.add(jFldCodigo);
    jFldCodigo.setBounds(10, 20, 90, 25);

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
    jLabel4.setText("Cód. Tipo da Embarcação");
    jPnlNorte.add(jLabel4);
    jLabel4.setBounds(10, 157, 130, 13);

    jFldIrin.setDocument(new LimitaField(10,2)
    );
    jFldIrin.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        jFldIrinFocusLost(evt);
      }
    });
    jFldIrin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jFldIrinActionPerformed(evt);
      }
    });
    jFldIrin.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jFldIrinKeyPressed(evt);
      }
    });
    jPnlNorte.add(jFldIrin);
    jFldIrin.setBounds(200, 170, 370, 25);

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
    jLabel8.setText("Irin do navio");
    jPnlNorte.add(jLabel8);
    jLabel8.setBounds(200, 157, 130, 13);

    jPnlEdit.add(jPnlNorte, java.awt.BorderLayout.CENTER);

    jPnlSul.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    jPnlSul.setPreferredSize(new java.awt.Dimension(0, 60));

    jButton10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
    jButton10.setText("Inserir");
    jButton10.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton10ActionPerformed(evt);
      }
    });

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

    javax.swing.GroupLayout jPnlSulLayout = new javax.swing.GroupLayout(jPnlSul);
    jPnlSul.setLayout(jPnlSulLayout);
    jPnlSulLayout.setHorizontalGroup(
      jPnlSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPnlSulLayout.createSequentialGroup()
        .addGap(78, 78, 78)
        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(jPnlSulLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jBtGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(132, 132, 132)
        .addComponent(jLblAcao, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        .addGap(137, 137, 137)
        .addComponent(jBtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPnlSulLayout.setVerticalGroup(
      jPnlSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPnlSulLayout.createSequentialGroup()
        .addGroup(jPnlSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPnlSulLayout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(jLblAcao))
          .addGroup(jPnlSulLayout.createSequentialGroup()
            .addGap(8, 8, 8)
            .addComponent(jBtGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(233, 233, 233)
        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGroup(jPnlSulLayout.createSequentialGroup()
        .addGap(8, 8, 8)
        .addComponent(jBtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jPnlEdit.add(jPnlSul, java.awt.BorderLayout.SOUTH);

    jPnlPrincipal.add(jPnlEdit, "card3");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        .addGap(0, 0, 0))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void jFldBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldBuscaActionPerformed

    private void jFldBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldBuscaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jCmbBxPesquisaPor.requestFocus();
        }
    }//GEN-LAST:event_jFldBuscaKeyPressed

    private void jFldBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldBuscaKeyReleased
        BuscaParametro(jFldBusca.getText());
    }//GEN-LAST:event_jFldBuscaKeyReleased

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

    private void jBtInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtInserirActionPerformed
        //        if(util.VerificarPermissao("01.01.01", tabusu.getCodigo()) == true){
        tag_acao = "1";
        jLblAcao.setText("Inserir");
        LimpaField();
        BuscaCodMax();
        jPnlBusca.setVisible(false);
        jPnlEdit.setVisible(true);
        jFldCodEmb.requestFocus();
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
            jFldCodEmb.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma embarcação selecionada");
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
            jFldCodEmb.requestFocus();
            CarregaCampoEdit(jTablePrincipal.getValueAt(selecionada, 0).toString());
            int option = JOptionPane.showConfirmDialog(null, "Confirma Exclusão do Registro", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                jBtGravar.doClick();
            } else if (option == JOptionPane.NO_OPTION) {
                jBtCancelar.doClick();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma embarcação selecionada");
        }
        // } else {
        //   JOptionPane.showMessageDialog(null, "Usuário não habilitado para este tipo de operação!");
        //}
    }//GEN-LAST:event_jBtExcluirActionPerformed

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

    private void jFldCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldCodigoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldCodigoFocusLost

    private void jFldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldCodigoActionPerformed

    private void jFldCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldCodigoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jFldNomeEmb.requestFocus();
        }
    }//GEN-LAST:event_jFldCodigoKeyPressed

    private void jLabel18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel18KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18KeyPressed

    private void jFldNomeEmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldNomeEmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldNomeEmbActionPerformed

    private void jFldNomeEmbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldNomeEmbKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jFldTpEmb.requestFocus();
        }
      
       
    }//GEN-LAST:event_jFldNomeEmbKeyPressed

    private void jFldNomeEmbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldNomeEmbKeyReleased

    }//GEN-LAST:event_jFldNomeEmbKeyReleased

    private void jFldNomeEmbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldNomeEmbKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldNomeEmbKeyTyped

    private void jFldCodEmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldCodEmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldCodEmbActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            jFldNomeEmb.requestFocus();
        }
    }//GEN-LAST:event_jBtCancelarKeyPressed

    private void jBtGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGravarActionPerformed
        if (tag_acao == "1" && VerificaField() == true) {
            Inserir(jFldCodigo.getText(), jFldCodEmb.getText(), df.format(Integer.parseInt(jFldTpEmb.getText())), jFldNomeEmb.getText(), jFldIrin.getText());
        }

        if (tag_acao == "2" && VerificaField() == true) {
            Alterar(jFldCodigo.getText(), jFldCodEmb.getText(), df.format(Integer.parseInt(jFldTpEmb.getText())), jFldNomeEmb.getText(), jFldIrin.getText());
        }

        if (tag_acao == "3") {
            Deletar(jFldCodigo.getText());
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

    private void jFldCodEmbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldCodEmbKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jFldNomeEmb.requestFocus();
        }
    }//GEN-LAST:event_jFldCodEmbKeyPressed

    private void jFldTpEmbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldTpEmbKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jFldIrin.requestFocus();
        }
    }//GEN-LAST:event_jFldTpEmbKeyPressed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    private void jCmbBxPesquisaPorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCmbBxPesquisaPorItemStateChanged
       jLblBusca.setText(jCmbBxPesquisaPor.getSelectedItem().toString() + ":");
       BuscaParametro(jFldBusca.getText());
    }//GEN-LAST:event_jCmbBxPesquisaPorItemStateChanged

    private void jCmbBxPesquisaPorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCmbBxPesquisaPorKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jCmbBxOrdem.requestFocus();
        }
    }//GEN-LAST:event_jCmbBxPesquisaPorKeyPressed

  private void jFldTpEmbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldTpEmbFocusLost
    if(jFldTpEmb.getText().length() == 0){
      jFldTpEmb.setText("00");
    }else{
      jFldTpEmb.setText(df.format(Integer.parseInt(jFldTpEmb.getText())));
    }
  }//GEN-LAST:event_jFldTpEmbFocusLost

  private void jFldTpEmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldTpEmbActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldTpEmbActionPerformed

  private void jFldIrinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldIrinFocusLost
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldIrinFocusLost

  private void jFldIrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldIrinActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldIrinActionPerformed

  private void jFldIrinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldIrinKeyPressed
    // TODO add your handling code here:
      if (evt.getKeyCode() == evt.VK_ENTER) {
         jBtGravar.requestFocus();
      }
  }//GEN-LAST:event_jFldIrinKeyPressed

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
            java.util.logging.Logger.getLogger(TelaEmbarcacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEmbarcacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEmbarcacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEmbarcacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEmbarcacao().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jBtAlterar;
  private javax.swing.JButton jBtAnterior;
  private javax.swing.JButton jBtCancelar;
  private javax.swing.JButton jBtExcluir;
  private javax.swing.JButton jBtGravar;
  private javax.swing.JButton jBtInserir;
  private javax.swing.JButton jBtPrimeiro;
  private javax.swing.JButton jBtProximo;
  private javax.swing.JButton jBtUltimo;
  private javax.swing.JButton jButton10;
  private javax.swing.JComboBox<String> jCmbBxOrdem;
  private javax.swing.JComboBox<String> jCmbBxPesquisaPor;
  private javax.swing.JTextField jFldBusca;
  private javax.swing.JTextField jFldCodEmb;
  private javax.swing.JTextField jFldCodigo;
  private javax.swing.JTextField jFldIrin;
  private javax.swing.JTextField jFldNomeEmb;
  private javax.swing.JTextField jFldTpEmb;
  private javax.swing.JLabel jLabel18;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLblAcao;
  private javax.swing.JLabel jLblBusca;
  private javax.swing.JPanel jPnlBotao;
  private javax.swing.JPanel jPnlBusca;
  private javax.swing.JPanel jPnlEdit;
  private javax.swing.JPanel jPnlNorte;
  private javax.swing.JPanel jPnlPrincipal;
  private javax.swing.JPanel jPnlSul;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTablePrincipal;
  // End of variables declaration//GEN-END:variables

    /**
     * Método que define as propriedades do formulario. Ex: Tamanho do jFrame,
     * Localização, cor da tabela, layout das células da tabela, etc...
     */
    public void DefinirFormulario() {
        //permite o jFrame ser redimensionado
        setResizable(true);
        //Define oo tamanho minimo que o jFrame pode tomar
        setMinimumSize(new Dimension(600, 450));
        //Define o tamanho do jFrame
        setSize(600, 450);
        //Define o título do jFrame
        setTitle("Cadastro de Embarcação");
        
        //CarregaEventojComboBox();

        //setLocationRelativeTo(null);
        //Define o tamanho do jPnlPrincipal
        jPnlPrincipal.setSize(600, 450);
        
        for (int col = 0; col < jTablePrincipal.getColumnCount(); col++) {
            jTablePrincipal.getColumnModel().getColumn(col).setHeaderRenderer(new MeuRenderizador());
        }
        
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

        jTablePrincipal.getColumnModel().getColumn(1).setMinWidth(200);
        jTablePrincipal.getColumnModel().getColumn(1).setMaxWidth(200);
        jTablePrincipal.getColumnModel().getColumn(1).setCellRenderer(centro);

        jTablePrincipal.getColumnModel().getColumn(2).setMinWidth(450);
        jTablePrincipal.getColumnModel().getColumn(2).setMaxWidth(450);
        jTablePrincipal.getColumnModel().getColumn(2).setCellRenderer(esquerda);
        
        jTablePrincipal.getColumnModel().getColumn(3).setCellRenderer(centro);
        
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
     * Método usado para limpar a jTable.
     */
    public void LimpaTabela() {
        DefaultTableModel dtm = (DefaultTableModel) jTablePrincipal.getModel();
        dtm.setNumRows(0);
    }

    /**
     * Método que carrega a lista de dados do banco para mostrar na tabela.
     */
    public void CarregaTudo() {
        try {
            Conectar.ConectarBD();
            LimpaTabela();
            Conectar.result = Conectar.stam.executeQuery("SELECT * FROM MDFE_CAD_EMBARCACAO WHERE RGEVENTO <> '3'");
            DefaultTableModel dtm = (DefaultTableModel) jTablePrincipal.getModel();
            while (Conectar.result.next()) {
                dtm.addRow(new Object[]{
                    Conectar.result.getString("CODIGO"),
                    Conectar.result.getString("COD_EMB"),
                    Conectar.result.getString("NOME_EMB"),
                    Conectar.result.getString("COD_TP_EMB"),
                    Conectar.result.getString("IRIN"),
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

    /**
    * Método que busca os dados na tabela MDFE_CAD_EMBARCACAO para enviar
    * para os campos do jPnlEdit a partir do codigo.
    *
    * @param codigo 
    * O código da agência de navegação;
    */
    public void CarregaCampoEdit(String codigo) {
        try {
            Conectar.ConectarBD();
            Conectar.result = Conectar.stam.executeQuery("SELECT * FROM MDFE_CAD_EMBARCACAO WHERE CODIGO = '" + codigo + "' ");
            while (Conectar.result.next()) {
                jFldCodigo.setText(Conectar.result.getString("CODIGO"));
                jFldCodEmb.setText(Conectar.result.getString("COD_EMB"));
                jFldTpEmb.setText(Conectar.result.getString("COD_TP_EMB"));
                jFldNomeEmb.setText(Conectar.result.getString("NOME_EMB"));
                jFldIrin.setText(Conectar.result.getString("IRIN"));
                
            }
            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro carregaedit...\n" + e.getLocalizedMessage());
        }
    }

    public void BuscaParametro(String busca) {
        try {
            sql = "";
            
            if(jCmbBxPesquisaPor.getSelectedItem().equals("Código")){
                sql = "WHERE CODIGO = '"+ busca +"' ";
            }else if(jCmbBxPesquisaPor.getSelectedItem().equals("Nome da Embarcação")){
                sql = "WHERE NOME_EMB like '"+ busca +"%' ";
            }else if(jCmbBxPesquisaPor.getSelectedItem().equals("Cód. Embarcação")){
                sql = "WHERE COD_EMB = '"+ busca +"' ";
            }else if(jCmbBxPesquisaPor.getSelectedItem().equals("Cód. Tipo")){
                sql = "WHERE COD_TP_EMB = '"+ busca +"' ";
            }else if(jCmbBxPesquisaPor.getSelectedItem().equals("IRIN")){
                sql = "WHERE IRIN = '"+ busca +"' ";
            }
            
            if (jCmbBxOrdem.getSelectedItem().equals("Código")) {
                ordnar = "CODIGO";
            } else if (jCmbBxOrdem.getSelectedItem().equals("Nome")) {
                ordnar = "NOME_EMB";
            }else if(jCmbBxOrdem.getSelectedItem().equals("Cód. Embarcação")){
                ordnar = "COD_EMB";
            }else if(jCmbBxOrdem.getSelectedItem().equals("Cód. Tipo")){
                ordnar = "COD_TP_EMB";
            }

            LimpaTabela();
            Conectar.ConectarBD();
            System.out.println("SELECT * FROM MDFE_CAD_EMBARCACAO " + sql + " AND RGEVENTO <> '3' ORDER BY " + ordnar + " ");
            Conectar.result = Conectar.stam.executeQuery("SELECT * FROM MDFE_CAD_EMBARCACAO " + sql + " AND RGEVENTO <> '3'  ORDER BY " + ordnar + " ");
            DefaultTableModel dtm = (DefaultTableModel) jTablePrincipal.getModel();
            while (Conectar.result.next()) {
                dtm.addRow(new Object[]{
                    Conectar.result.getString("CODIGO"),
                    Conectar.result.getString("COD_EMB"),
                    Conectar.result.getString("NOME_EMB"),
                    Conectar.result.getString("COD_TP_EMB"),
                    Conectar.result.getString("IRIN"),                    
                    Conectar.result.getString("RGCODUSU"),
                    Conectar.result.getString("RGUSUARIO"),
                    Conectar.result.getDate("RGDATA"),
                    Conectar.result.getString("RGEVENTO")
                });
            }
            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar embarcação...\n" + e.getLocalizedMessage());
        }
    }

    /**
     * Método para inserir os dados da agência de navegação na tabela
     * MDFE_CAD_AGENCIA_NAVEG.
     */
    public void Inserir(String codigo, String codEmb, String codTpEmb, String nomeEmb, String irin) {
        try {
            Conectar.ConectarBD();

            System.out.println("INSERT INTO MDFE_CAD_EMBARCACAO (CODIGO, COD_EMB, COD_TP_EMB, NOME_EMB, RGCODUSU, RGUSUARIO, RGDATA, RGEVENTO, IRIN)"
                    + " VALUES('" + codigo + "', '" + codEmb + "', '" + codTpEmb + "', '"+ nomeEmb +"', "
                            + " "+ tabusu.getCodigo() +", '"+ tabusu.getNome() +"', '"+ util.FormataDataBanco(new Date()) +"',1,'"+irin+ "' )"
            );

            Conectar.stam.executeUpdate("INSERT INTO MDFE_CAD_EMBARCACAO (CODIGO, COD_EMB, COD_TP_EMB, NOME_EMB, RGCODUSU, RGUSUARIO, RGDATA, RGEVENTO, IRIN)"
                    + " VALUES('" + codigo + "', '" + codEmb + "', '" + codTpEmb + "', '"+ nomeEmb +"', "
                            + " "+ tabusu.getCodigo() +", '"+ tabusu.getNome() +"', '"+ util.FormataDataBanco(new Date()) +"', 1,'"+irin+ "' )"
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
    public void Alterar(String codigo, String codEmb, String codTpEmb, String nomeEmb,String IRIN) {
        try {
            Conectar.ConectarBD();

            System.out.println("UPDATE MDFE_CAD_EMBARCACAO SET "
                    + "COD_EMB    = '" + codEmb  + "', "
                    + "COD_TP_EMB = '"+ codTpEmb +"', "
                    + "NOME_EMB   = '"+ nomeEmb  +"', "
                    + "IRIN       = '"+ IRIN     +"', "
                    + "RGCODUSU   = "+ tabusu.getCodigo() +", "
                    + "RGUSUARIO  = '"+ tabusu.getNome() +"', "
                    + "RGDATA     = '"+ util.FormataDataBanco(new Date()) +"', "
                    + "RGEVENTO   = 2 "
                    + "WHERE CODIGO = '" + codigo + "' "
            );

            Conectar.stam.executeUpdate("UPDATE MDFE_CAD_EMBARCACAO SET "
                    + "COD_EMB    = '"+ codEmb  + "', "
                    + "COD_TP_EMB = '"+ codTpEmb +"', "
                    + "NOME_EMB   = '"+ nomeEmb  +"', "
                    + "IRIN       = '"+ IRIN     +"', "
                    + "RGCODUSU   = "+ tabusu.getCodigo() +", "
                    + "RGUSUARIO  = '"+ tabusu.getNome()  +"', "
                    + "RGDATA     = '"+ util.FormataDataBanco(new Date()) +"', "                    
                    + "RGEVENTO   = 2 "
                    + "WHERE CODIGO = '" + codigo + "' "
            );

            jPnlEdit.setVisible(false);
            jPnlBusca.setVisible(true);
            CarregaTudo();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            Conectar.DesconectarBD();
            jFldBusca.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar...\n" + e.getLocalizedMessage());
        }
    }

    /**
     * Método para deletar os dados da agência de navegação na tabela
     * MDFE_CAD_AGENCIA_NAVEG.
     */
    public void Deletar(String codigo) {
        try {
            Conectar.ConectarBD();

            System.out.println("UPDATE MDFE_CAD_EMBARCACAO SET "
                    + "RGCODUSU   = "+ tabusu.getCodigo() +", "
                    + "RGUSUARIO  = '"+ tabusu.getNome() +"', "
                    + "RGDATA     = '"+ util.FormataDataBanco(new Date()) +"', "
                    + "RGEVENTO   = 3 "
                    + "WHERE CODIGO = '" + codigo + "' "
            );

            Conectar.stam.executeUpdate("UPDATE MDFE_CAD_EMBARCACAO SET "
                    + "RGCODUSU   = "+ tabusu.getCodigo() +", "
                    + "RGUSUARIO  = '"+ tabusu.getNome() +"', "
                    + "RGDATA     = '"+ util.FormataDataBanco(new Date()) +"', "
                    + "RGEVENTO   = 3 "
                    + "WHERE CODIGO = '" + codigo + "' "
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
    
    /**
    * Método responsável por incrementar o próximo número do código. 
    */
    public void BuscaCodMax(){
        try{
            Conectar.ConectarBD();
            Conectar.result = Conectar.stam.executeQuery("SELECT MAX(CODIGO) + 1 FROM MDFE_CAD_EMBARCACAO ");
            while(Conectar.result.next()){
                if(Conectar.result.getString(1) == null){
                    codmax = 1;
                }else{
                    codmax = Integer.parseInt(Conectar.result.getString(1));
                }
                jFldCodigo.setText(codmax.toString());
            }
            Conectar.DesconectarBD();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao gerar código...\n" + e.getLocalizedMessage());
        }
    }

    public void LimpaField() {
        jFldCodigo.setText("");
        jFldCodEmb.setText("");
        jFldTpEmb.setText("");
        jFldNomeEmb.setText("");
    }
    
    /**
     * Método que verifica se os campos obrigatórios do cadastro foram preechidos 
     * e retorna um valor boolean 'True' se sim e 'False' se não.
    */
    public boolean VerificaField(){
        if(jFldCodEmb.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Código da Embarcação não preenchido!");
            jFldCodEmb.requestFocus();
            return false;
        }else if(jFldTpEmb.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Código do Tipo da Embarcação não preenchido!");
            jFldTpEmb.requestFocus();
            return false;
        }else if(jFldNomeEmb.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Nome da Embarcação não preenchido!");
            jFldNomeEmb.requestFocus();
            return false;
        }else if(jFldIrin.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "IRIN não preenchido!");
            jFldIrin.requestFocus();
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
            
            setBorder(new LineBorder(Color.WHITE, 1, true));
            setForeground(Color.WHITE);
            setHorizontalAlignment(SwingConstants.LEFT);
            setFont(getFont().deriveFont(Font.BOLD));
            setText(value.toString());

            return this;
        }
    }
}
