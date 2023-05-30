package br.com.a3anhembimorumbi.flowup.model.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Plantacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	private long area;
	
	private String platacao;
	
	private long qtdeAguaAno;
	
	@ManyToOne
	private Terreno local;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name ="rotina_id", unique = true)
	private Rotina rotina;


	public Plantacao(String nome, long area, String platacao, long qtdeAguaAno, Terreno local) {
		super();
		setNome(nome);
		setArea(area);
		setPlatacao(platacao);
		setQtdeAguaAno(qtdeAguaAno);
		setLocal(local);
		local.adicionarPlantacao(this);
	}


	public int getId() {
		return id;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public long getArea() {
		return area;
	}


	public void setArea(long area) {
		this.area = area;
	}


	public String getPlatacao() {
		return platacao;
	}


	public void setPlatacao(String platacao) {
		this.platacao = platacao;
	}


	public long getQtdeAguaAno() {
		return qtdeAguaAno;
	}


	public void setQtdeAguaAno(long qtdeAguaAno) {
		this.qtdeAguaAno = qtdeAguaAno;
	}


	public Terreno getLocal() {
		return local;
	}


	public void setLocal(Terreno local) {
		this.local = local;
	}
	
	

	
	
}
