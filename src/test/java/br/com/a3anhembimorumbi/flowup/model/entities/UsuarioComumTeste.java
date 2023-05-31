package br.com.a3anhembimorumbi.flowup.model.entities;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.a3anhembimorumbi.flowup.model.Frequencia;

public class UsuarioComumTeste {
	@Test
	public void cadastrarRotina() {
		// cenario
		UsuarioComum usuario = new UsuarioComum("Tomas", "Shelbi", "thosh", "tho12345");
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno);

		// ação
		Rotina rotina = usuario.CadastrarRotina("Rotina1", plan, Frequencia.DIARIO);

		// resultado
		Assertions.assertThat(rotina).isInstanceOf(Rotina.class);

	}

	@Test
	public void deveAtivarRotinadeIrrigacao() {
		// cenario
		UsuarioComum usuario = new UsuarioComum("Tomas", "Shelbi", "thosh", "tho12345");
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno);
		Rotina rotina = usuario.CadastrarRotina("Rotina1", plan, Frequencia.DIARIO);
		rotina.setAprovado(true);

		// ação

		usuario.ativaRotina(rotina);

		// resultado

		Assertions.assertThat(rotina.isAtivado()).isTrue();

	}

	@Test
	public void naoDeveAtivarRotinadeIrrigacao() {
		// cenario
		UsuarioComum usuario = new UsuarioComum("Tomas", "Shelbi", "thosh", "tho12345");
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno);
		Rotina rotina = usuario.CadastrarRotina("Rotina1", plan, Frequencia.DIARIO);

		// ação

		usuario.ativaRotina(rotina);

		// resultado

		Assertions.assertThat(rotina.isAtivado()).isFalse();

	}

	@Test
	public void deveEditarNomeRotinasdeIrrigacao() {
		// cenario
		UsuarioComum usuario = new UsuarioComum("Tomas", "Shelbi", "thosh", "tho12345");
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno);
		Rotina rotina = usuario.CadastrarRotina("Rotina1", plan, Frequencia.DIARIO);

		// ação

		usuario.editarNomeRotina(rotina);

		// resultado
		Assertions.assertThat(rotina.getNome()).isNotEqualToIgnoringCase("Rotina1");

	}
	@Test
	public void naoDeveEditarNomeRotinasdeIrrigacao() {
		// cenario
		UsuarioComum usuario = new UsuarioComum("Tomas", "Shelbi", "thosh", "tho12345");
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno);
		Rotina rotina = usuario.CadastrarRotina("Rotina1", plan, Frequencia.DIARIO);
		rotina.setAprovado(true);
		// ação
		
		usuario.editarNomeRotina(rotina);
		
		// resultado
		Assertions.assertThat(rotina.getNome()).isEqualTo("Rotina1");
		
	}
	@Test
	public void deveEditarPlantacaoRotinasdeIrrigacao() {
		// cenario
		UsuarioComum usuario = new UsuarioComum("Tomas", "Shelbi", "thosh", "tho12345");
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno);
		Rotina rotina = usuario.CadastrarRotina("Rotina1", plan, Frequencia.DIARIO);
		
		// ação
		
		usuario.editarPlantacaoRotina(rotina);
		
		// resultado
		Assertions.assertThat(rotina.getPlantacao().getPlatacao()).isNotEqualTo("Pepino");
		
	}
	@Test
	public void naoDeveEditarPlantacaoRotinasdeIrrigacao() {
		// cenario
		UsuarioComum usuario = new UsuarioComum("Tomas", "Shelbi", "thosh", "tho12345");
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno);
		Rotina rotina = usuario.CadastrarRotina("Rotina1", plan, Frequencia.DIARIO);
		rotina.setAprovado(true);
		// ação
		
		usuario.editarPlantacaoRotina(rotina);
		
		// resultado
		
		Assertions.assertThat(rotina.getPlantacao().getPlatacao()).isEqualTo("Pepino");
		
	}
	@Test
	public void deveEditarFrequenciaRotinasdeIrrigacao() {
		// cenario
		UsuarioComum usuario = new UsuarioComum("Tomas", "Shelbi", "thosh", "tho12345");
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno);
		Rotina rotina = usuario.CadastrarRotina("Rotina1", plan, Frequencia.DIARIO);
		
		// ação
		
		usuario.editarFrequenciaRotina(rotina);
		
		// resultado
		Assertions.assertThat(rotina.getFreuencia()).isNotEqualTo(Frequencia.DIARIO);
		
	}
	@Test
	public void naoDeveEditarFrequenciaRotinasdeIrrigacao() {
		// cenario
		UsuarioComum usuario = new UsuarioComum("Tomas", "Shelbi", "thosh", "tho12345");
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno);
		Rotina rotina = usuario.CadastrarRotina("Rotina1", plan, Frequencia.DIARIO);
		rotina.setAprovado(true);
		// ação
		
		usuario.editarFrequenciaRotina(rotina);
		
		// resultado
		Assertions.assertThat(rotina.getFreuencia()).isEqualTo(Frequencia.DIARIO);
		
	}

}
