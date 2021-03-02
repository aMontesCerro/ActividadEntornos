
/**
 * Esta clase implementa todos los métodos que están relacionados con la
 * división de la calculadora
 * 
 * 
 * @author Álvaro Montes Cerro
 *
 */

public class Cociente {
	private double resultado;

	/**
	 * Realiza el cociente entre dos numeros reales pasados como parámetro.
	 * <p>
	 * Casos especiales:
	 * </p>
	 * 
	 * <ul>
	 * <li>Si el divisor introducido es un 0 devuelve NaN
	 * <li>Si el divisor es 1 el resultado será el primer número
	 * <li>Si el dividendo es 0, el resultado será 0
	 * <li>Si el dividendo es infinito, devuelve infinito
	 * <li>Si el divisor es infinito, devuelve 0
	 * <li>Si ambos números son infinito, devuelve NaN
	 * <li>Si el dividendo es infinito negativo, devuelve infinito negativo
	 * <li>Si el divisor es infinito negativo, el resultado es infinito negativo
	 * <li>Si ambos números son infinito negativo, devuelve NaN
	 * <li>Si alguno de los números es NaN, el resultado será NaN
	 * </ul>
	 * 
	 * @param num1 Dividendo del cociente
	 * @param num2 Divisor del cociente
	 * @return Devuelve el cociente de num1 entre num2
	 * 
	 */

	public double cocienteReales(double num1, double num2) {
		if (num2 == 0) {
			return Double.NaN;
		}
		return resultado = num1 / num2;
	}

	/**
	 * Realiza el cociente entre dos numeros enteros pasados como parámetro .
	 * <p>
	 * Casos especiales:
	 * </p>
	 * 
	 * <ul>
	 * <li>Si el divisor introducido es un 0 devuelve NaN
	 * <li>Si el divisor es 1 el resultado será el primer número
	 * <li>Si el dividendo es 0, el resultado será 0
	 * <li>Si el dividendo es infinito, devuelve infinito
	 * <li>Si el divisor es infinito, devuelve 0
	 * <li>Si ambos números son infinito, devuelve NaN
	 * <li>Si el dividendo es infinito negativo, devuelve infinito negativo
	 * <li>Si el divisor es infinito negativo, el resultado es infinito negativo
	 * <li>Si ambos números son infinito negativo, devuelve NaN
	 * <li>Si alguno de los números es NaN, el resultado será NaN
	 * </ul>
	 * 
	 * @param num1 Dividendo del cociente
	 * @param num2 Divisor del cociente
	 * @return Devuelve el resultado de dividir num1 entre num2
	 * 
	 */
	public double cocienteEnteros(int num1, int num2) {
		if (num2 == 0) {
			return Double.NaN;
		}
		return resultado = num1 / num2;
	}

	/**
	 * Calcula el número inverso de un número real pasado por parámetro.
	 * <p>
	 * Casos especiales;
	 * </p>
	 * 
	 * <ul>
	 * <li>Si el número introducido es NaN, devuelve NaN
	 * <li>Si el numero introducido es infinito, devuelve 0
	 * <li>Si el número es infinito negativo, deuelve -0
	 * <li>Si el número introducido es 0, devuelve NaN
	 * </ul>
	 * 
	 * @param num1 Número del que se quiere calcular el inverso
	 * @return Devuelve un real que es el número inverso de num1
	 * 
	 */

	public double calculaInverso(double num1) throws ArithmeticException {
		if (num1 == 0) {
			return Double.NaN;
		}
		return resultado = 1 / num1;
	}

	/**
	 * Calcula la raiz cuadrada del número pasado como parámetro.
	 * <p>
	 * Casos especiales
	 * </p>
	 * 
	 * <ul>
	 * <li>Si el número introducido es negativo, devuelve NaN
	 * <li>Si el radicando es 0, el resultado es 0
	 * <li>Si el radicando es infinito, el resultado es infinito
	 * <li>Si el radicando es infinito negativo, el resultado es NaN
	 * <li>Si el radicando es NaN, el resultado es NaN
	 * </ul>
	 * 
	 * @param num1 Radicando
	 * @return Devuelve un real que es la raiz cuadrada positiva de num1
	 */
	public double calculaRaiz(double num1) throws ArithmeticException {
		return resultado = Math.sqrt(num1);
	}

}
