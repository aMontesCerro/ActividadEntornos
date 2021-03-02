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
	}

}
