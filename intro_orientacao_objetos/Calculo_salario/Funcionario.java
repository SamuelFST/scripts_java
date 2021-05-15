package Calculo_salario;

public class Funcionario {
	public String nome;
	public double salarioBruto, imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public double aumentoSalario(double porcentagem) {
		return salarioBruto + (salarioBruto * porcentagem/100) - imposto;
	}
}
