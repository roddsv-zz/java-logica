package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Secao4Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int valor1 = scan.nextInt();
		int valor2 = scan.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("SOMA = " + soma);
		
		scan.close();
	}

}
