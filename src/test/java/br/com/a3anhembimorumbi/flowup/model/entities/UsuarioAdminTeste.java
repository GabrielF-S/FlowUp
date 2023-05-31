package br.com.a3anhembimorumbi.flowup.model.entities;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioAdminTeste {
	
	@Test
	public void when_createComunUSer_returnCOmunUser() {
		
		//cenario
		UsuarioAdmin admin = new UsuarioAdmin("Marcelo", "Soares", "marso", "mar123456");
		
		//ação
		UsuarioComum usuaurioComun = admin.CadastrarusuarioComun("Arthur","Perereira", "artpe", "art123456");
		
		//resultado
		Assertions.assertThat(usuaurioComun).isInstanceOf(UsuarioComum.class);
		
	}
	
	@Test
	public void when_createComunUSer_notReturnUserAdminType() {
		
		//cenario
		UsuarioAdmin admin = new UsuarioAdmin("Marcelo", "Soares", "marso", "mar123456");
		
		//ação
		UsuarioComum usuaurioComun = admin.CadastrarusuarioComun("Arthur","Perereira", "artpe", "art123456");
		
		//resultado
		Assertions.assertThat(usuaurioComun).isNotInstanceOf(UsuarioAdmin.class);
		
	}
	@Test
	public void when_createComunUSer_notReturnUserGestorType() {
		
		//cenario
		UsuarioAdmin admin = new UsuarioAdmin("Marcelo", "Soares", "marso", "mar123456");
		
		//ação
		UsuarioComum usuaurioComun = admin.CadastrarusuarioComun("Arthur","Perereira", "artpe", "art123456");
		
		//resultado
		Assertions.assertThat(usuaurioComun).isNotInstanceOf(UsuarioGestor.class);
		
	}
	
	@Test
	public void when_createGestorUSer_returnGestorUser() {
		
		//cenario
		UsuarioAdmin admin = new UsuarioAdmin("Marcelo", "Soares", "marso", "mar123456");
		
		//ação
		UsuarioGestor usuarioGestor = admin.CadastrarusuarioGestor("Arthur","Perereira", "artpe", "art123456");
		
		//resultado
		Assertions.assertThat(usuarioGestor).isInstanceOf(UsuarioGestor.class);
		
	}
	
	@Test
	public void when_createGestorUSer_notReturnUserComunType() {
		
		//cenario
		UsuarioAdmin admin = new UsuarioAdmin("Marcelo", "Soares", "marso", "mar123456");
		
		//ação
		UsuarioGestor usuarioGestor = admin.CadastrarusuarioGestor("Arthur","Perereira", "artpe", "art123456");
		
		//resultado
		Assertions.assertThat(usuarioGestor).isNotInstanceOf(UsuarioComum.class);
		
	}
	
	@Test
	public void when_createGestorUSer_notReturnUserAdminType() {
		
		//cenario
		UsuarioAdmin admin = new UsuarioAdmin("Marcelo", "Soares", "marso", "mar123456");
		
		//ação
		UsuarioGestor usuarioGestor = admin.CadastrarusuarioGestor("Arthur","Perereira", "artpe", "art123456");
		
		//resultado
		Assertions.assertThat(usuarioGestor).isNotInstanceOf(UsuarioAdmin.class);
		
	}
	

}
