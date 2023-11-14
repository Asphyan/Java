public class CadastroMain {
    public static void main(String[] args) {
        CadastroDeContas cad = new CadastroDeContas(10);

        cad.cadastrar(123456789, 456.65, "Maria");
        cad.cadastrar(1234569, 6.65, "Guilherme");
        cad.imp();
    }
}
