/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Codigo.Autenticador;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Mateus
 */
public class LoginView extends javax.swing.JFrame implements Autenticador{

    private String login;
    private String senha;
    TelaPrincipal principal = new TelaPrincipal(this);
    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();

        apareceImagem();
        JLabelIcon.requestFocus();
        
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
        JLabelIcon = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        btLogin = new javax.swing.JButton();
        jCheckBoxVisivel = new javax.swing.JCheckBox();
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
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(34, 33, 44));
        jPanel1.setForeground(new java.awt.Color(34, 33, 44));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        JLabelIcon.setBackground(new java.awt.Color(225, 225, 128));
        JLabelIcon.setFont(new java.awt.Font("Dialog", 0, 150)); // NOI18N
        JLabelIcon.setForeground(new java.awt.Color(225, 225, 128));
        JLabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JLabelIcon.setPreferredSize(new java.awt.Dimension(200, 200));

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

        jCheckBoxVisivel.setBackground(new java.awt.Color(34, 33, 44));
        jCheckBoxVisivel.setForeground(new java.awt.Color(255, 149, 128));
        jCheckBoxVisivel.setText("Mostrar senha");
        jCheckBoxVisivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxVisivelActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(JLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(pfSenha)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCheckBoxVisivel))
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(JLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxVisivel)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusGained
        if (tfEmail.getText().equals("Email"))
        {
            tfEmail.setText("");
        }
    }//GEN-LAST:event_tfEmailFocusGained

    private void tfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusLost
        if (tfEmail.getText().equals(""))
        {
            tfEmail.setText("Email");
        }
    }//GEN-LAST:event_tfEmailFocusLost

    private void pfSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfSenhaFocusGained
        if (pfSenha.getText().equals("Senhadaora"))
        {
            pfSenha.setText("");
        }
    }//GEN-LAST:event_pfSenhaFocusGained

    private void pfSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfSenhaFocusLost
        if (pfSenha.getText().equals(""))
        {
            pfSenha.setText("Senhadaora");
        }
    }//GEN-LAST:event_pfSenhaFocusLost

    private void jCheckBoxVisivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxVisivelActionPerformed
        if (jCheckBoxVisivel.isSelected())
        {
            pfSenha.setEchoChar((char)0);
        }else
        {
           pfSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxVisivelActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        logar ();
    }//GEN-LAST:event_btLoginActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed
    
    public void logar ()
    {
        login = tfEmail.getText();
        senha = pfSenha.getText();
        
        principal.aparecerComboComparar ();
        principal.setVisible(true);
        this.setVisible(false);
    }
    public void apareceImagem(){
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/imagens/BOOM.png"));
        Image image = imgIco.getImage().getScaledInstance(JLabelIcon.getWidth(), JLabelIcon.getHeight(), Image.SCALE_SMOOTH);
        
        JLabelIcon.setIcon(new ImageIcon(image));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
    }
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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
                }
                new LoginView().setVisible(true);
                
            }
        });
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelIcon;
    private javax.swing.JButton btLogin;
    private javax.swing.JCheckBox jCheckBoxVisivel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfEmail;
    // End of variables declaration//GEN-END:variables

    @Override
    public boolean verificaAdm() {
        if (this.login.contains("@adm.com"))
        {
            return true;
        }else
        {
            return false;
        }
    }
}
