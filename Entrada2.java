import java.util.Scanner;
//o comando CTRL+Shift+F faz a autoendentação do código.
public class Entrada2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = scan.nextInt();
		scan.nextLine(); //esse next line evita que haja uma linha em branco ao rodar o programa;
		//entre o x e o s1, pois consome a linha que ficaria sem argumento em s1 (o que se chama);
		//buffer de leitura.
		s1 = scan.nextLine();
		s2 = scan.nextLine();
		s3 = scan.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		scan.close();
	}

}
