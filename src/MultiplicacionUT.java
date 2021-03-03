import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplicacionUT {
	
	private Multiplicacion cut;

	@BeforeEach
	public void setUp() {
		cut = new Multiplicacion();
	}

	@AfterEach
	public void tearDown() {
		
	}
	
	//Test Método multiReal
	@Test
	public void productoReales6por11DebeSer66() {
		//Arrange
		double num1=6;
		double num2 = 11;
		double esperado= 66;
		
		//Act
		double obtenido = cut.multireal(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de 6 por 11 debe ser 66");
	}
	@Test
	public void productoReales0poralgoEs0() {
		//Arrange
		double num1 =0;
		double num2 = 45;
		double esperado=0;
		//Act
		double obtenido= cut.multireal(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de 0 por algo debe ser 0");
	}
	
	@Test
	public void productoRealesAlgoPor0Es0() {
		//Arrange
		double num1 = 83;
		double num2 = 0;
		double esperado = 0;
		//Act
		double obtenido = cut.multireal(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de algo por 0 debe ser cero");
	}
	
	@Test
	public void productoInfinitoPositivoPorAlgoDebeSerInfinito() {
		//Arrange
		double num1 = Double.POSITIVE_INFINITY;
		double num2 = 34;
		double esperado = Double.POSITIVE_INFINITY;
		//Act
		double obtenido = cut.multireal(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de infinito por algo debe ser infinito");
		
	}
	
	@Test
	public void productoInfinitoNegativoPorAlgoEsInfinitoNegativo() {
		//Arrange
		double num1 = Double.NEGATIVE_INFINITY;
		double num2 = 31;
		double esperado= Double.NEGATIVE_INFINITY;
		//Act
		double obtenido = cut.multireal(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de Infinito negativo por algo es Infinito negativo");
	}
	
	@Test
	public void productoNaNPorAlgoDebeSerNaN() {
		//Arrange
		double num1 = Double.NaN;
		double num2 = 57;
		double esperado = Double.NaN;
		//Act
		double obtenido = cut.multireal(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de NaN por algo debe ser NaN");
	}
	
	@Test
	public void productoInfinitoNegativoPorInfinitoNegativoDebeSerInfinito() {
		//Arrange
		double num1 = Double.NEGATIVE_INFINITY;
		double num2 = Double.NEGATIVE_INFINITY;
		double esperado = Double.POSITIVE_INFINITY;
		//Act
		double obtenido = cut.multireal(num1, num2);
		//Assert
		assertEquals(esperado, obtenido,
				"Infinito negativo por infinito negativo debe ser infinito positivo");
	}
	
	@Test
	public void productoMaximoPorMinimoEs0() {
		//Arrange
		double num1 = Double.MAX_VALUE;
		double num2 = Double.MIN_VALUE;
		double esperado = (Double.MAX_VALUE*Double.MIN_VALUE);
		//Act
		double obtenido = cut.multireal(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "El resultado del maximo valor por el minimo valor ha de ser 0");
	}
	
	@Test
	public void productoMinimoPorMinimo() {
		//Arrange
		double num1 = Double.MIN_VALUE;
		double num2 = Double.MIN_VALUE;
		double esperado = (Double.MIN_VALUE*Double.MIN_VALUE);
		//Act
		double obtenido = cut.multireal(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, 
				"El resultado del mínimo valor por el mínimo valor ha de ser 8.881784197001251E-16");
	}
	
	@Test 
	public void productoMaximoPorMaximo() {
		//Arrange
		double num1 = Double.MAX_VALUE;
		double num2 = Double.MAX_VALUE;
		double esperado = Double.POSITIVE_INFINITY;
		//Act
		double obtenido = cut.multireal(num1, num2);
		//Assert
		assertEquals(esperado, obtenido,
				"El resultado del máximo valor por el máximo valor debe ser infinito");
	}
	
	//Test Método multiEntero
	
	@Test
	public void productoEnteros5Por20DebeSer100() {
		//Arrange
		int num1 = 5;
		int num2 = 20;
		int esperado = 100;
		//Act
		int obtenido = cut.multientero(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de 5 por 20 debe ser 100");
	}
	
	@Test
	public void productoEntero0PorAlgoDebeSer0() {
		//Arrange
		int num1 = 0;
		int num2 = 67;
		int esperado= 0;
		//Act
		int obtenido = cut.multientero(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de 0 por algo debe ser 0");
	}
	
	//Test método multi3Reales
	
	@Test
	public void producto3por6por125Es2250() {
		//Arrange
		double num1 = 3;
		double num2 = 6;
		double num3 = 125;
		double esperado= 2250;
		//Act
		double obtenido = cut.multi3reales(num1, num2, num3);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de 3 por 6 por 125 debe ser 2250");
	}
	
	@Test
	public void producto3RealesUnoDeEllos0() {
		//Arrange
		double num1 = 0;
		double num2 = 3345;
		double num3 = 78;
		double esperado = 0;
		//Act
		double obtenido = cut.multi3reales(num1, num2, num3);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de 0 por dos reales debe ser 0");
	}
	
	@Test
	public void producto3RealesUnoDeEllosInfinito() {
		//Arrange
		double num1 = Double.POSITIVE_INFINITY;
		double num2 = 68;
		double num3 = 735;
		double esperado = Double.POSITIVE_INFINITY;
		//Act
		double obtenido = cut.multi3reales(num1, num2, num3);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de infinito por 2 reales ha de ser infinito");
	}
	
	@Test
	public void producto3RealesUnoDeEllosInfinitoNegativo() {
		//Arrange
		double num1 = Double.NEGATIVE_INFINITY;
		double num2 = 56;
		double num3 = 75;
		double esperado = Double.NEGATIVE_INFINITY;
		//Act
		double obtenido = cut.multi3reales(num1, num2, num3);
		//Assert
		assertEquals(esperado, obtenido,
				"El resultado de infinito negativo por dos reales es infinito negativo");
	}
	
	@Test
	public void producto3VecesInfinitoNegativoDebeSerInfinitoNegativo() {
		//Arrange
		double num1 = Double.NEGATIVE_INFINITY;
		double num2 = Double.NEGATIVE_INFINITY;
		double num3 = Double.NEGATIVE_INFINITY;
		double esperado = Double.NEGATIVE_INFINITY;
		//Act
		double obtenido = cut.multi3reales(num1, num2, num3);
		//Assert
		assertEquals(esperado, obtenido,
				"El resultado de multiplicar 3 veces infinito negatio debe ser infinito negativo");
	}
	
	@Test
	public void productoDe3VecesElMinimoValorDebeSer0() {
		//Arrange
		double num1 = Double.MIN_VALUE;
		double num2 = Double.MIN_VALUE;
		double num3 = Double.MIN_VALUE;
		double esperado = 0;
		//Act
		double obtenido = cut.multi3reales(num1, num2, num3);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de multiplicar 3 veces el minimo valor debe ser 0");
	}
	
	@Test
	public void producto3VecesMaximoValor() {
		//Arrange
		double num1 = Double.MAX_VALUE;
		double num2 = Double.MAX_VALUE;
		double num3 = Double.MAX_VALUE;
		double esperado = Double.POSITIVE_INFINITY;
		//Act
		double obtenido = cut.multi3reales(num1, num2, num3);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de multiplicar 3 veces el máximo valor es infinito");
	}
	
	@Test
	public void productoNaNPor2Reales() {
		//Arrange
		double num1 = Double.NaN;
		double num2 = 45;
		double num3 = 67;
		double esperado = Double.NaN;
		//Act
		double obtenido = cut.multi3reales(num1, num2, num3);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de NaN por dos reales debe ser NaN");
	}
	
	//Test método potencia
	
	@Test
	public void potencia3ElevadoA5DebeSer243() {
		//Arrange
		int num1= 3;
		int num2 = 5;
		int esperado = 243;
		//Act
		int obtenido = cut.potencia(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de 3 elevado a 5 debe ser 243");
	}
	
	@Test
	public void potencia0ElevadoAAlgo() {
		//Arrange 
		int num1 =0;
		int num2 = 46;
		int esperado = 0;
		//Act
		int obteido = cut.potencia(num1, num2);
		//Assert
		assertEquals(esperado, obteido, "El resultado de elevar 0 a algo debe ser 0");
	}
	
	@Test
	public void potenciaAlgoElevadoA0() {
		//Arrange
		int num1 = 4;
		int num2 =0;
		int esperado = 1;
		//Act
		int obtenido = cut.potencia(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "El resultado de algo elevado a 0 debe ser 1");
	}
	
	
	
	
	
	
	
	
	
	
	
}
