package CuadradoMagico;

public class ComprobacionesCuadradoMagico {
    
	public static boolean esCuadradoMagico(CuadradoMagico cuadrado, int n) {
	    int[][] matriz = cuadrado.getCuadrado(); // Obtener la matriz del cuadrado mágico

	    // Calcular la suma esperada para que todas las filas, columnas y diagonales sean iguales
	    int sumaEsperada = n * (n * n + 1) / 2;

	    // Verificar las sumas de las filas
	    for (int i = 0; i < n; i++) {
	        int sumaFila = 0;
	        for (int j = 0; j < n; j++) {
	            sumaFila += matriz[i][j];
	        }
	        if (sumaFila != sumaEsperada) {
	            return false;
	        }
	    }

	    // Verificar las sumas de las columnas
	    for (int j = 0; j < n; j++) {
	        int sumaColumna = 0;
	        for (int i = 0; i < n; i++) {
	            sumaColumna += matriz[i][j];
	        }
	        if (sumaColumna != sumaEsperada) {
	            return false;
	        }
	    }

	    // Verificar la suma de la diagonal principal
	    int sumaDiagonalPrincipal = 0;
	    for (int i = 0; i < n; i++) {
	        sumaDiagonalPrincipal += matriz[i][i];
	    }
	    if (sumaDiagonalPrincipal != sumaEsperada) {
	        return false;
	    }

	    // Verificar la suma de la diagonal secundaria
	    int sumaDiagonalSecundaria = 0;
	    for (int i = 0; i < n; i++) {
	        sumaDiagonalSecundaria += matriz[i][n - 1 - i];
	    }
	    if (sumaDiagonalSecundaria != sumaEsperada) {
	        return false;
	    }

	    // Si todas las sumas son iguales a la suma esperada, entonces es un cuadrado mágico
	    return true;
	}
}