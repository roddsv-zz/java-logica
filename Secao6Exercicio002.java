package curso_programacao;

import java.util.Scanner;

public class Secao6Exercicio002 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int in = 0;
		int out = 0;
		for (int counter = 1; counter <= x; counter++) {
			int numero = scan.nextInt();
			if (numero >= 10 && numero <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		scan.close();
	}
}
