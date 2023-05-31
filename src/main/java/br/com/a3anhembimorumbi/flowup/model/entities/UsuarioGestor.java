package br.com.a3anhembimorumbi.flowup.model.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("UG")
public class UsuarioGestor extends Usuario{
	

	public UsuarioGestor(String nome, String sobrenome, String login, String senha) {
		super(nome, sobrenome, login, senha);
	}

	public Terreno CadastrarAreaTotal(String nome, String regiao, long area) {
		Terreno espaco = new Terreno(nome, regiao, area);

		return espaco;
	}

	public Plantacao CadastrarPlantacao(String nome, long area, String plantacao, int qtdeAguaAno, Terreno local) {
		Plantacao plan = new Plantacao(nome, area, plantacao, qtdeAguaAno, local);
		
		return plan;
	}

	public void aprovarRotinas(Rotina rot) {
		if(!rot.isAprovado()) {
			rot.setAprovado(true);
		}
		
		
		
	}

	public void desativarRotinas(Rotina rot) {
		if(rot.isAtivado()) {
			rot.setAprovado(false);
		}
		
	}

}
