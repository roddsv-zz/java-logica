package curso_programacao;

public class TesteDeMesa6 {

	public static void main(String[] args) {

		int x, y, i;
		x = 4;
		y = 0;
		i = 0;
		
		while(i < x) {
			i += 1;
			y += i;
			System.out.print(i);
			System.out.println(y);
		}
	}

}
