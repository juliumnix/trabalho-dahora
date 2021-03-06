package Telas;

//JAVA
import Codigo.Utilitarios;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class TelaCadastroPrimeira extends javax.swing.JFrame {

    public TelaCadastroPrimeira() {
        initComponents();
        configurarTela();
    }
    
    public void configurarTela ()
    {
        Utilitarios.centralizarTela(this);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
    }
    
    public void esconderSwing (JFrame componente)
    {
        componente.setVisible(false);
    }
    
    public void limparCampos ()
    {
        textoModelo.setText("");
        textoValor.setText("");
        textoDescricao.setText("");
        textoMarca.setText("");
        textoImagem.setText("");
    }
    
    public String textoTfModelo ()
    {
        return textoModelo.getText();
    }
    
    public Float textoTfValor ()
    {
        return Float.parseFloat(textoValor.getText());
    }
    
    public String textoTfDescricao ()
    {
        return textoDescricao.getText();
    }
    
    public String textoTfMarca ()
    {
        return textoMarca.getText();
    }
    
    public String textoTfImagem ()
    {
        return textoImagem.getText();
    }
    
    public void mensagemJOptionPane (String texto)
    {
        jOptionPane1.showMessageDialog(null, texto);
    }
    
    public void exibirTela(){
        setVisible(true);
    }
    
    public void esconderTela()
    {
        setVisible(false);
    }
    
    public void adicionarAcaoBtProximo(ActionListener acao)
    {
        btProximo.addActionListener(acao);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        bg = new javax.swing.JPanel();
        textoModelo = new javax.swing.JTextField();
        textoValor = new javax.swing.JTextField();
        textoDescricao = new javax.swing.JTextField();
        textoMarca = new javax.swing.JTextField();
        textoImagem = new javax.swing.JTextField();
        btProximo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbModelo = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        lbMarca = new javax.swing.JLabel();
        lbImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setBackground(new java.awt.Color(34, 33, 44));
        setMaximumSize(new java.awt.Dimension(400, 220));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 220));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(34, 33, 44));
        bg.setForeground(new java.awt.Color(69, 65, 88));
        bg.setMinimumSize(new java.awt.Dimension(0, 0));
        bg.setPreferredSize(new java.awt.Dimension(400, 220));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoModelo.setBackground(new java.awt.Color(69, 65, 88));
        textoModelo.setForeground(new java.awt.Color(255, 149, 128));
        bg.add(textoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 290, -1));

        textoValor.setBackground(new java.awt.Color(69, 65, 88));
        textoValor.setForeground(new java.awt.Color(255, 149, 128));
        bg.add(textoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 290, -1));

        textoDescricao.setBackground(new java.awt.Color(69, 65, 88));
        textoDescricao.setForeground(new java.awt.Color(255, 149, 128));
        bg.add(textoDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 290, -1));

        textoMarca.setBackground(new java.awt.Color(69, 65, 88));
        textoMarca.setForeground(new java.awt.Color(255, 149, 128));
        bg.add(textoMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 290, -1));

        textoImagem.setBackground(new java.awt.Color(69, 65, 88));
        textoImagem.setForeground(new java.awt.Color(255, 149, 128));
        bg.add(textoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 290, -1));

        btProximo.setBackground(new java.awt.Color(121, 112, 169));
        btProximo.setForeground(new java.awt.Color(69, 65, 88));
        btProximo.setText("Pr??ximo");
        btProximo.setBorder(null);
        btProximo.setPreferredSize(new java.awt.Dimension(80, 25));
        bg.add(btProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jPanel1.setBackground(new java.awt.Color(121, 112, 169));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(69, 65, 88));
        jLabel1.setText(":");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, -1, -1));

        jLabel2.setForeground(new java.awt.Color(69, 65, 88));
        jLabel2.setText(":");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 43, -1, -1));

        jLabel3.setForeground(new java.awt.Color(69, 65, 88));
        jLabel3.setText(":");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, -1, -1));

        jLabel4.setForeground(new java.awt.Color(69, 65, 88));
        jLabel4.setText(":");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 103, -1, -1));

        lbModelo.setForeground(new java.awt.Color(69, 65, 88));
        lbModelo.setText("Modelo:");
        jPanel1.add(lbModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

        lbValor.setForeground(new java.awt.Color(69, 65, 88));
        lbValor.setText("Valor:");
        jPanel1.add(lbValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        lbDescricao.setForeground(new java.awt.Color(69, 65, 88));
        lbDescricao.setText("Descri????o:");
        jPanel1.add(lbDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));

        lbMarca.setForeground(new java.awt.Color(69, 65, 88));
        lbMarca.setText("Marca:");
        jPanel1.add(lbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, -1, -1));

        lbImagem.setForeground(new java.awt.Color(69, 65, 88));
        lbImagem.setText("Imagem (url):");
        jPanel1.add(lbImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, -1));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 190));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btProximo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTextField textoDescricao;
    private javax.swing.JTextField textoImagem;
    private javax.swing.JTextField textoMarca;
    private javax.swing.JTextField textoModelo;
    private javax.swing.JTextField textoValor;
    // End of variables declaration//GEN-END:variables
}
