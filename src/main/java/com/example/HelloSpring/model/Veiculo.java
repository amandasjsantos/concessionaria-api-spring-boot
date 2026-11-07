package com.example.HelloSpring.model;

public abstract class Veiculo {
    private String placa;
    private String modelo;
    private int anoDeFabricacao;
    private String cor;
    private double quilometragem;
    private double preco;

    @Override
    public String toString() {
        return "Placa: " + placa + " | Modelo: " + modelo + " | Ano de fabricação: " + anoDeFabricacao + " | Cor: " + cor + " | Quilometragem: " + quilometragem + " | Preço: R$ " + preco;
    }

    public Veiculo(String placa, String modelo, int anoDeFabricacao, String cor, double quilometragem, double preco) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
