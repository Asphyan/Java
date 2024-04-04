//Imprima todos os múltiplos de 3, entre 1 e 100.

package Atv1;

public class Quest3{
    
    public static void main(String[] args){
        
        int x = 3;
        int m;
        
        for(int i = 1; i <= 100; i++){
            m = x * i;
            System.out.println( x + " * " + i + " = " + m);
        }
    }
}
