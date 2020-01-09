package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Secao6Exercicio003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			double z = scan.nextDouble();
			
			double pesoX = 2;
			double pesoY = 3;
			double pesoZ = 5;
			
			double mediaPonderada = ((x*pesoX + y*pesoY + z*pesoZ)/
					(pesoX + pesoY + pesoZ));
			
			System.out.printf("%.1f%n", mediaPonderada);
		}
	
		scan.close();
	}

}
