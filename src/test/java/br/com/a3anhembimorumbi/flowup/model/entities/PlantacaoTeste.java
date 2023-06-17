package br.com.a3anhembimorumbi.flowup.model.entities;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.a3anhembimorumbi.flowup.model.Frequencia;
import br.com.a3anhembimorumbi.flowup.model.service.EmailService;

public class PlantacaoTeste {
	@InjectMocks 
	private Plantacao plantacao;
	@Mock
	private EmailService emailService;
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void deveVerificarData() {
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("teste", 25, "pepino", 178, terreno, 48L);

		int resultado = plan.checarCiclo();	

		Assertions.assertThat(resultado).isEqualTo(-1);

	}
	@Test
	public void naoDeveNotificarGestor_QUandoNaoEsiverNoFimDoCiclor() {
		
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("teste", 25, "pepino", 178, terreno, 48L);

		boolean notificar = plan.notificarGestor();
		
		Assertions.assertThat(notificar).isFalse();
		
	}
	@Test
	public void NotificarGesto_QuandoChegarFimDoCiclor() {
		
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("teste", 25, "pepino", 178, terreno, 0);
		
		boolean notificar = plan.notificarGestor();
		
		Assertions.assertThat(notificar).isTrue();
		
	}
	@Test
	public void deveIrrigaraPlantacao_QuandoEstiverAprovadoEAtivado() {
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno, 0);
		Rotina rotina = new Rotina("Rotina1",plan , Frequencia.DIARIO);
		
		rotina.setAprovado(true);
		rotina.setAtivado(true);
		plan.setRotina(rotina);
		
		plan.verificarIrrigacao();
		
		
		Assertions.assertThat(plan.getUltimaIrrigcao()).isEqualTo(LocalDate.now());
		
	}
	@Test
	public void naoDeveAtivarIrrigacaoNaPlantacao_QuandoJAEstiverAtivado() {
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno, 0);
		Rotina rotina = new Rotina("Rotina1",plan , Frequencia.DIARIO);
		
		rotina.setAprovado(true);
		rotina.setAtivado(true);
		plan.setRotina(rotina);
		
		plan.setUltimaIrrigcao(LocalDate.now());
		plan.verificarIrrigacao();
		
		
		Assertions.assertThat(plan.getUltimaIrrigcao()).isNotNull();
		
	}
	@Test
	public void deveVerificarAUltimaIrrigacao() {
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("PLantacao1", 100L, "Pepino", 42, terreno, 0);
		Rotina rotina = new Rotina("Rotina1",plan , Frequencia.DIARIO);
		
		rotina.setAprovado(true);
		rotina.setAtivado(true);
		
		rotina.verificarIrrigacao();
		plan.getUltimaIrrigcao();
		
		Assertions.assertThat(plan.getUltimaIrrigcao()).isEqualTo(LocalDate.now());
		
	}
//	
//	@Test
//	public void EnvioNotificacaorFimDoCiclor() {
//		
//		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
//		plantacao = new Plantacao("teste", 25, "pepino", 178, terreno, 0);
//		UsuarioGestor usuario = new UsuarioGestor("Tomas", "Shelbi", "thosh", "tho12345");
//		
//		Mockito.when(emailService.notificarFinalDeCiclo(usuario, plantacao)).thenReturn(null);
//		plantacao.enviarNotificacao(usuario ,plantacao);
//		
//		verify(emailService).notificarFinalDeCiclo(usuario, plantacao);;
//	}
//	

}
