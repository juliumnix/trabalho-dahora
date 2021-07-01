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
public class Teclado extends Produto{
    private String tipo;
    private boolean numerico;
    private boolean semFio;
    private boolean bluetooth;
    
    public Teclado (String modelo, float valor, String descricao, String marca, String categoria, String imagem,
    boolean bluetooth, boolean numerico, String tipo, boolean semFio)
    {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.tipo = tipo;
        this.numerico = numerico;
        this.semFio = semFio;
        this.bluetooth = bluetooth;
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
        final Teclado other = (Teclado) obj;
        if (this.numerico != other.numerico) {
            return false;
        }
        if (this.semFio != other.semFio) {
            return false;
        }
        if (this.bluetooth != other.bluetooth) {
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
    public String imprimirDados(String imprimir) 
    {
        return super.imprimirDados(imprimir) + ", Tipo: " + tipo + ", Numérico: " + numerico + ", Sem fio: " + semFio + ", Bluetooth: " + bluetooth;
    }
    
}
