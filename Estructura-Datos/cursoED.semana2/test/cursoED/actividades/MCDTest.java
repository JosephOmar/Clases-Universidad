package cursoED.actividades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MCDTest {

	@Test
	void testMcdCon48y60DebeDar12() {
		int a = 48;
		int b = 60;
		
		assertEquals(12,MCD.mcd(a,b));
	}
	@Test
	void testMcdCon42y56DebeDar14() {
		int a = 42;
		int b = 56;
		
		assertEquals(14,MCD.mcd(a,b));
	}
	@Test
	void testMcdConNumerosCoprimosDebeDar1() {
		int a = 8;
		int b = 9;
		
		assertEquals(1,MCD.mcd(a,b));
	}

}
