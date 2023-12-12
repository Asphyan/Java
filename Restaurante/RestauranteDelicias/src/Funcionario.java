import java.util.Scanner;

public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private double salario;
    private String cargo;
    private int mesas;

    Scanner scanner = new Scanner(System.in);

    //Construtores

    public Funcionario(int id, String nome, int idade, double salario, String cargo){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void mesasAtender(int mesas){
        this.mesas = mesas;
    }

    //Get's

    public int getid(){
        return id;
    }

    public String getnome(){
        return nome;
    }

    public int getidade(){
        return idade;
    }

    public double getsalario(){
        return salario;
    }

    public String getcargo(){
        return cargo;
    }

    public int getmesas(){
        return mesas;
    }
}
