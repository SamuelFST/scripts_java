import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int N, X, in=0, out=0;
		
		System.out.print("Digite a quantidade de valores que serao lidos: ");
		N = read.nextInt();
		
		for(int i=0; i<N; i++) {
			System.out.printf("\nDigite o valor %d: ", i+1);
			X = read.nextInt();
			if(X <= 20 && X>=10) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.printf("\n%d in", in);
		System.out.printf("\n%d out", out);
		read.close();
	}

}
