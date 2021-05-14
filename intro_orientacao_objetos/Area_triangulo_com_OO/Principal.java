package Area_triangulo_com_OO;

import java.util.Locale;
import java.util.Scanner;
import Area_triangulo_com_OO.Triangulo;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as medidas do triangulo X: ");
		x.a = read.nextDouble();
		x.b = read.nextDouble();
		x.c = read.nextDouble();
		System.out.println("Digite as medidas do triangulo Y: ");
		y.a = read.nextDouble();
		y.b = read.nextDouble();
		y.c = read.nextDouble();
		
		double areaX = x.calculoArea();
		double areaY = y.calculoArea();
		
		System.out.printf("\nArea do triangulo X: %.4f", areaX);
		System.out.printf("\nArea do triangulo Y: %.4f", areaY);
		if(areaX > areaY) {
			System.out.println("\nMaior area: triangulo X");
		}
		else {
			System.out.println("\nMaior area: triangulo Y");
		}
		read.close();

	}

}
