package Telas;

import Codigo.Autenticador;
import Codigo.Utilitarios;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaLogin extends javax.swing.JFrame {
//    TelaPrincipal principal = new TelaPrincipal(this);
    
    private String login;
    private String senha;
    

    public TelaLogin() {
        initComponents();
        configurarTela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBackground = new javax.swing.JPanel();
        lLogo = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        btLogin = new javax.swing.JButton();
        ckVisivel = new javax.swing.JCheckBox();
        pfSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOOM - Loja de Informática");
        setBackground(new java.awt.Color(121, 112, 169));
        setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        pBackground.setBackground(new java.awt.Color(34, 33, 44));
        pBackground.setForeground(new java.awt.Color(34, 33, 44));
        pBackground.setPreferredSize(new java.awt.Dimension(800, 600));

        lLogo.setBackground(new java.awt.Color(225, 225, 128));
        lLogo.setFont(new java.awt.Font("Dialog", 0, 150)); // NOI18N
        lLogo.setForeground(new java.awt.Color(225, 225, 128));
        lLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lLogo.setPreferredSize(new java.awt.Dimension(200, 200));

        tfEmail.setBackground(new java.awt.Color(69, 65, 88));
        tfEmail.setForeground(new java.awt.Color(255, 149, 128));
        tfEmail.setText("Email");
        tfEmail.setPreferredSize(new java.awt.Dimension(600, 24));
        tfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailFocusLost(evt);
            }
        });

        btLogin.setBackground(new java.awt.Color(121, 112, 169));
        btLogin.setForeground(new java.awt.Color(69, 65, 88));
        btLogin.setText("Login");
        btLogin.setBorder(null);
        btLogin.setPreferredSize(new java.awt.Dimension(100, 24));
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        ckVisivel.setBackground(new java.awt.Color(34, 33, 44));
        ckVisivel.setForeground(new java.awt.Color(255, 149, 128));
        ckVisivel.setText("Mostrar senha");
        ckVisivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckVisivelActionPerformed(evt);
            }
        });

        pfSenha.setBackground(new java.awt.Color(69, 65, 88));
        pfSenha.setForeground(new java.awt.Color(255, 149, 128));
        pfSenha.setText("Senhadaora");
        pfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfSenhaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pBackgroundLayout = new javax.swing.GroupLayout(pBackground);
        pBackground.setLayout(pBackgroundLayout);
        pBackgroundLayout.setHorizontalGroup(
            pBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBackgroundLayout.createSequentialGroup()
                .addGroup(pBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pBackgroundLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(lLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pBackgroundLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(pBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pBackgroundLayout.createSequentialGroup()
                                    .addComponent(pfSenha)
                                    .addGap(18, 18, 18)
                                    .addComponent(ckVisivel))
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(101, 101, 101))
        );
        pBackgroundLayout.setVerticalGroup(
            pBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBackgroundLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckVisivel)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusGained
        Utilitarios.desaparecerTexto("Email", tfEmail);
    }//GEN-LAST:event_tfEmailFocusGained

    private void tfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusLost
        Utilitarios.aparecerTexto("Email", tfEmail);
    }//GEN-LAST:event_tfEmailFocusLost

    private void pfSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfSenhaFocusGained
        Utilitarios.desaparecerTexto("Senhadaora", pfSenha);
    }//GEN-LAST:event_pfSenhaFocusGained

    private void pfSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfSenhaFocusLost
        Utilitarios.aparecerTexto("Senhadaora", pfSenha);
    }//GEN-LAST:event_pfSenhaFocusLost

    private void ckVisivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckVisivelActionPerformed
        Utilitarios.visibilidadeSenha(ckVisivel, pfSenha);
    }//GEN-LAST:event_ckVisivelActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        logar ();
    }//GEN-LAST:event_btLoginActionPerformed
    public void logar ()
    {
        login = tfEmail.getText();
        senha = pfSenha.getText();
//        Utilitarios.entrarTelaPrincipal(principal, this);
    }
    public void configurarTela(){
        Utilitarios.aparecerImagemLocal(lLogo, "src/imagens/BOOM.png");
        Utilitarios.centralizarTela(this);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
        lLogo.requestFocus();
    }
    
    public void exibirTela(){
        setVisible(true);
    }
    
    
    //gets
    public String getLogin ()
    {
        return this.login;
    }
    public String getSenha ()
    {
        return this.senha;
    }
    
    public JLabel getlLogo ()
    {
        return this.lLogo;
    }
    
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JCheckBox ckVisivel;
    private javax.swing.JLabel lLogo;
    private javax.swing.JPanel pBackground;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfEmail;
    // End of variables declaration//GEN-END:variables
}