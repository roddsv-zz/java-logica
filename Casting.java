public class Casting {

	public static void main(String[] args) {
		
		double b, B, h, area;
		
		b = 6.0; //o .0 depois do valor indica que a variável é double. Caso ela fosse do tipo flutuante,;
		//se usaria b = 6f (indicando assim o tipo float);
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);

		int a, b1;
		double resultado;
		
		a = 5;
		b1 = 2;
		
		resultado = (double) a/b1; //a declaração do tipo de variável é denominada casting, e é necessária;
		//quando não se quer perder informações no resultado final.
		
		System.out.println(resultado);
		
		double a2;
		int b2;
		
		a2 = 5.0;
		b2 = (int) a2; //outro exemplo de uso de casting.
		
		System.out.println(b2); 
	}
}
