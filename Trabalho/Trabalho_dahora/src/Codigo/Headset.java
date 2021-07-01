/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.Objects;

/**
 *
 * @author juliu
 */
public class Headset extends Produto {
    private boolean semFio;
    private boolean microfone;
    private String tipo;
    private boolean bluetooth;

    public Headset(String modelo, float valor, String descricao, String marca, String categoria, String imagem,
    boolean bluetooth, boolean microfone, boolean semFio, String tipo) {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.semFio = semFio;
        this.microfone = microfone;
        this.tipo = tipo;
        this.bluetooth = bluetooth;
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
        final Headset other = (Headset) obj;
        if (this.semFio != other.semFio) {
            return false;
        }
        if (this.microfone != other.microfone) {
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
    

    public boolean getSemFio() {
        return semFio;
    }

    public void setSemFio(boolean semFio) {
        this.semFio = semFio;
    }

    public boolean isMicrofone() {
        return microfone;
    }

    public void setMicrofone(boolean microfone) {
        this.microfone = microfone;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean setTipo(String tipo) {
        if (tipo.isBlank()){
            return false;
        }
        this.tipo = tipo;
        return true;

    }

    public boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public String imprimirDados(String imprimir) 
    {
        return super.imprimirDados(imprimir) + ", Sem Fio: " + semFio + ", Microfone: " + microfone + ", Tipo: " + tipo + ", Bluetooth: " + bluetooth;
    }
    
}

