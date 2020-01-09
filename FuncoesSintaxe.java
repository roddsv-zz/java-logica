import java.util.Scanner;

public class FuncoesSintaxe {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the numbers: ");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int higher = max(a, b, c);
		
		showResult(higher);
		
		scan.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		
		return(aux);
	}
	
	public static void showResult(int value) {//é void pois simplesmente executa uma ação sem retornar o valor para ser aproveitado no programa.
		System.out.println("Higher = " + value);
	}
}	