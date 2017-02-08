package mdfe;

import ClassesFirebird.Tabusu;
import ConexaoDB.Conectar;
import Utilitarios.Utilitarios;
import cadastro.TelaAgenciaNavegacao;
import cadastro.TelaBalsa;
import cadastro.TelaContratante;
import cadastro.TelaEmbarcacao;
import cadastro.TelaEmitente;
import cadastro.TelaForVale;
import cadastro.TelaPorto;
import cadastro.TelaProfissionais;
import cadastro.TelaProprietario;
import cadastro.TelaReboque;
import cadastro.TelaResponsavelPagamento;
import cadastro.TelaSeguradora;
import cadastro.TelaTerminalCarregamento;
import cadastro.TelaTerminalDescarregamento;
import cadastro.TelaUnidadeCargaVazia;
import cadastro.TelaUnidadeTransVazia;
import cadastro.TelaVeiculo;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import movimentacao.TelaMovimentacao;

public class TelaPrincipal extends javax.swing.JFrame {

    Utilitarios util = new Utilitarios();
    static String horaFormatadaSistema;
    Tabusu tabusu = new Tabusu();
    
    public TelaPrincipal() {
        initComponents();
        DefinirFormulario();
        //VerificarPermissaoCadastro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlPrincipal = new javax.swing.JPanel();
        jPnlNorte = new javax.swing.JPanel();
        jToolBar = new javax.swing.JToolBar();
        BtnCadEmitente = new javax.swing.JButton();
        BtnCadVeiculo = new javax.swing.JButton();
        jBtCadEmbarcacao = new javax.swing.JButton();
        jBtCadCondutor = new javax.swing.JButton();
        BtnCadReboque = new javax.swing.JButton();
        BtnEmissaoMDFe = new javax.swing.JButton();
        jBtConfiguracaoSistemaLocal = new javax.swing.JButton();
        btHabDesab = new javax.swing.JButton();
        jBtSairSistema = new javax.swing.JButton();
        jPnlCentro = new javax.swing.JPanel();
        jDesktopPane = new javax.swing.JDesktopPane(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/mdfefundo.png"));
            Image image = icon.getImage();
            //Image newimage = image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);

            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jPnlSul = new javax.swing.JPanel();
        jPnlInformacao = new javax.swing.JPanel();
        jLblTootTip = new javax.swing.JLabel();
        jPnlUsuario = new javax.swing.JPanel();
        jLblUsuario = new javax.swing.JLabel();
        jPnlData = new javax.swing.JPanel();
        jLblData = new javax.swing.JLabel();
        jPnlHoras = new javax.swing.JPanel();
        jLblHora = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuItemUn = new javax.swing.JMenu();
        jMenuItemEmitente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemEmbarcacao = new javax.swing.JMenuItem();
        jMenuItemPorto = new javax.swing.JMenuItem();
        jMenuItemBalsa = new javax.swing.JMenuItem();
        jMenuItemTerminalCarregamento = new javax.swing.JMenuItem();
        jMenuItemTerminalDescarregamento = new javax.swing.JMenuItem();
        jMenuItemUnidadesDeCargas = new javax.swing.JMenuItem();
        jMenuItemUnidadesDeTrans = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemVeiculos = new javax.swing.JMenuItem();
        jMenuItemCondutores = new javax.swing.JMenuItem();
        jMenuItemContratante = new javax.swing.JMenuItem();
        jMenuItemPropietario = new javax.swing.JMenuItem();
        jMenuItemReboque = new javax.swing.JMenuItem();
        jMenuResponsavelPagamento = new javax.swing.JMenuItem();
        jMenuItemFornecedorVale = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSeguradora = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuMovimentacao = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuUtilitarios = new javax.swing.JMenu();
        jMenuAtualizaTabela = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("MDFe");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPnlPrincipal.setLayout(new java.awt.BorderLayout());

        jPnlNorte.setLayout(new java.awt.GridLayout(1, 0));

        jToolBar.setRollover(true);

        BtnCadEmitente.setBackground(new java.awt.Color(255, 255, 255));
        BtnCadEmitente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro_emitente.png"))); // NOI18N
        BtnCadEmitente.setToolTipText("Cadastro de Emitentes");
        BtnCadEmitente.setFocusable(false);
        BtnCadEmitente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCadEmitente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCadEmitente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCadEmitenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCadEmitenteMouseExited(evt);
            }
        });
        BtnCadEmitente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadEmitenteActionPerformed(evt);
            }
        });
        jToolBar.add(BtnCadEmitente);

        BtnCadVeiculo.setBackground(new java.awt.Color(255, 255, 255));
        BtnCadVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro_veiculos.png"))); // NOI18N
        BtnCadVeiculo.setToolTipText("Cadastro de Veículos");
        BtnCadVeiculo.setFocusable(false);
        BtnCadVeiculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCadVeiculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCadVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCadVeiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCadVeiculoMouseExited(evt);
            }
        });
        BtnCadVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadVeiculoActionPerformed(evt);
            }
        });
        jToolBar.add(BtnCadVeiculo);

        jBtCadEmbarcacao.setBackground(new java.awt.Color(255, 255, 255));
        jBtCadEmbarcacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro_embarcação.png"))); // NOI18N
        jBtCadEmbarcacao.setToolTipText("Cadastro de Embarcações");
        jBtCadEmbarcacao.setFocusable(false);
        jBtCadEmbarcacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtCadEmbarcacao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtCadEmbarcacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtCadEmbarcacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtCadEmbarcacaoMouseExited(evt);
            }
        });
        jBtCadEmbarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCadEmbarcacaoActionPerformed(evt);
            }
        });
        jToolBar.add(jBtCadEmbarcacao);

        jBtCadCondutor.setBackground(new java.awt.Color(255, 255, 255));
        jBtCadCondutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro_condutores.png"))); // NOI18N
        jBtCadCondutor.setToolTipText("Cadastro de Condutores");
        jBtCadCondutor.setFocusable(false);
        jBtCadCondutor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtCadCondutor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtCadCondutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtCadCondutorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtCadCondutorMouseExited(evt);
            }
        });
        jBtCadCondutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCadCondutorActionPerformed(evt);
            }
        });
        jToolBar.add(jBtCadCondutor);

        BtnCadReboque.setBackground(new java.awt.Color(255, 255, 255));
        BtnCadReboque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/reboque.png"))); // NOI18N
        BtnCadReboque.setToolTipText("Cadastro de Reboques");
        BtnCadReboque.setFocusable(false);
        BtnCadReboque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCadReboque.setPreferredSize(new java.awt.Dimension(38, 40));
        BtnCadReboque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCadReboque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCadReboqueMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCadReboqueMouseEntered(evt);
            }
        });
        BtnCadReboque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadReboqueActionPerformed(evt);
            }
        });
        jToolBar.add(BtnCadReboque);

        BtnEmissaoMDFe.setBackground(new java.awt.Color(255, 255, 255));
        BtnEmissaoMDFe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mdfe_dentro.png"))); // NOI18N
        BtnEmissaoMDFe.setToolTipText("Emissão de MDFe");
        BtnEmissaoMDFe.setFocusable(false);
        BtnEmissaoMDFe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEmissaoMDFe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEmissaoMDFe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnEmissaoMDFeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnEmissaoMDFeMouseExited(evt);
            }
        });
        BtnEmissaoMDFe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEmissaoMDFeActionPerformed(evt);
            }
        });
        jToolBar.add(BtnEmissaoMDFe);

        jBtConfiguracaoSistemaLocal.setBackground(new java.awt.Color(255, 255, 255));
        jBtConfiguracaoSistemaLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Configuração de Sistemas Local.png"))); // NOI18N
        jBtConfiguracaoSistemaLocal.setToolTipText("Configuração do Sistema Local");
        jBtConfiguracaoSistemaLocal.setFocusable(false);
        jBtConfiguracaoSistemaLocal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtConfiguracaoSistemaLocal.setPreferredSize(new java.awt.Dimension(44, 44));
        jBtConfiguracaoSistemaLocal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtConfiguracaoSistemaLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtConfiguracaoSistemaLocalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtConfiguracaoSistemaLocalMouseExited(evt);
            }
        });
        jBtConfiguracaoSistemaLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtConfiguracaoSistemaLocalActionPerformed(evt);
            }
        });
        jToolBar.add(jBtConfiguracaoSistemaLocal);

        btHabDesab.setBackground(new java.awt.Color(255, 255, 255));
        btHabDesab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Habilitar-Desabilitar.png"))); // NOI18N
        btHabDesab.setEnabled(false);
        btHabDesab.setFocusable(false);
        btHabDesab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btHabDesab.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btHabDesab);

        jBtSairSistema.setBackground(new java.awt.Color(255, 255, 255));
        jBtSairSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sair do Sistema.png"))); // NOI18N
        jBtSairSistema.setToolTipText("Sair do Sistema");
        jBtSairSistema.setEnabled(false);
        jBtSairSistema.setFocusable(false);
        jBtSairSistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtSairSistema.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtSairSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtSairSistemaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtSairSistemaMouseEntered(evt);
            }
        });
        jToolBar.add(jBtSairSistema);

        jPnlNorte.add(jToolBar);

        jPnlPrincipal.add(jPnlNorte, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 933, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPnlCentroLayout = new javax.swing.GroupLayout(jPnlCentro);
        jPnlCentro.setLayout(jPnlCentroLayout);
        jPnlCentroLayout.setHorizontalGroup(
            jPnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPnlCentroLayout.setVerticalGroup(
            jPnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlCentroLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane)
                .addGap(0, 0, 0))
        );

        jPnlPrincipal.add(jPnlCentro, java.awt.BorderLayout.CENTER);

        jPnlSul.setLayout(new java.awt.GridLayout(1, 4));

        jPnlInformacao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPnlInformacao.setPreferredSize(new java.awt.Dimension(0, 25));
        jPnlInformacao.setLayout(null);

        jLblTootTip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPnlInformacao.add(jLblTootTip);
        jLblTootTip.setBounds(10, 4, 340, 15);

        jPnlSul.add(jPnlInformacao);

        jPnlUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPnlUsuario.setPreferredSize(new java.awt.Dimension(0, 25));

        jLblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblUsuario.setText("jLabel3");

        javax.swing.GroupLayout jPnlUsuarioLayout = new javax.swing.GroupLayout(jPnlUsuario);
        jPnlUsuario.setLayout(jPnlUsuarioLayout);
        jPnlUsuarioLayout.setHorizontalGroup(
            jPnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlUsuarioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPnlUsuarioLayout.setVerticalGroup(
            jPnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlUsuarioLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLblUsuario))
        );

        jPnlSul.add(jPnlUsuario);

        jPnlData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPnlData.setPreferredSize(new java.awt.Dimension(0, 25));
        jPnlData.setLayout(new java.awt.BorderLayout());

        jLblData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblData.setText("30/10/2016");
        jLblData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPnlData.add(jLblData, java.awt.BorderLayout.CENTER);

        jPnlSul.add(jPnlData);

        jPnlHoras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPnlHoras.setPreferredSize(new java.awt.Dimension(0, 25));
        jPnlHoras.setLayout(new java.awt.BorderLayout());

        jLblHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblHora.setText("12:30:12");
        jPnlHoras.add(jLblHora, java.awt.BorderLayout.CENTER);

        jPnlSul.add(jPnlHoras);

        jPnlPrincipal.add(jPnlSul, java.awt.BorderLayout.SOUTH);

        jMenuItemUn.setText(" Cadastro");

        jMenuItemEmitente.setText("Emitente");
        jMenuItemEmitente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmitenteActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemEmitente);
        jMenuItemUn.add(jSeparator1);

        jMenuItemEmbarcacao.setText("Embarcação");
        jMenuItemEmbarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmbarcacaoActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemEmbarcacao);

        jMenuItemPorto.setText("Porto");
        jMenuItemPorto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPortoActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemPorto);

        jMenuItemBalsa.setText("Balsa");
        jMenuItemBalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBalsaActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemBalsa);

        jMenuItemTerminalCarregamento.setText("Terminal de Carregamento");
        jMenuItemTerminalCarregamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTerminalCarregamentoActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemTerminalCarregamento);

        jMenuItemTerminalDescarregamento.setText("Terminal de Descarregamento");
        jMenuItemTerminalDescarregamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTerminalDescarregamentoActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemTerminalDescarregamento);

        jMenuItemUnidadesDeCargas.setText("Unidades de Cargas Vazias");
        jMenuItemUnidadesDeCargas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUnidadesDeCargasActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemUnidadesDeCargas);

        jMenuItemUnidadesDeTrans.setText("Unidades de Transportes Vazias");
        jMenuItemUnidadesDeTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUnidadesDeTransActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemUnidadesDeTrans);
        jMenuItemUn.add(jSeparator2);

        jMenuItemVeiculos.setText("Veículos");
        jMenuItemVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVeiculosActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemVeiculos);

        jMenuItemCondutores.setText("Condutores");
        jMenuItemCondutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCondutoresActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemCondutores);

        jMenuItemContratante.setText("Contratantes");
        jMenuItemContratante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemContratanteActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemContratante);

        jMenuItemPropietario.setText("Proprietários");
        jMenuItemPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPropietarioActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemPropietario);

        jMenuItemReboque.setText("Reboque");
        jMenuItemReboque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReboqueActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemReboque);

        jMenuResponsavelPagamento.setText("Responsável por Pagamento de Vale");
        jMenuResponsavelPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuResponsavelPagamentoActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuResponsavelPagamento);

        jMenuItemFornecedorVale.setText("Fornecedor de Vale");
        jMenuItemFornecedorVale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFornecedorValeActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemFornecedorVale);
        jMenuItemUn.add(jSeparator3);

        jMenuItemSeguradora.setText("Empresa Seguradora");
        jMenuItemSeguradora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSeguradoraActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemSeguradora);
        jMenuItemUn.add(jSeparator4);

        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit_icon.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuItemUn.add(jMenuItemSair);

        jMenuBar.add(jMenuItemUn);

        jMenuMovimentacao.setText(" Movimentações");

        jMenuItem2.setText("Gerenciar MDFe");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuMovimentacao.add(jMenuItem2);

        jMenuBar.add(jMenuMovimentacao);

        jMenuRelatorio.setText(" Relatórios");
        jMenuBar.add(jMenuRelatorio);

        jMenuUtilitarios.setText(" Utilitários");

        jMenuAtualizaTabela.setText("Atualizar Tabela");
        jMenuAtualizaTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAtualizaTabelaActionPerformed(evt);
            }
        });
        jMenuUtilitarios.add(jMenuAtualizaTabela);

        jMenuBar.add(jMenuUtilitarios);

        jMenuAjuda.setText(" Ajuda");
        jMenuBar.add(jMenuAjuda);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVeiculosActionPerformed
        try {
            MostrarTela(new TelaVeiculo());
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemVeiculosActionPerformed

    private void jMenuItemCondutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCondutoresActionPerformed
        try {
            MostrarTela(new TelaProfissionais());
        } catch (ParseException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemCondutoresActionPerformed

    private void jMenuItemEmitenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmitenteActionPerformed
        MostrarTela(new TelaEmitente());
    }//GEN-LAST:event_jMenuItemEmitenteActionPerformed

    private void BtnCadVeiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCadVeiculoMouseEntered
        //Adiciona o tooltiptext do botão na JLabel
        jLblTootTip.setText(BtnCadVeiculo.getToolTipText());
    }//GEN-LAST:event_BtnCadVeiculoMouseEntered

    private void BtnCadVeiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCadVeiculoMouseExited
        //Apaga o texto da JLabel
        jLblTootTip.setText("");
    }//GEN-LAST:event_BtnCadVeiculoMouseExited

    private void BtnCadReboqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCadReboqueMouseEntered
        //Adiciona o tooltiptext do botão na JLabel
        jLblTootTip.setText(BtnCadReboque.getToolTipText());
    }//GEN-LAST:event_BtnCadReboqueMouseEntered

    private void BtnEmissaoMDFeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEmissaoMDFeMouseEntered
        //Adiciona o tooltiptext do botão na JLabel
        jLblTootTip.setText(BtnEmissaoMDFe.getToolTipText());
    }//GEN-LAST:event_BtnEmissaoMDFeMouseEntered

    private void BtnCadReboqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCadReboqueMouseExited
        //Apaga o texto da JLabel
        jLblTootTip.setText("");
    }//GEN-LAST:event_BtnCadReboqueMouseExited

    private void BtnEmissaoMDFeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEmissaoMDFeMouseExited
        //Apaga o texto da JLabel
        jLblTootTip.setText("");
    }//GEN-LAST:event_BtnEmissaoMDFeMouseExited

    private void jBtConfiguracaoSistemaLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtConfiguracaoSistemaLocalActionPerformed
       
    }//GEN-LAST:event_jBtConfiguracaoSistemaLocalActionPerformed

    private void jBtConfiguracaoSistemaLocalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtConfiguracaoSistemaLocalMouseEntered
        //Adiciona o tooltiptext do botão na JLabel
        jLblTootTip.setText(jBtConfiguracaoSistemaLocal.getToolTipText());
    }//GEN-LAST:event_jBtConfiguracaoSistemaLocalMouseEntered

    private void jBtConfiguracaoSistemaLocalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtConfiguracaoSistemaLocalMouseExited
        //Apaga o texto da JLabel
        jLblTootTip.setText("");
    }//GEN-LAST:event_jBtConfiguracaoSistemaLocalMouseExited

    private void jBtSairSistemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtSairSistemaMouseEntered
        //Adiciona o tooltiptext do botão na JLabel
        jLblTootTip.setText(jBtSairSistema.getToolTipText());
    }//GEN-LAST:event_jBtSairSistemaMouseEntered

    private void jBtSairSistemaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtSairSistemaMouseExited
        //Apaga o texto da JLabel
        jLblTootTip.setText("");
    }//GEN-LAST:event_jBtSairSistemaMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Confirma se o usuario quer sair do sistema
        Integer option = JOptionPane.showConfirmDialog(null, "Sair do Sistema?", "Confirmação", JOptionPane.YES_NO_OPTION);
        //Se sim, pergunta se quer fazer o backup da base de dados
        if (option == JOptionPane.YES_OPTION) {
            option = JOptionPane.showConfirmDialog(null, "Deseja Fazer Backup do Banco de Dados?", "Confirmação", JOptionPane.YES_NO_OPTION);
            //Se sim, realiza o backup e fecha o programa
            if (option == JOptionPane.YES_OPTION) {
                //Pega a data e hora atual e nomeia em uma variavel
                String DataAtual = new SimpleDateFormat("dd/MM/yyyyHH:mm:ss").format(new Timestamp(System.currentTimeMillis())).trim().replaceAll("[/:]", "");
                //Verifica qual banco está sendo usado
                if (Conectar.Banco.equals("F")) {
                    try {
                        //Faz o backup do banco firebird
                        Scanner s = new Scanner(Runtime.getRuntime().exec("C:\\InterageSE\\GDBs\\gbak.exe -user SYSDBA -pas masterkey  C:\\InterageSE\\Dados\\INTEGRADO.GDB C:\\InterageSE\\Dados\\" + DataAtual + ".GBK").getInputStream());
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                    }
                } else if (Conectar.Banco.equals("P")) {
                    try{
                        //Faz o backup postgre
                        List<String> comandos = new ArrayList<String>();
                        //Passa os comandos para fazer o backup em um arraylist
                        comandos.add("C:\\InterageSE\\GDBs\\pg_dump.exe"); //Local do pg_dump
                        comandos.add("-h");
                        comandos.add("localhost"); //host do banco
                        comandos.add("-p");
                        comandos.add("5432"); //Porta do banco
                        comandos.add("-U");
                        comandos.add("postgres"); //Nome do usuário
                        comandos.add("-F");
                        comandos.add("c");
                        comandos.add("-b");
                        comandos.add("-v");
                        comandos.add("-f");
                        comandos.add("C:\\interageSE\\Dados\\"+ DataAtual +".backup"); //Local onde será gerado o backup
                        comandos.add("integrado"); //Nome do bando de  dados
                        //Passa os comandos para um construtor de processos
                        ProcessBuilder pb = new ProcessBuilder(comandos);
                        //Inicia o comando
                        Process p = pb.start();
                        //Faz um buffer para ler a saída dos comandos
                        BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()));
                        //Ler a linhas enquanto for diferente de nulo
                        String linha = br.readLine();
                        while(linha != null){
                            System.err.println(linha);
                            linha = br.readLine();
                        }
                        p.waitFor();
                        p.destroy();
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                    }
                }
            }
            //Senao, apenas fecha o programa 
            System.exit(0);
        }
        
    }//GEN-LAST:event_formWindowClosing

    private void jBtCadCondutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCadCondutorActionPerformed
        try {
            MostrarTela(new TelaProfissionais());
        } catch (ParseException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtCadCondutorActionPerformed

    private void jBtCadCondutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtCadCondutorMouseExited
        //Apaga o texto da JLabel
        jLblTootTip.setText("");
    }//GEN-LAST:event_jBtCadCondutorMouseExited

    private void jBtCadCondutorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtCadCondutorMouseEntered
        //Adiciona o tooltiptext do botão na JLabel
        jLblTootTip.setText(jBtCadCondutor.getToolTipText());
    }//GEN-LAST:event_jBtCadCondutorMouseEntered

    private void jBtCadEmbarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCadEmbarcacaoActionPerformed
        MostrarTela(new TelaEmbarcacao());
    }//GEN-LAST:event_jBtCadEmbarcacaoActionPerformed

    private void jBtCadEmbarcacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtCadEmbarcacaoMouseExited
        //Apaga o texto da JLabel
        jLblTootTip.setText("");
    }//GEN-LAST:event_jBtCadEmbarcacaoMouseExited

    private void jBtCadEmbarcacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtCadEmbarcacaoMouseEntered
        //Adiciona o tooltiptext do botão na JLabel
        jLblTootTip.setText(jBtCadEmbarcacao.getToolTipText());
    }//GEN-LAST:event_jBtCadEmbarcacaoMouseEntered

    private void BtnCadEmitenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadEmitenteActionPerformed
        MostrarTela(new TelaEmitente());
    }//GEN-LAST:event_BtnCadEmitenteActionPerformed

    private void BtnCadEmitenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCadEmitenteMouseExited
        //Apaga o texto da JLabel
        jLblTootTip.setText("");
    }//GEN-LAST:event_BtnCadEmitenteMouseExited

    private void BtnCadEmitenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCadEmitenteMouseEntered
        //Adiciona o tooltiptext do botão na JLabel
        jLblTootTip.setText(BtnCadEmitente.getToolTipText());
    }//GEN-LAST:event_BtnCadEmitenteMouseEntered

    private void jMenuItemEmbarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmbarcacaoActionPerformed
        MostrarTela(new TelaEmbarcacao());
    }//GEN-LAST:event_jMenuItemEmbarcacaoActionPerformed

    private void jMenuItemTerminalCarregamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTerminalCarregamentoActionPerformed
        MostrarTela(new TelaTerminalCarregamento());
    }//GEN-LAST:event_jMenuItemTerminalCarregamentoActionPerformed

    private void jMenuItemTerminalDescarregamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTerminalDescarregamentoActionPerformed
        MostrarTela(new TelaTerminalDescarregamento());
    }//GEN-LAST:event_jMenuItemTerminalDescarregamentoActionPerformed

    private void jMenuItemUnidadesDeCargasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUnidadesDeCargasActionPerformed
        MostrarTela(new TelaUnidadeCargaVazia());
    }//GEN-LAST:event_jMenuItemUnidadesDeCargasActionPerformed

    private void jMenuItemPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPropietarioActionPerformed
        try {
            MostrarTela(new TelaProprietario());
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemPropietarioActionPerformed

    private void BtnCadVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadVeiculoActionPerformed
        try {
            MostrarTela(new TelaVeiculo());
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCadVeiculoActionPerformed

    private void BtnCadReboqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadReboqueActionPerformed
        try {
            MostrarTela(new TelaReboque());
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCadReboqueActionPerformed

    private void jMenuItemFornecedorValeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFornecedorValeActionPerformed
        try {
            MostrarTela(new TelaForVale());
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemFornecedorValeActionPerformed

    private void jMenuItemReboqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReboqueActionPerformed
        try {
            MostrarTela(new TelaReboque());
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemReboqueActionPerformed

    private void jMenuResponsavelPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuResponsavelPagamentoActionPerformed
        try {
            MostrarTela(new TelaResponsavelPagamento());
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuResponsavelPagamentoActionPerformed

    private void jMenuAtualizaTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAtualizaTabelaActionPerformed
         // TODO add your handling code here:
         util.AtualizaTabelas();
         
    }//GEN-LAST:event_jMenuAtualizaTabelaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        TelaMovimentacao.getInstancia().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void BtnEmissaoMDFeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEmissaoMDFeActionPerformed
         TelaMovimentacao.getInstancia().setVisible(true);
    }//GEN-LAST:event_BtnEmissaoMDFeActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        //Confirma se o usuario quer sair do sistema
        Integer option = JOptionPane.showConfirmDialog(null, "Sair do Sistema?", "Confirmação", JOptionPane.YES_NO_OPTION);
        //Se sim, pergunta se quer fazer o backup da base de dados
        if (option == JOptionPane.YES_OPTION) {
            option = JOptionPane.showConfirmDialog(null, "Deseja Fazer Backup do Banco de Dados?", "Confirmação", JOptionPane.YES_NO_OPTION);
            //Se sim, realiza o backup e fecha o programa
            if (option == JOptionPane.YES_OPTION) {
                //Pega a data e hora atual e nomeia em uma variavel
                String DataAtual = new SimpleDateFormat("dd/MM/yyyyHH:mm:ss").format(new Timestamp(System.currentTimeMillis())).trim().replaceAll("[/:]", "");
                //Verifica qual banco está sendo usado
                if (Conectar.Banco.equals("F")) {
                    try {
                        //Faz o backup do banco firebird
                        Scanner s = new Scanner(Runtime.getRuntime().exec("C:\\InterageSE\\GDBs\\gbak.exe -user SYSDBA -pas masterkey  C:\\InterageSE\\Dados\\INTEGRADO.GDB C:\\InterageSE\\Dados\\" + DataAtual + ".GBK").getInputStream());
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                    }
                } else if (Conectar.Banco.equals("P")) {
                    try{
                        //Faz o backup postgre
                        List<String> comandos = new ArrayList<String>();
                        //Passa os comandos para fazer o backup em um arraylist
                        comandos.add("C:\\InterageSE\\GDBs\\pg_dump.exe"); //Local do pg_dump
                        comandos.add("-h");
                        comandos.add("localhost"); //host do banco
                        comandos.add("-p");
                        comandos.add("5432"); //Porta do banco
                        comandos.add("-U");
                        comandos.add("postgres"); //Nome do usuário
                        comandos.add("-F");
                        comandos.add("c");
                        comandos.add("-b");
                        comandos.add("-v");
                        comandos.add("-f");
                        comandos.add("C:\\interageSE\\Dados\\"+ DataAtual +".backup"); //Local onde será gerado o backup
                        comandos.add("integrado"); //Nome do bando de  dados
                        //Passa os comandos para um construtor de processos
                        ProcessBuilder pb = new ProcessBuilder(comandos);
                        //Inicia o comando
                        Process p = pb.start();
                        //Faz um buffer para ler a saída dos comandos
                        BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()));
                        //Ler a linhas enquanto for diferente de nulo
                        String linha = br.readLine();
                        while(linha != null){
                            System.err.println(linha);
                            linha = br.readLine();
                        }
                        p.waitFor();
                        p.destroy();
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                    }
                }
            }
            //Senao, apenas fecha o programa 
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemSairActionPerformed

  private void jMenuItemPortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPortoActionPerformed
    // TODO add your handling code here:
    MostrarTela(new TelaPorto());
  }//GEN-LAST:event_jMenuItemPortoActionPerformed

  private void jMenuItemBalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBalsaActionPerformed
    // TODO add your handling code here:
    MostrarTela(new TelaBalsa());
  }//GEN-LAST:event_jMenuItemBalsaActionPerformed

    private void jMenuItemContratanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemContratanteActionPerformed
        MostrarTela(new TelaContratante());
    }//GEN-LAST:event_jMenuItemContratanteActionPerformed

    private void jMenuItemUnidadesDeTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUnidadesDeTransActionPerformed
        MostrarTela(new TelaUnidadeTransVazia());
    }//GEN-LAST:event_jMenuItemUnidadesDeTransActionPerformed

    private void jMenuItemSeguradoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSeguradoraActionPerformed
        MostrarTela(new TelaSeguradora());
    }//GEN-LAST:event_jMenuItemSeguradoraActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            /**/
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadEmitente;
    private javax.swing.JButton BtnCadReboque;
    private javax.swing.JButton BtnCadVeiculo;
    private javax.swing.JButton BtnEmissaoMDFe;
    private javax.swing.JButton btHabDesab;
    private javax.swing.JButton jBtCadCondutor;
    private javax.swing.JButton jBtCadEmbarcacao;
    private javax.swing.JButton jBtConfiguracaoSistemaLocal;
    private javax.swing.JButton jBtSairSistema;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLblData;
    private javax.swing.JLabel jLblHora;
    private javax.swing.JLabel jLblTootTip;
    private javax.swing.JLabel jLblUsuario;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuItem jMenuAtualizaTabela;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemBalsa;
    private javax.swing.JMenuItem jMenuItemCondutores;
    private javax.swing.JMenuItem jMenuItemContratante;
    private javax.swing.JMenuItem jMenuItemEmbarcacao;
    private javax.swing.JMenuItem jMenuItemEmitente;
    private javax.swing.JMenuItem jMenuItemFornecedorVale;
    private javax.swing.JMenuItem jMenuItemPorto;
    private javax.swing.JMenuItem jMenuItemPropietario;
    private javax.swing.JMenuItem jMenuItemReboque;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSeguradora;
    private javax.swing.JMenuItem jMenuItemTerminalCarregamento;
    private javax.swing.JMenuItem jMenuItemTerminalDescarregamento;
    private javax.swing.JMenu jMenuItemUn;
    private javax.swing.JMenuItem jMenuItemUnidadesDeCargas;
    private javax.swing.JMenuItem jMenuItemUnidadesDeTrans;
    private javax.swing.JMenuItem jMenuItemVeiculos;
    private javax.swing.JMenu jMenuMovimentacao;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenuItem jMenuResponsavelPagamento;
    private javax.swing.JMenu jMenuUtilitarios;
    private javax.swing.JPanel jPnlCentro;
    private javax.swing.JPanel jPnlData;
    private javax.swing.JPanel jPnlHoras;
    private javax.swing.JPanel jPnlInformacao;
    private javax.swing.JPanel jPnlNorte;
    private javax.swing.JPanel jPnlPrincipal;
    private javax.swing.JPanel jPnlSul;
    private javax.swing.JPanel jPnlUsuario;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar;
    // End of variables declaration//GEN-END:variables

    public void DefinirFormulario(){
        //Define o tamanho mínimo que o jFrame pode assumir
        setMinimumSize(new Dimension(800, 600));
        //Maximiza a tela
        setExtendedState(TelaPrincipal.MAXIMIZED_BOTH);       
        //Foca a tela automaticamente quando é mostrada
        setAutoRequestFocus(true);
        
        //Seta o icone da tela do formulario
        setIconImage(new ImageIcon(getClass().getResource("/imagens/mdfeIcone.png")).getImage());
        
        // Seta a getNome da classe tabusu na Jlabel
        jLblUsuario.setText("Usuário: " + tabusu.getNome());    
        
        //getContentPane().setLayout(new GridBagLayout());
        
        //Ativa o timer do relógio
        Timer();                                                                 
        
        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");               //Cria a máscara da data
        String DataDia = dtf.format(new Date());                                 //Pega o dia atual do sistema
        jLblData.setText(DataDia);                                               //Seta o dia mascarado no JLabel
        
        //Define a tecla de atalho dos menus
        jMenuItemUn.setMnemonic(KeyEvent.VK_C);
        jMenuItemEmitente.setMnemonic(KeyEvent.VK_E);
        jMenuItemVeiculos.setMnemonic(KeyEvent.VK_I);
        jMenuItemEmbarcacao.setMnemonic(KeyEvent.VK_M);
        jMenuItemCondutores.setMnemonic(KeyEvent.VK_O);
        jMenuItemPropietario.setMnemonic(KeyEvent.VK_P);
        jMenuItemFornecedorVale.setMnemonic(KeyEvent.VK_V);
        jMenuItemTerminalCarregamento.setMnemonic(KeyEvent.VK_C);
        jMenuItemTerminalDescarregamento.setMnemonic(KeyEvent.VK_D);
        jMenuItemUnidadesDeCargas.setMnemonic(KeyEvent.VK_U);
        jMenuItemSair.setMnemonic(KeyEvent.VK_S);
        
        jMenuMovimentacao.setMnemonic(KeyEvent.VK_M);
        
        jMenuRelatorio.setMnemonic(KeyEvent.VK_R);
        
        jMenuUtilitarios.setMnemonic(KeyEvent.VK_U);
        jMenuAjuda.setMnemonic(KeyEvent.VK_A);
        
        //Define as teclas de atalho dos itens de menu
        jMenuItemEmitente.setMnemonic(KeyEvent.VK_L);
        
        
        //Seta os atalhos dos item de menu do menu listagens
        
        jMenuMovimentacao.setEnabled(true);
        jMenuRelatorio.setEnabled(true);
        jMenuUtilitarios.setEnabled(true);
        jMenuAjuda.setEnabled(true);
        
        //jMenuBar.getAccessibleContext().;
    }
    
    //Método para Inserir os InternalFrame no DesktopPane
    public void MostrarTela(JInternalFrame tela){
        if (VerificarTela(tela) == true) {
            tela.setMaximizable(true);
            //Habilita o fechamento da Tela
            tela.setClosable(true);
            //Adiciona ao DesktopPane
            jDesktopPane.add(tela);
            //Seta o icone do jInternalFrame
            tela.setFrameIcon(new ImageIcon(this.getClass().getResource("/imagens/mdfe2.png")));
            //Mostra a tela
            tela.setVisible(true);
            
            try {
                tela.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Centraliza a tela
            CentralizaTela(tela);
        }
    }
    
    //Não deixa duas internalFrame iguais serem exibidas ao mesmo tempo
    public boolean VerificarTela(JInternalFrame frame){
        Boolean MostrarTela = true;
        //Pega todas as telas do jDesktopPane
        JInternalFrame[] telas = jDesktopPane.getAllFrames();
        //Dá um loop com a quantidade de telas
        for (int i = 0; i < telas.length; i++) {
            //Compara o nome do titulo da tela com as que já estao no desktoppane
            if(telas[i].getTitle().equals(frame.getTitle())){
                //Se for igual, retorna false
                MostrarTela = false;
                break;
            }else{
                //Se for diferente, retorna verdadeiro
                MostrarTela = true;
            }
        }
        
        return MostrarTela;
    } 
    
    public void Timer() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //Formata a hora
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");       
                //Pega a hora atual do sistema
                Date hora = Calendar.getInstance().getTime();       
                //Formata a String com a mascara da hora
                horaFormatadaSistema = sdf.format(hora);                         
                //Seta a label com a hora formatada"
                jLblHora.setText(horaFormatadaSistema);                          
            }
        }, 1, 1000);
    }
    
    //Metodo para centralizar o jinternalframe
    public void CentralizaTela(JInternalFrame tela) {
        Dimension d = jDesktopPane.getSize();
        tela.setLocation((d.width - tela.getSize().width) / 2, (d.height - tela.getSize().height) / 2);
    }
    /*
    //Verifica se a permissao de cadastro para cada item de menu
    //Se o usuarion nao possuir permisssao, o item nao será mostrado
    public void VerificarPermissaoCadastro(){
        try{
            Conectar.ConectarBD();
            if(VerificarPermissao("01", tabusu.getCodigo()) == false){
                jMenuCadastro.setVisible(false);
            }
            
            if(VerificarPermissao("01.01", tabusu.getCodigo()) == false){
                jMenuItemFiliais.setVisible(false);
            }
            
            if(VerificarPermissao("01.02", tabusu.getCodigo()) == false){
                jMenuItemProdutos.setVisible(false);
                jBtCadProdutos.setVisible(false);
            }
            
            if(VerificarPermissao("01.03", tabusu.getCodigo()) == false){
                jMenuItemFabricantes.setVisible(false);
            }
            
            if(VerificarPermissao("01.04", tabusu.getCodigo()) == false){
                jMenuItemGrupos.setVisible(false);
            }
            
            if(VerificarPermissao("01.05", tabusu.getCodigo()) == false){
                jMenuItemTabelaDePreco.setVisible(false);
            }
            
            if(VerificarPermissao("01.06", tabusu.getCodigo()) == false){
                jMenuItemClientes.setVisible(false);
                jBtCadClientes.setVisible(false);
            }
            
            if(VerificarPermissao("01.07", tabusu.getCodigo()) == false){
                jMenuItemLocaisDeRecebimento.setVisible(false);
            }
            
            if(VerificarPermissao("01.08", tabusu.getCodigo()) == false){
                jMenuItemSetores.setVisible(false);
            }
            
            if(VerificarPermissao("01.09", tabusu.getCodigo()) == false){
                jMenuItemRedeDeClientes.setVisible(false);
            }
            
            if(VerificarPermissao("01.10", tabusu.getCodigo()) == false){
                jMenuItemRamoDeAtividade.setVisible(false);
            }
            
            if(VerificarPermissao("01.11", tabusu.getCodigo()) == false){
                jMenuItemVendedores.setVisible(false);
            }
            
            if(VerificarPermissao("01.12", tabusu.getCodigo()) == false){
                jMenuItemFornecedores.setVisible(false);
                jBtCadFornecedores.setVisible(false);
            }
            
            if(VerificarPermissao("01.13", tabusu.getCodigo()) == false){
                jMenuItemLocaisDePagamento.setVisible(false);
            }
            
            if(VerificarPermissao("01.14", tabusu.getCodigo()) == false){
                jMenuItemProfissionais.setVisible(false);
            }
            
            if(VerificarPermissao("01.15", tabusu.getCodigo()) == false){
                //jMenuItems.setVisible(false);
            }
            
            if(VerificarPermissao("01.16", tabusu.getCodigo()) == false){
                jMenuItemCfop.setVisible(false);
            }
            
            if(VerificarPermissao("01.17", tabusu.getCodigo()) == false){
                jMenuItemFormasDePagamento.setVisible(false);
            }
            
            if(VerificarPermissao("01.18", tabusu.getCodigo()) == false){
                jMenuItemPlanoDePagamento.setVisible(false);
            }
            
            if(VerificarPermissao("01.19", tabusu.getCodigo()) == false){
                jMenuListagem.setVisible(true);
            }
            
            if(VerificarPermissao("01.19.01", tabusu.getCodigo()) == false){
                jMenuItemListagemFilial.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.02", tabusu.getCodigo()) == false){
                jMenuItemListagemProdutoVenc.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.03", tabusu.getCodigo()) == false){
                jMenuItemListagemPrecoProduto.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.04", tabusu.getCodigo()) == false){
                jMenuItemListagemFabricantes.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.05", tabusu.getCodigo()) == false){
                jMenuItemListagemGrupos.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.06", tabusu.getCodigo()) == false){
                jMenuItemListagemTabPreco.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.07", tabusu.getCodigo()) == false){
                jMenuListagemClientes.setVisible(false);
            }else{
                if(VerificarPermissao("01.19.07.01", tabusu.getCodigo()) == false){
                    jMenuItemListagemClientes.setVisible(false);
                }
                
                if(VerificarPermissao("01.19.07.02", tabusu.getCodigo()) == false){
                    jMenuItemListagemClienteSemMovimento.setVisible(false);
                }
            }
            
            if(VerificarPermissao("01.19.08", tabusu.getCodigo()) == false){
                jMenuItemListagemLocaisRecebimento.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.09", tabusu.getCodigo()) == false){
                jMenuItemListagemSetores.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.10", tabusu.getCodigo()) == false){
                jMenuItemListagemRedeClientes.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.11", tabusu.getCodigo()) == false){
                jMenuItemListagemRamoAtividade.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.12", tabusu.getCodigo()) == false){
                jMenuItemListagemVendedor.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.13", tabusu.getCodigo()) == false){
                jMenuListagemFornecedores.setVisible(false);
            }else{
                if(VerificarPermissao("01.19.13.01", tabusu.getCodigo()) == false){
                    jMenuItemListagemFornecedor.setVisible(false);
                }
                
                if(VerificarPermissao("01.19.13.02", tabusu.getCodigo()) == false){
                    jMenuItemListagemFornecedorSemMovimento.setVisible(false);
                }
            }
            
            if(VerificarPermissao("01.19.14", tabusu.getCodigo()) == false){
                jMenuItemListagemLocaisDePagamento.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.15", tabusu.getCodigo()) == false){
                jMenuItemListagemProfissionais.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.16", tabusu.getCodigo()) == false){
                jMenuItemListagemBensCliente.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.19", tabusu.getCodigo()) == false){
                jMenuItemListagemDepartamento.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.20", tabusu.getCodigo()) == false){
                jMenuItemListagemSecao.setVisible(false);
            }
            
            if(VerificarPermissao("01.19.21", tabusu.getCodigo()) == false){
                jMenuItemListagemProdutoEstoqueMax.setVisible(false);
            }
            
            if(VerificarPermissao("01.20", tabusu.getCodigo()) == false){
                jMenuItemDepartamento.setVisible(false);
            }
            
            if(VerificarPermissao("01.21", tabusu.getCodigo()) == false){
                jMenuItemFamiliaColecaoDisciplina.setVisible(false);
            }
            
            if(VerificarPermissao("01.22", tabusu.getCodigo()) == false){
                jMenuItemAlunoSerie.setVisible(false);
            }
            
            if(VerificarPermissao("01.23", tabusu.getCodigo()) == false){
                jMenuItemAutorSabor.setVisible(false);
            }
            
            if(VerificarPermissao("01.24", tabusu.getCodigo()) == false){
                jMenuItemVeiculos.setVisible(false);
            }
            
            if(VerificarPermissao("01.25", tabusu.getCodigo()) == false){
                jMenuItemRotaDeEntrega.setVisible(false);
            }
            
            if(VerificarPermissao("01.26", tabusu.getCodigo()) == false){
                jMenuItemOperadorasDeCartao.setVisible(false);
            }
            
            if(VerificarPermissao("01.27", tabusu.getCodigo()) == false){
                jMenuItemHistoricoDeAjuste.setVisible(false);
            }
            
            if(VerificarPermissao("01.28", tabusu.getCodigo()) == false){
                jMenuItemModelos.setVisible(false);
            }
            
            if(VerificarPermissao("01.29", tabusu.getCodigo()) == false){
                jMenuItemPaises.setVisible(false);
            }
            
            if(VerificarPermissao("01.30", tabusu.getCodigo()) == false){
                jMenuItemEstados.setVisible(false);
            }
            
            if(VerificarPermissao("01.31", tabusu.getCodigo()) == false){
                jMenuItemMunicipios.setVisible(false);
            }
            
            if(VerificarPermissao("01.32", tabusu.getCodigo()) == false){
                jMenuItemNcm.setVisible(false);
                jMenuItemNbs.setVisible(false);
                jMenuItemLc116.setVisible(false);
            }
            
            if(VerificarPermissao("01.33", tabusu.getCodigo()) == false){
                jMenuTabelasNFe.setVisible(false);
            }
            
            if(VerificarPermissao("01.34", tabusu.getCodigo()) == false){
                jMenuItemMedico.setVisible(false);
            }
            
            Conectar.DesconectarBD();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao verificar permissão...\n" + e.getLocalizedMessage());
        }
    }
    */
    //Verifica se possui as permissoes para as operacao '01' de cadastros
    //Retorna verdadeiro se tiver o campus status for sim, senao retorna falso
    public boolean VerificarPermissao(String codop, Integer codusu){
        boolean Status = false;
        try{
            Conectar.result = Conectar.stam.executeQuery("select HABILITA from OPCAOUSU where CODOP = '"+ codop +"' and CODUSU = "+ codusu +" and CODSIS = 1 ");
            while (Conectar.result.next()) {                
                if(Conectar.result.getString("HABILITA").equals("Sim")){
                    Status = true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro...\n" + e.getLocalizedMessage());
        }
       
        return Status;
    }
    
}