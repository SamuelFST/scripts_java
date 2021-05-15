package Calculos_retangulo;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		Retangulo retangulo;
		retangulo = new Retangulo();
		
		System.out.print("Digite a largura do retangulo: ");
		retangulo.largura = read.nextDouble();
		System.out.print("Digite a altura do retangulo: ");
		retangulo.altura = read.nextDouble();
		
		System.out.printf("\nArea = %.2f", retangulo.area());
		System.out.printf("\nPerimetro = %.2f", retangulo.perimetro());
		System.out.printf("\nDiagonal = %.2f", retangulo.diagonal());
		read.close();
	}

}
