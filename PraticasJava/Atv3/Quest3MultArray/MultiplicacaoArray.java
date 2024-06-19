package Atv3.Quest3MultArray;

public class MultiplicacaoArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,4};
        int[] result = new int[array1.length]; 
        // Cria um array com o mesmo tamanho do array1 para armazenar os resultados da multiplicação.
        // Lembrar Guilherme do futuro de criar um if para garantir que os arrays são do mesmo tamanho.

        for(int i = 0; i < array1.length; i++){
            result[i] = array1[i] * array2[i];
        }

        for(int i = 0; i < result.length; i++){
            System.out.printf("%d ",result[i]);
        }
    }
}