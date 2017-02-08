/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesquisa;

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
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author PC
 */
public class TelaBuscaUnidadeCargaVazia  extends javax.swing.JDialog {

    public static String sCOD= "", sID_CARGA= "", sTIPO = "";
    Integer selecionada, valor;
    String sql, ordnar; 
    DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
    DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
    DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
    
    public TelaBuscaUnidadeCargaVazia() {
        initComponents();
        DefinirFormulario();
        CarregaTudo();
        SairEsc();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlPrincipal = new javax.swing.JPanel();
        jPnlBusca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFldBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrincipal = new javax.swing.JTable();
        jBtOk = new javax.swing.JButton();
        jBtPrimeiro = new javax.swing.JButton();
        jBtAnterior = new javax.swing.JButton();
        jBtProximo = new javax.swing.JButton();
        jBtUltimo = new javax.swing.JButton();
        jBtCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPnlPrincipal.setLayout(new java.awt.CardLayout());

        jPnlBusca.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Informe");
        jPnlBusca.add(jLabel1);
        jLabel1.setBounds(20, 0, 140, 30);

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
        jPnlBusca.add(jFldBusca);
        jFldBusca.setBounds(20, 20, 390, 25);

        jTablePrincipal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTablePrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Código", "Identificação Unidade de Carga Vazia", "Tipo de Unidade de Carga Vazia"
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

        jPnlBusca.add(jScrollPane1);
        jScrollPane1.setBounds(0, 60, 690, 230);

        jBtOk.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtOk.setText("OK");
        jBtOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtOkActionPerformed(evt);
            }
        });
        jBtOk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtOkKeyPressed(evt);
            }
        });
        jPnlBusca.add(jBtOk);
        jBtOk.setBounds(20, 300, 90, 30);

        jBtPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/first-icon.png"))); // NOI18N
        jBtPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPrimeiroActionPerformed(evt);
            }
        });
        jBtPrimeiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtPrimeiroKeyPressed(evt);
            }
        });
        jPnlBusca.add(jBtPrimeiro);
        jBtPrimeiro.setBounds(200, 300, 71, 30);

        jBtAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/previous-icon.png"))); // NOI18N
        jBtAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAnteriorActionPerformed(evt);
            }
        });
        jBtAnterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtAnteriorKeyPressed(evt);
            }
        });
        jPnlBusca.add(jBtAnterior);
        jBtAnterior.setBounds(270, 300, 71, 30);

        jBtProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/next-icon.png"))); // NOI18N
        jBtProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtProximoActionPerformed(evt);
            }
        });
        jBtProximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtProximoKeyPressed(evt);
            }
        });
        jPnlBusca.add(jBtProximo);
        jBtProximo.setBounds(340, 300, 71, 30);

        jBtUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/last-icon.png"))); // NOI18N
        jBtUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtUltimoActionPerformed(evt);
            }
        });
        jBtUltimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtUltimoKeyPressed(evt);
            }
        });
        jPnlBusca.add(jBtUltimo);
        jBtUltimo.setBounds(410, 300, 71, 30);

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
        jPnlBusca.add(jBtCancelar);
        jBtCancelar.setBounds(560, 300, 90, 30);

        jPnlPrincipal.add(jPnlBusca, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFldBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldBuscaActionPerformed

    private void jFldBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldBuscaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            if(jTablePrincipal.getRowCount() > 0){
                jTablePrincipal.requestFocus();
                jTablePrincipal.addRowSelectionInterval(0, 0);
            }
        }
    }//GEN-LAST:event_jFldBuscaKeyPressed

    private void jFldBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldBuscaKeyReleased
        BuscaParametro(jFldBusca.getText());
    }//GEN-LAST:event_jFldBuscaKeyReleased

    private void jTablePrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePrincipalMouseClicked

        selecionada = jTablePrincipal.getSelectedRow();
        if(evt.getClickCount() == 2){
            if(selecionada == -1){
                return;
            }

            jBtOk.doClick();
            
        }
    }//GEN-LAST:event_jTablePrincipalMouseClicked

    private void jTablePrincipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTablePrincipalKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtOk.doClick();
        }
    }//GEN-LAST:event_jTablePrincipalKeyPressed

    private void jBtOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtOkActionPerformed
        selecionada = jTablePrincipal.getSelectedRow();
           
        sCOD      = jTablePrincipal.getValueAt(selecionada, 0).toString();
        sID_CARGA = jTablePrincipal.getValueAt(selecionada, 1).toString();
        sTIPO     = jTablePrincipal.getValueAt(selecionada, 2).toString();
        
        System.out.println("sCOD : "      + sCOD);     
        System.out.println("sID_CARGA : " + sID_CARGA);   
        System.out.println("sTIPO : "     + sTIPO);  
        this.dispose();
    }//GEN-LAST:event_jBtOkActionPerformed

    private void jBtOkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtOkKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtOk.doClick();
        }

        if(evt.getKeyCode() == evt.VK_RIGHT){
            jBtPrimeiro.requestFocus();
        }

        if(evt.getKeyCode() == evt.VK_LEFT){
            jBtCancelar.requestFocus();
        }
    }//GEN-LAST:event_jBtOkKeyPressed

    private void jBtPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPrimeiroActionPerformed
        //Se o numero de linhas da tabela for 0
        if(jTablePrincipal.getRowCount() > 0){
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

    private void jBtPrimeiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtPrimeiroKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtPrimeiro.doClick();
        }

        if(evt.getKeyCode() == evt.VK_RIGHT){
            jBtAnterior.requestFocus();
        }

        if(evt.getKeyCode() == evt.VK_LEFT){
            jBtOk.requestFocus();
        }
    }//GEN-LAST:event_jBtPrimeiroKeyPressed

    private void jBtAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAnteriorActionPerformed
        selecionada = jTablePrincipal.getSelectedRow();
        //Verifica se a tabela possui mais de 0 linhas
        if(jTablePrincipal.getRowCount() > 0){
            //se a selecionada for diferente de -1  e 0
            if(selecionada != -1 && selecionada != 0){
                //Foca a barra de rolagem
                jScrollPane1.requestFocus();
                //Seleciona a linha anterior
                jTablePrincipal.setRowSelectionInterval(selecionada -1, selecionada -1);
                //Seta a value da barra de rolagem para acompanhar a linha selecionada
                jScrollPane1.getVerticalScrollBar().setValue(jTablePrincipal.getRowHeight() * jTablePrincipal.getSelectedRow());
                jBtPrimeiro.setEnabled(true);
                jBtAnterior.setEnabled(true);
                jBtProximo.setEnabled(true);
                jBtUltimo.setEnabled(true);

                //Se a linha selecionada for igual a zero
            }else if(selecionada == 0){
                //seta as linhas e a os botoes
                jTablePrincipal.setRowSelectionInterval(0, 0);
                jBtPrimeiro.setEnabled(false);
                jBtAnterior.setEnabled(false);
                jBtProximo.setEnabled(true);
                jBtUltimo.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jBtAnteriorActionPerformed

    private void jBtAnteriorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtAnteriorKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtAnterior.doClick();
        }

        if(evt.getKeyCode() == evt.VK_RIGHT){
            jBtProximo.requestFocus();
        }

        if(evt.getKeyCode() == evt.VK_LEFT){
            jBtPrimeiro.requestFocus();
        }
    }//GEN-LAST:event_jBtAnteriorKeyPressed

    private void jBtProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtProximoActionPerformed
        selecionada = jTablePrincipal.getSelectedRow();
        //Se o numeros de linhas da tabela for maior que zero
        if(jTablePrincipal.getRowCount() > 0){
            //Se a linha selecionada for diferente de -1 e do total de linhas - 1
            if(selecionada != -1 && selecionada != jTablePrincipal.getRowCount() -1){
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
            }else if(selecionada == jTablePrincipal.getRowCount() -1){
                //selecionada a ultima linha
                jTablePrincipal.setRowSelectionInterval(jTablePrincipal.getRowCount() -1, jTablePrincipal.getRowCount() -1);
                jBtPrimeiro.setEnabled(true);
                jBtAnterior.setEnabled(true);
                jBtProximo.setEnabled(false);
                jBtUltimo.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jBtProximoActionPerformed

    private void jBtProximoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtProximoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtProximo.doClick();
        }

        if(evt.getKeyCode() == evt.VK_RIGHT){
            jBtUltimo.requestFocus();
        }

        if(evt.getKeyCode() == evt.VK_LEFT){
            jBtAnterior.requestFocus();
        }
    }//GEN-LAST:event_jBtProximoKeyPressed

    private void jBtUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtUltimoActionPerformed
        selecionada = jTablePrincipal.getSelectedRow();
        //Se o total de linhas da tabela for maior que 0
        if(jTablePrincipal.getRowCount() > 0){
            //Seleciona a ultima linha
            jTablePrincipal.setRowSelectionInterval(jTablePrincipal.getRowCount() - 1, jTablePrincipal.getRowCount() -1);
            //Seta a value da barra de rolagem para acompanhar a linha selecionada
            jScrollPane1.getVerticalScrollBar().setValue(jScrollPane1.getVerticalScrollBar().getMaximum());
            jBtPrimeiro.setEnabled(true);
            jBtAnterior.setEnabled(true);
            jBtProximo.setEnabled(false);
            jBtUltimo.setEnabled(false);
        }
    }//GEN-LAST:event_jBtUltimoActionPerformed

    private void jBtUltimoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtUltimoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtUltimo.doClick();
        }

        if(evt.getKeyCode() == evt.VK_RIGHT){
            jBtCancelar.requestFocus();
        }

        if(evt.getKeyCode() == evt.VK_LEFT){
            jBtProximo.requestFocus();
        }
    }//GEN-LAST:event_jBtUltimoKeyPressed

    private void jBtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtCancelarActionPerformed

    private void jBtCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtCancelarKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtCancelar.doClick();
        }

        if(evt.getKeyCode() == evt.VK_RIGHT){
            jBtOk.requestFocus();
        }

        if(evt.getKeyCode() == evt.VK_LEFT){
            jBtUltimo.requestFocus();
        }
    }//GEN-LAST:event_jBtCancelarKeyPressed

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
            java.util.logging.Logger.getLogger(TelaBuscaUnidadeCargaVazia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaUnidadeCargaVazia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaUnidadeCargaVazia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaUnidadeCargaVazia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscaUnidadeCargaVazia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAnterior;
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jBtOk;
    private javax.swing.JButton jBtPrimeiro;
    private javax.swing.JButton jBtProximo;
    private javax.swing.JButton jBtUltimo;
    private javax.swing.JTextField jFldBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPnlBusca;
    private javax.swing.JPanel jPnlPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePrincipal;
    // End of variables declaration//GEN-END:variables

    public void DefinirFormulario() {
        setTitle("Pesquisar");
        setSize(685, 370);
        jPnlPrincipal.setSize(685, 370);
        jPnlBusca.setSize(685,370);
        jPnlBusca.setVisible(false);
        setLocationRelativeTo(this);
        setResizable(false);
        setModal(true);
        
        jTablePrincipal.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        for (int col = 0; col < jTablePrincipal.getColumnCount(); col++) {
            jTablePrincipal.getColumnModel().getColumn(col).setHeaderRenderer(new MeuRenderizador());
        }
        
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
         
        jTablePrincipal.getColumnModel().getColumn(0).setMinWidth(60);
        jTablePrincipal.getColumnModel().getColumn(0).setMaxWidth(60);
        jTablePrincipal.getColumnModel().getColumn(0).setCellRenderer(centro);
        
        jTablePrincipal.getColumnModel().getColumn(1).setMinWidth(415);
        jTablePrincipal.getColumnModel().getColumn(1).setMaxWidth(415);
        jTablePrincipal.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        
        jTablePrincipal.getColumnModel().getColumn(2).setMinWidth(200);
        jTablePrincipal.getColumnModel().getColumn(2).setMaxWidth(200);
        jTablePrincipal.getColumnModel().getColumn(2).setCellRenderer(esquerda);
       
        //Adiciona as teclas de atalho  ALT + para os seguintes botões
        jBtOk.setMnemonic(java.awt.event.KeyEvent.VK_O);
        jBtCancelar.setMnemonic(java.awt.event.KeyEvent.VK_C);

    }
    
    public void LimpaTabela() {
        DefaultTableModel tableModel = (DefaultTableModel) jTablePrincipal.getModel();
        tableModel.setNumRows(0);
    }
    
    public void CarregaTudo() {
        try {
            Conectar.ConectarBD();
            LimpaTabela();
            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) jTablePrincipal.getModel();
            Conectar.result = Conectar.stam.executeQuery("select * from MDFE_CAD_UN_CARGA_VAZIA where rgevento <> '3'");
            while (Conectar.result.next()) {
                dtm.addRow(new Object[]{
                    Conectar.result.getInt("CODIGO"),
                    Conectar.result.getString("ID_UN_CARGA"),
                    VerificaTipoCarga(Conectar.result.getString("TP_UN_CARGA"))
                });

            }
            Conectar.DesconectarBD();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados na tabela... \n" + e.getLocalizedMessage());
        }
    }
    
    public void BuscaParametro(String busca) {
        try {
            if(busca.length() == 0){
                sql = "where CODIGO is not null";
            }else{
                sql = "where ID_UN_CARGA like '" + busca + "%'";
            }
            
            
            LimpaTabela();
            Conectar.ConectarBD();
            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) jTablePrincipal.getModel();
            Conectar.result = Conectar.stam.executeQuery("select * from MDFE_CAD_UN_CARGA_VAZIA " + sql + " and RGEVENTO  <> '3' order by CODIGO");
            while (Conectar.result.next()) {
                dtm.addRow(new Object[]{
                    Conectar.result.getInt("CODIGO"),
                    Conectar.result.getString("ID_UN_CARGA"),
                    VerificaTipoCarga(Conectar.result.getString("TP_UN_CARGA"))
                });

            }
            Conectar.DesconectarBD();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error... \n" + e.getLocalizedMessage());
        }
    }
    
    public String VerificaTipoCarga(String tipo) {
        String desc = "";
        if (tipo.equals("1")) {
            desc = "Container";
        } else if (tipo.equals("2")) {
            desc = "ULD";
        } else if (tipo.equals("3")) {
            desc = "Pallet";
        } else if (tipo.equals("4")) {
            desc = "Outros";
        }

        return desc;
    }
    
    //Evento para sair da tela com a tecla esc
    //Chamar evento no construtor principal da classe
    public void SairEsc() {
        KeyStroke ks = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, true);
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(ks, "esc");
        getRootPane().getActionMap().put("esc", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(jPnlBusca.isVisible() == true){
                    dispose();
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
            setFont(getFont().deriveFont(Font.BOLD));
            setHorizontalAlignment(SwingConstants.LEFT);

            setText(value.toString());

            return this;
        }
    }
    
}
