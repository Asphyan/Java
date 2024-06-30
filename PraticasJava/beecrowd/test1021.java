import java.util.Scanner;
import java.util.Locale;

public class test1021{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float valor = scanner.nextFloat();
        int valorint = (int) (valor*100);

        //calculando notas
        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] quantnotas = new int[notas.length];

        for(int i = 0; i < notas.length; i++){
            if(valorint >= notas[i]){
                quantnotas[i] = valorint / notas[i];
                valorint = valorint % notas[i];
            }
        }

        //calculando moedas
        int[] moedas = {100, 50, 25, 10, 5, 1};
        int[] quantmoedas = new int[moedas.length];

        for(int i = 0; i < moedas.length; i++){
            if(valorint >= moedas[i]){
                quantmoedas[i] = valorint / moedas[i];
                valorint = valorint % moedas[i];
            }
        }

        System.out.println("NOTAS:");
        for(int i = 0; i < notas.length; i++){
            System.out.println(quantnotas[i] + " nota(s) de R$ " + (notas[i]/100) + ".00");
        }

        System.out.println("MOEDAS:");
        for(int i = 0; i < moedas.length; i++){
            System.out.println(quantmoedas[i] + " moeda(s) de R$ " + String.format(Locale.US, "%.2f",moedas[i] / 100.0));
        }

        scanner.close();
    }
}