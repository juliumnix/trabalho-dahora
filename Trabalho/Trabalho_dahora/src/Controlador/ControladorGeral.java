package Controlador;

//TELAS
import Telas.TelaCadastroPrimeira;
import Telas.TelaCadastroSegunda;
import Telas.TelaCategorias;
import Telas.TelaCompra;
import Telas.TelaEstoque;
import Telas.TelaLogin;
import Telas.TelaPrincipal;
import Telas.TelaProduto;

//SWING
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
    private ControladorTelaEstoque controladorTelaEstoque;
    
    public ControladorGeral() {
        inicializarTelaCadastroPrimeira();
        inicializarTelaCadastroSegunda();
        inicializarTelaCategorias();
        inicializarTelaCompra();
        inicializarTelaLogin();
        inicializarTelaPrincipal();
        inicializarTelaProduto();
        inicializarTelaEstoque();
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
    
    public void inicializarTelaEstoque ()
    {
        controladorTelaEstoque = new ControladorTelaEstoque(new TelaEstoque(), this);
    }
    
    public void exibirTelaCadastroPrimeira() {
        controladorTelaCadastroPrimeira.limparCampos();
        controladorTelaCadastroPrimeira.exibir();
    }
    
    public void exibirTelaCadastroSegunda() {
        controladorTelaCadastroSegunda.limparCampos();
        controladorTelaCadastroSegunda.exibir();
    }
    
    public void exibirTelaCategorias(TelaCategorias telaCategorias, JFrame other) {
        other.setVisible(false);
        telaCategorias.getIcon().requestFocus();
        telaCategorias.getPopUpMenu().setVisible(false);
        controladorTelaCategorias.setPesquisa(false);
        controladorTelaCategorias.ObjetosNovaPagina();
        controladorTelaCategorias.verifyContentCarrinho();
        controladorTelaCategorias.exibir();
    }
    
    public void exibirTelaCategorias(TelaCategorias telaCategorias, JFrame other, String pesquisa) {
        other.setVisible(false);
        telaCategorias.getIcon().requestFocus();
        telaCategorias.getPopUpMenu().setVisible(false);
        controladorTelaCategorias.setPesquisa(false);
        controladorTelaCategorias.ObjetosNovaPagina(pesquisa);
        controladorTelaCategorias.verifyContentCarrinho();
        controladorTelaCategorias.exibir();
    }
    
    public void exibirTelaCompra(TelaCompra telaCompra, JFrame other) {
        other.setVisible(false);
        telaCompra.getPopUpMenu().setVisible(false);
        controladorTelaCompra.verifyContentCarrinho();
        controladorTelaCompra.exibir();
    }
    
    public void exibirTelaLogin(TelaLogin telaLogin, JFrame other) {
        other.setVisible(false);
        telaLogin.getlLogo().requestFocus();
        controladorTelaLogin.exibir();
    }
    
    public void exibirTelaPrincipal(TelaPrincipal telaPrincipal, JFrame other) {
        other.setVisible(false);
        telaPrincipal.getIcon().requestFocus();
        telaPrincipal.getPopUpMenu().setVisible(false);
        telaPrincipal.getTfPesquisa().setText("");
        controladorTelaPrincipal.verifyContentCarrinho();
        controladorTelaPrincipal.organizarProdutosGeral();
        controladorTelaPrincipal.promocoes();
        controladorTelaPrincipal.alterarComboBox();
        controladorTelaPrincipal.criarTabela();
        controladorTelaPrincipal.visibilidadeBtEstoque();
        controladorTelaPrincipal.exibir();
    }
    
    public void exibirTelaProduto(TelaProduto telaProduto, JFrame other) {
        other.setVisible(false);
        telaProduto.getPopUpMenu().setVisible(false);
        controladorTelaProduto.verifyContentCarrinho();
        controladorTelaProduto.exibir();
    }
    
    public void exibirTelaEstoque(TelaEstoque telaEstoque, JFrame other) {
        other.setVisible(false);
        telaEstoque.getPopUpMenu().setVisible(false);
        controladorTelaEstoque.verifyContentCarrinho();
        controladorTelaEstoque.configurarListaEstoque();
        controladorTelaEstoque.exibir();
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
    
    public ControladorTelaEstoque getControladorTelaEstoque()
    {
        return this.controladorTelaEstoque;
    }
}
