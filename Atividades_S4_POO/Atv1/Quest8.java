
/*
Imprima a seguinte tabela usando fors encadeados:

1
2 4
3 6 9
4 8 12 16

n n*2 n*3 .... n*n

*/

package Atv1;

public class Quest8 {

    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++) {
            for(int j=i;j<=i*i;j+=i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}