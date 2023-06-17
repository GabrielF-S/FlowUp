package br.com.a3anhembimorumbi.flowup.model.entities;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TerrenoTeste {
	@Test
	public void deveRetornarAreaTotal() {
		// cenario
		Terreno terreno = new Terreno("Area1","Nordeste",200L);

		// acao
		
		long areaTotal = terreno.getArea();

//		resultado
		
		Assertions.assertThat(areaTotal).isEqualTo(200L);

	}
	
	@Test
	public void deveRetornarAreaTotalDisponivel_QuandoSolicitado() {
		
		//cenario
		Terreno terreno = new Terreno("Area1","Nordeste",200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno, 0);
		
		
		//acao
		terreno.adicionarPlantacao(plan);
		long areaTotal = terreno.getAreaTotalDisponivel();
		
		//resultado
		
		Assertions.assertThat(areaTotal).isEqualTo(100L);
		
	}
	@Test
	public void deveRetornarAreaTotalDisponivel_QuandoTemPlantacoesAtreladas() {
		
		//cenario
		Terreno terreno = new Terreno("Area1","Nordeste",200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno, 0);
		Plantacao plan2 = new Plantacao("PLantacao2", 50L, "Algodao", 15, terreno, 0);
		
		//acao
		terreno.adicionarPlantacao(plan);
		terreno.adicionarPlantacao(plan2);
		long areaTotal = terreno.getAreaTotalDisponivel();
		
		//resultado
		
		Assertions.assertThat(areaTotal).isEqualTo(50L);
		
	}
	@Test
	public void deveRetornarArea_QuandoEstiverSemAreaDisponivel() {
		
		//cenario
		Terreno terreno = new Terreno("Area1","Nordeste",200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno, 0);
		Plantacao plan2 = new Plantacao("PLantacao2", 150L, "Algodao", 15, terreno, 0);
		
		//acao
		terreno.adicionarPlantacao(plan);
		terreno.adicionarPlantacao(plan2);
		long areaTotal = terreno.getAreaTotalDisponivel();
		
		//resultado
		
		Assertions.assertThat(areaTotal).isEqualTo(100L);
		
	}

	
}
