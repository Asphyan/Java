/*
Escreva um programa Java console que receberá a duração de um evento expresso em segundos e 
exiba-o expresso em horas, minutos e segundos. Seu programa deverá exibir uma saída parecida com:
Informe a duração do evento em segundos: 3712 
Duração do evento: 01:01:52 

*/

import java.util.Scanner;

public class Quest6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a duração do evento em segundos para convesão: ");
        int temp = scanner.nextInt();

        int h = temp/3600;
        int min = (temp % 3600) / 60;
        int s = temp % 60;

        System.out.printf("\n%dh %dmin %ds", h, min, s);

        scanner.close();
        }
}
