import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class restaUT {

	private resta cut;
		
	@BeforeEach
	public void setUp() {
		cut = new resta();
	}
		
	@AfterEach
	public void tearDown() {
	}
	
	//Test metodo restaReales
	@Test
	public void restaReales6menos3DebeSer3() {
		//Arrange
		double num1=6;
		double num2 = 3;
		double esperado= 3;
		
		//Act
		double obtenido = cut.restaReales(num1, num2);
		
		//Assert
		assertEquals(esperado, obtenido, "El resultado de 6 menos 3 debe ser 3");
	}
	
	@Test
	public void restaReales0menos3DebeSerMenos3() {
		//Arrange
		double num1=0;
		double num2 = 3;
		double esperado= -3;
		
		//Act
		double obtenido = cut.restaReales(num1, num2);
		
		//Assert
		assertEquals(esperado, obtenido, "El resultado de 0 menos 3 debe ser -3");
	}

	//Test metodo restaEnteros
		@Test
		public void restaEnteros6menos3DebeSer3() {
			//Arrange
			int num1=6;
			int num2 = 3;
			int esperado= 3;
			
			//Act
			int obtenido = cut.restaEnteris(num1, num2);
			
			//Assert
			assertEquals(esperado, obtenido, "El resultado de 6 menos 3 debe ser 3");
		}
		
	//Test metodo restaTresReales
		@Test
		public void restaTresReales6menos3DebeSer3() {
			//Arrange
			double num1=6;
			double num2 = 3;
			double num3 =1;
			double esperado= 2;
					
			//Act
			double obtenido = cut.restaTresReales(num1, num2, num3);
					
			//Assert
			assertEquals(esperado, obtenido, "El resultado de 6 menos 3 menos 1 debe ser 2");
				}
		
		//Casos especiales
		@Test
		public void restaValorminimomenosValorminimo() {
			//Arrange
			double num1 = Double.MIN_VALUE;
			double num2 = Double.MIN_VALUE;
			double esperado = 0;
			//Act
			double obtenido = cut.restaReales(num1, num2);
			System.out.println(obtenido);
			//Assert
			assertEquals(esperado, obtenido, "El resultado de infinito menos infinito debe ser infinito");
			
		}
		
		@Test
		public void restaValorinfinitoMenosalgo() {
			//Arrange
			double num1 = Double.MIN_VALUE;
			double num2 = 20;
			double esperado= 0;
			//Act
			double obtenido = cut.restaReales(num1, num2);
			System.out.println(obtenido);
			//Assert
			assertEquals(esperado, obtenido, "El resultado de Infinito menos algo es Infinito ");
		}
}
