package CuadradoMagico;

public class main {

    public static void main(String[] args) {
        int n = 3; // Tamaño del cuadrado
        CuadradoMagico cuadradoMagico = new CuadradoMagico(n);
        cuadradoMagico.generarCuadradoMagico();
        cuadradoMagico.imprimirCuadrado();

        if (ComprobacionesCuadradoMagico.esCuadradoMagico(cuadradoMagico, n)) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado NO es mágico.");
        }
    }
}