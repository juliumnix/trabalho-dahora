package Telas;

import Codigo.Armazenamento;
import Codigo.Computador;
import Codigo.Cooler;
import Codigo.Fonte;
import Codigo.Gabinete;
import Codigo.Headset;
import Codigo.MapManipulator;
import Codigo.MemoriaRAM;
import Codigo.Monitor;
import Codigo.Mouse;
import Codigo.Notebook;
import Codigo.PlacaDeVideo;
import Codigo.PlacaMae;
import Codigo.Processador;
import Codigo.Utilitarios;
import Codigo.Produto;
import Codigo.Teclado;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashSet;
import javax.swing.ImageIcon;
import Telas.TelaLogin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TelaPrincipal extends javax.swing.JFrame implements MapManipulator, Comparator<JTextArea>{
    //telas
    private TelaCategorias telaCategorias;
    private TelaLogin telaLogin;
    private TelaProduto telaProduto;
    //coleções
    private Set<Armazenamento> armazenamentos;
    private Set<Computador> computadores;
    private Set<Cooler> coolers;
    private Set<Fonte> fontes;
    private Set<Gabinete> gabinetes;
    private Set<Headset> headsets;
    private Set<MemoriaRAM> memoriasRam;
    private Set<Monitor> monitores;
    private Set<Mouse> mouses;
    private Set<Notebook> notebooks;
    private Set<PlacaDeVideo> placasDeVideos;
    private Set<PlacaMae> placasMae;
    private Set<Processador> processadores;
    private Set<Teclado> teclados;
    private List<Produto> produtos;
    //auxiliares
    private String categoriaEscolhida;
    
    private Map<Integer, String> favoritos;
    private static int valueTeste;
  
    public TelaPrincipal(TelaLogin telaLogin) {
        //telas
        this.telaLogin = telaLogin;
        this.telaCategorias = new TelaCategorias(this);
        this. telaProduto = new TelaProduto (telaCategorias, this, this.telaLogin);
        //coleções
        this.armazenamentos = new HashSet<>();
        this.computadores = new HashSet<>();
        this.coolers = new HashSet<>();
        this.fontes = new HashSet<>();
        this.gabinetes = new HashSet<>();
        this.headsets = new HashSet<>();
        this.memoriasRam = new HashSet<>();
        this.monitores = new HashSet<>();
        this.mouses = new HashSet<>();
        this.notebooks = new HashSet<>();
        this.placasDeVideos = new HashSet<>();
        this.placasMae = new HashSet<>();
        this.processadores = new HashSet<>();
        this.teclados = new HashSet<>();
        this.produtos = new ArrayList<>();
        this.favoritos = new HashMap<>();
        
        initComponents();
        configurarTela();
        Utilitarios.criarPainelProduto("https://s1.static.brasilescola.uol.com.br/be/vestibular/-5824728585f3d.jpg", img1, "Texto teste", text1);
        Utilitarios.criarPainelProduto("https://s1.static.brasilescola.uol.com.br/be/vestibular/-5824728585f3d.jpg", img2, "Texto teste", text2);
        Utilitarios.criarPainelProduto("https://s1.static.brasilescola.uol.com.br/be/vestibular/-5824728585f3d.jpg", img3, "Texto teste", text3);   

    }
    public Set<Armazenamento> getArmazenamentos ()
    {
        return this.armazenamentos;
    }
    
    public Set<Computador> getComputador ()
    {
        return this.computadores;
    }
    
    public Set<Cooler> getCooler ()
    {
        return this.coolers;
    }
    
    public Set<Fonte> getFonte ()
    {
        return this.fontes;
    }
    
    public Set<Gabinete> getGabinete ()
    {
        return this.gabinetes;
    }
    
    public Set<Headset> getHeadset ()
    {
        return this.headsets;
    }
    
    public Set<MemoriaRAM> getMemoriaRAM ()
    {
        return this.memoriasRam;
    }
    
    public Set<Monitor> getMonitor ()
    {
        return this.monitores;
    }
    
    public Set<Mouse> getMouse ()
    {
        return this.mouses;
    }
    
    public Set<Notebook> getNotebook ()
    {
        return this.notebooks;
    }
    
    public Set<PlacaDeVideo> getPlacaDeVideo ()
    {
        return this.placasDeVideos;
    }
    
    public Set<PlacaMae> getPlacaMae ()
    {
        return this.placasMae;
    }
    
    public Set<Processador> getProcessador ()
    {
        return this.processadores;
    }
    
    public Set<Teclado> getTeclado ()
    {
        return this.teclados;
    }
    public List<Produto> getProdutos ()
    {
        return this.produtos;
    }
    
    public TelaLogin getLogin (){
        return this.telaLogin;
    }

    public String getCategoriaEscolhida() {
        return categoriaEscolhida;
    }
    
    public JLabel getIcon ()
    {
        return this.icon;
    }
    
    public void configurarTela(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
        Utilitarios.aparecerImagemLocal(icon, "src/imagens/BOOM.png");
        Utilitarios.aparecerImagemLocal(btPesquisa, "src/imagens/IconSearch.png");
        Utilitarios.aparecerImagemLocal(btCart, "src/imagens/IconCart.png");
        icon.requestFocus();
        taProd1.setLineWrap(true);
        taProd2.setLineWrap(true);
        melhorCompra1.setVisible(false);
        melhorCompra2.setVisible(false);
        popUpMenu.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
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
        btaux = new javax.swing.JButton();
        btCart = new javax.swing.JButton();
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
        melhorCompra1 = new javax.swing.JLabel();
        descricaoProd2 = new javax.swing.JPanel();
        imgProd2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taProd2 = new javax.swing.JTextArea();
        melhorCompra2 = new javax.swing.JLabel();
        btCompare = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOOM - Loja de Informática");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });
        bg.add(btPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 6, 41, 28));

        btaux.setBackground(new java.awt.Color(121, 112, 169));
        btaux.setBorder(null);
        btaux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btauxActionPerformed(evt);
            }
        });
        bg.add(btaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 6, 28, 28));

        btCart.setBackground(new java.awt.Color(121, 112, 169));
        btCart.setBorder(null);
        btCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCartActionPerformed(evt);
            }
        });
        bg.add(btCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 6, 28, 28));

        popUpMenu.setBackground(new java.awt.Color(69, 65, 88));
        popUpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg.add(popUpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 52, 109, 542));

        destaque1.setBackground(new java.awt.Color(69, 65, 88));
        destaque1.setPreferredSize(new java.awt.Dimension(170, 170));
        destaque1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                destaque1MouseClicked(evt);
            }
        });
        destaque1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img1.setPreferredSize(new java.awt.Dimension(150, 120));
        destaque1.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        text1.setBackground(new java.awt.Color(255, 149, 128));
        text1.setForeground(new java.awt.Color(255, 149, 128));
        destaque1.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        bg.add(destaque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 52, -1, -1));

        destaque2.setBackground(new java.awt.Color(69, 65, 88));
        destaque2.setPreferredSize(new java.awt.Dimension(170, 170));
        destaque2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                destaque2MouseClicked(evt);
            }
        });
        destaque2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text2.setBackground(new java.awt.Color(255, 149, 128));
        text2.setForeground(new java.awt.Color(255, 149, 128));
        destaque2.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        img2.setPreferredSize(new java.awt.Dimension(150, 120));
        destaque2.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bg.add(destaque2, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 52, -1, -1));

        destaque3.setBackground(new java.awt.Color(69, 65, 88));
        destaque3.setPreferredSize(new java.awt.Dimension(170, 170));
        destaque3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                destaque3MouseClicked(evt);
            }
        });
        destaque3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text3.setBackground(new java.awt.Color(255, 149, 128));
        text3.setForeground(new java.awt.Color(255, 149, 128));
        destaque3.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 150, 28));

        img3.setPreferredSize(new java.awt.Dimension(150, 120));
        destaque3.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bg.add(destaque3, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 52, -1, -1));

        cbTipo.setBackground(new java.awt.Color(69, 65, 88));
        cbTipo.setForeground(new java.awt.Color(255, 149, 128));
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Armazenamento", "Computador", "Cooler", "Fonte", "Gabinete", "Headset", "Memória RAM", "Monitor", "Mouse", "Notebook", "Placa de Vídeo", "Placa Mãe", "Processador", "Teclado" }));
        cbTipo.setBorder(null);
        cbTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbTipo.setPreferredSize(new java.awt.Dimension(521, 26));
        cbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoItemStateChanged(evt);
            }
        });
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

        imgProd1.setPreferredSize(new java.awt.Dimension(80, 80));
        descricaoProd1.add(imgProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        taProd1.setEditable(false);
        taProd1.setBackground(new java.awt.Color(34, 33, 44));
        taProd1.setColumns(20);
        taProd1.setForeground(new java.awt.Color(255, 149, 128));
        taProd1.setRows(5);
        taProd1.setBorder(null);
        taProd1.setMinimumSize(new java.awt.Dimension(230, 80));
        taProd1.setPreferredSize(new java.awt.Dimension(235, 80));
        jScrollPane1.setViewportView(taProd1);

        descricaoProd1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 108, 228, 160));

        melhorCompra1.setForeground(new java.awt.Color(255, 149, 128));
        melhorCompra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        melhorCompra1.setText("Melhor compra");
        descricaoProd1.add(melhorCompra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, -1));

        bg.add(descricaoProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 320, -1, -1));

        descricaoProd2.setBackground(new java.awt.Color(69, 65, 88));
        descricaoProd2.setPreferredSize(new java.awt.Dimension(240, 274));
        descricaoProd2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgProd2.setPreferredSize(new java.awt.Dimension(80, 80));
        descricaoProd2.add(imgProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        taProd2.setBackground(new java.awt.Color(34, 33, 44));
        taProd2.setColumns(20);
        taProd2.setForeground(new java.awt.Color(255, 149, 128));
        taProd2.setRows(5);
        taProd2.setBorder(null);
        taProd2.setMinimumSize(new java.awt.Dimension(230, 80));
        taProd2.setPreferredSize(new java.awt.Dimension(230, 80));
        jScrollPane3.setViewportView(taProd2);

        descricaoProd2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 108, 228, 160));

        melhorCompra2.setForeground(new java.awt.Color(255, 149, 128));
        melhorCompra2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        melhorCompra2.setText("Melhor compra");
        descricaoProd2.add(melhorCompra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, -1));

        bg.add(descricaoProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));
        descricaoProd2.getAccessibleContext().setAccessibleName("");

        btCompare.setBackground(new java.awt.Color(121, 112, 169));
        btCompare.setForeground(new java.awt.Color(69, 65, 88));
        btCompare.setText("X");
        btCompare.setBorder(null);
        btCompare.setPreferredSize(new java.awt.Dimension(26, 26));
        btCompare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCompareActionPerformed(evt);
            }
        });
        bg.add(btCompare, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 283, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void tfPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisaFocusLost
        Utilitarios.aparecerTexto("Pesquisa", tfPesquisa);
    }//GEN-LAST:event_tfPesquisaFocusLost

    private void tfPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisaFocusGained
        Utilitarios.desaparecerTexto("Pesquisa", tfPesquisa);
    }//GEN-LAST:event_tfPesquisaFocusGained

    private void btCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCartActionPerformed
        if (popUpMenu.isVisible())
        {
            popUpMenu.setVisible(false);
        }else
        {
            popUpMenu.setVisible(true);
        }
    }//GEN-LAST:event_btCartActionPerformed

    private void btArmazenamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArmazenamentoActionPerformed
        this.categoriaEscolhida = "Armazenamento";
        
        if (telaLogin.verificaAdm() == true)
        {
            TelaCadastroPrimeira cadastro = new TelaCadastroPrimeira (this);
            cadastro.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(armazenamentos);
            Utilitarios.entrarTelaCategorias(telaCategorias, this);
        }
    }//GEN-LAST:event_btArmazenamentoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        Utilitarios.entrarTelaLogin(telaLogin, this);
    }//GEN-LAST:event_btSairActionPerformed

    private void btComputadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComputadorActionPerformed
        this.categoriaEscolhida = "Computador";
        
        if (telaLogin.verificaAdm() == true)
        {
            TelaCadastroPrimeira cadastro = new TelaCadastroPrimeira (this);
            cadastro.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(computadores);
            Utilitarios.entrarTelaCategorias(telaCategorias, this);
        }
    }//GEN-LAST:event_btComputadorActionPerformed

    private void btCoolerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCoolerActionPerformed
        this.categoriaEscolhida = "Cooler";
        
        if (telaLogin.verificaAdm() == true)
        {
            TelaCadastroPrimeira cadastro = new TelaCadastroPrimeira (this);
            cadastro.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(coolers);
            Utilitarios.entrarTelaCategorias(telaCategorias, this);
        }
    }//GEN-LAST:event_btCoolerActionPerformed

    private void btFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFonteActionPerformed
        this.categoriaEscolhida = "Fonte";
        
        if (telaLogin.verificaAdm() == true)
        {
            TelaCadastroPrimeira cadastro = new TelaCadastroPrimeira (this);
            cadastro.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(fontes);
            Utilitarios.entrarTelaCategorias(telaCategorias, this);
        }
    }//GEN-LAST:event_btFonteActionPerformed

    private void btGabineteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGabineteActionPerformed
        this.categoriaEscolhida = "Gabinete";
        
        if (telaLogin.verificaAdm() == true)
        {
            TelaCadastroPrimeira cadastro = new TelaCadastroPrimeira (this);
            cadastro.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(gabinetes);
            Utilitarios.entrarTelaCategorias(telaCategorias, this);
        }
    }//GEN-LAST:event_btGabineteActionPerformed

    private void btHeadsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHeadsetActionPerformed
        this.categoriaEscolhida = "Headset";
        
        if (telaLogin.verificaAdm() == true)
        {
            TelaCadastroPrimeira cadastro = new TelaCadastroPrimeira (this);
            cadastro.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(headsets);
            Utilitarios.entrarTelaCategorias(telaCategorias, this);
        }
    }//GEN-LAST:event_btHeadsetActionPerformed

    private void btMemoriaRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMemoriaRAMActionPerformed
        this.categoriaEscolhida = "Memória RAM";
        
        if (telaLogin.verificaAdm() == true)
        {
            TelaCadastroPrimeira cadastro = new TelaCadastroPrimeira (this);
            cadastro.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(memoriasRam);
            Utilitarios.entrarTelaCategorias(telaCategorias, this);
        }
    }//GEN-LAST:event_btMemoriaRAMActionPerformed

    private void btMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMonitorActionPerformed
        this.categoriaEscolhida = "Monitor";
        
        if (telaLogin.verificaAdm() == true)
        {
            TelaCadastroPrimeira cadastro = new TelaCadastroPrimeira (this);
            cadastro.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(monitores);
            Utilitarios.entrarTelaCategorias(telaCategorias, this);
        }
    }//GEN-LAST:event_btMonitorActionPerformed

    private void btMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMouseActionPerformed
        this.categoriaEscolhida = "Mouse";
        
        if (telaLogin.verificaAdm() == true)
        {
            TelaCadastroPrimeira cadastro = new TelaCadastroPrimeira (this);
            cadastro.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(mouses);
            Utilitarios.entrarTelaCategorias(telaCategorias, this);
        }
    }//GEN-LAST:event_btMouseActionPerformed

    private void btNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNotebookActionPerformed
        this.categoriaEscolhida = "Notebook";
        
        if (telaLogin.verificaAdm() == true)
        {
            TelaCadastroPrimeira cadastro = new TelaCadastroPrimeira (this);
            cadastro.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(notebooks);
            Utilitarios.entrarTelaCategorias(telaCategorias, this);
        }
    }//GEN-LAST:event_btNotebookActionPerformed

    private void btPlacaDeVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlacaDeVideoActionPerformed
        this.categoriaEscolhida = "Placa de Vídeo";
        
        if (telaLogin.verificaAdm() == true)
        {
            TelaCadastroPrimeira cadastro = new TelaCadastroPrimeira (this);
            cadastro.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(placasDeVideos);
            Utilitarios.entrarTelaCategorias(telaCategorias, this);
        }
    }//GEN-LAST:event_btPlacaDeVideoActionPerformed

    private void btPlacaMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlacaMaeActionPerformed
        this.categoriaEscolhida = "Placa Mãe";
        
        if (telaLogin.verificaAdm() == true)
        {
            TelaCadastroPrimeira cadastro = new TelaCadastroPrimeira (this);
            cadastro.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(placasMae);
            Utilitarios.entrarTelaCategorias(telaCategorias, this);
        }
    }//GEN-LAST:event_btPlacaMaeActionPerformed

    private void btProcessadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProcessadorActionPerformed
        this.categoriaEscolhida = "Processador";
        
        if (telaLogin.verificaAdm() == true)
        {
            TelaCadastroPrimeira cadastro = new TelaCadastroPrimeira (this);
            cadastro.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(processadores);
            Utilitarios.entrarTelaCategorias(telaCategorias, this);
        }
    }//GEN-LAST:event_btProcessadorActionPerformed

    private void btTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTecladoActionPerformed
        this.categoriaEscolhida = "Teclado";
        
        if (telaLogin.verificaAdm() == true)
        {
            TelaCadastroPrimeira cadastro = new TelaCadastroPrimeira (this);
            cadastro.setVisible(true);
        } else
        {
            this.produtos.clear();
            this.produtos.addAll(teclados);
            Utilitarios.entrarTelaCategorias(telaCategorias, this);
        }
    }//GEN-LAST:event_btTecladoActionPerformed

    public void verifyContentFavorites () {
        this.constructorValue();
        popUpMenu.revalidate();
        popUpMenu.repaint();
        
    }
   
    public void constructorValue () {
        popUpMenu.removeAll();
        popUpMenu.setLayout(new FlowLayout());
        for (Map.Entry<Integer, String> entry : favoritos.entrySet()) {
          JLabel _lbl = new JLabel("<html><div><p style='color: #FFCA80; text-align: center;'>id:"+entry.getKey()+" "+entry.getValue()+"</p></div></html>");
          _lbl.setText(entry.getValue()); 
          int width = _lbl.getText().length();
          if(width > 10) {
             _lbl.setFont(new Font("Dialog", 0, 10));  
          }
          _lbl.setForeground(new Color(255,202,128));
          
          _lbl.setMinimumSize(new Dimension(116, 16));
          JButton botaoDelete = new JButton ("<html><div><p style=' color: #FFCA80; background: #7970A9; text-align: center;'>Delete</p></div></html>");
          botaoDelete.setBackground(new Color(121,112,169));
          botaoDelete.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e) {
              String action = e.getActionCommand();
              int value = Integer.parseInt(action);
              removefavorito(value);
              }
              
          });
            botaoDelete.setActionCommand(entry.getKey().toString());
            popUpMenu.add(_lbl);
            popUpMenu.add(botaoDelete);
        
        
        }
    }
    
    public void alterarComboBox ()
    {
        String tipo = cbTipo.getSelectedItem().toString();
        cbProduto1.removeAllItems();
        cbProduto2.removeAllItems();
        switch (tipo)
        {
            case "Armazenamento":
                for (Armazenamento armazenamento: armazenamentos)
                {
                    cbProduto1.addItem(armazenamento);
                    cbProduto2.addItem(armazenamento);
                }
                break;
            case "Computador":
                for (Computador computador: computadores)
                {
                    cbProduto1.addItem(computador);
                    cbProduto2.addItem(computador);
                }
                break;
            case "Cooler":
                for (Cooler cooler: coolers)
                {
                    cbProduto1.addItem(cooler);
                    cbProduto2.addItem(cooler);
                }
                break;
            case "Fonte":
                for (Fonte fonte: fontes)
                {
                    cbProduto1.addItem(fonte);
                    cbProduto2.addItem(fonte);
                }
                break;
            case "Gabinete":
                for (Gabinete gabinete: gabinetes)
                {
                    cbProduto1.addItem(gabinete);
                    cbProduto2.addItem(gabinete);
                }
                break;
            case "Headset":
                for (Headset headset: headsets)
                {
                    cbProduto1.addItem(headset);
                    cbProduto2.addItem(headset);
                }
                break;
            case "Memória RAM":
                for (MemoriaRAM memoriaRAM: memoriasRam)
                {
                    cbProduto1.addItem(memoriaRAM);
                    cbProduto2.addItem(memoriaRAM);
                }
                break;
            case "Monitor":
                for (Monitor monitor: monitores)
                {
                    cbProduto1.addItem(monitor);
                    cbProduto2.addItem(monitor);
                }
                break;
            case "Mouse":
                for (Mouse mouse: mouses)
                {
                    cbProduto1.addItem(mouse);
                    cbProduto2.addItem(mouse);
                }
                break;
            case "Notebook":
                for (Notebook notebook: notebooks)
                {
                    cbProduto1.addItem(notebook);
                    cbProduto2.addItem(notebook);
                }
                break;
            case "Placa de Vídeo":
                for (PlacaDeVideo placaDeVideo: placasDeVideos)
                {
                    cbProduto1.addItem(placaDeVideo);
                    cbProduto2.addItem(placaDeVideo);
                }
                break;
            case "Placa Mãe":
                for (PlacaMae placaMae: placasMae)
                {
                    cbProduto1.addItem(placaMae);
                    cbProduto2.addItem(placaMae);
                }
                break;
            case "Processador":
                for (Processador processador: processadores)
                {
                    cbProduto1.addItem(processador);
                    cbProduto2.addItem(processador);
                }
                break;
            case "Teclado":
                for (Teclado teclado: teclados)
                {
                    cbProduto1.addItem(teclado);
                    cbProduto2.addItem(teclado);
                }
                break;
        }
    }
    
    
    
    private void btCompareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCompareActionPerformed
        melhorCompra1.setVisible(false);
        melhorCompra2.setVisible(false);
        produtos.clear();
        String tipo = cbTipo.getSelectedItem().toString();
        switch (tipo)
        {
            case "Armazenamento":
                produtos.addAll(armazenamentos);
                break;
            case "Computador":
                produtos.addAll(computadores);
                break;
            case "Cooler":
                produtos.addAll(coolers);
                break;
            case "Fonte":
                produtos.addAll(fontes);
                break;
            case "Gabinete":
                produtos.addAll(gabinetes);
                break;
            case "Headset":
                produtos.addAll(headsets);
                break;
            case "Memória RAM":
                produtos.addAll(memoriasRam);
                break;
            case "Monitor":
                produtos.addAll(monitores);
                break;
            case "Mouse":
                produtos.addAll(mouses);
                break;
            case "Notebook":
                produtos.addAll(notebooks);
                break;
            case "Placa de Vídeo":
                produtos.addAll(placasDeVideos);
                break;
            case "Placa Mãe":
                produtos.addAll(placasMae);
                break;
            case "Processador":
                produtos.addAll(processadores);
                break;
            case "Teclado":
                produtos.addAll(teclados);
                break;
        }
        
       
        imgProd1.setIcon(new ImageIcon(Utilitarios.imagemInternet(produtos.get(produtos.indexOf(cbProduto1.getSelectedItem())).getImagem()).getImage().getScaledInstance(imgProd1.getWidth(), imgProd1.getHeight(), Image.SCALE_SMOOTH)));
        imgProd2.setIcon(new ImageIcon(Utilitarios.imagemInternet(produtos.get(produtos.indexOf(cbProduto2.getSelectedItem())).getImagem()).getImage().getScaledInstance(imgProd2.getWidth(), imgProd2.getHeight(), Image.SCALE_SMOOTH)));
        taProd1.setText(produtos.get(produtos.indexOf(cbProduto1.getSelectedItem())).imprimirDados(produtos.get(0).getCategoria()));
        taProd2.setText(produtos.get(produtos.indexOf(cbProduto2.getSelectedItem())).imprimirDados(produtos.get(0).getCategoria()));
        
        int resultadoTeste = compare(taProd1, taProd2);
        if(resultadoTeste == 0){
            jOptionPane1.showMessageDialog(null, "Selecione produtos diferentes para comparar");
        } else {
            if(produtos.get(produtos.indexOf(cbProduto1.getSelectedItem())).getValor() <= produtos.get(produtos.indexOf(cbProduto2.getSelectedItem())).getValor()){
                melhorCompra1.setVisible(true);
            } else {
                melhorCompra2.setVisible(true);
            }
        }
    }//GEN-LAST:event_btCompareActionPerformed

    private void cbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoItemStateChanged
        alterarComboBox();
    }//GEN-LAST:event_cbTipoItemStateChanged

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        produtos.clear();
        produtos.addAll(armazenamentos);
        produtos.addAll(computadores);
        produtos.addAll(coolers);
        produtos.addAll(fontes);
        produtos.addAll(gabinetes);
        produtos.addAll(headsets);
        produtos.addAll(memoriasRam);
        produtos.addAll(monitores);
        produtos.addAll(mouses);
        produtos.addAll(notebooks);
        produtos.addAll(placasDeVideos);
        produtos.addAll(placasMae);
        produtos.addAll(processadores);
        produtos.addAll(teclados);
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btPesquisaActionPerformed

    private void destaque1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destaque1MouseClicked
        Utilitarios.entrarTelaProduto(telaProduto, this);
    }//GEN-LAST:event_destaque1MouseClicked

    private void destaque2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destaque2MouseClicked
        Utilitarios.entrarTelaProduto(telaProduto, this);
    }//GEN-LAST:event_destaque2MouseClicked

    private void destaque3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destaque3MouseClicked
        Utilitarios.entrarTelaProduto(telaProduto, this);
    }//GEN-LAST:event_destaque3MouseClicked

    private void btauxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btauxActionPerformed
        if(this.favoritos.size() == 10){
            jOptionPane1.showMessageDialog(null, "Ops, você só pode adicionar 10 itens aos seus favoritos");
        } else {
            this.adicionaFavorito("Armazenamento");
            this.verifyContentFavorites();
        }
    }//GEN-LAST:event_btauxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btArmazenamento;
    private javax.swing.JButton btCart;
    private javax.swing.JButton btCompare;
    private javax.swing.JButton btComputador;
    private javax.swing.JButton btCooler;
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
    private javax.swing.JButton btaux;
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
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel melhorCompra1;
    private javax.swing.JLabel melhorCompra2;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel popUpMenu;
    private javax.swing.JTextArea taProd1;
    private javax.swing.JTextArea taProd2;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JTextField tfPesquisa;
    // End of variables declaration//GEN-END:variables

    @Override
    public void adicionaFavorito(String value) {
        this.favoritos.put(valueTeste, value + valueTeste);
        valueTeste++;
    }

    @Override
    public void removefavorito(int key) {
        this.favoritos.remove(key);
        this.constructorValue();    
        popUpMenu.revalidate();
        popUpMenu.repaint();
    }
    
    @Override
    public int compare(JTextArea o1, JTextArea o2) {
        return o1.getText().compareTo(o2.getText());
    }    
}