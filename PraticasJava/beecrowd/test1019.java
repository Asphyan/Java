import java.util.Scanner;

public class test1019 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int segundos = scanner.nextInt();

        int horas = segundos/3600;
        int minutos = (segundos % 3600) / 60;
        int segundosrestantes = segundos % 60;

        System.out.printf("%d:%d:%d", horas, minutos, segundosrestantes);

        scanner.close();
    }
}
