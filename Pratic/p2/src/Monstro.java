public class Monstro {
    private String nome;
    private double vida;
    private double escudo;
    private int nivel;
    private double xp;
    private String descricao;

    public Monstro(String nome, double vida,double escudo, int nivel, double xp, String descricao){
        this.nome = nome;
        this.vida = vida;
        this.escudo = escudo;
        this.nivel = nivel;
        this.xp = xp;
        this.descricao = descricao;
    }

    //gets

    public String getNomeM(){
        return nome;
    }

    public double getVidaM(){
        return vida;
    }

    public double getEscudoM(){
        return escudo;
    }

    public int getNivelM(){
        return nivel;
    }

    public double getXpM(){
        return xp;
    }

    public String getdescricaoM(){
        return descricao;
    }

    //sets

    public void setVidaM(double vida){
        this.vida = vida;
    }

    public void setEscudoM(double escudo){
        this.escudo = escudo;
    }

    public void setNivelM(int nivel){
        this.nivel = nivel;
    }

    public void setXpM(double xp){
        this.xp = xp;
    }
}
