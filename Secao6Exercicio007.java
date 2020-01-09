package curso_programacao;

import java.util.Scanner;

public class Secao6Exercicio007 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double N = scan.nextDouble();
		
		for(int i = 1; i <= N;i++) {
			int primeiro = i;
			int segundo = (int) Math.pow(i,2);
			int terceiro = (int) Math.pow(i,3);
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);		
		}
		scan.close();
	}
}
