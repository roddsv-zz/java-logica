package curso_programacao;

public class TesteDeMesa5 {

	public static void main(String[] args) {
		
		int x, y;
		x = 2;
		y = 10;
		
		System.out.println("Ol�");
		
		while (x < y) {
			System.out.println(x + "-" + y);
			x *= 2;
			y += 1;
		}
	}
}
