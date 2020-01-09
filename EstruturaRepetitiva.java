import java.util.Scanner;

public class EstruturaRepetitiva {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int soma = 0;
		
		for (int counter = 0; counter < n; counter++) {
			//o for é usado quando se sabe previamente;
			//a quantidade de repetições;
			int x = scan.nextInt();
			soma += x; 
		}		
		System.out.println(soma);
		
		scan.close();
		
		//é importante entender:
		//for (int counter = 0; counter < 5; counter++){
		//	System.out.println("Valor de i: " + i);
		//}
		
		//Será impresso no console:
		//Valor de i: 0;
		//Valor de i: 1;
		//Valor de i: 2;
		//Valor de i: 3;
		//Valor de i: 4;
		
		//Para contagens regressivas:
		//for(int counter = 4; counter >=0; counter--){
		// System.out.println(Valor de i: " + i);
		//}
		
		//Será impresso no console:
		//Valor de i: 4;
		//Valor de i: 3;
		//Valor de i: 2;
		//Valor de i: 1;
		//Valor de i: 0;
	}
}
