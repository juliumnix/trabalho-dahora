/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.Objects;

/**
 *
 * @author Mateus
 */
public class Cooler extends Produto {
    private float velocidadeVentoinha;
    private String tipo;
    
    public Cooler (String modelo, float valor, String descricao, String marca, String categoria, String imagem, float velocidadeVentoinha, String tipo)
    {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.velocidadeVentoinha = velocidadeVentoinha;
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cooler other = (Cooler) obj;
        if (Float.floatToIntBits(this.velocidadeVentoinha) != Float.floatToIntBits(other.velocidadeVentoinha)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo))
        {
            return false;
        }
        if (Float.floatToIntBits(this.valor) != Float.floatToIntBits(other.valor))
        {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao))
        {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca))
        {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria))
        {
            return false;
        }
        return true;
    }
    
    public float getVelocidadeVentoinha ()
    {
        return this.velocidadeVentoinha;
    }
    
    public String getTipo ()
    {
        return this.tipo;
    }

    public void setVelocidadeVentoinha(float velocidadeVentoinha) 
    {
        if (velocidadeVentoinha > 0)
        {
            this.velocidadeVentoinha = velocidadeVentoinha;
        }
    }

    public void setTipo(String tipo) 
    {
        if (!tipo.isEmpty())
        {
            this.tipo = tipo;
        }
    }

    @Override
    public String imprimirDados(String imprimir) 
    {
        return super.imprimirDados(imprimir) + ", Velocidade da ventoinha: " + velocidadeVentoinha + ", Tamanho: " + tipo;
    }
    
}
