package Personagens;

public class Personagem {

    //variáveis encapsuladas (private)

    private double vida;
    private String nome;
    private String descricao;

    //construtor

    public Personagem(String nome, double vida, String descricao){
        this.nome = nome;
        this.vida = vida;
        this.descricao = descricao;
    }

    //get's

    public double getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    //set's

    public void setVida(double vida) {
        this.vida = vida;
    }
}
