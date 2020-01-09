package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Secao6Exercicio004 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			double x = scan.nextInt();
			double y = scan.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				double divisao = x / y;
				System.out.printf("%.1f%n", divisao);
			}
		}
		scan.close();
	}
}