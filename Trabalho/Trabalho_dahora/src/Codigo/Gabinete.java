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
public class Gabinete extends Produto {
    private String tamanho;
    private float peso;
    
    public Gabinete (String modelo, float valor, String descricao, String marca, String categoria, String imagem, float peso, String tamanho)
    {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.tamanho = tamanho;
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Gabinete other = (Gabinete) obj;
        if (Float.floatToIntBits(this.peso) != Float.floatToIntBits(other.peso)) {
            return false;
        }
        if (!Objects.equals(this.tamanho, other.tamanho)) {
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
    
    
  
    public String getTamanho ()
    {
        return this.tamanho;
    }
    
    public float getPeso ()
    {
        return this.peso;
    }

    public void setTamanho(String tamanho) 
    {
        if (!tamanho.isEmpty())
        {
            this.tamanho = tamanho;
        }
    }

    public void setPeso(float peso) 
    {
        if (peso > 0)
        {
            this.peso = peso;
        }
    }

    @Override
    public String imprimirDados(String imprimir) 
    {
        return super.imprimirDados(imprimir) + ", Tamanho: " + tamanho + ", Peso: " + peso;
    }
    
}
