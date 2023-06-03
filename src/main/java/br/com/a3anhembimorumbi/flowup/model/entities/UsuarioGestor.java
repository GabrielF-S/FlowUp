package br.com.a3anhembimorumbi.flowup.model.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("UG")
public class UsuarioGestor extends Usuario{
	
	//private DAO<Terreno> terrenoDAO = new DAO<>(Terreno.class);

	public UsuarioGestor(String nome, String sobrenome, String login, String senha) {
		super(nome, sobrenome, login, senha);
	}

	public Terreno CadastrarAreaTotal(String nome, String regiao, long area) {
		Terreno espaco = new Terreno(nome, regiao, area);

		return espaco;
	}

	public Plantacao CadastrarPlantacao(String nome, long area, String plantacao, int qtdeAguaAno, Terreno local) {
		Plantacao plan = new Plantacao(nome, area, plantacao, qtdeAguaAno, local, 0);
		
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

//	public void relatorioDeConsumo() {
//		
//		List<Terreno> terrenos = terrenoDAO.obterTodos();
//		int consumoTotalAgua =0;
//		int consumoTotalPesticida = 0;
//		for(Terreno terreno :terrenos ) {
//			List<Plantacao> plantacoes = terreno.getPlantacoes();
//			for(Plantacao plan : plantacoes) {
//				consumoTotalAgua += plan.getQtdeAguaAno();
//				for(Pesticida pest : plan.getRotina().getPesticida()) {
//					consumoTotalPesticida+= pest.getQuantidadeUso();
//				}
//			}
//			System.out.println("Area Disponivel :" + terreno.getAreaTotalDisponivel()+"/"+terreno.getArea()+"/n" );
//			
//			System.out.println("O Consumo de agua é: "+ consumoTotalAgua);
//			System.out.println("O Consumo de pesticida é: "+ consumoTotalPesticida);
//		}
//		
//	}

}
