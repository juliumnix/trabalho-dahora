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
public class Teclado extends Produto{
    private String tipo;
    private boolean numerico;
    private boolean semFio;
    private boolean bluetooth;
    
    public Teclado (String modelo, float valor, String descricao, String marca, String categoria, String tipo, boolean numerico, boolean semFio, boolean bluetooth)
    {
        super(modelo, valor, descricao, marca, categoria);
        this.tipo = tipo;
        this.numerico = numerico;
        this.semFio = semFio;
        this.bluetooth = bluetooth;
    }
    
    public String getTipo ()
    { 
        return this.tipo; 
    }
    
    public boolean getNumerico ()
    {
        return this.numerico;
    }
    
    public boolean getSemFio ()
    {
        return this.semFio;
    }
    
    public boolean getBluetooth ()
    {
        return this.bluetooth;
    }

    public void setTipo(String tipo) 
    {
        if(!tipo.isBlank())
        {
            this.tipo = tipo;
        }
    }

    public void setNumerico(boolean numerico) 
    {
        this.numerico = numerico;
    }

    public void setSemFio(boolean semFio) 
    {
        this.semFio = semFio;
    }

    public void setBluetooth(boolean bluetooth) 
    {
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() 
    {
        return "Teclado - " + super.toString() + ", Tipo: " + tipo + ", Numérico: " + numerico + ", Sem fio: " + semFio + ", Bluetooth: " + bluetooth;
    }
    
}
