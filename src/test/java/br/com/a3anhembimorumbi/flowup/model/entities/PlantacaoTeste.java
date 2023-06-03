package br.com.a3anhembimorumbi.flowup.model.entities;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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
