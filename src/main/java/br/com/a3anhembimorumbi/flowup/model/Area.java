package br.com.a3anhembimorumbi.flowup.model;

import java.util.ArrayList;
import java.util.List;

public class Area {
	
	private int id;
	
	private String nome;
	
	private String regiao;
	
	private long area;
	
	private List<Plantacao> plantacoes;

	public Area(String nome, String regiao, long area) {
		super();
		setNome(nome);
		setRegiao(regiao);
		setArea(area);
		plantacoes = new ArrayList<>();
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

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public long getArea() {
		return area;
	}

	public void setArea(long area) {
		this.area = area;
	}
	
	public void adicionarPlantacao(Plantacao plantacao) {
		
		
			if(getAreaTotalDisponivel()- plantacao.getArea()>0) {
				plantacoes.add(plantacao);
			}
		
		
	}
	
	
	public long areaPlantacoes() {
		long areaUtilizada = 0;
		
		for(Plantacao plan : plantacoes) {
			areaUtilizada += plan.getArea();
		}
		
		return areaUtilizada;
		
		
	}

	public long getAreaTotalDisponivel() {
	
		long areaTotalDisponivel = area - areaPlantacoes();
		
		return areaTotalDisponivel;
	}
	
	
	

}
