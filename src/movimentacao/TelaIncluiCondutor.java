/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movimentacao;

import ClassesFirebird.InfoCertificadoBean;
import ClassesFirebird.Tabusu;
import ClassesMDFe.Assina;
import ClassesMDFe.InfoCertificado;
import ClassesMDFe.MDFeRecepcaoEvento;
import ClassesMDFe.Valida;
import ConexaoDB.Conectar;
import Utilitarios.LimitaField;
import Utilitarios.Utilitarios;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import ClassesMDFe.MDFeRecepcaoEvento;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.xml.parsers.ParserConfigurationException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/**
 *
 * @author Administrador
 */
public class TelaIncluiCondutor extends javax.swing.JDialog {
    Valida validaxml                   = new Valida();
    Utilitarios util                   = new Utilitarios();
    Tabusu tabusu                      = new Tabusu();
    InfoCertificado infocert           = new InfoCertificado(); 
    InfoCertificadoBean InfoCertBean   = new InfoCertificadoBean();   
    TelaMovimentacao telamovimentacao  = new TelaMovimentacao();    
    Assina assinatura                  = new Assina();
    String sCamCertificado, sSenhaCertificado, sCNPJ, sProtocolo, XMLCancelamento, xMotivo, cStat, ValorXml;
    DefaultTableCellRenderer direita   = new DefaultTableCellRenderer();
    DefaultTableCellRenderer centro    = new DefaultTableCellRenderer();
    DefaultTableCellRenderer esquerda  = new DefaultTableCellRenderer(); 
    
    public TelaIncluiCondutor() {
        initComponents();
        DefinirFormulario();
        
    }

   /**
   * Creates new form TelaCancelamento
   */
   public TelaIncluiCondutor(String CamCertificado, String SenhaCertificado, String CNPJ){
    initComponents();
        DefinirFormulario();
    
    
     sCamCertificado   = CamCertificado;
     sSenhaCertificado = SenhaCertificado;
     sCNPJ             = CNPJ;
     
     BuscaCodSeqCondutor( util.sDAD_NUMERO);
  }

  

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPnlIncluirCondutor = new javax.swing.JPanel();
    jLabel15 = new javax.swing.JLabel();
    jFldSequencia = new javax.swing.JTextField();
    jLabel17 = new javax.swing.JLabel();
    jFldNomeCondutor = new javax.swing.JTextField();
    jLabel14 = new javax.swing.JLabel();
    jFldCPFcondutor = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jPnlMensagem1 = new javax.swing.JPanel();
    jScrollPane7 = new javax.swing.JScrollPane();
    jTblRetServidor1 = new javax.swing.JTable();

    jPnlIncluirCondutor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Incluir condutor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

    jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel15.setText("Sequência");

    jFldSequencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jFldSequencia.addAncestorListener(new javax.swing.event.AncestorListener() {
      public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
      }
      public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        jFldSequenciaAncestorAdded(evt);
      }
      public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
      }
    });
    jFldSequencia.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        jFldSequenciaFocusLost(evt);
      }
    });
    jFldSequencia.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jFldSequenciaActionPerformed(evt);
      }
    });
    jFldSequencia.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jFldSequenciaKeyPressed(evt);
      }
    });

    jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel17.setText("Nome do Condutor");

    jFldNomeCondutor.setDocument(new LimitaField(60, 0));
    jFldNomeCondutor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jFldNomeCondutor.addAncestorListener(new javax.swing.event.AncestorListener() {
      public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
      }
      public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        jFldNomeCondutorAncestorAdded(evt);
      }
      public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
      }
    });
    jFldNomeCondutor.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        jFldNomeCondutorFocusLost(evt);
      }
    });
    jFldNomeCondutor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jFldNomeCondutorActionPerformed(evt);
      }
    });
    jFldNomeCondutor.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jFldNomeCondutorKeyPressed(evt);
      }
    });

    jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel14.setText("CPF do Condutor");

    jFldCPFcondutor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jFldCPFcondutor.addAncestorListener(new javax.swing.event.AncestorListener() {
      public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
      }
      public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        jFldCPFcondutorAncestorAdded(evt);
      }
      public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
      }
    });
    jFldCPFcondutor.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        jFldCPFcondutorFocusLost(evt);
      }
    });
    jFldCPFcondutor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jFldCPFcondutorActionPerformed(evt);
      }
    });
    jFldCPFcondutor.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jFldCPFcondutorKeyPressed(evt);
      }
    });

    jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton1.setText("Enviar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton2.setText("Sair");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jPnlMensagem1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Resposta do Servidor", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 0, 51))); // NOI18N
    jPnlMensagem1.setForeground(new java.awt.Color(255, 51, 51));

    jTblRetServidor1.setModel(new javax.swing.table.DefaultTableModel(
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
    jTblRetServidor1.getTableHeader().setResizingAllowed(false);
    jTblRetServidor1.getTableHeader().setReorderingAllowed(false);
    jTblRetServidor1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTblRetServidorMouseClicked(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        jTblRetServidorMouseReleased(evt);
      }
    });
    jScrollPane7.setViewportView(jTblRetServidor1);

    javax.swing.GroupLayout jPnlMensagem1Layout = new javax.swing.GroupLayout(jPnlMensagem1);
    jPnlMensagem1.setLayout(jPnlMensagem1Layout);
    jPnlMensagem1Layout.setHorizontalGroup(
      jPnlMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane7)
    );
    jPnlMensagem1Layout.setVerticalGroup(
      jPnlMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPnlMensagem1Layout.createSequentialGroup()
        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 1, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPnlIncluirCondutorLayout = new javax.swing.GroupLayout(jPnlIncluirCondutor);
    jPnlIncluirCondutor.setLayout(jPnlIncluirCondutorLayout);
    jPnlIncluirCondutorLayout.setHorizontalGroup(
      jPnlIncluirCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jFldNomeCondutor)
      .addGroup(jPnlIncluirCondutorLayout.createSequentialGroup()
        .addGroup(jPnlIncluirCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jFldSequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPnlIncluirCondutorLayout.createSequentialGroup()
            .addGap(130, 130, 130)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jFldCPFcondutor, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 130, Short.MAX_VALUE))
      .addComponent(jPnlMensagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPnlIncluirCondutorLayout.setVerticalGroup(
      jPnlIncluirCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPnlIncluirCondutorLayout.createSequentialGroup()
        .addComponent(jLabel15)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jFldSequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel17)
        .addGap(4, 4, 4)
        .addComponent(jFldNomeCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel14)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jFldCPFcondutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(jPnlIncluirCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jPnlMensagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPnlIncluirCondutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPnlIncluirCondutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    getAccessibleContext().setAccessibleParent(this);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    this.dispose();
  }//GEN-LAST:event_jButton2ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
    try{
      jPnlMensagem.setVisible(true);
//      jProgressBar.setIndeterminate(true);
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
      infocert.CarregarCertificado(sCamCertificado, sSenhaCertificado);
      String Id = CriaID("110114", util.sCHAVE_MDFE , jFldSequencia.getText());

      if (VerificaField() == true) {
        util.XMLIncluirCondutor =  CriaXMLCondutor(Id , "15", "2", util.ExtraiNumeros(sCNPJ), util.sCHAVE_MDFE,
          util.FormataDataBancoMDFE(new Date()), "110114",jFldSequencia.getText(), "1.00",  jFldNomeCondutor.getText(), jFldCPFcondutor.getText());
        

        Verifica_Existe_Pasta_Condutor_Assinada();
        String XMLAssinado = assinatura.GerarAssinatura( util.XMLIncluirCondutor, "C:\\InterageSE\\MDFe_XML\\MDFe_XML_CONDUTOR\\"+ util.sCHAVE_MDFE+".xml", InfoCertBean.getAlias(), InfoCertBean.getCamCertificado(), InfoCertBean.getSenha(),"infEvento","S","N");//            
        LerXmlIncluirCondutor(MDFeRecepcaoEvento.RecepcaoEventos(XMLAssinado,  sCamCertificado, sSenhaCertificado, "2"));

          //verifica se foi enviado certo
          if(cStat.equals("135")){//Evento registrado e vinculado a MDF-e
            // JOptionPane.showMessageDialog(null, xMotivo);
            Conectar.stam.executeUpdate("update MDFE_DADOS set SEQCONDUTOR = "+ jFldSequencia.getText() +" where DAD_NUMERO = '"+ util.sDAD_NUMERO+"'");
            Conectar.DesconectarBD();
            //inserir condutor
          }else{
            // JOptionPane.showMessageDialog(null,"Erro: \n" +xMotivo);
          }
       //   jProgressBar.setIndeterminate(false);
        }
      } catch (ParseException ex) {
        Logger.getLogger(TelaIncluiCondutor.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
        Logger.getLogger(TelaIncluiCondutor.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ParserConfigurationException ex) {
        Logger.getLogger(TelaIncluiCondutor.class.getName()).log(Level.SEVERE, null, ex);
      } catch (NoSuchAlgorithmException ex) {
        Logger.getLogger(TelaIncluiCondutor.class.getName()).log(Level.SEVERE, null, ex);
      } catch (CertificateException ex) {
        Logger.getLogger(TelaIncluiCondutor.class.getName()).log(Level.SEVERE, null, ex);
      } catch (UnrecoverableEntryException ex) {
        Logger.getLogger(TelaIncluiCondutor.class.getName()).log(Level.SEVERE, null, ex);
      } catch (Exception ex) {
        Logger.getLogger(TelaIncluiCondutor.class.getName()).log(Level.SEVERE, null, ex);
      }
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jFldCPFcondutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldCPFcondutorKeyPressed

  }//GEN-LAST:event_jFldCPFcondutorKeyPressed

  private void jFldCPFcondutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldCPFcondutorActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldCPFcondutorActionPerformed

  private void jFldCPFcondutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldCPFcondutorFocusLost
    // TODO add your handling code here:

  }//GEN-LAST:event_jFldCPFcondutorFocusLost

  private void jFldCPFcondutorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jFldCPFcondutorAncestorAdded
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldCPFcondutorAncestorAdded

  private void jFldNomeCondutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldNomeCondutorKeyPressed

  }//GEN-LAST:event_jFldNomeCondutorKeyPressed

  private void jFldNomeCondutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldNomeCondutorActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldNomeCondutorActionPerformed

  private void jFldNomeCondutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldNomeCondutorFocusLost
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldNomeCondutorFocusLost

  private void jFldNomeCondutorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jFldNomeCondutorAncestorAdded
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldNomeCondutorAncestorAdded

  private void jFldSequenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldSequenciaKeyPressed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldSequenciaKeyPressed

  private void jFldSequenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldSequenciaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldSequenciaActionPerformed

  private void jFldSequenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldSequenciaFocusLost
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldSequenciaFocusLost

  private void jFldSequenciaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jFldSequenciaAncestorAdded
    // TODO add your handling code here:
  }//GEN-LAST:event_jFldSequenciaAncestorAdded

  private void jTblRetServidorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblRetServidorMouseReleased
    // TODO add your handling code here:
  }//GEN-LAST:event_jTblRetServidorMouseReleased

  private void jTblRetServidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblRetServidorMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_jTblRetServidorMouseClicked

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
      java.util.logging.Logger.getLogger(TelaIncluiCondutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaIncluiCondutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaIncluiCondutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaIncluiCondutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JTextField jFldCPFcondutor;
  private javax.swing.JTextField jFldNomeCondutor;
  private javax.swing.JTextField jFldSequencia;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel17;
  private javax.swing.JPanel jPnlIncluirCondutor;
  private javax.swing.JPanel jPnlMensagem;
  private javax.swing.JPanel jPnlMensagem1;
  private javax.swing.JPanel jPnlMensagem2;
  private javax.swing.JPanel jPnlMensagem3;
  private javax.swing.JScrollPane jScrollPane6;
  private javax.swing.JScrollPane jScrollPane7;
  private javax.swing.JScrollPane jScrollPane8;
  private javax.swing.JScrollPane jScrollPane9;
  private javax.swing.JTable jTblRetServidor;
  private javax.swing.JTable jTblRetServidor1;
  private javax.swing.JTable jTblRetServidor2;
  private javax.swing.JTable jTblRetServidor3;
  // End of variables declaration//GEN-END:variables
 
  public void BuscaCodSeqCondutor(String sDAD_NUMERO){
        Integer  codmax = null;
        try{
            Conectar.ConectarBD();
            DecimalFormat df = new DecimalFormat("00");
            Conectar.result = Conectar.stam.executeQuery("select SEQCONDUTOR + 1 from MDFE_DADOS where DAD_NUMERO = '"+ sDAD_NUMERO+"'");
            
            while(Conectar.result.next()){
                if(Conectar.result.getString(1) == null){
                    codmax = 1;
                }else{
                    codmax = (Integer.parseInt(Conectar.result.getString(1)));
                }
                jFldSequencia.setText(df.format(codmax)); 
            }
            
           // Conectar.stam.executeUpdate("update MDFE_DADOS set SEQCONDUTOR = "+ codmax.toString() +" where DAD_NUMERO = '"+ sDAD_NUMERO+"'");
            
           // Conectar.DesconectarBD();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error...\n" + e.getLocalizedMessage());
        }
  }
  
  
  
  public static void Verifica_Existe_Pasta_Condutor_Assinada() {

        File diretorio = new File("C:\\InterageSE\\MDFe_XML\\MDFe_XML_CONDUTOR"); // BACKUP é uma pasta!
        if (!diretorio.exists()) {
            diretorio.mkdirs(); //mkdir() cria somente um diretório, mkdirs() cria diretórios e subdiretórios.
            System.out.println("Diretório não existente");
        } else {
            System.out.println("Diretório já existente");
        }

  } 
  public String CriaXMLCondutor(String Id, String cOrgao, String tpAmb, String CNPJ, String chMDFe, String dhEvento, String tpEvento, String nSeqEvento,  String versaoEvento, String xNome, String CPF) throws SQLException, InstantiationException, IllegalAccessException {
      
    
      StringBuilder XmlIncCondutorMDFe = new StringBuilder();      
      XmlIncCondutorMDFe.append("<evIncCondutorMDFe>")
                .append("<descEvento>Inclusao Condutor</descEvento>")
                .append("<condutor>")
                .append("<xNome>"+xNome+"</xNome>")
                .append("<CPF>"+CPF+"</CPF>")
                .append("</condutor>")
                     .append("</evIncCondutorMDFe>");
                      
                      
      

      System.out.println("----------evCancMDFe : ");
      StringBuilder XmlEvento = new StringBuilder();
      XmlEvento.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
               .append("<eventoMDFe xmlns=\"http://www.portalfiscal.inf.br/mdfe\" versao=\"1.00\">")
               .append("<infEvento Id="+Id+">")                     
               .append("<cOrgao>"+cOrgao+"</cOrgao>")
               .append("<tpAmb>"+tpAmb+"</tpAmb>")                     
               .append("<CNPJ>"+CNPJ+"</CNPJ>")
               .append("<chMDFe>"+chMDFe+"</chMDFe>")
               .append("<dhEvento>"+dhEvento+"</dhEvento>")
               .append("<tpEvento>"+tpEvento+"</tpEvento>")//110114 –
               .append("<nSeqEvento>"+nSeqEvento+"</nSeqEvento>")
               .append("<detEvento versaoEvento="+"\""+versaoEvento+"\""+">")
               .append(XmlIncCondutorMDFe)
               .append("</detEvento>")                  
               .append("</infEvento>")
               .append("</eventoMDFe>");
      
      
     


      System.out.println(XmlEvento.toString());

      return XmlEvento.toString();

  }



    public String CriaID(String tpEvento, String chaveMDFe, String nSeqEvento) {
        String sID ="\""+ "ID"+tpEvento+chaveMDFe+nSeqEvento+"\"";     
        //ID110111+35121010142785000190580010000000011491283029+01 
        //ID110111+15161221586212000172581230000000011000000019+1
       // JOptionPane.showMessageDialog(null, "tam : " + sID.length());
        return sID;
    }

    public boolean VerificaField(){
        if(jFldCPFcondutor.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "CPF não preenchido!");
            jFldCPFcondutor.requestFocus();
            return false;
        }else if(jFldNomeCondutor.getText().length() < 2){
            JOptionPane.showMessageDialog(null, "Nome não preenchido corretamente, minimo de 2 caraqueteres !");
            jFldNomeCondutor.requestFocus();
            return false;
        }else{
            return true;
        }
    }
    
    public void BuscaNomeFilial(String codfil) {
        String NomFil = "";
        String Cnpj = "";
        String IE = "";
        try {
            if (codfil.length() > 0) {
                Conectar.ConectarBD();
                Conectar.result = Conectar.stam.executeQuery("select NOMFIL, FANFIL, ENDFIL, NUMERO, COMPFIL, BAIFIL, CEPFIL, UFFIL, CIDFIL, TELFIL, EMAILFIL, CNPJFIL, IEFIL, RNTRC, CODMUNFIL, PATHSERIECERT, SENHACERT from TABFIL where CODFIL = '" + codfil + "' and RGEVENTO <> '3'");
                while (Conectar.result.next()) {
                    sCamCertificado   = Conectar.result.getString("PATHSERIECERT");
                    sSenhaCertificado = Conectar.result.getString("SENHACERT");
                    sCNPJ             = Conectar.result.getString("CNPJFIL");
                    
                  
                }
                Conectar.DesconectarBD();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error...\n" + e.getLocalizedMessage());
        }
    }


    public void DefinirFormulario(){        
        setTitle("Tela para incluir condutor");        
        setResizable(false);        
        setModal(true);        
        setSize(700, 450);      
        
        //Ajusta os componentes ao tamanho da tela
        this.pack();
      
        //Seta o icone do formulario
        setIconImage(new ImageIcon(getClass().getResource("/imagens/mdfeIcone.png")).getImage());
        //deixar no centro
        setLocationRelativeTo(null);
        jPnlMensagem.setVisible(false);
 
        jTblRetServidor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        for (int col = 0; col < jTblRetServidor.getColumnCount(); col++) {
            jTblRetServidor.getColumnModel().getColumn(col).setHeaderRenderer(new TelaIncluiCondutor.MeuRenderizador());
        }
        
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);

        //Define o tamanho das colunas e posicoes das celulas
        jTblRetServidor.getColumnModel().getColumn(0).setMinWidth(40);
        jTblRetServidor.getColumnModel().getColumn(0).setMaxWidth(100);
        jTblRetServidor.getColumnModel().getColumn(0).setCellRenderer(esquerda);
        
        //Série 
        jTblRetServidor.getColumnModel().getColumn(1).setMinWidth(800);
        jTblRetServidor.getColumnModel().getColumn(1).setMaxWidth(1000);
        jTblRetServidor.getColumnModel().getColumn(1).setCellRenderer(esquerda);
    }
    
    
    public void LimpaTabela(JTable tabela) {
        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        dtm.setNumRows(0);
    }
    
    
    public void LerXmlIncluirCondutor(String dados) throws XmlPullParserException, IOException {
        LimpaTabela(jTblRetServidor);
        DefaultTableModel dtm = (DefaultTableModel) jTblRetServidor.getModel();
           

        XmlPullParserFactory factory = null;
        factory = XmlPullParserFactory.newInstance();

        factory.setNamespaceAware(true);
        XmlPullParser xpp = null;
        xpp = factory.newPullParser();
        xpp.setInput(new StringReader(dados));

        int eventType = 0;
        eventType = xpp.getEventType();

        String TagStartXml = null;
        String TagEndXml = null;
        
        
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
          } else if (TagEndXml.equals("retEventoMDFe")) {

            //inseri item	
            try {
              // JOptionPane.showMessageDialog(null, cStat+"\n"+xMotivo+"\n", "INCLUIR CONDUTOR", 1);
                dtm.addRow(new Object[]{cStat, xMotivo, });
            } catch (Exception e) {
              //	trace("Erro Item: " + e.getMessage());
              System.out.println("Erro Item: " + e.getMessage());
            }

          }
        } else if (eventType == XmlPullParser.TEXT) {// TEXTO DA TEG
          ValorXml = xpp.getText();

            if (TagStartXml.equals("cStat")) {
              cStat = ValorXml;
              System.out.println("cStat = " + cStat);
              // JOptionPane.showMessageDialog(null, ValorXml.toUpperCase()+"!", "Consulta Status do Serviço", 1);
            }

            if (TagStartXml.equals("xMotivo")) {
              xMotivo = ValorXml;
              System.out.println("xMotivo = " + xMotivo);
              // JOptionPane.showMessageDialog(null, ValorXml.toUpperCase()+"!", "Consulta Status do Serviço", 1);
            }
            

        }
        eventType = xpp.next();

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
            setFont(getFont().deriveFont(Font.BOLD));
            setBorder(new LineBorder(Color.WHITE, 1, true));
            setForeground(Color.WHITE);
            setHorizontalAlignment(SwingConstants.LEFT);
            setText(value.toString());

            return this;
        }
    }

}
