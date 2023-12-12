import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Cozinheiro {
    List<Funcionario> coz;
    List<Prato> prep;

    Scanner scanner = new Scanner(System.in);
    Gerente gerente = new Gerente();
    Cardapio pratin = new Cardapio();

    public Cozinheiro(){
        this.coz = new ArrayList<>();
        this.prep = new ArrayList<>();
    }

    public void addCozinheiro(){
        for(Funcionario c : gerente.func){
            if(c.getcargo().equalsIgnoreCase("Cozinheiro")){
                coz.add(c);
            }
        }
    }

    public void cozinharPrato(){
        System.out.println("Informe o nome do prato: ");
        String pratoNome = scanner.nextLine();

        boolean pratoAchado = false;
        for(Prato p : pratin.cardapio){
            if(p.getnomePrato().equalsIgnoreCase(pratoNome)){
                prep.add(p);
                pratoAchado = true;
                System.out.println("Prato colocado na lista de preparo!");
                break;
            }
        }

        if(!pratoAchado){
            System.out.println("Prato não encontrado!");
        }
    }

    public void pratoPronto(){
        System.out.println("Informe o nome do prato pronto: ");
        String pratoPronto = scanner.nextLine();

        boolean pratoEncontrado = false;

        for(Prato p : prep){
            if(p.getnomePrato().equalsIgnoreCase(pratoPronto)){
                prep.remove(p);
                pratoEncontrado = true;
                System.out.println("Prato marcado como pronto!");
                break;
            }
        }

        if(!pratoEncontrado){
            System.out.println("Prato não encontrado na lista de preparo!");
        }
    }

    public void impCozinheiro(){
        for(Funcionario c : coz){
            System.out.println("ID: " + c.getid());
            System.out.println("Nome: " + c.getnome());
            System.out.println("Idade: " + c.getidade());
            System.out.println("Salário: " + c.getsalario());
            System.out.println("Cargo: " + c.getcargo());
        }
    }
}
