import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int N;
		
		System.out.println("Digite um numero inteiro para poder saber todos os seus divisores: ");
		N = read.nextInt();
		
		System.out.printf("Divisores do numero %d: \n", N);
		for(int i=1; i<=N; i++) {
			if(N %i == 0) {
				System.out.println(i);
			}
		}
		
		read.close();
	}

}
