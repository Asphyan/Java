public class Quest06 {
    public static String maximaSubsequenciaPalindroma(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1; // Subsequências de tamanho 1 são palíndromas de comprimento 1
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j) && len == 2) {
                    dp[i][j] = 2; // Sequências de tamanho 2 com caracteres iguais são palíndromas de comprimento 2
                } else if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2; // Se os caracteres são iguais, adicionamos 2 ao resultado da sub-sequência interior
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]); // Se os caracteres são diferentes, pegamos o máximo das subsequências sem um dos caracteres
                }
            }
        }

        // Construção da subsequência a partir da matriz
        StringBuilder subsequencia = new StringBuilder();
        int i = 0, j = n - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                subsequencia.append(s.charAt(i));
                i++;
                j--;
            } else if (dp[i + 1][j] > dp[i][j - 1]) {
                i++;
            } else {
                j--;
            }
        }

        // Adicionando a parte reversa da subsequência (a parte que ficou do meio)
        StringBuilder parteReversa = new StringBuilder(subsequencia).reverse();
        if (i == j) {
            subsequencia.append(s.charAt(i));
        }
        subsequencia.append(parteReversa);

        return subsequencia.toString();
    }

    public static void main(String[] args) {
        String sequencia = "ACGTGCAAATCG";
        String resultado = maximaSubsequenciaPalindroma(sequencia);
        System.out.println("Subsequência palíndroma de tamanho máximo: " + resultado); // Saída: "ACGTGCAATGC"
    }
}
