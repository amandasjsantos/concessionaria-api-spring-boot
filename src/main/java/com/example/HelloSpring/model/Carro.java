package com.example.HelloSpring.model;

public class Carro extends Veiculo {
    private int qtdDeLugares;
    private int capacidadeDoPortaMalas;

    @Override
    public String toString() {
        return super.toString() + " | Quantidade de lugares: " + qtdDeLugares + " | Capacidade do porta-malas: " + capacidadeDoPortaMalas;
    }

    public Carro(String placa, String modelo, int anoDeFabricacao, String cor, double quilometragem, double preco, int qtdDeLugares, int capacidadeDoPortaMalas) {
        super(placa, modelo, anoDeFabricacao, cor, quilometragem, preco);
        this.qtdDeLugares = qtdDeLugares;
        this.capacidadeDoPortaMalas = capacidadeDoPortaMalas;
    }

    public int getQtdDeLugares() {
        return qtdDeLugares;
    }

    public void setQtdDeLugares(int qtdDeLugares) {
        this.qtdDeLugares = qtdDeLugares;
    }

    public int getCapacidadeDoPortaMalas() {
        return capacidadeDoPortaMalas;
    }

    public void setCapacidadeDoPortaMalas(int capacidadeDoPortaMalas) {
        this.capacidadeDoPortaMalas = capacidadeDoPortaMalas;
    }
}
