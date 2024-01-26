package Armas;
public class Armas {

    //variáveis encapsuladas (private)
    
    private String h1nome;
    private double h1dano;
    private String h2nome;
    private double h2dano;
    private String nome;

    //construtor

    public Armas(String nome, String h1nome, double h1dano, String h2nome, double h2dano){
        this.nome = nome;
        this.h1nome =h1nome;
        this.h1dano = h1dano;
        this.h2nome = h2nome;
        this.h2dano = h2dano;
    }

    //get's

    public String getNomeArma(){
        return nome;
    }

    public String getNomeH1(){
        return h1nome;
    }

    public double getDanoHb1(){
        return h1dano;
    }

    public String getNomeH2(){
        return h2nome;
    }

    public double getDanoHb2(){
        return h2dano;
    }

    //set's

    public void SetDanoHb1(double h1dano){
        this.h1dano = h1dano;
    }

    public void SetDanoHb2(double h2dano){
        this.h2dano = h2dano;
    }
}
