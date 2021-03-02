/*
 * @author Pablo López Martín.
 * @version 1.0
 * @since 2021
 * 
 * Esta clase implementará todos los métodos que están relacionados con la resta de la calculadora.
 * 
 * Casos Especiales:
 * 
 * Si uno de los numeros o ambos es NaN, el resultado sera NaN.
 * Si ambos numeros son infinito, el resultado sera NaN.
 * Si se resta infinito negativo a infinito postivo el resultado sera infinito positivo.
 * Si se resta infinito positivo a infinito negativo el resultado sera infinito negativo.
 * Si uno de los numeros es el numero maximo posible o el más pequeño posible el resultado sera 0.
 * 
 * 
 */
public class resta {
	private int acumulado;
	private int cont;

	/*
	 * @param Numero real.
	 * 
	 * @return resta de dos numeros reales El primer numero debe ser mayor para
	 * evitar numeros negativos.
	 */
	public double restaReales(double num1, double num2) {
		if (num1 == Double.MIN_VALUE || num2 == Double.MIN_VALUE) {
			return 0;
		}
		if (num1 == Double.MAX_VALUE || num2 == Double.MAX_VALUE) {
			return 0;
		}
		return num1 - num2;
	}

	/*
	 * @param Numero entero.
	 * 
	 * @return resta de dos numeros enteros. El primer numeros debe ser mayor para
	 * evitar numeros negativos.
	 */
	public int restaEnteris(int num1, int num2) {
		if (num1 == Integer.MIN_VALUE || num2 == Integer.MIN_VALUE) {
			return 0;
		}
		if (num1 == Integer.MAX_VALUE || num2 == Integer.MAX_VALUE) {
			return 0;
		}
		return num1 - num2;
	}

	/*
	 * @param Numero real.
	 * 
	 * @return resta de tres numeros reales. El primer numero debe ser lo
	 * suficientemente mayor para evitar numeros negativos.
	 */
	public double restaTresReales(double num1, double num2, double num3) {
		if (num1 == Integer.MIN_VALUE || num2 == Integer.MIN_VALUE || num3 == Integer.MIN_VALUE) {
			return 0;
		}
		if (num1 == Integer.MAX_VALUE || num2 == Integer.MAX_VALUE || num3 == Integer.MAX_VALUE) {
			return 0;
		}
		return num1 - num2 - num3;
	}

	/*
	 * La primera ves es para indicar el numero en el que se inicia el acumulador.
	 * 
	 * Caso especial: Si el numero introducido es el maximo numero o el minimo se
	 * ignorara.
	 * 
	 * @param Numero entero que se va a restar.
	 * 
	 * @return Primera vez el valor del acumulador, la segunda la resta del numero
	 * introducido al numero acumulado.
	 */
	public int restaAcumulado(int num1) {
		if (num1 == Integer.MAX_VALUE || num1 == Integer.MIN_VALUE) {
			return acumulado;
		}
		if (cont > 0) {
			acumulado = acumulado - num1;
		} else {
			acumulado = num1;
		}
		cont++;
		return acumulado;
	}
}
