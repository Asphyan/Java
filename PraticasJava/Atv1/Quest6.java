
//Imprima os fatoriais de 1 a 10.

/*
O fatorial de um número é a multiplicação desse número 
por todos os seus antecessores maiores que zero.
*/

package Atv1;

public class Quest6 {
    
    public static void main(String[] args){
        
        for(int i = 1; i <= 10; i++){
            int x = 1;
            for(int z = 1; z <= i; z++){
                x *= z;
            }
            System.out.println("Fatorial de " + i + "!" + " = " + x);
        }
    }
}
