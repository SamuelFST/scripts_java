package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// o try testa um bloco de codigo
		try {
			System.out.print("Digite nomes separados por espaco: ");
			String[] vetor = sc.nextLine().split(" ");
			System.out.print("Digite a posicao do vetor para ser buscada: ");
			int posicaoVetor = sc.nextInt();
			System.out.println(vetor[posicaoVetor]);
		}
		// o catch pega as possíveis exceções do bloco de código que está no try e trata elas
		// sem o tratamento, quando é gerada uma exceção o programa é encerrado
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Posicao do vetor invalida");
			// o printStackTrace imprime a pilha que mostra o tipo de exceção gerado e onde foi gerado
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("Valor invalido");
			e.printStackTrace();
		}
		// o finally roda um bloco de código independentemente se o foi ou não captada uma exceção
		// e isso garante que alguma ação final seja tomada caso aconteça algum erro 
		finally {
			System.out.println("Bloco finally executado");
		}
		sc.close();
	}

}
