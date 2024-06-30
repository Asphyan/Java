public class livro {
    private String titulo;
    private String genero;
    private String lancamento;

    //construtor

    public livro(String titulo, String genero, String lancamento){
        this.titulo = titulo;
        this.genero = genero;
        this.lancamento = lancamento;
    }

    //getters

    public String getTitulo(){
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public String getLancamento(){
        return lancamento;
    }

    //setters

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setLancamento(String lancamento){
        this.lancamento = lancamento;
    }
}