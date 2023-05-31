package br.com.a3anhembimorumbi.flowup.model.entities;

import br.com.a3anhembimorumbi.flowup.model.Frequencia;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("UC")
public class UsuarioComum  extends Usuario{

	public UsuarioComum(String nome, String sobrenome, String login, String senha) {
		super(nome, sobrenome, login, senha);
		// TODO Auto-generated constructor stub
	}

	public Rotina CadastrarRotina(String nome, Plantacao plantacao, Frequencia frequencia) {
		Rotina rotina = new Rotina(nome, plantacao, frequencia);
		// TODO Auto-generated method stub
		return rotina;
	}

	public void ativaRotina(Rotina rotina) {
		if(rotina.isAprovado()) {
			rotina.setAtivado(true);
		}
		
		
	}

	public void editarNomeRotina(Rotina rotina) {
		if(!rotina.isAprovado()) {
			String novoNome= "NovoNome";
			rotina.setNome(novoNome);
		}
		
	}

	public void editarPlantacaoRotina(Rotina rotina) {
		if(!rotina.isAprovado()) {
			Terreno mesmoTerreno =rotina.getPlantacao().getLocal();
			rotina.setPlantacao(new Plantacao("PLantacao2", 100, "Abobora", 76, mesmoTerreno));
		}
		
	}

	public void editarFrequenciaRotina(Rotina rotina) {
		if(!rotina.isAprovado()) {
			rotina.setFreuencia(Frequencia.DIANDIAS);
		}
		
	}
	
	

}
