package set.application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Programa {

	public static void main(String[] args) {
		
		// O HashSet é p mais rápido porém não garante a ordem os elementos adicionados
		//Set<String> set = new HashSet<>();
		
		// O TreeSet ordena os elementos adicionados
		//Set<String> set = new TreeSet<>();
		
		// O LinkedHashSet mantém a ordem em que os elementos foram adicionados
		//Set<String> set = new LinkedHashSet<>();
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		// Unindo as duas listas sem repetições
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		// Pegando a intersecção das listas
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// Pegando os valores da lista A que não estão na lista B
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
