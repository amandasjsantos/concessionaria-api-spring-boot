package com.example.HelloSpring.model;

public class Moto extends Veiculo {
    private int cilindrada;
    private String tipoDePartida;

    @Override
    public String toString() {
        return super.toString() + " | Cilindrada: " + cilindrada + " | Tipo de partida: " + tipoDePartida;
    }

    public Moto(String placa, String modelo, int anoDeFabricacao, String cor, double quilometragem, double preco, int cilindrada, String tipoDePartida) {
        super(placa, modelo, anoDeFabricacao, cor, quilometragem, preco);
        this.cilindrada = cilindrada;
        this.tipoDePartida = tipoDePartida;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoDePartida() {
        return tipoDePartida;
    }

    public void setTipoDePartida(String tipoDePartida) {
        this.tipoDePartida = tipoDePartida;
    }
}
