public class FloodFill {
    public int[][] floodFill(int[][] matriz, int linhaInicial, int colunaInicial,int cor, int novaCor) {
        Pilha<int[]> pilha = new Pilha<>(100);
        Fila<int[][]> fila = new Fila<>(100);

        int m = matriz.length;
        int n = matriz[0].length;

        int coordenadasInicial = matriz[linhaInicial][colunaInicial];

        pilha.push(new int[]{linhaInicial, colunaInicial});
        int mod = 1;

        while(!pilha.isEmpty()) {
            int[] c = pilha.top();
            int i = c[0];
            int j = c[1];
            pilha.pop();
            if (matriz[i][j] == coordenadasInicial) {
                matriz[i][j] = novaCor;
                if (i + 1 < m & matriz[i][j] != cor)
                    pilha.push(new int[]{i + 1, j});
                if (i - 1 >= 0 & matriz[i][j] != cor)
                    pilha.push(new int[]{i - 1, j});
                if (j + 1 < n & matriz[i][j] != cor)
                    pilha.push(new int[]{i, j + 1});
                if (j - 1 >= 0 & matriz[i][j] != cor)
                    pilha.push(new int[]{i, j - 1});
                fila.insert(matriz);
                int[][] value;
                value = fila.remove();
                impressao(value);
                System.out.println(pilha.toString());
                System.out.println("modificacao numero " + mod);
                System.out.println("---------------------");
                mod++;
                }
        }
        return matriz;
    }
    public void impressao(int[][] matriz) {
        for (int l = 0; l < matriz.length; l++)  {
            for (int c = 0; c < matriz[0].length; c++)  {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }
    }
}

