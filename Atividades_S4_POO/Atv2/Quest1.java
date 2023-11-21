/*
Elabore um programa que leia um número (1 a 9) e imprima a tabuada desse número.
*/

import java.util.Scanner;

public class Quest1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int z;
            
        System.out.print("Digite um número inteiro: ");
        int x = scanner.nextInt();
            
        for(int i = 0; i <= 9; i++){
            z = x * i;
            System.out.printf("%d * %d = %d\n", x, i, z);
        }
        scanner.close();
    }
}
