package Atv3.Prog1Aniversario;

import java.util.Scanner;

public class Pessoa {

    int idade;
    String nome;
    int count = 0;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void fazAniversario(){
        count++;
        idade++;
    }

    public void mostrar(){
        System.out.printf("\n##################");
        System.out.printf("\nNome: %s", nome);
        System.out.printf("\nAniversários: +%d", count);
        System.out.printf("\nIdade: %d", idade);
        System.out.printf("\n##################");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.printf("Informe sua idade: ");
        int idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);

        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.mostrar();

        scanner.close();
    }
}
