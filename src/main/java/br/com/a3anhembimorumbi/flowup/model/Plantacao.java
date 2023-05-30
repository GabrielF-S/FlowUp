package br.com.a3anhembimorumbi.flowup.model;

public class Plantacao {
	
	private int id;
	
	private String nome;
	
	private long area;
	
	private String platacao;
	
	private long qtdeAguaAno;
	
	
	private Terreno local;


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
