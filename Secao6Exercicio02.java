package curso_programacao;

import java.util.Scanner;

public class Secao6Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int abscissa, ordenada;
		abscissa = scan.nextInt();
		ordenada = scan.nextInt();
		
		while (abscissa != 0 && ordenada !=0) {
			if(abscissa > 0 && ordenada > 0) {
				System.out.println("primeiro");
			} else if (abscissa < 0 && ordenada > 0) {
				System.out.println("segundo");
			} else if (abscissa < 0 && ordenada <0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			abscissa = scan.nextInt();
			ordenada = scan.nextInt();
		}
		
		if (abscissa == 0 || ordenada == 0) {
			scan.close();
		}
		
		scan.close();
	}
}
