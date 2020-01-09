package curso_programacao;

import java.util.Scanner;

public class Secao6ExercicioResolvido01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x, y;
		
		x = scan.nextInt();
		y = scan.nextInt();

		while (x != y) {
			if(x < y) {
				System.out.println("CRESCENTE");
			}
			else {
				System.out.println("DECRESCENTE");
			}
			x = scan.nextInt();
			y = scan.nextInt();
		}
		scan.close();
	}
}
