package com.example.HelloSpring.controller;

import com.example.HelloSpring.model.Carro;
import com.example.HelloSpring.model.Moto;
import com.example.HelloSpring.model.Veiculo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VeiculoController {
    private List<Veiculo> veiculos = new ArrayList<>();

    public VeiculoController() {
        // Carros
        veiculos.add(new Carro("MNO7890", "Onix", 2023, "Branco", 8000, 85000, 5, 275));
        veiculos.add(new Carro("ABC1234", "Corolla", 2022, "Prata", 15000, 125000, 5, 470));
        veiculos.add(new Carro("DEF5678", "Civic", 2021, "Preto", 22000, 118000, 5, 450));

        // Motos
        veiculos.add(new Moto("GHI9012", "CB 500", 2023, "Vermelha", 5000, 42000, 500, "Elétrica"));
        veiculos.add(new Moto("JKL3456", "Factor 150", 2020, "Azul", 18000, 17000, 150, "Pedal"));
    }

    @GetMapping("/todos-os-veiculos-cadastrados")
    public List<Veiculo> obterTodosOsVeiculosCadastrados() {
        return veiculos;
    }

    @GetMapping("/carros")
    public List<Carro> obterSomenteOsCarros() {
        List<Carro> carros = new ArrayList<>();

        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Carro) {
                carros.add((Carro) veiculo);
            }
        }
        return carros;
    }

    @GetMapping("/motos")
    public List<Moto> obterSomenteAsMotos() {
        List<Moto> motos = new ArrayList<>();

        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                motos.add((Moto) veiculo);
            }
        }
        return motos;
    }

    @GetMapping("/veiculo-de-maior-preco")
    public Veiculo obterOVeiculoDeMaiorPreco() {
        Veiculo maiorPreco = veiculos.get(0);

        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPreco() > maiorPreco.getPreco()) {
                maiorPreco = veiculo;
            }
        }
        return maiorPreco;
    }

    @GetMapping("/total-de-veiculos-cadastrados")
    public int obterAQuantidadeTotalDeVeiculosCadastrados() {
        return veiculos.size();
    }
}
