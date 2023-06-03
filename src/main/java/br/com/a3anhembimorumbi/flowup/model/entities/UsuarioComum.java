package br.com.a3anhembimorumbi.flowup.model.entities;

import br.com.a3anhembimorumbi.flowup.model.Frequencia;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("UC")
public class UsuarioComum  extends Usuario{
//	@Transient
//	private EmailService email;
//	@Transient
//	private DAO<Rotina> rotinaDAO = new DAO<>(Rotina.class);
//	@Transient
//	private DAO<UsuarioComum> usuarioComumDAO = new DAO<>(UsuarioComum.class);

	public UsuarioComum(String nome, String sobrenome, String login, String senha) {
		super(nome, sobrenome, login, senha);
//		usuarioComumDAO.abrirTransacao().incluir(this).fecharTransacao();
		
	}

	public Rotina CadastrarRotina(String nome, Plantacao plantacao, Frequencia frequencia) {
		Rotina rotina = new Rotina(nome, plantacao, frequencia);
//		rotinaDAO.abrirTransacao().incluir(rotina).fecharTransacao();
		
		return rotina;
	}

	public void ativaRotina(Rotina rotina) {
//		rotina = rotinaDAO.abrirTransacao().obeterPorID(rotina);
		if(rotina.isAprovado()) {			
			rotina.setAtivado(true);
//			rotinaDAO.incluir(rotina).fecharTransacao();
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
			rotina.setPlantacao(new Plantacao("PLantacao2", 100, "Abobora", 76, mesmoTerreno, 0));
		}
		
	}

	public void editarFrequenciaRotina(Rotina rotina) {
		if(!rotina.isAprovado()) {
			rotina.setFreuencia(Frequencia.DIANDIAS);
		}
		
	}

//	public void notificarRotina(UsuarioGestor gestor, Rotina rot) {
//		email.notificarRotinaCadastrada(gestor, rot.getId());
//		
//	}
	
	

}
