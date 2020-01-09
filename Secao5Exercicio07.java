package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Secao5Exercicio07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double abscissa, ordenada;
		abscissa = scan.nextDouble();
		ordenada = scan.nextDouble();
		
		if(abscissa == 0 && ordenada == 0) {
			System.out.println("Origem");
		} else if (abscissa == 0) {
			System.out.println("Eixo X");
		} else if (ordenada == 0) {
			System.out.println("Eixo Y");
		} else if (abscissa > 0 && ordenada > 0) {
			System.out.println("Q1");
		} else if (abscissa < 0 && ordenada > 0) {
			System.out.println("Q2");
		} else if (abscissa < 0 && ordenada < 0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}
		
		scan.close();
	}

}
