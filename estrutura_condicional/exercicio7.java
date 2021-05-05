import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		double x, y;
		
		System.out.println("Digite a coordenada do ponto X: ");
		x = read.nextDouble();
		System.out.println("Digite a coordenada do ponto y: ");
		y = read.nextDouble();
		
		if(x < 0 && y > 0) {
			System.out.println("O ponto esta no quadrante 2");
		}
		else if(x < 0 && y < 0) {
			System.out.println("O ponto esta no quadrante 3");
		}
		else if(x > 0 && y > 0) {
			System.out.println("O ponto esta no quadrante 1");
		}
		else if(x > 0 && y < 0) {
			System.out.println("O ponto esta no quadrante 4");
		}
		else {
			System.out.println("O ponto esta na origem.");
		}
		read.close();
	}
}
