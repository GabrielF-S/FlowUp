package br.com.a3anhembimorumbi.flowup.model.service;

import br.com.a3anhembimorumbi.flowup.model.entities.Plantacao;
import br.com.a3anhembimorumbi.flowup.model.entities.Rotina;
import br.com.a3anhembimorumbi.flowup.model.entities.UsuarioGestor;

public interface EmailService {
	
	public void notificarRotinaCadastrada(UsuarioGestor gestor, Rotina rotina);
	
	public void notificarFinalDeCiclo(UsuarioGestor gestor, Plantacao plan);

}
