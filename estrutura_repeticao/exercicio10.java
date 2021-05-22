import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um numero inteiro: ");
		numero = read.nextInt();
		
		for(int i=1; i<=numero; i++) {
			System.out.printf("\nLinha %d: %d %d %d", i, i, (i*i), (i*i*i));
		}
		read.close();
	}

}
