public class Armas {
    private String nome;
    private double dano;
    private String descricao;

    public Armas(String nome, double dano, String descricao){
        this.nome = nome;
        this.dano = dano;
        this.descricao = descricao;
    }

    public String getNome(){
        return nome;
    }

    public double getDano(){
        return dano;
    }

    public String getDescricao(){
        return descricao;
    }
}
