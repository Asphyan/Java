package Atv3.AlocacaoVeiculos;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        Cliente c = new Cliente();
        c.CadastClient("Laura Castelli", "0564654654", "54513246854");
        Carro car = new Carro();
        car.cadastroCarro("PNB25", "Cinza", 2023, "Flex", 4, 0, "Civic", "Honda");
        Locacao loc = new Locacao();
        loc.carro = car;
        loc.cliente = c;
        loc.valor =  2500;
        loc.dataLocacao = LocalDateTime.of(2023, 10, 25, 12, 15, 25);
        loc.dataDevolucao = LocalDateTime.of(2024, 10, 24, 12, 19, 18);
    }
}
