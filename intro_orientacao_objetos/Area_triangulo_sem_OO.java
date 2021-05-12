import java.util.Locale;
import java.util.Scanner;

public class Area_triangulo_sem_OO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3;
		
		System.out.println("Digite as medidas do triangulo X: ");
		x1 = read.nextDouble();
		x2 = read.nextDouble();
		x3 = read.nextDouble();
		System.out.println("Digite as medidas do triangulo Y: ");
		y1 = read.nextDouble();
		y2 = read.nextDouble();
		y3 = read.nextDouble();
		
		double p = (x1 + x2 + x3)/2.0;
		double areaX = Math.sqrt(p *(p-x1)*(p-x2)*(p-x3));
		
		p = (y1 + y2 + y3)/2.0;
		double areaY = Math.sqrt(p *(p-y1)*(p-y2)*(p-y3));
		
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
