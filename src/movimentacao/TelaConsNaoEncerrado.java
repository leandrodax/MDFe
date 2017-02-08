package movimentacao;

import ClassesMDFe.InfoCertificado;
import ClassesMDFe.MDFeConsNaoEnc;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import static movimentacao.TelaEncerramento.ValorXml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class TelaConsNaoEncerrado extends javax.swing.JDialog {

  public static String sCNPJ = "", sCAMCERT = "", sSENHACERT = "", cStat = "";
  InfoCertificado infocert = new InfoCertificado();

  public TelaConsNaoEncerrado() {
    initComponents();
    DefinirFormulario();
  }

  public TelaConsNaoEncerrado(String Cnpj, String CamCert, String SenhaCert) {
    initComponents();
    sCNPJ = Cnpj;
    sCAMCERT = CamCert;
    sSENHACERT = SenhaCert;

    DefinirFormulario();
    SairEsc();
    jBtConsultar.doClick();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPnlPrincipal = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTablePrincipal = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    jBtConsultar = new javax.swing.JButton();
    jBtEncerrar = new javax.swing.JButton();
    jBtSair = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jTablePrincipal.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
      },
      new String [] {
        "", "Chave de Acesso", "Número do Protocolo", "Situação"
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
        java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }
    });
    jTablePrincipal.getTableHeader().setReorderingAllowed(false);
    jTablePrincipal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
      public void propertyChange(java.beans.PropertyChangeEvent evt) {
        jTablePrincipalPropertyChange(evt);
      }
    });
    jScrollPane1.setViewportView(jTablePrincipal);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel1.setText("Selecione o botão Consultar para listar todos os MDF-e's não encerrados");

    jBtConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jBtConsultar.setText("Consultar");
    jBtConsultar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtConsultarActionPerformed(evt);
      }
    });

    jBtEncerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jBtEncerrar.setText("Encerrar");
    jBtEncerrar.setEnabled(false);
    jBtEncerrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtEncerrarActionPerformed(evt);
      }
    });

    jBtSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jBtSair.setText("Sair");
    jBtSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtSairActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPnlPrincipalLayout = new javax.swing.GroupLayout(jPnlPrincipal);
    jPnlPrincipal.setLayout(jPnlPrincipalLayout);
    jPnlPrincipalLayout.setHorizontalGroup(
      jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPnlPrincipalLayout.createSequentialGroup()
        .addContainerGap(210, Short.MAX_VALUE)
        .addComponent(jBtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(5, 5, 5)
        .addComponent(jBtEncerrar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jBtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(241, Short.MAX_VALUE))
      .addGroup(jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPnlPrincipalLayout.createSequentialGroup()
          .addContainerGap()
          .addGroup(jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
            .addGroup(jPnlPrincipalLayout.createSequentialGroup()
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(0, 205, Short.MAX_VALUE)))
          .addContainerGap()))
    );
    jPnlPrincipalLayout.setVerticalGroup(
      jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlPrincipalLayout.createSequentialGroup()
        .addContainerGap(415, Short.MAX_VALUE)
        .addGroup(jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jBtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jBtEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jBtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
      .addGroup(jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPnlPrincipalLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(jLabel1)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
          .addGap(58, 58, 58)))
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

    private void jBtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSairActionPerformed
      dispose();
    }//GEN-LAST:event_jBtSairActionPerformed

    private void jBtConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtConsultarActionPerformed
      try {
        infocert.CarregarCertificado(sCAMCERT, sSENHACERT);

        LerXmlEncerramento(MDFeConsNaoEnc.ConsMDFeNaoEnc(sCNPJ, "2", sCAMCERT, sSENHACERT));
      } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao fazer comunicação com servidor...\n" + e.getLocalizedMessage());
      }
    }//GEN-LAST:event_jBtConsultarActionPerformed

    private void jBtEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEncerrarActionPerformed
      for (int linha = 0; linha < jTablePrincipal.getRowCount(); linha++) {
        if (((boolean) jTablePrincipal.getValueAt(linha, 0)) == true) {
          TelaEncerramento telaenc = new TelaEncerramento(jTablePrincipal.getValueAt(linha, 1).toString(), jTablePrincipal.getValueAt(linha, 2).toString(), sCAMCERT, sSENHACERT, sCNPJ);
          telaenc.setVisible(true);
          //Se o cStat for 135(Evento resgistrado e vinculado), altera a situação
          if (telaenc.cStat.equals("135")) {
            jTablePrincipal.setValueAt("MDFe Encerrado", linha, 3);
          }
        }
      }
    }//GEN-LAST:event_jBtEncerrarActionPerformed

    private void jTablePrincipalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTablePrincipalPropertyChange
      int Selecionada = 0;
      for (int linha = 0; linha < jTablePrincipal.getRowCount(); linha++) {
        if (((boolean) jTablePrincipal.getValueAt(linha, 0)) == true) {
          Selecionada++;
        }
      }

      if (Selecionada > 1 || Selecionada == 0) {
        jBtEncerrar.setEnabled(false);
      } else {
        jBtEncerrar.setEnabled(true);
      }
    }//GEN-LAST:event_jTablePrincipalPropertyChange

  public static void main(String args[]) {

    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {

      javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");

    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(TelaConsNaoEncerrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaConsNaoEncerrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaConsNaoEncerrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaConsNaoEncerrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new TelaConsNaoEncerrado().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jBtConsultar;
  private javax.swing.JButton jBtEncerrar;
  private javax.swing.JButton jBtSair;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPnlPrincipal;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTablePrincipal;
  // End of variables declaration//GEN-END:variables

  public void DefinirFormulario() {

    setTitle("Consultar não encerrados");

    setModal(true);

    setSize(900, 500);

    setLocationRelativeTo(null);

    jTablePrincipal.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    for (int col = 0; col < jTablePrincipal.getColumnCount(); col++) {
      jTablePrincipal.getColumnModel().getColumn(col).setHeaderRenderer(new MeuRenderizador());
    }

    jTablePrincipal.getColumnModel().getColumn(0).setMaxWidth(30);
    jTablePrincipal.getColumnModel().getColumn(0).setMinWidth(30);

    jTablePrincipal.getColumnModel().getColumn(1).setMaxWidth(350);
    jTablePrincipal.getColumnModel().getColumn(1).setMinWidth(350);

    jBtConsultar.setMnemonic(KeyEvent.VK_C);
    jBtEncerrar.setMnemonic(KeyEvent.VK_E);
    jBtSair.setMnemonic(KeyEvent.VK_S);

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
    
    String chMDFe = ""; 
    String nProt  = "";

    DefaultTableModel dtm = (DefaultTableModel) jTablePrincipal.getModel();
    //Zera as linhas da tabela
    dtm.setNumRows(0);

     while (eventType != XmlPullParser.END_DOCUMENT) {

        if (eventType == XmlPullParser.START_DOCUMENT) {
          System.out.println("Start document");
         
        } else if (eventType == XmlPullParser.START_TAG) {// INICIO DA TEG

          TagStartXml = xpp.getName();
          //xMotivo, cStat
          if (TagStartXml.equals("xMotivo")) {
             System.out.println("<xMotivo>");
          }else if (TagStartXml.equals("cStat")) {
             System.out.println("<cStat>");
          } 

        } else if (eventType == XmlPullParser.END_TAG) { // FIM DA TEG
          TagEndXml = xpp.getName();
          if (TagEndXml.equals("xMotivo")) {
             System.out.println("</xMotivo>");
          } else if (TagEndXml.equals("cStat")) {
             System.out.println("</cStat>");
          } else if (TagEndXml.equals("infMDFe")) {

            //inseri item	
            try {
              // JOptionPane.showMessageDialog(null, cStat+"\n"+xMotivo+"\n", "INCLUIR CONDUTOR", 1);
                dtm.addRow(new Object[]{false, chMDFe, nProt});
            } catch (Exception e) {
              //	trace("Erro Item: " + e.getMessage());
              System.out.println("Erro Item: " + e.getMessage());
            }

          }
        } else if (eventType == XmlPullParser.TEXT) {// TEXTO DA TEG
          ValorXml = xpp.getText();

            if (TagStartXml.equals("chMDFe")) {
                if (ValorXml.trim().length() > 0) {
                    chMDFe = ValorXml;
                    System.out.println("chMDFe = " + chMDFe);
                }

                // JOptionPane.showMessageDialog(null, ValorXml.toUpperCase()+"!", "Consulta Status do Serviço", 1);
            }

            if (TagStartXml.equals("nProt")) {
                if (ValorXml.trim().length() > 0) {
                    nProt = ValorXml;
                    System.out.println("nProt = " + nProt);
                }
                // JOptionPane.showMessageDialog(null, ValorXml.toUpperCase()+"!", "Consulta Status do Serviço", 1);
            }
            

        }
        eventType = xpp.next();

      }

    //JOptionPane.showMessageDialog(null, "Motivo: " + ValorXml);
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
