package genericos_delimitados.services;

import java.util.List;

public class CalculoService {
	
	// O método trabalha com qualquer tipo T desde que esse T seja qualquer subtipo de comparable T
	public static <T extends Comparable<T>> T maximo(List<T> lista) {
		if(lista.isEmpty()) {
			throw new IllegalStateException("A lista nao pode estar vazia");
		}
		T maximo = lista.get(0);
		for(T item : lista) {
			// O compareTo retorna <0 se for um valor menor, 0 se for igual e >0 se for um valor maior que está sendo comparado
			if(item.compareTo(maximo) > 0) {
				maximo = item;
			}
		}
		return maximo;
	}
}
