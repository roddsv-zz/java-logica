import java.util.Locale;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in); //esse comando(juntamente com o import java.util.Scanner;
		//possibilita a entrada de uma string a partir de um texto digitado por mim (como se fosse o prompt;
		//no JavaScript).
		
		//String x;
		//x = scan.next();
		//System.out.println("Você digitou: " + x);
		
		//scan.close();
		
		//int x1;
		//x1 = scan.nextInt(); faz a leitura de um número inteiro como entrada
		//System.out.println("Você digitou: " + x1);
		
		//scan.close();
		
		//double x2;
		//x2 = scan.nextDouble(); faz a leitura de uma variável do tipo Double como entrada.
		//System.out.printf("Você digitou: %.2f%n", x2);
		
		//char x3;
		//x3 = scan.next().charAt(0); usado para receber um caractere (letra) como entrada.
		//System.out.println("Você digitou: " + x3);
		
		String x;
		int y;
		double z;
		x = scan.next();
		y = scan.nextInt();
		z = scan.nextDouble(); 
		//dessa forma todos os tipos de variáveis serão recebidas ao ser digitada no console.
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
				
		} 
}