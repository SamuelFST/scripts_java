package manipular_pastas.application;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o caminho de uma pasta: ");
		String caminhoPasta = sc.nextLine();
		// O File pode ser tanto o caminho de um arquivo quanto de uma pasta
		File caminho = new File(caminhoPasta);
		// Vetor de arquivos recebendo somente a listagem de pastas (directory)
		File[] pastas = caminho.listFiles(File::isDirectory);
		System.out.println("\nPastas: ");
		for(File pasta : pastas) {
			System.out.println(pasta);
		}
		
		// Vetor de arquivos recebendo somente a listagem de arquivos (File)
		File[] arquivos = caminho.listFiles(File::isFile);
		System.out.println("\nArquivos: ");
		for(File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		// Comando para criar uma nova pasta no caminho digitado
		boolean sucesso = new File(caminho +"\\teste").mkdir();
		System.out.println("Pasta criada com sucesso: "+sucesso);
		
		// Mostra somente o caminho do arquivo, desprezando o nome do arquivo
		System.out.println("\ngetParent: "+caminho.getParent());
		// Mosta todo o caminho do arquivo 
		System.out.println("getPath: "+caminho.getPath());
		// Mostra somente o nome do arquivo, desprezando o caminho
		System.out.println("getName: "+caminho.getName());
		
		sc.close();
	}

}
