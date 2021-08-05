package Controlador;

//CODIGO
import Codigo.Computador;
import Codigo.Notebook;
import Codigo.Utilitarios;

//TELAS
import Telas.TelaCadastroPrimeira;

//JAVA
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorTelaCadastroPrimeira {
    private TelaCadastroPrimeira telaCadastroPrimeira;
    private ControladorGeral controladorGeral;
    private String modelo;
    private float valor;
    private String descricao;
    private String marca;
    private String categoria;
    private String imagem;

    public ControladorTelaCadastroPrimeira(TelaCadastroPrimeira telaCadastroPrimeira, ControladorGeral controladorGeral) {
        this.telaCadastroPrimeira = telaCadastroPrimeira;
        this.controladorGeral = controladorGeral;
        configurarTela();
        inicializarAcoes();
    }
    
    public void configurarTela()
    {
        Utilitarios.centralizarTela(telaCadastroPrimeira);
        telaCadastroPrimeira.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
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
                            telaCadastroPrimeira.setVisible(false);
                        }
                    }
                }catch (Exception error) {
                    telaCadastroPrimeira.getJOptionPane1().showMessageDialog(null, "Preencha todos os campos");
                }
            }
        });
    }
    
    public void SetarValores ()
    {
        this.modelo = telaCadastroPrimeira.getTfModelo().getText();
        this.valor = Float.parseFloat(telaCadastroPrimeira.getTfValor().getText());
        this.descricao = telaCadastroPrimeira.getTfDescricao().getText();
        this.marca = telaCadastroPrimeira.getTfMarca().getText();
        this.categoria = controladorGeral.getControladorTelaPrincipal().getCategoriaEscolhida();
        this.imagem = telaCadastroPrimeira.getTfImagem().getText();
    }
    
    public void gerarComputador ()
    {
        Computador computador = new Computador (modelo, valor, descricao, marca, categoria, imagem);
        if (controladorGeral.getControladorTelaPrincipal().getComputador().add(computador) == true) 
        {
            controladorGeral.getControladorTelaPrincipal().getTelaPrincipal().getJOptionPane1().showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            controladorGeral.getControladorTelaPrincipal().getTelaPrincipal().getJOptionPane1().showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void gerarNotebook ()
    {
        Notebook notebook = new Notebook (modelo, valor, descricao, marca, categoria, imagem);
        if (controladorGeral.getControladorTelaPrincipal().getNotebook().add(notebook) == true) 
        {
            controladorGeral.getControladorTelaPrincipal().getTelaPrincipal().getJOptionPane1().showMessageDialog(null, "Cadastro realizado com sucesso");
        } else 
        {
            controladorGeral.getControladorTelaPrincipal().getTelaPrincipal().getJOptionPane1().showMessageDialog(null, "Cadastro duplicado");
        }
    }
    
    public void limparCampos ()
    {
        telaCadastroPrimeira.getTfModelo().setText("");
        telaCadastroPrimeira.getTfValor().setText("");
        telaCadastroPrimeira.getTfDescricao().setText("");
        telaCadastroPrimeira.getTfMarca().setText("");
        telaCadastroPrimeira.getTfImagem().setText("");
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
}
