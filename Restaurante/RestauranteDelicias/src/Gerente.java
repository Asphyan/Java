import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Gerente {
    List<Funcionario> func;
    Scanner scanner = new Scanner(System.in);

    public Gerente(){
        this.func = new ArrayList<>();
    }

    public void cadFuncionario(int id, String nome, int idade, double salario, String cargo){
        Funcionario funCad = new Funcionario(id , nome, idade, salario, cargo);

        func.add(funCad);

        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void contratarFuncionario(){
        System.out.println("Quantos funcionários deseja cadastrar: ");
        int quant = scanner.nextInt();

        for(int i = 0; i < quant; i++){
            
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("\nIdade: ");
            int idade = scanner.nextInt();

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            cadFuncionario(id, nome, idade, salario, cargo);
        }
    }

    public void deletFuncionario(){
        System.out.println("##DELETAR FUNCIONÁRIO##");
        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        boolean deletfunc = false;

        for(Funcionario f : func){
            if(f.getnome().equalsIgnoreCase(nome)){
                func.remove(f);
                deletfunc = true;
                System.out.println("Funcionário demitido!");
                break;
            }
        }

        if(!deletfunc){
            System.out.println("Funcionário não encontrado!");
        }
    }

    public void impFuncionario(){
        for(Funcionario f : func){
            System.out.println("______________________");
            System.out.println("ID: " + f.getid());
            System.out.println("Nome: " + f.getnome());
            System.out.println("Idade: " + f.getsalario());
            System.out.println("Salário: " + f.getsalario());
            System.out.println("Cargo: " + f.getcargo());
            System.out.println("______________________");
        }
    }
}
