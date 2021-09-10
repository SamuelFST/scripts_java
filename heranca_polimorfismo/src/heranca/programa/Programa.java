package heranca.programa;

import java.util.Locale;

import heranca.entidades.Conta;
import heranca.entidades.ContaEmpresarial;
import heranca.entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		ContaEmpresarial ce = new ContaEmpresarial();
		
		// Como a classe ContaEmpresarial está herdando a classe Conta, ela pode usar todos os atributos e métodos da classe Conta
		ce.deposito(100.00);
		ce.setLimiteEmprestimo(200.00);
		ce.emprestimo(200.00);
		
		// UPCASTING e DOWNCASTING
		
		//Contrutores comuns
		Conta acc1 = new Conta(0001, "A", 0.0);
		ContaEmpresarial bacc1 = new ContaEmpresarial(0002, "B", 0.0, 500.0);
		
		// * UPCASTING *
		
		// Atribuindo a subclasse à superclasse
		Conta acc2 = bacc1;
		// Como a ContaEmpresarial também é uma conta por herdar suas características, ela pode ser atribuída à uma Conta
		Conta acc3 = new ContaEmpresarial(0003, "C", 0.0, 200.0);
		// O mesmo escrito acima acontece para a ContaPoupanca, que herda as características da classe Conta
		Conta acc4 = new ContaPoupanca(0004, "D", 0.0, 0.05);
		
		// * DOWNCASTING *
		
		// Para atribuir uma superclasse à subclasse, é preciso fazer o casting dela para o tipo desejado entre parênteses
		ContaEmpresarial bacc2 = (ContaEmpresarial)acc3;
		// O comando abaixo retorna um erro pois acc4 é uma subclasse da Conta, e não da ContaEmpresarial, logo ela não pode ser atribuída
		//ContaEmpresarial bacc3 = (ContaEmpresarial)acc4;
		
		// O instanceof checa se a variável está instanciada no tipo especificado, se sim, ele executa o comando dentro do if
		// No caso abaixo o if não será realizado pois acc4 não é uma instância de ContaEmpresarial
		if(acc4 instanceof ContaEmpresarial) {
			ContaEmpresarial bacc3 = (ContaEmpresarial)acc4;
			bacc3.emprestimo(200.00);
			System.out.println("Emprestimo realizado!");
		}
		
		// O if abaixo será realizado pois acc4 é uma instância da classe ContaPoupanca
		if(acc4 instanceof ContaPoupanca) {
			ContaPoupanca pacc1 = (ContaPoupanca)acc4;
			pacc1.atualizarSaldo();
			System.out.println("Saldo atualizado!");
		}
	}

}
