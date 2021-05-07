import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int N;
		
		System.out.println("Digite um numero inteiro: ");
		N = read.nextInt();
		
		for(int i=1; i<=N; i++) {
			System.out.printf("\nLinha %d: %d %d %d", i, i, (i*i), (i*i*i));
		}
		read.close();
	}

}
