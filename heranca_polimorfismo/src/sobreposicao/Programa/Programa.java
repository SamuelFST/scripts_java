package sobreposicao.Programa;

import sobreposicao.entidades.Conta;
import sobreposicao.entidades.ContaEmpresarial;
import sobreposicao.entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		Conta conta = new Conta(0001, "A", 1000.0);
		Conta contaPoupanca = new ContaPoupanca(0002, "B", 1000.0, 0.05);
		Conta contaEmpresarial = new ContaEmpresarial(0003, "C", 1000.0, 0.0);
		
		conta.saque(200.0);
		System.out.println("Saque da conta comum (com taxa de 5.00): "+conta.getSaldo());
		
		contaPoupanca.saque(200.00);
		System.out.println("Saque da conta poupanca (sem taxas): "+contaPoupanca.getSaldo());
		
		contaEmpresarial.saque(200.00);
		System.out.println("Saque da conta empresarial (taxa adicional de 2.00): "+contaEmpresarial.getSaldo());
	}

}
