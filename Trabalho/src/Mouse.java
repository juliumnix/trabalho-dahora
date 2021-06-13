public class Mouse extends Produto {
    private boolean botoesLaterais;
    private boolean semFio;
    private boolean bluetooth;

    public Mouse(String modelo, float valor, String descricao, String marca, String categoria,
                 boolean botoesLaterais, boolean semFio, boolean bluetooth) {
        super(modelo, valor, descricao, marca, categoria);
        this.botoesLaterais = botoesLaterais;
        this.semFio = semFio;
        this.bluetooth = bluetooth;
    }

    public boolean getBotoesLaterais() {
        return botoesLaterais;
    }

    public void setBotoesLaterais(boolean botoesLaterais) {
        this.botoesLaterais = botoesLaterais;
    }

    public boolean getSemFio() {
        return semFio;
    }

    public void setSemFio(boolean semFio) {
        this.semFio = semFio;
    }

    public boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public Mouse(String modelo, float valor, String descricao, String marca, String categoria) {
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
