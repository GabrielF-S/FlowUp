package br.com.a3anhembimorumbi.flowup.model.entities;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.a3anhembimorumbi.flowup.model.Frequencia;

public class RotinaTeste {

	@Test
	public void deveVerificarUsoDePesticida() {
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno, 0);
		Rotina rotina = new Rotina("Rotina1",plan , Frequencia.DIARIO);
		
		Pesticida p = new Pesticida("Mata Rato",Frequencia.MENSAL, 12);
		rotina.cadastrarPesticida(p);
		
		
		
		Assertions.assertThat(rotina.getPesticida()).asList();
	}
	@Test
	public void deveVerificarUsoDePesticidaTeteNulo() {
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno, 0);
		Rotina rotina = new Rotina("Rotina1",plan , Frequencia.DIARIO);
		
		
		
		
		Assertions.assertThat(rotina.getPesticida()).isEmpty();
	}
	
	@Test
	public void deveVerificarIrrigacao() {
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno, 0);
		Rotina rotina = new Rotina("Rotina1",plan , Frequencia.DIARIO);
		
		rotina.setAprovado(true);
		rotina.setAtivado(true);
		boolean isIrrigator = rotina.verificarIrrigacao();
		
		
		Assertions.assertThat(isIrrigator).isTrue();
		
	}
	@Test
	public void naoDeveVerificarIrrigacao() {
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno, 0);
		Rotina rotina = new Rotina("Rotina1",plan , Frequencia.DIARIO);
		
		
		boolean isIrrigator = rotina.verificarIrrigacao();
		
		
		Assertions.assertThat(isIrrigator).isFalse();
		
	}

}
