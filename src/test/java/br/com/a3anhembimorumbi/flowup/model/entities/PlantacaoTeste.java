package br.com.a3anhembimorumbi.flowup.model.entities;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.a3anhembimorumbi.flowup.model.Frequencia;

public class PlantacaoTeste {
//	@InjectMocks @Spy
//	private Plantacao plantacao;
//	@Mock
//	private EmailService emailService;
//	@Before
//	public void setup() {
//		MockitoAnnotations.initMocks(this);
//	}

	@Test
	public void verificarData() {
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("teste", 25, "pepino", 178, terreno, 48L);

		int resultado = plan.checarCiclo();	

		Assertions.assertThat(resultado).isEqualTo(-1);

	}
	@Test
	public void naoNotificarFimDoCiclor() {
		
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("teste", 25, "pepino", 178, terreno, 48L);

		boolean notificar = plan.notificarGestor();
		
		Assertions.assertThat(notificar).isFalse();
		
	}
	@Test
	public void NotificarFimDoCiclor() {
		
		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
		Plantacao plan = new Plantacao("teste", 25, "pepino", 178, terreno, 0);
		
		boolean notificar = plan.notificarGestor();
		
		Assertions.assertThat(notificar).isTrue();
		
	}
	@Test
	public void deveAtivarIrrigacaoNaPlantacao() {
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
	public void naoDeveAtivarIrrigacaoNaPlantacao() {
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
//	@Disabled
//	@Test
//	public void EnvioNotificacaorFimDoCiclor() {
//		
//		Terreno terreno = new Terreno("Area1", "Nordeste", 200L);
//		Plantacao plan = new Plantacao("teste", 25, "pepino", 178, terreno, 0);
//		UsuarioGestor usuario = new UsuarioGestor("Tomas", "Shelbi", "thosh", "tho12345");
//		
//		Mockito.mock(EmailService.class);
//		plan.enviarNotificacao(usuario ,plan);
//		
//		verify(emailService).notificarFinalDeCiclo(usuario, plan);;
//	}
	

}
