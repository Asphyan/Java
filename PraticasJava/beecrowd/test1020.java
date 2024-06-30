import java.util.Scanner;

public class test1020 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int dias =  scanner.nextInt();

        int anos = dias/365;
        int meses = (dias%365) / 30;
        int diasrestantes = (dias % 365) % 30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, diasrestantes);

        scanner.close();
    }
}
