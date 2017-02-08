
package movimentacao;

import ConexaoDB.Conectar;
import Utilitarios.LimitaField;
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
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class TelaAverbacao extends javax.swing.JDialog {

    String sDAD_CODIGO, sCOD_SEGURO = "";
    
    public TelaAverbacao() {
        initComponents();
        DefinirFormulario();
        SairEsc();
    }
    
    public TelaAverbacao(String DAD_CODIGO, String COD_SEGURO) {
        initComponents();
        DefinirFormulario();
        CarregaTudo(DAD_CODIGO, COD_SEGURO);
        SairEsc();
        
        this.sDAD_CODIGO = DAD_CODIGO;
        this.sCOD_SEGURO = COD_SEGURO;
    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPnlPrincipal = new javax.swing.JPanel();
    jBtOk = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTablePrincipal = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    jFldNrAverbacao = new javax.swing.JTextField();
    jBtIncluir = new javax.swing.JButton();
    jBtExcluir = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jBtOk.setText("Sair");
    jBtOk.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtOkActionPerformed(evt);
      }
    });

    jTablePrincipal.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
      },
      new String [] {
        "", "Averbação"
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
        java.lang.Boolean.class, java.lang.Object.class
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

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
    jLabel1.setText("Numéro da Averbação:");

    jFldNrAverbacao.setDocument(new LimitaField(40, 1));
    jFldNrAverbacao.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jFldNrAverbacaoKeyPressed(evt);
      }
    });

    jBtIncluir.setText("Incluir");
    jBtIncluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtIncluirActionPerformed(evt);
      }
    });

    jBtExcluir.setText("Excluir");
    jBtExcluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtExcluirActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPnlPrincipalLayout = new javax.swing.GroupLayout(jPnlPrincipal);
    jPnlPrincipal.setLayout(jPnlPrincipalLayout);
    jPnlPrincipalLayout.setHorizontalGroup(
      jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPnlPrincipalLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlPrincipalLayout.createSequentialGroup()
            .addComponent(jBtIncluir)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jBtExcluir)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jBtOk, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
          .addGroup(jPnlPrincipalLayout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jFldNrAverbacao)))
        .addContainerGap())
    );
    jPnlPrincipalLayout.setVerticalGroup(
      jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPnlPrincipalLayout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addGroup(jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(jFldNrAverbacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        .addGap(8, 8, 8)
        .addGroup(jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jBtIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jBtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jBtOk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
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

    private void jBtOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtOkActionPerformed
        dispose();
    }//GEN-LAST:event_jBtOkActionPerformed

    private void jFldNrAverbacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldNrAverbacaoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jBtIncluir.requestFocus();
        }
    }//GEN-LAST:event_jFldNrAverbacaoKeyPressed

    private void jBtIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtIncluirActionPerformed
        if(VerificaField() == true){
            Inserir(sDAD_CODIGO, sCOD_SEGURO, jFldNrAverbacao.getText());
            jFldNrAverbacao.setText("");
            jFldNrAverbacao.requestFocus();
        }
    }//GEN-LAST:event_jBtIncluirActionPerformed

    private void jTablePrincipalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTablePrincipalPropertyChange
        int Selecinada = 0;
        for (int linha = 0; linha < jTablePrincipal.getRowCount(); linha++) {
            if(((boolean)jTablePrincipal.getValueAt(linha, 0)) == true){
                Selecinada++;
            }
        }
        
        if(Selecinada == 0){
           jBtExcluir.setEnabled(false);
        }else{
            jBtExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_jTablePrincipalPropertyChange

    private void jBtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExcluirActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Deseja excluir a(s) averbação(ões) selecionada(s)?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION){
            DeletarSeguro(sDAD_CODIGO, sCOD_SEGURO);
        }
    }//GEN-LAST:event_jBtExcluirActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAverbacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAverbacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAverbacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAverbacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaAverbacao().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jBtExcluir;
  private javax.swing.JButton jBtIncluir;
  private javax.swing.JButton jBtOk;
  private javax.swing.JTextField jFldNrAverbacao;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPnlPrincipal;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTablePrincipal;
  // End of variables declaration//GEN-END:variables
    
    public void DefinirFormulario(){
        
        setTitle("Averbações do Seguro");
        
        setSize(550, 310);
        
        setLocationRelativeTo(null);
        
        setModal(true);
        
        for (int col = 0; col < jTablePrincipal.getColumnCount(); col++) {
            jTablePrincipal.getColumnModel().getColumn(col).setHeaderRenderer(new MeuRenderizador());
        }
        
        jTablePrincipal.getColumnModel().getColumn(0).setMinWidth(30);
        jTablePrincipal.getColumnModel().getColumn(0).setMaxWidth(30);
        
        jBtOk.setMnemonic(KeyEvent.VK_O);
    }
    
    public void LimpaTabela(){
        DefaultTableModel dtm = (DefaultTableModel) jTablePrincipal.getModel();
        dtm.setNumRows(0);
    }
    
    public void CarregaTudo(String DadCodigo, String CodSeguro){
        try{
            Conectar.ConectarBD();
            LimpaTabela();
            Conectar.result = Conectar.stam.executeQuery("SELECT * FROM MDFE_AVERBACAO WHERE DAD_CODIGO = '"+ DadCodigo +"' AND COD_SEGURO = '"+ CodSeguro +"' ");
            DefaultTableModel dtm = (DefaultTableModel) jTablePrincipal.getModel();
            while(Conectar.result.next()){
                dtm.addRow(new Object[]{
                    false,
                    Conectar.result.getString("NR_AVER")
                });
            }
            
            Conectar.DesconectarBD();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados na tabela...\n" + e.getLocalizedMessage());
        }
    }
    
    public void Inserir(String DadCodigo, String CodSeguro, String NrAver){
        try{
            Conectar.ConectarBD();
            
            System.out.println("INSERT INTO MDFE_AVERBACAO "
                    + "(DAD_CODIGO, COD_SEGURO, NR_AVER)"
                    + "values('"+ DadCodigo +"', '"+ CodSeguro +"', '"+ NrAver +"' )"
            );
            
            Conectar.stam.executeUpdate("INSERT INTO MDFE_AVERBACAO "
                    + "(DAD_CODIGO, COD_SEGURO, NR_AVER)"
                    + "values('"+ DadCodigo +"', '"+ CodSeguro +"', '"+ NrAver +"' )"
            );
            
            Conectar.DesconectarBD();
            
            CarregaTudo(DadCodigo, CodSeguro);
           
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir...\n" + e.getLocalizedMessage());
        }
    }
    
    public void DeletarSeguro(String DadCodigo, String CodSeguro){
        try{
            Conectar.ConectarBD();
            
            for (int linha = 0; linha < jTablePrincipal.getRowCount(); linha++) {
                if(((boolean)jTablePrincipal.getValueAt(linha, 0)) == true){
                    System.out.println("DELETE FROM MDFE_AVERBACAO WHERE DAD_CODIGO = '" + DadCodigo + "' AND COD_SEGURO = '" + CodSeguro + "' "
                            + "AND NR_AVER = '"+ jTablePrincipal.getValueAt(linha, 1) +"' ");

                    Conectar.stam.executeUpdate("DELETE FROM MDFE_AVERBACAO WHERE DAD_CODIGO = '" + DadCodigo + "' AND COD_SEGURO = '" + CodSeguro + "' "
                            + "AND NR_AVER = '"+ jTablePrincipal.getValueAt(linha, 1) +"' ");
                }
            }
            
            Conectar.DesconectarBD();
            
            CarregaTudo(DadCodigo, CodSeguro);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao deletar...\n" + e.getLocalizedMessage());
        }
    }
    
    public boolean VerificaField(){
        for (int linha = 0; linha < jTablePrincipal.getRowCount(); linha++) {
            if(jFldNrAverbacao.getText().equals(jTablePrincipal.getValueAt(linha, 1).toString())){
                JOptionPane.showMessageDialog(null, "Número da Averbação já inserido!");
                jFldNrAverbacao.requestFocus();
                return false;
            }
        }
        
        if(jFldNrAverbacao.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Insira o número da averbação!");
            jFldNrAverbacao.requestFocus();
            return false;
        }else{
            return true;
        }
    }
    
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
