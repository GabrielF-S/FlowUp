package br.com.a3anhembimorumbi.flowup.model.entities;

import java.time.LocalDate;

import br.com.a3anhembimorumbi.flowup.model.service.EmailService;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;

@Entity
public class Plantacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	private long area;
	
	private String platacao;
	
	private long qtdeAguaAno;
	
	@ManyToOne
	private Terreno local;
	
	private long ciclo;
	
	private LocalDate inicio;
	
	private LocalDate finalCiclo;
	@Transient
	private EmailService email;

	private LocalDate ultimaIrrigcao;
	
	@OneToOne
	@JoinColumn(name ="rotina_id", unique = true)
	private Rotina rotina;


	public LocalDate getUltimaIrrigcao() {
		return ultimaIrrigcao;
	}




	public void setUltimaIrrigcao(LocalDate ultimaIrrigcao) {
		this.ultimaIrrigcao = ultimaIrrigcao;
	}




	public Plantacao(String nome, long area, String platacao, long qtdeAguaAno, Terreno local, long ciclo) {
		super();
		setNome(nome);
		setArea(area);
		setPlatacao(platacao);
		setQtdeAguaAno(qtdeAguaAno);
		setLocal(local);
		setCiclo(ciclo);
		local.adicionarPlantacao(this);
		inicio =LocalDate.now();
		
		definirFinal();
		
		
		
	}




	public int getId() {
		return id;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public long getArea() {
		return area;
	}


	public void setArea(long area) {
		this.area = area;
	}


	public String getPlatacao() {
		return platacao;
	}


	public void setPlatacao(String platacao) {
		this.platacao = platacao;
	}


	public long getQtdeAguaAno() {
		return qtdeAguaAno;
	}


	public void setQtdeAguaAno(long qtdeAguaAno) {
		this.qtdeAguaAno = qtdeAguaAno;
	}


	public Terreno getLocal() {
		return local;
	}


	public void setLocal(Terreno local) {
		this.local = local;
	}


	public long getCiclo() {
		return ciclo;
	}


	public void setCiclo(long ciclo) {
		this.ciclo = ciclo;
	}


	public LocalDate getInicio() {
		return inicio;
	}


	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}


	public Rotina getRotina() {
		return rotina;
	}


	public void setRotina(Rotina rotina) {
		this.rotina = rotina;
	}

	public LocalDate getFinalCiclo() {
		return finalCiclo;
	}
	
	
	public void setFinalCiclo(LocalDate finalCiclo) {
		this.finalCiclo = finalCiclo;
	}

	
	private void definirFinal() {
				
		setFinalCiclo(getInicio().plusDays(getCiclo()));
		
	}
	
	public int checarCiclo() {
		
		LocalDate dataAtual = LocalDate.now();
		
		int cicloValido = dataAtual.compareTo(getFinalCiclo());
			
		return cicloValido;
	}




	public boolean notificarGestor() {
		if(checarCiclo()>=0) {
			return true;
		}		
		return false;
	}




	public void verificarIrrigacao() {
		if(getUltimaIrrigcao()!= LocalDate.now()) {
			rotina.verificarIrrigacao();
		}
		
	}




	public void enviarNotificacao(UsuarioGestor gestor, Plantacao plan) {
		if(notificarGestor()) {
			email.notificarFinalDeCiclo(gestor, plan);
		}
	}
	
	

	
	
}
