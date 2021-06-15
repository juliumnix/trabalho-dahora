/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author juliu
 */
public class Mouse extends Produto {
    private boolean botoesLaterais;
    private boolean semFio;
    private boolean bluetooth;

    public Mouse(String modelo, float valor, String descricao, String marca, String categoria,
                 boolean botoesLaterais, boolean semFio, boolean bluetooth) {
        super(modelo, valor, descricao, marca, categoria);
        this.botoesLaterais = botoesLaterais;
        this.semFio = semFio;
        this.bluetooth = bluetooth;
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
    public String toString() 
    {
        return "Mouse - " + super.toString() + ", Botões laterais: " + botoesLaterais + ", Sem fio: " + semFio + ", Bluetooth: " + bluetooth;
    }
    
}

