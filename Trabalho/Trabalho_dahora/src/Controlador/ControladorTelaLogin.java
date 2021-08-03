
package Controlador;

import Codigo.Autenticador;
import Telas.TelaLogin;

 
public class ControladorTelaLogin implements Autenticador {
    private TelaLogin telaLogin; 
    
    public ControladorTelaLogin(){
        telaLogin = new TelaLogin();
    }
    
    public void exibirLogin(){
        telaLogin.exibirTela();
    }
    
     public boolean verificaAdm() {
        if (telaLogin.getLogin().contains("@adm.com"))
        {
            return true;
        }
        else
            
        {
            return false;
        }
    }
}
