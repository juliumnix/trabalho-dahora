package Controlador;

//CODIGO
import Codigo.Autenticador;
import Codigo.Utilitarios;
//TELAS
import Telas.TelaLogin;
//JAVA
import java.awt.Toolkit;
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
        configurarTela();
        inicializarAcoes();
    }
    
    public void configurarTela()
    {
        Utilitarios.aparecerImagemLocal(telaLogin.getlLogo(), "src/imagens/BOOM.png");
        Utilitarios.centralizarTela(telaLogin);
        telaLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/1.png"));
        telaLogin.getlLogo().requestFocus();
    }
    
    public void inicializarAcoes() 
    {
        telaLogin.adicionarAcaoBtLogin(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                controladorGeral.exibirTelaPrincipal(controladorGeral.getControladorTelaPrincipal().getTelaPrincipal(), telaLogin);
            }
        });
        
        telaLogin.adicionarFocusTfEmail(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                Utilitarios.desaparecerTexto("Email", telaLogin.getTfEmail());
            }
            
            @Override
            public void focusLost(FocusEvent e)
            {
                Utilitarios.aparecerTexto("Email", telaLogin.getTfEmail());
            }
        });
        
        telaLogin.adicionarFocusPfSenha(new FocusListener()
        {
           @Override
            public void focusGained(FocusEvent e)
            {
                Utilitarios.desaparecerTexto("Senhadaora", telaLogin.getPfSenha());
            }
            
            @Override
            public void focusLost(FocusEvent e)
            {
                Utilitarios.aparecerTexto("Senhadaora", telaLogin.getPfSenha());
            } 
        });
        
        telaLogin.adicionarAcaoCkVisivel(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                Utilitarios.visibilidadeSenha(telaLogin.getCkVisivel(), telaLogin.getPfSenha());
            }
        });
        
    }
    
    public boolean verificaAdm() 
    {
        if (telaLogin.getPfSenha().getText().contains("@adm.com"))
        {
            return true;
        }
        else    
        {
            return false;
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
