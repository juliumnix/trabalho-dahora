/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author juliu
 */
public class ControladorGeral {
    private ControladorTelaLogin telaLogin;
    private ControladorTelaPrincipal telaPrincipal;
    
    public ControladorGeral() {
        telaLogin = new ControladorTelaLogin();
        telaPrincipal  = new ControladorTelaPrincipal();
    }
    
    public void exibirTelaLogin () {
        telaLogin.exibirLogin();
    }
    
    public void exibirTelaPrincipal () {
        telaPrincipal.exibir();
    }
}
