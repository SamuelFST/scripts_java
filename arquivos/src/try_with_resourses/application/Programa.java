package try_with_resourses.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		String caminho = "C:\\Users\\NELCI\\Desktop\\Estudos\\Java\\testes_arquivo\\in.txt";
		
		// Esse try garante que o que for passado como par�metro ser� fechado quando o bloco acabar
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String linha = br.readLine();
			// A linha vai ficar como null quando n�o tiver mais linhas para serem lidas
			while(linha != null) {
				System.out.println(linha);
				// linha recebe o que estiver na pr�xima linha
				linha = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Erro: "+e.getMessage());
		}	
	}
}
