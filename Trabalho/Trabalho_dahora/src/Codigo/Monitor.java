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
public class Monitor extends Produto{
    private String resolucao;
    private float tamanho;
    private String aspecto;
    private int frameRate;
    
    public Monitor (String modelo, float valor, String descricao, String marca, String categoria, String imagem,
    float tamanho, String aspecto, int frameRate, String resolucao)
    {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.resolucao = resolucao;
        this.tamanho = tamanho;
        this.aspecto = aspecto;
        this.frameRate = frameRate;
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
        final Monitor other = (Monitor) obj;
        if (Float.floatToIntBits(this.tamanho) != Float.floatToIntBits(other.tamanho)) {
            return false;
        }
        if (this.frameRate != other.frameRate) {
            return false;
        }
        if (!Objects.equals(this.resolucao, other.resolucao)) {
            return false;
        }
        if (!Objects.equals(this.aspecto, other.aspecto)) {
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
    
    public String getResolucao ()
    {
        return this.resolucao;
    }
    
    public float getTamanho ()
    {
        return this.tamanho;
    }
    
    public String getAspecto ()
    {
        return this.aspecto;
    }
    
    public int getFrameRate ()
    {
        return this.frameRate;
    }

    public void setResolucao(String resolucao) 
    {
        if (!resolucao.isEmpty())
        {
            this.resolucao = resolucao;
        }
    }

    public void setTamanho(float tamanho) 
    {
        if (tamanho > 0)
        {
            this.tamanho = tamanho;
        }
    }

    public void setAspecto(String aspecto) 
    {
        if (!aspecto.isBlank())
        {
            this.aspecto = aspecto;
        }
    }

    public void setFrameRate(int frameRate) 
    {
        if (frameRate > 0)
        {
            this.frameRate = frameRate;
        }
    }

    @Override
    public String imprimirDados(String imprimir) 
    {
        return super.imprimirDados(imprimir) + ", Resolução: " + resolucao + ", Tamanho: " + tamanho + ", Aspecto: " + aspecto + ", Frame Rate: " + frameRate;
    }
    
}
