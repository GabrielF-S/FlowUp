package br.com.a3anhembimorumbi.flowup.model;

public class UsuarioAdmin  extends Usuario{

	public UsuarioAdmin(String nome, String sobrenome, String login, String senha) {
		super(nome, sobrenome, login, senha);
		
	}
	
	
	public UsuarioComum CadastrarusuarioComun(String nome, String sobrenome, String login, String senha) {
		UsuarioComum usuarioComun = new UsuarioComum(nome, sobrenome, login, senha);
		
		return usuarioComun;
	}

}
