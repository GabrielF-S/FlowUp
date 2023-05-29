package br.com.a3anhembimorumbi.flowup.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaTeste {
	@Test
	public void when_return_totalArea() {
		// cenario
		Area area = new Area("Area1","Nordeste",200L);

		// acao
		
		long areaTotal = area.getArea();

//		resultado
		
		Assertions.assertThat(areaTotal).isEqualTo(200L);

	}
	
	@Test
	public void when_return_TotalAreaDisponivel() {
		
		//cenario
		Area area = new Area("Area1","Nordeste",200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, area);
		
		
		//acao
		area.adicionarPlantacao(plan);
		long areaTotal = area.getAreaTotalDisponivel();
		
		//resultado
		
		Assertions.assertThat(areaTotal).isEqualTo(100L);
		
	}

	
}
