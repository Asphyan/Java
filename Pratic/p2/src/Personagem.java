public class Personagem {
    private String nome;
    private double vida;
    private int nivel;
    private double escudo;
    private String descricao;

    //construtor

    public Personagem (String nome, double vida, double escudo, String descricao){
        this.nome = nome;
        this.vida = vida;
        this.escudo = escudo;
        this.descricao = descricao;
    }

    //gets

    public String getNome(){
        return nome;
    }

    public double getVida(){
        return vida;
    }

    public double getNivel(){
        return nivel;
    }

    public double getEscudo(){
        return escudo;
    }

    public String getDescricao(){
        return descricao;
    }

    //sets

    public void setVida(double vida){
        this.vida = vida;
    }

    public void setEscudo(double escudo){
        this.escudo = escudo;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }
}
