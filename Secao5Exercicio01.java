package curso_programacao;

import java.util.Scanner;

public class Secao5Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a;
		a = scan.nextInt();
		
		if(a >= 0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		scan.close();
	}
}