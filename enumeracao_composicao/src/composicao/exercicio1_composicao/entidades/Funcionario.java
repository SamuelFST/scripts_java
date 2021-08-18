package composicao.exercicio1_composicao.entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import composicao.exercicio1_composicao.enums.NivelFuncionario;

public class Funcionario {
	private String nome;
	private NivelFuncionario nivel;
	private Double salarioBase;
	// Cada funcionario tem apenas um departamento
	private Departamento departamento;
	// Cada funcionario pode ter varios contratos, então é usada a lista para representar isso
	private List<ContratoHora> contratos = new ArrayList<>();
	
	public Funcionario(String nome, NivelFuncionario nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelFuncionario getNivel() {
		return nivel;
	}

	public void setNivel(NivelFuncionario nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}

	public void adicionarContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	
	public Double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar calendario = Calendar.getInstance();
		// Para cada ContratoHora em contratos
		for(ContratoHora contrato : contratos) {
			// Passando como parâmetro a data de cada contrato
			calendario.setTime(contrato.getData());
			int contrato_ano = calendario.get(Calendar.YEAR);
			int contrato_mes = 1 + calendario.get(Calendar.MONTH);
			
			if(contrato_ano == ano && contrato_mes == mes) {
				soma = soma + contrato.valorTotal();
			}
		}
		return soma;
	}
	
}
