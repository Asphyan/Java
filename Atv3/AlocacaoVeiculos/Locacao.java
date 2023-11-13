package Atv3.AlocacaoVeiculos;

import java.time.LocalDateTime;

public class Locacao {
    Carro carro;
    LocalDateTime dataLocacao;
    LocalDateTime dataDevolucao;
    double valor;
    Cliente cliente;

    public void imprimirLocacao(){
        System.out.println("***Locação de Veículos***");
        System.out.println("Modelo: " + this.carro.modelo);
        System.out.println("Placa: " + this.carro.placa);
        System.out.println("Cor: " + this.carro.cor);
        System.out.println("Ano: " + this.carro.ano);
        System.out.println("Cliente: " + this.cliente.nome);
        System.out.println("Data de Locação:" + this.dataLocacao.toString());
        System.out.println("Data Devolução: " + this.dataDevolucao.toString());
        System.out.println("Valor a pagar: " + this.valor);
    }
}
