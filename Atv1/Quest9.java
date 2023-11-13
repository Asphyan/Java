
/*
Faça um programa que recebe o salário de um colaborador e 
o reajuste segundo o seguinte critério, baseado no salário atual:

a. Salários até R$ 280,00 (incluindo): aumento de 20%;
b. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
c. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
d. Salários de R$ 1500,00 em diante: aumento de 5%

Após o aumento ser realizado; informe na tela:

a. O salário antes do reajuste;
b. O percentual de aumento aplicado;
c. O valor do aumento;
d. O novo salário, após o aumento.  

*/

package Atv1;

import java.util.Scanner;

public class Quest9 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o seu salário: ");
        float sal = scanner.nextFloat();
        
        CalculadoraDeAumento(sal, 280, 700, 1500);
        
        scanner.close();
    }
    
    private static void CalculadoraDeAumento(float sal, int sal_min, int sal_med, int sal_max){
        if(sal <= sal_min){
            
            int reajuste = 20;
            float at = ((reajuste/100.0f) * sal);
            System.out.println("Salário anterior: " + sal);
            System.out.println("Reajuste de " + reajuste + "%" + " = " + "R$" + at);
            System.out.println("Salário + Reajuste = " + "R$" + (sal + at));
            
        } else if(sal_min < sal && sal <= sal_med){
            
            int reajuste = 15;
            float at = ((reajuste/100.0f) * sal);
            System.out.println("Salário anterior: " + sal);
            System.out.println("Reajuste de " + reajuste + "%" + " = " + "R$" + at);
            System.out.println("Salário + Reajuste = " + "R$" + (sal + at));
            
        } else if(sal_med < sal && sal <= sal_max){
            
            int reajuste = 10;
            float at = ((reajuste/100.0f) * sal);
            System.out.println("Salário anterior: " + sal);
            System.out.println("Reajuste de " + reajuste + "%" + " = " + "R$" + at);
            System.out.println("Salário + Reajuste = " + "R$" + (sal + at));
            
        } else {
            
            int reajuste = 5;
            float at = ((reajuste/100.0f) * sal);
            System.out.println("Salário anterior: " + sal);
            System.out.println("Reajuste de " + reajuste + "%" + " = " + "R$" + at);
            System.out.println("Salário + Reajuste = " + "R$" + (sal + at));
            
        }
    }
}
