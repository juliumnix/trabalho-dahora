package Controlador;

//CODIGO
import Codigo.MapManipulator;
import Codigo.Produto;
import Codigo.Utilitarios;

//TELAS
import Telas.TelaProduto;

//JAVA
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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
    
    private String nome;
    private float valor;
    
    private int index;
    private String modo;

    public ControladorTelaProduto(TelaProduto telaProduto, ControladorGeral controladorGeral) {
        this.telaProduto = telaProduto;
        this.controladorGeral = controladorGeral;
        inicializarAcoes();
    }
    
    public void inicializarAcoes() 
    {
        telaProduto.adicionarFocusTfPesquisa(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                telaProduto.desaparecerTextoTfPesquisa();
            }
            
            @Override
            public void focusLost(FocusEvent e)
            {
                telaProduto.aparecerTextoTfPesquisa();
            }
        });
        
        telaProduto.adicionarAcaoBtCart(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (telaProduto.getPopUpMenu().isVisible())
                {
                    telaProduto.mudarVisibilidadePopUpMenu(false);
                }else
                {
                    telaProduto.mudarVisibilidadePopUpMenu(true);
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
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaProduto, telaProduto.retornarTextoTfPesquisa());
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
                if(controladorGeral.getControladorTelaPrincipal().getCarrinho().size() == 10)
                {
                telaProduto.mensagemJOptionPane("Ops, voc?? s?? pode adicionar 10 itens no seu carrinho");
                } else {
                    switch (modo)
                    {
                        case "EmUso":
                            adicionaCarrinho(controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(index));
                            break;
                        case "Geral":
                            adicionaCarrinho(controladorGeral.getControladorTelaPrincipal().getProdutosGeral().get(index));
                            break;
                    }
                    verifyContentCarrinho();
                }
            }
        });
    }

    public void construirProduto (int index, String modo)
    {
        this.index = index;
        this.modo = modo;
        switch (modo)
        {
            case "EmUso":
                Utilitarios.criarPainelProduto(controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(this.index).getImagem(),
                telaProduto.getImagemProduto(),
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(this.index).getModelo()+" R$ "+controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(this.index).getValor(),
                telaProduto.getTituloProduto());
                telaProduto.setarTextoTaDescricao(controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(this.index).imprimirDados(controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(this.index).getCategoria()));
                
                this.nome = controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(this.index).getModelo();
                this.valor = controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().get(this.index).getValor();
                
                break;
            case "Geral":
                Utilitarios.criarPainelProduto(controladorGeral.getControladorTelaPrincipal().getProdutosGeral().get(this.index).getImagem(),
                telaProduto.getImagemProduto(),
                controladorGeral.getControladorTelaPrincipal().getProdutosGeral().get(this.index).getModelo()+" R$ "+controladorGeral.getControladorTelaPrincipal().getProdutosGeral().get(this.index).getValor(),
                telaProduto.getTituloProduto());
                telaProduto.setarTextoTaDescricao(controladorGeral.getControladorTelaPrincipal().getProdutosGeral().get(this.index).imprimirDados(controladorGeral.getControladorTelaPrincipal().getProdutosGeral().get(this.index).getCategoria()));
                
                this.nome = controladorGeral.getControladorTelaPrincipal().getProdutosGeral().get(this.index).getModelo();
                this.valor = controladorGeral.getControladorTelaPrincipal().getProdutosGeral().get(this.index).getValor();
                
                break;
        }
        
    }
        
    public void verifyContentCarrinho () {
        this.constructorValueCarrinho();
        telaProduto.getPopUpMenu().revalidate();
        telaProduto.getPopUpMenu().repaint();
        
    }
   
    public void constructorValueCarrinho () {
        telaProduto.getPopUpMenu().removeAll();
        telaProduto.getPopUpMenu().setLayout(new FlowLayout());
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
        telaProduto.getPopUpMenu().revalidate();
        telaProduto.getPopUpMenu().repaint();
    } 
}
