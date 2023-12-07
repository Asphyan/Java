public class Quest2 {

    public static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length;

        // Verifica se as matrizes são de tamanho válido
        if (n == 1) {
            int[][] C = new int[1][1];
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }
        
        int[][] C = new int[n][n];
        
        // Divide as matrizes em submatrizes
        int[][] A11 = new int[n/2][n/2];
        int[][] A12 = new int[n/2][n/2];
        int[][] A21 = new int[n/2][n/2];
        int[][] A22 = new int[n/2][n/2];
    
        int[][] B11 = new int[n/2][n/2];
        int[][] B12 = new int[n/2][n/2];
        int[][] B21 = new int[n/2][n/2];
        int[][] B22 = new int[n/2][n/2];
        
        splitMatrix(A, A11, 0, 0);
        splitMatrix(A, A12, 0, n/2);
        splitMatrix(A, A21, n/2, 0);
        splitMatrix(A, A22, n/2, n/2);
        
        splitMatrix(B, B11, 0, 0);
        splitMatrix(B, B12, 0, n/2);
        splitMatrix(B, B21, n/2, 0);
        splitMatrix(B, B22, n/2, n/2);
        
        // Multiplica as submatrizes recursivamente
        int[][] C11 = somaMatriz(multiply(A11, B11), multiply(A12, B21));
        int[][] C12 = somaMatriz(multiply(A11, B12), multiply(A12, B22));
        int[][] C21 = somaMatriz(multiply(A21, B11), multiply(A22, B21));
        int[][] C22 = somaMatriz(multiply(A21, B12), multiply(A22, B22));
        
        // Une as submatrizes para formar a matriz resultante
        joinMatriz(C11, C, 0, 0);
        joinMatriz(C12, C, 0, n/2);
        joinMatriz(C21, C, n/2, 0);
        joinMatriz(C22, C, n/2, n/2);
        
        return C;
        }
        
        // Método para dividir uma matriz em submatrizes
        public static void splitMatrix(int[][] parent, int[][] child, int startRow, int startCol) {
            for (int i = 0; i < child.length; i++) {
                for (int j = 0; j < child.length; j++) {
                    child[i][j] = parent[i + startRow][j + startCol];
                }
            }
        }
        
        // Método para unir submatrizes em uma matriz maior
        public static void joinMatriz(int[][] child, int[][] parent, int startRow, int startCol) {
            for (int i = 0; i < child.length; i++) {
                for (int j = 0; j < child.length; j++) {
                    parent[i + startRow][j + startCol] = child[i][j];
                }
            }
        }
        
        // Método para somar duas matrizes
        public static int[][] somaMatriz(int[][] A, int[][] B) {
            int n = A.length;
            int[][] C = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }
            return C;
        }
        
        public static void main(String[] args) {
            int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
            };
        
            int[][] B = {
                {17, 18, 19, 20},
                {21, 22, 23, 24},
                {25, 26, 27, 28},
                {29, 30, 31, 32}
            };
        
            int[][] result = multiply(A, B);
        
        // Imprime o resultado da multiplicação
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
