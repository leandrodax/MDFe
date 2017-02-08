
package movimentacao;

import ClassesFirebird.InfoCertificadoBean;
import ClassesMDFe.Assina;
import ClassesMDFe.InfoCertificado;
import ClassesMDFe.MDFeRecepcaoEvento;
import ConexaoDB.Conectar;
import Utilitarios.Utilitarios;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class TelaEncerramento extends javax.swing.JDialog {

    InfoCertificado infocert = new InfoCertificado();
    InfoCertificadoBean infobean = new InfoCertificadoBean();
    Utilitarios util                   = new Utilitarios();
    Assina assina = new Assina();
    static String sXML = "";
    static String sCHAVE = "";
    static String sPROTOCOLO = "";
    static String sCAM_CERT = "";
    static String sSENHA_CERT = "";
    static String sCNPJ = "";
    static String sDH_ENC = "";
    static String sDT_ENC = "";
    static String sCOD_MUN = "";
    static String sCOD_UF = "";
    static String ValorXml = "";
    static String cStat = "";
    
    public TelaEncerramento() {
        initComponents();
        DefinirFormulario();
        CarregaComboBoxDados();
    }
    
    public TelaEncerramento(String chave, String protocolo, String camCert, String senhaCert, String cnpj) {
        initComponents();
        DefinirFormulario();
        CarregaComboBoxDados();
        
        Verifica_Existe_Pasta_MDFe_Assinada();
        
        sDH_ENC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date()); 
        sDT_ENC = new SimpleDateFormat("yyyy-MM-dd").format(new Date()); 
        sCHAVE = chave;
        sPROTOCOLO = protocolo;
        sCAM_CERT = camCert;
        sSENHA_CERT = senhaCert;
        sCNPJ = cnpj;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlPrincipal = new javax.swing.JPanel();
        jPnlInfo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jCmbBxUfEncerramento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jCmbBxMunicipioEnc = new javax.swing.JComboBox<>();
        jBtCancelar = new javax.swing.JButton();
        jBtEnviar = new javax.swing.JButton();
        jFldNrSequencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFldDataHoraEvento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPnlMensagem = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableRetServidor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPnlInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informações de Encerramento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("*UF de Encerramento");

        jCmbBxUfEncerramento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCmbBxUfEncerramentoItemStateChanged(evt);
            }
        });
        jCmbBxUfEncerramento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCmbBxUfEncerramentoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("*Município de Encerramento");

        jCmbBxMunicipioEnc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCmbBxMunicipioEncKeyPressed(evt);
            }
        });

        jBtCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtCancelar.setText("Cancelar");
        jBtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCancelarActionPerformed(evt);
            }
        });

        jBtEnviar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtEnviar.setText("Enviar");
        jBtEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEnviarActionPerformed(evt);
            }
        });

        jFldNrSequencia.setEditable(false);
        jFldNrSequencia.setBackground(new java.awt.Color(255, 255, 255));
        jFldNrSequencia.setText("01");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nr. Sequencia");

        jFldDataHoraEvento.setEditable(false);
        jFldDataHoraEvento.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Data e Hora do Evento");

        jPnlMensagem.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Resposta do Servidor", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(255, 0, 51))); // NOI18N
        jPnlMensagem.setForeground(new java.awt.Color(255, 51, 51));

        jTableRetServidor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Codigo", "Motivo"
            }
        ){
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            };

        });
        jTableRetServidor.getTableHeader().setResizingAllowed(false);
        jTableRetServidor.getTableHeader().setReorderingAllowed(false);
        jTableRetServidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRetServidorMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableRetServidorMouseReleased(evt);
            }
        });
        jScrollPane6.setViewportView(jTableRetServidor);

        javax.swing.GroupLayout jPnlMensagemLayout = new javax.swing.GroupLayout(jPnlMensagem);
        jPnlMensagem.setLayout(jPnlMensagemLayout);
        jPnlMensagemLayout.setHorizontalGroup(
            jPnlMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        jPnlMensagemLayout.setVerticalGroup(
            jPnlMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPnlInfoLayout = new javax.swing.GroupLayout(jPnlInfo);
        jPnlInfo.setLayout(jPnlInfoLayout);
        jPnlInfoLayout.setHorizontalGroup(
            jPnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnlMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPnlInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jBtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlInfoLayout.createSequentialGroup()
                        .addGroup(jPnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCmbBxUfEncerramento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFldNrSequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlInfoLayout.createSequentialGroup()
                                    .addComponent(jFldDataHoraEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(168, 168, 168))
                                .addComponent(jLabel1)
                                .addComponent(jCmbBxMunicipioEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPnlInfoLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)))))
                .addContainerGap())
        );
        jPnlInfoLayout.setVerticalGroup(
            jPnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlInfoLayout.createSequentialGroup()
                .addGroup(jPnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(0, 0, 0)
                .addGroup(jPnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFldNrSequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFldDataHoraEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(0, 0, 0)
                .addGroup(jPnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCmbBxUfEncerramento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCmbBxMunicipioEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPnlMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPnlPrincipalLayout = new javax.swing.GroupLayout(jPnlPrincipal);
        jPnlPrincipal.setLayout(jPnlPrincipalLayout);
        jPnlPrincipalLayout.setHorizontalGroup(
            jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlPrincipalLayout.createSequentialGroup()
                .addComponent(jPnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPnlPrincipalLayout.setVerticalGroup(
            jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

  private void jBtEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEnviarActionPerformed
      //Deixa a progressbar indeterminada
      // jProgressBar1.setIndeterminate(true);
      //Mosta o painel com o grid e a progressbar
      jPnlMensagem.setVisible(true);
      //Ajusta os componentes ao tamanho da tela
      this.pack();
      //Centraliza a tela
      setLocationRelativeTo(null);
      
      new Thread(new Runnable() {
          @Override
          public void run() {
              if (jCmbBxUfEncerramento.getSelectedIndex() == -1) {
                  JOptionPane.showMessageDialog(null, "Escolha o estado de encerramento!");
                  jCmbBxUfEncerramento.requestFocus();
              } else {

                  try {

                      jBtEnviar.setEnabled(false);
                      
                      jBtCancelar.setEnabled(false);
                      
                      sCOD_UF = BuscaCodUf(jCmbBxUfEncerramento.getSelectedItem().toString());

                      sCOD_MUN = BuscaCodMunicipio(jCmbBxMunicipioEnc.getSelectedItem().toString(), jCmbBxUfEncerramento.getSelectedItem().toString());

                      String ID = "ID110112" + sCHAVE + "" + jFldNrSequencia.getText() + "";

                      sXML = CriaXMLEncerramento(ID, "15", "2", util.ExtraiNumeros(sCNPJ), sCHAVE, sDH_ENC, "110112",
                              jFldNrSequencia.getText(), "3.00", sPROTOCOLO, sDT_ENC,
                              sCOD_UF, sCOD_MUN);

                      infocert.CarregarCertificado(sCAM_CERT, sSENHA_CERT);

                      String XMLASSINADO = assina.GerarAssinatura(sXML, "C:\\InterageSE\\MDFe_XML\\MDFe_XML_ENCERRADO\\" + sCHAVE + ".xml", infobean.getAlias(), infobean.getCamCertificado(), infobean.getSenha(), "infEvento", "S", "N");
                      System.out.println("Caminho:" + XMLASSINADO);

                      LerXmlEncerramento(MDFeRecepcaoEvento.RecepcaoEventos(XMLASSINADO, infobean.getCamCertificado(), infobean.getSenha(), "2"));
                      AlterarDadosSituacao(sCHAVE, "Encerrado");
                      
                      
                      jBtCancelar.setEnabled(true);
                      //jProgressBar1.setIndeterminate(false);
                     // jProgressBar1.setValue(100);
                  } catch (Exception e) {
                      e.printStackTrace();
                      JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                  }
              }
          }
      }).start();
    

      /*
      if(jCmbBxUfEncerramento.getSelectedIndex() == -1){
        JOptionPane.showMessageDialog(null, "Escolha o estado de encerramento!");
        jCmbBxUfEncerramento.requestFocus();
      }else{
        infocert.CarregarCertificado(sCAM_CERT, sSENHA_CERT);

        String codUf = BuscaCodUf(jCmbBxUfEncerramento.getSelectedItem().toString());
        String codMun = BuscaCodMunicipio(jCmbBxMunicipioEnc.getSelectedItem().toString(), jCmbBxUfEncerramento.getSelectedItem().toString());
        MDFeRecepcaoEvento.RecepcaoEventoEncerramento("ID110112" + sCHAVE + "1", "15", "2", sCNPJ, sCHAVE, sDH_ENC, "110112", "1", "1.00", sCAM_CERT, sSENHA_CERT, "1", codUf, codMun);
      }
      */

  }//GEN-LAST:event_jBtEnviarActionPerformed

  private void jBtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelarActionPerformed
    dispose();
    
  }//GEN-LAST:event_jBtCancelarActionPerformed

  private void jCmbBxMunicipioEncKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCmbBxMunicipioEncKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      jBtEnviar.requestFocus();
    }
  }//GEN-LAST:event_jCmbBxMunicipioEncKeyPressed

  private void jCmbBxUfEncerramentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCmbBxUfEncerramentoKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      jCmbBxMunicipioEnc.requestFocus();
    }
  }//GEN-LAST:event_jCmbBxUfEncerramentoKeyPressed

  private void jCmbBxUfEncerramentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCmbBxUfEncerramentoItemStateChanged
    if(jCmbBxUfEncerramento.getSelectedItem() !=  null){
      BuscaMunicipio(jCmbBxUfEncerramento.getSelectedItem(), jCmbBxMunicipioEnc);
    }else{
      jCmbBxMunicipioEnc.setSelectedIndex(-1);
    }
  }//GEN-LAST:event_jCmbBxUfEncerramentoItemStateChanged

  private void jTableRetServidorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRetServidorMouseReleased
    // TODO add your handling code here:
  }//GEN-LAST:event_jTableRetServidorMouseReleased

  private void jTableRetServidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRetServidorMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_jTableRetServidorMouseClicked

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
            java.util.logging.Logger.getLogger(TelaEncerramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEncerramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEncerramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEncerramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaEncerramento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jBtEnviar;
    private javax.swing.JComboBox<String> jCmbBxMunicipioEnc;
    private javax.swing.JComboBox<String> jCmbBxUfEncerramento;
    private javax.swing.JTextField jFldDataHoraEvento;
    private javax.swing.JTextField jFldNrSequencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPnlInfo;
    private javax.swing.JPanel jPnlMensagem;
    private javax.swing.JPanel jPnlPrincipal;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableRetServidor;
    // End of variables declaration//GEN-END:variables
public void AlterarDadosSituacao(String Chave, String dadSituacao) {

        try {

            Conectar.ConectarBD();

            System.out.println("UPDATE MDFE_DADOS SET "
                    + "DAD_SITUACAO      = '" + dadSituacao + "' "
                    + "WHERE DAD_CHAVE = '" + Chave + "' "
            );

            Conectar.stam.executeUpdate("UPDATE MDFE_DADOS SET "
                    + "DAD_SITUACAO      = '" + dadSituacao + "' "
                    + "WHERE DAD_CHAVE = '" + Chave + "' "
            );

            Conectar.DesconectarBD();

            System.out.println("Situação Alterada!");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao alterar situação...\n" + e.getLocalizedMessage());
        }
    }
    public void DefinirFormulario(){
        
        setTitle("Encerramento por Evento");
        
        //setResizable(false);
        jPnlMensagem.setVisible(false);
        
        this.pack();
        
        setModal(true);
        
        //setSize(650, 450);
        
        jFldDataHoraEvento.setText(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
        
        setLocationRelativeTo(null);
        
        jCmbBxUfEncerramento.requestFocus();
        
        for (int col = 0; col < jTableRetServidor.getColumnCount(); col++) {
            jTableRetServidor.getColumnModel().getColumn(col).setHeaderRenderer(new MeuRenderizador());
        }
        
        jBtEnviar.setMnemonic(KeyEvent.VK_E);
        jBtCancelar.setMnemonic(KeyEvent.VK_C);
        
    }
    
    public void CarregaComboBoxDados() {
        try {
            Conectar.ConectarBD();

            Conectar.result = Conectar.stam.executeQuery("select SIGLA from ESTADOS order by SIGLA");
            while (Conectar.result.next()) {
                jCmbBxUfEncerramento.addItem(Conectar.result.getString("SIGLA"));
            }

            jCmbBxUfEncerramento.setSelectedIndex(-1);

            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error...\n" + e.getLocalizedMessage());
        }
    }
    
     
    //Carrega todos os municipios dos estados de acordo com a sigla do mesmo que entra como parametro
    public void BuscaMunicipio(Object sigla, JComboBox jcombobox) {
        //Inicia a variavel ResultSet
        ResultSet rs = null;
        //Inicia a variavel Statement
        Statement st = null;

        //Remove todos os item do jComboBox do Municipio
        jcombobox.removeAllItems();
        //Inicia a variavel que irá receber o codigo do estado
        String codEst = "";
        try {
            if (sigla != null) {
                Conectar.ConectarBD();
                st = Conectar.con.createStatement(rs.TYPE_SCROLL_SENSITIVE, rs.CONCUR_UPDATABLE);
                //Faz a query para buscar codigo do estado selecionado no jComboBox de UF
                rs = st.executeQuery("select CODIGO from ESTADOS where SIGLA = '" + sigla + "' ");
                while (rs.next()) {
                    //Seta o valor na variável
                    codEst = rs.getString("CODIGO");
                }
                //Faz a query buscando os Municipios do estado
                rs = st.executeQuery("select NOME from MUNICIPIOS where CODEST = '" + codEst + "' ");
                while (rs.next()) {
                    //Popula a lista de Municipios
                    jcombobox.addItem(rs.getString("NOME"));
                }

                Conectar.DesconectarBD();
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados...\n" + e.getLocalizedMessage());
        }

    } 
    
    public String BuscaCodUf(String uf) {
        String codEst = "";
        Statement stam = null;
        Connection con = null;
        try {
            Conectar.ConectarBD();
            con = Conectar.con;
            stam = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            ResultSet result = stam.executeQuery("SELECT CODIGO FROM ESTADOS WHERE SIGLA = '" + uf + "' ");
            while (result.next()) {
                codEst = result.getString("CODIGO");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados...\n" + e.getLocalizedMessage());
        }
        return codEst;
    }
    
    public String BuscaCodMunicipio(String Municipio, String uf) {
        String codMun = "";
        try {
            Conectar.ConectarBD();
            Conectar.stam = Conectar.con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            Conectar.result = Conectar.stam.executeQuery("SELECT CODMUN FROM MUNICIPIOS WHERE NOME = '" + Municipio + "' AND  CODEST = (SELECT CODEST FROM ESTADOS WHERE SIGLA = '" + uf + "')");
            while (Conectar.result.next()) {
                codMun = Conectar.result.getString("CODMUN");
            }
            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados...\n" + e.getLocalizedMessage());
        }

        return codMun;
    }
    
    public static void Verifica_Existe_Pasta_MDFe_Assinada() {

        File diretorio = new File("C:\\InterageSE\\MDFe_XML\\MDFe_XML_ENCERRADO"); // BACKUP é uma pasta!
        if (!diretorio.exists()) {
            diretorio.mkdirs(); //mkdir() cria somente um diretório, mkdirs() cria diretórios e subdiretórios.
            System.out.println("Diretório não existente");
        } else {
            System.out.println("Diretório já existente");
        }

    }
    
    public String CriaXMLEncerramento(String Id, String cOrgao, String tpAmb, String CNPJ, String chMDFe, 
                                             String dhEvento, String tpEvento, String nSeqEvento, String versaoEvento, 
                                             String nProt, String dtEvento, String cUF, String cMun){
        
        StringBuilder XmlEncMDFe = new StringBuilder();
        XmlEncMDFe.append("<evEncMDFe>")
                .append("<descEvento>Encerramento</descEvento>")
                .append("<nProt>" + nProt + "</nProt>")
                .append("<dtEnc>" + dtEvento + "</dtEnc>")
                .append("<cUF>" + cUF + "</cUF>")
                .append("<cMun>" + cMun + "</cMun>")
                .append("</evEncMDFe>");

        StringBuilder XmlEvento = new StringBuilder();
        XmlEvento.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
                .append("<eventoMDFe xmlns=\"http://www.portalfiscal.inf.br/mdfe\" versao=\"3.00\">")
                .append("<infEvento Id=\"" + Id + "\">")
                .append("<cOrgao>" + cOrgao + "</cOrgao>")
                .append("<tpAmb>" + tpAmb + "</tpAmb>")
                .append("<CNPJ>" + CNPJ + "</CNPJ>")
                .append("<chMDFe>" + chMDFe + "</chMDFe>")
                .append("<dhEvento>" + dhEvento + "</dhEvento>")
                .append("<tpEvento>" + tpEvento + "</tpEvento>")
                .append("<nSeqEvento>" + nSeqEvento + "</nSeqEvento>")
                .append("<detEvento versaoEvento=\"" + versaoEvento + "\">")
                .append(XmlEncMDFe)
                .append("</detEvento>")
                .append("</infEvento>")
                .append("</eventoMDFe>");

        return XmlEvento.toString(); 
    }
    
    public void LerXmlEncerramento(String dados) throws XmlPullParserException, IOException {
        
        XmlPullParserFactory factory = null;
        factory = XmlPullParserFactory.newInstance();

        factory.setNamespaceAware(true);
        XmlPullParser xpp = null;
        xpp = factory.newPullParser();
        xpp.setInput(new StringReader(dados));

        int eventType = 0;
        eventType = xpp.getEventType();

        String TagStartXml = "";
        String TagEndXml = "";
        
        //Variaveis que recebem o valor para colocar na tabela
        String xMotivo = "";
        
        DefaultTableModel dtm = (DefaultTableModel) jTableRetServidor.getModel();
        dtm.setNumRows(0);
        
        List lista = new ArrayList();

        while (eventType != XmlPullParser.END_DOCUMENT) {//"<foo>Hello World!</foo>"

            if (eventType == XmlPullParser.START_DOCUMENT) { //nr 1
                System.out.println("Start document");

            } else if (eventType == XmlPullParser.START_TAG) { // <foo> 1º /** nr 2
                
                TagStartXml = xpp.getName();
                
            } else if (eventType == XmlPullParser.TEXT) {
                ValorXml = xpp.getText();
                
                if(ValorXml.trim().length() > 0){
                    if(TagStartXml.equals("cStat")){
                        cStat = ValorXml;
                    }
                    
                    if(TagStartXml.equals("xMotivo")){
                        xMotivo = ValorXml;
                    }
                    
                }
                
                System.out.println(ValorXml);

            } else if (eventType == XmlPullParser.END_TAG) {   // </foo> 3º nr 3
                TagEndXml = xpp.getName();
                
                if(TagEndXml.equals("retEventoMDFe")){
                    dtm.addRow(new Object[]{cStat, xMotivo});
                }
                
            }
            eventType = xpp.next();

        }
        
        //JOptionPane.showMessageDialog(null, "Motivo: " + ValorXml);
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
            setFont(getFont().deriveFont(Font.BOLD));
            setBorder(new LineBorder(Color.WHITE, 1, true));
            setForeground(Color.WHITE);
            setHorizontalAlignment(SwingConstants.LEFT);
            setText(value.toString());

            return this;
        }
    }
    
}
