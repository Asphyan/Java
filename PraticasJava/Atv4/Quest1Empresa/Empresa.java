package Atv4.Quest1Empresa;

import java.util.ArrayList;

public class Empresa {
    String cnpj;
    String cidade;
    String uf;
    ArrayList<Funcionario> funcionarios;

    public Empresa(String cnpj, String cidade, String uf){
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.uf = uf;
        funcionarios = new ArrayList<>();
    }

    public void adiciona(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void verificador(Funcionario funcionario){
        funcionarios.contains(funcionario);
    }

    public void percorrer(){
        for(Funcionario funcionario : funcionarios){
            System.out.println("\nDADOS DO FUNCIONÁRIO\n");
            System.out.println(funcionario.imprimir());
        }
    }
}
