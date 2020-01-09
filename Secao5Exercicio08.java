package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Secao5Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double salario, imposto;
		salario = scan.nextDouble();
		imposto = 0;
		
		if(salario >=0 && salario <= 2000) {
			imposto = 0;
		} else if (salario >= 2000.01 && salario <= 3000) {
			imposto = 0.08*1000; 
		} else if (salario >= 3000.01 && salario <=4500) {
			imposto = 0.08*1000 + 0.18*(salario - 3000);
		} else {
			imposto = 0.08*1000 + 0.18*1500 + 0.28*(salario - 4500);
		}
		
		if (imposto == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}
	
		scan.close();
	}
}
