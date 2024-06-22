package Atv3.Quest2Comparacao;

import java.util.Scanner;

public class ComparacaoDeValores {
    Scanner scanner = new Scanner(System.in);
    int[] arrayInteiros1;
    int[] arrayInteiros2;
    int totaliguais = 0;


    public void criandoArray1(){
        //Input para usuário informar o tamanho e os valores do array.
        System.out.printf("Informe o tamanho do array N°1: ");
        int quant = scanner.nextInt();

        arrayInteiros1 = new int[quant];

        for(int i = 0; i < quant; i++){
            System.out.printf("Digite o %d° número: ", i+1);
            int input = scanner.nextInt();
            arrayInteiros1[i] = input;
        }
    }

    public void criandoArray2(){
        //Input para usuário informar o tamanho e os valores do array.
        System.out.printf("Informe o tamanho do array N°2: ");
        int quant = scanner.nextInt();

        arrayInteiros2 = new int[quant];

        for(int i = 0; i < quant; i++){
            System.out.printf("Digite o %d° número: ", i+1);
            int input = scanner.nextInt();
            arrayInteiros2[i] = input;
        }
    }

    public void totalPares(){
        //Verifica os números pares dentro dos arrays.
        System.out.printf("\nInforme o array que deseja verificar o total de números pares: ");
        int array = scanner.nextInt();
        
        if(array == 1){
            int count = 0;
            for(int i = 0; i < arrayInteiros1.length; i++){
                if(arrayInteiros1[i] % 2 == 0){
                    count++;
                }
            }
            System.out.println("O total de números pares no Array é: " + count);
        }else if (array == 2){
            int count = 0;
            for(int i = 0; i < arrayInteiros2.length; i++){
                if(arrayInteiros2[i] % 2 == 0){
                    count++;
                }
            }
            System.out.println("O total de números pares no Array é: " + count);
        }
    }

    public void maiorValor(){
        //Verifica dentro dos arrays qual é o maior valor.
        System.out.printf("\nInforme o array que deseja verificar qual é o maior valor: ");
        int array = scanner.nextInt();

        if(array == 1){
            //Cria uma variável 'max' para iniciar a comparação do indice 0 do array;
            int max = arrayInteiros1[0];
            for(int i = 0; i < arrayInteiros1.length; i++){
                if(max < arrayInteiros1[i]){
                    max = arrayInteiros1[i];
                }
            }
            System.out.println("O maior valor no Array é: " + max);
        }else if(array == 2){
            int max = arrayInteiros2[0];
            for(int i = 0; i < arrayInteiros2.length; i++){
                if(max < arrayInteiros2[i]){
                    max = arrayInteiros2[i];
                }
            }
            System.out.println("O maior valor no Array é: " + max);
        }
    }

    public void totalIguais(){
        totaliguais = 0;
        for(int it1 : arrayInteiros1){
            for(int it2 : arrayInteiros2){
                if(it1 == it2){
                    totaliguais++;
                }
            }
        }
        System.out.println("\nTotal de números iguais entre os dois array's: " + totaliguais);
    }
}