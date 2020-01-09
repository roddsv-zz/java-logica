package curso_programacao;

public class TesteDeMesa3 {

	public static void main(String[] args) {

		int x, y;
		x = 100;
		y = 100;
		
		while (x!=y) {
			System.out.println("olha");
			x = (int) Math.sqrt(y);
		}
	}
}