/*
Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem,
utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo,
o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
Desta forma, será possível obter a distância percorrida com a fórmula:

DISTANCIA = TEMPO * VELOCIDADE.

Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula:

LITROS_USADOS = DISTANCIA / 12.

O programa deve apresentar os valores da velocidade média, tempo gasto, 
a distância percorrida e a quantidade de litros utilizada na viagem.
Dica: trabalhe com valores reais.
*/

import java.util.Scanner;

public class Quest3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a tempo da viagem em Horas: ");
        double temp = scanner.nextDouble();
        
        System.out.print("\nInforme a velocidade média em Km/h: ");
        double vel = scanner.nextDouble();
        
        double dist = temp*vel;
        
        double gas = dist/12;
        
        System.out.printf("\nA quantidade de combustivel consumida por 12Km / Litro = %.2f\n", gas);
        System.out.printf("A velocidade média = %.2fKm/h\n", vel);
        System.out.printf("A distância percorrida = %.2fKm", dist);

        scanner.close();
    }
}
