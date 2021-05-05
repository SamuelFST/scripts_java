import java.util.Scanner;

public class aulas {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num1, num2;
		char op;
		
		System.out.println("Digite uma conta usando enter para separacao de numero | operacao | numero: ");
		num1 = read.nextInt();
		op = read.next().charAt(0);
		read.nextLine();
		num2 = read.nextInt();
		
		switch(op) {
		
		case '+':
			System.out.printf("Resultado: %d", (num1 + num2));
			break;
			
		case '-':
			System.out.printf("Resultado: %d", (num1 - num2));
			break;
			
		case '*':
			System.out.printf("Resultado: %d", (num1 * num2));
			break;
			
		case '/':
			System.out.printf("Resultado: %d", (num1 / num2));
			break;
		}
		read.close();
	}

}
