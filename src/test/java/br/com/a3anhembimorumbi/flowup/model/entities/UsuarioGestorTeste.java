package br.com.a3anhembimorumbi.flowup.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioGestorTeste {
	
	@Test
	public void when_createArea_then_returnArea() {
		//cenario
		UsuarioGestor usuario = new UsuarioGestor("Tomas","Shelbi", "thosh", "tho12345");
		
		//acao
		Terreno terreno = usuario.CadastrarAreaTotal("Area1","Nordeste",200L);
		
		//resultado
		Assertions.assertThat(terreno).isInstanceOf(Terreno.class);
		
	}
	@Test
	public void when_createPlantcao_then_returnPlantcao() {
		//cenario
		UsuarioGestor usuario = new UsuarioGestor("Tomas","Shelbi", "thosh", "tho12345");
		
		Terreno terreno = usuario.CadastrarAreaTotal("Area1","Nordeste",200L);
		//acao
		Plantacao plantacao = usuario.CadastrarPlantacao("PLantacao1", 100L, "Pepino", 42, terreno);
		
		//resultado
		Assertions.assertThat(plantacao).isInstanceOf(Plantacao.class);
		
	}

}
