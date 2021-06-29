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

