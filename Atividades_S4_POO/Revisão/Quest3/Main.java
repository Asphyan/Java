package Revisão.Quest3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empregado cad = new Empregado();

        cad.cadEmpregado("Guilherme", "Bandeira", 200.54);
        cad.cadEmpregado("Eduarda", "Ferreira", 200.87);

        List<Empregado> empregados = cad.getEmpregados();

        cad.imp();
        
        for(Empregado emp : empregados){
            double anual = emp.salarioAnual();
            System.out.println(emp.getNome());
            System.out.println("Salário anual: " + anual);
        }

        for(Empregado emp : empregados){
            double aum = emp.aumentoSalario();
            System.out.println("Nome: " + emp.getNome());
            System.out.printf("Aumento: %.3f\n", aum);
        }

        cad.imp();
    }
}
