public class Computador extends Produto{

    public Computador(String modelo, float valor, String descricao, String marca, String categoria) {
        super(modelo, valor, descricao, marca, categoria);
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public float getValor() {
        return super.getValor();
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public String getCategoria() {
        return super.getCategoria();
    }
}
