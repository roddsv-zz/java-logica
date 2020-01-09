
public class Funcoes {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		A = Math.sqrt(x); //Math.sqrt() retorna a raiz quadrada do numero que está dentro dos parênteses;
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);

		A = Math.pow(x, y); //Math.pow() retorna a potencia de x elevado a y que está dentro dos parênteses;
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);

		A = Math.abs(y); //Math.abs() retorna o módulo do número que está dentro dos parênteses;
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}
}

	/*Para mais funções matématicas, pesquisar na internet java.lang.Math.
	as funções matemáticas podem ser escritas em expressões maiores. Por exemplo:;
	delta = Math.pow(b,2.0) - 4*a*c;
	x1 = (-b + Math.sqrt(delta))/(2.0 * a);
	x2 = (-b - Math.sqrt(delta))/(2.0 * a);
	*/