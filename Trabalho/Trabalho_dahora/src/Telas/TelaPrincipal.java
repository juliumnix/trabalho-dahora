/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Codigo.Armazenamento;
import Codigo.Utilitarios;
import Codigo.Produto;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashSet;
import javax.swing.ImageIcon;
import Telas.LoginView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mateus
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private LoginView login;
    private HashSet<Armazenamento> armazenamentos;
    private List<Produto> produtos;
    private TelaCategorias telaDeCompra ;
    
    
    public TelaPrincipal(LoginView login) {
        
        this.login = login;
        this.armazenamentos = new HashSet<Armazenamento>();
        this.produtos = new ArrayList<>();
        initComponents();
        this.telaDeCompra = new TelaCategorias(this);
        apareceImagem();
        icon.requestFocus();
        taProd1.setLineWrap(true);
        taProd2.setLineWrap(true);
        popUpMenu.setVisible(false);
        Utilitarios.criarPainelProduto("https://s1.static.brasilescola.uol.com.br/be/vestibular/-5824728585f3d.jpg", img1, "Texto teste", text1);
        Utilitarios.criarPainelProduto("https://s1.static.brasilescola.uol.com.br/be/vestibular/-5824728585f3d.jpg", img2, "Texto teste", text2);
        Utilitarios.criarPainelProduto("https://s1.static.brasilescola.uol.com.br/be/vestibular/-5824728585f3d.jpg", img3, "Texto teste", text3);   

    }
    public HashSet<Armazenamento> getArmazenamentos ()
    {
        return this.armazenamentos;
    }
    
    public List<Produto> getProdutos ()
    {
        return this.produtos;
    }
    
    public void criarArmazenamentos (String tipo, String modelo, float valor, String descricao, String marca, String categoria, String imagem, int capacidade, float velocidade)
    {
        Armazenamento armazenamento = new Armazenamento(modelo,valor, descricao, marca, categoria, imagem, capacidade, velocidade, tipo);
        getArmazenamentos().add(armazenamento);
    }
    
    public void apareceImagem(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
        
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/imagens/BOOM.png"));
        Image image = imgIco.getImage().getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
        icon.setIcon(new ImageIcon(image));
        
        ImageIcon imageIcon = new ImageIcon (getClass().getResource("/imagens/IconSearch.png"));
        Image imageIconSearch = imageIcon.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        btPesquisa.setIcon(new ImageIcon(imageIconSearch));
        
        ImageIcon iconCart = new ImageIcon (getClass().getResource("/imagens/IconCart.png"));
        Image iconCartAUX = iconCart.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        btCart.setIcon(new ImageIcon(iconCartAUX));
        
        ImageIcon iconFavorites = new ImageIcon (getClass().getResource("/imagens/IconFavorites.png"));
        Image iconFavoritesAUX = iconFavorites.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        btFavorites.setIcon(new ImageIcon(iconFavoritesAUX));
    }
        
    public LoginView getLogin (){
        return this.login;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        btArmazenamento = new javax.swing.JButton();
        btComputador = new javax.swing.JButton();
        btCooler = new javax.swing.JButton();
        btFonte = new javax.swing.JButton();
        btGabinete = new javax.swing.JButton();
        btHeadset = new javax.swing.JButton();
        btMemoriaRAM = new javax.swing.JButton();
        btMonitor = new javax.swing.JButton();
        btMouse = new javax.swing.JButton();
        btNotebook = new javax.swing.JButton();
        btPlacaDeVideo = new javax.swing.JButton();
        btPlacaMae = new javax.swing.JButton();
        btProcessador = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btTeclado = new javax.swing.JButton();
        tfPesquisa = new javax.swing.JTextField();
        btPesquisa = new javax.swing.JButton();
        btCart = new javax.swing.JButton();
        btFavorites = new javax.swing.JButton();
        popUpMenu = new javax.swing.JPanel();
        destaque1 = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        destaque2 = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        destaque3 = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        cbProduto1 = new javax.swing.JComboBox<>();
        cbProduto2 = new javax.swing.JComboBox<>();
        descricaoProd1 = new javax.swing.JPanel();
        imgProd1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taProd1 = new javax.swing.JTextArea();
        descricaoProd2 = new javax.swing.JPanel();
        imgProd2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taProd2 = new javax.swing.JTextArea();
        btCompare = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOOM - Loja de Informática");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(34, 33, 44));
        bg.setMaximumSize(new java.awt.Dimension(800, 600));
        bg.setMinimumSize(new java.awt.Dimension(800, 600));
        bg.setPreferredSize(new java.awt.Dimension(800, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(69, 65, 88));
        menu.setForeground(new java.awt.Color(69, 65, 88));
        menu.setAlignmentX(0.0F);
        menu.setAlignmentY(0.0F);
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu.setPreferredSize(new java.awt.Dimension(121, 720));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        menu.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 6, 95, 95));

        btArmazenamento.setBackground(new java.awt.Color(121, 112, 169));
        btArmazenamento.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btArmazenamento.setForeground(new java.awt.Color(69, 65, 88));
        btArmazenamento.setText("Armazenamento");
        btArmazenamento.setBorder(null);
        btArmazenamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btArmazenamento.setPreferredSize(new java.awt.Dimension(109, 25));
        btArmazenamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArmazenamentoActionPerformed(evt);
            }
        });
        menu.add(btArmazenamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 107, 109, 25));

        btComputador.setBackground(new java.awt.Color(121, 112, 169));
        btComputador.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btComputador.setForeground(new java.awt.Color(69, 65, 88));
        btComputador.setText("Computador");
        btComputador.setBorder(null);
        btComputador.setMaximumSize(new java.awt.Dimension(103, 20));
        btComputador.setMinimumSize(new java.awt.Dimension(103, 20));
        btComputador.setPreferredSize(new java.awt.Dimension(109, 25));
        menu.add(btComputador, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 136, 109, 25));

        btCooler.setBackground(new java.awt.Color(121, 112, 169));
        btCooler.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btCooler.setForeground(new java.awt.Color(69, 65, 88));
        btCooler.setText("Cooler");
        btCooler.setBorder(null);
        btCooler.setMaximumSize(new java.awt.Dimension(103, 20));
        btCooler.setMinimumSize(new java.awt.Dimension(103, 20));
        menu.add(btCooler, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 165, 109, 25));

        btFonte.setBackground(new java.awt.Color(121, 112, 169));
        btFonte.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btFonte.setForeground(new java.awt.Color(69, 65, 88));
        btFonte.setText("Fonte");
        btFonte.setBorder(null);
        btFonte.setMaximumSize(new java.awt.Dimension(103, 20));
        btFonte.setMinimumSize(new java.awt.Dimension(103, 20));
        menu.add(btFonte, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 194, 109, 25));

        btGabinete.setBackground(new java.awt.Color(121, 112, 169));
        btGabinete.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btGabinete.setForeground(new java.awt.Color(69, 65, 88));
        btGabinete.setText("Gabinete");
        btGabinete.setBorder(null);
        btGabinete.setMaximumSize(new java.awt.Dimension(103, 20));
        btGabinete.setMinimumSize(new java.awt.Dimension(103, 20));
        menu.add(btGabinete, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 223, 109, 25));

        btHeadset.setBackground(new java.awt.Color(121, 112, 169));
        btHeadset.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btHeadset.setForeground(new java.awt.Color(69, 65, 88));
        btHeadset.setText("Headset");
        btHeadset.setBorder(null);
        btHeadset.setMaximumSize(new java.awt.Dimension(103, 20));
        btHeadset.setMinimumSize(new java.awt.Dimension(103, 20));
        menu.add(btHeadset, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 252, 109, 25));

        btMemoriaRAM.setBackground(new java.awt.Color(121, 112, 169));
        btMemoriaRAM.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btMemoriaRAM.setForeground(new java.awt.Color(69, 65, 88));
        btMemoriaRAM.setText("Memória RAM");
        btMemoriaRAM.setBorder(null);
        btMemoriaRAM.setMaximumSize(new java.awt.Dimension(103, 20));
        btMemoriaRAM.setMinimumSize(new java.awt.Dimension(103, 20));
        menu.add(btMemoriaRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 281, 109, 25));

        btMonitor.setBackground(new java.awt.Color(121, 112, 169));
        btMonitor.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btMonitor.setForeground(new java.awt.Color(69, 65, 88));
        btMonitor.setText("Monitor");
        btMonitor.setBorder(null);
        btMonitor.setMaximumSize(new java.awt.Dimension(103, 20));
        btMonitor.setMinimumSize(new java.awt.Dimension(103, 20));
        menu.add(btMonitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 310, 109, 25));

        btMouse.setBackground(new java.awt.Color(121, 112, 169));
        btMouse.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btMouse.setForeground(new java.awt.Color(69, 65, 88));
        btMouse.setText("Mouse");
        btMouse.setBorder(null);
        btMouse.setMaximumSize(new java.awt.Dimension(103, 20));
        btMouse.setMinimumSize(new java.awt.Dimension(103, 20));
        menu.add(btMouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 339, 109, 25));

        btNotebook.setBackground(new java.awt.Color(121, 112, 169));
        btNotebook.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btNotebook.setForeground(new java.awt.Color(69, 65, 88));
        btNotebook.setText("Notebook");
        btNotebook.setBorder(null);
        btNotebook.setMaximumSize(new java.awt.Dimension(103, 20));
        btNotebook.setMinimumSize(new java.awt.Dimension(103, 20));
        menu.add(btNotebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 368, 109, 25));

        btPlacaDeVideo.setBackground(new java.awt.Color(121, 112, 169));
        btPlacaDeVideo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btPlacaDeVideo.setForeground(new java.awt.Color(69, 65, 88));
        btPlacaDeVideo.setText("Placa de Vídeo");
        btPlacaDeVideo.setBorder(null);
        btPlacaDeVideo.setMaximumSize(new java.awt.Dimension(103, 20));
        btPlacaDeVideo.setMinimumSize(new java.awt.Dimension(103, 20));
        menu.add(btPlacaDeVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 397, 109, 25));

        btPlacaMae.setBackground(new java.awt.Color(121, 112, 169));
        btPlacaMae.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btPlacaMae.setForeground(new java.awt.Color(69, 65, 88));
        btPlacaMae.setText("Placa Mãe");
        btPlacaMae.setBorder(null);
        btPlacaMae.setMaximumSize(new java.awt.Dimension(103, 20));
        btPlacaMae.setMinimumSize(new java.awt.Dimension(103, 20));
        menu.add(btPlacaMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 426, 109, 25));

        btProcessador.setBackground(new java.awt.Color(121, 112, 169));
        btProcessador.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btProcessador.setForeground(new java.awt.Color(69, 65, 88));
        btProcessador.setText("Processador");
        btProcessador.setBorder(null);
        btProcessador.setMinimumSize(new java.awt.Dimension(103, 20));
        menu.add(btProcessador, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 455, 109, 25));

        btSair.setBackground(new java.awt.Color(34, 33, 44));
        btSair.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btSair.setForeground(new java.awt.Color(255, 149, 128));
        btSair.setText("Sair");
        btSair.setBorder(null);
        btSair.setMaximumSize(new java.awt.Dimension(103, 20));
        btSair.setMinimumSize(new java.awt.Dimension(103, 20));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        menu.add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 557, 109, 25));

        btTeclado.setBackground(new java.awt.Color(121, 112, 169));
        btTeclado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btTeclado.setForeground(new java.awt.Color(69, 65, 88));
        btTeclado.setText("Teclado");
        btTeclado.setBorder(null);
        btTeclado.setMaximumSize(new java.awt.Dimension(103, 20));
        btTeclado.setMinimumSize(new java.awt.Dimension(103, 20));
        menu.add(btTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 484, 109, 25));

        bg.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 588));

        tfPesquisa.setBackground(new java.awt.Color(69, 65, 88));
        tfPesquisa.setForeground(new java.awt.Color(255, 149, 128));
        tfPesquisa.setText("Pesquisa");
        tfPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPesquisaFocusLost(evt);
            }
        });
        bg.add(tfPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 6, 522, 28));

        btPesquisa.setBackground(new java.awt.Color(121, 112, 169));
        btPesquisa.setBorder(null);
        bg.add(btPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 6, 41, 28));

        btCart.setBackground(new java.awt.Color(121, 112, 169));
        btCart.setBorder(null);
        bg.add(btCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 6, 28, 28));

        btFavorites.setBackground(new java.awt.Color(121, 112, 169));
        btFavorites.setBorder(null);
        btFavorites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFavoritesActionPerformed(evt);
            }
        });
        bg.add(btFavorites, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 6, 28, 28));

        popUpMenu.setBackground(new java.awt.Color(69, 65, 88));
        popUpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg.add(popUpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 52, 109, 542));

        destaque1.setBackground(new java.awt.Color(69, 65, 88));
        destaque1.setPreferredSize(new java.awt.Dimension(170, 170));
        destaque1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img1.setPreferredSize(new java.awt.Dimension(150, 120));
        destaque1.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        text1.setBackground(new java.awt.Color(255, 149, 128));
        text1.setForeground(new java.awt.Color(255, 149, 128));
        destaque1.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        bg.add(destaque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 52, -1, -1));

        destaque2.setBackground(new java.awt.Color(69, 65, 88));
        destaque2.setPreferredSize(new java.awt.Dimension(170, 170));
        destaque2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text2.setBackground(new java.awt.Color(255, 149, 128));
        text2.setForeground(new java.awt.Color(255, 149, 128));
        destaque2.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        img2.setPreferredSize(new java.awt.Dimension(150, 120));
        destaque2.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bg.add(destaque2, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 52, -1, -1));

        destaque3.setBackground(new java.awt.Color(69, 65, 88));
        destaque3.setPreferredSize(new java.awt.Dimension(170, 170));
        destaque3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text3.setBackground(new java.awt.Color(255, 149, 128));
        text3.setForeground(new java.awt.Color(255, 149, 128));
        destaque3.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        img3.setPreferredSize(new java.awt.Dimension(150, 120));
        destaque3.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bg.add(destaque3, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 52, -1, -1));

        cbTipo.setBackground(new java.awt.Color(69, 65, 88));
        cbTipo.setForeground(new java.awt.Color(255, 149, 128));
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Armazenamento", "Computador", "Cooler", "Fonte", "Gabinete", "Headset", "Memória RAM", "Monitor", "Mouse", "Notebook", "Placa Mãe", "Processador", "Teclado" }));
        cbTipo.setBorder(null);
        cbTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbTipo.setPreferredSize(new java.awt.Dimension(521, 26));
        bg.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 240, -1, -1));

        cbProduto1.setBackground(new java.awt.Color(69, 65, 88));
        cbProduto1.setForeground(new java.awt.Color(255, 149, 128));
        cbProduto1.setBorder(null);
        cbProduto1.setPreferredSize(new java.awt.Dimension(240, 26));
        bg.add(cbProduto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 283, -1, -1));

        cbProduto2.setBackground(new java.awt.Color(69, 65, 88));
        cbProduto2.setForeground(new java.awt.Color(255, 149, 128));
        cbProduto2.setBorder(null);
        cbProduto2.setPreferredSize(new java.awt.Dimension(240, 26));
        bg.add(cbProduto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 283, -1, -1));

        descricaoProd1.setBackground(new java.awt.Color(69, 65, 88));
        descricaoProd1.setPreferredSize(new java.awt.Dimension(240, 274));
        descricaoProd1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgProd1.setPreferredSize(new java.awt.Dimension(90, 90));
        descricaoProd1.add(imgProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 9, -1, -1));

        taProd1.setBackground(new java.awt.Color(34, 33, 44));
        taProd1.setColumns(20);
        taProd1.setRows(5);
        taProd1.setBorder(null);
        taProd1.setMinimumSize(new java.awt.Dimension(230, 80));
        taProd1.setPreferredSize(new java.awt.Dimension(235, 80));
        jScrollPane1.setViewportView(taProd1);

        descricaoProd1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 108, 228, 160));

        bg.add(descricaoProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 320, -1, -1));

        descricaoProd2.setBackground(new java.awt.Color(69, 65, 88));
        descricaoProd2.setPreferredSize(new java.awt.Dimension(240, 274));
        descricaoProd2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgProd2.setPreferredSize(new java.awt.Dimension(90, 90));
        descricaoProd2.add(imgProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 9, -1, -1));

        taProd2.setBackground(new java.awt.Color(34, 33, 44));
        taProd2.setColumns(20);
        taProd2.setRows(5);
        taProd2.setBorder(null);
        taProd2.setMinimumSize(new java.awt.Dimension(230, 80));
        taProd2.setPreferredSize(new java.awt.Dimension(230, 80));
        jScrollPane3.setViewportView(taProd2);

        descricaoProd2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 108, 228, 160));

        bg.add(descricaoProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));
        descricaoProd2.getAccessibleContext().setAccessibleName("");

        btCompare.setBackground(new java.awt.Color(121, 112, 169));
        btCompare.setForeground(new java.awt.Color(69, 65, 88));
        btCompare.setText("X");
        btCompare.setBorder(null);
        btCompare.setPreferredSize(new java.awt.Dimension(26, 26));
        bg.add(btCompare, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 283, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void tfPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisaFocusLost
        if (tfPesquisa.getText().equals(""))
        {
            tfPesquisa.setText("Pesquisa");
        }
    }//GEN-LAST:event_tfPesquisaFocusLost

    private void tfPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisaFocusGained
        if (tfPesquisa.getText().equals("Pesquisa"))
        {
            tfPesquisa.setText("");
        }
    }//GEN-LAST:event_tfPesquisaFocusGained

    private void btFavoritesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFavoritesActionPerformed
        if (popUpMenu.isVisible())
        {
            popUpMenu.setVisible(false);
        }else
        {
            popUpMenu.setVisible(true);
        }
    }//GEN-LAST:event_btFavoritesActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void btArmazenamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArmazenamentoActionPerformed
        if (login.verificaAdm() == true)
        {
            Teste_de_cadastro teste_tela = new Teste_de_cadastro(this);
            teste_tela.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(armazenamentos);
            telaDeCompra.setVisible(true);
            telaDeCompra.ObjetosNovaPagina ();
            this.setVisible(false);
        }
    }//GEN-LAST:event_btArmazenamentoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btSairActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btArmazenamento;
    private javax.swing.JButton btCart;
    private javax.swing.JButton btCompare;
    private javax.swing.JButton btComputador;
    private javax.swing.JButton btCooler;
    private javax.swing.JButton btFavorites;
    private javax.swing.JButton btFonte;
    private javax.swing.JButton btGabinete;
    private javax.swing.JButton btHeadset;
    private javax.swing.JButton btMemoriaRAM;
    private javax.swing.JButton btMonitor;
    private javax.swing.JButton btMouse;
    private javax.swing.JButton btNotebook;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JButton btPlacaDeVideo;
    private javax.swing.JButton btPlacaMae;
    private javax.swing.JButton btProcessador;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btTeclado;
    private javax.swing.JComboBox<Produto> cbProduto1;
    private javax.swing.JComboBox<Produto> cbProduto2;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JPanel descricaoProd1;
    private javax.swing.JPanel descricaoProd2;
    private javax.swing.JPanel destaque1;
    private javax.swing.JPanel destaque2;
    private javax.swing.JPanel destaque3;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel imgProd1;
    private javax.swing.JLabel imgProd2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel popUpMenu;
    private javax.swing.JTextArea taProd1;
    private javax.swing.JTextArea taProd2;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JTextField tfPesquisa;
    // End of variables declaration//GEN-END:variables
}
