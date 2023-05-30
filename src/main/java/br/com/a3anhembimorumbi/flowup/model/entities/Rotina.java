package br.com.a3anhembimorumbi.flowup.model;

public class Rotina {
	
	private int id;
	
	private String nome;
	
	private Plantacao plantacao;
	
	private Frequencia freuencia;
	
	private boolean aprovado = false;
	
	private boolean ativado = false;

	public Rotina(String nome, Plantacao plantacao, Frequencia freuencia) {
		super();
		this.nome = nome;
		this.plantacao = plantacao;
		this.freuencia = freuencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Plantacao getPlantacao() {
		return plantacao;
	}

	public void setPlantacao(Plantacao plantacao) {
		this.plantacao = plantacao;
	}

	public Frequencia getFreuencia() {
		return freuencia;
	}

	public void setFreuencia(Frequencia freuencia) {
		this.freuencia = freuencia;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public boolean isAtivado() {
		return ativado;
	}

	public void setAtivado(boolean ativado) {
		this.ativado = ativado;
	}
	
	
	
	

}
