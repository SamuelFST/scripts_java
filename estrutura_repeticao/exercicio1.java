import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int senha;
		
		System.out.println("Digite a senha: ");
		senha = read.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha invalida\n");
			System.out.println("Digite a senha: ");
			senha = read.nextInt();
		}
		System.out.println("Acesso permitido");
		read.close();
	}

}
