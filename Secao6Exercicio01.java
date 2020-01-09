package curso_programacao;

import java.util.Scanner;

public class Secao6Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int senha = scan.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = scan.nextInt();
		}
		if (senha == 2002) {
			System.out.println("Acesso Permitido");
		}
			scan.close();
	}
}

