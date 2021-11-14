package map.application;

import java.util.Map;
import java.util.TreeMap;

public class Programa {

	public static void main(String[] args) {
		// O Map recebe um tipo chave e um tipo valor
		Map<String, String> cookies = new TreeMap<>();

		// put � usado para inserir valores no Map, informando sua chave e seu valor na inser��o
		cookies.put("nomeUsuario", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("telefone", "987654321");
		
		// o remove recebe uma chave como par�metro e remove o registro que tenha aquela chave associada
		cookies.remove("email");
		// ao adicionar um valor com uma chave j� usada antes, o valor salvo antes � sobrescrito pelo novo
		cookies.put("telefone", "123456789");
		// checa se existe no map a chave informada 
		System.out.println("Contem a chave 'telefone': " +cookies.containsKey("telefone"));
		System.out.println("Numero de telefone " +cookies.get("telefone"));
		// se a chave informada n�o existir no map, ele retorna null
		System.out.println("Email: " +cookies.get("email"));
		System.out.println("Tamanho: " +cookies.size());
		
		System.out.println("\nTodos os cookies: ");
        // o keySet() retorna um set com as chaves do Map
		for(String chave : cookies.keySet()) {
			System.out.println(chave + ": " +cookies.get(chave));
		}
	}

}
