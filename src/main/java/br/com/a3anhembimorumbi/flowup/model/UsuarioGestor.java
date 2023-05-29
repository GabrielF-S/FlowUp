package br.com.a3anhembimorumbi.flowup.model;

public class UsuarioGestor extends Usuario{

	public UsuarioGestor(String nome, String sobrenome, String login, String senha) {
		super(nome, sobrenome, login, senha);
	}

	public Area CadastrarAreaTotal(String nome, String regiao, long area) {
		Area espaco = new Area(nome, regiao, area);

		return espaco;
	}

	public Plantacao CadastrarPlantacao(String nome, long area, String plantacao, int qtdeAguaAno, Area local) {
		Plantacao plan = new Plantacao(nome, area, plantacao, qtdeAguaAno, local);
		
		return plan;
	}

}