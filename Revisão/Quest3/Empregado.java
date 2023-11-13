package Revisão.Quest3;

import java.util.List;
import java.util.ArrayList;

public class Empregado {
    String nome;
    String sobrenome;
    double salario;
    List<Empregado> empregados;

    //Construtor das variaveis de Empregado
    public Empregado(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        this.empregados = new ArrayList<>();
    }

    //Construtor do Array
    public Empregado(){
        this.empregados = new ArrayList<>();
    }

    //get's
    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public double getSalario(){
        return salario;
    }

    public List<Empregado> getEmpregados(){
        return empregados;
    }

    //Cadastro
    public void cadEmpregado(String nome, String sobrenome, double salario){
        Empregado cadastro = new Empregado(nome, sobrenome, salario);
        empregados.add(cadastro);
        System.out.println("Cadastro Efetuado");
        
    }

    //Imprimir
    public void imp(){
        if(empregados.isEmpty()){
            System.out.println("Lista de empregados está vazia.");
        }else{
            for(Empregado empregado : empregados){
                System.out.println("Nome: " + empregado.getNome() + " " + empregado.getSobrenome());
                System.out.println("Salário: " + empregado.getSalario());
            }
        }
    }

    //Calculo salário anual
    public double salarioAnual(){
       double result = salario * 12;
       return result;
    }

    //Aumento
    public double aumentoSalario(){
        double aum = (salario * 0.1);
        salario += aum;
        return aum;
    }
}
