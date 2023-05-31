package br.com.a3anhembimorumbi.flowup.model.entities;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.a3anhembimorumbi.flowup.model.Frequencia;

public class UsuarioGestorTeste {
	

	@Test
	public void when_createArea_then_returnArea() {
		// cenario
		UsuarioGestor usuario = new UsuarioGestor("Tomas", "Shelbi", "thosh", "tho12345");

		// acao
		Terreno terreno = usuario.CadastrarAreaTotal("Area1", "Nordeste", 200L);

		// resultado
		Assertions.assertThat(terreno).isInstanceOf(Terreno.class);

	}

	@Test
	public void when_createPlantcao_then_returnPlantcao() {
		// cenario
		UsuarioGestor usuario = new UsuarioGestor("Tomas", "Shelbi", "thosh", "tho12345");

		Terreno terreno = usuario.CadastrarAreaTotal("Area1", "Nordeste", 200L);
		// acao
		Plantacao plantacao = usuario.CadastrarPlantacao("PLantacao1", 100L, "Pepino", 42, terreno);

		// resultado
		Assertions.assertThat(plantacao).isInstanceOf(Plantacao.class);

	}

	@Test
	public void when_approval_rotina() {
		// cenario
		UsuarioGestor usuario = new UsuarioGestor("Tomas", "Shelbi", "thosh", "tho12345");
		Terreno terreno = usuario.CadastrarAreaTotal("Area1", "Nordeste", 200L);
		Plantacao plantacao = usuario.CadastrarPlantacao("PLantacao1", 100L, "Pepino", 42, terreno);
		Rotina rot = new Rotina("Rotina1", plantacao, Frequencia.DIARIO);
		// acao
		
	    usuario.aprovarRotinas(rot);

		// retorno
	    Assertions.assertThat(rot.isAprovado()).isTrue();
	   
	}
	@Test
	public void when_desativar_rotina() {
		// cenario
		UsuarioGestor usuario = new UsuarioGestor("Tomas", "Shelbi", "thosh", "tho12345");
		Terreno terreno = usuario.CadastrarAreaTotal("Area1", "Nordeste", 200L);
		Plantacao plantacao = usuario.CadastrarPlantacao("PLantacao1", 100L, "Pepino", 42, terreno);
		Rotina rot = new Rotina("Rotina1", plantacao, Frequencia.DIARIO);
		rot.setAtivado(true);
		// acao
		
		usuario.desativarRotinas(rot);
		
		// retorno
		Assertions.assertThat(rot.isAtivado()).isTrue();
		
	}

}
