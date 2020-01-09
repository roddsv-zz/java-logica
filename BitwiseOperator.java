import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int mask = 0b100000; //sempre que se coloca 0b no inicio,;
		//significa que o n�mero ser� em bin�rio.
		int n = scan.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		//obs.: n�o confundir os bitwises (& |) com os operadores l�gicos (&& ||);
		//operador & ===> faz a opera��o "E" bit a bit;
		//operador | ===> faz a opera��o "OU" bit a bit;
		//operador ^ ===> faz a opera��o "OU-exclusivo" bit a bit.
		
		//int n1 = 89;
		//int n2 = 60;
		
		//System.out.println(n1 & n2);
		//System.out.println(n1 | n2);
		//System.out.println(n1 ^ n2);
	}
}