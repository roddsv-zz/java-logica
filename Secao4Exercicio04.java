package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Secao4Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int horasTrabalhadas = scan.nextInt();
		double valorDaHoraTrabalhada = scan.nextDouble();
		double salario = (double)horasTrabalhadas*valorDaHoraTrabalhada;
		
		System.out.println("NUMBER = " + horasTrabalhadas);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		scan.close();
	}

}
