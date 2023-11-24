package ClienteServidor.HeapsortHeapmax;

public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Constrói um heap máximo
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extrai elementos do heap um por um
        for (int i = n - 1; i >= 0; i--) {
            // Move a raiz (maior elemento) para o fim do array
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Chama heapify na subárvore reduzida
            heapify(arr, i, 0);
        }
    }

    // Função para transformar um subarray em um heap máximo
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Inicializa o maior como raiz
        int leftChild = 2 * i + 1; // Índice do filho da esquerda
        int rightChild = 2 * i + 2; // Índice do filho da direita

        // Se o filho da esquerda é maior que a raiz
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        // Se o filho da direita é maior que a raiz
        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // Se o maior não for a raiz
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Chama heapify recursivamente na subárvore afetada
            heapify(arr, n, largest);
        }
    }

    // Função auxiliar para imprimir o array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
