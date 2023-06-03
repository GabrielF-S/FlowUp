package br.com.a3anhembimorumbi.flowup.model.service;

import br.com.a3anhembimorumbi.flowup.model.entities.Plantacao;
import br.com.a3anhembimorumbi.flowup.model.entities.UsuarioGestor;

public interface EmailService {
	
	public void notificarRotinaCadastrada(UsuarioGestor gestor, int id);
	
	public void notificarFinalDeCiclo(UsuarioGestor gestor, Plantacao plan);
	

}
