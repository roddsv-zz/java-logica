package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Secao5ExercicioResolvido2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double a, b, c;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		double delta;
		delta = Math.pow(b,2) - 4*a*c;
		
		double R1, R2;
		R1 = (-b + Math.sqrt(delta))/(2.0*a);
		R2 = (-b - Math.sqrt(delta))/(2.0*a);
		
		if (delta >=0 || a !=0) {
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
		} else {
			System.out.println("Impossivel calcular");
		}		
	
		scan.close();
	}
}
