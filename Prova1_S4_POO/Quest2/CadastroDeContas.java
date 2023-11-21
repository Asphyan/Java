import java.util.Scanner;

public class CadastroDeContas {
    Scanner ler = new Scanner(System.in);

    Contas[] contas;
    int qtdCadastradas;

    public CadastroDeContas(int max) {
        this.contas = new Contas[max];
        this.qtdCadastradas = 0;
    }

    public boolean cadastrar(int numero, double saldo, String titular) {
        if (qtdCadastradas < contas.length) {
            Contas novaConta = new Contas();
            novaConta.cads(numero, saldo, titular);
            contas[qtdCadastradas] = novaConta;
            qtdCadastradas++;
            return true;
        } else {
            System.out.println("Limite máximo de contas atingido.");
            return false;
        }
    }

    public Contas procurar(int numeroDaConta) {
        System.out.println("Digite o número da conta que deseja procurar: ");
        numeroDaConta = ler.nextInt();
        for (int i = 0; i < qtdCadastradas; i++) {
            if (contas[i] != null && contas[i].getNumero() == numeroDaConta) {
                return contas[i];
            }
        }
        return null;
    }

    public boolean excluir(int numeroDaConta) {
        for (int i = 0; i < qtdCadastradas; i++) {
            if (contas[i] != null && contas[i].getNumero() == numeroDaConta) {
                contas[i] = contas[qtdCadastradas - 1];
                contas[qtdCadastradas - 1] = null;
                qtdCadastradas--;
                return true;
            }
        }
        return false;
    }

    public int qtdCadastradas() {
        return qtdCadastradas;
    }

    public void imp() {
        for (int i = 0; i < qtdCadastradas; i++) {
            System.out.println("Titular: " + contas[i].titular);
            System.out.println("Saldo: " + contas[i].saldo);
            System.out.println("Numero: " + contas[i].numero);
            System.out.println("------------------------");
        }
    }
}