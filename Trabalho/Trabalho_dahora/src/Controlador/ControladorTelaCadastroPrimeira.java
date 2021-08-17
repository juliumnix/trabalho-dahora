package Controlador;

//CODIGO
import Codigo.Computador;
import Codigo.Notebook;
import Codigo.Utilitarios;
import DAO.ComputadorDAO;
import DAO.NotebookDAO;

//TELAS
import Telas.TelaCadastroPrimeira;

//JAVA
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorTelaCadastroPrimeira {
    private TelaCadastroPrimeira telaCadastroPrimeira;
    private ControladorGeral controladorGeral;
    private String telaAnterior;
    private String modelo;
    private float valor;
    private String descricao;
    private String marca;
    private String categoria;
    private String imagem;

    public ControladorTelaCadastroPrimeira(TelaCadastroPrimeira telaCadastroPrimeira, ControladorGeral controladorGeral) {
        this.telaCadastroPrimeira = telaCadastroPrimeira;
        this.controladorGeral = controladorGeral;
        inicializarAcoes();
    }
        
    public void inicializarAcoes() 
    {
        telaCadastroPrimeira.adicionarAcaoBtProximo(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    SetarValores();
                    controladorGeral.getControladorTelaCadastroSegunda().SetCategoria(categoria);
                    controladorGeral.getControladorTelaCadastroSegunda().componentesCategoria();
                    if (categoria.equals("Computador"))
                    {
                        gerarComputador();
                        controladorGeral.getControladorTelaPrincipal().organizarProdutosGeral();
                        controladorGeral.getControladorTelaPrincipal().alterarComboBox ();
                    }else
                    {
                        if (categoria.equals("Notebook"))
                        {
                            gerarNotebook();
                            controladorGeral.getControladorTelaPrincipal().organizarProdutosGeral();
                            controladorGeral.getControladorTelaPrincipal().alterarComboBox ();
                        }else
                        {
                            controladorGeral.exibirTelaCadastroSegunda();
                            telaCadastroPrimeira.esconderTela();
                        }
                    }
                }catch (Exception error) {
                    telaCadastroPrimeira.mensagemJOptionPane("Preencha todos os campos");
                }
            }
        });
    }
    
    public void SetarValores ()
    {
        this.modelo = telaCadastroPrimeira.textoTfModelo();
        this.valor = telaCadastroPrimeira.textoTfValor();
        this.descricao = telaCadastroPrimeira.textoTfDescricao();
        this.marca = telaCadastroPrimeira.textoTfMarca();
        if (telaAnterior == "Principal")
        {
            this.categoria = controladorGeral.getControladorTelaPrincipal().getCategoriaEscolhida();
        }else if (telaAnterior == "Estoque")
        {
            this.categoria = controladorGeral.getControladorTelaEstoque().getCategoriaEscolhida();
        }   
        this.imagem = telaCadastroPrimeira.textoTfImagem();
    }
    
    public void gerarComputador ()
    {
        Computador computador = new Computador (modelo, valor, descricao, marca, categoria, imagem);
        if (controladorGeral.getControladorTelaPrincipal().getComputador().add(computador) == true) 
        {
            try {
                ComputadorDAO.salvarComputador(computador);
            controladorGeral.getControladorTelaPrincipal().getTelaPrincipal().mensagemJOptionPane("Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        } else 
        {
            controladorGeral.getControladorTelaPrincipal().getTelaPrincipal().mensagemJOptionPane("Cadastro duplicado");
        }
    }
    
    public void gerarNotebook ()
    {
        Notebook notebook = new Notebook (modelo, valor, descricao, marca, categoria, imagem);
        if (controladorGeral.getControladorTelaPrincipal().getNotebook().add(notebook) == true) 
        {
            try {
                NotebookDAO.salvarNotebook(notebook);
            controladorGeral.getControladorTelaPrincipal().getTelaPrincipal().mensagemJOptionPane("Cadastro realizado com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else 
        {
            controladorGeral.getControladorTelaPrincipal().getTelaPrincipal().mensagemJOptionPane("Cadastro duplicado");
        }
    }
    
    
    
    public void exibir()
    {
        Utilitarios.centralizarTela(telaCadastroPrimeira);
        telaCadastroPrimeira.exibirTela();
    }
    
    //GETS
    public TelaCadastroPrimeira getTelaCadastroPrimeira ()
    {
        return this.telaCadastroPrimeira;
    }
    
    public String getModelo() 
    {
        return this.modelo;
    }

    public float getValor() 
    {
        return this.valor;
    }

    public String getDescricao() 
    {
        return this.descricao;
    }

    public String getCategoria() 
    {
        return this.categoria;
    }

    public String getImagem() 
    {
        return this.imagem;
    }

    public String getMarca() 
    {
        return this.marca;
    }
    
    public String getTelaAnterior() {
        return telaAnterior;
    }

    public void setTelaAnterior(String telaAnterior) {
        this.telaAnterior = telaAnterior;
    }
}
