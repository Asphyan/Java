import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Garcon {

    List<Funcionario> gar;

    Scanner scanner = new Scanner(System.in);
    Gerente gerente = new Gerente();

    public Garcon(){
        this.gar = new ArrayList<>();
    }

    public void addGarcon(){
        for(Funcionario g : gerente.func){
            if(g.getcargo().equalsIgnoreCase("Garçon")){
                gar.add(g);
            }
        }

        System.out.println("Garçons adicionados com sucesso a lista!");
    }

    public void addmesas(){
        System.out.println("Nome do funcionário: ");
        String nome = scanner.nextLine();

        boolean garAchado = false;

        for(Funcionario g : gar){
            if(g.getnome().equalsIgnoreCase(nome)){
                System.out.println("Informe a quantidade de mesas: ");
                int mesas = scanner.nextInt();
                g.mesasAtender(mesas);
                garAchado = true;
                System.out.println("Mesas adicionadas com sucesso!");
                break;
            }
        }

        if(!garAchado){
            System.out.println("Garçom não encontrado!");
        }
    }

    public void impGarcons(){
        for(Funcionario f : gar){
            System.out.println("___________________");
            System.out.println("ID: " + f.getid());
            System.out.println("Nome: " + f.getnome());
            System.out.println("Idade: " +  f.getsalario());
            System.out.println("Salário: " + f.getsalario());
            System.out.println("Cargo: " + f.getcargo());
            System.out.println("___________________");
        }
    }
}