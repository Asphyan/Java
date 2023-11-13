
/*
Escreva um programa em que, dada uma variável x com algum valor inteiro, 
temos um novo x de acordo com a seguinte regra:

Se x é par, x = x / 2 ;
Se x é impar, x = 3 * x + 1 ;
Imprime x ;

*/
package Atv1;

import java.util.Scanner;

public class Quest7 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número diferente de 1 e 0: ");
        int x = scanner.nextInt();
        
        scanner.close();
        
        while(x != 1){
            if(x % 2 == 0){
                x = x / 2;
                System.out.println(x);
            }else{
                x = 3 * x + 1;
                System.out.println(x);
            }
        }
    }
}
