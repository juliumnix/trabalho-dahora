package Controlador;

import Codigo.Utilitarios;
import Telas.TelaCadastroSegunda;

public class ControladorTelaCadastroSegunda {
    private TelaCadastroSegunda telaCadastroSegunda;
    private ControladorGeral controladorGeral;

    public ControladorTelaCadastroSegunda(TelaCadastroSegunda telaCadastroSegunda, ControladorGeral controladorGeral) {
        this.telaCadastroSegunda = telaCadastroSegunda;
        this.controladorGeral = controladorGeral;
    }
    
    public void exibir()
    {
        Utilitarios.centralizarTela(telaCadastroSegunda);
        telaCadastroSegunda.exibirTela();
    }
    
    //GETS
    public TelaCadastroSegunda getTelaCadastroSegunda ()
    {
        return this.telaCadastroSegunda;
    }
}
