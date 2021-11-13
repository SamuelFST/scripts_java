package hashcode_equals.application;

import hashcode_equals.entities.Cliente;

public class Programa {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Maria", "maria@gmail.com");
		Cliente c2 = new Cliente("Maria", "maria@gmail.com");
		
		String s1 = "Teste";
		String s2 = "Teste";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		// Ir� retornar false porque c1 e c2 s�o clientes diferentes e est�o em posi��es diferentes da mem�ria
		System.out.println(c1 == c2);
		// Ir� retornar true porque o compilador far� um tratamento especial dessas duas Strings
		// Caso as duas fossem instanciadas usando new String("Teste") iria retornar false
		System.out.println(s1 == s2);
	}
}
