import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	int num1, num2;
	
	System.out.print("Digite o primeiro numero inteiro: ");
	num1 = read.nextInt();
	System.out.print("Digite o segundo numero inteiro: ");
	num2 = read.nextInt();
	System.out.printf("SOMA = %d", (num1+num2));
	read.close();
	}
}
