package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Secao6ExercicioResolvido02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int idade = scan.nextInt();
		int counter = 0;
		int somaDasIdades = 0;

		while (idade >= 0) {
			somaDasIdades += idade;
			counter++;
			idade = scan.nextInt();
		}
		
		if (counter > 0) {
			double mediaDasIdades = (double) somaDasIdades / counter;
			System.out.printf("%.2f%n", mediaDasIdades);
		}
		else {
			System.out.println("impossivel calcular	");
		}
		scan.close();	
	}
}	