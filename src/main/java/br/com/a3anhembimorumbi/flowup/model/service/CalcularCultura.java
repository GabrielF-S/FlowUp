package br.com.a3anhembimorumbi.flowup.model.service;

import br.com.a3anhembimorumbi.flowup.model.entities.Plantacao;

public interface CalcularCultura {

	// ETC - Vaporização da Cultura
	// ETo - Vaporizacao de referencia
	// KC = coeficiente da cultura

	// kc= ETC/ETo
	// ETo = kc.ETo

	public void CalcularKC(Plantacao plan);

	public void CalcularETo(Plantacao plan);

	public void CalcularETc(Plantacao plan);

}
