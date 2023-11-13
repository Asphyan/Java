/*
Um hotel com 42 apartamentos resolveu fazer promoções para os fins de semana fora da alta temporada, isto é, 
nos meses de abril, maio, junho, agosto, setembro, outubro e novembro. 
A taxa da promoção é de 22% da diária normal. A ocupação média do hotel sem promoção é de 40%. 
A expectativa é aumentar a taxa de ocupação para 70%. Supondo que as expectativas se confirmem, 
escrever um algoritmo que lê a diária normal, que calcule e escreva as seguintes informações: 

(a) O valor da diária no período da promoção. 
(b) O valor médio arrecadado sem a promoção, durante um mês. 
(c) O valor médio arrecadado com a promoção, durante um mês. 
(d) O lucro ou prejuízo mensal com a promoção. 
 */

import java.util.Scanner;

public class Quest8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da diária normal
        System.out.print("Informe o valor da diária normal: ");
        double diariaNormal = scanner.nextDouble();

        // Taxa de promoção (22%)
        double taxaPromocao = 0.22;

        // Ocupação média sem promoção (40%)
        double ocupacaoMediaSemPromocao = 0.40;

        // Ocupação alvo com promoção (70%)
        double ocupacaoAlvoComPromocao = 0.70;

        // (a) Valor da diária no período da promoção
        double diariaPromocao = diariaNormal * (1 - taxaPromocao);

        // (b) Valor médio arrecadado sem a promoção, durante um mês
        double valorArrecadadoSemPromocao = diariaNormal * ocupacaoMediaSemPromocao * 30;

        // (c) Valor médio arrecadado com a promoção, durante um mês
        double valorArrecadadoComPromocao = diariaPromocao * ocupacaoAlvoComPromocao * 30;

        // (d) Lucro ou prejuízo mensal com a promoção
        double lucroOuPrejuizo = valorArrecadadoComPromocao - valorArrecadadoSemPromocao;

        System.out.printf("(a) O valor da diária no período da promoção: R$%e", diariaPromocao);
        System.out.printf("(b) O valor médio arrecadado sem a promoção, durante um mês: R$%e", valorArrecadadoSemPromocao);
        System.out.printf("(c) O valor médio arrecadado com a promoção, durante um mês: R$%e", valorArrecadadoComPromocao);
        System.out.printf("(d) O lucro ou prejuízo mensal com a promoção: R$%e", lucroOuPrejuizo);

        scanner.close();
    }
}