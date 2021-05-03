import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	int a, b;
	
	System.out.print("Digite o primeiro numero inteiro: ");
	a = read.nextInt();
	System.out.print("Digite o segundo numero inteiro: ");
	b = read.nextInt();
	System.out.printf("SOMA = %d", (a+b));
	read.close();
	}
}
