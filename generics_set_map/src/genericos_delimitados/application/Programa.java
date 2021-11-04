package genericos_delimitados.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import genericos_delimitados.entities.Produto;
import genericos_delimitados.services.CalculoService;

public class Programa {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		String caminho = "C:\\TEMP\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String linha = br.readLine();
			while(linha != null) {
				String[] campos = linha.split(",");
				lista.add(new Produto(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();
			}
			
			Produto x = CalculoService.maximo(lista);
			System.out.println("Mais caro: ");
			System.out.println(x);
			
		}
		catch(IOException e) {
			System.out.println("Erro: " +e.getMessage());
		}

	}

}
