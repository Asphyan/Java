import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorLivros {
    int quant;

    Scanner scanner = new Scanner(System.in);
    List<Livro> livros;

    public GerenciadorLivros(){
        this.livros = new ArrayList<>();
    }

    public List<Livro> getLivros(){
        return livros;
    }

    public void cadastroManual(){
        System.out.print("Quantos livros deseja cadastrar? -> ");
        quant = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < quant; i++){
            System.out.print("\nTítulo: ");
            String titulo = scanner.nextLine();
            System.out.print("\nAutor: ");
            String autor = scanner.nextLine();
            System.out.print("\nAno de Publicação: ");
            String anoPublicacao = scanner.nextLine();

            cadLivros(titulo, autor, anoPublicacao);
        }
    }
    
    public void cadLivros(String titulo, String autor, String anoPublicacao){
        Livro livroCad = new Livro(titulo, autor, anoPublicacao);

        livros.add(livroCad);

        System.out.println("Livro cadastrado com sucesso!");
    }

    public void deletLivros(){
        System.out.print("Titulo que deseja remover: ");
        String titulo = scanner.nextLine();

        boolean livroBuscado = false;
        for(Livro l : livros){
            //'equalIgnoreCase' fará com que seja ignorado letras minúsculas e maiúsculas na busca.
            if(l.gettitulo().equalsIgnoreCase(titulo)){
                livros.remove(l);
                livroBuscado = true;
                System.out.print("Livro deletado!\n\n");
                break;
            }
        }

        if(!livroBuscado){
            System.out.print("Livro não encontrado.");
        }
    }

    public void buscadorTitulo(){
        System.out.print("\n##Buscador por títulos##\n");
        System.out.print("Titulo buscado: ");
        String titulo = scanner.nextLine();

        boolean livroBuscado = false;

        for(Livro l : livros){
            if(l.gettitulo().equalsIgnoreCase(titulo)){
                System.out.println("##Livro encontrado##\n");
                System.out.println("Título: " + l.gettitulo());
                System.out.println("Autor: " + l.getautor());
                System.out.println("Ano de Publicação: " + l.getanoPublicacao());
                livroBuscado = true;
            }
        }

        if(!livroBuscado){
            System.out.println("Livro não encontrado.");
        }
    }

    public void impLivros(){
        if(livros.isEmpty()){
            System.out.println("A lista está vazia.");
        }

        for(Livro l : livros){
            System.out.println("______________________");
            System.out.println("Título: " + l.gettitulo());
            System.out.println("Autor: " + l.getautor());
            System.out.println("Ano de publicação: " + l.getanoPublicacao());
            System.out.println("______________________");
        }
    }
}
