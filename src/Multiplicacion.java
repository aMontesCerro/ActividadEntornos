/**
 * Esta clase implementara todos los metodos que estan relacionados con la multiplicacion de la calculadora
 * @author Victor Jimenez Anguita
 * @version 1.0
 * @since Febrero 2021
 */
public class Multiplicacion {
	
	/**
	 * Multiplica dos numeros reales y devuelve el resultado
	 * @param num1 Es el primer numero real con el que se opera
	 * @param num2 Es el segundo numero real con el que se opera
	 * @return devuelve el resultado de multiplicar el primer numero por el segundo, devuelve un real
	 */
	
	public double multireal (double num1, double num2) {
		return num1 * num2;
	}
	
	/**
	 * Multiplica dos numeros enteros y devuelve el resultado 
	 * @param num1 Es el primer numero entero con el que se opera
	 * @param num2 Es el segundo numero entero con el que se opera
	 * @return devuelve el resultado de multiplicar el primer numero por el segundo, devuelve un entero
	 */
	public int multientero (int num1, int num2) {
		return num1 * num2;
	}

	/**
	 * Multiplica tres numeros enteros y devuelve el resultado
	 * @param num1 Es el primer numero real con el que se opera
	 * @param num2 Es el segundo numero real con el que se opera
	 * @param num3 Es el tercer numero real con el que se opera
	 * @return devuelve el resultado de multiplicar los tres numeros, devuelve un real
	 */
	public double multi3reales (double num1, double num2, double num3) {
		return num1 * num2 * num3;
	}
	
	/**
	 * Hace la potencia de dos numeros (x^y) y devuelve el resultado
	 * @param num1 Es el primer numero entero con el que se opera
	 * @param num2 Es el segudno numero entero con el que se opera
	 * @return devuelve el resultado de multiplicar el numero 1 tantas veces por si mismo como indica
	 * el numero dos
	 * @exception cuidado al introducir números grandes, te da error, 
	 */
	public int potencia (int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
}
