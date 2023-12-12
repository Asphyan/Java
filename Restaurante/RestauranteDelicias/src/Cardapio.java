import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Cardapio {
    List<Prato> cardapio;
    Scanner scanner = new Scanner(System.in);

    //Construtores

    public Cardapio(){
        this.cardapio = new ArrayList<>();
    }

    //Cadastro dos pratos.

    public void cadPrato(String nomePrato, String descricao, double preco){
        Prato pratoCad = new Prato(nomePrato, descricao, preco);

        cardapio.add(pratoCad);

        System.out.println("Prato cadastrado com sucesso!");
    }

    //Inserindo pratos.

    public void addPrato(){
        System.out.println("Quantos pratos deseja adicionar: ");
        int quant = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < quant; i++){
            System.out.println("Nome do prato: ");
            String nomePrato = scanner.nextLine();

            System.out.println("Descrição do prato: ");
            String descricao = scanner.nextLine();

            System.out.println("Preço do prato: ");
            double preco = scanner.nextDouble();

            cadPrato(nomePrato, descricao, preco);
        }
    }

    public void deletPrato(){
        System.out.println("Nome do prato que deseja deletar: ");
        String nomePrato = scanner.nextLine();

        boolean prato = false;
        for(Prato p : cardapio){
            if(p.getnomePrato().equalsIgnoreCase(nomePrato)){
                cardapio.remove(p);
                prato = true;
                System.out.println("Prato deletado com sucesso!");
                break;
            }
        }

        if(!prato){
            System.out.println("Prato não encontrado!");
        }
    }

    public void impPrato(){
        for(Prato p : cardapio){
            System.out.println("___________________");
            System.out.println("Nome: " + p.getnomePrato());
            System.out.println("Descrição: " + p.getdescricao());
            System.out.println("Preço: " + p.getpreco());
            System.out.println("___________________");
        }
    }
}