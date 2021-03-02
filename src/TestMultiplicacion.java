
public class TestMultiplicacion {

	public static void main(String[] args) {
		
		Multiplicacion numero1 = new Multiplicacion ();
		Multiplicacion numero2 = new Multiplicacion ();
		Multiplicacion numero3 = new Multiplicacion ();
		Multiplicacion numero4 = new Multiplicacion ();
		
		double x= numero1.multireal(5.6, 4.2);
		int y = numero2.multientero(5, 6);
		double z = numero3.multi3reales(3.7, 1.5, 6.2);
		int w = numero4.potencia(2, 3);
				
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		

	}

}
