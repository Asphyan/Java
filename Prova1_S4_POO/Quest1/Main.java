public class Main {
    public static void main(String[] args) {
        AgendaMedica cad = new AgendaMedica();

        cad.cadastro();
        cad.cadastro();
        cad.cadastro();
        cad.verificadorNome("Duda");
        cad.verificadorHorario("13:00");
    }
}
