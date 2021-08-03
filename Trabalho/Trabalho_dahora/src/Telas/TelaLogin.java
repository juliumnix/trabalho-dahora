package Telas;

//JAVA
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
//SWING
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }
    
    //ACOES
    public void adicionarAcaoBtLogin(ActionListener acao)
    {
        btLogin.addActionListener(acao);
    }
    
    public void adicionarFocusTfEmail (FocusListener focus)
    {
        tfEmail.addFocusListener(focus);
    }
    
    public void adicionarFocusPfSenha (FocusListener focus)
    {
        pfSenha.addFocusListener(focus);
    }
    
    public void adicionarAcaoCkVisivel(ActionListener acao)
    {
        ckVisivel.addActionListener(acao);
    }
    
    public void exibirTela(){
        setVisible(true);
    }
    
    //GETS SWING
    public JTextField getTfEmail ()
    {
        return this.tfEmail;
    }
    
    public JPasswordField getPfSenha ()
    {
        return this.pfSenha;
    }
    
    public JCheckBox getCkVisivel ()
    {
        return this.ckVisivel;
    }
    
    public JLabel getlLogo ()
    {
        return this.lLogo;
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

        btLogin.setBackground(new java.awt.Color(121, 112, 169));
        btLogin.setForeground(new java.awt.Color(69, 65, 88));
        btLogin.setText("Login");
        btLogin.setBorder(null);
        btLogin.setPreferredSize(new java.awt.Dimension(100, 24));

        ckVisivel.setBackground(new java.awt.Color(34, 33, 44));
        ckVisivel.setForeground(new java.awt.Color(255, 149, 128));
        ckVisivel.setText("Mostrar senha");

        pfSenha.setBackground(new java.awt.Color(69, 65, 88));
        pfSenha.setForeground(new java.awt.Color(255, 149, 128));
        pfSenha.setText("Senhadaora");

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
                .addContainerGap(174, Short.MAX_VALUE))
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
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JCheckBox ckVisivel;
    private javax.swing.JLabel lLogo;
    private javax.swing.JPanel pBackground;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfEmail;
    // End of variables declaration//GEN-END:variables
}