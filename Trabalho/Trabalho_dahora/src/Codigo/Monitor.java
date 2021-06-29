/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

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
