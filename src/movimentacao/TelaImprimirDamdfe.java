
package movimentacao;

import ConexaoDB.Conectar;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


public class TelaImprimirDamdfe extends javax.swing.JDialog {

    String sMODAL = "", sEMISSAO = "", sDAD_CODIGO = ""; 
    
    public TelaImprimirDamdfe() {
        initComponents();
        
        sMODAL = "Rodoviário";
        sEMISSAO = "Normal";
        sDAD_CODIGO = "1";
        
        DefinirFormulario();      
        SairEsc();
    }
    
    public TelaImprimirDamdfe(String DadCodigo, String Emissao, String Modal) {
        initComponents();
        
        sMODAL = Modal;
        sEMISSAO = Emissao;
        sDAD_CODIGO = DadCodigo;
        
        DefinirFormulario();
        SairEsc();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCmbBxTpPapel = new javax.swing.JComboBox<>();
        jBtImprimir = new javax.swing.JButton();
        jBtSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPnlPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Opções para Impressão da DAMDFE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Tipo de Papel:");

        jCmbBxTpPapel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jBtImprimir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtImprimir.setText("Imprimir DAMDFE");
        jBtImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtImprimirActionPerformed(evt);
            }
        });

        jBtSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtSair.setText("Sair");

        javax.swing.GroupLayout jPnlPrincipalLayout = new javax.swing.GroupLayout(jPnlPrincipal);
        jPnlPrincipal.setLayout(jPnlPrincipalLayout);
        jPnlPrincipalLayout.setHorizontalGroup(
            jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlPrincipalLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlPrincipalLayout.createSequentialGroup()
                        .addComponent(jBtImprimir)
                        .addGap(18, 18, 18)
                        .addComponent(jBtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addComponent(jCmbBxTpPapel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPnlPrincipalLayout.setVerticalGroup(
            jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCmbBxTpPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jBtImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtImprimirActionPerformed
        JasperPrint print = null;
        //Condicao para a modalidade
        if(sMODAL.equals("Rodoviário")){
            //Condicao para a forma de emissao
            if(sEMISSAO.equals("Normal")){
                //Condicao para o tipo de relatorio
                if(jCmbBxTpPapel.getSelectedIndex() == 0){
                    print = GerarRelatorio(sDAD_CODIGO, "DAMDFE_RODO_RETRATO");
                }else if(jCmbBxTpPapel.getSelectedIndex() == 1){
                    print = GerarRelatorio(sDAD_CODIGO, "DAMDFE");
                }
            }else if(sEMISSAO.equals("Contingência")){
                print = GerarRelatorio(sDAD_CODIGO, "DAMDFE_RODO_CONT");
            }
        }else if(sMODAL.equals("Aquaviário")){
            if(sEMISSAO.equals("Normal")){
                if(jCmbBxTpPapel.getSelectedIndex() == 0){
                    print = GerarRelatorio(sDAD_CODIGO, "DAMDFE_AQUA");
                }else if(jCmbBxTpPapel.getSelectedIndex() == 1){
                    print = GerarRelatorio(sDAD_CODIGO, "DAMDFE_AQUA_PAISAG");
                }
            }else if(sEMISSAO.equals("Contingência")){
                print = GerarRelatorio(sDAD_CODIGO, "DAMDFE_AQUA_CONT");
            }
        }
        
        VisualizarRelatorio(print);
    }//GEN-LAST:event_jBtImprimirActionPerformed

    
    public static void main(String args[]) {
        try {
            
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaImprimirDamdfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaImprimirDamdfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaImprimirDamdfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaImprimirDamdfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaImprimirDamdfe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtImprimir;
    private javax.swing.JButton jBtSair;
    private javax.swing.JComboBox<String> jCmbBxTpPapel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPnlPrincipal;
    // End of variables declaration//GEN-END:variables

    public void DefinirFormulario(){
        
        setSize(400, 170);
        
        setResizable(false);
        
        setTitle("Imprimir DAMDFE");
        
        setLocationRelativeTo(null);
        
        setModal(true);
        
        jBtImprimir.setMnemonic(KeyEvent.VK_I);
        jBtSair.setMnemonic(KeyEvent.VK_S);
        
        //Adciona os tipos de folha de acordo com o tipo de edição
        if(sEMISSAO.equals("Normal")){
            jCmbBxTpPapel.addItem("Retrato (210x297mm)");
            jCmbBxTpPapel.addItem("Paisagem (297x210mm)");
        }else if(sEMISSAO.equals("Contingência")){
            jCmbBxTpPapel.addItem("Paisagem (297x210mm)");
        }
        
    }
    
    //Metodo que chama o visualizador do relatorio em um JFrame
    public void VisualizarRelatorio(JasperPrint print){
        
        //Instacia o visualizador do relatorio
        JasperViewer ver = new JasperViewer(print, false);
        
        //Instancia um jDialog
        JDialog dialog = new JDialog(new javax.swing.JFrame()); 
        
        //Adiciona o visualizador no dialog
        dialog.getContentPane().add(ver.getContentPane());
        
        //Organiza os componentes na tela
        dialog.pack();
        
        //Define o título
        dialog.setTitle("DAMDFE - Documento Auxiliar de Manifesto Eletrônico de Documentos Fiscais");
        
        //Define o tamanho
        dialog.setSize(900, 600);
        
        //Deixa modal
        dialog.setModal(true);
        
        //Centraliza a tela
        dialog.setLocationRelativeTo(null);
        
        //Mostra
        dialog.setVisible(true);
        //Maximiza a tela
        //ver.setExtendedState(ver.MAXIMIZED_BOTH);
        
    }
    
    
    public JasperPrint GerarRelatorio(String Dad_Codigo, String Relatorio) {
        JasperPrint print = null;
        try {
            Conectar.ConectarBD();
            //habilita 2 dataset 
            Conectar.con.setHoldability(ResultSet.HOLD_CURSORS_OVER_COMMIT);
            //Pega o caminho do relatório
            InputStream CaminhoRelatorio = getClass().getResourceAsStream("/Relatorio/"+ Relatorio +".jrxml");
            JasperReport report = JasperCompileManager.compileReport(CaminhoRelatorio);
            
            Map mapa = new HashMap<>();            
            //Adiciona o nome dos parametros e os valores
            mapa.put("PrtDAD_CODIGO", Dad_Codigo);
                       
            //Passa o caminho, os parametros mapeados e a conexao para o relatorio
            print = JasperFillManager.fillReport(report, mapa, Conectar.con);

            Conectar.DesconectarBD();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Gerar Relatório\n" + e.getLocalizedMessage());
        }
        
        //Retorna o relatorio pronto para impressao
        return print;
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
