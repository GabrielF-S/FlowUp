package br.com.a3anhembimorumbi.flowup.model.entities;

//import br.com.a3anhembimorumbi.flowup.model.service.Repositorio;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
//import jakarta.persistence.Transient;

@Entity
@DiscriminatorValue("UA")
public class UsuarioAdmin  extends Usuario{
//	@Transient
//	private Repositorio repositorio;
	
	public UsuarioAdmin(String nome, String sobrenome, String login, String senha) {
		super(nome, sobrenome, login, senha);
		
	}
	
	
	public UsuarioComum cadastrarUsuarioComum(String nome, String sobrenome, String login, String senha) {
		UsuarioComum usuarioComun = new UsuarioComum(nome, sobrenome, login, senha);
		
		return usuarioComun;
	}


	public UsuarioGestor CadastrarusuarioGestor(String nome, String sobrenome, String login, String senha) {
		UsuarioGestor usuarioGestor = new UsuarioGestor(nome, sobrenome, login, senha);
//		repositorio.save(usuarioGestor);
		return  usuarioGestor;
	}

}
