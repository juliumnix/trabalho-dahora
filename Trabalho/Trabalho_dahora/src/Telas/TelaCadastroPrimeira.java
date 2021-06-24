package Telas;

public class TelaCadastroPrimeira extends javax.swing.JFrame {
    private TelaPrincipal principal;
    private String modelo;
    private float valor;
    private String descricao;
    private String categoria;
    private String imagem;

    public TelaCadastroPrimeira(TelaPrincipal principal) {
        this.principal = principal;
        initComponents();
    }
    
    public void SetarValores ()
    {
        this.modelo = textoModelo.getText();
        this.valor = Float.parseFloat(textoValor.getText());
        this.descricao = textoDescricao.getText();
        this.categoria = textoCategoria.getToolTipText();
        this.imagem = textoImagem.getText();
    }

    public String getModelo() {
        return modelo;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getImagem() {
        return imagem;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lbModelo = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        lbMarca = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        lbImagem = new javax.swing.JLabel();
        textoModelo = new javax.swing.JTextField();
        textoValor = new javax.swing.JTextField();
        textoDescricao = new javax.swing.JTextField();
        textoMarca = new javax.swing.JTextField();
        textoCategoria = new javax.swing.JComboBox<>();
        textoImagem = new javax.swing.JTextField();
        proximo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 230));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(34, 33, 44));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbModelo.setForeground(new java.awt.Color(255, 149, 128));
        lbModelo.setText("Modelo:");
        bg.add(lbModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

        lbValor.setForeground(new java.awt.Color(255, 149, 128));
        lbValor.setText("Valor:");
        bg.add(lbValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        lbDescricao.setForeground(new java.awt.Color(255, 149, 128));
        lbDescricao.setText("Descrição:");
        bg.add(lbDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));

        lbMarca.setForeground(new java.awt.Color(255, 149, 128));
        lbMarca.setText("Marca:");
        bg.add(lbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, -1, -1));

        lbCategoria.setForeground(new java.awt.Color(255, 149, 128));
        lbCategoria.setText("Categoria:");
        bg.add(lbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, -1));

        lbImagem.setForeground(new java.awt.Color(255, 149, 128));
        lbImagem.setText("Imagem (url):");
        bg.add(lbImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, -1, -1));

        textoModelo.setBackground(new java.awt.Color(69, 65, 88));
        textoModelo.setForeground(new java.awt.Color(255, 149, 128));
        bg.add(textoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 330, -1));

        textoValor.setBackground(new java.awt.Color(69, 65, 88));
        textoValor.setForeground(new java.awt.Color(255, 149, 128));
        bg.add(textoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 340, -1));

        textoDescricao.setBackground(new java.awt.Color(69, 65, 88));
        textoDescricao.setForeground(new java.awt.Color(255, 149, 128));
        bg.add(textoDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 310, -1));

        textoMarca.setBackground(new java.awt.Color(69, 65, 88));
        textoMarca.setForeground(new java.awt.Color(255, 149, 128));
        bg.add(textoMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 330, -1));

        textoCategoria.setBackground(new java.awt.Color(69, 65, 88));
        textoCategoria.setForeground(new java.awt.Color(255, 149, 128));
        textoCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Armazenamento", "Computador", "Cooler", "Fonte", "Gabinete", "Headset", "Memória RAM", "Monitor", "Mouse", "Notebook", "Placa de Vídeo", "Placa de Mãe", "Processador", "Teclado", " " }));
        bg.add(textoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 310, -1));

        textoImagem.setBackground(new java.awt.Color(69, 65, 88));
        textoImagem.setForeground(new java.awt.Color(255, 149, 128));
        bg.add(textoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 300, -1));

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
        bg.add(proximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        SetarValores();
        this.setVisible(false);
    }//GEN-LAST:event_proximoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbValor;
    private javax.swing.JButton proximo;
    private javax.swing.JComboBox<String> textoCategoria;
    private javax.swing.JTextField textoDescricao;
    private javax.swing.JTextField textoImagem;
    private javax.swing.JTextField textoMarca;
    private javax.swing.JTextField textoModelo;
    private javax.swing.JTextField textoValor;
    // End of variables declaration//GEN-END:variables
}
