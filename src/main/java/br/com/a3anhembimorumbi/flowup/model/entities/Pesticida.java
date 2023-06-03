package br.com.a3anhembimorumbi.flowup.model.entities;

import java.util.List;

import br.com.a3anhembimorumbi.flowup.model.Frequencia;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Pesticida {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	private Frequencia frequencia;
	
	private long quantidadeUso;
	@ManyToMany
	private List<Rotina> rotina;

	public Pesticida(String nome, Frequencia frequencia, long quantidadeUso) {
		super();
		this.nome = nome;
		this.frequencia = frequencia;
		this.quantidadeUso = quantidadeUso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Frequencia getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(Frequencia frequencia) {
		this.frequencia = frequencia;
	}

	public long getQuantidadeUso() {
		return quantidadeUso;
	}

	public void setQuantidadeUso(long quantidadeUso) {
		this.quantidadeUso = quantidadeUso;
	}

	public List<Rotina> getRotina() {
		return rotina;
	}

	public void setRotina(Rotina rotina) {
		this.rotina.add(rotina);
	}
	
	
	
	

}
