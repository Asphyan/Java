package Atv3.Quest1Empresa;

public class Funcionario {
    String nome;
    String cpf;
    String nacedate;
    int num;
    double salario;
    String cargo;
    String endereco;

    public Funcionario(String nome, String cpf, String nacedate, int num, float salario, String cargo, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.nacedate = nacedate;
        this.num = num;
        this.salario = salario;
        this.cargo = cargo;
        this.endereco = endereco;
    }

    public String imprimir(){
        return "Nome: " + nome + "\nCPF: " + cpf + "\nData de Nascimento: " + nacedate + "\nTelefone: " + num + "\nSalário: " + salario +
        "\nCargo: " + cargo + "\nEndereço: " + endereco;
    }
}
