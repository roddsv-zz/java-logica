package curso_programacao;

import java.util.Scanner;

public class Secao5Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int codigo, quantidade;
		codigo = scan.nextInt();
		quantidade = scan.nextInt();
		double preco = 0; //para inicializar a variável, pois se eu não fizer isso o Eclipse não saberá se eu entrarei//
		//ou não em algum if.
		
		if(codigo == 1) {
			preco = 4.00;
		} else if (codigo == 2) {
			preco = 4.50;
		} else if (codigo == 3){
			preco = 5.00;
		} else if (codigo == 4){
			preco = 2.00;
		} else if(codigo == 5){
			preco = 1.50;
		}
		
		double conta = quantidade*preco;
		System.out.printf("Total: R$ %.2f%n", conta);
		
		scan.close();
	}

}
