import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int X;
		
		System.out.print("Digite um numero inteiro: ");
		X = read.nextInt();
		
		System.out.println("Numeros impares ate o numero digitado: ");
		for(int i=0; i<=X; i++) {
			if(i %2 != 0) {
				System.out.println(i);
			}
		}
		read.close();
	}

}
