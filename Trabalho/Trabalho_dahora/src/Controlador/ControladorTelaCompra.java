package Controlador;

import Codigo.Utilitarios;
import Telas.TelaCompra;

public class ControladorTelaCompra {
    private TelaCompra telaCompra;
    private ControladorGeral controladorGeral;

    public ControladorTelaCompra(TelaCompra telaCompra, ControladorGeral controladorGeral) {
        this.telaCompra = telaCompra;
        this.controladorGeral = controladorGeral;
    }
    
    public void exibir(){
        Utilitarios.centralizarTela(telaCompra);
        telaCompra.exibirTela();
    }
    
    //GETS
    public TelaCompra getTelaCompra ()
    {
        return this.telaCompra;
    }
}
