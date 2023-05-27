package br.com.a3anhembimorumbi.flowup.model;

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
	public void when_createComunUSer_notReturnOtherTypeUser() {
		
		//cenario
		UsuarioAdmin admin = new UsuarioAdmin("Marcelo", "Soares", "marso", "mar123456");
		
		//ação
		UsuarioComum usuaurioComun = admin.CadastrarusuarioComun("Arthur","Perereira", "artpe", "art123456");
		
		//resultado
		Assertions.assertThat(usuaurioComun).isNotInstanceOf(UsuarioAdmin.class);
		
	}
	

}
