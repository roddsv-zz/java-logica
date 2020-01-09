package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Secao5ExercicioResolvido {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double notaSemestre1, notaSemestre2, notaFinal;
		notaSemestre1 = scan.nextDouble();
		notaSemestre2 = scan.nextDouble();
		notaFinal = notaSemestre1 + notaSemestre2;
		
		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

		if (notaFinal < 60.0) {
			System.out.println("REPROVADO");
		}
		
		scan.close();
	}	
}		