import java.util.Scanner;

public class test1037 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float entrada = scanner.nextFloat();

        if(0 <= entrada && entrada <= 25){
            System.out.println("Intervalo [0,25]");
        }else if(25 < entrada && entrada <= 50){
            System.out.println("Intervalo (25,50]");
        }else if(50 < entrada && entrada <= 75){
            System.out.println("Intervalo (50,75]");
        }else if(75 < entrada && entrada <= 100){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }

        scanner.close();
    }
}
