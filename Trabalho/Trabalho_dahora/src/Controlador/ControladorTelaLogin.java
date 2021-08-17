package Controlador;

//CODIGO
import Codigo.Autenticador;
import Codigo.Utilitarios;
import Excecoes.LoginException;

//TELAS
import Telas.TelaLogin;

//JAVA
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

 
public class ControladorTelaLogin implements Autenticador {
    private TelaLogin telaLogin;
    private ControladorGeral controladorGeral;
    
    public ControladorTelaLogin(TelaLogin telaLogin, ControladorGeral controladorGeral) {
        this.telaLogin = telaLogin;
        this.controladorGeral = controladorGeral;
        inicializarAcoes();
        
       
    }
    
    public void inicializarAcoes() 
    {
        telaLogin.adicionarAcaoBtLogin(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try {
                    verificaAdm();
                    controladorGeral.getControladorTelaPrincipal().criarTabela();
                    controladorGeral.exibirTelaPrincipal(controladorGeral.getControladorTelaPrincipal().getTelaPrincipal(), telaLogin);
                    
                } catch (LoginException ex) {
                    System.out.println(ex.getMessage());
                }
                
            }
        });
        
        telaLogin.adicionarFocusTfEmail(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                telaLogin.desaparecerLogin();
            }
            
            @Override
            public void focusLost(FocusEvent e)
            {
                telaLogin.aparecerLogin();
            }
        });
        
        telaLogin.adicionarFocusPfSenha(new FocusListener()
        {
           @Override
            public void focusGained(FocusEvent e)
            {
                telaLogin.desaparecerSenha();
            }
            
            @Override
            public void focusLost(FocusEvent e)
            {
                telaLogin.aparecerSenha();
            } 
        });
        
        telaLogin.adicionarAcaoCkVisivel(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                telaLogin.checkBoxSenha();
            }
        });
        
    }
    
    @Override
    public boolean verificaAdm() throws LoginException 
    {
        
        if (telaLogin.retornarTextoLogin().equals("Email") ) {
            throw new LoginException("Usuário vazio");
            
        } else {
        
        if (telaLogin.retornarTextoLogin().contains("@adm.com"))
        {
           
            return true;
        }
        else    
        {
            return false;
            
        }
       }
    }
    
    public void exibir()
    {
        Utilitarios.centralizarTela(telaLogin);
        telaLogin.exibirTela();
    }
    
    //GETS
    public TelaLogin getTelaLogin ()
    {
        return this.telaLogin;
    }
}
