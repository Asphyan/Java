import java.util.Scanner;

public class test1018 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int valorimut = valor;

        int[] notas = {100, 50, 20, 10 ,5 ,2 ,1};
        int[] quantnotas =  new int[notas.length];

        for(int i = 0; i < notas.length; i++){
            if(valor >= notas[i]){
                quantnotas[i] = valor / notas[i];
                valor = valor % notas[i];
            }
        }
        System.out.println(valorimut);
        for(int i = 0; i < notas.length; i++){
            System.out.println(quantnotas[i] + " nota(s) de R$ " + notas[i] + ",00");
        }

        scanner.close();
    }
}
