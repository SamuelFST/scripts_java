package heranca.programa;

import java.util.Locale;

import heranca.entidades.ContaEmpresarial;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		ContaEmpresarial ce = new ContaEmpresarial();
		
		// Como a classe ContaEmpresarial está herdando a classe Conta, ela pode usar todos os atributos e métodos da classe Conta
		ce.deposito(100.00);
		ce.setLimiteEmprestimo(200.00);
		ce.emprestimo(200.00);
		
	}

}
