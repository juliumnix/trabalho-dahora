package Telas;

import Codigo.MapManipulator;
import Codigo.Utilitarios;
import Telas.TelaLogin;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.*;

public class TelaCompra extends javax.swing.JFrame implements MapManipulator{
    //telas
    private TelaPrincipal telaPrincipal;
    private TelaCategorias telaCategorias;
    private TelaProduto telaProduto;
    private TelaLogin telaLogin;
    private int index;

    public TelaCompra(TelaPrincipal principal, TelaCategorias telaCategoria, TelaProduto telaProduto, TelaLogin telaLogin) {
        //telas
        this.telaPrincipal = principal;
        this.telaCategorias = telaCategoria;
        this.telaProduto = telaProduto;
        this.telaLogin = telaLogin;
        initComponents();
        configurarTela();
    }
    
    public void configurarTela(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
        Utilitarios.aparecerImagemLocal(icon, "src/imagens/BOOM.png");
        Utilitarios.aparecerImagemLocal(btPesquisa, "src/imagens/IconSearch.png");
        Utilitarios.aparecerImagemLocal(btCart, "src/imagens/IconCart.png");
        icon.requestFocus();
        popUpMenu.setVisible(false); 
    }
    
    public JPanel getPopUpMenu ()
    {
        return this.popUpMenu;
    }
    
        public void verifyContentFavorites () {
        this.constructorValue();
        popUpMenu.revalidate();
        popUpMenu.repaint();
        
    }
   
    public void constructorValue () {
        popUpMenu.removeAll();
        popUpMenu.setLayout(new FlowLayout());
        for (Map.Entry<Integer, String> entry : telaPrincipal.getFavoritos().entrySet()) {
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
    
        public void verifyContentTelaCompra () {
        this.construtorTelaCompra();
        jPanel1.revalidate();
        jPanel1.repaint();
        
    }
    
    public void construtorTelaCompra () {
        jPanel1.removeAll();
        jPanel1.setLayout(new FlowLayout());
        for (Map.Entry<Integer, String> entry : telaPrincipal.getFavoritos().entrySet()) {
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
            jPanel1.add(_lbl);
            jPanel1.add(botaoDelete);
        
        
        }
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
        produtos = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
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

        produtos.setBackground(new java.awt.Color(69, 65, 88));
        produtos.setPreferredSize(new java.awt.Dimension(170, 170));
        produtos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(121, 112, 169));
        jButton1.setForeground(new java.awt.Color(69, 65, 88));
        jButton1.setText("Finalizar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        produtos.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 109, 25));

        jPanel1.setBackground(new java.awt.Color(121, 112, 169));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        produtos.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 480));

        bg.add(produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 52, 520, 540));

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
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getArmazenamentos());
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btArmazenamentoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        Utilitarios.entrarTelaLogin(telaLogin, this);
    }//GEN-LAST:event_btSairActionPerformed

    private void iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseClicked
        Utilitarios.entrarTelaPrincipal(telaPrincipal, this);
    }//GEN-LAST:event_iconMouseClicked

    private void btComputadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComputadorActionPerformed
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getComputador());
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btComputadorActionPerformed

    private void btCoolerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCoolerActionPerformed
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getCooler());
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btCoolerActionPerformed

    private void btFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFonteActionPerformed
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getFonte());
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btFonteActionPerformed

    private void btGabineteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGabineteActionPerformed
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getGabinete());
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btGabineteActionPerformed

    private void btHeadsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHeadsetActionPerformed
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getHeadset());
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btHeadsetActionPerformed

    private void btMemoriaRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMemoriaRAMActionPerformed
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getMemoriaRAM());
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btMemoriaRAMActionPerformed

    private void btMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMonitorActionPerformed
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getMonitor());
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btMonitorActionPerformed

    private void btMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMouseActionPerformed
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getMouse());
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btMouseActionPerformed

    private void btNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNotebookActionPerformed
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getNotebook());
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btNotebookActionPerformed

    private void btPlacaDeVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlacaDeVideoActionPerformed
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getPlacaDeVideo());
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btPlacaDeVideoActionPerformed

    private void btPlacaMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlacaMaeActionPerformed
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getPlacaMae());
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btPlacaMaeActionPerformed

    private void btProcessadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProcessadorActionPerformed
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getProcessador());
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btProcessadorActionPerformed

    private void btTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTecladoActionPerformed
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getTeclado());
        Utilitarios.entrarTelaCategorias(telaCategorias, this);
    }//GEN-LAST:event_btTecladoActionPerformed

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        telaPrincipal.getProdutosEmUso().clear();
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getArmazenamentos());
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getComputador());
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getCooler());
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getFonte());
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getGabinete());
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getHeadset());
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getMemoriaRAM());
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getMonitor());
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getMouse());
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getNotebook());
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getPlacaDeVideo());
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getPlacaMae());
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getProcessador());
        telaPrincipal.getProdutosEmUso().addAll(telaPrincipal.getTeclado());
        Utilitarios.entrarTelaCategorias(telaCategorias, this, tfPesquisa.getText());
    }//GEN-LAST:event_btPesquisaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.verifyContentTelaCompra();
        jPanel1.revalidate();
        jPanel1.repaint();    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        telaPrincipal.getFavoritos().clear();
        jOptionPane1.showMessageDialog(null, "Compra finalizada com sucesso, obrigado");
        this.verifyContentFavorites();
        this.verifyContentTelaCompra();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btArmazenamento;
    private javax.swing.JButton btCart;
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
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel popUpMenu;
    private javax.swing.JPanel produtos;
    private javax.swing.JTextField tfPesquisa;
    // End of variables declaration//GEN-END:variables
    @Override
    public void adicionaFavorito(String value) {
        telaPrincipal.getFavoritos().put(telaPrincipal.getValueTeste(), value);
        telaPrincipal.adicionarValueTeste();
    }

    @Override
    public void removefavorito(int key) {
        telaPrincipal.getFavoritos().remove(key);
        this.constructorValue();    
        popUpMenu.revalidate();
        popUpMenu.repaint();
        this.construtorTelaCompra();
        jPanel1.revalidate();
        jPanel1.repaint();
    }

}