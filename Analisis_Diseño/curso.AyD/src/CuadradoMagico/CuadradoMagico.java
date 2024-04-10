package CuadradoMagico;

public class CuadradoMagico {
    private int[][] cuadrado;
    private int n;

    public CuadradoMagico(int n) {
        this.n = n;
        this.cuadrado = new int[n][n];
    }

    public void generarCuadradoMagico() {
        int num = 1;
        int i = 0;
        int j = n / 2;

        while (num <= n * n) {
            cuadrado[i][j] = num;
            num++;
            i--;
            j++;

            if (i == -1 && j == n) {
                i = 1;
                j = n - 1;
            } else if (i == -1) {
                i = n - 1;
            } else if (j == n) {
                j = 0;
            } else if (cuadrado[i][j] != 0) {
                i += 2;
                j--;
            }
        }
    }
    
    public int[][] getCuadrado() {
        return this.cuadrado;
    }

    public void imprimirCuadrado() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cuadrado[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
