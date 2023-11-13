/*
Escreva um programa Java console que lê um valor inteiro e simule o comportamento de um caixa eletrônico, ou seja, 
calcule qual o menor número possível de notas de 100, 50, 10, 5 e 1 em que o valor a ser sacado pode ser decomposto. 
Seu programa deverá exibir uma saída parecida com:

Informe o valor do saque (valor inteiro): 139 
O valor do saque pode ser expresso em: 
1 notas de 100 
0 notas de 50 
3 notas de 10 
1 notas de 5 
4 notas de 1 
*/

import java.util.Scanner;

public class Quest7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o valor do saque (Valor inteiro): ");
        int saque = scanner.nextInt();

        int cemnotas = (saque/100);
        int cemresto = saque % 100;

        int cinquentanotas = cemresto / 50;
        int cinquentaresto = cemresto % 50;

        int deznotas = cinquentaresto / 10;
        int dezresto = cinquentaresto % 10;

        int cinconotas = dezresto / 5;
        int umnotas = dezresto % 5;

        System.out.printf("\nNotas de 100 - %d\n", cemnotas);
        System.out.printf("Notas de 50 - %d\n", cinquentanotas);
        System.out.printf("Notas de 10 - %d\n", deznotas);
        System.out.printf("Notas de 5 - %d\n", cinconotas);
        System.out.printf("Notas de 1 - %d\n", umnotas);


        scanner.close();
    }
}
