public class Cavaleiro extends Personagem{

    private String nome = "Cavaleiro";
    private double vida = 200;
    private String descricao = "Com sua grande defesa fará a linha de frente em batalha sem medo da derrota.";

    public Cavaleiro(String nome, double vida, String descricao) {
        super("Cavaleiro", vida, descricao);
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
