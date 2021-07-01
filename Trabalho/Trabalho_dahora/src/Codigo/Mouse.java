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
public class Mouse extends Produto {
    private boolean botoesLaterais;
    private boolean semFio;
    private boolean bluetooth;

    public Mouse(String modelo, float valor, String descricao, String marca, String categoria, String imagem,
    boolean bluetooth, boolean botoesLaterais, boolean semFio) {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.botoesLaterais = botoesLaterais;
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
        final Mouse other = (Mouse) obj;
        if (this.botoesLaterais != other.botoesLaterais) {
            return false;
        }
        if (this.semFio != other.semFio) {
            return false;
        }
        if (this.bluetooth != other.bluetooth) {
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

    @Override
    public String imprimirDados(String imprimir) 
    {
        return super.imprimirDados(imprimir) + ", Botões laterais: " + botoesLaterais + ", Sem fio: " + semFio + ", Bluetooth: " + bluetooth;
    }
    
}

