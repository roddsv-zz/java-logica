package curso_programacao;

import java.util.Scanner;

public class Secao5Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int horaDeInicio, horaDoTermino, duracao;
		
		horaDeInicio = scan.nextInt();
		horaDoTermino = scan.nextInt();
		
		if(horaDeInicio >= horaDoTermino) {
			duracao = 24 - (horaDeInicio - horaDoTermino);
		} else {
			duracao = horaDoTermino - horaDeInicio;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		scan.close();
	}
}
