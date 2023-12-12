public class Prato {
    private String nomePrato;
    private String descricao;
    private double preco;

    public Prato(String nomePrato, String descricao, double preco){
        this.nomePrato = nomePrato;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getnomePrato(){
        return nomePrato;
    }

    public String getdescricao(){
        return descricao;
    }

    public double getpreco(){
        return preco;
    }

}
