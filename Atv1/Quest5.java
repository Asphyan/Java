
//Imprima os primeiros números da série de Fibonacci até passar de 100.

//Representado pela função Fn = Fn - 1 + Fn - 2

package Atv1;

public class Quest5 {
    
    public static void main(String[] args){
        
        int n1 = 1;
        int n2 = 0;
        
        for(int i = 0; i <= i; i++){
            n1 = n1 + n2;
            n2 = n1 - n2;
            System.out.println(n1);
            if(n1 >= 100){
                break;
            }
        }
    }
}
