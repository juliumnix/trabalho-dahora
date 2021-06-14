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
    
    public Monitor (String modelo, float valor, String descricao, String marca, String categoria, int resolucao, float tamanho, String aspecto, boolean wide, int frameRate)
    {
        super(modelo, valor, descricao, marca, categoria);
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
        this.resolucao = resolucao;
    }

    public void setTamanho(float tamanho) 
    {
        this.tamanho = tamanho;
    }

    public void setAspecto(String aspecto) 
    {
        this.aspecto = aspecto;
    }

    public void setWide(boolean wide) 
    {
        this.wide = wide;
    }

    public void setFrameRate(int frameRate) 
    {
        this.frameRate = frameRate;
    }

    @Override
    public String toString() 
    {
        return "Monitor{" + "resolucao=" + resolucao + ", tamanho=" + tamanho + ", aspecto=" + aspecto + ", wide=" + wide + ", frameRate=" + frameRate + '}';
    }
    
}
