import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorLivros gr = new GerenciadorLivros();

        Scanner scanner = new Scanner(System.in);

        boolean cd = true;

        while(cd){
            System.out.println("##Gerenciador de Livros##\n");

            System.out.println("1 - Cadastro");
            System.out.println("2 - Exclusão");
            System.out.println("3 - Pesquisa");
            System.out.println("4 - Imprimir todos os cadastros");
            System.out.println("5 - Encerrar");
            System.out.print("\n\nEscolha uma das opções acima: ");
            int op = scanner.nextInt();

            if(op == 1){
                gr.cadastroManual();
            }
            if(op == 2){
                gr.deletLivros();
            }
            if(op == 3){
                gr.buscadorTitulo();
            }
            if(op == 4){
                gr.impLivros();
            }
            if(op == 5){
                cd = false;
            }
        }
        scanner.close();
    }
}
