package leilao.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import leilao.Processo;
import leilao.pn.UDPServer;

public class TelaLogin extends javax.swing.JFrame {

    private Processo processo;
    
    public TelaLogin(Processo processo) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        initComponents();
        this.setVisible(true);
        this.processo = processo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        textoUDP = new javax.swing.JTextField();
        labelUDP = new javax.swing.JLabel();
        botaoOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(400, 259));

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Leilão TOPzera!");

        textoUsuario.setToolTipText("USUÁRIO");
        textoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuarioActionPerformed(evt);
            }
        });

        labelUsuario.setText("Usuário:");

        textoUDP.setToolTipText("Porta UDP");
        textoUDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUDPActionPerformed(evt);
            }
        });

        labelUDP.setText("Porta UDP:");

        botaoOK.setText("OKTOP!");
        botaoOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUDP, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoOK, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                .addComponent(textoUDP)))
                        .addGap(35, 35, 35)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoUDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUDP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoOK, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuarioActionPerformed

    private void textoUDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUDPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUDPActionPerformed

    private void botaoOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOKActionPerformed
        
        //coletamos os dados da tela e adcionamos o usuário na lista
        processo.setNome_usuario(textoUsuario.getText());
        processo.setPorta_usuario(Integer.parseInt(textoUDP.getText()));     
        processo.adicionaUsuario(processo.getPorta_usuario(), processo.getNome_usuario(), processo.getChave_publica());
        
        new UDPServer(processo.getPorta_usuario(), processo);//instanciamos o servidor UDP
        
        //concatenamos todos os dados do processo inciando com o identificar de tipo de mensagem
        String dados_processo = new String("0"+ "|" + processo.getPorta_usuario()+ "|" + processo.getNome_usuario()+ "|");
        
        //alocamos epaço necessário para a chave pública
        byte[] chave_pub = new byte[processo.getChave_publica().length+"|".getBytes().length];
        
        //inserimos a chave pública no vetor de bytes
        System.arraycopy(processo.getChave_publica(), 0, chave_pub, 0, processo.getChave_publica().length);
        System.arraycopy("|".getBytes(), 0, chave_pub, processo.getChave_publica().length, "|".getBytes().length);
        
        //alocamos o espaço necessário para a mensagem de anúncio de novo usuário que será enviada
        byte[] mensagem_anuncio = new byte[dados_processo.length() + chave_pub.length];
        
        //concatenamos os dados do novo processo com sua chave pública e enviamos a mensagem de anúncio por multicast
        System.arraycopy(dados_processo.getBytes(), 0, mensagem_anuncio, 0, dados_processo.length());
        System.arraycopy(chave_pub, 0, mensagem_anuncio, dados_processo.length() , chave_pub.length);        
        processo.conexao_multi.enviaMensagem(mensagem_anuncio);
        
        //instanciamos essa tela principal e escondemos a tela de login para não perder o que foi instanciado       
        processo.InstanciaTelaPrincial();
        this.setVisible(false);
    }//GEN-LAST:event_botaoOKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoOK;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUDP;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JTextField textoUDP;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}