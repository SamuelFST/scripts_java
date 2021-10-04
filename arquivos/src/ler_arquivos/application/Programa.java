package ler_arquivos.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// Instanciando um objeto do tipo File recebendo como par�metro o caminho do arquivo no sistema
		File arquivo = new File("C:\\Users\\NELCI\\Desktop\\Estudos\\Java\\testes_arquivo\\in.txt");
		Scanner sc = null;
		try {
			// Atribuindo ao sc um novo Scanner que far� a leitura do arquivo
			sc = new Scanner(arquivo);
			// Enquanto o arquivo tiver uma pr�xima linha, o comando imprimir� a linha 
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}
		finally {
			/* Precisa-se testar se o sc � nulo pois caso d� um erro na inst�ncia��o dele, ele ficar� como nulo e 
			 * gerar� um NullPointer Exception na hora de fechar ele */
			if(sc != null) {
				sc.close();
			}
		}
	}

}
