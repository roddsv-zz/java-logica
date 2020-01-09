package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Secao4Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int codigo1, codigo2, numeroDePecas1, numeroDePecas2;
		codigo1 = scan.nextInt();
		codigo2 = scan.nextInt();
		numeroDePecas1 = scan.nextInt();
		numeroDePecas2 = scan.nextInt();
		
		double valorDaPeca1, valorDaPeca2;
		valorDaPeca1 = 5.30;
		valorDaPeca2 = 5.10;
		
		double valorTotal;
		valorTotal = numeroDePecas1*valorDaPeca1 + numeroDePecas2*valorDaPeca2;
		
		System.out.printf("VALOR A PAGAR R$: %.2f%n", valorTotal);
		
			scan.close();
	}

}
