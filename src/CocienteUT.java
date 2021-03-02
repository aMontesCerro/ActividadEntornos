import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CocienteUT {

	private Cociente cut;
	
	@BeforeEach
	public void setUp() {
		cut = new Cociente();
	}
	
	@AfterEach
	public void tearDown() {
	}
	
	//Test Metodo 1
	
	@Test
	void cocienteDebeSer6Real() {
		// Arrange
		double num1 = 12;
		double num2 = 2;
		double esperado = 6;
		// Act
		double obtenido = cut.cocienteReales(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser 6");
	}
	
	
	@Test
	void siElDivisorIntroducidoEsUnCeroDevuelveNaN() {
		// Arrange
		double num1 = 12;
		double num2 = 0;
		double esperado = Double.NaN;
		// Act
		double obtenido = cut.cocienteReales(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser NaN");
	}
	
	
	@Test
	void siElivisorEs1ElResultadoSeraElPrimerNumero() {
		// Arrange
		double num1 = 12;
		double num2 = 1;
		double esperado = 12;
		// Act
		double obtenido = cut.cocienteReales(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser 12");
	}
	@Test
	void dividendo0Resultado0() {
		// Arrange
		double num1 = 0;
		double num2 = 2;
		double esperado = 0;
		// Act
		double obtenido = cut.cocienteReales(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser 0");
	}
	
	
	@Test
	void dividendoInfinitoResultadoInfinito() {
		// Arrange
		double num1 = Double.POSITIVE_INFINITY;
		double num2 = 2;
		double esperado = Double.POSITIVE_INFINITY;
		// Act
		double obtenido = cut.cocienteReales(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser infinito");
	}
	
	
	@Test
	void divisorInfinitoResultado0() {
		// Arrange
		double num1 = 12;
		double num2 = Double.POSITIVE_INFINITY;
		double esperado = 0;
		// Act
		double obtenido = cut.cocienteReales(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser 0");
	}
	
	
	@Test
	void ambosInfinitoResultadoNaN() {
		// Arrange
		double num1 = Double.POSITIVE_INFINITY;
		double num2 = Double.POSITIVE_INFINITY;
		double esperado = Double.NaN;
		// Act
		double obtenido = cut.cocienteReales(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser NaN");
	}
	
	
	@Test
	void dividendoInfinitoNegativoResultadoInfinitoNegativo() {
		// Arrange
		double num1 = Double.NEGATIVE_INFINITY;
		double num2 = 2;
		double esperado = Double.NEGATIVE_INFINITY;
		// Act
		double obtenido = cut.cocienteReales(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser infinito negativo");
	}
	
	
	@Test
	void divisorInfinitoNegativoResultadoInfinitoNegativo() {
		// Arrange
		double num1 = 12;
		double num2 = Double.NEGATIVE_INFINITY;
		double esperado = Double.NEGATIVE_INFINITY;
		// Act
		double obtenido = cut.cocienteReales(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser infinito negativo");
	}
	
	
	@Test
	void ambosInfinitoNegativoResultadoNaN() {
		// Arrange
		double num1 = Double.NEGATIVE_INFINITY;
		double num2 = Double.NEGATIVE_INFINITY;
		double esperado = Double.NaN;
		// Act
		double obtenido = cut.cocienteReales(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser NaN");
	}
	
	
	@Test
	void dividendoNaNResultadoNaN() {
		// Arrange
		double num1 = Double.NaN;
		double num2 = 2;
		double esperado = Double.NaN;
		// Act
		double obtenido = cut.cocienteReales(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser NaN");
	}
	
	@Test
	void divisorNaNResultadoNaN() {
		// Arrange
		double num1 = 12;
		double num2 = Double.NaN;
		double esperado = Double.NaN;
		// Act
		double obtenido = cut.cocienteReales(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser NaN");
	}
	
	
	@Test
	void cocienteDebeSer6Entero() {
		// Arrange
		int num1 = 12;
		int num2 = 2;
		int esperado = 6;
		// Act
		double obtenido =  cut.cocienteEnteros(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser 6");
	}
	@Test
	void siElDivisorIntroducidoEsUnCeroDevuelveNaNEnteros() {
		// Arrange
		int num1 = 12;
		int num2 = 0;
		double esperado = Double.NaN;
		// Act
		double obtenido = cut.cocienteEnteros(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser NaN");
	}
	
	
	@Test
	void siElivisorEs1ElResultadoSeraElPrimerNumeroEntero() {
		// Arrange
		int num1 = 12;
		int num2 = 1;
		double esperado = 12;
		// Act
		double obtenido = cut.cocienteEnteros(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser 12");
	}
	
	
	@Test
	void dividendo0Resultado0Entero() {
		// Arrange
		int num1 = 0;
		int num2 = 2;
		double esperado = 0;
		// Act
		double obtenido = cut.cocienteEnteros(num1, num2);
		//Assert
		assertEquals(esperado, obtenido, "el cociente debe ser 0");
	}
	
	@Test
	void debeDar0coma1() {
		// Arrange
		double num1 = 10;
		double esperado = 0.1;
		// Act
		double obtenido = cut.calculaInverso(num1);
		//Assert
		assertEquals(esperado, obtenido, "el inverso debe ser 0.1");
	}
	
	@Test
	void siEsNaNResultadoNaN() {
		// Arrange
		double num1 = Double.NaN;
		double esperado = Double.NaN;
		// Act
		double obtenido = cut.calculaInverso(num1);
		//Assert
		assertEquals(esperado, obtenido, "el inverso debe ser NaN");
	}
	
	@Test
	void siEsInfinitoResultado0() {
		// Arrange
		double num1 = Double.POSITIVE_INFINITY;
		double esperado = 0;
		// Act
		double obtenido = cut.calculaInverso(num1);
		//Assert
		assertEquals(esperado, obtenido, "el inverso debe ser 0");
	}
	
	
	@Test
	void siEsInfinitoNegativoResultado0() {
		// Arrange
		double num1 = Double.NEGATIVE_INFINITY;
		double esperado = 0;
		// Act
		double obtenido = cut.calculaInverso(num1);
		//Assert
		assertEquals(esperado, obtenido, "el inverso debe ser 0");
	}
	
	
	@Test
	void siEs0ResultadoNaN() {
		// Arrange
		double num1 = 0;
		double esperado = Double.NaN;
		// Act
		double obtenido = cut.calculaInverso(num1);
		//Assert
		assertEquals(esperado, obtenido, "el inverso debe ser NaN");
	}
	
	
	@Test
	void debeSer12() {
		// Arrange
		double num1 = 144;
		double esperado = 12;
		// Act
		double obtenido = cut.calculaRaiz(num1);
		//Assert
		assertEquals(esperado, obtenido, "el inverso debe ser 12");
	}
	
	@Test
	void siEsNegativoResultadoNaN() {
		// Arrange
		double num1 = -144;
		double esperado = Double.NaN;
		// Act
		double obtenido = cut.calculaRaiz(num1);
		//Assert
		assertEquals(esperado, obtenido, "el inverso debe ser NaN");
	}
	
	@Test
	void siEs0DebeDar0() {
		// Arrange
		double num1 = 0;
		double esperado = 0;
		// Act
		double obtenido = cut.calculaRaiz(num1);
		//Assert
		assertEquals(esperado, obtenido, "el inverso debe ser 0");
	}
	
	@Test
	void siEsInfinitoDebeDarInfinito() {
		// Arrange
		double num1 = Double.POSITIVE_INFINITY;
		double esperado = Double.POSITIVE_INFINITY;
		// Act
		double obtenido = cut.calculaRaiz(num1);
		//Assert
		assertEquals(esperado, obtenido, "el inverso debe ser infinito");
	}
	
	@Test
	void siEsInfinitoNegativoDebeDarNaN() {
		// Arrange
		double num1 = Double.NEGATIVE_INFINITY;
		double esperado = Double.NaN;
		// Act
		double obtenido = cut.calculaRaiz(num1);
		//Assert
		assertEquals(esperado, obtenido, "el inverso debe ser NaN");
	}
	
	@Test
	void siEsNaNDebeDarNaN() {
		// Arrange
		double num1 = Double.NaN;
		double esperado = Double.NaN;
		// Act
		double obtenido = cut.calculaRaiz(num1);
		//Assert
		assertEquals(esperado, obtenido, "el inverso debe ser NaN");
	}
	
}
