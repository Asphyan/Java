public class Livro {
    private String titulo;
    private String autor;
    private String anoPublicacao;

    public Livro(String titulo, String autor, String anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String gettitulo(){
        return titulo;
    }

    public String getautor(){
        return autor;
    }

    public String getanoPublicacao(){
        return anoPublicacao;
    }
}
