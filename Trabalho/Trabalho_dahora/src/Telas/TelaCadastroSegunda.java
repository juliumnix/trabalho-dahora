package Telas;

import Codigo.Armazenamento;
import Codigo.Cooler;
import Codigo.Fonte;
import Codigo.Gabinete;
import Codigo.Headset;
import Codigo.MemoriaRAM;
import Codigo.Monitor;
import Codigo.Mouse;
import Codigo.PlacaDeVideo;
import Codigo.PlacaMae;
import Codigo.Processador;
import Codigo.Teclado;
import Codigo.Utilitarios;
import java.awt.Toolkit;

public class TelaCadastroSegunda extends javax.swing.JFrame {
    private TelaCadastroPrimeira primeira;
    private TelaPrincipal principal;
    private String categoria;

    public TelaCadastroSegunda(TelaCadastroPrimeira primeira, TelaPrincipal principal) {
        this.primeira = primeira;
        this.principal = principal;
        this.categoria = primeira.getCategoria();
        initComponents();
        componentesCategoria();
        configurarTela();
        
    }
    
    public void configurarTela()
    {
        Utilitarios.centralizarTela(this);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
    }
    
    public void setarVisibleFalse ()
    {
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jComboBox4.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
    }
    
    public void armazenamento ()
    {
        setarVisibleFalse();
        jLabel1.setVisible(true);
        jLabel1.setText("Capacidade:");
        jLabel2.setVisible(true);
        jLabel2.setText("Velocidade:");
        jLabel3.setVisible(true);
        jLabel3.setText("Tipo:");
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jComboBox1.setLocation(155, 70);
        jComboBox1.setVisible(true);
        jComboBox1.addItem("HD");
        jComboBox1.addItem("SSD");    
    }
    
    public void cooler ()
    {
        setarVisibleFalse();
        jLabel1.setVisible(true);
        jLabel1.setText("Velocidade da Ventoinha:");
        jLabel2.setVisible(true);
        jLabel2.setText("Tipo:");
        jTextField1.setVisible(true);
        jComboBox1.setLocation(155, 40);
        jComboBox1.setVisible(true);
        jComboBox1.addItem("Cooler comum");
        jComboBox1.addItem("Water Cooler");
    }
    
    public void fonte ()
    {
        setarVisibleFalse();
        jLabel1.setVisible(true);
        jLabel1.setText("Certificação:");
        jLabel2.setVisible(true);
        jLabel2.setText("Tensão (W):");
        jComboBox1.setLocation(155, 10);
        jComboBox1.setVisible(true);
        jComboBox1.addItem("Plus");
        jComboBox1.addItem("Bronze");
        jComboBox1.addItem("Silver");
        jComboBox1.addItem("Gold");
        jComboBox1.addItem("Platinum");
        jComboBox1.addItem("Titanium");
        jComboBox2.setLocation(155, 40);
        jComboBox2.setVisible(true);
        jComboBox2.addItem("550");
        jComboBox2.addItem("650");
        jComboBox2.addItem("750");
        jComboBox2.addItem("850");
        jComboBox2.addItem("950");
        jComboBox2.addItem("1050");
    }
    
    public void gabinete ()
    {
        setarVisibleFalse();
        jLabel1.setVisible(true);
        jLabel1.setText("Peso:");
        jLabel2.setVisible(true);
        jLabel2.setText("Tamanho:");
        jTextField1.setVisible(true);
        jComboBox1.setLocation(155, 40);
        jComboBox1.setVisible(true);
        jComboBox1.addItem("Pequeno");
        jComboBox1.addItem("Médio");
        jComboBox1.addItem("Grande");
    }
    
    public void headset ()
    {
        setarVisibleFalse();
        jLabel1.setVisible(true);
        jLabel1.setText("Possui Bluetooth:");
        jLabel2.setVisible(true);
        jLabel2.setText("Possui Microfone:");
        jLabel3.setVisible(true);
        jLabel3.setText("É Sem Fio:");
        jLabel4.setVisible(true);
        jLabel4.setText("Tipo:");
        jComboBox1.setLocation(155, 10);
        jComboBox1.setVisible(true);
        jComboBox1.addItem("true");
        jComboBox1.addItem("false");
        jComboBox2.setLocation(155, 40);
        jComboBox2.setVisible(true);
        jComboBox2.addItem("true");
        jComboBox2.addItem("false");
        jComboBox3.setLocation(155, 70);
        jComboBox3.setVisible(true);
        jComboBox3.addItem("true");
        jComboBox3.addItem("false");
        jComboBox4.setLocation(155, 100);
        jComboBox4.setVisible(true);
        jComboBox4.addItem("2.0 (estéreo)");
        jComboBox4.addItem("5.1");
        jComboBox4.addItem("7.1 (surround)");
    }
    
    public void memoriaRam ()
    {
        setarVisibleFalse();
        jLabel1.setVisible(true);
        jLabel1.setText("Capacidade:");
        jLabel2.setVisible(true);
        jLabel2.setText("Velocidade:");
        jLabel3.setVisible(true);
        jLabel3.setText("DDR:"); 
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jComboBox1.setLocation(155, 70);
        jComboBox1.setVisible(true);
        jComboBox1.addItem("DDR3");
        jComboBox1.addItem("DDR4");
    }
    
    public void monitor ()
    {
        setarVisibleFalse();
        jLabel1.setVisible(true);
        jLabel1.setText("Tamanho:");
        jLabel2.setVisible(true);
        jLabel2.setText("Aspecto:");
        jLabel3.setVisible(true);
        jLabel3.setText("Frame Rate (hz):"); 
        jLabel4.setVisible(true);
        jLabel4.setText("Resolução:"); 
        jTextField1.setVisible(true);
        jComboBox1.setLocation(155, 40);
        jComboBox1.setVisible(true);
        jComboBox1.addItem("4:3");
        jComboBox1.addItem("16:9");
        jComboBox1.addItem("21:9");       
        jComboBox2.setLocation(155, 70);
        jComboBox2.setVisible(true);
        jComboBox2.addItem("60");
        jComboBox2.addItem("75");
        jComboBox2.addItem("90");
        jComboBox2.addItem("120");
        jComboBox2.addItem("144");
        jComboBox3.setLocation(155, 100);
        jComboBox3.setVisible(true);
        jComboBox3.addItem("HD");
        jComboBox3.addItem("Full HD");
        jComboBox3.addItem("4k");
    }
    
    public void mouse ()
    {
        setarVisibleFalse();
        jLabel1.setVisible(true);
        jLabel1.setText("Apresenta Bluetooth:");
        jLabel2.setVisible(true);
        jLabel2.setText("Apresenta Botões Laterais:");
        jLabel3.setVisible(true);
        jLabel3.setText("É Sem Fio:");
        jComboBox1.setLocation(155, 10);
        jComboBox1.setVisible(true);
        jComboBox1.addItem("true");
        jComboBox1.addItem("false");
        jComboBox2.setLocation(155, 40);
        jComboBox2.setVisible(true);
        jComboBox2.addItem("true");
        jComboBox2.addItem("false");
        jComboBox3.setLocation(155, 70);
        jComboBox3.setVisible(true);
        jComboBox3.addItem("true");
        jComboBox3.addItem("false");
    }
    
    public void placaDeVideo ()
    {
        setarVisibleFalse();
        jLabel1.setVisible(true);
        jLabel1.setText("Memória:");
        jLabel2.setVisible(true);
        jLabel2.setText("Necessita Alimentação:");
        jTextField1.setVisible(true);
        jComboBox1.setLocation(155, 40);
        jComboBox1.setVisible(true);
        jComboBox1.addItem("true");
        jComboBox1.addItem("false");
    }
    
    public void placaMae ()
    {
        setarVisibleFalse();
        jLabel1.setVisible(true);
        jLabel1.setText("Entradas PCI-Express:");
        jLabel2.setVisible(true);
        jLabel2.setText("Entradas RAM:");
        jLabel3.setVisible(true);
        jLabel3.setText("Entradas USB:"); 
        jLabel4.setVisible(true);
        jLabel4.setText("Apresenta Bluetooth:"); 
        jLabel5.setVisible(true);
        jLabel5.setText("Tamanho:"); 
        jLabel6.setVisible(true);
        jLabel6.setText("Apresenta Wi-Fi:");
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jComboBox1.setLocation(155, 100);
        jComboBox1.setVisible(true);
        jComboBox1.addItem("true");
        jComboBox1.addItem("false");
        jComboBox2.setLocation(155, 130);
        jComboBox2.setVisible(true);
        jComboBox2.addItem("AT");
        jComboBox2.addItem("ATX");
        jComboBox2.addItem("BABY AT");
        jComboBox2.addItem("BTX");
        jComboBox2.addItem("ITX");
        jComboBox2.addItem("LPX");
        jComboBox2.addItem("NLX");
        jComboBox3.setLocation(155, 160);
        jComboBox3.setVisible(true);
        jComboBox3.addItem("true");
        jComboBox3.addItem("false");
    }
    
    public void processador ()
    {
        setarVisibleFalse();
        jLabel1.setVisible(true);
        jLabel1.setText("Geração:");
        jLabel2.setVisible(true);
        jLabel2.setText("Núcleos:");
        jLabel3.setVisible(true);
        jLabel3.setText("Velocidade Núcleo:");
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
    }
    
    public void teclado ()
    {
        setarVisibleFalse();
        jLabel1.setVisible(true);
        jLabel1.setText("Apresenta Bluetooth:");
        jLabel2.setVisible(true);
        jLabel2.setText("Apresenta Numérico:");
        jLabel3.setVisible(true);
        jLabel3.setText("Tipo:");
        jLabel4.setVisible(true);
        jLabel4.setText("Sem Fio:");
        jComboBox1.setLocation(155, 10);
        jComboBox1.setVisible(true);
        jComboBox1.addItem("true");
        jComboBox1.addItem("false");
        jComboBox2.setLocation(155, 40);
        jComboBox2.setVisible(true);
        jComboBox2.addItem("true");
        jComboBox2.addItem("false");
        jComboBox3.setLocation(155, 70);
        jComboBox3.setVisible(true);
        jComboBox3.addItem("Mecânico");
        jComboBox3.addItem("Membrana");
        jComboBox3.addItem("Semi-Mecânico");
        jComboBox4.setLocation(155, 100);
        jComboBox4.setVisible(true);
        jComboBox4.addItem("true");
        jComboBox4.addItem("false");
        
    }
    
    public void componentesCategoria ()
    {
        switch (this.categoria)
        {
            case "Armazenamento":
                armazenamento ();
                break;
            case "Cooler":
                cooler ();
                break;
            case "Fonte":
                fonte ();
                break;
            case "Gabinete":
                gabinete();
                break;
            case "Headset":
                headset ();
                break;
            case "Memória RAM":
                memoriaRam ();
                break;
            case "Monitor":
                monitor ();
                break;
            case "Mouse":
                mouse ();
                break;
            case "Placa de Vídeo":
                placaDeVideo();
                break;
            case "Placa Mãe":
                placaMae();
                break;
            case "Processador":
                processador ();
                break;
            case "Teclado":
                teclado();
                break;
        }
    }
    
    public void gerarArmazenamento ()
    {
        Armazenamento armazenamento = new Armazenamento (primeira.getModelo(), primeira.getValor(), primeira.getDescricao(),
        primeira.getMarca(), categoria, primeira.getImagem(), Integer.parseInt(jTextField1.getText()), Integer.parseInt(jTextField2.getText()), jComboBox1.getSelectedItem().toString());
        if (principal.getArmazenamentos().add(armazenamento) == true) 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarCooler ()
    {
        Cooler cooler = new Cooler (primeira.getModelo(), primeira.getValor(), primeira.getDescricao(),
        primeira.getMarca(), categoria, primeira.getImagem(), Float.parseFloat(jTextField1.getText()), jComboBox1.getSelectedItem().toString());
        if (principal.getCooler().add(cooler) == true) 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarFonte ()
    {
        Fonte fonte = new Fonte (primeira.getModelo(), primeira.getValor(), primeira.getDescricao(),
        primeira.getMarca(), categoria, primeira.getImagem(), jComboBox1.getSelectedItem().toString(), Integer.parseInt(jComboBox2.getSelectedItem().toString()));
        if (principal.getFonte().add(fonte) == true) 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarGabinete ()
    {
        Gabinete gabinete = new Gabinete (primeira.getModelo(), primeira.getValor(), primeira.getDescricao(),
        primeira.getMarca(), categoria, primeira.getImagem(), Float.parseFloat(jTextField1.getText()), jComboBox1.getSelectedItem().toString());
        if (principal.getGabinete().add(gabinete) == true) 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarHeadset ()
    {
        Headset headset = new Headset (primeira.getModelo(), primeira.getValor(), primeira.getDescricao(),
        primeira.getMarca(), categoria, primeira.getImagem(), Boolean.parseBoolean(jComboBox1.getSelectedItem().toString()), 
        Boolean.parseBoolean(jComboBox2.getSelectedItem().toString()), Boolean.parseBoolean(jComboBox3.getSelectedItem().toString()), jComboBox4.getSelectedItem().toString());
        if (principal.getHeadset().add(headset) == true) 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarMemoriaRam ()
    {
        MemoriaRAM memoriaRAM = new MemoriaRAM (primeira.getModelo(), primeira.getValor(), primeira.getDescricao(),
        primeira.getMarca(), categoria, primeira.getImagem(), Integer.parseInt(jTextField1.getText()), Float.parseFloat(jTextField2.getText()), jComboBox1.getSelectedItem().toString());
        if (principal.getMemoriaRAM().add(memoriaRAM) == true) 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarMonitor ()
    {
        Monitor monitor = new Monitor (primeira.getModelo(), primeira.getValor(), primeira.getDescricao(),
        primeira.getMarca(), categoria, primeira.getImagem(), Float.parseFloat(jTextField1.getText()), jComboBox1.getSelectedItem().toString(),
        Integer.parseInt(jComboBox2.getSelectedItem().toString()), jComboBox3.getSelectedItem().toString());
        if (principal.getMonitor().add(monitor) == true) 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarMouse ()
    {
        Mouse mouse = new Mouse (primeira.getModelo(), primeira.getValor(), primeira.getDescricao(),
        primeira.getMarca(), categoria, primeira.getImagem(), Boolean.parseBoolean(jComboBox1.getSelectedItem().toString()),
        Boolean.parseBoolean(jComboBox2.getSelectedItem().toString()), Boolean.parseBoolean(jComboBox3.getSelectedItem().toString()));
        if (principal.getMouse().add(mouse) == true) 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarPlacaDeVideo ()
    {
        PlacaDeVideo placaDeVideo = new PlacaDeVideo (primeira.getModelo(), primeira.getValor(), primeira.getDescricao(),
        primeira.getMarca(), categoria, primeira.getImagem(), Integer.parseInt(jTextField1.getText()), Boolean.parseBoolean(jComboBox1.getSelectedItem().toString()));
        if (principal.getPlacaDeVideo().add(placaDeVideo) == true) 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarPlacaMae ()
    {
        PlacaMae placaMae = new PlacaMae (primeira.getModelo(), primeira.getValor(), primeira.getDescricao(),
        primeira.getMarca(), categoria, primeira.getImagem(), Integer.parseInt(jTextField1.getText()), Integer.parseInt(jTextField2.getText()),
        Integer.parseInt(jTextField3.getText()), Boolean.parseBoolean(jComboBox1.getSelectedItem().toString()), jComboBox2.getSelectedItem().toString(),
        Boolean.parseBoolean(jComboBox3.getSelectedItem().toString()));
        if (principal.getPlacaMae().add(placaMae) == true) 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarProcessador ()
    {
        Processador processador = new Processador (primeira.getModelo(), primeira.getValor(), primeira.getDescricao(),
        primeira.getMarca(), categoria, primeira.getImagem(), Integer.parseInt(jTextField1.getText()), Integer.parseInt(jTextField2.getText()),
        Float.parseFloat(jTextField3.getText()));
        if (principal.getProcessador().add(processador) == true) 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            jOptionPane1.showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarTeclado ()
    {
        Teclado teclado = new Teclado (primeira.getModelo(), primeira.getValor(), primeira.getDescricao(),
        primeira.getMarca(), categoria, primeira.getImagem(), Boolean.parseBoolean(jComboBox1.getSelectedItem().toString()),
        Boolean.parseBoolean(jComboBox2.getSelectedItem().toString()), jComboBox3.getSelectedItem().toString(), Boolean.parseBoolean(jComboBox4.getSelectedItem().toString()));
        if (principal.getTeclado().add(teclado) == true) 
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(34, 33, 44));
        bg.setForeground(new java.awt.Color(69, 65, 88));

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

        jLabel5.setForeground(new java.awt.Color(69, 65, 88));
        jLabel5.setText(":");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, -1, -1));

        jLabel6.setForeground(new java.awt.Color(69, 65, 88));
        jLabel6.setText(":");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(69, 65, 88));
        jComboBox1.setForeground(new java.awt.Color(255, 149, 128));
        jComboBox1.setAlignmentX(0.0F);
        jComboBox1.setAlignmentY(0.0F);
        jComboBox1.setBorder(null);

        jComboBox2.setBackground(new java.awt.Color(69, 65, 88));
        jComboBox2.setForeground(new java.awt.Color(255, 149, 128));
        jComboBox2.setAlignmentX(0.0F);
        jComboBox2.setAlignmentY(0.0F);

        jComboBox3.setBackground(new java.awt.Color(69, 65, 88));
        jComboBox3.setForeground(new java.awt.Color(255, 149, 128));
        jComboBox3.setAlignmentX(0.0F);
        jComboBox3.setAlignmentY(0.0F);

        jComboBox4.setBackground(new java.awt.Color(69, 65, 88));
        jComboBox4.setForeground(new java.awt.Color(255, 149, 128));
        jComboBox4.setAlignmentX(0.0F);
        jComboBox4.setAlignmentY(0.0F);

        jTextField1.setBackground(new java.awt.Color(69, 65, 88));
        jTextField1.setForeground(new java.awt.Color(255, 149, 128));
        jTextField1.setAlignmentX(0.0F);
        jTextField1.setAlignmentY(0.0F);
        jTextField1.setPreferredSize(new java.awt.Dimension(235, 24));

        jTextField2.setBackground(new java.awt.Color(69, 65, 88));
        jTextField2.setForeground(new java.awt.Color(255, 149, 128));
        jTextField2.setAlignmentX(0.0F);
        jTextField2.setAlignmentY(0.0F);
        jTextField2.setPreferredSize(new java.awt.Dimension(235, 24));

        jTextField3.setBackground(new java.awt.Color(69, 65, 88));
        jTextField3.setForeground(new java.awt.Color(255, 149, 128));
        jTextField3.setAlignmentX(0.0F);
        jTextField3.setAlignmentY(0.0F);
        jTextField3.setPreferredSize(new java.awt.Dimension(235, 24));

        Cadastrar.setBackground(new java.awt.Color(121, 112, 169));
        Cadastrar.setForeground(new java.awt.Color(69, 65, 88));
        Cadastrar.setText("Cadastrar");
        Cadastrar.setBorder(null);
        Cadastrar.setPreferredSize(new java.awt.Dimension(80, 25));
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        try 
        {
            switch (this.categoria)
            {
                case "Armazenamento":
                    gerarArmazenamento ();
                    principal.organizarProdutosGeral();
                    principal.alterarComboBox ();
                    break;
                case "Cooler":
                    gerarCooler ();
                    principal.alterarComboBox ();
                    principal.organizarProdutosGeral();
                    break;
                case "Fonte":
                    gerarFonte ();
                    principal.alterarComboBox ();
                    principal.organizarProdutosGeral();
                    break;
                case "Gabinete":
                    gerarGabinete();
                    principal.alterarComboBox ();
                    principal.organizarProdutosGeral();
                    break;
                case "Headset":
                    gerarHeadset ();
                    principal.alterarComboBox ();
                    principal.organizarProdutosGeral();
                    break;
                case "Memória RAM":
                    gerarMemoriaRam ();
                    principal.alterarComboBox ();
                    principal.organizarProdutosGeral();
                    break;
                case "Monitor":
                    gerarMonitor ();
                    principal.alterarComboBox ();
                    principal.organizarProdutosGeral();
                    break;
                case "Mouse":
                    gerarMouse ();
                    principal.alterarComboBox ();
                    principal.organizarProdutosGeral();
                    break;
                case "Placa de Vídeo":
                    gerarPlacaDeVideo();
                    principal.alterarComboBox ();
                    principal.organizarProdutosGeral();
                    break;
                case "Placa Mãe":
                    gerarPlacaMae();
                    principal.alterarComboBox ();
                    principal.organizarProdutosGeral();
                    break;
                case "Processador":
                    gerarProcessador ();
                    principal.alterarComboBox ();
                    principal.organizarProdutosGeral();
                    break;
                case "Teclado":
                    gerarTeclado();
                    principal.alterarComboBox ();
                    principal.organizarProdutosGeral();
                    break;
            }
            
            
        } catch (Exception e) 
        {
            jOptionPane1.showMessageDialog(null, "Preencha todos os campos");
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
