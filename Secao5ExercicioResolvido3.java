package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Secao5ExercicioResolvido3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a < b && a < c) { //dessa forma ele avalia se o a for o menor de todos e ainda descarta caso ele não seja//
			//possibilitando que a máquina vá comparar o b.
			System.out.println("MENOR = " + a);
		}
		else if(b < c) { //dessa forma, após o primeiro if, o b será comparado e caso ele não seja o menor,//
			//a máquina entenderá que c é o menor e irá excutar o que o else mandar.
			System.out.println("MENOR = " + b);
		}
		else {
			System.out.println("MENOR = " + c);
		}
		
		scan.close();
	}
}