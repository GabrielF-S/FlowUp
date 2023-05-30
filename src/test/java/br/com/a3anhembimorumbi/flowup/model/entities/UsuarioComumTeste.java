package br.com.a3anhembimorumbi.flowup.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioComumTeste {
	@Test
	public void cadastrarRotina() {
		//cenario
		UsuarioComum usuario = new UsuarioComum("Tomas","Shelbi", "thosh", "tho12345");
		Terreno terreno = new Terreno("Area1","Nordeste",200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno);
		
		//ação		
		Rotina rotina = usuario.CadastrarRotina("Rotina1", plan, Frequencia.DIARIO);
		
		
		//resultado
		Assertions.assertThat(rotina).isInstanceOf(Rotina.class);
		
	}

}
