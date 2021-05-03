import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int A, B, C, D, diferenca;
		System.out.print("Digite o valor de A: ");
		A = read.nextInt();
		System.out.print("Digite o valor de B: ");
		B = read.nextInt();
		System.out.print("Digite o valor de C: ");
		C = read.nextInt();
		System.out.print("Digite o valor de D: ");
		D = read.nextInt();
		diferenca = ((A * B) - (C * D));
		System.out.printf("Diferenca: %d", diferenca);
		read.close();
	}

}
