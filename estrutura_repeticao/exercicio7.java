import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		int quantidadePares;
		double valor1, valor2;
		
		System.out.print("Digite quantos pares para divisao deseja informar: ");
		quantidadePares = read.nextInt();
		
		for(int i=0; i<quantidadePares; i++) {
			System.out.printf("\nDigite os dois numeros do par %d: %n", i+1);
			valor1 = read.nextDouble();
			valor2 = read.nextDouble();
			
			if(valor2 ==0) {
				System.out.println("Divisao impossivel");
			}else {
				System.out.printf("\nResultado: %.1f%n", valor1/valor2);
			}
		}
		read.close();
	}

}
