package curso_programacao;

import java.util.Scanner;

public class Secao5Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		scan.close();
	}
}