public class Mago extends Personagem{
    private String nome = "Mago";
    private double vida = 100;
    private String descricao ="Assumindo a linha de fundo usará suas fortes magias para destruir seus inimigos.";

    public Mago(String nome, double vida, String descricao){
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
