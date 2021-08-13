package Controlador;

//CODIGOS
import Codigo.MapManipulator;
import Codigo.Produto;
import Codigo.Utilitarios;

//TELAS
import Telas.TelaCategorias;

//JAVA
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

//SWING
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ControladorTelaCategorias implements MapManipulator {
    private TelaCategorias telaCategorias;
    private ControladorGeral controladorGeral;
    
    //VARIAVEIS
    private boolean pesquisa;
    
    //COLECOES;
    private List<JPanel> jPanells;
    private List<JLabel> jLabellsImg;
    private List<JLabel> jLabellsText;

    public ControladorTelaCategorias(TelaCategorias telaCategorias, ControladorGeral controladorGeral) {
        this.telaCategorias = telaCategorias;
        this.controladorGeral = controladorGeral;
        pesquisa = false;
        iniciarColecoes();
        addJPanel();
        addJLabelImg();
        addJLabelText();
        configurarTela();
        inicializarAcoes();
    }
    
    public void configurarTela(){
        telaCategorias.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
        Utilitarios.aparecerImagemLocal(telaCategorias.getIcon(), "src/imagens/BOOM.png");
        Utilitarios.aparecerImagemLocal(telaCategorias.getBtPesquisa(), "src/imagens/IconSearch.png");
        Utilitarios.aparecerImagemLocal(telaCategorias.getBtCart(), "src/imagens/IconCart.png");
        telaCategorias.getIcon().requestFocus();
        telaCategorias.getPopUpMenu().setVisible(false);
    }
    
    public void iniciarColecoes ()
    {
        this.jPanells = new ArrayList<>();
        this.jLabellsImg = new ArrayList<>();
        this.jLabellsText = new ArrayList<>();
    }
    
    public void inicializarAcoes() 
    {
        telaCategorias.adicionarFocusTfPesquisa(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                Utilitarios.desaparecerTexto("Pesquisa", telaCategorias.getTfPesquisa());
            }
            
            @Override
            public void focusLost(FocusEvent e)
            {
                Utilitarios.aparecerTexto("Pesquisa", telaCategorias.getTfPesquisa());
            }
        });
        
        telaCategorias.adicionarAcaoBtCart(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (telaCategorias.getPopUpMenu().isVisible())
                {
                    telaCategorias.getPopUpMenu().setVisible(false);
                }else
                {
                    telaCategorias.getPopUpMenu().setVisible(true);
                }
            }
        });
        
        telaCategorias.adicionarMouseIcon(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                controladorGeral.exibirTelaPrincipal(controladorGeral.getControladorTelaPrincipal().getTelaPrincipal(), telaCategorias);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaCategorias.adicionarAcaoBtArmazenamento(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getArmazenamentos());
                ObjetosNovaPagina ();
            }
        });
        
        telaCategorias.adicionarAcaoBtComputador(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getComputador());
                ObjetosNovaPagina ();
            }
        });
        
        telaCategorias.adicionarAcaoBtCooler(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getCooler());
                ObjetosNovaPagina ();
            }
        });
        
        telaCategorias.adicionarAcaoBtFonte(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getFonte());
                ObjetosNovaPagina ();
            }
        });
        
        telaCategorias.adicionarAcaoBtGabinete(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getGabinete());
                ObjetosNovaPagina ();
            }
        });
        
        telaCategorias.adicionarAcaoBtHeadset(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getHeadset());
                ObjetosNovaPagina ();
            }
        });
        
        telaCategorias.adicionarAcaoBtMemoriaRAM(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getMemoriaRAM());
                ObjetosNovaPagina ();
            }
        });
        
        telaCategorias.adicionarAcaoBtMonitor(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getMonitor());
                ObjetosNovaPagina ();
            }
        });
        
        telaCategorias.adicionarAcaoBtMouse(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getMouse());
                ObjetosNovaPagina ();
            }
        });
        
        telaCategorias.adicionarAcaoBtNotebook(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getNotebook());
                ObjetosNovaPagina ();
            }
        });
        
        telaCategorias.adicionarAcaoBtPlacaDeVideo(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getPlacaDeVideo());
                ObjetosNovaPagina ();
            }
        });
        
        telaCategorias.adicionarAcaoBtPlacaMae(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getPlacaMae());
                ObjetosNovaPagina ();
            }
        });
        
        telaCategorias.adicionarAcaoBtProcessador(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getProcessador());
                ObjetosNovaPagina ();
            }
        });
        
        telaCategorias.adicionarAcaoBtTeclado(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getTeclado());
                ObjetosNovaPagina ();
            }
        });
        
        telaCategorias.adicionarAcaoBtSair(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                    controladorGeral.exibirTelaLogin(controladorGeral.getControladorTelaLogin().getTelaLogin(), telaCategorias);
            }
        });
        
        telaCategorias.adicionarAcaoBtPesquisa(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                ObjetosNovaPagina (telaCategorias.getTfPesquisa().getText());
            }
        });
        
        telaCategorias.adicionarMouseProduto1(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if (pesquisa == true)
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto1().getName()), "Geral");
                }else
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto1().getName()), "EmUso");
                }
                controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaCategorias);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaCategorias.adicionarMouseProduto2(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if (pesquisa == true)
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto2().getName()), "Geral");
                }else
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto2().getName()), "EmUso");
                }
                controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaCategorias);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaCategorias.adicionarMouseProduto3(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if (pesquisa == true)
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto3().getName()), "Geral");
                }else
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto3().getName()), "EmUso");
                }
                controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaCategorias);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaCategorias.adicionarMouseProduto4(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if (pesquisa == true)
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto4().getName()), "Geral");
                }else
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto4().getName()), "EmUso");
                }
                controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaCategorias);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaCategorias.adicionarMouseProduto5(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if (pesquisa == true)
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto5().getName()), "Geral");
                }else
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto5().getName()), "EmUso");
                }
                controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaCategorias);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaCategorias.adicionarMouseProduto6(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if (pesquisa == true)
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto6().getName()), "Geral");
                }else
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto6().getName()), "EmUso");
                }
                controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaCategorias);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaCategorias.adicionarMouseProduto7(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if (pesquisa == true)
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto7().getName()), "Geral");
                }else
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto7().getName()), "EmUso");
                }
                controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaCategorias);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaCategorias.adicionarMouseProduto8(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if (pesquisa == true)
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto8().getName()), "Geral");
                }else
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto8().getName()), "EmUso");
                }
                controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaCategorias);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaCategorias.adicionarMouseProduto9(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if (pesquisa == true)
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto9().getName()), "Geral");
                }else
                {
                    controladorGeral.getControladorTelaProduto().construirProduto(Integer.parseInt(telaCategorias.getProduto9().getName()), "EmUso");
                }
                controladorGeral.exibirTelaProduto(controladorGeral.getControladorTelaProduto().getTelaProduto(), telaCategorias);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaCategorias.adicionarAcaoBtAux(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.exibirTelaCompra(controladorGeral.getControladorTelaCompra().getTelaCompra(), telaCategorias);
            }
        });
    }
    
    public void addJPanel ()
    {
        jPanells.add(telaCategorias.getProduto1());
        jPanells.add(telaCategorias.getProduto2());
        jPanells.add(telaCategorias.getProduto3());
        jPanells.add(telaCategorias.getProduto4());
        jPanells.add(telaCategorias.getProduto5());
        jPanells.add(telaCategorias.getProduto6());
        jPanells.add(telaCategorias.getProduto7());
        jPanells.add(telaCategorias.getProduto8());
        jPanells.add(telaCategorias.getProduto9());
    }
    public void addJLabelImg ()
    {
        jLabellsImg.add(telaCategorias.getImg1());
        jLabellsImg.add(telaCategorias.getImg2());
        jLabellsImg.add(telaCategorias.getImg3());
        jLabellsImg.add(telaCategorias.getImg4());
        jLabellsImg.add(telaCategorias.getImg5());
        jLabellsImg.add(telaCategorias.getImg6());
        jLabellsImg.add(telaCategorias.getImg7());
        jLabellsImg.add(telaCategorias.getImg8());
        jLabellsImg.add(telaCategorias.getImg9());
        
    }
    public void addJLabelText ()
    {
        jLabellsText.add(telaCategorias.getText1());
        jLabellsText.add(telaCategorias.getText2());
        jLabellsText.add(telaCategorias.getText3());
        jLabellsText.add(telaCategorias.getText4());
        jLabellsText.add(telaCategorias.getText5());
        jLabellsText.add(telaCategorias.getText6());
        jLabellsText.add(telaCategorias.getText7());
        jLabellsText.add(telaCategorias.getText8());
        jLabellsText.add(telaCategorias.getText9());
        
    }
    
    public void setVisiblesFalse ()
    {
        telaCategorias.getProduto1().setVisible(false);
        telaCategorias.getProduto2().setVisible(false);
        telaCategorias.getProduto3().setVisible(false);
        telaCategorias.getProduto4().setVisible(false);
        telaCategorias.getProduto5().setVisible(false);
        telaCategorias.getProduto6().setVisible(false);
        telaCategorias.getProduto7().setVisible(false);
        telaCategorias.getProduto8().setVisible(false);
        telaCategorias.getProduto9().setVisible(false);
        
    }
    
    public void ObjetosNovaPagina ()
    {
        setVisiblesFalse();
        for (Produto produto: controladorGeral.getControladorTelaPrincipal().getProdutosEmUso())
        {
            produto.setAuxiliar(produto.getModelo());
        }
        Collections.sort(controladorGeral.getControladorTelaPrincipal().getProdutosEmUso());
        for (int i = 0; i < controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().size(); i++) 
        {
            jPanells.get(i).setVisible(true);
            Utilitarios.criarPainelProduto(controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(i).getImagem(), jLabellsImg.get(i), controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(i).getModelo()+" R$ "+controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(i).getValor(), jLabellsText.get(i));
        }
        
    }
    
    public void ObjetosNovaPagina (String pesquisa)
    {
        setVisiblesFalse();
        List<Produto> produtosOrdenados = new ArrayList<>();
        for (Produto produto: controladorGeral.getControladorTelaPrincipal().getProdutosGeral())
        {
            if (produto.conteudoPesquisa().contains(pesquisa))
            {
                produtosOrdenados.add(produto);
            }
        }
        for (Produto produto: controladorGeral.getControladorTelaPrincipal().getProdutosGeral())
        {
            produto.setAuxiliar(produto.getModelo());
        }
        Collections.sort(produtosOrdenados);
        for (int i = 0; i < produtosOrdenados.size(); i++) 
        {
            jPanells.get(i).setVisible(true);
            Utilitarios.criarPainelProduto(produtosOrdenados.get(i).getImagem(), jLabellsImg.get(i), produtosOrdenados.get(i).getModelo()+" R$ "+produtosOrdenados.get(i).getValor(), jLabellsText.get(i));
        }
    }
     
    public void verifyContentCarrinho () {
        this.constructorValueCarrinho();
        telaCategorias.getPopUpMenu().revalidate();
        telaCategorias.getPopUpMenu().repaint();
        
    }
   
    public void constructorValueCarrinho () {
        telaCategorias.getPopUpMenu().removeAll();
        telaCategorias.getPopUpMenu().setLayout(new FlowLayout());
        for (Map.Entry<Integer, Produto> entry : controladorGeral.getControladorTelaPrincipal().getCarrinho().entrySet()) {
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
            telaCategorias.getPopUpMenu().add(_lbl);
            telaCategorias.getPopUpMenu().add(botaoDelete);
        
        
        }
    }
    
    public void exibir()
    {
        Utilitarios.centralizarTela(telaCategorias);
        telaCategorias.exibirTela();
    }
    
    //SETS
    public void setPesquisa(boolean pesquisa) 
    {
        this.pesquisa = pesquisa;
    }
    
    //GETS
    public TelaCategorias getTelaCategorias ()
    {
        return this.telaCategorias;
    }
    
    public boolean getPesquisa() 
    {
        return pesquisa;
    }
    
    @Override
    public void adicionaCarrinho(Produto produto) {
        controladorGeral.getControladorTelaPrincipal().getCarrinho().put(controladorGeral.getControladorTelaPrincipal().getValueTeste(), produto);
        controladorGeral.getControladorTelaCompra().getTelaCompra().getTableModel().addRow(produto, controladorGeral.getControladorTelaPrincipal().getValueTeste());
        controladorGeral.getControladorTelaPrincipal().adicionarValueTeste();
    }

    @Override
    public void removeCarrinho(int key) {  
        controladorGeral.getControladorTelaPrincipal().getCarrinho().remove(key);
        controladorGeral.getControladorTelaCompra().getTelaCompra().getTableModel().removeRow(key);
        this.constructorValueCarrinho();    
        telaCategorias.getPopUpMenu().revalidate();
        telaCategorias.getPopUpMenu().repaint();
    } 
}
