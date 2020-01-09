package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Secao4Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double raio, pi, area;
		
		pi = 3.14159;
		raio = scan.nextDouble();
		area = pi*Math.pow(raio,2);
		
		System.out.printf("A = %.4f%n", area);
		
		scan.close();

	}

}
