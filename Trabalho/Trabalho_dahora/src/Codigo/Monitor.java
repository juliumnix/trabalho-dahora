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
    private int resolucao;
    private float tamanho;
    private String aspecto;
    private boolean wide;
    private int frameRate;
    
    public Monitor (String modelo, float valor, String descricao, String marca, String categoria, String imagem,
            int resolucao, float tamanho, String aspecto, boolean wide, int frameRate)
    {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.resolucao = resolucao;
        this.tamanho = tamanho;
        this.aspecto = aspecto;
        this.wide = wide;
        this.frameRate = frameRate;
    }
    
    public int getResolucao ()
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
    
    public boolean getWide ()
    {
        return this.wide;
    }
    
    public int getFrameRate ()
    {
        return this.frameRate;
    }

    public void setResolucao(int resolucao) 
    {
        if (resolucao > 0)
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

    public void setWide(boolean wide) 
    {
        this.wide = wide;
    }

    public void setFrameRate(int frameRate) 
    {
        if (frameRate > 0)
        {
            this.frameRate = frameRate;
        }
    }

    @Override
    public String toString() 
    {
        return "Monitor - " + super.toString() + ", Resolução: " + resolucao + ", Tamanho: " + tamanho + ", Aspecto: " + aspecto + ", Wide: " + wide + ", Frame Rate: " + frameRate;
    }
    
}
