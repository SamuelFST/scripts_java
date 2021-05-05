import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero;
		System.out.print("Digite um numero inteiro: ");
		numero = read.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O numero e par.");
		}
		else {
			System.out.println("O numero e impar.");
		}
		
		read.close();
	}

}
