package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "eleicoes", name = "urna")
@SequenceGenerator(name = "seq_urna", allocationSize = 1, sequenceName = "eleicoes.seq_urna")
public class Urna {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_urna")
	@Column(name = "idurna")
	private Integer id;
	
	@Column(name = "modelo_urna")
	private String modeloUrna;
	
	@Column(name = "tipo_terminal_urna")
	private String tipoDeTerminalUrna;
	
	@Column(name = "presidente_mesa_urna")
	private String presidenteMesaUrna;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "secao_eleitoral_idsecao")
	private SecaoEleitoral secaoEleitoral;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "urna")
	private List<Eleitor> eleitores = new ArrayList<Eleitor>(0);

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModeloUrna() {
		return modeloUrna;
	}

	public void setModeloUrna(String modeloUrna) {
		this.modeloUrna = modeloUrna;
	}

	public String getTipoDeTerminalUrna() {
		return tipoDeTerminalUrna;
	}

	public void setTipoDeTerminalUrna(String tipoDeTerminalUrna) {
		this.tipoDeTerminalUrna = tipoDeTerminalUrna;
	}

	public String getPresidenteMesaUrna() {
		return presidenteMesaUrna;
	}

	public void setPresidenteMesaUrna(String presidenteMesaUrna) {
		this.presidenteMesaUrna = presidenteMesaUrna;
	}

	public SecaoEleitoral getSecaoEleitoral() {
		return secaoEleitoral;
	}

	public void setSecaoEleitoral(SecaoEleitoral secaoEleitoral) {
		this.secaoEleitoral = secaoEleitoral;
	}

	public List<Eleitor> getEleitores() {
		return eleitores;
	}

	public void setEleitores(List<Eleitor> eleitores) {
		this.eleitores = eleitores;
	}

}
