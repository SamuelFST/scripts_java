package buffered_reader.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		String caminho = "C:\\Users\\NELCI\\Desktop\\Estudos\\Java\\testes_arquivo\\in.txt";
		FileReader fr = null;
		// BufferedReader é um FileReader mais otimizado
		BufferedReader br = null;
		
		try {
			fr = new FileReader(caminho);
			// O BufferedReader é instânciado a partir do FileReader
			br = new BufferedReader(fr);
			// linha recebe o que tiver na primeira linha do arquivo
			String linha = br.readLine();
			// A linha vai ficar como null quando não tiver mais linhas para serem lidas
			while(linha != null) {
				System.out.println(linha);
				// linha recebe o que estiver na próxima linha
				linha = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
