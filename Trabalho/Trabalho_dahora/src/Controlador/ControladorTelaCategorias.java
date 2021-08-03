package Controlador;

import Codigo.Utilitarios;
import Telas.TelaCategorias;

public class ControladorTelaCategorias {
    private TelaCategorias telaCategorias;
    private ControladorGeral controladorGeral;

    public ControladorTelaCategorias(TelaCategorias telaCategorias, ControladorGeral controladorGeral) {
        this.telaCategorias = telaCategorias;
        this.controladorGeral = controladorGeral;
    }
    
    public void exibir()
    {
        Utilitarios.centralizarTela(telaCategorias);
        telaCategorias.exibirTela();
    }
    
    //GETS
    public TelaCategorias getTelaCategorias ()
    {
        return this.telaCategorias;
    }
}
