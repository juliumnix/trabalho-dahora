package Controlador;

//CODIGOS
import Codigo.MapManipulator;
import Codigo.Produto;
import Codigo.Utilitarios;

//TELAS
import Telas.TelaEstoque;

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

public class ControladorTelaEstoque implements MapManipulator {
    private TelaEstoque telaEstoque;
    private ControladorGeral controladorGeral;
    private int index;
    private String categoriaEscolhida;

    public ControladorTelaEstoque(TelaEstoque telaEstoque, ControladorGeral controladorGeral) {
        this.telaEstoque = telaEstoque;
        this.controladorGeral = controladorGeral;
        inicializarAcoes();
    }
    
    public void configurarListaEstoque ()
    {
        telaEstoque.getTableModel().getProdutosCadastrados().addAll(controladorGeral.getControladorTelaPrincipal().getArmazenamentos());
        telaEstoque.getTableModel().getProdutosCadastrados().addAll(controladorGeral.getControladorTelaPrincipal().getComputador());
        telaEstoque.getTableModel().getProdutosCadastrados().addAll(controladorGeral.getControladorTelaPrincipal().getCooler());
        telaEstoque.getTableModel().getProdutosCadastrados().addAll(controladorGeral.getControladorTelaPrincipal().getFonte());
        telaEstoque.getTableModel().getProdutosCadastrados().addAll(controladorGeral.getControladorTelaPrincipal().getGabinete());
        telaEstoque.getTableModel().getProdutosCadastrados().addAll(controladorGeral.getControladorTelaPrincipal().getHeadset());
        telaEstoque.getTableModel().getProdutosCadastrados().addAll(controladorGeral.getControladorTelaPrincipal().getMemoriaRAM());
        telaEstoque.getTableModel().getProdutosCadastrados().addAll(controladorGeral.getControladorTelaPrincipal().getMonitor());
        telaEstoque.getTableModel().getProdutosCadastrados().addAll(controladorGeral.getControladorTelaPrincipal().getMouse());
        telaEstoque.getTableModel().getProdutosCadastrados().addAll(controladorGeral.getControladorTelaPrincipal().getNotebook());
        telaEstoque.getTableModel().getProdutosCadastrados().addAll(controladorGeral.getControladorTelaPrincipal().getPlacaDeVideo());
        telaEstoque.getTableModel().getProdutosCadastrados().addAll(controladorGeral.getControladorTelaPrincipal().getPlacaMae());
        telaEstoque.getTableModel().getProdutosCadastrados().addAll(controladorGeral.getControladorTelaPrincipal().getProcessador());
        telaEstoque.getTableModel().getProdutosCadastrados().addAll(controladorGeral.getControladorTelaPrincipal().getTeclado());
    }
    
    public void inicializarAcoes() 
    {
        telaEstoque.adicionarFocusTfPesquisa(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                telaEstoque.desaparecerTextoTfPesquisa();
            }
            
            @Override
            public void focusLost(FocusEvent e)
            {
                telaEstoque.aparecerTextoTfPesquisa();
            }
        });
        
        telaEstoque.adicionarAcaoBtCart(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (telaEstoque.getPopUpMenu().isVisible())
                {
                    telaEstoque.mudarVisibilidadePopUpMenu(false);
                }else
                {
                    telaEstoque.mudarVisibilidadePopUpMenu(true);
                }
            }
        });
        
        telaEstoque.adicionarAcaoBtArmazenamento(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Armazenamento";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Estoque");
                controladorGeral.exibirTelaCadastroPrimeira();
            }
        });
        
        telaEstoque.adicionarAcaoBtComputador(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Computador";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Estoque");
                controladorGeral.exibirTelaCadastroPrimeira();
            }
        });
        
        telaEstoque.adicionarAcaoBtCooler(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Cooler";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Estoque");
                controladorGeral.exibirTelaCadastroPrimeira();
            }
        });
        
        telaEstoque.adicionarAcaoBtFonte(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Fonte";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Estoque");
                controladorGeral.exibirTelaCadastroPrimeira();
            }
        });
        
        telaEstoque.adicionarAcaoBtGabinete(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Gabinete";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Estoque");
                controladorGeral.exibirTelaCadastroPrimeira();
            }
        });
        
        telaEstoque.adicionarAcaoBtHeadset(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Headset";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Estoque");
                controladorGeral.exibirTelaCadastroPrimeira();
            }
        });
        
        telaEstoque.adicionarAcaoBtMemoriaRAM(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Mem??ria RAM";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Estoque");
                controladorGeral.exibirTelaCadastroPrimeira();
            }
        });
        
        telaEstoque.adicionarAcaoBtMonitor(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Monitor";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Estoque");
                controladorGeral.exibirTelaCadastroPrimeira();
            }
        });
        
        telaEstoque.adicionarAcaoBtMouse(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Mouse";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Estoque");
                controladorGeral.exibirTelaCadastroPrimeira();
            }
        });
        
        telaEstoque.adicionarAcaoBtNotebook(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Notebook";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Estoque");
                controladorGeral.exibirTelaCadastroPrimeira();
            }
        });
        
        telaEstoque.adicionarAcaoBtPlacaDeVideo(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Placa de V??deo";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Estoque");
                controladorGeral.exibirTelaCadastroPrimeira();
            }
        });
        
        telaEstoque.adicionarAcaoBtPlacaMae(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Placa M??e";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Estoque");
                controladorGeral.exibirTelaCadastroPrimeira();
            }
        });
        
        telaEstoque.adicionarAcaoBtProcessador(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Processador";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Estoque");
                controladorGeral.exibirTelaCadastroPrimeira();
            }
        });
        
        telaEstoque.adicionarAcaoBtTeclado(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                categoriaEscolhida = "Teclado";
                controladorGeral.getControladorTelaCadastroPrimeira().setTelaAnterior("Estoque");
                controladorGeral.exibirTelaCadastroPrimeira();
            }
        });
        
        telaEstoque.adicionarAcaoBtSair(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                    controladorGeral.exibirTelaLogin(controladorGeral.getControladorTelaLogin().getTelaLogin(), telaEstoque);
            }
        });
        
        telaEstoque.adicionarMouseIcon(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                controladorGeral.exibirTelaPrincipal(controladorGeral.getControladorTelaPrincipal().getTelaPrincipal(), telaEstoque);
            }
            
            @Override
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
        });
        
        telaEstoque.adicionarAcaoBtPesquisa(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.exibirTelaCategorias(controladorGeral.getControladorTelaCategorias().getTelaCategorias(), telaEstoque, telaEstoque.getTfPesquisa().getText());
            }
        });
        
        telaEstoque.adicionarWindowsGainedFocus(new WindowFocusListener()
        {
            public void windowGainedFocus (WindowEvent e)
            {
                telaEstoque.reiniciarPainel();
            }
            public void windowLostFocus(WindowEvent e){}
        });
    }
    
    public void verifyContentCarrinho () {
        this.constructorValueCarrinho();
        telaEstoque.getPopUpMenu().revalidate();
        telaEstoque.getPopUpMenu().repaint();
        
    }
   
    public void constructorValueCarrinho () {
        telaEstoque.getPopUpMenu().removeAll();
        telaEstoque.getPopUpMenu().setLayout(new FlowLayout());
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
            telaEstoque.getPopUpMenu().add(_lbl);
            telaEstoque.getPopUpMenu().add(botaoDelete);
        
        
        }
    }
        
    public void exibir(){
        Utilitarios.centralizarTela(telaEstoque);
        telaEstoque.exibirTela();
    }
    
    //GETS
    public TelaEstoque getTelaEstoque ()
    {
        return this.telaEstoque;
    }
    
    public String getCategoriaEscolhida() {
        return categoriaEscolhida;
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
        telaEstoque.getPopUpMenu().revalidate();
        telaEstoque.getPopUpMenu().repaint();
    } 
}
