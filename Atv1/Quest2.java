//Imprima a soma de 1 até 1000.

/* S = [(a1 + an) * n] / 2, sendo:

an é o último termo a ser somado;
a₁ é o primeiro termo da progressão;
n é a quantidade de termos da progressão.

logo: S = [(1 + 1000) * 1000] / 2
*/

package Atv1;

public class Quest2 {
    
    public static void main(String[] args){
        
        int s = 0;
        for(int i = 0; i <= 1000; i++){
            s = (i + s); 
        }
        
        System.out.println(s);
    }
}
