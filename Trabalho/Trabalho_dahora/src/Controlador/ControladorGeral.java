package Controlador;

//TELAS
import Codigo.Utilitarios;
import Telas.TelaCadastroPrimeira;
import Telas.TelaCadastroSegunda;
import Telas.TelaCategorias;
import Telas.TelaCompra;
import Telas.TelaLogin;
import Telas.TelaPrincipal;
import Telas.TelaProduto;
import javax.swing.JFrame;

public class ControladorGeral {
    //CONTROLADORES
    private ControladorTelaCadastroPrimeira controladorTelaCadastroPrimeira;
    private ControladorTelaCadastroSegunda controladorTelaCadastroSegunda;
    private ControladorTelaCategorias controladorTelaCategorias;
    private ControladorTelaCompra controladorTelaCompra;
    private ControladorTelaLogin controladorTelaLogin;
    private ControladorTelaPrincipal controladorTelaPrincipal;
    private ControladorTelaProduto controladorTelaProduto;
    
    public ControladorGeral() {
        inicializarTelaCadastroPrimeira();
        inicializarTelaCadastroSegunda();
        inicializarTelaCategorias();
        inicializarTelaCompra();
        inicializarTelaLogin();
        inicializarTelaPrincipal();
        inicializarTelaProduto();
    }
    
    public void inicializarTelaCadastroPrimeira() {
        controladorTelaCadastroPrimeira = new ControladorTelaCadastroPrimeira(new TelaCadastroPrimeira(), this);
    }
    
    public void inicializarTelaCadastroSegunda() {
        controladorTelaCadastroSegunda = new ControladorTelaCadastroSegunda(new TelaCadastroSegunda(), this);
    }
    
    public void inicializarTelaCategorias() {
        controladorTelaCategorias = new ControladorTelaCategorias(new TelaCategorias(), this);
    }
    
    public void inicializarTelaCompra() {
        controladorTelaCompra = new ControladorTelaCompra(new TelaCompra(), this);
    }
    
    public void inicializarTelaLogin() {
        controladorTelaLogin = new ControladorTelaLogin(new TelaLogin(), this);
    }
    
    public void inicializarTelaPrincipal() {
        controladorTelaPrincipal = new ControladorTelaPrincipal(new TelaPrincipal(), this);
    }
    
    public void inicializarTelaProduto() {
        controladorTelaProduto = new ControladorTelaProduto(new TelaProduto(), this);
    }
    
    public void exibirTelaCadastroPrimeira() {
        controladorTelaCadastroPrimeira.exibir();
    }
    
    public void exibirTelaCadastroSegunda() {
        controladorTelaCadastroSegunda.exibir();
    }
    
    public void exibirTelaCategorias(TelaCategorias telaCategorias, JFrame other) {
        Utilitarios.entrarTelaCategorias(telaCategorias, other);
        controladorTelaCategorias.exibir();
    }
    
    public void exibirTelaCategorias(TelaCategorias telaCategorias, JFrame other, String pesquisa) {
        Utilitarios.entrarTelaCategorias(telaCategorias, other, pesquisa);
        controladorTelaCategorias.exibir();
    }
    
    public void exibirTelaCompra(TelaCompra telaCompra, JFrame other) {
        Utilitarios.entrarTelaCompra(telaCompra, other);
        controladorTelaCompra.exibir();
    }
    
    public void exibirTelaLogin(TelaLogin telaLogin, JFrame other) {
        Utilitarios.entrarTelaLogin(telaLogin, other);
        controladorTelaLogin.exibir();
    }
    
    public void exibirTelaPrincipal(TelaPrincipal telaPrincipal, JFrame other) {
        Utilitarios.entrarTelaPrincipal(telaPrincipal, other);
        controladorTelaPrincipal.exibir();
        controladorTelaPrincipal.verifyContentFavorites();
        controladorTelaPrincipal.promocoes();
        controladorTelaPrincipal.alterarComboBox();
    }
    
    public void exibirTelaProduto(TelaProduto telaProduto, JFrame other) {
        Utilitarios.entrarTelaProduto(telaProduto, other);
        controladorTelaProduto.exibir();
    }
    
    public ControladorTelaCadastroPrimeira getControladorTelaCadastroPrimeira()
    {
        return this.controladorTelaCadastroPrimeira;
    }
    
    public ControladorTelaCadastroSegunda getControladorTelaCadastroSegunda()
    {
        return this.controladorTelaCadastroSegunda;
    }
    
    public ControladorTelaCategorias getControladorTelaCategorias()
    {
        return this.controladorTelaCategorias;
    }
    
    public ControladorTelaCompra getControladorTelaCompra()
    {
        return this.controladorTelaCompra;
    }
    
    public ControladorTelaLogin getControladorTelaLogin()
    {
        return this.controladorTelaLogin;
    }
    
    public ControladorTelaPrincipal getControladorTelaPrincipal()
    {
        return this.controladorTelaPrincipal;
    }
    
    public ControladorTelaProduto getControladorTelaProduto()
    {
        return this.controladorTelaProduto;
    }
}
