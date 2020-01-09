package curso_programacao;

import java.util.Scanner;

public class Secao6ExercicioResolvido001 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		while (n > 2 && n < 1000) {
			for (int multiple = 1; multiple <= 10; multiple++) {
				int produto = n*multiple;
				System.out.println(multiple + " x " + n + " = " + produto);
			}
			break;
		}
		scan.close();
	}
}
