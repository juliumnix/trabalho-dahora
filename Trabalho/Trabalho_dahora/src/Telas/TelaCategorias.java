/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Codigo.Armazenamento;
import Codigo.Produto;
import Codigo.Utilitarios;
import Telas.LoginView;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;
import java.util.List;

/**
 *
 * @author Mateus
 */
public class TelaCategorias extends javax.swing.JFrame {
    private TelaPrincipal principal;
    private LoginView login;
    private List<Produto> produtos;
    private List<JPanel> jPanells;
    private List<JLabel> jLabellsImg;
    private List<JLabel> jLabellsText;

    public TelaCategorias(TelaPrincipal principal) {
        this.principal = principal;
        this.login = principal.getLogin();
        this.produtos = new ArrayList<>();
        this.jPanells = new ArrayList<>();
        this.jLabellsImg = new ArrayList<>();
        this.jLabellsText = new ArrayList<>();
        initComponents();
        addJPanel();
        addJLabelImg();
        addJLabelText();
        apareceImagem();
        icon.requestFocus();
        popUpMenu.setVisible(false);

    }
    
    public void addJPanel ()
    {
        jPanells.add(produto1);
        jPanells.add(produto2);
        jPanells.add(produto3);
        jPanells.add(produto4);
        jPanells.add(produto5);
        jPanells.add(produto6);
        jPanells.add(produto7);
        jPanells.add(produto8);
        jPanells.add(produto9);
    }
    public void addJLabelImg ()
    {
        jLabellsImg.add(img1);
        jLabellsImg.add(img2);
        jLabellsImg.add(img3);
        jLabellsImg.add(img4);
        jLabellsImg.add(img5);
        jLabellsImg.add(img6);
        jLabellsImg.add(img7);
        jLabellsImg.add(img8);
        jLabellsImg.add(img9);
        
    }
    public void addJLabelText ()
    {
        jLabellsText.add(text1);
        jLabellsText.add(text2);
        jLabellsText.add(text3);
        jLabellsText.add(text4);
        jLabellsText.add(text5);
        jLabellsText.add(text6);
        jLabellsText.add(text7);
        jLabellsText.add(text8);
        jLabellsText.add(text9);
        
    }
    
    public void setVisiblesFalse ()
    {
        produto1.setVisible(false);
        produto2.setVisible(false);
        produto3.setVisible(false);
        produto4.setVisible(false);
        produto5.setVisible(false);
        produto6.setVisible(false);
        produto7.setVisible(false);
        produto8.setVisible(false);
        produto9.setVisible(false);
        
    }
    
    public void ObjetosNovaPagina ()
    {
        setVisiblesFalse();
        principal.getProdutos();
        for (int i = 0; i < principal.getProdutos().size(); i++) 
        {
            jPanells.get(i).setVisible(true);
            Utilitarios.criarPainelProduto(principal.getProdutos().get(i).getImagem(), jLabellsImg.get(i), principal.getProdutos().get(i).getModelo()+" R$ "+principal.getProdutos().get(i).getValor(), jLabellsText.get(i));
            
        }

    }
    
//    public void ObjetosNovaPagina (String pesquisa)
//    {
//        setVisiblesFalse();
//        principal.getProdutos();
//        int count = 0;
//        for (int i = 0; i < principal.getProdutos().size(); i++) 
//        {
//            if (principal.)
//            jPanells.get(i).setVisible(true);
//            Utilitarios.criarPainelProduto(principal.getProdutos().get(i).getImagem(), jLabellsImg.get(i), principal.getProdutos().get(i).getModelo()+" R$ "+principal.getProdutos().get(i).getValor(), jLabellsText.get(i));
//            
//        }
//
//    }
    
    
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
        produto1 = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        produto2 = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        produto3 = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        produto4 = new javax.swing.JPanel();
        text4 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        produto5 = new javax.swing.JPanel();
        text5 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        produto6 = new javax.swing.JPanel();
        text6 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();
        produto7 = new javax.swing.JPanel();
        text7 = new javax.swing.JLabel();
        img7 = new javax.swing.JLabel();
        produto8 = new javax.swing.JPanel();
        text8 = new javax.swing.JLabel();
        img8 = new javax.swing.JLabel();
        produto9 = new javax.swing.JPanel();
        text9 = new javax.swing.JLabel();
        img9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOOM - Loja de Informática");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
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

        icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconMouseClicked(evt);
            }
        });
        menu.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 6, 95, 95));

        btArmazenamento.setBackground(new java.awt.Color(121, 112, 169));
        btArmazenamento.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btArmazenamento.setForeground(new java.awt.Color(69, 65, 88));
        btArmazenamento.setText("Armazenamento");
        btArmazenamento.setBorder(null);
        btArmazenamento.setBorderPainted(false);
        btArmazenamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btComputador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComputadorActionPerformed(evt);
            }
        });
        menu.add(btComputador, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 136, 109, 25));

        btCooler.setBackground(new java.awt.Color(121, 112, 169));
        btCooler.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btCooler.setForeground(new java.awt.Color(69, 65, 88));
        btCooler.setText("Cooler");
        btCooler.setBorder(null);
        btCooler.setMaximumSize(new java.awt.Dimension(103, 20));
        btCooler.setMinimumSize(new java.awt.Dimension(103, 20));
        btCooler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCoolerActionPerformed(evt);
            }
        });
        menu.add(btCooler, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 165, 109, 25));

        btFonte.setBackground(new java.awt.Color(121, 112, 169));
        btFonte.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btFonte.setForeground(new java.awt.Color(69, 65, 88));
        btFonte.setText("Fonte");
        btFonte.setBorder(null);
        btFonte.setMaximumSize(new java.awt.Dimension(103, 20));
        btFonte.setMinimumSize(new java.awt.Dimension(103, 20));
        btFonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFonteActionPerformed(evt);
            }
        });
        menu.add(btFonte, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 194, 109, 25));

        btGabinete.setBackground(new java.awt.Color(121, 112, 169));
        btGabinete.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btGabinete.setForeground(new java.awt.Color(69, 65, 88));
        btGabinete.setText("Gabinete");
        btGabinete.setBorder(null);
        btGabinete.setMaximumSize(new java.awt.Dimension(103, 20));
        btGabinete.setMinimumSize(new java.awt.Dimension(103, 20));
        btGabinete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGabineteActionPerformed(evt);
            }
        });
        menu.add(btGabinete, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 223, 109, 25));

        btHeadset.setBackground(new java.awt.Color(121, 112, 169));
        btHeadset.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btHeadset.setForeground(new java.awt.Color(69, 65, 88));
        btHeadset.setText("Headset");
        btHeadset.setBorder(null);
        btHeadset.setMaximumSize(new java.awt.Dimension(103, 20));
        btHeadset.setMinimumSize(new java.awt.Dimension(103, 20));
        btHeadset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHeadsetActionPerformed(evt);
            }
        });
        menu.add(btHeadset, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 252, 109, 25));

        btMemoriaRAM.setBackground(new java.awt.Color(121, 112, 169));
        btMemoriaRAM.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btMemoriaRAM.setForeground(new java.awt.Color(69, 65, 88));
        btMemoriaRAM.setText("Memória RAM");
        btMemoriaRAM.setBorder(null);
        btMemoriaRAM.setMaximumSize(new java.awt.Dimension(103, 20));
        btMemoriaRAM.setMinimumSize(new java.awt.Dimension(103, 20));
        btMemoriaRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMemoriaRAMActionPerformed(evt);
            }
        });
        menu.add(btMemoriaRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 281, 109, 25));

        btMonitor.setBackground(new java.awt.Color(121, 112, 169));
        btMonitor.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btMonitor.setForeground(new java.awt.Color(69, 65, 88));
        btMonitor.setText("Monitor");
        btMonitor.setBorder(null);
        btMonitor.setMaximumSize(new java.awt.Dimension(103, 20));
        btMonitor.setMinimumSize(new java.awt.Dimension(103, 20));
        btMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMonitorActionPerformed(evt);
            }
        });
        menu.add(btMonitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 310, 109, 25));

        btMouse.setBackground(new java.awt.Color(121, 112, 169));
        btMouse.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btMouse.setForeground(new java.awt.Color(69, 65, 88));
        btMouse.setText("Mouse");
        btMouse.setBorder(null);
        btMouse.setMaximumSize(new java.awt.Dimension(103, 20));
        btMouse.setMinimumSize(new java.awt.Dimension(103, 20));
        btMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMouseActionPerformed(evt);
            }
        });
        menu.add(btMouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 339, 109, 25));

        btNotebook.setBackground(new java.awt.Color(121, 112, 169));
        btNotebook.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btNotebook.setForeground(new java.awt.Color(69, 65, 88));
        btNotebook.setText("Notebook");
        btNotebook.setBorder(null);
        btNotebook.setMaximumSize(new java.awt.Dimension(103, 20));
        btNotebook.setMinimumSize(new java.awt.Dimension(103, 20));
        btNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNotebookActionPerformed(evt);
            }
        });
        menu.add(btNotebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 368, 109, 25));

        btPlacaDeVideo.setBackground(new java.awt.Color(121, 112, 169));
        btPlacaDeVideo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btPlacaDeVideo.setForeground(new java.awt.Color(69, 65, 88));
        btPlacaDeVideo.setText("Placa de Vídeo");
        btPlacaDeVideo.setBorder(null);
        btPlacaDeVideo.setMaximumSize(new java.awt.Dimension(103, 20));
        btPlacaDeVideo.setMinimumSize(new java.awt.Dimension(103, 20));
        btPlacaDeVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlacaDeVideoActionPerformed(evt);
            }
        });
        menu.add(btPlacaDeVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 397, 109, 25));

        btPlacaMae.setBackground(new java.awt.Color(121, 112, 169));
        btPlacaMae.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btPlacaMae.setForeground(new java.awt.Color(69, 65, 88));
        btPlacaMae.setText("Placa Mãe");
        btPlacaMae.setBorder(null);
        btPlacaMae.setMaximumSize(new java.awt.Dimension(103, 20));
        btPlacaMae.setMinimumSize(new java.awt.Dimension(103, 20));
        btPlacaMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlacaMaeActionPerformed(evt);
            }
        });
        menu.add(btPlacaMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 426, 109, 25));

        btProcessador.setBackground(new java.awt.Color(121, 112, 169));
        btProcessador.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btProcessador.setForeground(new java.awt.Color(69, 65, 88));
        btProcessador.setText("Processador");
        btProcessador.setBorder(null);
        btProcessador.setMinimumSize(new java.awt.Dimension(103, 20));
        btProcessador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProcessadorActionPerformed(evt);
            }
        });
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
        btTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTecladoActionPerformed(evt);
            }
        });
        menu.add(btTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 484, 109, 25));

        bg.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 588));

        tfPesquisa.setBackground(new java.awt.Color(69, 65, 88));
        tfPesquisa.setForeground(new java.awt.Color(255, 149, 128));
        tfPesquisa.setText("Pesquisa");
        tfPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPesquisaFocusLost(evt);
            }
        });
        tfPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisaActionPerformed(evt);
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

        produto1.setBackground(new java.awt.Color(69, 65, 88));
        produto1.setPreferredSize(new java.awt.Dimension(170, 170));
        produto1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img1.setPreferredSize(new java.awt.Dimension(150, 120));
        produto1.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        text1.setBackground(new java.awt.Color(255, 149, 128));
        text1.setForeground(new java.awt.Color(255, 149, 128));
        produto1.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        bg.add(produto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 52, -1, -1));

        produto2.setBackground(new java.awt.Color(69, 65, 88));
        produto2.setPreferredSize(new java.awt.Dimension(170, 170));
        produto2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text2.setBackground(new java.awt.Color(255, 149, 128));
        text2.setForeground(new java.awt.Color(255, 149, 128));
        produto2.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        img2.setPreferredSize(new java.awt.Dimension(150, 120));
        produto2.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bg.add(produto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 52, -1, -1));

        produto3.setBackground(new java.awt.Color(69, 65, 88));
        produto3.setPreferredSize(new java.awt.Dimension(170, 170));
        produto3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text3.setBackground(new java.awt.Color(255, 149, 128));
        text3.setForeground(new java.awt.Color(255, 149, 128));
        produto3.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        img3.setPreferredSize(new java.awt.Dimension(150, 120));
        produto3.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bg.add(produto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 52, -1, -1));

        produto4.setBackground(new java.awt.Color(69, 65, 88));
        produto4.setPreferredSize(new java.awt.Dimension(170, 170));
        produto4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text4.setBackground(new java.awt.Color(255, 149, 128));
        text4.setForeground(new java.awt.Color(255, 149, 128));
        produto4.add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        img4.setPreferredSize(new java.awt.Dimension(150, 120));
        produto4.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bg.add(produto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 227, -1, -1));

        produto5.setBackground(new java.awt.Color(69, 65, 88));
        produto5.setPreferredSize(new java.awt.Dimension(170, 170));
        produto5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text5.setBackground(new java.awt.Color(255, 149, 128));
        text5.setForeground(new java.awt.Color(255, 149, 128));
        produto5.add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        img5.setPreferredSize(new java.awt.Dimension(150, 120));
        produto5.add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bg.add(produto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 227, -1, -1));

        produto6.setBackground(new java.awt.Color(69, 65, 88));
        produto6.setPreferredSize(new java.awt.Dimension(170, 170));
        produto6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text6.setBackground(new java.awt.Color(255, 149, 128));
        text6.setForeground(new java.awt.Color(255, 149, 128));
        produto6.add(text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        img6.setPreferredSize(new java.awt.Dimension(150, 120));
        produto6.add(img6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bg.add(produto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 227, -1, -1));

        produto7.setBackground(new java.awt.Color(69, 65, 88));
        produto7.setPreferredSize(new java.awt.Dimension(170, 170));
        produto7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text7.setBackground(new java.awt.Color(255, 149, 128));
        text7.setForeground(new java.awt.Color(255, 149, 128));
        produto7.add(text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        img7.setPreferredSize(new java.awt.Dimension(150, 120));
        produto7.add(img7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bg.add(produto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 402, -1, -1));

        produto8.setBackground(new java.awt.Color(69, 65, 88));
        produto8.setPreferredSize(new java.awt.Dimension(170, 170));
        produto8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text8.setBackground(new java.awt.Color(255, 149, 128));
        text8.setForeground(new java.awt.Color(255, 149, 128));
        produto8.add(text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        img8.setPreferredSize(new java.awt.Dimension(150, 120));
        produto8.add(img8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bg.add(produto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 402, -1, -1));

        produto9.setBackground(new java.awt.Color(69, 65, 88));
        produto9.setPreferredSize(new java.awt.Dimension(170, 170));
        produto9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text9.setBackground(new java.awt.Color(255, 149, 128));
        text9.setForeground(new java.awt.Color(255, 149, 128));
        produto9.add(text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        img9.setPreferredSize(new java.awt.Dimension(150, 120));
        produto9.add(img9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bg.add(produto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 402, -1, -1));

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

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btSairActionPerformed

    private void tfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisaActionPerformed

    private void iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseClicked
        principal.aparecerComboComparar();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_iconMouseClicked

    private void btArmazenamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArmazenamentoActionPerformed
        principal.getProdutos().clear();
        principal.getProdutos().addAll(principal.getArmazenamentos());
        ObjetosNovaPagina ();
    }//GEN-LAST:event_btArmazenamentoActionPerformed

    private void btComputadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComputadorActionPerformed
        principal.getProdutos().clear();
        principal.getProdutos().addAll(principal.getComputador());
        ObjetosNovaPagina ();
    }//GEN-LAST:event_btComputadorActionPerformed

    private void btCoolerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCoolerActionPerformed
        principal.getProdutos().clear();
        principal.getProdutos().addAll(principal.getCooler());
        ObjetosNovaPagina ();
    }//GEN-LAST:event_btCoolerActionPerformed

    private void btFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFonteActionPerformed
        principal.getProdutos().clear();
        principal.getProdutos().addAll(principal.getFonte());
        ObjetosNovaPagina ();
    }//GEN-LAST:event_btFonteActionPerformed

    private void btGabineteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGabineteActionPerformed
        principal.getProdutos().clear();
        principal.getProdutos().addAll(principal.getGabinete());
        ObjetosNovaPagina ();
    }//GEN-LAST:event_btGabineteActionPerformed

    private void btHeadsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHeadsetActionPerformed
        principal.getProdutos().clear();
        principal.getProdutos().addAll(principal.getHeadset());
        ObjetosNovaPagina ();
    }//GEN-LAST:event_btHeadsetActionPerformed

    private void btMemoriaRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMemoriaRAMActionPerformed
        principal.getProdutos().clear();
        principal.getProdutos().addAll(principal.getMemoriaRAM());
        ObjetosNovaPagina ();
    }//GEN-LAST:event_btMemoriaRAMActionPerformed

    private void btMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMonitorActionPerformed
        principal.getProdutos().clear();
        principal.getProdutos().addAll(principal.getMonitor());
        ObjetosNovaPagina ();
    }//GEN-LAST:event_btMonitorActionPerformed

    private void btMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMouseActionPerformed
        principal.getProdutos().clear();
        principal.getProdutos().addAll(principal.getMouse());
        ObjetosNovaPagina ();
    }//GEN-LAST:event_btMouseActionPerformed

    private void btNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNotebookActionPerformed
        principal.getProdutos().clear();
        principal.getProdutos().addAll(principal.getNotebook());
        ObjetosNovaPagina ();
    }//GEN-LAST:event_btNotebookActionPerformed

    private void btPlacaDeVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlacaDeVideoActionPerformed
        principal.getProdutos().clear();
        principal.getProdutos().addAll(principal.getPlacaDeVideo());
        ObjetosNovaPagina ();
    }//GEN-LAST:event_btPlacaDeVideoActionPerformed

    private void btPlacaMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlacaMaeActionPerformed
        principal.getProdutos().clear();
        principal.getProdutos().addAll(principal.getPlacaMae());
        ObjetosNovaPagina ();
    }//GEN-LAST:event_btPlacaMaeActionPerformed

    private void btProcessadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProcessadorActionPerformed
        principal.getProdutos().clear();
        principal.getProdutos().addAll(principal.getProcessador());
        ObjetosNovaPagina ();
    }//GEN-LAST:event_btProcessadorActionPerformed

    private void btTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTecladoActionPerformed
        principal.getProdutos().clear();
        principal.getProdutos().addAll(principal.getTeclado());
        ObjetosNovaPagina ();
    }//GEN-LAST:event_btTecladoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btArmazenamento;
    private javax.swing.JButton btCart;
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
    private javax.swing.JLabel icon;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JLabel img8;
    private javax.swing.JLabel img9;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel popUpMenu;
    private javax.swing.JPanel produto1;
    private javax.swing.JPanel produto2;
    private javax.swing.JPanel produto3;
    private javax.swing.JPanel produto4;
    private javax.swing.JPanel produto5;
    private javax.swing.JPanel produto6;
    private javax.swing.JPanel produto7;
    private javax.swing.JPanel produto8;
    private javax.swing.JPanel produto9;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel text7;
    private javax.swing.JLabel text8;
    private javax.swing.JLabel text9;
    private javax.swing.JTextField tfPesquisa;
    // End of variables declaration//GEN-END:variables
}
