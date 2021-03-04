import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double num1 =25;
		double num2 = 5;
		double resultado;
		
		Cociente cociente = new Cociente();
		System.out.println(cociente.cocienteReales(num1, num2));
		
		System.out.println(cociente.calculaInverso(num1));
		System.out.println(cociente.calculaRaiz(num2));
		
		//Prueba clase resta
		resta res = new resta();
		int nume1 = 25;
		int nume2 = 5;
		
		System.out.println(res.restaReales(num1, num2));
		System.out.println(res.restaEnteris(nume1, nume2));
		
		//Prueba clase multiplicacion
		double num3 = 15;
		Multiplicacion mul = new Multiplicacion ();
		
		System.out.println("Resultados clases multiplicacion: ");
		System.out.println(mul.multientero(nume1, nume2));
		System.out.println(mul.multireal(num1, num2));
		System.out.println(mul.multi3reales(num1,num2,num3));
		System.out.println(mul.potencia(nume1, nume2));
			
	}

}
