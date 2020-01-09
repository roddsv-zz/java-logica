package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosSecao1A4Resolvido {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in); // a importação automática do scanner é feita por meio;
		// do comando CTRL+Shift+O;

		// double largura, comprimento ou;

		double largura = scan.nextDouble();
		double comprimento = scan.nextDouble();
		double metroQuadrado = scan.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		scan.close();
	}

}
