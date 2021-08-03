package Controlador;

import Codigo.Utilitarios;
import Telas.TelaProduto;

public class ControladorTelaProduto {
    private TelaProduto telaProduto;
    private ControladorGeral controladorGeral;

    public ControladorTelaProduto(TelaProduto telaProduto, ControladorGeral controladorGeral) {
        this.telaProduto = telaProduto;
        this.controladorGeral = controladorGeral;
    }
    
    public void exibir()
    {
        Utilitarios.centralizarTela(telaProduto);
        telaProduto.exibirTela();
    }
    
    //GETS
    public TelaProduto getTelaProduto ()
    {
        return this.telaProduto;
    }
}
