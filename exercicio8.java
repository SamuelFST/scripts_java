
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int N, fatorial=1;
		
		System.out.print("Digite um valor para calcular o fatorial: ");
		N = read.nextInt();
		
		for(int i=1; i<=N; i++) {
			fatorial = fatorial*i;
		}
		
		System.out.printf("Fatorial: %d", fatorial);
		
	}

}
