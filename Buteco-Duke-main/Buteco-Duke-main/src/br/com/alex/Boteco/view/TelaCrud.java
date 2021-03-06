
package br.com.alex.Boteco.view;

import br.com.alex.Boteco.controller.ClienteController;
import br.com.alex.Boteco.model.ClienteVO;
import br.com.alex.Boteco.model.DAO.TableModelCliente;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class TelaCrud extends javax.swing.JFrame {

    /**
     * Creates new form TelaCrud
     */
    TableModelCliente tabela = new TableModelCliente();
        
    
    public TelaCrud() {
        initComponents();
        jTable.setModel(tabela);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelSuperior = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanelInferior = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelCPF = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        try {
            javax.swing.text.MaskFormatter cpf = 
            new javax.swing.text.MaskFormatter ("###.###.###-##");
            jTextFieldCpf = new javax.swing.JFormattedTextField(cpf);
        }catch (Exception e){

        }
        jLabelNascimento = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jDateChooserCrud = new com.toedter.calendar.JDateChooser();
        jButtonConsultar = new javax.swing.JButton();
        jButtonBuscaCpf = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jFormattedTextFieldCelular = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jRadioButtonFeminino = new javax.swing.JRadioButton();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanelSuperior.setBackground(new java.awt.Color(153, 153, 255));
        jPanelSuperior.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 20, 20, 20, new java.awt.Color(102, 102, 255)));
        jPanelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 102, 255)));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Sexo", "Nascimento", "Celular", "Telefone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanelSuperior.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 990, 200));

        jPanelInferior.setBackground(new java.awt.Color(204, 204, 255));
        jPanelInferior.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 102, 255)));
        jPanelInferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalvar.setText("Cadastrar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelInferior.add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 110, -1));

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jPanelInferior.add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 110, -1));

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jPanelInferior.add(jButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 110, -1));

        jLabelNome.setText("Nome");
        jPanelInferior.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        jPanelInferior.add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 410, -1));

        jLabelCelular.setText("Celular");
        jPanelInferior.add(jLabelCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        jLabelTelefone.setText("Telefone");
        jPanelInferior.add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, -1, -1));

        jLabelEmail.setText("Email");
        jPanelInferior.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanelInferior.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 410, -1));

        jLabelCPF.setText("CPF");
        jPanelInferior.add(jLabelCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));
        jPanelInferior.add(jTextFieldCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 180, 30));

        jLabelNascimento.setText("Nascimento");
        jPanelInferior.add(jLabelNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        jLabelSexo.setText("Sexo");
        jPanelInferior.add(jLabelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, -1, -1));

        jDateChooserCrud.setDateFormatString("dd-MM-yyyy");
        jPanelInferior.add(jDateChooserCrud, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 210, -1));

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        jPanelInferior.add(jButtonConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 110, -1));

        jButtonBuscaCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.alex.Boteco.imagens/lupa.png"))); // NOI18N
        jButtonBuscaCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaCpfActionPerformed(evt);
            }
        });
        jPanelInferior.add(jButtonBuscaCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 30, 30));

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanelInferior.add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 110, -1));

        try {
            jFormattedTextFieldCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelInferior.add(jFormattedTextFieldCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 210, -1));

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelInferior.add(jFormattedTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 210, -1));

        jRadioButtonFeminino.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButtonFeminino);
        jRadioButtonFeminino.setText("Feminino");
        jPanelInferior.add(jRadioButtonFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, -1, -1));

        jRadioButtonMasculino.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setText("Masculino");
        jPanelInferior.add(jRadioButtonMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, -1, -1));

        jLabelId.setText("ID");
        jPanelInferior.add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        jPanelInferior.add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 90, -1));

        jPanelSuperior.add(jPanelInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 990, 270));

        jButtonSair.setBackground(new java.awt.Color(153, 153, 255));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.alex.Boteco.imagens/setaVoltar.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 600, 110, -1));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setText("Gerenciamento de Clientes");
        jPanelSuperior.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, 1204, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1220, 823));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
         ClienteController clienteController = new ClienteController();
          ClienteVO clienteVO = new ClienteVO();
          clienteVO.setNome(this.jTextFieldNome.getText());
          clienteVO.setCpf(this.jTextFieldCpf.getText());
          if (jRadioButtonMasculino.isSelected()) {
               clienteVO.setSexo("Masculino"); 
          }
          if(jRadioButtonFeminino.isSelected()){
                clienteVO.setSexo("Feminino");
          }                    
          java.sql.Date nasc = new java.sql.Date(jDateChooserCrud.getDate().getTime());
          clienteVO.setNascimento(nasc);                    
          clienteVO.setSenha("senha");          
          clienteVO.setCelular(this.jFormattedTextFieldCelular.getText());
          clienteVO.setTelefone(this.jFormattedTextFieldTelefone.getText());
          clienteVO.setEmail(this.jTextFieldEmail.getText());
          
          boolean retorno = clienteController.save(clienteVO);
          
          if (retorno) {
            JOptionPane.showMessageDialog(null, "Cadastro Ok!");
            this.tabela.addRow(clienteVO);            
         }else {
            JOptionPane.showMessageDialog(null, "Erro! Cadastro não realizado!");    
         }
          this.jTextFieldNome.setText("");
          this.jTextFieldCpf.setText("");
          this.buttonGroup1.clearSelection();          
          this.jFormattedTextFieldCelular.setText("");
          this.jDateChooserCrud.setDate(null);
          this.jFormattedTextFieldTelefone.setText("");
          this.jTextFieldEmail.setText("");
         
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        
        this.jTextFieldId.setText("");
        this.jTextFieldNome.setText("");
        this.jTextFieldCpf.setText("");
        this.buttonGroup1.clearSelection();       
        this.jDateChooserCrud.setDate(null);
        this.jFormattedTextFieldCelular.setText("");
        this.jFormattedTextFieldTelefone.setText("");
        this.jTextFieldEmail.setText("");
        
        int cont = tabela.getRowCount()-1;
        while(cont != -1 ) {
            tabela.removeRow(cont);
            cont--;            
        }
             
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        ClienteController clienteController = new ClienteController();
        ClienteVO clienteVO = new ClienteVO();
        
        clienteVO.setCpf(jTextFieldCpf.getText());
        ClienteVO clienteRetorno = clienteController.findByCpf(clienteVO);
        if(clienteRetorno == null) {
            JOptionPane.showMessageDialog(rootPane, "Cliente não encontrado!");
            
        }else { 
            
            clienteRetorno.setNome(jTextFieldNome.getText());
            clienteRetorno.setCpf(jTextFieldCpf.getText());
            if (jRadioButtonMasculino.isSelected()) {
               clienteRetorno.setSexo("Masculino"); 
            }
            if(jRadioButtonFeminino.isSelected()){
                clienteRetorno.setSexo("Feminino");
            }       
            clienteRetorno.setNascimento(jDateChooserCrud.getDate());          
            clienteRetorno.setCelular(jFormattedTextFieldCelular.getText());
            clienteRetorno.setTelefone(jFormattedTextFieldTelefone.getText());
            clienteRetorno.setEmail(jTextFieldEmail.getText());
            
        }       
            boolean retorno = clienteController.updateCliente(clienteRetorno);
                
        if (retorno) {
             JOptionPane.showMessageDialog(rootPane, "Alteração Concluída!");
                         
        } else {
             JOptionPane.showMessageDialog(rootPane, "Alteração não efetuada!");
        }     
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        MenuAdmin menuAdmin = new MenuAdmin();
        menuAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        
        ClienteController clienteController = new ClienteController();
        List<ClienteVO> lista = clienteController.findAll();
        
        for (int i=0;  i < lista.size(); i++) {
          
            tabela.addRow(lista.get(i));            
        }
       
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonBuscaCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaCpfActionPerformed
       
        ClienteController clienteController = new ClienteController();
        ClienteVO clienteVO = new ClienteVO();
        clienteVO.setCpf(jTextFieldCpf.getText()); 
        
        ClienteVO clienteRetorno = clienteController.findByCpf(clienteVO);
        if(clienteRetorno != null){
            
            this.jTextFieldId.setText(Integer.toString(clienteRetorno.getIdCliente()));
            this.jTextFieldNome.setText(clienteRetorno.getNome());
            this.jTextFieldCpf.setText(clienteRetorno.getCpf());
            if (clienteRetorno.getSexo().equalsIgnoreCase("Masculino")) {
               jRadioButtonMasculino.setSelected(true); 
            }else {
                jRadioButtonFeminino.setSelected(true);
                
            }       
            this.jDateChooserCrud.setDate(clienteRetorno.getNascimento());            
            this.jFormattedTextFieldCelular.setText(clienteRetorno.getCelular());
            this.jFormattedTextFieldTelefone.setText(clienteRetorno.getTelefone());
            this.jTextFieldEmail.setText(clienteRetorno.getEmail());
            
        }else { 
            JOptionPane.showMessageDialog(rootPane, "Não foi possível consultar");
               
        }
    }//GEN-LAST:event_jButtonBuscaCpfActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        ClienteController clienteController = new ClienteController();
        ClienteVO clienteVO = new ClienteVO();
        clienteVO.setCpf(jTextFieldCpf.getText());
        ClienteVO clienteRetorno = clienteController.findByCpf(clienteVO);
        if(clienteRetorno == null) {
            JOptionPane.showMessageDialog(rootPane, "Cliente não encontrado!");
            
        }else {        
            this.jTextFieldNome.setText(clienteRetorno.getNome());
            this.jTextFieldCpf.setText(clienteRetorno.getCpf());
            if (clienteRetorno.getSexo().equalsIgnoreCase("Masculino")) {
                jRadioButtonMasculino.setSelected(true); 
            }else {
                jRadioButtonFeminino.setSelected(true);
                
            } 
            this.jDateChooserCrud.setDate(clienteRetorno.getNascimento());
            this.jFormattedTextFieldCelular.setText(clienteRetorno.getCelular());
            this.jFormattedTextFieldTelefone.setText(clienteRetorno.getTelefone());
            this.jTextFieldEmail.setText(clienteRetorno.getEmail());
        }
        boolean retorno = clienteController.deleteCliente(clienteVO);
        if (retorno) {
             JOptionPane.showMessageDialog(rootPane, "Exclusão Concluída!");           
                                      
        } else {
             JOptionPane.showMessageDialog(rootPane, "Exclusão não efetuada!");
        }     
        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscaCpf;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private com.toedter.calendar.JDateChooser jDateChooserCrud;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelular;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNascimento;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
