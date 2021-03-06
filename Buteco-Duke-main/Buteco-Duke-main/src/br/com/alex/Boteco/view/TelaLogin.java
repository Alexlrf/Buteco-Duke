
package br.com.alex.Boteco.view;

import br.com.alex.Boteco.controller.ClienteController;
import br.com.alex.Boteco.model.ClienteVO;
import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JFrame {

   
    public TelaLogin() {
        initComponents();
        
        jPanelEntradaDados.setMinimumSize(getPreferredSize());
        jPanelEntradaDados.setSize(500,350);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jPanelEntradaDados = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextUsuario = new javax.swing.JTextField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jButtonEsqueciSenha = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelTituloLogin = new javax.swing.JLabel();
        jLabelMensagemLogar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanelFundo.setBackground(new java.awt.Color(153, 153, 255));
        jPanelFundo.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 20, 20, 20, new java.awt.Color(102, 102, 255)));
        jPanelFundo.setPreferredSize(new java.awt.Dimension(700, 526));

        jPanelEntradaDados.setBackground(new java.awt.Color(204, 204, 204));
        jPanelEntradaDados.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 102, 255)));
        jPanelEntradaDados.setMinimumSize(new java.awt.Dimension(524, 390));
        jPanelEntradaDados.setPreferredSize(new java.awt.Dimension(524, 390));
        jPanelEntradaDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 102, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(524, 37));

        jLabelTitulo.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 18)); // NOI18N
        jLabelTitulo.setText("E N T R A R");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addContainerGap())
        );

        jPanelEntradaDados.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));
        jPanelEntradaDados.add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 220, 30));

        jButtonEntrar.setText("ok");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        jPanelEntradaDados.add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 100, -1));

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelEntradaDados.add(jButtonNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 100, -1));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelUsuario.setText("Email");
        jPanelEntradaDados.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSenha.setText("Senha");
        jPanelEntradaDados.add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jButtonEsqueciSenha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonEsqueciSenha.setText("Esqueci minha senha");
        jButtonEsqueciSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEsqueciSenhaActionPerformed(evt);
            }
        });
        jPanelEntradaDados.add(jButtonEsqueciSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 220, -1));
        jPanelEntradaDados.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 220, 30));

        jLabelTituloLogin.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        jLabelTituloLogin.setText(" Boteco  do  Duke");

        jLabelMensagemLogar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelMensagemLogar.setText("* Para utilizar o sistema é preciso estar logado");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.alex.Boteco.imagens/dukeAguaCoco.png"))); // NOI18N

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMensagemLogar)
                    .addComponent(jPanelEntradaDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabelTituloLogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabelTituloLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addComponent(jPanelEntradaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMensagemLogar))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(793, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        // TODO add your handling code here:
        ClienteController clienteController = new ClienteController();
        ClienteVO clienteVO = new ClienteVO();
        clienteVO.setEmail(this.jTextUsuario.getText());
        String senha = new String(this.jPasswordField.getPassword());
        clienteVO.setSenha(senha);
        boolean resultado = false;
        
        if (clienteVO.getEmail().equals("admin") && clienteVO.getSenha().equals("admin")) {
            MenuAdmin menuAdmin = new MenuAdmin();
            menuAdmin.setVisible(true);
            this.dispose();
        }       
       
        else if ( resultado = clienteController.confirmarLogin(clienteVO)) {
            Home home = new Home();
            home.setVisible(true);
            home.jLabelNome.setText(clienteVO.getNome().toUpperCase());
            home.jLabelIdEscondido.setText(String.valueOf(clienteVO.getIdCliente()));
            this.dispose();            
        } else {
            JOptionPane.showMessageDialog(null, "Dados Incorretos");
        }        
       
        if ( jPasswordField.getPassword().length < 4 
              || jTextUsuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Preencha seus dados para acessar");            
        }else {
        
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        TelaCadastro tela = new TelaCadastro();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonEsqueciSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEsqueciSenhaActionPerformed
        // TODO add your handling code here:
        TelaEsqueciSenha redefine = new TelaEsqueciSenha();
        redefine.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonEsqueciSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonEsqueciSenha;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelMensagemLogar;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloLogin;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelEntradaDados;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPasswordField jPasswordField;
    public javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables
}
