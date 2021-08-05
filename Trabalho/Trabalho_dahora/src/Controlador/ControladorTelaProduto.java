package Controlador;

//CODIGO
import Codigo.MapManipulator;
import Codigo.Utilitarios;

//TELAS
import Telas.TelaProduto;

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
import java.util.Map;

//SWING
import javax.swing.JButton;
import javax.swing.JLabel;

public class ControladorTelaProduto implements MapManipulator {
    private TelaProduto telaProduto;
    private ControladorGeral controladorGeral;
    private int index;

    public ControladorTelaProduto(TelaProduto telaProduto, ControladorGeral controladorGeral) {
        this.telaProduto = telaProduto;
        this.controladorGeral = controladorGeral;
        configurarTela();
        inicializarAcoes();
    }
    
    public void configurarTela(){
        telaProduto.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
        Utilitarios.aparecerImagemLocal(telaProduto.getIcon(), "src/imagens/BOOM.png");
        Utilitarios.aparecerImagemLocal(telaProduto.getBtPesquisa(), "src/imagens/IconSearch.png");
        Utilitarios.aparecerImagemLocal(telaProduto.getBtCart(), "src/imagens/IconCart.png");
        Utilitarios.aparecerImagemLocal(telaProduto.getBtAddCart(), "src/imagens/IconCart.png");        
        telaProduto.getTaDescricao().setLineWrap(true);
        telaProduto.getIcon().requestFocus();
        telaProduto.getPopUpMenu().setVisible(false); 
    }
    
    public void inicializarAcoes() 
    {
        telaProduto.adicionarFocusTfPesquisa(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                Utilitarios.desaparecerTexto("Pesquisa", telaProduto.getTfPesquisa());
            }
            
            @Override
            public void focusLost(FocusEvent e)
            {
                Utilitarios.aparecerTexto("Pesquisa", telaProduto.getTfPesquisa());
            }
        });
        
        telaProduto.adicionarAcaoBtCart(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (telaProduto.getPopUpMenu().isVisible())
                {
                    telaProduto.getPopUpMenu().setVisible(false);
                }else
                {
                    telaProduto.getPopUpMenu().setVisible(true);
                }
            }
        });
        
        telaProduto.adicionarAcaoBtArmazenamento(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getArmazenamentos());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtComputador(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getComputador());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtCooler(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getCooler());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtFonte(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getFonte());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtGabinete(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getGabinete());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtHeadset(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getHeadset());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtMemoriaRAM(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getMemoriaRAM());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtMonitor(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getMonitor());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtMouse(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getMouse());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtNotebook(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getNotebook());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtPlacaDeVideo(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getPlacaDeVideo());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtPlacaMae(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getPlacaMae());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtProcessador(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getProcessador());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtTeclado(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getTeclado());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtSair(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                    controladorGeral.exibirTelaLogin(controladorGeral.getControladorTelaLogin().getTelaLogin(), telaProduto);
            }
        });
        
        telaProduto.adicionarMouseIcon(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                controladorGeral.exibirTelaPrincipal(controladorGeral.getControladorTelaPrincipal().getTelaPrincipal(), telaProduto);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaProduto.adicionarAcaoBtPesquisa(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto, telaProduto.getTfPesquisa().getText());
            }
        });
        
        telaProduto.adicionarAcaoBtAux(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.exibirTelaCompra(controladorGeral.getControladorTelaCompra().getTelaCompra(), telaProduto);
            }
        });
        
        telaProduto.adicionarAcaoBtAddCart(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(controladorGeral.getControladorTelaPrincipal().getFavoritos().size() == 10)
                {
                telaProduto.getJOptionPane1().showMessageDialog(null, "Ops, você só pode adicionar 10 itens aos seus favoritos");
                } else {
                    adicionaFavorito(controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(index).getModelo());
                    verifyContentFavorites();
                }
            }
        });
    }
    
    public void construirProduto (int index, String modo)
    {
        this.index = index;
        switch (modo)
        {
            case "EmUso":
                Utilitarios.criarPainelProduto(controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(this.index).getImagem(),
                telaProduto.getImagemProduto(),
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(this.index).getModelo()+" R$ "+controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(this.index).getValor(),
                telaProduto.getTituloProduto());
                telaProduto.getTaDescricao().setText(controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(this.index).imprimirDados(controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(this.index).getCategoria()));
                break;
            case "Geral":
                Utilitarios.criarPainelProduto(controladorGeral.getControladorTelaPrincipal().getProdutosGeral().get(this.index).getImagem(),
                telaProduto.getImagemProduto(),
                controladorGeral.getControladorTelaPrincipal().getProdutosGeral().get(this.index).getModelo()+" R$ "+controladorGeral.getControladorTelaPrincipal().getProdutosGeral().get(this.index).getValor(),
                telaProduto.getTituloProduto());
                telaProduto.getTaDescricao().setText(controladorGeral.getControladorTelaPrincipal().getProdutosGeral().get(this.index).imprimirDados(controladorGeral.getControladorTelaPrincipal().getProdutosGeral().get(this.index).getCategoria()));
                break;
        }
        
    }
    
    public void verifyContentFavorites () 
    {
        this.constructorValue();
        telaProduto.getPopUpMenu().revalidate();
        telaProduto.getPopUpMenu().repaint();
        
    }
   
    public void constructorValue () {
        telaProduto.getPopUpMenu().removeAll();
        telaProduto.getPopUpMenu().setLayout(new FlowLayout());
        for (Map.Entry<Integer, String> entry : controladorGeral.getControladorTelaPrincipal().getFavoritos().entrySet()) {
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
            telaProduto.getPopUpMenu().add(_lbl);
            telaProduto.getPopUpMenu().add(botaoDelete);
        
        
        }
    }
    
    public void exibir()
    {
        Utilitarios.centralizarTela(telaProduto);
        telaProduto.exibirTela();
    }
    
    //GETS
    public TelaProduto getTelaProduto ()
    {
        return this.telaProduto;
    }
    
    @Override
    public void adicionaFavorito(String value) {
        controladorGeral.getControladorTelaPrincipal().getFavoritos().put(controladorGeral.getControladorTelaPrincipal().getValueTeste(), value);
        controladorGeral.getControladorTelaPrincipal().adicionarValueTeste();
    }

    @Override
    public void removefavorito(int key) {
        controladorGeral.getControladorTelaPrincipal().getFavoritos().remove(key);
        constructorValue();    
        telaProduto.getPopUpMenu().revalidate();
        telaProduto.getPopUpMenu().repaint();
    }
}
