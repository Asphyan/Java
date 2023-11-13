package Revisão.Quest2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CadastroInfo cad = new CadastroInfo();

        cad.cadastrarFatura("FT 20231/11", "Bonecas", 2, 51.65);
        cad.cadastrarFatura("FT 20232/09", "Carro de Brinquero", 10, 12.58);

        cad.imprimir();

        List<Fatura> faturas = cad.getFatura();

        for(Fatura fatura : faturas){
            double total = fatura.totalFatura();
            System.out.println("Número: " + fatura.getNumero());
            System.out.println("Total: " + total);
        }
    }
}
