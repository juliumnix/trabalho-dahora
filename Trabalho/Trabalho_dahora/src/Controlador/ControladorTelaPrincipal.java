
package Controlador;

import Telas.TelaLogin;
import Telas.TelaPrincipal;

public class ControladorTelaPrincipal {
    
    private TelaPrincipal telaPrincipal;
    private TelaLogin telaLogin;
    
    public ControladorTelaPrincipal(){
        telaPrincipal = new TelaPrincipal();
        telaLogin = new TelaLogin();
        
    }
    
    
     public void exibir(){
        telaPrincipal.exibirTela();
    }
    
    public boolean verificaAdm() {
     if (telaLogin.getLogin().contains("@adm.com"))
        {
            return true;
        }else
        {
            return false;
        }
    }
    
}
