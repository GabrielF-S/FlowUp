package br.com.a3anhembimorumbi.flowup.model;

public abstract class Usuario {
	
	private int  id;
	
	private String nome;
	
	private String sobrenome;
		
	private String login;
	
	private String senha;

	public Usuario(String nome, String sobrenome, String login, String senha) {
		super();
		setNome(nome);
		setSobrenome(sobrenome);
		setSenha(senha);
		setLogin(login);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	
	
	

}
