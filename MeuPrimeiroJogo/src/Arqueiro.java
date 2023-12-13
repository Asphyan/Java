public class Arqueiro extends Personagem{
    private String nome = "Arqueiro";
    private double vida = 150;
    private String descricao = "Aquele que irá perfurar seus inimigos.";

    public Arqueiro(String nome, double vida, String descricao) {
        super(nome, vida, descricao);
    }

    public String getNome(){
        return nome;
    }

    public double getVida(){
        return vida;
    }

    public String getDescricao(){
        return descricao;
    }

}
