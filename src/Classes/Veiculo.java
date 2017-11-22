/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Hamil
 */
public class Veiculo {
    
    private String placa;
    private String tipoDeEntrega;
    private double precoKm;
    private int tipoVeiculo;
    private double volume;
    Entrega entrega;
    Motorista motorista;

    public Veiculo(String placa, String tipoDeEntrega, double precoKm, int tipoVeiculo, double volume, Entrega entrega, Motorista motorista) {
        this.placa = placa;
        this.tipoDeEntrega = tipoDeEntrega;
        this.precoKm = precoKm;
        this.tipoVeiculo = tipoVeiculo;
        this.volume = volume;
        this.entrega = entrega;
        this.motorista = motorista;
    }

    public Veiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoDeEntrega() {
        return tipoDeEntrega;
    }

    public void setTipoDeEntrega(String tipoDeEntrega) {
        this.tipoDeEntrega = tipoDeEntrega;
    }

    public double getPrecoKm() {
        return precoKm;
    }

    public void setPrecoKm(double precoKm) {
        this.precoKm = precoKm;
    }

    public int getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(int tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    
}
