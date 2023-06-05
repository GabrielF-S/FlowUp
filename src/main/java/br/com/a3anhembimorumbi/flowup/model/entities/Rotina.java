package br.com.a3anhembimorumbi.flowup.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.a3anhembimorumbi.flowup.model.Frequencia;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;

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
	@Transient
	private boolean irrigado =false;
	
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
		if(isAprovado()) {
			this.ativado = ativado;
		}
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

	

	public boolean isIrrigado() {
		return irrigado;
	}



	public void setIrrigado(boolean irrigado) {
		this.irrigado = irrigado;
	}



	public boolean verificarIrrigacao() {
		
		try {
			if (plantacao.getUltimaIrrigcao()!= LocalDate.now() && isAprovado() && isAtivado()) {
				Thread.sleep(5000);
				setIrrigado(true);	
				plantacao.setUltimaIrrigcao(LocalDate.now());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isIrrigado();
	}



	




	
}
