/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesquisa;

import ConexaoDB.Conectar;
import Utilitarios.LimitaField;
import cadastro.TelaEmitente;
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
public class TelaBuscaFilial extends javax.swing.JDialog {

    public String sCOD = "";
    public String sDESC= "",sCNPJ= "",sIE = "";
    
    
    Integer selecionada;
    String sql, ordnar; 
    DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
    DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
    DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
    
    public TelaBuscaFilial() {
        initComponents();
        DefinirFormulario();
        CarregaTudoFilial();
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
        jFldBuscaFilial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFilial = new javax.swing.JTable();
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
        jLabel1.setBounds(20, 0, 80, 30);

        jFldBuscaFilial.setDocument(new LimitaField(100, 0)
        );
        jFldBuscaFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFldBuscaFilialActionPerformed(evt);
            }
        });
        jFldBuscaFilial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldBuscaFilialKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFldBuscaFilialKeyReleased(evt);
            }
        });
        jPnlBusca.add(jFldBuscaFilial);
        jFldBuscaFilial.setBounds(20, 20, 390, 25);

        jTableFilial.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTableFilial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Código", "Nome do Emissor", "Endereço", "Bairro", "Cidade", "UF", "CNPJ", "IE", "Telefone"
            }
        ){
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            };

        });
        jTableFilial.getTableHeader().setResizingAllowed(false);
        jTableFilial.getTableHeader().setReorderingAllowed(false);
        jTableFilial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFilialMouseClicked(evt);
            }
        });
        jTableFilial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableFilialKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFilial);

        jPnlBusca.add(jScrollPane1);
        jScrollPane1.setBounds(0, 60, 680, 230);

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
            .addComponent(jPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFldBuscaFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldBuscaFilialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldBuscaFilialActionPerformed

    private void jFldBuscaFilialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldBuscaFilialKeyReleased
        BuscaFilial(jFldBuscaFilial.getText());
    }//GEN-LAST:event_jFldBuscaFilialKeyReleased

    private void jTableFilialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFilialMouseClicked
        selecionada = jTableFilial.getSelectedRow();
        if(evt.getClickCount() == 2){
            jBtOk.doClick();
            this.dispose();
        }
    }//GEN-LAST:event_jTableFilialMouseClicked

    private void jBtOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtOkActionPerformed
        selecionada = jTableFilial.getSelectedRow();
        sCOD  = (jTableFilial.getValueAt(selecionada, 0).toString());
        sDESC = jTableFilial.getValueAt(selecionada, 1).toString();
        sCNPJ = jTableFilial.getValueAt(selecionada, 6).toString();
        sIE   = jTableFilial.getValueAt(selecionada, 7).toString();     
        
        this.dispose();
    }//GEN-LAST:event_jBtOkActionPerformed

    private void jBtPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPrimeiroActionPerformed
        //Se o numero de linhas da tabela for 0
        if(jTableFilial.getRowCount() > 0){
            //Foca a barra de rolagem
            jScrollPane1.requestFocus();
            //Foca na tabela
            jTableFilial.requestFocus();
            //Seta a value da barra de rolagem para 1
            jScrollPane1.getVerticalScrollBar().setValue(1);
            //seleciona a primeira linha
            jTableFilial.addRowSelectionInterval(0, 0);
            //habilita e desablita dos respectivos botões
            jBtPrimeiro.setEnabled(false);
            jBtAnterior.setEnabled(false);
            jBtProximo.setEnabled(true);
            jBtUltimo.setEnabled(true);
        }
    }//GEN-LAST:event_jBtPrimeiroActionPerformed

    private void jBtAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAnteriorActionPerformed
        selecionada = jTableFilial.getSelectedRow();
        //Verifica se a tabela possui mais de 0 linhas
        if(jTableFilial.getRowCount() > 0){
            //se a selecionada for diferente de -1  e 0
            if(selecionada != -1 && selecionada != 0){
                //Foca a barra de rolagem
                jScrollPane1.requestFocus();
                //Seleciona a linha anterior
                jTableFilial.setRowSelectionInterval(selecionada -1, selecionada -1);
                //Seta a value da barra de rolagem para acompanhar a linha selecionada
                jScrollPane1.getVerticalScrollBar().setValue(jTableFilial.getRowHeight() * jTableFilial.getSelectedRow());
                jBtPrimeiro.setEnabled(true);
                jBtAnterior.setEnabled(true);
                jBtProximo.setEnabled(true);
                jBtUltimo.setEnabled(true);
                
                //Se a linha selecionada for igual a zero
            }else if(selecionada == 0){
                //seta as linhas e a os botoes
                jTableFilial.setRowSelectionInterval(0, 0);
                jBtPrimeiro.setEnabled(false);
                jBtAnterior.setEnabled(false);
                jBtProximo.setEnabled(true);
                jBtUltimo.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jBtAnteriorActionPerformed

    private void jBtProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtProximoActionPerformed
        selecionada = jTableFilial.getSelectedRow();
        //Se o numeros de linhas da tabela for maior que zero
        if(jTableFilial.getRowCount() > 0){
            //Se a linha selecionada for diferente de -1 e do total de linhas - 1
            if(selecionada != -1 && selecionada != jTableFilial.getRowCount() -1){
                //Foca na barra de rolagem da tabela
                jScrollPane1.requestFocus();
                //Selecionada a proxima linha
                jTableFilial.setRowSelectionInterval(selecionada + 1, selecionada + 1);
                //Seta a value da barra de rolagem para que acompanhe a linha selecionada
                jScrollPane1.getVerticalScrollBar().setValue(jTableFilial.getRowHeight() * jTableFilial.getSelectedRow());
                jBtPrimeiro.setEnabled(true);
                jBtAnterior.setEnabled(true);
                jBtProximo.setEnabled(true);
                jBtUltimo.setEnabled(true);
                //Se a linha selecionada tiver o mesmo valor do total de linhas da tabela -1
            }else if(selecionada == jTableFilial.getRowCount() -1){
                //selecionada a ultima linha
                jTableFilial.setRowSelectionInterval(jTableFilial.getRowCount() -1, jTableFilial.getRowCount() -1);
                jBtPrimeiro.setEnabled(true);
                jBtAnterior.setEnabled(true);
                jBtProximo.setEnabled(false);
                jBtUltimo.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jBtProximoActionPerformed

    private void jBtUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtUltimoActionPerformed
        selecionada = jTableFilial.getSelectedRow();
        //Se o total de linhas da tabela for maior que 0
        if(jTableFilial.getRowCount() > 0){
            //Seleciona a ultima linha
            jTableFilial.setRowSelectionInterval(jTableFilial.getRowCount() - 1, jTableFilial.getRowCount() -1);
            //Seta a value da barra de rolagem para acompanhar a linha selecionada
            jScrollPane1.getVerticalScrollBar().setValue(jScrollPane1.getVerticalScrollBar().getMaximum());
            jBtPrimeiro.setEnabled(true);
            jBtAnterior.setEnabled(true);
            jBtProximo.setEnabled(false);
            jBtUltimo.setEnabled(false);
        }
    }//GEN-LAST:event_jBtUltimoActionPerformed

    private void jBtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtCancelarActionPerformed

    private void jFldBuscaFilialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldBuscaFilialKeyPressed
        //VERIFICA SE USOU O ENTER
        if(evt.getKeyCode() == evt.VK_ENTER){
            if(jTableFilial.getRowCount() > 0){
                jTableFilial.requestFocus();
                jTableFilial.addRowSelectionInterval(0, 0);
            }
        }
        
    }//GEN-LAST:event_jFldBuscaFilialKeyPressed

    private void jTableFilialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableFilialKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtOk.doClick();
        }
    }//GEN-LAST:event_jTableFilialKeyPressed

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
            java.util.logging.Logger.getLogger(TelaBuscaFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscaFilial().setVisible(true);
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
    private javax.swing.JTextField jFldBuscaFilial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPnlBusca;
    private javax.swing.JPanel jPnlPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFilial;
    // End of variables declaration//GEN-END:variables

    public void DefinirFormulario(){
        setTitle("Pesquisar");
        setSize(685, 370);
        jPnlPrincipal.setSize(685, 370);
        jPnlBusca.setSize(685,370);
        jPnlBusca.setVisible(true);
        setLocationRelativeTo(this);
        setResizable(false);
        setModal(true);
        
         
        jTableFilial.setAutoResizeMode(jTableFilial.AUTO_RESIZE_OFF);
        //Só permite que uma linha seja selecionada por vez
        jTableFilial.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        for (int col = 0; col < jTableFilial.getColumnCount(); col++) {
            jTableFilial.getColumnModel().getColumn(col).setHeaderRenderer(new TelaBuscaFilial.MeuRenderizador());
        }
        
        
        jTableFilial.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 11));
        jTableFilial.getTableHeader().setOpaque(false);
        jTableFilial.getTableHeader().setForeground(Color.white);
        jTableFilial.getTableHeader().setBackground(Color.blue);
        
        jTableFilial.getTableHeader().setOpaque(false);
        jTableFilial.getTableHeader().setForeground(Color.white);
        jTableFilial.getTableHeader().setBackground(Color.blue);
        
        jTableFilial.getColumnModel().getColumn(0).setMinWidth(90);
        jTableFilial.getColumnModel().getColumn(0).setMaxWidth(90);
        jTableFilial.getColumnModel().getColumn(0).setCellRenderer(centro);
        
        jTableFilial.getColumnModel().getColumn(1).setMinWidth(400);
        jTableFilial.getColumnModel().getColumn(1).setMaxWidth(600);
        jTableFilial.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        
        
        jTableFilial.getColumnModel().getColumn(2).setMinWidth(400);
        jTableFilial.getColumnModel().getColumn(2).setMaxWidth(700);
        jTableFilial.getColumnModel().getColumn(2).setCellRenderer(esquerda);
        
        jTableFilial.getColumnModel().getColumn(3).setMinWidth(400);
        jTableFilial.getColumnModel().getColumn(3).setMaxWidth(400);
        jTableFilial.getColumnModel().getColumn(3).setCellRenderer(esquerda);
        
        
      
                    
        
        jTableFilial.getColumnModel().getColumn(4).setMinWidth(500);
        jTableFilial.getColumnModel().getColumn(4).setMaxWidth(600);
        jTableFilial.getColumnModel().getColumn(4).setCellRenderer(esquerda);
        
        jTableFilial.getColumnModel().getColumn(5).setMinWidth(100);
        jTableFilial.getColumnModel().getColumn(5).setMaxWidth(400);
        jTableFilial.getColumnModel().getColumn(5).setCellRenderer(esquerda);
        
        jTableFilial.getColumnModel().getColumn(6).setMinWidth(600);
        jTableFilial.getColumnModel().getColumn(6).setMaxWidth(800);
        jTableFilial.getColumnModel().getColumn(6).setCellRenderer(esquerda);
        
        jTableFilial.getColumnModel().getColumn(7).setMinWidth(600);
        jTableFilial.getColumnModel().getColumn(7).setMaxWidth(800);
        jTableFilial.getColumnModel().getColumn(7).setCellRenderer(esquerda);
        
        jTableFilial.getColumnModel().getColumn(8).setMinWidth(500);
        jTableFilial.getColumnModel().getColumn(8).setMaxWidth(700);
        jTableFilial.getColumnModel().getColumn(8).setCellRenderer(esquerda);
        
        //Adiciona as teclas de atalho  ALT + para os seguintes botões
        jBtOk.setMnemonic(java.awt.event.KeyEvent.VK_O);
        jBtCancelar.setMnemonic(java.awt.event.KeyEvent.VK_C);
    }
    
    public void LimpaTabela(){
        DefaultTableModel dtm = (DefaultTableModel) jTableFilial.getModel();
        dtm.setNumRows(0);
    }
    
    
       
    
    public void CarregaTudoFilial() {
        try {
            LimpaTabela();
            Conectar.ConectarBD();
            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) jTableFilial.getModel();
            Conectar.result = Conectar.stam.executeQuery("select CODFIL, NOMFIL, ENDFIL, BAIFIL, CIDFIL, UFFIL, CNPJFIL, IEFIL, TELFIL from TABFIL where RGEVENTO <> '3' order by CODFIL ");
            while (Conectar.result.next()) {
                dtm.addRow(new Object[]{
                    Conectar.result.getInt("CODFIL"),
                    Conectar.result.getString("NOMFIL"),
                     Conectar.result.getString("ENDFIL"),
                    Conectar.result.getString("BAIFIL"),
                    Conectar.result.getString("CIDFIL"),
                    Conectar.result.getString("UFFIL"),
                     Conectar.result.getString("CNPJFIL"),
                    Conectar.result.getString("IEFIL"),
                     Conectar.result.getString("TELFIL"),
                    
                    
                   
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error... " + e.getLocalizedMessage());
        }

    }
    
    public void BuscaFilial(String nomfil) {
        try {
            sql = "";
            if (!"".equals(nomfil)) {
                sql = "where NOMFIL like '%" + nomfil + "%'";
            } else if ("".equals(nomfil)) {
                sql = "where NOMFIL is not null";
            }

            LimpaTabela();
            Conectar.ConectarBD();
            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) jTableFilial.getModel();
            Conectar.result = Conectar.stam.executeQuery("select * from TABFIL " + sql + " and RGEVENTO <> '3'");
            while (Conectar.result.next()) {
                dtm.addRow(new Object[]{
                    Conectar.result.getInt("CODFIL"),
                    Conectar.result.getString("NOMFIL"),
                     Conectar.result.getString("ENDFIL"),
                    Conectar.result.getString("BAIFIL"),
                    Conectar.result.getString("CIDFIL"),
                    Conectar.result.getString("UFFIL"),
                     Conectar.result.getString("CNPJFIL"),
                    Conectar.result.getString("IEFIL"),
                     Conectar.result.getString("TELFIL"),
                });

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error... \n" + e.getLocalizedMessage());
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
