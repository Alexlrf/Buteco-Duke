
package br.com.alex.Boteco.view;

import br.com.alex.Boteco.controller.Pedido;
import br.com.alex.Boteco.controller.SalgadoController;
import br.com.alex.Boteco.controller.VendaController;
import br.com.alex.Boteco.model.ClienteVO;
import br.com.alex.Boteco.model.SalgadoVO;
import br.com.alex.Boteco.model.VendaVO;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Home extends javax.swing.JFrame {
    
    DecimalFormat df = new DecimalFormat("0.00");
    List<SalgadoVO> listaItensSalgados = new ArrayList<>();
    
    public Home() {
        initComponents();
        Pedido.atribuirValor();
                        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        lblBebidas = new java.awt.Label();
        lblTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonEncerraPedido = new javax.swing.JButton();
        lblValor = new java.awt.Label();
        jButtonSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblCerveja = new java.awt.Label();
        lblAlcool = new java.awt.Label();
        lblPrecoAlcool = new java.awt.Label();
        lblPrecoCeva = new java.awt.Label();
        lblGelada = new java.awt.Label();
        lblPrecoGelada = new java.awt.Label();
        spinCerveja = new javax.swing.JSpinner();
        spinAlcool = new javax.swing.JSpinner();
        spinGelada = new javax.swing.JSpinner();
        jButtonConfirmaBebida = new javax.swing.JButton();
        lblBebidas1 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jComboBoxSabor = new javax.swing.JComboBox<>();
        jComboBoxQtde = new javax.swing.JComboBox<>();
        jButtonConfirmaSalgado = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jComboBoxConsultaValores = new javax.swing.JComboBox<>();
        lblTitulo = new java.awt.Label();
        jLabelNome = new javax.swing.JLabel();
        jLabelIdEscondido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 20, 20, 20, new java.awt.Color(102, 102, 255)));

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setPreferredSize(new java.awt.Dimension(800, 500));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBebidas.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblBebidas.setText("SALGADOS");
        panel1.add(lblBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));
        lblBebidas.getAccessibleContext().setAccessibleName("");

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setText("TOTAL");
        panel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.alex.Boteco.imagens/duke.png"))); // NOI18N
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 140, 200, -1));

        jButtonEncerraPedido.setBackground(new java.awt.Color(180, 245, 205));
        jButtonEncerraPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEncerraPedido.setText("Encerrar  Pedido");
        jButtonEncerraPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEncerraPedidoActionPerformed(evt);
            }
        });
        panel1.add(jButtonEncerraPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 220, 40));

        lblValor.setBackground(new java.awt.Color(255, 255, 255));
        lblValor.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        panel1.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 145, 42));

        jButtonSair.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.alex.Boteco.imagens/botaoSair.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        panel1.add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 37, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 102, 102)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCerveja.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblCerveja.setName(""); // NOI18N
        lblCerveja.setText("CERVEJA  R$");
        jPanel2.add(lblCerveja, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 20, 80, -1));

        lblAlcool.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblAlcool.setName(""); // NOI18N
        lblAlcool.setText("ÁLCOOL  R$");
        jPanel2.add(lblAlcool, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 70, -1));

        lblPrecoAlcool.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel2.add(lblPrecoAlcool, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 70, -1));

        lblPrecoCeva.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel2.add(lblPrecoCeva, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, -1));

        lblGelada.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblGelada.setName(""); // NOI18N
        lblGelada.setText("GELADA  R$");
        jPanel2.add(lblGelada, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        lblPrecoGelada.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel2.add(lblPrecoGelada, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 60, -1));

        spinCerveja.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        jPanel2.add(spinCerveja, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        spinAlcool.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        jPanel2.add(spinAlcool, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        spinGelada.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        jPanel2.add(spinGelada, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jButtonConfirmaBebida.setText("CONFIRMAR");
        jButtonConfirmaBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmaBebidaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonConfirmaBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 173, -1));

        panel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 690, 100));

        lblBebidas1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblBebidas1.setText("BEBIDAS");
        panel1.add(lblBebidas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 102, 102)));

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORIA", "PIZZA", "PASTEL", "EMPADA", "RISOLES" }));

        jComboBoxSabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SABOR", "FRANGO", "CARNE", "CALABRESA", "VEGETARIANA" }));

        jComboBoxQtde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "QUANTIDADE", "1", "2", "3", "4", "5" }));

        jButtonConfirmaSalgado.setText("CONFIRMAR");
        jButtonConfirmaSalgado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmaSalgadoActionPerformed(evt);
            }
        });

        jButtonAdicionar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAdicionar.setText("+");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jComboBoxConsultaValores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONSULTAR VALORES", "PIZZA....... R$ 10,00", "PASTEL..... R$ 6,00", "EMPADA.... R$ 7,00", "RISOLES.... R$ 6,00" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBoxSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jComboBoxQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jComboBoxConsultaValores, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jButtonAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButtonConfirmaSalgado, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxConsultaValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmaSalgado)
                    .addComponent(jComboBoxQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 690, 100));

        lblTitulo.setAlignment(java.awt.Label.CENTER);
        lblTitulo.setBackground(new java.awt.Color(153, 153, 153));
        lblTitulo.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setName("lblTitulo"); // NOI18N
        lblTitulo.setText("Boteco  do  Duke");
        panel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 67));
        lblTitulo.getAccessibleContext().setAccessibleName("");

        jLabelNome.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(0, 0, 153));
        jLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panel1.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 220, 30));

        jLabelIdEscondido.setForeground(new java.awt.Color(204, 204, 204));
        panel1.add(jLabelIdEscondido, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 40, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1329, 862));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEncerraPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEncerraPedidoActionPerformed
       double somaSalgado = 0;
        for (int i = 0; i < listaItensSalgados.size(); i++) {
            somaSalgado += (listaItensSalgados.get(i).getValor() * (listaItensSalgados.get(i).getQuantidade()));            
        }        
       double total = (Pedido.imprimirValor())+ (somaSalgado);        
       lblValor.setText("R$ "+String.valueOf(df.format (total)));
       spinCerveja.setValue(0);
       spinAlcool.setValue(0);
       spinGelada.setValue(0);
       JOptionPane.showMessageDialog(rootPane, "Beba com moderação!\n Muito Obrigado!");       
       lblValor.setText("");
       jComboBoxCategoria.setSelectedIndex(0);
       jComboBoxSabor.setSelectedIndex(0);
       jComboBoxQtde.setSelectedIndex(0);
       jComboBoxConsultaValores.setSelectedIndex(0);
       VendaVO vendaVO = new VendaVO();
       VendaController vendaController = new VendaController();
               
    }//GEN-LAST:event_jButtonEncerraPedidoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        TelaLogin home = new TelaLogin();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    
    private void jButtonConfirmaSalgadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmaSalgadoActionPerformed
        VendaController vendaController = new VendaController();
        VendaVO vendaVO = new VendaVO();
        ClienteVO clienteVO = new ClienteVO();
        clienteVO.setIdCliente(Integer.parseInt(jLabelIdEscondido.getText()));
        
         
        
        
        
    }//GEN-LAST:event_jButtonConfirmaSalgadoActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        SalgadoVO salgadoVO = new SalgadoVO();
        SalgadoController salgadoController = new SalgadoController();
        salgadoVO.setCategoria(jComboBoxCategoria.getSelectedItem().toString());
        salgadoVO.setSabor(jComboBoxSabor.getSelectedItem().toString());
        salgadoVO.setQuantidade(Integer.parseInt(jComboBoxQtde.getSelectedItem().toString()));
        SalgadoVO retorno = salgadoController.findByCategoriaSaborCliente(salgadoVO);
        if (retorno != null) {            
            if (retorno.getQuantidade()<salgadoVO.getQuantidade()){            
                JOptionPane.showMessageDialog(rootPane, "Estoque não suficiente!\n"
                    + "Quantidade Disponível: "+retorno.getQuantidade());
                jComboBoxConsultaValores.setSelectedIndex(0);
                
             }else{
                salgadoVO.setValor(retorno.getValor());
                listaItensSalgados.add(salgadoVO);
                JOptionPane.showMessageDialog(rootPane, salgadoVO.getQuantidade()
                        +" -> "+retorno.getCategoria()+" "+retorno.getSabor());
                jComboBoxCategoria.setSelectedIndex(0);
                jComboBoxSabor.setSelectedIndex(0);
                jComboBoxQtde.setSelectedIndex(0);
                jComboBoxConsultaValores.setSelectedIndex(0);
            }            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro, não foi possível consultar!");
            jComboBoxCategoria.setSelectedIndex(0);
            jComboBoxSabor.setSelectedIndex(0);
            jComboBoxQtde.setSelectedIndex(0);
            jComboBoxConsultaValores.setSelectedIndex(0);            
        }

    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonConfirmaBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmaBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConfirmaBebidaActionPerformed
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
        
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButtonAdicionar;
    public static javax.swing.JButton jButtonConfirmaBebida;
    public static javax.swing.JButton jButtonConfirmaSalgado;
    public static javax.swing.JButton jButtonEncerraPedido;
    public static javax.swing.JButton jButtonSair;
    public static javax.swing.JComboBox<String> jComboBoxCategoria;
    public static javax.swing.JComboBox<String> jComboBoxConsultaValores;
    public static javax.swing.JComboBox<String> jComboBoxQtde;
    public static javax.swing.JComboBox<String> jComboBoxSabor;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabelIdEscondido;
    public static javax.swing.JLabel jLabelNome;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    public static java.awt.Label lblAlcool;
    public static java.awt.Label lblBebidas;
    public static java.awt.Label lblBebidas1;
    public static java.awt.Label lblCerveja;
    public static java.awt.Label lblGelada;
    public static java.awt.Label lblPrecoAlcool;
    public static java.awt.Label lblPrecoCeva;
    public static java.awt.Label lblPrecoGelada;
    public static java.awt.Label lblTitulo;
    public static javax.swing.JLabel lblTotal;
    public static java.awt.Label lblValor;
    public static java.awt.Panel panel1;
    public static javax.swing.JSpinner spinAlcool;
    public static javax.swing.JSpinner spinCerveja;
    public static javax.swing.JSpinner spinGelada;
    // End of variables declaration//GEN-END:variables
}