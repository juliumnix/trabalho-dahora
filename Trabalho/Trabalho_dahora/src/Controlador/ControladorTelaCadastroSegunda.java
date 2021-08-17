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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorTelaCadastroSegunda {
    private TelaCadastroSegunda telaCadastroSegunda;
    private ControladorGeral controladorGeral;
    private String categoria;

    public ControladorTelaCadastroSegunda(TelaCadastroSegunda telaCadastroSegunda, ControladorGeral controladorGeral) {
        this.telaCadastroSegunda = telaCadastroSegunda;
        this.controladorGeral = controladorGeral;
        inicializarAcoes();
        
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
            telaCadastroSegunda.esconderTela();
            
            
        } catch (Exception error) 
        {
            telaCadastroSegunda.mensagemJOptionPane("Preencha todos os campos");
        }
            }
        });
    }
    
    public void componentesCategoria ()
    {
        telaCadastroSegunda.limparComboBox();
        switch (this.categoria)
        {
            case "Armazenamento":
                telaCadastroSegunda.armazenamento ();
                break;
            case "Cooler":
                telaCadastroSegunda.cooler ();
                break;
            case "Fonte":
                telaCadastroSegunda.fonte ();
                break;
            case "Gabinete":
                telaCadastroSegunda.gabinete();
                break;
            case "Headset":
                telaCadastroSegunda.headset ();
                break;
            case "Memória RAM":
                telaCadastroSegunda.memoriaRam ();
                break;
            case "Monitor":
                telaCadastroSegunda.monitor ();
                break;
            case "Mouse":
                telaCadastroSegunda.mouse ();
                break;
            case "Placa de Vídeo":
                telaCadastroSegunda.placaDeVideo();
                break;
            case "Placa Mãe":
                telaCadastroSegunda.placaMae();
                break;
            case "Processador":
                telaCadastroSegunda.processador ();
                break;
            case "Teclado":
                telaCadastroSegunda.teclado();
                break;
        }
    }
    
    public void gerarArmazenamento ()
    {
        Armazenamento armazenamento = new Armazenamento (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Integer.parseInt(telaCadastroSegunda.textoJTextField1()), Integer.parseInt(telaCadastroSegunda.textoJTextField2()), telaCadastroSegunda.textoJComboBox1());
        if (controladorGeral.getControladorTelaPrincipal().getArmazenamentos().add(armazenamento) == true) 
        {
            try {
                 ArmazenamentoDAO.salvarArmazenamento(armazenamento);
                 telaCadastroSegunda.mensagemJOptionPane("Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
           
            
        } else 
        {
            telaCadastroSegunda.mensagemJOptionPane("Cadastro duplicado");
        }
    }
    
    public void gerarCooler ()
    {
        Cooler cooler = new Cooler (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Float.parseFloat(telaCadastroSegunda.textoJTextField1()), telaCadastroSegunda.textoJComboBox1());
        if (controladorGeral.getControladorTelaPrincipal().getCooler().add(cooler) == true) 
        {
            try {
            CoolerDAO.salvarCooler(cooler);
            telaCadastroSegunda.mensagemJOptionPane("Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        } else 
        {
            telaCadastroSegunda.mensagemJOptionPane("Cadastro duplicado");
        }
    }
    
    public void gerarFonte ()
    {
        Fonte fonte = new Fonte (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), telaCadastroSegunda.textoJComboBox1(), Integer.parseInt(telaCadastroSegunda.textoJComboBox2()));
        if (controladorGeral.getControladorTelaPrincipal().getFonte().add(fonte) == true) 
        {
            try {
                FonteDAO.salvarFonte(fonte);
                telaCadastroSegunda.mensagemJOptionPane("Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        } else 
        {
            telaCadastroSegunda.mensagemJOptionPane("Cadastro duplicado");
        }
    }
    
    public void gerarGabinete ()
    {
        Gabinete gabinete = new Gabinete (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Float.parseFloat(telaCadastroSegunda.textoJTextField1()), telaCadastroSegunda.textoJComboBox1());
        if (controladorGeral.getControladorTelaPrincipal().getGabinete().add(gabinete) == true) 
        {
            try {
                GabineteDAO.salvarGabinete(gabinete);
                telaCadastroSegunda.mensagemJOptionPane("Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.mensagemJOptionPane("Cadastro duplicado");
        }
    }
    
    public void gerarHeadset ()
    {
        Headset headset = new Headset (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Boolean.parseBoolean(telaCadastroSegunda.textoJComboBox1()), 
        Boolean.parseBoolean(telaCadastroSegunda.textoJComboBox2()), Boolean.parseBoolean(telaCadastroSegunda.textoJComboBox3()), telaCadastroSegunda.textoJComboBox4());
        if (controladorGeral.getControladorTelaPrincipal().getHeadset().add(headset) == true) 
        {
            try {
            HeadsetDAO.salvarHeadset(headset);
            telaCadastroSegunda.mensagemJOptionPane("Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.mensagemJOptionPane("Cadastro duplicado");
        }
    }
    
    public void gerarMemoriaRam ()
    {
        MemoriaRAM memoriaRAM = new MemoriaRAM (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Integer.parseInt(telaCadastroSegunda.textoJTextField1()), Float.parseFloat(telaCadastroSegunda.textoJTextField2()), telaCadastroSegunda.textoJComboBox1());
        if (controladorGeral.getControladorTelaPrincipal().getMemoriaRAM().add(memoriaRAM) == true) 
        {
            try {
            MemoriaRAMDAO.salvarMemoriaRAM(memoriaRAM);
            telaCadastroSegunda.mensagemJOptionPane("Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.mensagemJOptionPane("Cadastro duplicado");
        }
    }
    
    public void gerarMonitor ()
    {
        Monitor monitor = new Monitor (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Float.parseFloat(telaCadastroSegunda.textoJTextField1()), telaCadastroSegunda.textoJComboBox1(),
        Integer.parseInt(telaCadastroSegunda.textoJComboBox2()), telaCadastroSegunda.textoJComboBox3());
        if (controladorGeral.getControladorTelaPrincipal().getMonitor().add(monitor) == true) 
        {
            try {
                MonitorDAO.salvarMonitor(monitor);
            telaCadastroSegunda.mensagemJOptionPane("Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.mensagemJOptionPane("Cadastro duplicado");
        }
    }
    
    public void gerarMouse ()
    {
        Mouse mouse = new Mouse (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Boolean.parseBoolean(telaCadastroSegunda.textoJComboBox1()),
        Boolean.parseBoolean(telaCadastroSegunda.textoJComboBox2()), Boolean.parseBoolean(telaCadastroSegunda.textoJComboBox3()));
        if (controladorGeral.getControladorTelaPrincipal().getMouse().add(mouse) == true) 
        {
            try {
            MouseDAO.salvarMouse(mouse);
            telaCadastroSegunda.mensagemJOptionPane("Cadastro realizado com sucesso");
            } catch (Exception e) {
             System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.mensagemJOptionPane("Cadastro duplicado");
        }
    }
    
    public void gerarPlacaDeVideo ()
    {
        PlacaDeVideo placaDeVideo = new PlacaDeVideo (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Integer.parseInt(telaCadastroSegunda.textoJTextField1()), Boolean.parseBoolean(telaCadastroSegunda.textoJComboBox1()));
        if (controladorGeral.getControladorTelaPrincipal().getPlacaDeVideo().add(placaDeVideo) == true) 
        {
            try {
                PlacaDeVideoDAO.salvarPlacaDeVideo(placaDeVideo);
            telaCadastroSegunda.mensagemJOptionPane("Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.mensagemJOptionPane("Cadastro duplicado");
        }
    }
    
    public void gerarPlacaMae ()
    {
        PlacaMae placaMae = new PlacaMae (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Integer.parseInt(telaCadastroSegunda.textoJTextField1()), Integer.parseInt(telaCadastroSegunda.textoJTextField2()),
        Integer.parseInt(telaCadastroSegunda.textoJTextField3()), Boolean.parseBoolean(telaCadastroSegunda.textoJComboBox1()), telaCadastroSegunda.textoJComboBox2(),
        Boolean.parseBoolean(telaCadastroSegunda.textoJComboBox3()));
        if (controladorGeral.getControladorTelaPrincipal().getPlacaMae().add(placaMae) == true) 
        {
            
            try {
                PlacaMaeDAO.salvarArmazenamento(placaMae);
            telaCadastroSegunda.mensagemJOptionPane("Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.mensagemJOptionPane("Cadastro duplicado");
        }
    }
    
    public void gerarProcessador ()
    {
        Processador processador = new Processador (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Integer.parseInt(telaCadastroSegunda.textoJTextField1()), Integer.parseInt(telaCadastroSegunda.textoJTextField2()),
        Float.parseFloat(telaCadastroSegunda.textoJTextField3()));
        if (controladorGeral.getControladorTelaPrincipal().getProcessador().add(processador) == true) 
        {
            try {
                ProcessadorDAO.salvarArmazenamento(processador);
            telaCadastroSegunda.mensagemJOptionPane("Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.mensagemJOptionPane("Cadastro duplicado");
        }
    }
    
    public void gerarTeclado ()
    {
        Teclado teclado = new Teclado (controladorGeral.getControladorTelaCadastroPrimeira().getModelo(), controladorGeral.getControladorTelaCadastroPrimeira().getValor(), controladorGeral.getControladorTelaCadastroPrimeira().getDescricao(),
        controladorGeral.getControladorTelaCadastroPrimeira().getMarca(), categoria, controladorGeral.getControladorTelaCadastroPrimeira().getImagem(), Boolean.parseBoolean(telaCadastroSegunda.textoJComboBox1()),
        Boolean.parseBoolean(telaCadastroSegunda.textoJComboBox2()), telaCadastroSegunda.textoJComboBox3(), Boolean.parseBoolean(telaCadastroSegunda.textoJComboBox4()));
        if (controladorGeral.getControladorTelaPrincipal().getTeclado().add(teclado) == true) 
        {
            try {
                TecladoDAO.salvarArmazenamento(teclado);
            telaCadastroSegunda.mensagemJOptionPane("Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            telaCadastroSegunda.mensagemJOptionPane("Cadastro duplicado");
        }
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
