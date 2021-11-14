package exercicio_map.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> votos = new LinkedHashMap<>();
	
		System.out.print("Digite o caminho do arquivo: ");
		String caminho = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String linha = br.readLine();
			while(linha != null) {
				String[] campos = linha.split(",");
				String nome = campos[0];
				int quantidadeVotos = Integer.parseInt(campos[1]);
				
				if (votos.containsKey(nome)) {
					int votosAtualizados = votos.get(nome);
					votos.put(nome, quantidadeVotos + votosAtualizados);
				} 
				else {
					votos.put(nome, quantidadeVotos);
				}
				linha = br.readLine();
			}
			
			System.out.println("Candidatos e votos: ");
			for(String chave : votos.keySet()) {
				System.out.println(chave +": " +votos.get(chave));
			}
		}
		catch(IOException e) {
			System.out.println("Erro: " +e.getMessage());
		}
		sc.close();
	}

}
