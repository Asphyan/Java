/*
Escreva um programa Java console que leia um número de 3 dígitos e o inverta, escrevendo o número lido e o invertido.
Por exemplo, se o usuário informar o valor 753, seu programa deverá invertê-lo, resultando em 357. 
Seu programa deverá exibir a seguinte saída:

Informe um valor inteiro de três dígitos: 753 
O valor original é: 753
O valor invertido é: 357 

 */


import java.util.Scanner;

public class Quest9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe um valor inteiro de 3 digitos: ");
        String valor =  scanner.nextLine();

        StringBuilder strb = new StringBuilder(valor); //StringBuilder é usado para obter a string em ordem inversa.
        valor = strb.reverse().toString();
        /*
         * toString é usado para obter o objeto string do objeto StringBuilder e 
         * o método reverse() da classe StringBuilder.
         */
        System.out.println(valor);
        scanner.close();
    }
}
