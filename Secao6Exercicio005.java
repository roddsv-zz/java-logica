package curso_programacao;

import java.util.Scanner;

public class Secao6Exercicio005 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		int fat = 1;
		
		for (int i = 1; i <= numero; i++) {	
			fat = fat*i;
		}			
		System.out.println(fat);
		scan.close();
	}
}
