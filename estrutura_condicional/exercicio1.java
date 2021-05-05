import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um numero inteiro: ");
		numero = read.nextInt();
		
		if (numero < 0) {
			System.out.println("O numero e negativo.");
		}
		else {
			System.out.println("O numero e positivo.");
		}
		
		read.close();
	}

}
