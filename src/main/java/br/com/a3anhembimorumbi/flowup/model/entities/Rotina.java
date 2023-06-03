package br.com.a3anhembimorumbi.flowup.model.entities;

import java.util.ArrayList;
import java.util.List;

import br.com.a3anhembimorumbi.flowup.model.Frequencia;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Rotina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nome;
	@OneToOne(mappedBy = "rotina")
	private Plantacao plantacao;

	private Frequencia freuencia;

	private boolean aprovado;

	private boolean ativado;
	@ManyToMany(mappedBy = "rotina")
	private List<Pesticida> pesticida;
	

	public Rotina(String nome, Plantacao plantacao, Frequencia freuencia) {
		super();
		setNome(nome);
		setPlantacao(plantacao);
		setFreuencia(freuencia);
		setAprovado(false);
		setAtivado(false);
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

	public int getId() {
		return id;
	}



	public List<Pesticida> getPesticida() {
		if(pesticida == null) {
			pesticida = new ArrayList<>();
		}
		return pesticida;
	}



	public void setPesticida(List<Pesticida> pesticida) {
		
		this.pesticida = pesticida;
		
	}



	public void cadastrarPesticida(Pesticida p) {

			if (p != null && !getPesticida().contains(p)) {
				getPesticida().add(p);
				

			}
		
		
	}



	




	
}
