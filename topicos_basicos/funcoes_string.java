import java.util.Scanner;

public class funcoes_string {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String fraseOriginal, fraseMod="", palavraAntiga, palavraNova;
		int opcao, excluir;
		
		System.out.print("Digite uma frase: ");
		fraseOriginal = read.nextLine();
		
		System.out.println("\nDigite o que deseja fazer com a frase: ");
		System.out.println("1 - Transformar em maiuscula toda a frase");
		System.out.println("2 - Transformar em minuscula toda a frase");
		System.out.println("3 - Remover os espacos no canto da frase");
		System.out.println("4 - Remover caracteres ate um ponto partindo do inicio da frase");
		System.out.println("5 - Recortar uma parte da frase");
		System.out.println("6 - Trocar uma letra ou palavra da frase por outra diferente");
		System.out.println("7 - Descobrir a posição inicial de uma letra ou palavra na frase");
		opcao = read.nextInt();
		read.nextLine();
		
		switch(opcao) {
		case 1:
			fraseMod = fraseOriginal.toUpperCase();
			break;
	
		case 2:
			fraseMod = fraseOriginal.toLowerCase();
			break;
			
		case 3:
			fraseMod = fraseOriginal.trim();
			break;
			
		case 4:
			System.out.println("\nDigite o numero da posicao ate onde deseja excluir: ");
			excluir = read.nextInt();
			fraseMod = fraseOriginal.substring(excluir);
			break;
		
		case 5:
			System.out.print("\nDigite o numero da posicao inicial para recortar: ");
			excluir = read.nextInt();
			System.out.print("\nDigite o numero da posicao final para recortar: ");
			int excluirFinal = read.nextInt();
			fraseMod = fraseOriginal.substring(excluir, excluirFinal);
			break;
			
		case 6:
			System.out.print("\nDigite qual letra/palavra deseja substituir: ");
			palavraAntiga = read.nextLine();
			System.out.print("\nDigite a nova letra/palavra que ficara no lugar: ");
			palavraNova = read.nextLine();
			fraseMod = fraseOriginal.replace(palavraAntiga, palavraNova);
			break;
			
		case 7:
			System.out.print("\nDigite qual letra/palavra deseja encontrar a posicao inicial: ");
			palavraAntiga = read.nextLine();
			int posicao = fraseOriginal.indexOf(palavraAntiga);
			System.out.printf("\nPosicao inicial de %s na frase: %d", palavraAntiga, posicao);
			break;
			
		default:
			System.out.println("Opcao nao encontrada");
		}
		
		System.out.println("\nFrase original: - " +fraseOriginal+ " -");
		System.out.println("Frase com a modificacao: - " +fraseMod+ " -");
		read.close();
			
		}
		
	}

