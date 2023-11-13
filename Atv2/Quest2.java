/*
Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
A fórmula de conversão de temperatura a ser utilizada é:

F = (9 * C + 160) / 5
*/

import java.util.Scanner;

public class Quest2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma temperatura em graus C°: ");
        float c = scanner.nextFloat();
        
        float f = (9 * c + 160) / 5;
        
        System.out.printf("A temperatura informada convertida em Fahrenheit = %.2f", f);

        scanner.close();
    }
}
