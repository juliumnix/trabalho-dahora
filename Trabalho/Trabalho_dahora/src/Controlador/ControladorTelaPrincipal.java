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
    
    //AUXILIARES
    private String categoriaEscolhida;
    private Map<Integer, Produto> carrinho;
    private static int valueID;

    public ControladorTelaPrincipal(TelaPrincipal telaPrincipal, ControladorGeral controladorGeral) throws SQLException {
        this.telaPrincipal = telaPrincipal;
        this.controladorGeral = controladorGeral;
        iniciarColecoes();
        inicializarAcoes(); 
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
    
    public void visibilidadeBtEstoque ()
    {
        try 
        {
            if (controladorGeral.getControladorTelaLogin().verificaAdm() == true)
            {
                telaPrincipal.mudarVisibilidadeBtEstoque(true);
            }else
            {
                telaPrincipal.mudarVisibilidadeBtEstoque(false);
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
                telaPrincipal.desaparecerTextoTfPesquisa();
            }
            
            @Override
            public void focusLost(FocusEvent e)
            {
                telaPrincipal.aparecerTextoTfPesquisa();
            }
        });
        
        telaPrincipal.adicionarAcaoBtCart(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (telaPrincipal.getPopUpMenu().isVisible())
                {
                    telaPrincipal.mudarVisibilidadePopUpMenu(false);
                }else
                {
                    telaPrincipal.mudarVisibilidadePopUpMenu(true);
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
                categoriaEscolhida = "Mem??ria RAM";
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
                categoriaEscolhida = "Placa de V??deo";
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
                categoriaEscolhida = "Placa M??e";
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
                telaPrincipal.limparPainelCompare();
                produtosEmUso.clear();
                String tipo = telaPrincipal.retornarTextoCbTipo();
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
                    case "Mem??ria RAM":
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
                    case "Placa de V??deo":
                        produtosEmUso.addAll(placasDeVideos);
                        break;
                    case "Placa M??e":
                        produtosEmUso.addAll(placasMae);
                        break;
                    case "Processador":
                        produtosEmUso.addAll(processadores);
                        break;
                    case "Teclado":
                        produtosEmUso.addAll(teclados);
                        break;
                }

                
               
                telaPrincipal.iconImgProd1(new ImageIcon(Utilitarios.imagemInternet(produtosEmUso.get(produtosEmUso.indexOf(telaPrincipal.getCbProduto1().getSelectedItem())).getImagem()).getImage().getScaledInstance(telaPrincipal.getImgProd1().getWidth(), telaPrincipal.getImgProd1().getHeight(), Image.SCALE_SMOOTH)));       
                telaPrincipal.iconImgProd2(new ImageIcon(Utilitarios.imagemInternet(produtosEmUso.get(produtosEmUso.indexOf(telaPrincipal.getCbProduto2().getSelectedItem())).getImagem()).getImage().getScaledInstance(telaPrincipal.getImgProd2().getWidth(), telaPrincipal.getImgProd2().getHeight(), Image.SCALE_SMOOTH)));
                
                telaPrincipal.setarTextoTaProd1(produtosEmUso.get(produtosEmUso.indexOf(telaPrincipal.getCbProduto1().getSelectedItem())).imprimirDados(produtosEmUso.get(0).getCategoria()));
                telaPrincipal.setarTextoTaProd2(produtosEmUso.get(produtosEmUso.indexOf(telaPrincipal.getCbProduto2().getSelectedItem())).imprimirDados(produtosEmUso.get(0).getCategoria()));

                int resultadoTeste = compare(telaPrincipal.getTaProd1(), telaPrincipal.getTaProd2());
                if(resultadoTeste == 0)
                {
                    telaPrincipal.mensagemJOptionPane("Selecione produtos diferentes para comparar");
                }else
                {
                    if(produtosEmUso.get(produtosEmUso.indexOf(telaPrincipal.getCbProduto1().getSelectedItem())).getValor() <= produtosEmUso.get(produtosEmUso.indexOf(telaPrincipal.getCbProduto2().getSelectedItem())).getValor())
                    {
                        telaPrincipal.mudarVisibilidadeMelhorCompra1(true);
                    }else
                    {
                        telaPrincipal.mudarVisibilidadeMelhorCompra2(true);
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
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaPrincipal, telaPrincipal.retornarTextoTfPesquisa());
            }
        });
        
        telaPrincipal.adicionarMouseDestaque1(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if (produtosGeral.size() >= 1)
                {
                    telaPrincipal.destaque1SetEnabled(true);
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaPrincipal.retornarNomeDestaque1()), "Geral");
                    controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaPrincipal);
                }else
                {
                    telaPrincipal.destaque1SetEnabled(false);
                }
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
                if (produtosGeral.size() >= 2)
                {
                    telaPrincipal.destaque2SetEnabled(true);
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaPrincipal.retornarNomeDestaque2()), "Geral");
                    controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaPrincipal);
                }else
                {
                    telaPrincipal.destaque2SetEnabled(false);
                }
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
                if (produtosGeral.size() >= 3)
                {
                    telaPrincipal.destaque3SetEnabled(true);
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaPrincipal.retornarNomeDestaque3()), "Geral");
                    controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaPrincipal);
                }else
                {
                    telaPrincipal.destaque3SetEnabled(false);
                }
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

    public void promocoes ()
    {
        for (Produto produto: produtosGeral)
        {
            produto.setAuxiliar(String.valueOf(produto.getModelo()));
        }
        
        Collections.sort(produtosGeral);
        

        int count = 0;
        
        
        telaPrincipal.mudarVisibilidadeImg1(false);
        telaPrincipal.mudarVisibilidadeImg2(false);
        telaPrincipal.mudarVisibilidadeImg3(false);
        telaPrincipal.mudarVisibilidadeText1(false);
        telaPrincipal.mudarVisibilidadeText2(false);
        telaPrincipal.mudarVisibilidadeText3(false);
        
        for (Produto produto: produtosGeral) 
        {
            System.out.println(count);
            
            
            if (count >= 3)
            {
                break;
            }
            
            if (count == 2) {
                
                Utilitarios.criarPainelProduto(produto.getImagem(), telaPrincipal.getJLabellsImg().get(count), produto.getModelo()+" R$ "+produto.getValor(), telaPrincipal.getJLabellsText().get(count));    
                    telaPrincipal.mudarVisibilidadeImg3(true);
                    telaPrincipal.mudarVisibilidadeText3(true);
            }
            
            if (count == 1) {
                
                 Utilitarios.criarPainelProduto(produto.getImagem(), telaPrincipal.getJLabellsImg().get(count), produto.getModelo()+" R$ "+produto.getValor(), telaPrincipal.getJLabellsText().get(count));                
                    telaPrincipal.mudarVisibilidadeImg2(true);
                    telaPrincipal.mudarVisibilidadeText2(true);
            }
            
            if (count == 0) {
                 Utilitarios.criarPainelProduto(produto.getImagem(), telaPrincipal.getJLabellsImg().get(count), produto.getModelo()+" R$ "+produto.getValor(), telaPrincipal.getJLabellsText().get(count));                
                    telaPrincipal.mudarVisibilidadeImg1(true);
                    telaPrincipal.mudarVisibilidadeText1(true);
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
        String tipo = telaPrincipal.retornarTextoCbTipo();
        telaPrincipal.limparComboBox();
        switch (tipo)
        {
            case "Armazenamento":
                for (Armazenamento armazenamento: armazenamentos)
                {
                    telaPrincipal.adicionarItemCb1(armazenamento);
                    telaPrincipal.adicionarItemCb2(armazenamento);
                }
                break;
            case "Computador":
                for (Computador computador: computadores)
                {
                    telaPrincipal.adicionarItemCb1(computador);
                    telaPrincipal.adicionarItemCb2(computador);
                }
                break;
            case "Cooler":
                for (Cooler cooler: coolers)
                {
                    telaPrincipal.adicionarItemCb1(cooler);
                    telaPrincipal.adicionarItemCb2(cooler);
                }
                break;
            case "Fonte":
                for (Fonte fonte: fontes)
                {
                    telaPrincipal.adicionarItemCb1(fonte);
                    telaPrincipal.adicionarItemCb2(fonte);
                }
                break;
            case "Gabinete":
                for (Gabinete gabinete: gabinetes)
                {
                    telaPrincipal.adicionarItemCb1(gabinete);
                    telaPrincipal.adicionarItemCb2(gabinete);
                }
                break;
            case "Headset":
                for (Headset headset: headsets)
                {
                    telaPrincipal.adicionarItemCb1(headset);
                    telaPrincipal.adicionarItemCb2(headset);
                }
                break;
            case "Mem??ria RAM":
                for (MemoriaRAM memoriaRAM: memoriasRam)
                {
                    telaPrincipal.adicionarItemCb1(memoriaRAM);
                    telaPrincipal.adicionarItemCb2(memoriaRAM);
                }
                break;
            case "Monitor":
                for (Monitor monitor: monitores)
                {
                    telaPrincipal.adicionarItemCb1(monitor);
                    telaPrincipal.adicionarItemCb2(monitor);
                }
                break;
            case "Mouse":
                for (Mouse mouse: mouses)
                {
                    telaPrincipal.adicionarItemCb1(mouse);
                    telaPrincipal.adicionarItemCb2(mouse);
                }
                break;
            case "Notebook":
                for (Notebook notebook: notebooks)
                {
                    telaPrincipal.adicionarItemCb1(notebook);
                    telaPrincipal.adicionarItemCb2(notebook);
                }
                break;
            case "Placa de V??deo":
                for (PlacaDeVideo placaDeVideo: placasDeVideos)
                {
                    telaPrincipal.adicionarItemCb1(placaDeVideo);
                    telaPrincipal.adicionarItemCb2(placaDeVideo);
                }
                break;
            case "Placa M??e":
                for (PlacaMae placaMae: placasMae)
                {
                    telaPrincipal.adicionarItemCb1(placaMae);
                    telaPrincipal.adicionarItemCb2(placaMae);
                }
                break;
            case "Processador":
                for (Processador processador: processadores)
                {
                    telaPrincipal.adicionarItemCb1(processador);
                    telaPrincipal.adicionarItemCb2(processador);
                }
                break;
            case "Teclado":
                for (Teclado teclado: teclados)
                {
                    telaPrincipal.adicionarItemCb1(teclado);
                    telaPrincipal.adicionarItemCb2(teclado);
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