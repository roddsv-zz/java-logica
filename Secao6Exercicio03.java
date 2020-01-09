package curso_programacao;

import java.util.Scanner;

public class Secao6Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int codigo = scan.nextInt();
		String produto = "nenhum";

		while (codigo <= 4) {
			switch (codigo) {
			case 1:
				produto = "Alcool: 1";
				codigo = scan.nextInt();
				System.out.println(produto);
			case 2:
				produto = "Gasolina: 2";
				codigo = scan.nextInt();
				System.out.println();
			case 3:
				produto = "Diesel: 3";
				codigo = scan.nextInt();
				System.out.println(produto);
			case 4:
				produto = "Muito obrigado";
				System.out.println(produto);
				break;
			}
		}
		scan.close();
	}
}
