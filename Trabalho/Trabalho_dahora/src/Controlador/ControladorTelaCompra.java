package Controlador;

//CODIGOS
import Codigo.MapManipulator;
import Codigo.Produto;
import Codigo.Utilitarios;

//TELAS
import Telas.TelaCompra;

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
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.util.Map;

//SWING
import javax.swing.JButton;
import javax.swing.JLabel;

public class ControladorTelaCompra implements MapManipulator {
    private TelaCompra telaCompra;
    private ControladorGeral controladorGeral;
    private int index;

    public ControladorTelaCompra(TelaCompra telaCompra, ControladorGeral controladorGeral) {
        this.telaCompra = telaCompra;
        this.controladorGeral = controladorGeral;
        configurarTela();
        inicializarAcoes();
    }
    
    public void configurarTela(){
        telaCompra.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
        Utilitarios.aparecerImagemLocal(telaCompra.getIcon(), "src/imagens/BOOM.png");
        Utilitarios.aparecerImagemLocal(telaCompra.getBtPesquisa(), "src/imagens/IconSearch.png");
        Utilitarios.aparecerImagemLocal(telaCompra.getBtCart(), "src/imagens/IconCart.png");
        telaCompra.getIcon().requestFocus();
        telaCompra.getPopUpMenu().setVisible(false); 
    }
    
    public void inicializarAcoes() 
    {
        telaCompra.adicionarFocusTfPesquisa(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                Utilitarios.desaparecerTexto("Pesquisa", telaCompra.getTfPesquisa());
            }
            
            @Override
            public void focusLost(FocusEvent e)
            {
                Utilitarios.aparecerTexto("Pesquisa", telaCompra.getTfPesquisa());
            }
        });
        
        telaCompra.adicionarAcaoBtCart(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (telaCompra.getPopUpMenu().isVisible())
                {
                    telaCompra.getPopUpMenu().setVisible(false);
                }else
                {
                    telaCompra.getPopUpMenu().setVisible(true);
                }
            }
        });
        
        telaCompra.adicionarAcaoBtArmazenamento(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getArmazenamentos());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra);
            }
        });
        
        telaCompra.adicionarAcaoBtComputador(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getComputador());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra);
            }
        });
        
        telaCompra.adicionarAcaoBtCooler(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getCooler());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra);
            }
        });
        
        telaCompra.adicionarAcaoBtFonte(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getFonte());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra);
            }
        });
        
        telaCompra.adicionarAcaoBtGabinete(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getGabinete());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra);
            }
        });
        
        telaCompra.adicionarAcaoBtHeadset(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getHeadset());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra);
            }
        });
        
        telaCompra.adicionarAcaoBtMemoriaRAM(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getMemoriaRAM());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra);
            }
        });
        
        telaCompra.adicionarAcaoBtMonitor(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getMonitor());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra);
            }
        });
        
        telaCompra.adicionarAcaoBtMouse(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getMouse());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra);
            }
        });
        
        telaCompra.adicionarAcaoBtNotebook(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getNotebook());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra);
            }
        });
        
        telaCompra.adicionarAcaoBtPlacaDeVideo(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getPlacaDeVideo());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra);
            }
        });
        
        telaCompra.adicionarAcaoBtPlacaMae(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getPlacaMae());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra);
            }
        });
        
        telaCompra.adicionarAcaoBtProcessador(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getProcessador());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra);
            }
        });
        
        telaCompra.adicionarAcaoBtTeclado(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().clear();
                controladorGeral.getControladorTelaPrincipal().getProdutosEmUso().addAll(controladorGeral.getControladorTelaPrincipal().getTeclado());
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra);
            }
        });
        
        telaCompra.adicionarAcaoBtSair(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                    controladorGeral.exibirTelaLogin(controladorGeral.getControladorTelaLogin().getTelaLogin(), telaCompra);
            }
        });
        
        telaCompra.adicionarMouseIcon(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                controladorGeral.exibirTelaPrincipal(controladorGeral.getControladorTelaPrincipal().getTelaPrincipal(), telaCompra);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaCompra.adicionarAcaoBtPesquisa(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaCompra, telaCompra.getTfPesquisa().getText());
            }
        });
        
        telaCompra.adicionarWindowsGainedFocus(new WindowFocusListener()
        {
            public void windowGainedFocus (WindowEvent e)
            {
                telaCompra.getJPanel1().revalidate();
                telaCompra.getJPanel1().repaint();
            }
            public void windowLostFocus(WindowEvent e){}
        });
        
        telaCompra.adicionarAcaoJButton1(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                controladorGeral.getControladorTelaPrincipal().getFavoritos().clear();
                telaCompra.getJOptionPane1().showMessageDialog(null, "Compra finalizada com sucesso, obrigado");
                getTelaCompra().getTableModel().clearTable();
                verifyContentCarrinho();
            }
        });
        
        telaCompra.adicionarAcaoBtExcluir(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (getTelaCompra().getJTableCarrinho().getSelectedRow() != -1)
                {
                    int quantidade = getTelaCompra().getTableModel().getDados().get(getTelaCompra().getJTableCarrinho().getSelectedRow()).getQuantidade();
                    if (quantidade > 1)
                    {
                        quantidade--;
                        String quantidadeFinal = Integer.toString(quantidade);
                        controladorGeral.getControladorTelaCompra().getTelaCompra().getTableModel().setValueAt(quantidadeFinal, getTelaCompra().getJTableCarrinho().getSelectedRow(), 2);
                    }else
                    {
                        getTelaCompra().getTableModel().removeRow(getTelaCompra().getJTableCarrinho().getSelectedRow());
                    }
                }
            }
        });
    }
    
    public void verifyContentCarrinho () {
        this.constructorValueCarrinho();
        telaCompra.getPopUpMenu().revalidate();
        telaCompra.getPopUpMenu().repaint();
        
    }
   
    public void constructorValueCarrinho () {
        telaCompra.getPopUpMenu().removeAll();
        telaCompra.getPopUpMenu().setLayout(new FlowLayout());
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
            telaCompra.getPopUpMenu().add(_lbl);
            telaCompra.getPopUpMenu().add(botaoDelete);
        
        
        }
    }
        
    public void exibir(){
        Utilitarios.centralizarTela(telaCompra);
        telaCompra.exibirTela();
    }
    
    //GETS
    public TelaCompra getTelaCompra ()
    {
        return this.telaCompra;
    }
    
    @Override
    public void adicionaCarrinho(Produto produto) {
        controladorGeral.getControladorTelaPrincipal().getCarrinho().put(controladorGeral.getControladorTelaPrincipal().getValueTeste(), produto);
        controladorGeral.getControladorTelaPrincipal().adicionarValueTeste();
    }

    @Override
    public void removeCarrinho(int key) {  
        controladorGeral.getControladorTelaPrincipal().getCarrinho().remove(key);
        this.constructorValueCarrinho();    
        telaCompra.getPopUpMenu().revalidate();
        telaCompra.getPopUpMenu().repaint();
    } 
}