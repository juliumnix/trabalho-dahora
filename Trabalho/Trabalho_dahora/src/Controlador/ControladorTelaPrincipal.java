package Controlador;

//CODIGO
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
import Codigo.Produto;
import Codigo.Teclado;
import Codigo.Utilitarios;
import DAO.ArmazenamentoDAO;
import DAO.ComputadorDAO;
import DAO.CoolerDAO;
import Excecoes.LoginException;
import DAO.CreateTable;
import DAO.FonteDAO;
import DAO.GabineteDAO;
import DAO.HeadsetDAO;
import DAO.MemoriaRAMDAO;
import DAO.MonitorDAO;
import DAO.MouseDAO;
import DAO.NotebookDAO;
import DAO.PlacaDeVideoDAO;
import DAO.PlacaMaeDAO;
import DAO.ProcessadorDAO;
import DAO.TecladoDAO;


//TELAS
import Telas.TelaPrincipal;

//JAVA
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//SWING
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ControladorTelaPrincipal implements Comparator<JTextArea>, MapManipulator {
    private TelaPrincipal telaPrincipal;
    private ControladorGeral controladorGeral;
    
    //VARIAVEIS
    //COLECOES
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
    private List<Produto> produtosEmUso;
    private List<Produto> produtosGeral;
    private List<JPanel> jPanells;
    private List<JLabel> jLabellsImg;
    private List<JLabel> jLabellsText;
    
    //AUXILIARES
    private String categoriaEscolhida;
    private Map<Integer, Produto> carrinho;
    private static int valueID;

    public ControladorTelaPrincipal(TelaPrincipal telaPrincipal, ControladorGeral controladorGeral) throws SQLException {
        this.telaPrincipal = telaPrincipal;
        this.controladorGeral = controladorGeral;
        iniciarColecoes();
        configurarTela();
        inicializarAcoes();
        addJPanel();
        addJLabelImg();
        addJLabelText();   
    }
    
    public void iniciarColecoes () throws SQLException  
    {
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
        this.produtosEmUso = new ArrayList<>();
        this.produtosGeral = new ArrayList<>();
        this.carrinho = new HashMap<>();
        this.jPanells = new ArrayList<>();
        this.jLabellsImg = new ArrayList<>();
        this.jLabellsText = new ArrayList<>();
        popularTabelas();
    }
    
    public void popularTabelas () throws SQLException {
        this.armazenamentos.clear();
        this.computadores.clear();
        this.coolers.clear();
        this.fontes.clear();
        this.gabinetes.clear();
        this.headsets.clear();
        this.memoriasRam.clear();
        this.monitores.clear();
        this.mouses.clear();
        this.notebooks.clear();
        this.placasDeVideos.clear();
        this.placasMae.clear();
        this.processadores.clear();
        this.teclados.clear();
        
        
        
        this.armazenamentos.addAll(ArmazenamentoDAO.getTodosArmazenamentos());
        this.computadores.addAll(ComputadorDAO.getTodosComputadores());
        this.coolers.addAll(CoolerDAO.getTodosCoolers());
        this.fontes.addAll(FonteDAO.getTodosFontes());
        this.gabinetes.addAll(GabineteDAO.getTodosGabinete());
        this.headsets.addAll(HeadsetDAO.getTodosHeadset());
        this.memoriasRam.addAll(MemoriaRAMDAO.getTodosMemoriaRAM());
        this.monitores.addAll(MonitorDAO.getTodosMonitor());
        this.mouses.addAll(MouseDAO.getTodosMouse());
        this.notebooks.addAll(NotebookDAO.getTodosNotebook());
        this.placasDeVideos.addAll(PlacaDeVideoDAO.getTodosPlacaDeVideo());
        this.placasMae.addAll(PlacaMaeDAO.getTodosPlacaMae());
        this.processadores.addAll(ProcessadorDAO.getTodosProcessadores());
        this.teclados.addAll(TecladoDAO.getTodosTeclados());
    }
      
    public void criarTabela ()
    {
        CreateTable.creatingTable();  
    }
    
    
    public void configurarTela(){
        telaPrincipal.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
        Utilitarios.aparecerImagemLocal(telaPrincipal.getIcon(), "src/imagens/BOOM.png");
        Utilitarios.aparecerImagemLocal(telaPrincipal.getBtPesquisa(), "src/imagens/IconSearch.png");
        Utilitarios.aparecerImagemLocal(telaPrincipal.getBtCart(), "src/imagens/IconCart.png");
        telaPrincipal.getIcon().requestFocus();
        telaPrincipal.getTaProd1().setLineWrap(true);
        telaPrincipal.getTaProd2().setLineWrap(true);
        telaPrincipal.getMelhorCompra1().setVisible(false);
        telaPrincipal.getMelhorCompra2().setVisible(false);
        telaPrincipal.getPopUpMenu().setVisible(false);
    }
    
    public void limparComparacao(){
        telaPrincipal.getMelhorCompra1().setVisible(false);
        telaPrincipal.getMelhorCompra2().setVisible(false);
        telaPrincipal.getImgProd1().setVisible(false);
        telaPrincipal.getImgProd2().setVisible(false);
        telaPrincipal.getTaProd1().setText("");
        telaPrincipal.getTaProd2().setText("");
    }
    
    public void visibilidadeBtEstoque ()
    {
        try 
        {
            if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
            {
                telaPrincipal.getBtEstoque().setVisible(true);
            }else
            {
                telaPrincipal.getBtEstoque().setVisible(false);
            }
        } catch (LoginException ex) {
            System.out.println(ex.getMessage());
        } 
    }
    
    public void inicializarAcoes() 
    {
        telaPrincipal.adicionarFocusTfPesquisa(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                Utilitarios.desaparecerTexto("Pesquisa", telaPrincipal.getTfPesquisa());
            }
            
            @Override
            public void focusLost(FocusEvent e)
            {
                Utilitarios.aparecerTexto("Pesquisa", telaPrincipal.getTfPesquisa());
            }
        });
        
        telaPrincipal.adicionarAcaoBtCart(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (telaPrincipal.getPopUpMenu().isVisible())
                {
                    telaPrincipal.getPopUpMenu().setVisible(false);
                }else
                {
                    telaPrincipal.getPopUpMenu().setVisible(true);
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtArmazenamento(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Armazenamento";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Principal");
        
                try {
                    if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
                    {
                        controladorGeral.exibirTelaCadastroPrimeira();
                    } else
                    {
                        produtosEmUso.clear();
                        produtosEmUso.addAll(armazenamentos);
                        controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal);
                    }
                } catch (LoginException ex) {
                     System.out.println(ex.getMessage());
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtComputador(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Computador";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Principal");
        
                try {
                    if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
                    {
                        controladorGeral.exibirTelaCadastroPrimeira();
                    } else
                    {
                        produtosEmUso.clear();
                        produtosEmUso.addAll(computadores);
                        controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal);
                    }
                } catch (LoginException ex) {
                     System.out.println(ex.getMessage());
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtCooler(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Cooler";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Principal");
        
                try {
                    if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
                    {
                        controladorGeral.exibirTelaCadastroPrimeira();
                    } else
                    {
                        produtosEmUso.clear();
                        produtosEmUso.addAll(coolers);
                        controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal);
                    }
                } catch (LoginException ex) {
                     System.out.println(ex.getMessage());
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtFonte(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Fonte";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Principal");
        
                try {
                    if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
                    {
                        controladorGeral.exibirTelaCadastroPrimeira();
                    } else
                    {
                        produtosEmUso.clear();
                        produtosEmUso.addAll(fontes);
                        controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal);
                    }
                } catch (LoginException ex) {
                     System.out.println(ex.getMessage());
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtGabinete(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Gabinete";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Principal");
        
                try {
                    if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
                    {
                        controladorGeral.exibirTelaCadastroPrimeira();
                    } else
                    {
                        produtosEmUso.clear();
                        produtosEmUso.addAll(gabinetes);
                        controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal);
                    }
                } catch (LoginException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtHeadset(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Headset";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Principal");
        
                try {
                    if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
                    {
                        controladorGeral.exibirTelaCadastroPrimeira();
                    } else
                    {
                        produtosEmUso.clear();
                        produtosEmUso.addAll(headsets);
                        controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal);
                    }
                } catch (LoginException ex) {
                     System.out.println(ex.getMessage());
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtMemoriaRAM(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Memória RAM";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Principal");
        
                try {
                    if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
                    {
                        controladorGeral.exibirTelaCadastroPrimeira();
                    } else
                    {
                        produtosEmUso.clear();
                        produtosEmUso.addAll(memoriasRam);
                        controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal);
                    }
                } catch (LoginException ex) {
                     System.out.println(ex.getMessage());
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtMonitor(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Monitor";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Principal");
        
                try {
                    if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
                    {
                        controladorGeral.exibirTelaCadastroPrimeira();
                    } else
                    {
                        produtosEmUso.clear();
                        produtosEmUso.addAll(monitores);
                        controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal);
                    }
                } catch (LoginException ex) {
                     System.out.println(ex.getMessage());
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtMouse(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Mouse";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Principal");
        
                try {
                    if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
                    {
                        controladorGeral.exibirTelaCadastroPrimeira();
                    } else
                    {
                        produtosEmUso.clear();
                        produtosEmUso.addAll(mouses);
                        controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal);
                    }
                } catch (LoginException ex) {
                     System.out.println(ex.getMessage());
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtNotebook(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Notebook";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Principal");
        
                try {
                    if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
                    {
                        controladorGeral.exibirTelaCadastroPrimeira();
                    } else
                    {
                        produtosEmUso.clear();
                        produtosEmUso.addAll(notebooks);
                        controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal);
                    }
                } catch (LoginException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtPlacaDeVideo(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Placa de Vídeo";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Principal");
        
                try {
                    if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
                    {
                        controladorGeral.exibirTelaCadastroPrimeira();
                    } else
                    {
                        produtosEmUso.clear();
                        produtosEmUso.addAll(placasDeVideos);
                        controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal);
                    }
                } catch (LoginException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtPlacaMae(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Placa Mãe";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Principal");
        
                try {
                    if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
                    {
                        controladorGeral.exibirTelaCadastroPrimeira();
                    } else
                    {
                        produtosEmUso.clear();
                        produtosEmUso.addAll(placasMae);
                        controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal);
                    }
                } catch (LoginException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtProcessador(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Processador";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Principal");
        
                try {
                    if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
                    {
                        controladorGeral.exibirTelaCadastroPrimeira();
                    } else
                    {
                        produtosEmUso.clear();
                        produtosEmUso.addAll(processadores);
                        controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal);
                    }
                } catch (LoginException ex) {
                     System.out.println(ex.getMessage());
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtTeclado(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Teclado";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Principal");
        
                try {
                    if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
                    {
                        controladorGeral.exibirTelaCadastroPrimeira();
                    } else
                    {
                        produtosEmUso.clear();
                        produtosEmUso.addAll(teclados);
                        controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal);
                    }
                } catch (LoginException ex) {
                   System.out.println(ex.getMessage());
                }
            }
        });
        
        telaPrincipal.adicionarAcaoBtSair(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                    controladorGeral.exibirTelaLogin(controladorGeral.getControladorTelaLogin().getTelaLogin(), telaPrincipal);
            }
        });
        
        telaPrincipal.adicionarAcaoBtEstoque( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                    controladorGeral.exibirTelaEstoque(controladorGeral.getControladorTelaEstoque().getTelaEstoque(), telaPrincipal);
            }
        });
        
        telaPrincipal.adicionarAcaoBtCompare(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                telaPrincipal.getMelhorCompra1().setVisible(false);
                telaPrincipal.getMelhorCompra2().setVisible(false);
                telaPrincipal.getImgProd1().setVisible(true);
                telaPrincipal.getImgProd2().setVisible(true);
                
                produtosEmUso.clear();
                String tipo = telaPrincipal.getCbTipo().getSelectedItem().toString();
                switch (tipo)
                {
                    case "Armazenamento":
                        produtosEmUso.addAll(armazenamentos);
                        break;
                    case "Computador":
                        produtosEmUso.addAll(computadores);
                        break;
                    case "Cooler":
                        produtosEmUso.addAll(coolers);
                        break;
                    case "Fonte":
                        produtosEmUso.addAll(fontes);
                        break;
                    case "Gabinete":
                        produtosEmUso.addAll(gabinetes);
                        break;
                    case "Headset":
                        produtosEmUso.addAll(headsets);
                        break;
                    case "Memória RAM":
                        produtosEmUso.addAll(memoriasRam);
                        break;
                    case "Monitor":
                        produtosEmUso.addAll(monitores);
                        break;
                    case "Mouse":
                        produtosEmUso.addAll(mouses);
                        break;
                    case "Notebook":
                        produtosEmUso.addAll(notebooks);
                        break;
                    case "Placa de Vídeo":
                        produtosEmUso.addAll(placasDeVideos);
                        break;
                    case "Placa Mãe":
                        produtosEmUso.addAll(placasMae);
                        break;
                    case "Processador":
                        produtosEmUso.addAll(processadores);
                        break;
                    case "Teclado":
                        produtosEmUso.addAll(teclados);
                        break;
                }

                
               
                telaPrincipal.getImgProd1().setIcon(new ImageIcon(Utilitarios.imagemInternet(produtosEmUso.get(produtosEmUso.indexOf(telaPrincipal.getCbProduto1().getSelectedItem())).getImagem()).getImage().getScaledInstance(telaPrincipal.getImgProd1().getWidth(), telaPrincipal.getImgProd1().getHeight(), Image.SCALE_SMOOTH)));
           
                telaPrincipal.getImgProd2().setIcon(new ImageIcon(Utilitarios.imagemInternet(produtosEmUso.get(produtosEmUso.indexOf(telaPrincipal.getCbProduto2().getSelectedItem())).getImagem()).getImage().getScaledInstance(telaPrincipal.getImgProd2().getWidth(), telaPrincipal.getImgProd2().getHeight(), Image.SCALE_SMOOTH)));
                
               
                
                telaPrincipal.getTaProd1().setText(produtosEmUso.get(produtosEmUso.indexOf(telaPrincipal.getCbProduto1().getSelectedItem())).imprimirDados(produtosEmUso.get(0).getCategoria()));
                telaPrincipal.getTaProd2().setText(produtosEmUso.get(produtosEmUso.indexOf(telaPrincipal.getCbProduto2().getSelectedItem())).imprimirDados(produtosEmUso.get(0).getCategoria()));

                int resultadoTeste = compare(telaPrincipal.getTaProd1(), telaPrincipal.getTaProd2());
                if(resultadoTeste == 0)
                {
                    telaPrincipal.getJOptionPane1().showMessageDialog(null, "Selecione produtos diferentes para comparar");
                }else
                {
                    if(produtosEmUso.get(produtosEmUso.indexOf(telaPrincipal.getCbProduto1().getSelectedItem())).getValor() <= produtosEmUso.get(produtosEmUso.indexOf(telaPrincipal.getCbProduto2().getSelectedItem())).getValor())
                    {
                        telaPrincipal.getMelhorCompra1().setVisible(true);
                    }else
                    {
                        telaPrincipal.getMelhorCompra2().setVisible(true);
                    }
                }
            }
        });
        
        telaPrincipal.adicionarItemCbTipo(new ItemListener() 
        {
            @Override
            public void itemStateChanged(ItemEvent e) 
            {
                alterarComboBox();
            }
        });
        
        telaPrincipal.adicionarAcaoBtPesquisa(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal, telaPrincipal.getTfPesquisa().getText());
            }
        });
        
        telaPrincipal.adicionarMouseDestaque1(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaPrincipal.getDestaque1().getName()), "Geral");
                controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaPrincipal);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaPrincipal.adicionarMouseDestaque2(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaPrincipal.getDestaque2().getName()), "Geral");
                controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaPrincipal);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaPrincipal.adicionarMouseDestaque3(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaPrincipal.getDestaque3().getName()), "Geral");
                controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaPrincipal);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaPrincipal.adicionarAcaoBtAux(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.exibirTelaCompra(controladorGeral.getControladorTelaCompra().getTelaCompra(), telaPrincipal);
            }
        });
    }
    
    public void repaintJPanel () {
       
        this.promocoes();
        
    }
    
    
    public void addJPanel ()
    {
        
        jPanells.add(telaPrincipal.getDestaque1());
        jPanells.add(telaPrincipal.getDestaque2());
        jPanells.add(telaPrincipal.getDestaque3());
        
        
    }
    public void addJLabelImg ()
    {
        jLabellsImg.add(telaPrincipal.getImg1());
        jLabellsImg.add(telaPrincipal.getImg2());
        jLabellsImg.add(telaPrincipal.getImg3());
        
        
    }
    public void addJLabelText ()
    {
        jLabellsText.add(telaPrincipal.getText1());
        jLabellsText.add(telaPrincipal.getText2());
        jLabellsText.add(telaPrincipal.getText3());
        
        
    }
    
    public void promocoes ()
    {
        for (Produto produto: produtosGeral)
        {
            produto.setAuxiliar(String.valueOf(produto.getModelo()));
        }
        
        Collections.sort(produtosGeral);
        

        int count = 0;
        
        
        telaPrincipal.getImg1().setVisible(false);
        telaPrincipal.getImg2().setVisible(false);
        telaPrincipal.getImg3().setVisible(false);
        telaPrincipal.getText1().setVisible(false);
        telaPrincipal.getText2().setVisible(false);
        telaPrincipal.getText3().setVisible(false);
        
        for (Produto produto: produtosGeral) 
        {
            System.out.println(count);
            
            
            if (count >= 3)
            {
                break;
            }
            
            if (count == 2) {
                
                Utilitarios.criarPainelProduto(produto.getImagem(), jLabellsImg.get(count), produto.getModelo()+" R$ "+produto.getValor(), jLabellsText.get(count));
                
                    telaPrincipal.getImg3().setVisible(true);
                    telaPrincipal.getText3().setVisible(true);
                
                
            }
            
            if (count == 1) {
                
                 Utilitarios.criarPainelProduto(produto.getImagem(), jLabellsImg.get(count), produto.getModelo()+" R$ "+produto.getValor(), jLabellsText.get(count));
                 
                    telaPrincipal.getImg2().setVisible(true);
                    telaPrincipal.getText2().setVisible(true);
                
                
            }
            
            if (count == 0) {
                
                 Utilitarios.criarPainelProduto(produto.getImagem(), jLabellsImg.get(count), produto.getModelo()+" R$ "+produto.getValor(), jLabellsText.get(count));
                 
                    telaPrincipal.getImg1().setVisible(true);
                    telaPrincipal.getText1().setVisible(true);
                
                
            }
            
            count++;
            
        }
        
    }
    
    public void organizarProdutosGeral ()
    {
        produtosGeral.clear();
        produtosGeral.addAll(armazenamentos);
        produtosGeral.addAll(computadores);
        produtosGeral.addAll(coolers);
        produtosGeral.addAll(fontes);
        produtosGeral.addAll(gabinetes);
        produtosGeral.addAll(headsets);
        produtosGeral.addAll(memoriasRam);
        produtosGeral.addAll(monitores);
        produtosGeral.addAll(mouses);
        produtosGeral.addAll(notebooks);
        produtosGeral.addAll(placasDeVideos);
        produtosGeral.addAll(placasMae);
        produtosGeral.addAll(processadores);
        produtosGeral.addAll(teclados);
        for (Produto produto: produtosGeral)
        {
            produto.setAuxiliar(produto.getModelo());
        }
        Collections.sort(produtosGeral);
    }
    
    public static int adicionarValueTeste()
    {
        return valueID++;
    }
    
    public void verifyContentCarrinho () {
        this.constructorValueCarrinho();
        telaPrincipal.getPopUpMenu().revalidate();
        telaPrincipal.getPopUpMenu().repaint();
        
    }
   
    public void constructorValueCarrinho () {
        telaPrincipal.getPopUpMenu().removeAll();
        telaPrincipal.getPopUpMenu().setLayout(new FlowLayout());
        for (Map.Entry<Integer, Produto> entry : carrinho.entrySet()) {
          JLabel _lbl = new JLabel("<html><div><p style='color: #FFCA80; text-align: center;'>id:"+entry.getKey()+" "+entry.getValue()+"</p></div></html>");
          _lbl.setText(entry.getValue().getModelo()); 
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
              removeCarrinho(value);
              }
              
          });
            botaoDelete.setActionCommand(entry.getKey().toString());
            telaPrincipal.getPopUpMenu().add(_lbl);
            telaPrincipal.getPopUpMenu().add(botaoDelete);
        
        
        }
    }
    
    public void alterarComboBox ()
    {
        String tipo = telaPrincipal.getCbTipo().getSelectedItem().toString();
        telaPrincipal.getCbProduto1().removeAllItems();
        telaPrincipal.getCbProduto2().removeAllItems();
        switch (tipo)
        {
            case "Armazenamento":
                for (Armazenamento armazenamento: armazenamentos)
                {
                    telaPrincipal.getCbProduto1().addItem(armazenamento);
                    telaPrincipal.getCbProduto2().addItem(armazenamento);
                }
                break;
            case "Computador":
                for (Computador computador: computadores)
                {
                    telaPrincipal.getCbProduto1().addItem(computador);
                    telaPrincipal.getCbProduto2().addItem(computador);
                }
                break;
            case "Cooler":
                for (Cooler cooler: coolers)
                {
                    telaPrincipal.getCbProduto1().addItem(cooler);
                    telaPrincipal.getCbProduto2().addItem(cooler);
                }
                break;
            case "Fonte":
                for (Fonte fonte: fontes)
                {
                    telaPrincipal.getCbProduto1().addItem(fonte);
                    telaPrincipal.getCbProduto2().addItem(fonte);
                }
                break;
            case "Gabinete":
                for (Gabinete gabinete: gabinetes)
                {
                    telaPrincipal.getCbProduto1().addItem(gabinete);
                    telaPrincipal.getCbProduto2().addItem(gabinete);
                }
                break;
            case "Headset":
                for (Headset headset: headsets)
                {
                    telaPrincipal.getCbProduto1().addItem(headset);
                    telaPrincipal.getCbProduto2().addItem(headset);
                }
                break;
            case "Memória RAM":
                for (MemoriaRAM memoriaRAM: memoriasRam)
                {
                    telaPrincipal.getCbProduto1().addItem(memoriaRAM);
                    telaPrincipal.getCbProduto2().addItem(memoriaRAM);
                }
                break;
            case "Monitor":
                for (Monitor monitor: monitores)
                {
                    telaPrincipal.getCbProduto1().addItem(monitor);
                    telaPrincipal.getCbProduto2().addItem(monitor);
                }
                break;
            case "Mouse":
                for (Mouse mouse: mouses)
                {
                    telaPrincipal.getCbProduto1().addItem(mouse);
                    telaPrincipal.getCbProduto2().addItem(mouse);
                }
                break;
            case "Notebook":
                for (Notebook notebook: notebooks)
                {
                    telaPrincipal.getCbProduto1().addItem(notebook);
                    telaPrincipal.getCbProduto2().addItem(notebook);
                }
                break;
            case "Placa de Vídeo":
                for (PlacaDeVideo placaDeVideo: placasDeVideos)
                {
                    telaPrincipal.getCbProduto1().addItem(placaDeVideo);
                    telaPrincipal.getCbProduto2().addItem(placaDeVideo);
                }
                break;
            case "Placa Mãe":
                for (PlacaMae placaMae: placasMae)
                {
                    telaPrincipal.getCbProduto1().addItem(placaMae);
                    telaPrincipal.getCbProduto2().addItem(placaMae);
                }
                break;
            case "Processador":
                for (Processador processador: processadores)
                {
                    telaPrincipal.getCbProduto1().addItem(processador);
                    telaPrincipal.getCbProduto2().addItem(processador);
                }
                break;
            case "Teclado":
                for (Teclado teclado: teclados)
                {
                    telaPrincipal.getCbProduto1().addItem(teclado);
                    telaPrincipal.getCbProduto2().addItem(teclado);
                }
                break;
        }
    }
    
    public void exibir()
    {
        Utilitarios.centralizarTela(telaPrincipal);
        telaPrincipal.exibirTela();
    }
    
    //SETS
    public void setCategoriaEscolhida (String categoriaEscolhida)
    {
        this.categoriaEscolhida = categoriaEscolhida;
    }

    //GETS
    public TelaPrincipal getTelaPrincipal ()
    {
        return this.telaPrincipal;
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
    public List<Produto> getProdutosEmUso ()
    {
        return this.produtosEmUso;
    }
    
    public List<Produto> getProdutosGeral ()
    {
        return this.produtosGeral;
    }

    public String getCategoriaEscolhida() {
        return categoriaEscolhida;
    }
    
    public Map<Integer, Produto> getCarrinho() {
        return carrinho;
    }

    public static int getValueTeste() {
        return valueID;
    }
    
    @Override
    public int compare(JTextArea o1, JTextArea o2) {
        return o1.getText().compareTo(o2.getText());
    }
    
    @Override
    public void adicionaCarrinho(Produto produto) {
        this.carrinho.put(valueID, produto);
        controladorGeral.getControladorTelaCompra().getTelaCompra().getTableModel().addRow(produto, controladorGeral.getControladorTelaPrincipal().getValueTeste());
        valueID++;
    }

    @Override
    public void removeCarrinho(int key) {  
        this.carrinho.remove(key);
        controladorGeral.getControladorTelaCompra().getTelaCompra().getTableModel().removeRow(key);
        this.constructorValueCarrinho();
        telaPrincipal.getPopUpMenu().revalidate();
        telaPrincipal.getPopUpMenu().repaint();
    }     
}