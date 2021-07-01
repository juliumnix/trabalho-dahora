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
public class PlacaMae extends Produto {
    private boolean wifi;
    private int entradasRAM;
    private int entradasUSB;
    private int entradasPCIExpress;
    private String tamanho;
    private boolean bluetooth;

    public PlacaMae(String modelo, float valor, String descricao, String marca, String categoria, String imagem,
    int entradasPCIExpress, int entradasRAM, int entradasUSB, boolean bluetooth, String tamanho, boolean wifi) {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.wifi = wifi;
        this.entradasRAM = entradasRAM;
        this.entradasUSB = entradasUSB;
        this.entradasPCIExpress = entradasPCIExpress;
        this.tamanho = tamanho;
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
        final PlacaMae other = (PlacaMae) obj;
        if (this.wifi != other.wifi) {
            return false;
        }
        if (this.entradasRAM != other.entradasRAM) {
            return false;
        }
        if (this.entradasUSB != other.entradasUSB) {
            return false;
        }
        if (this.entradasPCIExpress != other.entradasPCIExpress) {
            return false;
        }
        if (this.bluetooth != other.bluetooth) {
            return false;
        }
        if (!Objects.equals(this.tamanho, other.tamanho)) {
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

    public boolean getWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public int getEntradasRAM() {
        return entradasRAM;
    }

    public boolean setEntradasRAM(int entradasRAM) {
        if (entradasRAM >= 0) {
            this.entradasRAM = entradasRAM;
            return true;
        }
        return false;
    }

    public int getEntradasUSB() {
        return entradasUSB;
    }

    public boolean setEntradasUSB(int entradasUSB) {
        if (entradasUSB >= 0) {
            this.entradasUSB = entradasUSB;
            return true;
        }
        return false;
    }

    public int getEntradasPCIExpress() {
        return entradasPCIExpress;
    }

    public boolean setEntradasPCIExpress(int entradasPCIExpress) {
        if (entradasPCIExpress >=0) {
            this.entradasPCIExpress = entradasPCIExpress;
            return true;
        }
        return false;
    }

    public String getTamanho() {
        return tamanho;
    }

    public boolean setTamanho(String tamanho) {
        if (tamanho.isBlank()){
            return false;
        }
        this.tamanho = tamanho;
        return true;
    }

    public boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {

        this.bluetooth = bluetooth;
    }

    @Override
    public String imprimirDados(String imprimir) {
        return super.imprimirDados(imprimir) + ", Wifi: " + wifi + ", Entradas RAM: " + entradasRAM + ", Entradas USB: " + entradasUSB + ", Entradas PCIExpress: " + entradasPCIExpress + ", Tamanho: " + tamanho + ", Bluetooth: " + bluetooth;
    }
    
}

