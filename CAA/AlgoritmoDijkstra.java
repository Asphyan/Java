import java.util.Arrays;

public class AlgoritmoDijkstra {
    private int V; // Número de vértices (ou nós) no grafo
    private int[][] grafo; // Representação do grafo como uma matriz de adjacência

    public AlgoritmoDijkstra(int vertices) {
        this.V = vertices;
        this.grafo = new int[vertices][vertices]; // Inicializa a matriz de adjacência com zeros
    }

    // Encontra o vértice com a menor distância ainda não visitado
    private int encontrarMenorDistancia(int[] distancias, boolean[] visitado) {
        int minDistancia = Integer.MAX_VALUE;
        int minIndice = -1;

        for (int v = 0; v < V; v++) {
            if (!visitado[v] && distancias[v] <= minDistancia) {
                minDistancia = distancias[v];
                minIndice = v;
            }
        }

        return minIndice;
    }

    // Imprime o caminho mínimo entre a origem e o destino
    private void imprimirCaminho(int[] distancias, int[] pai, int origem, int destino) {
        System.out.print("Caminho mínimo entre " + origem + " e " + destino + ": ");
        int atual = destino;
        System.out.print(atual);

        while (pai[atual] != -1) {
            System.out.print(" <- " + pai[atual]);
            atual = pai[atual];
        }

        System.out.println("\nCusto total: " + distancias[destino]);
    }

    // Algoritmo de Dijkstra para encontrar o caminho mínimo
    public void dijkstra(int origem, int destino) {
        int[] distancias = new int[V]; // Armazena as distâncias mínimas da origem a cada vértice
        boolean[] visitado = new boolean[V]; // Marca os vértices visitados
        int[] pai = new int[V]; // Armazena o pai de cada vértice no caminho mínimo

        Arrays.fill(distancias, Integer.MAX_VALUE); // Inicializa todas as distâncias como infinito
        Arrays.fill(visitado, false); // Inicializa todos os vértices como não visitados
        Arrays.fill(pai, -1); // Inicializa os pais como -1 (sem pai)

        distancias[origem] = 0; // A distância da origem para ela mesma é zero

        for (int count = 0; count < V - 1; count++) {
            int u = encontrarMenorDistancia(distancias, visitado); // Encontra o vértice com a menor distância
            visitado[u] = true; // Marca o vértice como visitado

            for (int v = 0; v < V; v++) {
                if (!visitado[v] && grafo[u][v] != 0 && distancias[u] != Integer.MAX_VALUE
                        && distancias[u] + grafo[u][v] < distancias[v]) {
                    distancias[v] = distancias[u] + grafo[u][v]; // Atualiza a distância mínima
                    pai[v] = u; // Define o pai do vértice v
                }
            }
        }

        imprimirCaminho(distancias, pai, origem, destino); // Imprime o caminho mínimo
    }

    public static void main(String[] args) {
        int vertices = 5;
        int[][] grafo = { { 0, 3, 2, 0, 0 }, { 3, 0, 1, 5, 0 }, { 2, 1, 0, 3, 6 }, { 0, 5, 3, 0, 4 }, { 0, 0, 6, 4, 0 } };
        int origem = 0;
        int destino = 4;

        AlgoritmoDijkstra dijkstra = new AlgoritmoDijkstra(vertices);
        dijkstra.grafo = grafo;

        dijkstra.dijkstra(origem, destino); // Executa o algoritmo
    }
}
