import java.util.*;

public class funcoes {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Digite 3 numeros: ");
		num1 = read.nextInt();
		num2 = read.nextInt();
		num3 = read.nextInt();
		int maior = comparacao(num1, num2, num3);
		saida(maior);
		read.close();
	}
	
	public static int comparacao(int x, int y, int z) {
		if(x > y && x > z) {
			return x;
		}
		else if(y > x && y >  z) {
			return y;
		}
		else {
			return z;
		}
		
	}
	
	public static void saida (int maior) {
		System.out.println("Maior: "+maior);
	}

}
