package buffered_writer.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		String[] linhas = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
		String caminho = "C:\\Users\\NELCI\\Desktop\\Estudos\\Java\\testes_arquivo\\out.txt";
		
		// O true especifica que é pra continuar a escrita no arquivo, e não sobrescrever a escrita anterior
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))){
			for(String linha : linhas) {
				// Escreve a linha corresponente no arquivo
				bw.write(linha);
				// Cria uma nova linha
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
