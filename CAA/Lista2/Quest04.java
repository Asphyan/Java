public class Quest04 {
    public int maioriaElemento(int[] nums) {
        int contagem = 0;
        int candidato = 0;

        for (int num : nums) {
            if (contagem == 0) {
                candidato = num;
                contagem++;
            } else if (candidato == num) {
                contagem++;
            } else {
                contagem--;
            }
        }

        return candidato;
    }

    public static void main(String[] args) {
        Quest04 solucao = new Quest04();

        // Exemplo
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int resultado = solucao.maioriaElemento(nums);
        System.out.println("Elemento Majoritário: " + resultado); // Saída: 2
    }
}

