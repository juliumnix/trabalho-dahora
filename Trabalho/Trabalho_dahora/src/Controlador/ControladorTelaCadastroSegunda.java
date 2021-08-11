package Controlador;

//CODIGO
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
import DAO.ArmazenamentoDAO;
import DAO.CoolerDAO;
import DAO.FonteDAO;
import DAO.GabineteDAO;
import DAO.HeadsetDAO;
import DAO.MemoriaRAMDAO;
import DAO.MonitorDAO;
import DAO.MouseDAO;
import DAO.PlacaDeVideoDAO;
import DAO.PlacaMaeDAO;
import DAO.ProcessadorDAO;
import DAO.TecladoDAO;

//TELAS
import Telas.TelaCadastroSegunda;

//JAVA
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorTelaCadastroSegunda {
    private TelaCadastroSegunda telaCadastroSegunda;
    private ControladorGeral controladorGeral;
    private String categoria;

    public ControladorTelaCadastroSegunda(TelaCadastroSegunda telaCadastroSegunda, ControladorGeral controladorGeral) {
        this.telaCadastroSegunda = telaCadastroSegunda;
        this.controladorGeral = controladorGeral;
        configurarTela();
        inicializarAcoes();
        
    }
    
    public void configurarTela()
    {
        Utilitarios.centralizarTela(telaCadastroSegunda);
        telaCadastroSegunda.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
    }
    
    public void inicializarAcoes()
    {
        telaCadastroSegunda.adicionarAcaoBtCadastrar(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try 
        {
            switch (categoria)
            {
                case "Armazenamento":
                    gerarArmazenamento ();
                    controladorGeral.getControladorTelaPrincipal().organizarProdutosGeral();
                    controladorGeral.getControladorTelaPrincipal().alterarComboBox ();
                    break;
                case "Cooler":
                    gerarCooler ();
                    controladorGeral.getControladorTelaPrincipal().alterarComboBox ();
                    controladorGeral.getControladorTelaPrincipal().organizarProdutosGeral();
                    break;
                case "Fonte":
                    gerarFonte ();
                    controladorGeral.getControladorTelaPrincipal().alterarComboBox ();
                    controladorGeral.getControladorTelaPrincipal().organizarProdutosGeral();
                    break;
                case "Gabinete":
                    gerarGabinete();
                    controladorGeral.getControladorTelaPrincipal().alterarComboBox ();
                    controladorGeral.getControladorTelaPrincipal().organizarProdutosGeral();
                    break;
                case "Headset":
                    gerarHeadset ();
                    controladorGeral.getControladorTelaPrincipal().alterarComboBox ();
                    controladorGeral.getControladorTelaPrincipal().organizarProdutosGeral();
                    break;
                case "Memória RAM":
                    gerarMemoriaRam ();
                    controladorGeral.getControladorTelaPrincipal().alterarComboBox ();
                    controladorGeral.getControladorTelaPrincipal().organizarProdutosGeral();
                    break;
                case "Monitor":
                    gerarMonitor ();
                    controladorGeral.getControladorTelaPrincipal().alterarComboBox ();
                    controladorGeral.getControladorTelaPrincipal().organizarProdutosGeral();
                    break;
                case "Mouse":
                    gerarMouse ();
                    controladorGeral.getControladorTelaPrincipal().alterarComboBox ();
                    controladorGeral.getControladorTelaPrincipal().organizarProdutosGeral();
                    break;
                case "Placa de Vídeo":
                    gerarPlacaDeVideo();
                    controladorGeral.getControladorTelaPrincipal().alterarComboBox ();
                    controladorGeral.getControladorTelaPrincipal().organizarProdutosGeral();
                    break;
                case "Placa Mãe":
                    gerarPlacaMae();
                    controladorGeral.getControladorTelaPrincipal().alterarComboBox ();
                    controladorGeral.getControladorTelaPrincipal().organizarProdutosGeral();
                    break;
                case "Processador":
                    gerarProcessador ();
                    controladorGeral.getControladorTelaPrincipal().alterarComboBox ();
                    controladorGeral.getControladorTelaPrincipal().organizarProdutosGeral();
                    break;
                case "Teclado":
                    gerarTeclado();
                    controladorGeral.getControladorTelaPrincipal().alterarComboBox ();
                    controladorGeral.getControladorTelaPrincipal().organizarProdutosGeral();
                    break;
            }
            telaCadastroSegunda.setVisible(false);
            
            
        } catch (Exception error) 
        {
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Preencha todos os campos");
        }
            }
        });
    }
    
    public void setarVisibleFalse ()
    {
        telaCadastroSegunda.getJComboBox1().setVisible(false);
        telaCadastroSegunda.getJComboBox2().setVisible(false);
        telaCadastroSegunda.getJComboBox3().setVisible(false);
        telaCadastroSegunda.getJComboBox4().setVisible(false);
        telaCadastroSegunda.getJTextField1().setVisible(false);
        telaCadastroSegunda.getJTextField2().setVisible(false);
        telaCadastroSegunda.getJTextField3().setVisible(false);
        telaCadastroSegunda.getJLabel1().setVisible(false);
        telaCadastroSegunda.getJLabel2().setVisible(false);
        telaCadastroSegunda.getJLabel3().setVisible(false);
        telaCadastroSegunda.getJLabel4().setVisible(false);
        telaCadastroSegunda.getJLabel5().setVisible(false);
        telaCadastroSegunda.getJLabel6().setVisible(false);
    }
    
    public void armazenamento ()
    {
        setarVisibleFalse();
        telaCadastroSegunda.getJLabel1().setVisible(true);
        telaCadastroSegunda.getJLabel1().setText("Capacidade:");
        telaCadastroSegunda.getJLabel2().setVisible(true);
        telaCadastroSegunda.getJLabel2().setText("Velocidade:");
        telaCadastroSegunda.getJLabel3().setVisible(true);
        telaCadastroSegunda.getJLabel3().setText("Tipo:");
        telaCadastroSegunda.getJTextField1().setVisible(true);
        telaCadastroSegunda.getJTextField2().setVisible(true);
        telaCadastroSegunda.getJComboBox1().setLocation(155, 70);
        telaCadastroSegunda.getJComboBox1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().addItem("HD");
        telaCadastroSegunda.getJComboBox1().addItem("SSD");    
    }
    
    public void cooler ()
    {
        setarVisibleFalse();
        telaCadastroSegunda.getJLabel1().setVisible(true);
        telaCadastroSegunda.getJLabel1().setText("Velocidade da Ventoinha:");
        telaCadastroSegunda.getJLabel2().setVisible(true);
        telaCadastroSegunda.getJLabel2().setText("Tipo:");
        telaCadastroSegunda.getJTextField1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().setLocation(155, 40);
        telaCadastroSegunda.getJComboBox1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().addItem("Cooler comum");
        telaCadastroSegunda.getJComboBox1().addItem("Water Cooler");
    }
    
    public void fonte ()
    {
        setarVisibleFalse();
        telaCadastroSegunda.getJLabel1().setVisible(true);
        telaCadastroSegunda.getJLabel1().setText("Certificação:");
        telaCadastroSegunda.getJLabel2().setVisible(true);
        telaCadastroSegunda.getJLabel2().setText("Tensão (W):");
        telaCadastroSegunda.getJComboBox1().setLocation(155, 10);
        telaCadastroSegunda.getJComboBox1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().addItem("Plus");
        telaCadastroSegunda.getJComboBox1().addItem("Bronze");
        telaCadastroSegunda.getJComboBox1().addItem("Silver");
        telaCadastroSegunda.getJComboBox1().addItem("Gold");
        telaCadastroSegunda.getJComboBox1().addItem("Platinum");
        telaCadastroSegunda.getJComboBox1().addItem("Titanium");
        telaCadastroSegunda.getJComboBox2().setLocation(155, 40);
        telaCadastroSegunda.getJComboBox2().setVisible(true);
        telaCadastroSegunda.getJComboBox2().addItem("550");
        telaCadastroSegunda.getJComboBox2().addItem("650");
        telaCadastroSegunda.getJComboBox2().addItem("750");
        telaCadastroSegunda.getJComboBox2().addItem("850");
        telaCadastroSegunda.getJComboBox2().addItem("950");
        telaCadastroSegunda.getJComboBox2().addItem("1050");
    }
    
    public void gabinete ()
    {
        setarVisibleFalse();
        telaCadastroSegunda.getJLabel1().setVisible(true);
        telaCadastroSegunda.getJLabel1().setText("Peso:");
        telaCadastroSegunda.getJLabel2().setVisible(true);
        telaCadastroSegunda.getJLabel2().setText("Tamanho:");
        telaCadastroSegunda.getJTextField1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().setLocation(155, 40);
        telaCadastroSegunda.getJComboBox1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().addItem("Pequeno");
        telaCadastroSegunda.getJComboBox1().addItem("Médio");
        telaCadastroSegunda.getJComboBox1().addItem("Grande");
    }
    
    public void headset ()
    {
        setarVisibleFalse();
        telaCadastroSegunda.getJLabel1().setVisible(true);
        telaCadastroSegunda.getJLabel1().setText("Possui Bluetooth:");
        telaCadastroSegunda.getJLabel2().setVisible(true);
        telaCadastroSegunda.getJLabel2().setText("Possui Microfone:");
        telaCadastroSegunda.getJLabel3().setVisible(true);
        telaCadastroSegunda.getJLabel3().setText("É Sem Fio:");
        telaCadastroSegunda.getJLabel4().setVisible(true);
        telaCadastroSegunda.getJLabel4().setText("Tipo:");
        telaCadastroSegunda.getJComboBox1().setLocation(155, 10);
        telaCadastroSegunda.getJComboBox1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().addItem("true");
        telaCadastroSegunda.getJComboBox1().addItem("false");
        telaCadastroSegunda.getJComboBox2().setLocation(155, 40);
        telaCadastroSegunda.getJComboBox2().setVisible(true);
        telaCadastroSegunda.getJComboBox2().addItem("true");
        telaCadastroSegunda.getJComboBox2().addItem("false");
        telaCadastroSegunda.getJComboBox3().setLocation(155, 70);
        telaCadastroSegunda.getJComboBox3().setVisible(true);
        telaCadastroSegunda.getJComboBox3().addItem("true");
        telaCadastroSegunda.getJComboBox3().addItem("false");
        telaCadastroSegunda.getJComboBox4().setLocation(155, 100);
        telaCadastroSegunda.getJComboBox4().setVisible(true);
        telaCadastroSegunda.getJComboBox4().addItem("2.0 (estéreo)");
        telaCadastroSegunda.getJComboBox4().addItem("5.1");
        telaCadastroSegunda.getJComboBox4().addItem("7.1 (surround)");
    }
    
    public void memoriaRam ()
    {
        setarVisibleFalse();
        telaCadastroSegunda.getJLabel1().setVisible(true);
        telaCadastroSegunda.getJLabel1().setText("Capacidade:");
        telaCadastroSegunda.getJLabel2().setVisible(true);
        telaCadastroSegunda.getJLabel2().setText("Velocidade:");
        telaCadastroSegunda.getJLabel3().setVisible(true);
        telaCadastroSegunda.getJLabel3().setText("DDR:"); 
        telaCadastroSegunda.getJTextField1().setVisible(true);
        telaCadastroSegunda.getJTextField2().setVisible(true);
        telaCadastroSegunda.getJComboBox1().setLocation(155, 70);
        telaCadastroSegunda.getJComboBox1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().addItem("DDR3");
        telaCadastroSegunda.getJComboBox1().addItem("DDR4");
    }
    
    public void monitor ()
    {
        setarVisibleFalse();
        telaCadastroSegunda.getJLabel1().setVisible(true);
        telaCadastroSegunda.getJLabel1().setText("Tamanho:");
        telaCadastroSegunda.getJLabel2().setVisible(true);
        telaCadastroSegunda.getJLabel2().setText("Aspecto:");
        telaCadastroSegunda.getJLabel3().setVisible(true);
        telaCadastroSegunda.getJLabel3().setText("Frame Rate (hz):"); 
        telaCadastroSegunda.getJLabel4().setVisible(true);
        telaCadastroSegunda.getJLabel4().setText("Resolução:"); 
        telaCadastroSegunda.getJTextField1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().setLocation(155, 40);
        telaCadastroSegunda.getJComboBox1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().addItem("4:3");
        telaCadastroSegunda.getJComboBox1().addItem("16:9");
        telaCadastroSegunda.getJComboBox1().addItem("21:9");       
        telaCadastroSegunda.getJComboBox2().setLocation(155, 70);
        telaCadastroSegunda.getJComboBox2().setVisible(true);
        telaCadastroSegunda.getJComboBox2().addItem("60");
        telaCadastroSegunda.getJComboBox2().addItem("75");
        telaCadastroSegunda.getJComboBox2().addItem("90");
        telaCadastroSegunda.getJComboBox2().addItem("120");
        telaCadastroSegunda.getJComboBox2().addItem("144");
        telaCadastroSegunda.getJComboBox3().setLocation(155, 100);
        telaCadastroSegunda.getJComboBox3().setVisible(true);
        telaCadastroSegunda.getJComboBox3().addItem("HD");
        telaCadastroSegunda.getJComboBox3().addItem("Full HD");
        telaCadastroSegunda.getJComboBox3().addItem("4k");
    }
    
    public void mouse ()
    {
        setarVisibleFalse();
        telaCadastroSegunda.getJLabel1().setVisible(true);
        telaCadastroSegunda.getJLabel1().setText("Apresenta Bluetooth:");
        telaCadastroSegunda.getJLabel2().setVisible(true);
        telaCadastroSegunda.getJLabel2().setText("Apresenta Botões Laterais:");
        telaCadastroSegunda.getJLabel3().setVisible(true);
        telaCadastroSegunda.getJLabel3().setText("É Sem Fio:");
        telaCadastroSegunda.getJComboBox1().setLocation(155, 10);
        telaCadastroSegunda.getJComboBox1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().addItem("true");
        telaCadastroSegunda.getJComboBox1().addItem("false");
        telaCadastroSegunda.getJComboBox2().setLocation(155, 40);
        telaCadastroSegunda.getJComboBox2().setVisible(true);
        telaCadastroSegunda.getJComboBox2().addItem("true");
        telaCadastroSegunda.getJComboBox2().addItem("false");
        telaCadastroSegunda.getJComboBox3().setLocation(155, 70);
        telaCadastroSegunda.getJComboBox3().setVisible(true);
        telaCadastroSegunda.getJComboBox3().addItem("true");
        telaCadastroSegunda.getJComboBox3().addItem("false");
    }
    
    public void placaDeVideo ()
    {
        setarVisibleFalse();
        telaCadastroSegunda.getJLabel1().setVisible(true);
        telaCadastroSegunda.getJLabel1().setText("Memória:");
        telaCadastroSegunda.getJLabel2().setVisible(true);
        telaCadastroSegunda.getJLabel2().setText("Necessita Alimentação:");
        telaCadastroSegunda.getJTextField1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().setLocation(155, 40);
        telaCadastroSegunda.getJComboBox1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().addItem("true");
        telaCadastroSegunda.getJComboBox1().addItem("false");
    }
    
    public void placaMae ()
    {
        setarVisibleFalse();
        telaCadastroSegunda.getJLabel1().setVisible(true);
        telaCadastroSegunda.getJLabel1().setText("Entradas PCI-Express:");
        telaCadastroSegunda.getJLabel2().setVisible(true);
        telaCadastroSegunda.getJLabel2().setText("Entradas RAM:");
        telaCadastroSegunda.getJLabel3().setVisible(true);
        telaCadastroSegunda.getJLabel3().setText("Entradas USB:"); 
        telaCadastroSegunda.getJLabel4().setVisible(true);
        telaCadastroSegunda.getJLabel4().setText("Apresenta Bluetooth:"); 
        telaCadastroSegunda.getJLabel5().setVisible(true);
        telaCadastroSegunda.getJLabel5().setText("Tamanho:"); 
        telaCadastroSegunda.getJLabel6().setVisible(true);
        telaCadastroSegunda.getJLabel6().setText("Apresenta Wi-Fi:");
        telaCadastroSegunda.getJTextField1().setVisible(true);
        telaCadastroSegunda.getJTextField2().setVisible(true);
        telaCadastroSegunda.getJTextField3().setVisible(true);
        telaCadastroSegunda.getJComboBox1().setLocation(155, 100);
        telaCadastroSegunda.getJComboBox1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().addItem("true");
        telaCadastroSegunda.getJComboBox1().addItem("false");
        telaCadastroSegunda.getJComboBox2().setLocation(155, 130);
        telaCadastroSegunda.getJComboBox2().setVisible(true);
        telaCadastroSegunda.getJComboBox2().addItem("AT");
        telaCadastroSegunda.getJComboBox2().addItem("ATX");
        telaCadastroSegunda.getJComboBox2().addItem("BABY AT");
        telaCadastroSegunda.getJComboBox2().addItem("BTX");
        telaCadastroSegunda.getJComboBox2().addItem("ITX");
        telaCadastroSegunda.getJComboBox2().addItem("LPX");
        telaCadastroSegunda.getJComboBox2().addItem("NLX");
        telaCadastroSegunda.getJComboBox3().setLocation(155, 160);
        telaCadastroSegunda.getJComboBox3().setVisible(true);
        telaCadastroSegunda.getJComboBox3().addItem("true");
        telaCadastroSegunda.getJComboBox3().addItem("false");
    }
    
    public void processador ()
    {
        setarVisibleFalse();
        telaCadastroSegunda.getJLabel1().setVisible(true);
        telaCadastroSegunda.getJLabel1().setText("Geração:");
        telaCadastroSegunda.getJLabel2().setVisible(true);
        telaCadastroSegunda.getJLabel2().setText("Núcleos:");
        telaCadastroSegunda.getJLabel3().setVisible(true);
        telaCadastroSegunda.getJLabel3().setText("Velocidade Núcleo:");
        telaCadastroSegunda.getJTextField1().setVisible(true);
        telaCadastroSegunda.getJTextField2().setVisible(true);
        telaCadastroSegunda.getJTextField3().setVisible(true);
    }
    
    public void teclado ()
    {
        setarVisibleFalse();
        telaCadastroSegunda.getJLabel1().setVisible(true);
        telaCadastroSegunda.getJLabel1().setText("Apresenta Bluetooth:");
        telaCadastroSegunda.getJLabel2().setVisible(true);
        telaCadastroSegunda.getJLabel2().setText("Apresenta Numérico:");
        telaCadastroSegunda.getJLabel3().setVisible(true);
        telaCadastroSegunda.getJLabel3().setText("Tipo:");
        telaCadastroSegunda.getJLabel4().setVisible(true);
        telaCadastroSegunda.getJLabel4().setText("Sem Fio:");
        telaCadastroSegunda.getJComboBox1().setLocation(155, 10);
        telaCadastroSegunda.getJComboBox1().setVisible(true);
        telaCadastroSegunda.getJComboBox1().addItem("true");
        telaCadastroSegunda.getJComboBox1().addItem("false");
        telaCadastroSegunda.getJComboBox2().setLocation(155, 40);
        telaCadastroSegunda.getJComboBox2().setVisible(true);
        telaCadastroSegunda.getJComboBox2().addItem("true");
        telaCadastroSegunda.getJComboBox2().addItem("false");
        telaCadastroSegunda.getJComboBox3().setLocation(155, 70);
        telaCadastroSegunda.getJComboBox3().setVisible(true);
        telaCadastroSegunda.getJComboBox3().addItem("Mecânico");
        telaCadastroSegunda.getJComboBox3().addItem("Membrana");
        telaCadastroSegunda.getJComboBox3().addItem("Semi-Mecânico");
        telaCadastroSegunda.getJComboBox4().setLocation(155, 100);
        telaCadastroSegunda.getJComboBox4().setVisible(true);
        telaCadastroSegunda.getJComboBox4().addItem("true");
        telaCadastroSegunda.getJComboBox4().addItem("false");
        
    }
    
    public void componentesCategoria ()
    {
        telaCadastroSegunda.getJComboBox1().removeAllItems();
        telaCadastroSegunda.getJComboBox2().removeAllItems();
        telaCadastroSegunda.getJComboBox3().removeAllItems();
        telaCadastroSegunda.getJComboBox4().removeAllItems();
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
        Armazenamento armazenamento = new Armazenamento (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Integer.parseInt(telaCadastroSegunda.getJTextField1().getText()), Integer.parseInt(telaCadastroSegunda.getJTextField2().getText()), telaCadastroSegunda.getJComboBox1().getSelectedItem().toString());
        if (controladorGeral.getControladorTelaPrincipal().getArmazenamentos().add(armazenamento) == true) 
        {
            try {
                 ArmazenamentoDAO.salvarArmazenamento(armazenamento);
                 telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
           
            
        } else 
        {
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarCooler ()
    {
        Cooler cooler = new Cooler (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Float.parseFloat(telaCadastroSegunda.getJTextField1().getText()), telaCadastroSegunda.getJComboBox1().getSelectedItem().toString());
        if (controladorGeral.getControladorTelaPrincipal().getCooler().add(cooler) == true) 
        {
            try {
            CoolerDAO.salvarArmazenamento(cooler);
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        } else 
        {
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarFonte ()
    {
        Fonte fonte = new Fonte (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), telaCadastroSegunda.getJComboBox1().getSelectedItem().toString(), Integer.parseInt(telaCadastroSegunda.getJComboBox2().getSelectedItem().toString()));
        if (controladorGeral.getControladorTelaPrincipal().getFonte().add(fonte) == true) 
        {
            try {
                FonteDAO.salvarArmazenamento(fonte);
                telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        } else 
        {
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarGabinete ()
    {
        Gabinete gabinete = new Gabinete (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Float.parseFloat(telaCadastroSegunda.getJTextField1().getText()), telaCadastroSegunda.getJComboBox1().getSelectedItem().toString());
        if (controladorGeral.getControladorTelaPrincipal().getGabinete().add(gabinete) == true) 
        {
            try {
                GabineteDAO.salvarArmazenamento(gabinete);
                telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarHeadset ()
    {
        Headset headset = new Headset (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Boolean.parseBoolean(telaCadastroSegunda.getJComboBox1().getSelectedItem().toString()), 
        Boolean.parseBoolean(telaCadastroSegunda.getJComboBox2().getSelectedItem().toString()), Boolean.parseBoolean(telaCadastroSegunda.getJComboBox3().getSelectedItem().toString()), telaCadastroSegunda.getJComboBox4().getSelectedItem().toString());
        if (controladorGeral.getControladorTelaPrincipal().getHeadset().add(headset) == true) 
        {
            try {
            HeadsetDAO.salvarArmazenamento(headset);
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarMemoriaRam ()
    {
        MemoriaRAM memoriaRAM = new MemoriaRAM (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Integer.parseInt(telaCadastroSegunda.getJTextField1().getText()), Float.parseFloat(telaCadastroSegunda.getJTextField2().getText()), telaCadastroSegunda.getJComboBox1().getSelectedItem().toString());
        if (controladorGeral.getControladorTelaPrincipal().getMemoriaRAM().add(memoriaRAM) == true) 
        {
            try {
            MemoriaRAMDAO.salvarArmazenamento(memoriaRAM);
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarMonitor ()
    {
        Monitor monitor = new Monitor (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Float.parseFloat(telaCadastroSegunda.getJTextField1().getText()), telaCadastroSegunda.getJComboBox1().getSelectedItem().toString(),
        Integer.parseInt(telaCadastroSegunda.getJComboBox2().getSelectedItem().toString()), telaCadastroSegunda.getJComboBox3().getSelectedItem().toString());
        if (controladorGeral.getControladorTelaPrincipal().getMonitor().add(monitor) == true) 
        {
            try {
                MonitorDAO.salvarArmazenamento(monitor);
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarMouse ()
    {
        Mouse mouse = new Mouse (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Boolean.parseBoolean(telaCadastroSegunda.getJComboBox1().getSelectedItem().toString()),
        Boolean.parseBoolean(telaCadastroSegunda.getJComboBox2().getSelectedItem().toString()), Boolean.parseBoolean(telaCadastroSegunda.getJComboBox3().getSelectedItem().toString()));
        if (controladorGeral.getControladorTelaPrincipal().getMouse().add(mouse) == true) 
        {
            try {
            MouseDAO.salvarArmazenamento(mouse);
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro realizado com sucesso");
            } catch (Exception e) {
             System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarPlacaDeVideo ()
    {
        PlacaDeVideo placaDeVideo = new PlacaDeVideo (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Integer.parseInt(telaCadastroSegunda.getJTextField1().getText()), Boolean.parseBoolean(telaCadastroSegunda.getJComboBox1().getSelectedItem().toString()));
        if (controladorGeral.getControladorTelaPrincipal().getPlacaDeVideo().add(placaDeVideo) == true) 
        {
            try {
                PlacaDeVideoDAO.salvarArmazenamento(placaDeVideo);
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarPlacaMae ()
    {
        PlacaMae placaMae = new PlacaMae (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Integer.parseInt(telaCadastroSegunda.getJTextField1().getText()), Integer.parseInt(telaCadastroSegunda.getJTextField2().getText()),
        Integer.parseInt(telaCadastroSegunda.getJTextField3().getText()), Boolean.parseBoolean(telaCadastroSegunda.getJComboBox1().getSelectedItem().toString()), telaCadastroSegunda.getJComboBox2().getSelectedItem().toString(),
        Boolean.parseBoolean(telaCadastroSegunda.getJComboBox3().getSelectedItem().toString()));
        if (controladorGeral.getControladorTelaPrincipal().getPlacaMae().add(placaMae) == true) 
        {
            
            try {
                PlacaMaeDAO.salvarArmazenamento(placaMae);
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarProcessador ()
    {
        Processador processador = new Processador (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Integer.parseInt(telaCadastroSegunda.getJTextField1().getText()), Integer.parseInt(telaCadastroSegunda.getJTextField2().getText()),
        Float.parseFloat(telaCadastroSegunda.getJTextField3().getText()));
        if (controladorGeral.getControladorTelaPrincipal().getProcessador().add(processador) == true) 
        {
            try {
                ProcessadorDAO.salvarArmazenamento(processador);
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarTeclado ()
    {
        Teclado teclado = new Teclado (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Boolean.parseBoolean(telaCadastroSegunda.getJComboBox1().getSelectedItem().toString()),
        Boolean.parseBoolean(telaCadastroSegunda.getJComboBox2().getSelectedItem().toString()), telaCadastroSegunda.getJComboBox3().getSelectedItem().toString(), Boolean.parseBoolean(telaCadastroSegunda.getJComboBox4().getSelectedItem().toString()));
        if (controladorGeral.getControladorTelaPrincipal().getTeclado().add(teclado) == true) 
        {
            try {
                TecladoDAO.salvarArmazenamento(teclado);
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.getJOptionPane1().showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void limparCampos()
    {
        telaCadastroSegunda.getJTextField1().setText("");
        telaCadastroSegunda.getJTextField2().setText("");
        telaCadastroSegunda.getJTextField3().setText("");
        telaCadastroSegunda.getJComboBox1().setSelectedIndex(-1);
        telaCadastroSegunda.getJComboBox2().setSelectedIndex(-1);
        telaCadastroSegunda.getJComboBox3().setSelectedIndex(-1);
        telaCadastroSegunda.getJComboBox4().setSelectedIndex(-1);
    }
    
    public void exibir()
    {
        Utilitarios.centralizarTela(telaCadastroSegunda);
        telaCadastroSegunda.exibirTela();
    }
    
    //SETS
    public void SetCategoria (String categoria)
    {
        this.categoria = categoria;
    }
    
    //GETS
    public TelaCadastroSegunda getTelaCadastroSegunda ()
    {
        return this.telaCadastroSegunda;
    }
}
