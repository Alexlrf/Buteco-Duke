
package br.com.alex.Boteco.view;

import br.com.alex.Boteco.controller.ClienteController;
import br.com.alex.Boteco.model.ClienteVO;
import javax.swing.JOptionPane;


public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanelFundoCadastro = new javax.swing.JPanel();
        jPanelTituloCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        try {
            javax.swing.text.MaskFormatter cpf = 
            new javax.swing.text.MaskFormatter ("###.###.###-##");
            jTextFieldCPF = new javax.swing.JFormattedTextField(cpf);
        }catch (Exception e){

        }
        jTextFieldCelular = new javax.swing.JTextField();
        try {
            javax.swing.text.MaskFormatter celular = 
            new javax.swing.text.MaskFormatter ("(##)###.###.###");
            jTextFieldCelular = new javax.swing.JFormattedTextField(celular);
        }catch (Exception e){

        }
        jLabelNome = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jRadioButtonFeminino = new javax.swing.JRadioButton();
        jLabelSexo = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelNascimento = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        try {
            javax.swing.text.MaskFormatter telefone = 
            new javax.swing.text.MaskFormatter ("(##)###.###.###");
            jTextFieldTelefone = new javax.swing.JFormattedTextField(telefone);
        }catch (Exception e){

        }
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jButtonFinalizarCadastro = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabelSenha = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 20, 20, 20, new java.awt.Color(102, 102, 255)));

        jPanelFundoCadastro.setBackground(new java.awt.Color(204, 204, 204));
        jPanelFundoCadastro.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 102, 255)));

        jPanelTituloCadastro.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Cliente");

        javax.swing.GroupLayout jPanelTituloCadastroLayout = new javax.swing.GroupLayout(jPanelTituloCadastro);
        jPanelTituloCadastro.setLayout(jPanelTituloCadastroLayout);
        jPanelTituloCadastroLayout.setHorizontalGroup(
            jPanelTituloCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloCadastroLayout.setVerticalGroup(
            jPanelTituloCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("* Campo Obrigatório");

        jLabelNome.setText("Nome*");

        jLabelCpf.setText("CPF*");

        jRadioButtonMasculino.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setText("Masculino");

        jRadioButtonFeminino.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButtonFeminino);
        jRadioButtonFeminino.setText("Feminino");
        jRadioButtonFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemininoActionPerformed(evt);
            }
        });

        jLabelSexo.setText("Sexo*");

        jLabelCelular.setText("Celular*");

        jLabelNascimento.setText("Nascimento*");

        jLabelTelefone.setText("Telefone");

        jLabelEmail.setText("Email*");

        jButtonFinalizarCadastro.setText("Finalizar Cadastro");
        jButtonFinalizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCadastroActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabelSenha.setText("Senha*");

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanelFundoCadastroLayout = new javax.swing.GroupLayout(jPanelFundoCadastro);
        jPanelFundoCadastro.setLayout(jPanelFundoCadastroLayout);
        jPanelFundoCadastroLayout.setHorizontalGroup(
            jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTituloCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(38, 38, 38))
            .addGroup(jPanelFundoCadastroLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail)
                    .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelFundoCadastroLayout.createSequentialGroup()
                            .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelCpf)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNascimento)
                                .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelCelular))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelSexo)
                                .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelFundoCadastroLayout.createSequentialGroup()
                                            .addComponent(jRadioButtonMasculino)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jRadioButtonFeminino))
                                        .addComponent(jLabelSenha)
                                        .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelTelefone)
                                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonFinalizarCadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 108, Short.MAX_VALUE))
        );
        jPanelFundoCadastroLayout.setVerticalGroup(
            jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoCadastroLayout.createSequentialGroup()
                .addComponent(jPanelTituloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf)
                    .addComponent(jLabelSenha))
                .addGap(1, 1, 1)
                .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNascimento)
                    .addComponent(jLabelSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonMasculino)
                        .addComponent(jRadioButtonFeminino))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCelular)
                    .addComponent(jLabelTelefone))
                .addGap(6, 6, 6)
                .addGroup(jPanelFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmail)
                .addGap(3, 3, 3)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonFinalizarCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jPanelFundoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanelFundoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(753, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFinalizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCadastroActionPerformed
               
    // Validação da entrada de dados        
        if (jPassword.getPassword().length < 4 || jPassword.getPassword().length > 8) {            
            JOptionPane.showMessageDialog(null,"A senha deve conter de 4 a 8 caracteres"); 
            jPassword.setText(null);
            
        }else if (jTextFieldNome.getText().equalsIgnoreCase("")
            || jTextFieldCPF.getText().equalsIgnoreCase("")
            || jPassword.getPassword()== null
            || jDateChooser1.getDate()== null 
            || jTextFieldCelular.getText().equalsIgnoreCase("")
            || jTextFieldEmail.getText().equalsIgnoreCase("")
            || (!jRadioButtonMasculino.isSelected() && !jRadioButtonFeminino.isSelected())) {         
            JOptionPane.showMessageDialog(null,"Há campos pendentes de preenchimento");        
            
        }else {          
                                    
         // Entrada de dados 
         ClienteVO clienteVO = new ClienteVO();
         clienteVO.setNome(this.jTextFieldNome.getText());
         clienteVO.setCpf(this.jTextFieldCPF.getText());         
         String senha = new String(this.jPassword.getPassword());
         clienteVO.setSenha(senha);         
         java.sql.Date nasc = new java.sql.Date(jDateChooser1.getDate().getTime());
         clienteVO.setNascimento(nasc);                          
         clienteVO.setCelular(this.jTextFieldCelular.getText());
         clienteVO.setTelefone(this.jTextFieldTelefone.getText());
         clienteVO.setEmail(this.jTextFieldEmail.getText());
         if (jRadioButtonMasculino.isSelected()) {
               clienteVO.setSexo("Masculino"); 
         }
         if(jRadioButtonFeminino.isSelected()){
                clienteVO.setSexo("Feminino");
         }
         
         ClienteController clienteControle = new ClienteController(); 
         boolean resultado = clienteControle.save(clienteVO);
         
         if (resultado) {
         JOptionPane.showMessageDialog(null, "Cadastro Ok!");
         }else {
         JOptionPane.showMessageDialog(null, "Erro! Cadastro não realizado!");    
         }
         TelaLogin home = new TelaLogin();
         home.setVisible(true);
         home.jTextUsuario.setText(this.jTextFieldEmail.getText());
         
        this.dispose();
      }
    }//GEN-LAST:event_jButtonFinalizarCadastroActionPerformed

    private void jRadioButtonFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemininoActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        TelaLogin home = new TelaLogin();
        home.setVisible(true);        
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonFinalizarCadastro;
    private javax.swing.JButton jButtonVoltar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNascimento;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFundoCadastro;
    private javax.swing.JPanel jPanelTituloCadastro;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
