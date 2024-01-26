import java.util.Scanner;

import Armas.Arco;
import Armas.Cajado;
import Armas.Espada;
import Personagens.Arqueiro;
import Personagens.Cavaleiro;
import Personagens.Mago;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Personagens.

        Cavaleiro cavaleiro = new Cavaleiro("Cavaleiro", 200, "Um forte guerreiro que fará a frente na batalha.");
        Arqueiro arqueiro = new Arqueiro("Arqueiro", 150, "Com sua agilidade e flechas precisas será causará grandes quantidades de dano.");
        Mago mago = new Mago("Mago", 100, "Mesmo com sendo frágil, ele é capaz de obliterar seus inimigos com suas fortes magias.");

        //Armas.

        Espada espada = new Espada("Excalibur", "Estocada", 10, "Corte de luz", 20);
        Arco arco = new Arco("Arco Runico", "Flecha de fogo", 25, "Triple Shot", 35);
        Cajado cajado = new Cajado("Cajado Arcano", "Bola de Fogo", 50, "Cristais de Gelo", 40);

        int x = 2;
        while(x != 0){
            System.out.println("1 - Começar Jogo.");
            System.out.println("0 - Encerrar.");
            System.out.print("\nDigite aqui: ");
            x = scanner.nextInt();

            if(x == 1){
                System.out.println("Bem vindo a escolha de personagem!\n");
                System.out.println("Personagem - 1");
                System.out.println("____________________");
                System.out.println("Nome: " + cavaleiro.getNome());
                System.out.println("Vida: " + cavaleiro.getVida());
                System.out.println("Descrição: " + cavaleiro.getDescricao());
                System.out.println("____________________");
                System.out.println("Personagem - 2");
                System.out.println("____________________");
                System.out.println("Nome: " + arqueiro.getNome());
                System.out.println("Vida: " + arqueiro.getVida());
                System.out.println("Descrição: " + arqueiro.getDescricao());
                System.out.println("____________________");
                System.out.println("Personagem - 3");
                System.out.println("____________________");
                System.out.println("Nome: " + mago.getNome());
                System.out.println("Vida: " + mago.getVida());
                System.out.println("Descrição: " + mago.getDescricao());
                System.out.println("____________________");
                System.out.println("\nPlayer 1 escolha um dos personagens acima: ");
            }
        }
    }
}
