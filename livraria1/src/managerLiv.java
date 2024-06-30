
import java.util.ArrayList;
import java.util.Scanner;

public class managerLiv{
    ArrayList<livro> livros = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void cadliv(){
        System.out.print("Quantos livros deseja cadastrar: ");
        int quant = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < quant; i++){
            System.out.print("\nTítulo: ");
            String titulo = scanner.nextLine();
            System.out.print("\nGênero: ");
            String genero = scanner.nextLine();
            System.out.print("\nLançamento: ");
            String lancamento = scanner.nextLine();

            livro livro = new livro(titulo, genero, lancamento);
            livros.add(livro);
        }

        System.out.println("\nLivros cadastrados com sucesso!");
    }

    public void impliv(){
        for(livro livro : livros){
            System.out.print("_________________");
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Gênero: " + livro.getGenero());
            System.out.println("Lançamento: " + livro.getLancamento());
            System.out.print("_________________");
        }
    }
}