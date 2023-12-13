public class Espada extends Armas{
    private String nome;
    private double dano;
    private String descricao;

    public Espada(String nome, double dano, String descricao){
        super(nome, dano, descricao);
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
