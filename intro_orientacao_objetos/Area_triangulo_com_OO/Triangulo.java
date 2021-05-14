package Area_triangulo_com_OO;

public class Triangulo {
	public double a, b, c;
	
	public double calculoArea() {
		double p = (a + b + c)/2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
