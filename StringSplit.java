
public class StringSplit {

	public static void main(String[] args) {
		
		String s = "potato aplle lemon orange";
		
		String[] vect = s.split(" ");
		/* este comando quebra a frase em palavras na posi��o
		  de vect[]. Lembrando que a posicao inicial sempre ser� 0*/
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);

	}

}
