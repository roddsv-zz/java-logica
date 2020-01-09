import java.util.Scanner;

public class ExpressoesTernarias {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco*0.1 : preco*0.05;
		//essa sintaxe constitui uma expressão ternária
		//(condicao) ? TRUE : FALSE;
		//equivale a:
		//if (preco < 20) {
			//desconto = preco*0.1;
		 //} else {
			//desconto = preco*0.05;
		
		System.out.println(desconto);
		
		scan.close();
	}

}
