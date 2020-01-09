import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional2 {

	public static void main(String[] args) { //o intuito desse código é demonstrar os operadores de;
		//atribuição cumulativa.
		
		//ex.: a = a + b ==> a+= b.
		//a = a - b ==> a-= b;
		//a = a * b ==> a*= b;
		//a = a / b ==> a/=b;
		//a = a % b ==> a%= b;
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
	
		int minutos = scan.nextInt();
		
		double conta = 50.0;
		
		if(minutos > 100) {
			conta = conta + 2*(minutos - 100);
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		scan.close();
	}

}
