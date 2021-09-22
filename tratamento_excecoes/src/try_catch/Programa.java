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
		// o catch pega as poss�veis exce��es do bloco de c�digo que est� no try e trata elas
		// sem o tratamento, quando � gerada uma exce��o o programa � encerrado
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Posicao do vetor invalida");
			// o printStackTrace imprime a pilha que mostra o tipo de exce��o gerado e onde foi gerado
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("Valor invalido");
			e.printStackTrace();
		}
		// o finally roda um bloco de c�digo independentemente se o foi ou n�o captada uma exce��o
		// e isso garante que alguma a��o final seja tomada caso aconte�a algum erro 
		finally {
			System.out.println("Bloco finally executado");
		}
		sc.close();
	}

}
