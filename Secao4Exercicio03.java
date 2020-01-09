package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Secao4Exercicio03 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		D = scan.nextInt();
		
		diferenca = A * B - C * D;
		
		System.out.println("DIFERENCA = " + diferenca);
		
		scan.close();

	}

}
