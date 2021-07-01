package Telas;

import Codigo.Computador;
import Codigo.Notebook;
import Codigo.Utilitarios;
import java.awt.Toolkit;

public class TelaCadastroPrimeira extends javax.swing.JFrame {
    private TelaPrincipal principal;
    private String modelo;
    private float valor;
    private String descricao;
    private String marca;
    private String categoria;
    private String imagem;

    public TelaCadastroPrimeira(TelaPrincipal principal) {
        this.principal = principal;
        initComponents();
        configurarTela();
    }
    
    public void configurarTela()
    {
        Utilitarios.centralizarTela(this);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
    }
    
    public void SetarValores ()
    {
        this.modelo = textoModelo.getText();
        this.valor = Float.parseFloat(textoValor.getText());
        this.descricao = textoDescricao.getText();
        this.marca = textoMarca.getText();
        this.categoria = principal.getCategoriaEscolhida();
        this.imagem = textoImagem.getText();
    }

    public String getModelo() {
        return this.modelo;
    }

    public float getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public String getImagem() {
        return this.imagem;
    }

    public String getMarca() {
        return this.marca;
    }
    
    public void gerarComputador ()
    {
        Computador computador = new Computador (modelo, valor, descricao, marca, categoria, imagem);
        if (principal.getComputador().add(computador) == true) 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarNotebook ()
    {
        Notebook notebook = new Notebook (modelo, valor, descricao, marca, categoria, imagem);
        if (principal.getNotebook().add(notebook) == true) 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro duplicado");
        }
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
        proximo = new javax.swing.JButton();
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

        proximo.setBackground(new java.awt.Color(121, 112, 169));
        proximo.setForeground(new java.awt.Color(69, 65, 88));
        proximo.setText("Próximo");
        proximo.setBorder(null);
        proximo.setPreferredSize(new java.awt.Dimension(80, 25));
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });
        bg.add(proximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

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
        lbDescricao.setText("Descrição:");
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

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        try {
            SetarValores();
            if (this.categoria.equals("Computador"))
            {
                gerarComputador();
                principal.organizarProdutosGeral();
                principal.alterarComboBox ();
            }else
            {
                if (this.categoria.equals("Notebook"))
                {
                    gerarNotebook();
                    principal.organizarProdutosGeral();
                    principal.alterarComboBox ();
                }else
                {
                    TelaCadastroSegunda segunda = new TelaCadastroSegunda (this, principal);
                    segunda.setVisible(true);
                    this.setVisible(false);  
                }
            }
        } catch (Exception e) {
            jOptionPane1.showMessageDialog(null, "Preencha todos os campos");
        }
    }//GEN-LAST:event_proximoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
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
    private javax.swing.JButton proximo;
    private javax.swing.JTextField textoDescricao;
    private javax.swing.JTextField textoImagem;
    private javax.swing.JTextField textoMarca;
    private javax.swing.JTextField textoModelo;
    private javax.swing.JTextField textoValor;
    // End of variables declaration//GEN-END:variables
}
