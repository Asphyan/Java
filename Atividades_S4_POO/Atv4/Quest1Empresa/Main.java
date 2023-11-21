package Atv4.Quest1Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa emp = new Empresa("32.468.468/9851-89", "Icózin", "Ceará");

        Funcionario fun1 = new Funcionario("Guilherme", "658.584.698-01", "16/10/2003", 993210216, 157845, "Programador", "Iguatu-CE");
        Funcionario fun2 = new Funcionario("André", "828.624.587-51", "10/01/2004", 99898216, 17825, "Programador Sênior", "Icózin-CE");

        emp.adiciona(fun1);
        emp.adiciona(fun2);

        emp.percorrer();
    }
}
