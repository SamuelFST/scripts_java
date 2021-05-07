import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		int N;
		double valor1=0, valor2=0, valor3=0, media;
		
		System.out.print("Digite a quantidade de linhas: ");
		N = read.nextInt();
		
		for(int i=0; i<N; i++) {
			System.out.printf("\nDigite os 3 numeros da linha %d: ", i+1);
			valor1 = read.nextDouble();
			valor2 = read.nextDouble();
			valor3 = read.nextDouble();
			media = (valor1 * 2 + valor2 * 3 + valor3 *5) /10;
			System.out.printf("Media: %.1f\n", media);
			}
		
		read.close();
	}

}
