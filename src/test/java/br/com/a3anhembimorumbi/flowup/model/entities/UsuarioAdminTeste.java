package br.com.a3anhembimorumbi.flowup.model.entities;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioAdminTeste {
	
	@Test
	public void deveCriarUsuarioComumERetornalo() {
		
		//cenario
		UsuarioAdmin admin = new UsuarioAdmin("Marcelo", "Soares", "marso", "mar123456");
		
		//ação
		UsuarioComum usuaurioComum = admin.cadastrarUsuarioComum("Arthur","Perereira", "artpe", "art123456");
		
		//resultado
		Assertions.assertThat(usuaurioComum).isInstanceOf(UsuarioComum.class);
		
	}
	
	@Test
	public void deveVerificarSeNaoCriouUsuarioAdmin_QuandoUmUsuarioComum() {
		
		//cenario
		UsuarioAdmin admin = new UsuarioAdmin("Marcelo", "Soares", "marso", "mar123456");
		
		//ação
		UsuarioComum usuaurioComum = admin.cadastrarUsuarioComum("Arthur","Perereira", "artpe", "art123456");
		
		//resultado
		Assertions.assertThat(usuaurioComum).isNotInstanceOf(UsuarioAdmin.class);
		
	}
	@Test
	public void deveVerificarSeCriouUsuarioComumNaoGestor_QuandoSolicitadoUmUsuarioComum() {
		
		//cenario
		UsuarioAdmin admin = new UsuarioAdmin("Marcelo", "Soares", "marso", "mar123456");
		
		//ação
		UsuarioComum usuaurioComum = admin.cadastrarUsuarioComum("Arthur","Perereira", "artpe", "art123456");
		
		//resultado
		Assertions.assertThat(usuaurioComum).isNotInstanceOf(UsuarioGestor.class);
		
	}
	
	@Test
	public void deveCriarUsuarioGestorERetornalo() {
		
		//cenario
		UsuarioAdmin admin = new UsuarioAdmin("Marcelo", "Soares", "marso", "mar123456");
		
		//ação
		UsuarioGestor usuarioGestor = admin.CadastrarusuarioGestor("Arthur","Perereira", "artpe", "art123456");
		
		//resultado
		Assertions.assertThat(usuarioGestor).isInstanceOf(UsuarioGestor.class);
		
	}
	
	@Test
	public void deveVerificarSeCriouUsuarioGestorNaoComum_QuandoSolicitadoUmUsuarioGestor() {
		
		//cenario
		UsuarioAdmin admin = new UsuarioAdmin("Marcelo", "Soares", "marso", "mar123456");
		
		//ação
		UsuarioGestor usuarioGestor = admin.CadastrarusuarioGestor("Arthur","Perereira", "artpe", "art123456");
		
		//resultado
		Assertions.assertThat(usuarioGestor).isNotInstanceOf(UsuarioComum.class);
		
	}
	
	@Test
	public void deveVerificarSeCriouUsuarioGestorNaoAdmin_QuandoSolicitadoUmUsuarioGestor() {
		
		//cenario
		UsuarioAdmin admin = new UsuarioAdmin("Marcelo", "Soares", "marso", "mar123456");
		
		//ação
		UsuarioGestor usuarioGestor = admin.CadastrarusuarioGestor("Arthur","Perereira", "artpe", "art123456");
		
		//resultado
		Assertions.assertThat(usuarioGestor).isNotInstanceOf(UsuarioAdmin.class);
		
	}
	

}
