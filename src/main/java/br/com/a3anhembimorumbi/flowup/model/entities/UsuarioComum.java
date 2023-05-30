package br.com.a3anhembimorumbi.flowup.model;

public class UsuarioComum  extends Usuario{

	public UsuarioComum(String nome, String sobrenome, String login, String senha) {
		super(nome, sobrenome, login, senha);
		// TODO Auto-generated constructor stub
	}

	public Rotina CadastrarRotina(String nome, Plantacao plantacao, Frequencia frequencia) {
		Rotina rotina = new Rotina(nome, plantacao, frequencia);
		// TODO Auto-generated method stub
		return rotina;
	}
	
	

}
