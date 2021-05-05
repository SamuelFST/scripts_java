import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int A, B;
		
		System.out.print("Digite o primeiro numero inteiro: ");
		A = read.nextInt();
		System.out.print("Digite o segundo numero inteiro: ");
		B = read.nextInt();
		if (A % B == 0 || B % A == 0) {
			System.out.println("Os numeros digitados sao multiplos.");
		}
		else {
			System.out.println("Os numeros digitados nao sao multiplos.");
		}
		read.close();
	}

}
