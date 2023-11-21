
//Elabore um código que ao informar um número, imprima se este número é primo.

package Atv1;

import java.util.Scanner;

public class Quest4 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        
        scanner.close();
        
        boolean primo = true;
        
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                primo = false;
            }
        }
        
        if(primo){
            System.out.println("O número informado é primo!");
        }else{
            System.out.println("O número informado NÃO é primo!");
        }
    }
}


