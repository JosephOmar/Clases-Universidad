package cursoED.actividades;

public class MCD {
	
	public static int mcd(int a, int b) {
		int menor = 0;
        int mcd = 1; 
        if (b <= a) {
            menor = b;
        } else {
            menor = a;
        }
        
        for (int i = 1; i <= menor; i++) {
            if (a % i == 0 && b % i == 0) {
                mcd = i; 
            }
        }
        return mcd;
	}
}
