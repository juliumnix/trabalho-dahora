/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Codigo.Armazenamento;
import java.awt.*;
import java.net.URL;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Mateus
 */
public class TelaArmazenamentoCompra extends javax.swing.JFrame {
     private TelaPrincipal principal;
     private ArrayList<Armazenamento> armazenamentos;
     private ArrayList<JPanel> jPanells;
     private ArrayList<JLabel> jLabellsImg;
     private ArrayList<JLabel> jLabellsText;
    /**
     * Creates new form TelaArmazenamentoCompra
     */
    public TelaArmazenamentoCompra(TelaPrincipal principal) {
        this.principal = principal;
        this.armazenamentos = new ArrayList<Armazenamento>(principal.getArmazenamentos());
        this.jPanells = new ArrayList<JPanel>();
        this.jLabellsImg = new ArrayList<JLabel>();
        this.jLabellsText = new ArrayList<JLabel>();
        initComponents();
        addJPanel();
        addJLabelImg();
        addJLabelText();
        apareceImagem();
        criarObjetos();
        lIconAC.requestFocus();
        pFavoritesAC.setVisible(false);
        ObjetosNovaPagina ();
        
        
        
    }
    public void criarObjetos ()
    {
        for (Armazenamento armazenamento : armazenamentos) 
        {             
            System.out.println("HashSet"+ armazenamento);         
        }
    }
    
    public void addJPanel ()
    {
        jPanells.add(p1);
        jPanells.add(p2);
        jPanells.add(p3);
        jPanells.add(p4);
        jPanells.add(p5);
        jPanells.add(p6);
        jPanells.add(p7);
        jPanells.add(p8);
        jPanells.add(p9);
    }
    public void addJLabelImg ()
    {
        jLabellsImg.add(p1img);
        jLabellsImg.add(p2img);
        jLabellsImg.add(p3img);
        jLabellsImg.add(p4img);
        jLabellsImg.add(p5img);
        jLabellsImg.add(p6img);
        jLabellsImg.add(p7img);
        jLabellsImg.add(p8img);
        jLabellsImg.add(p9img);
        
    }
    public void addJLabelText ()
    {
        jLabellsText.add(p1text);
        jLabellsText.add(p2text);
        jLabellsText.add(p3text);
        jLabellsText.add(p4text);
        jLabellsText.add(p5text);
        jLabellsText.add(p6text);
        jLabellsText.add(p1text);
        jLabellsText.add(p8text);
        jLabellsText.add(p9text);
        
    }
    
    public void setVisiblesFalse ()
    {
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        
    }
    
    public void ObjetosNovaPagina ()
    {
        setVisiblesFalse();
        for (int i = 0; i < armazenamentos.size(); i++) 
        {
            jPanells.get(i).setVisible(true);
            jLabellsText.get(i).setText(armazenamentos.get(i).toString());
            //ImageIcon imgIco = new ImageIcon(getClass().getResource("/imagens/BOOM.png"));
            //Image image = imgIco.getImage().getScaledInstance(lIconAC.getWidth(), lIconAC.getHeight(), Image.SCALE_SMOOTH);
            //jLabellsImg.get(i).setIcon(new ImageIcon (image));
            try
            {   
            
            ImageIcon image;
            URL url  = new URL("https://s1.static.brasilescola.uol.com.br/be/vestibular/-5824728585f3d.jpg");
            image = new ImageIcon(url);
            Image imagemScale = image.getImage().getScaledInstance(jLabellsImg.get(i).getWidth(), jLabellsImg.get(i).getHeight(), Image.SCALE_SMOOTH);
            jLabellsImg.get(i).setIcon(new ImageIcon(imagemScale));
            }catch(Exception e)
            {
                System.out.println(e);
            }
            
            
        }

    }
    
    public void apareceImagem(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
        
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/imagens/BOOM.png"));
        Image image = imgIco.getImage().getScaledInstance(lIconAC.getWidth(), lIconAC.getHeight(), Image.SCALE_SMOOTH);
        lIconAC.setIcon(new ImageIcon(image));
        
        ImageIcon imageIcon = new ImageIcon (getClass().getResource("/imagens/IconSearch.png"));
        Image imageIconSearch = imageIcon.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        btPesquisaAC.setIcon(new ImageIcon(imageIconSearch));
        
        ImageIcon iconCart = new ImageIcon (getClass().getResource("/imagens/IconCart.png"));
        Image iconCartAUX = iconCart.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        btCartAC.setIcon(new ImageIcon(iconCartAUX));
        
        ImageIcon iconFavorites = new ImageIcon (getClass().getResource("/imagens/IconFavorites.png"));
        Image iconFavoritesAUX = iconFavorites.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        btFavoritesAC.setIcon(new ImageIcon(iconFavoritesAUX));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAC3 = new javax.swing.JPanel();
        MenuAC3 = new javax.swing.JPanel();
        lIconAC = new javax.swing.JLabel();
        btArmazenamentoAC3 = new javax.swing.JButton();
        btComputadorAC3 = new javax.swing.JButton();
        btCoolerAC3 = new javax.swing.JButton();
        btFonteAC3 = new javax.swing.JButton();
        btGabineteAC3 = new javax.swing.JButton();
        btHeadsetAC3 = new javax.swing.JButton();
        btMemoriaRAMAC3 = new javax.swing.JButton();
        btMonitorAC3 = new javax.swing.JButton();
        btMouseAC3 = new javax.swing.JButton();
        btNotebookAC3 = new javax.swing.JButton();
        btPlacaDeVideoAC3 = new javax.swing.JButton();
        btPlacaMaeAC3 = new javax.swing.JButton();
        btProcessadorAC3 = new javax.swing.JButton();
        btTecladoAC3 = new javax.swing.JButton();
        btSairAC3 = new javax.swing.JButton();
        tfPesquisaAC = new javax.swing.JTextField();
        btPesquisaAC = new javax.swing.JButton();
        btCartAC = new javax.swing.JButton();
        btFavoritesAC = new javax.swing.JButton();
        p1 = new javax.swing.JPanel();
        p1img = new javax.swing.JLabel();
        p1text = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        p2img = new javax.swing.JLabel();
        p2text = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        p3img = new javax.swing.JLabel();
        p3text = new javax.swing.JLabel();
        pFavoritesAC = new javax.swing.JPanel();
        p4 = new javax.swing.JPanel();
        p4img = new javax.swing.JLabel();
        p4text = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        p5img = new javax.swing.JLabel();
        p5text = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        p6img = new javax.swing.JLabel();
        p6text = new javax.swing.JLabel();
        p7 = new javax.swing.JPanel();
        p7img = new javax.swing.JLabel();
        p7text = new javax.swing.JLabel();
        p8 = new javax.swing.JPanel();
        p8img = new javax.swing.JLabel();
        p8text = new javax.swing.JLabel();
        p9 = new javax.swing.JPanel();
        p9img = new javax.swing.JLabel();
        p9text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        bgAC3.setBackground(new java.awt.Color(34, 33, 44));
        bgAC3.setMaximumSize(new java.awt.Dimension(800, 600));
        bgAC3.setMinimumSize(new java.awt.Dimension(800, 600));
        bgAC3.setPreferredSize(new java.awt.Dimension(800, 600));

        MenuAC3.setBackground(new java.awt.Color(121, 112, 169));
        MenuAC3.setForeground(new java.awt.Color(121, 112, 169));
        MenuAC3.setPreferredSize(new java.awt.Dimension(121, 720));

        btArmazenamentoAC3.setBackground(new java.awt.Color(69, 65, 88));
        btArmazenamentoAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btArmazenamentoAC3.setForeground(new java.awt.Color(255, 149, 128));
        btArmazenamentoAC3.setText("Armazenamento");
        btArmazenamentoAC3.setBorderPainted(false);
        btArmazenamentoAC3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btComputadorAC3.setBackground(new java.awt.Color(69, 65, 88));
        btComputadorAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btComputadorAC3.setText("Computador");
        btComputadorAC3.setMaximumSize(new java.awt.Dimension(103, 20));
        btComputadorAC3.setMinimumSize(new java.awt.Dimension(103, 20));

        btCoolerAC3.setBackground(new java.awt.Color(69, 65, 88));
        btCoolerAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btCoolerAC3.setText("Cooler");
        btCoolerAC3.setMaximumSize(new java.awt.Dimension(103, 20));
        btCoolerAC3.setMinimumSize(new java.awt.Dimension(103, 20));

        btFonteAC3.setBackground(new java.awt.Color(69, 65, 88));
        btFonteAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btFonteAC3.setText("Fonte");
        btFonteAC3.setMaximumSize(new java.awt.Dimension(103, 20));
        btFonteAC3.setMinimumSize(new java.awt.Dimension(103, 20));

        btGabineteAC3.setBackground(new java.awt.Color(69, 65, 88));
        btGabineteAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btGabineteAC3.setText("Gabinete");
        btGabineteAC3.setMaximumSize(new java.awt.Dimension(103, 20));
        btGabineteAC3.setMinimumSize(new java.awt.Dimension(103, 20));

        btHeadsetAC3.setBackground(new java.awt.Color(69, 65, 88));
        btHeadsetAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btHeadsetAC3.setText("Headset");
        btHeadsetAC3.setMaximumSize(new java.awt.Dimension(103, 20));
        btHeadsetAC3.setMinimumSize(new java.awt.Dimension(103, 20));

        btMemoriaRAMAC3.setBackground(new java.awt.Color(69, 65, 88));
        btMemoriaRAMAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btMemoriaRAMAC3.setText("Memória RAM");
        btMemoriaRAMAC3.setMaximumSize(new java.awt.Dimension(103, 20));
        btMemoriaRAMAC3.setMinimumSize(new java.awt.Dimension(103, 20));

        btMonitorAC3.setBackground(new java.awt.Color(69, 65, 88));
        btMonitorAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btMonitorAC3.setText("Monitor");
        btMonitorAC3.setMaximumSize(new java.awt.Dimension(103, 20));
        btMonitorAC3.setMinimumSize(new java.awt.Dimension(103, 20));

        btMouseAC3.setBackground(new java.awt.Color(69, 65, 88));
        btMouseAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btMouseAC3.setText("Mouse");
        btMouseAC3.setMaximumSize(new java.awt.Dimension(103, 20));
        btMouseAC3.setMinimumSize(new java.awt.Dimension(103, 20));

        btNotebookAC3.setBackground(new java.awt.Color(69, 65, 88));
        btNotebookAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btNotebookAC3.setText("Notebook");
        btNotebookAC3.setMaximumSize(new java.awt.Dimension(103, 20));
        btNotebookAC3.setMinimumSize(new java.awt.Dimension(103, 20));

        btPlacaDeVideoAC3.setBackground(new java.awt.Color(69, 65, 88));
        btPlacaDeVideoAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btPlacaDeVideoAC3.setText("Placa de Vídeo");
        btPlacaDeVideoAC3.setMaximumSize(new java.awt.Dimension(103, 20));
        btPlacaDeVideoAC3.setMinimumSize(new java.awt.Dimension(103, 20));

        btPlacaMaeAC3.setBackground(new java.awt.Color(69, 65, 88));
        btPlacaMaeAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btPlacaMaeAC3.setText("Placa Mãe");
        btPlacaMaeAC3.setMaximumSize(new java.awt.Dimension(103, 20));
        btPlacaMaeAC3.setMinimumSize(new java.awt.Dimension(103, 20));

        btProcessadorAC3.setBackground(new java.awt.Color(69, 65, 88));
        btProcessadorAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btProcessadorAC3.setText("Processador");
        btProcessadorAC3.setMinimumSize(new java.awt.Dimension(103, 20));

        btTecladoAC3.setBackground(new java.awt.Color(69, 65, 88));
        btTecladoAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btTecladoAC3.setText("Teclado");
        btTecladoAC3.setMaximumSize(new java.awt.Dimension(103, 20));
        btTecladoAC3.setMinimumSize(new java.awt.Dimension(103, 20));

        btSairAC3.setBackground(new java.awt.Color(69, 65, 88));
        btSairAC3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btSairAC3.setText("Sair");
        btSairAC3.setMaximumSize(new java.awt.Dimension(103, 20));
        btSairAC3.setMinimumSize(new java.awt.Dimension(103, 20));
        btSairAC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairACActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuAC3Layout = new javax.swing.GroupLayout(MenuAC3);
        MenuAC3.setLayout(MenuAC3Layout);
        MenuAC3Layout.setHorizontalGroup(
            MenuAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuAC3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenuAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuAC3Layout.createSequentialGroup()
                        .addGroup(MenuAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btArmazenamentoAC3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btComputadorAC3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuAC3Layout.createSequentialGroup()
                        .addComponent(lIconAC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuAC3Layout.createSequentialGroup()
                        .addGroup(MenuAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btTecladoAC3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btProcessadorAC3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPlacaMaeAC3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPlacaDeVideoAC3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNotebookAC3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMouseAC3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMonitorAC3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMemoriaRAMAC3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btHeadsetAC3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btGabineteAC3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btFonteAC3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCoolerAC3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSairAC3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        MenuAC3Layout.setVerticalGroup(
            MenuAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuAC3Layout.createSequentialGroup()
                .addComponent(lIconAC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btArmazenamentoAC3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btComputadorAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCoolerAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFonteAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGabineteAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btHeadsetAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMemoriaRAMAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMonitorAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMouseAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNotebookAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPlacaDeVideoAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPlacaMaeAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btProcessadorAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btTecladoAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btSairAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tfPesquisaAC.setBackground(new java.awt.Color(69, 65, 88));
        tfPesquisaAC.setForeground(new java.awt.Color(255, 149, 128));
        tfPesquisaAC.setText("Pesquisa");
        tfPesquisaAC.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfPesquisaAC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPesquisaACFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPesquisaACFocusLost(evt);
            }
        });

        btPesquisaAC.setBackground(new java.awt.Color(121, 112, 169));
        btPesquisaAC.setBorder(null);

        btCartAC.setBackground(new java.awt.Color(121, 112, 169));
        btCartAC.setBorder(null);

        btFavoritesAC.setBackground(new java.awt.Color(121, 112, 169));
        btFavoritesAC.setBorder(null);
        btFavoritesAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFavoritesACActionPerformed(evt);
            }
        });

        p1.setBackground(new java.awt.Color(69, 65, 88));
        p1.setName("p1"); // NOI18N
        p1.setPreferredSize(new java.awt.Dimension(160, 160));

        p1text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1text.setToolTipText("");
        p1text.setName("0"); // NOI18N

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1text, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1img, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p1img, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1text, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p2.setBackground(new java.awt.Color(69, 65, 88));
        p2.setName("p2"); // NOI18N
        p2.setPreferredSize(new java.awt.Dimension(160, 160));

        p2text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2text.setName("1"); // NOI18N

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2img, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2text, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p2img, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2text, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p3.setBackground(new java.awt.Color(69, 65, 88));
        p3.setName("p3"); // NOI18N
        p3.setPreferredSize(new java.awt.Dimension(160, 160));

        p3text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3text.setName("2"); // NOI18N

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p3img, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3text, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p3img, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3text, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pFavoritesAC.setBackground(new java.awt.Color(69, 65, 88));

        javax.swing.GroupLayout pFavoritesACLayout = new javax.swing.GroupLayout(pFavoritesAC);
        pFavoritesAC.setLayout(pFavoritesACLayout);
        pFavoritesACLayout.setHorizontalGroup(
            pFavoritesACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pFavoritesACLayout.setVerticalGroup(
            pFavoritesACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        p4.setBackground(new java.awt.Color(69, 65, 88));
        p4.setName("p4"); // NOI18N
        p4.setPreferredSize(new java.awt.Dimension(160, 160));

        p4text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4text.setToolTipText("");
        p4text.setName("3"); // NOI18N

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4text, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4img, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p4img, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p4text, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p5.setBackground(new java.awt.Color(69, 65, 88));
        p5.setName("p5"); // NOI18N
        p5.setPreferredSize(new java.awt.Dimension(160, 160));

        p5text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5text.setToolTipText("");
        p5text.setName("4"); // NOI18N

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p5text, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5img, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p5img, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p5text, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p6.setBackground(new java.awt.Color(69, 65, 88));
        p6.setName("p6"); // NOI18N
        p6.setPreferredSize(new java.awt.Dimension(160, 160));

        p6text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6text.setToolTipText("");
        p6text.setName("5"); // NOI18N

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p6text, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6img, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p6img, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p6text, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p7.setBackground(new java.awt.Color(69, 65, 88));
        p7.setName("p7"); // NOI18N
        p7.setPreferredSize(new java.awt.Dimension(160, 160));

        p7text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7text.setToolTipText("");
        p7text.setName("6"); // NOI18N

        javax.swing.GroupLayout p7Layout = new javax.swing.GroupLayout(p7);
        p7.setLayout(p7Layout);
        p7Layout.setHorizontalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p7text, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7img, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p7Layout.setVerticalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p7img, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p7text, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p8.setBackground(new java.awt.Color(69, 65, 88));
        p8.setName("p8"); // NOI18N
        p8.setPreferredSize(new java.awt.Dimension(160, 160));

        p8text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p8text.setToolTipText("");
        p8text.setName("7"); // NOI18N

        javax.swing.GroupLayout p8Layout = new javax.swing.GroupLayout(p8);
        p8.setLayout(p8Layout);
        p8Layout.setHorizontalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p8text, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p8img, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p8Layout.setVerticalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p8img, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p8text, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p9.setBackground(new java.awt.Color(69, 65, 88));
        p9.setName("p9"); // NOI18N
        p9.setPreferredSize(new java.awt.Dimension(160, 160));

        p9text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p9text.setToolTipText("");
        p9text.setName("8"); // NOI18N

        javax.swing.GroupLayout p9Layout = new javax.swing.GroupLayout(p9);
        p9.setLayout(p9Layout);
        p9Layout.setHorizontalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p9text, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p9img, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p9Layout.setVerticalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p9img, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p9text, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgAC3Layout = new javax.swing.GroupLayout(bgAC3);
        bgAC3.setLayout(bgAC3Layout);
        bgAC3Layout.setHorizontalGroup(
            bgAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAC3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(MenuAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPesquisaAC, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgAC3Layout.createSequentialGroup()
                        .addGroup(bgAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(bgAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bgAC3Layout.createSequentialGroup()
                                .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgAC3Layout.createSequentialGroup()
                                .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgAC3Layout.createSequentialGroup()
                                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(6, 6, 6)
                .addGroup(bgAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgAC3Layout.createSequentialGroup()
                        .addComponent(btPesquisaAC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btCartAC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btFavoritesAC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pFavoritesAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bgAC3Layout.setVerticalGroup(
            bgAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAC3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(bgAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MenuAC3, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgAC3Layout.createSequentialGroup()
                        .addComponent(tfPesquisaAC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(bgAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgAC3Layout.createSequentialGroup()
                        .addGroup(bgAC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btPesquisaAC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCartAC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btFavoritesAC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pFavoritesAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgAC3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgAC3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("BOOM - Loja de Informática");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFavoritesACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFavoritesACActionPerformed
        if (pFavoritesAC.isVisible())
        {
            pFavoritesAC.setVisible(false);
        }else
        {
            pFavoritesAC.setVisible(true);
        }
    }//GEN-LAST:event_btFavoritesACActionPerformed

    private void tfPesquisaACFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisaACFocusLost
        if (tfPesquisaAC.getText().equals(""))
        {
            tfPesquisaAC.setText("Pesquisa");
        }
    }//GEN-LAST:event_tfPesquisaACFocusLost

    private void tfPesquisaACFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisaACFocusGained
        if (tfPesquisaAC.getText().equals("Pesquisa"))
        {
            tfPesquisaAC.setText("");
        }
    }//GEN-LAST:event_tfPesquisaACFocusGained

    private void btSairACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairACActionPerformed
        LoginView LoginV = new LoginView ();
        LoginV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btSairACActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuAC3;
    private javax.swing.JPanel bgAC3;
    private javax.swing.JButton btArmazenamentoAC3;
    private javax.swing.JButton btCartAC;
    private javax.swing.JButton btComputadorAC3;
    private javax.swing.JButton btCoolerAC3;
    private javax.swing.JButton btFavoritesAC;
    private javax.swing.JButton btFonteAC3;
    private javax.swing.JButton btGabineteAC3;
    private javax.swing.JButton btHeadsetAC3;
    private javax.swing.JButton btMemoriaRAMAC3;
    private javax.swing.JButton btMonitorAC3;
    private javax.swing.JButton btMouseAC3;
    private javax.swing.JButton btNotebookAC3;
    private javax.swing.JButton btPesquisaAC;
    private javax.swing.JButton btPlacaDeVideoAC3;
    private javax.swing.JButton btPlacaMaeAC3;
    private javax.swing.JButton btProcessadorAC3;
    private javax.swing.JButton btSairAC3;
    private javax.swing.JButton btTecladoAC3;
    private javax.swing.JLabel lIconAC;
    private javax.swing.JPanel p1;
    private javax.swing.JLabel p1img;
    private javax.swing.JLabel p1text;
    private javax.swing.JPanel p2;
    private javax.swing.JLabel p2img;
    private javax.swing.JLabel p2text;
    private javax.swing.JPanel p3;
    private javax.swing.JLabel p3img;
    private javax.swing.JLabel p3text;
    private javax.swing.JPanel p4;
    private javax.swing.JLabel p4img;
    private javax.swing.JLabel p4text;
    private javax.swing.JPanel p5;
    private javax.swing.JLabel p5img;
    private javax.swing.JLabel p5text;
    private javax.swing.JPanel p6;
    private javax.swing.JLabel p6img;
    private javax.swing.JLabel p6text;
    private javax.swing.JPanel p7;
    private javax.swing.JLabel p7img;
    private javax.swing.JLabel p7text;
    private javax.swing.JPanel p8;
    private javax.swing.JLabel p8img;
    private javax.swing.JLabel p8text;
    private javax.swing.JPanel p9;
    private javax.swing.JLabel p9img;
    private javax.swing.JLabel p9text;
    private javax.swing.JPanel pFavoritesAC;
    private javax.swing.JTextField tfPesquisaAC;
    // End of variables declaration//GEN-END:variables
}
