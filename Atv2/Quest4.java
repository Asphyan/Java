/*

Faça um programa que:
  - Leia a cotação do dólar
  - Leia um valor em dólares
  - Converta esse valor para Real
  - Mostre o resultado

*/

import java.util.Scanner;

public class Quest4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a cotação atual do dolar: ");
        float dollcot = scanner.nextFloat();
        System.out.printf("\nInforme o valor em dolares a ser convertido em Reais: ");
        float doll = scanner.nextFloat();
        
        float conv = dollcot * doll;
        
        System.out.printf("Conversão = %.2fR$", conv);
        
        scanner.close();
    }
}
