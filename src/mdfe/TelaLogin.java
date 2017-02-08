
package mdfe;

import ClassesFirebird.Tabusu;
import ConexaoDB.Conectar;
import Utilitarios.LimitaField;
import Utilitarios.Utilitarios;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public String NomeUsu, SenhaUsu;
    public Integer CodUsu;
    Utilitarios util = new Utilitarios();
    Tabusu tabusu = new Tabusu();
    
    public TelaLogin() {
        initComponents();
        DefinirFormulario();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPnlPrincipal = new javax.swing.JPanel();
        jPanelLogin = new javax.swing.JPanel();
        jFldUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFldSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jCmbBxFilial = new javax.swing.JComboBox<>();
        JBtConfirmar = new javax.swing.JButton();
        jBtSair = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPnlTrocaDeSenha = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jFldConfirmaSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jFldTrocaSenha = new javax.swing.JPasswordField();
        jBtCancelarTrocaDeSenha = new javax.swing.JButton();
        jBtConfirmarTrocaDeSenha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MDFe");

        JPnlPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        JPnlPrincipal.setLayout(null);

        jPanelLogin.setBackground(new java.awt.Color(204, 204, 255));
        jPanelLogin.setLayout(null);

        jFldUsuario.setDocument(new LimitaField(7, 0));
        jFldUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jFldUsuario.setText("INTER");
        jFldUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jFldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFldUsuarioFocusLost(evt);
            }
        });
        jFldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldUsuarioKeyPressed(evt);
            }
        });
        jPanelLogin.add(jFldUsuario);
        jFldUsuario.setBounds(50, 10, 160, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        jPanelLogin.add(jLabel2);
        jLabel2.setBounds(10, 0, 38, 41);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senha.png"))); // NOI18N
        jPanelLogin.add(jLabel3);
        jLabel3.setBounds(10, 40, 32, 40);

        jFldSenha.setDocument(new LimitaField(7, 1)
        );
        jFldSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jFldSenha.setText("123");
        jFldSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jFldSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFldSenhaFocusLost(evt);
            }
        });
        jFldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldSenhaKeyPressed(evt);
            }
        });
        jPanelLogin.add(jFldSenha);
        jFldSenha.setBounds(50, 50, 160, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/servidor.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanelLogin.add(jLabel4);
        jLabel4.setBounds(20, 80, 29, 40);

        jCmbBxFilial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCmbBxFilial.setForeground(new java.awt.Color(51, 51, 255));
        jPanelLogin.add(jCmbBxFilial);
        jCmbBxFilial.setBounds(50, 90, 260, 25);

        JBtConfirmar.setBackground(new java.awt.Color(0, 0, 102));
        JBtConfirmar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        JBtConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        JBtConfirmar.setText("Confirmar");
        JBtConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtConfirmarActionPerformed(evt);
            }
        });
        JBtConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JBtConfirmarKeyPressed(evt);
            }
        });
        jPanelLogin.add(JBtConfirmar);
        JBtConfirmar.setBounds(30, 140, 100, 30);

        jBtSair.setBackground(new java.awt.Color(0, 0, 102));
        jBtSair.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBtSair.setForeground(new java.awt.Color(255, 255, 255));
        jBtSair.setText("Sair");
        jBtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSairActionPerformed(evt);
            }
        });
        jBtSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtSairKeyPressed(evt);
            }
        });
        jPanelLogin.add(jBtSair);
        jBtSair.setBounds(190, 140, 100, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("F8 - Troca Senha");
        jPanelLogin.add(jLabel7);
        jLabel7.setBounds(110, 120, 130, 14);

        JPnlPrincipal.add(jPanelLogin);
        jPanelLogin.setBounds(310, 115, 320, 175);

        jPnlTrocaDeSenha.setBackground(new java.awt.Color(204, 204, 255));
        jPnlTrocaDeSenha.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senha.png"))); // NOI18N
        jPnlTrocaDeSenha.add(jLabel5);
        jLabel5.setBounds(270, 5, 32, 40);

        jFldConfirmaSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jFldConfirmaSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jFldConfirmaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldConfirmaSenhaKeyPressed(evt);
            }
        });
        jPnlTrocaDeSenha.add(jFldConfirmaSenha);
        jFldConfirmaSenha.setBounds(310, 10, 120, 25);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senha.png"))); // NOI18N
        jPnlTrocaDeSenha.add(jLabel6);
        jLabel6.setBounds(10, 5, 32, 40);

        jFldTrocaSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jFldTrocaSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jFldTrocaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFldTrocaSenhaActionPerformed(evt);
            }
        });
        jFldTrocaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFldTrocaSenhaKeyPressed(evt);
            }
        });
        jPnlTrocaDeSenha.add(jFldTrocaSenha);
        jFldTrocaSenha.setBounds(50, 10, 120, 25);

        jBtCancelarTrocaDeSenha.setBackground(new java.awt.Color(0, 0, 102));
        jBtCancelarTrocaDeSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtCancelarTrocaDeSenha.setForeground(new java.awt.Color(255, 255, 255));
        jBtCancelarTrocaDeSenha.setText("Cancelar");
        jBtCancelarTrocaDeSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtCancelarTrocaDeSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCancelarTrocaDeSenhaActionPerformed(evt);
            }
        });
        jBtCancelarTrocaDeSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtCancelarTrocaDeSenhaKeyPressed(evt);
            }
        });
        jPnlTrocaDeSenha.add(jBtCancelarTrocaDeSenha);
        jBtCancelarTrocaDeSenha.setBounds(440, 10, 85, 25);

        jBtConfirmarTrocaDeSenha.setBackground(new java.awt.Color(0, 0, 102));
        jBtConfirmarTrocaDeSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtConfirmarTrocaDeSenha.setForeground(new java.awt.Color(255, 255, 255));
        jBtConfirmarTrocaDeSenha.setText("Confirmar");
        jBtConfirmarTrocaDeSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtConfirmarTrocaDeSenha.setFocusable(false);
        jBtConfirmarTrocaDeSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtConfirmarTrocaDeSenhaActionPerformed(evt);
            }
        });
        jBtConfirmarTrocaDeSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtConfirmarTrocaDeSenhaKeyPressed(evt);
            }
        });
        jPnlTrocaDeSenha.add(jBtConfirmarTrocaDeSenha);
        jBtConfirmarTrocaDeSenha.setBounds(180, 10, 85, 25);

        JPnlPrincipal.add(jPnlTrocaDeSenha);
        jPnlTrocaDeSenha.setBounds(10, 10, 540, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mdfe_login.png"))); // NOI18N
        JPnlPrincipal.add(jLabel1);
        jLabel1.setBounds(0, 0, 644, 333);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        CarregaTudoFilial();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jBtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtSairActionPerformed

    private void JBtConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtConfirmarActionPerformed
        if(jFldUsuario.getText().length() != 0 || jFldSenha.getText().length() != 0){
            BtnLogarUsuario(jFldUsuario.getText(), jFldSenha.getText());
        }else{
            JOptionPane.showMessageDialog(null, "Usuário e senha não cadastrados no sistema");
        }
    }//GEN-LAST:event_JBtConfirmarActionPerformed

    private void jFldUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldUsuarioKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jFldSenha.requestFocus();
        }
        
        if(evt.getKeyCode() == evt.VK_F8){
            jPnlTrocaDeSenha.setVisible(true);
        }
    }//GEN-LAST:event_jFldUsuarioKeyPressed

    private void jFldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldSenhaKeyPressed
        //Condição para focar em um determinado componente
        //Quando for apertado o botão ENTER se o JComboBox estiver visivel, focará nele... 
        //... senão estiver, focará no jButton de confirmar
        if((evt.getKeyCode() == evt.VK_ENTER) && (jCmbBxFilial.isVisible() == true)){
            jCmbBxFilial.requestFocus();
        } else if((evt.getKeyCode() == evt.VK_ENTER) && (jCmbBxFilial.isVisible() != true) ){
            JBtConfirmar.requestFocus();
        }
        
        //Mostra o JPanel se o botão F8 for apertado
        if(evt.getKeyCode() == evt.VK_F8){
            jPnlTrocaDeSenha.setVisible(true);
        }
    }//GEN-LAST:event_jFldSenhaKeyPressed

    private void jFldTrocaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFldTrocaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFldTrocaSenhaActionPerformed

    private void jBtConfirmarTrocaDeSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtConfirmarTrocaDeSenhaActionPerformed
        TrocarSenha();
    }//GEN-LAST:event_jBtConfirmarTrocaDeSenhaActionPerformed

    private void jBtCancelarTrocaDeSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelarTrocaDeSenhaActionPerformed
        jPnlTrocaDeSenha.setVisible(false);
    }//GEN-LAST:event_jBtCancelarTrocaDeSenhaActionPerformed

    private void JBtConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBtConfirmarKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            JBtConfirmar.doClick();
        }
    }//GEN-LAST:event_JBtConfirmarKeyPressed

    private void jBtSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtSairKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtSair.doClick();
        }
    }//GEN-LAST:event_jBtSairKeyPressed

    private void jFldTrocaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldTrocaSenhaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jFldConfirmaSenha.requestFocus();
        }
    }//GEN-LAST:event_jFldTrocaSenhaKeyPressed

    private void jFldConfirmaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFldConfirmaSenhaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtConfirmarTrocaDeSenha.requestFocus();
        }
    }//GEN-LAST:event_jFldConfirmaSenhaKeyPressed

    private void jBtCancelarTrocaDeSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtCancelarTrocaDeSenhaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtCancelarTrocaDeSenha.doClick();
        }
    }//GEN-LAST:event_jBtCancelarTrocaDeSenhaKeyPressed

    private void jBtConfirmarTrocaDeSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtConfirmarTrocaDeSenhaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            jBtConfirmarTrocaDeSenha.doClick();
        }
    }//GEN-LAST:event_jBtConfirmarTrocaDeSenhaKeyPressed

    private void jFldUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldUsuarioFocusLost
        if (jFldUsuario.getText().equals("")) {

        } else //verifa se existe o nome de usuario no sistema  
        if (VerificaUsuarioBtn(jFldUsuario.getText()) == true) {

        } else {

            JOptionPane.showMessageDialog(null, "Usuário não cadastrado no sistema.");
            jFldUsuario.requestFocus();
            jFldUsuario.selectAll();

        }
    }//GEN-LAST:event_jFldUsuarioFocusLost

    private void jFldSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFldSenhaFocusLost
        // TODO add your handling code here:

        if (jFldSenha.getText().equals("")) {

        } else {
            //verifa se existe o nome de usuario no sistema  
            LogarUsuario(jFldUsuario.getText(), jFldSenha.getText());

        }
    }//GEN-LAST:event_jFldSenhaFocusLost

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtConfirmar;
    private javax.swing.JPanel JPnlPrincipal;
    private javax.swing.JButton jBtCancelarTrocaDeSenha;
    private javax.swing.JButton jBtConfirmarTrocaDeSenha;
    private javax.swing.JButton jBtSair;
    private javax.swing.JComboBox<String> jCmbBxFilial;
    private javax.swing.JPasswordField jFldConfirmaSenha;
    private javax.swing.JPasswordField jFldSenha;
    private javax.swing.JPasswordField jFldTrocaSenha;
    private javax.swing.JTextField jFldUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPnlTrocaDeSenha;
    // End of variables declaration//GEN-END:variables
    
    //Define as especificidade do formulário
    public void DefinirFormulario(){
        // Define o tamanho do JFrame
        setSize(650, 350);                
        
        //Adiciona as teclas ALT + I de atalho para os seguintes botões
        JBtConfirmar.setMnemonic(java.awt.event.KeyEvent.VK_C);
        jBtSair.setMnemonic(java.awt.event.KeyEvent.VK_S);
        
        // Oculta a JComboBox do Panel
        jCmbBxFilial.setVisible(false);    
        
        // Centraliza o JFrame
        setLocationRelativeTo(null);        
        
        // Oculta o JPanel de troca de senha
        jPnlTrocaDeSenha.setVisible(false);  
        
        // Dá o foco para o JTextField Usuário
        jFldUsuario.requestFocus();           
        
        // Seta a imagem como icone
        setIconImage(new ImageIcon(this.getClass().getResource("/imagens/mdfeIcone.png")).getImage());
        
        //Não deixar o JFrame ser redimensionável
        setResizable(false);
    }
    
    //Carrega as filias no JComboBox e o deixa visivel novamente
    public void CarregaTudoFilial(){
        jCmbBxFilial.setVisible(true);
        try{
            Conectar.ConectarBD();
            Conectar.result = Conectar.stam.executeQuery("select NOMFIL from TABFIL where RGEVENTO <> '3'");
            while(Conectar.result.next()){
                jCmbBxFilial.addItem(Conectar.result.getString("NOMFIL"));
            }
            jCmbBxFilial.setSelectedIndex(-1);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro CarregarTudoFilial" + e.getLocalizedMessage());
        }
    }
    
    //Método para fazer o Login do Usuário
    public void LogarUsuario(String usuario, String senha) {

        try {
            Conectar.ConectarBD();
            Conectar.result = Conectar.stam.executeQuery("select * from TABUSU where ((RGEVENTO <> '3') or (RGEVENTO IS NULL)) and (SISTEMA = 10)"
                    + "and (NOME = '" + usuario + "')  and (SENHA = '" + senha + "') order by NOME");
            while (Conectar.result.next()) {
                CodUsu = Conectar.result.getInt("CODIGO");          //Pega o codigo do usuário
                NomeUsu = Conectar.result.getString("NOME");        //Pega o nome do usuario     
                SenhaUsu = Conectar.result.getString("SENHA");      //Pega a senha do usuario 

                System.out.println("Código do Usuário: " + CodUsu);
                System.out.println("Usuário: " + NomeUsu);
                System.out.println("Senha: " + SenhaUsu);
            }

            if (usuario.equals(NomeUsu) && senha.equals(SenhaUsu)) { //Se ambas forem igual:

                //Seta o setCodUsu da Classe TabUsu com o codigo do usuário
                tabusu.setCodigo(CodUsu);
                //Seta o setUsuario da Classe Tabusu com o nome do usuário
                tabusu.setNome(NomeUsu);

                System.out.println("Usuário Logado = " + tabusu.getNome());
                System.out.println("Código do Usuário = " + tabusu.getCodigo());
                Conectar.DesconectarBD();
                JBtConfirmar.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Senha não cadastrada no sistema.");
                jFldSenha.requestFocus();
                jFldSenha.selectAll();

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error Login \n" + e.getLocalizedMessage());
        }
    }

    //Método para verificar se o usuario está cadastrodo no sistema
    public boolean VerificaUsuarioBtn(String usuario) {

        try {
            Conectar.ConectarBD();
            Conectar.result = Conectar.stam.executeQuery("select * from TABUSU where ((RGEVENTO <> '3') or (RGEVENTO IS NULL)) and (SISTEMA = 1)"
                    + "and (NOME = '" + usuario + "')  ");
            while (Conectar.result.next()) {
                CodUsu = Conectar.result.getInt("CODIGO");          //Pega o codigo do usuário
                NomeUsu = Conectar.result.getString("NOME");        //Pega o nome do usuario     
                SenhaUsu = Conectar.result.getString("SENHA");      //Pega a senha do usuario 

                System.out.println("Código do Usuário: " + CodUsu);
                System.out.println("Usuário: " + NomeUsu);
                System.out.println("Senha: " + SenhaUsu);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error Login \n" + e.getLocalizedMessage());
        }

        //Compara o nome do usuario pego do BD com o do parametro do método
        if (!(usuario.equals(NomeUsu))) {
            return false;
        } else {
            return true;
        }

    }
    
    //Método para fazer o Login do Usuário
    public void BtnLogarUsuario(String usuario, String senha) {
        Integer Codigo = null;
        String UsuarioTeste = ""; 
        String SenhaTeste = "";
        
        try {
            Conectar.ConectarBD();
            Conectar.result = Conectar.stam.executeQuery("select * from TABUSU where ((RGEVENTO <> '3') or (RGEVENTO IS NULL)) and (SISTEMA = 1)"
                    + "and (NOME = '" + usuario + "')  and (SENHA = '" + senha + "') order by NOME");
            while (Conectar.result.next()) {
                Codigo =  Conectar.result.getInt("CODIGO");          //Pega o codigo do usuário
                UsuarioTeste = Conectar.result.getString("NOME");        //Pega o nome do usuario     
                SenhaTeste =  Conectar.result.getString("SENHA");      //Pega a senha do usuario 

                System.out.println("Código do Usuário: " + Codigo);
                System.out.println("Usuário: " + UsuarioTeste);
                System.out.println("Senha: " + SenhaTeste);
            }

            if (UsuarioTeste.equals(usuario) && SenhaTeste.equals(senha)) { //Se ambas forem igual:

                //Seta o setCodUsu da Classe TabUsu com o codigo do usuário
                tabusu.setCodigo(Codigo);
                //Seta o setUsuario da Classe Tabusu com o nome do usuário
                tabusu.setNome(usuario);

                System.out.println("Usuário Logado = " + tabusu.getNome());
                System.out.println("Código do Usuário = " + tabusu.getCodigo());

                //Fecha a tela de Login
                this.dispose();

                new TelaPrincipal().setVisible(true);

                
            } else {
                JOptionPane.showMessageDialog(null, "Senha não cadastrada no sistema.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error Login \n" + e.getLocalizedMessage());
        }
    }
    
    //Método para fazer a troca de senha
    public void TrocarSenha() { 
        //Se o método de verificar senha retornar verdadeiro
        if (VerificarSenha() == true) {
            String NovaSenha = jFldConfirmaSenha.getText();
            try {
                Conectar.ConectarBD();
                Conectar.result = Conectar.stam.executeQuery("select * from TABUSU where ((RGEVENTO <> '3') or (RGEVENTO IS NULL)) and (SISTEMA = 1) order by NOME");
                while (Conectar.result.next()) {
                    //Pega o codigo do usuário do banco
                    CodUsu = Conectar.result.getInt("CODIGO");  
                    //Pega o nome do usuario do banco 
                    NomeUsu = Conectar.result.getString("NOME");
                    //Pega a senha do usuario do banco
                    SenhaUsu = Conectar.result.getString("SENHA");   

                    System.out.println("Código do Usuário: " + CodUsu);
                    System.out.println("Usuário: " + NomeUsu);
                    System.out.println("Senha: " + SenhaUsu);
                }
                
                String Usuario = jFldUsuario.getText();   //Pega o usuario da Fld
                String Senha   = jFldSenha.getText();     //Pega a senha da Fld
                
                    //Se o nome usuario que veio do banco não for iguala ao da fild gera a Mensagem
                if(!(NomeUsu.equals(Usuario))){ 
                    JOptionPane.showMessageDialog(null, "Usuário inválido.");
                    
                   //Se o senha vinda do banco não for igual ao da field gera a Mensagem 
                } else if(!(SenhaUsu.equals(Senha))){ 
                    JOptionPane.showMessageDialog(null, "Senha Inválida");
                    
                } else if(SenhaUsu.equals(Senha) && NomeUsu.equals(Usuario)){ //Se forem iguais, a senha é alterada
                    
                    System.out.println("update TABUSU set "
                            + "SENHA = '" + NovaSenha + "' "
                            + "where SISTEMA = '1' "
                            + "and CODIGO = "+ CodUsu +""
                            + "and NOME = '"+ NomeUsu +"' "
                    );

                    Conectar.stam.executeUpdate("update TABUSU set "
                            + "SENHA = '" + NovaSenha + "' "
                            + "where SISTEMA = '1' "
                            + "and CODIGO = "+ CodUsu +" "
                            + "and NOME = '"+ NomeUsu +"' "
                    );
                    
                    JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
                    jPnlTrocaDeSenha.setVisible(false);
                    jFldUsuario.requestFocus();
                    jFldSenha.setText("");
                }
               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro Troca De Senha. \n" + e.getLocalizedMessage());
                e.printStackTrace();
            } 

        }

    }
    
    //Metódo para comparar as 2 novas senhas antes de trocá-las
    public boolean VerificarSenha() {
        //Cria uma variavel com a nova senha
        String NovaSenha = jFldTrocaSenha.getText();
        //Cria outra variavel com a confirmacao da nova senha
        String NovaSenha2 = jFldConfirmaSenha.getText();

        //Compara as senhas
        if (!(NovaSenha.equals(NovaSenha2))) {
            //Se forem diferentes, retorna false e dá um aviso.
            JOptionPane.showMessageDialog(null, "Tente Novamente registrar sua senha, pois não há consistência entre elas.");
            return false;
        } else {
            //Senão, retorna true
            return true;
        }
    }
    
  
    
    
    
}
