package Calculos_retangulo;

public class Retangulo {
	public double altura, largura;
	
	public double area() {
		return altura*largura;
	}
	
	public double perimetro() {
		return altura*2 + largura*2;
	}
	
	public double diagonal() {
		double aux = Math.pow(altura, 2) + Math.pow(largura, 2);
		return Math.sqrt(aux);
	}
}
