import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		double raio, area;
		
		System.out.print("Digite o raio do circulo: ");
		raio = read.nextDouble();
		area = (3.14159 *(Math.pow(raio, 2)));
		System.out.printf("Area do circulo = %.4f", area);
		read.close();
	}
}
