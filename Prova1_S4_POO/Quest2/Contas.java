public class Contas {
    int numero;
    double saldo;
    String titular;

    public void cads(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }
}