package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Secao4Exercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		float A, B, C, pi;
		A = scan.nextFloat();
		B = scan.nextFloat();
		C = scan.nextFloat();
		pi = (float) 3.14159;
		
		float areaDoTriangulo = A*C/2;
		float areaDoCirculo = pi*(float) Math.pow(C, 2);
		float areaDoTrapezio = (A + B)*C/2;
		float areaDoQuadrado = (float) Math.pow(B, 2);
		float areaDoRetangulo = A*B;
		
		System.out.printf("TRIANGULO: %.3f%n", areaDoTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaDoCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaDoTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaDoQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaDoRetangulo);
		
		scan.close();

	}

}