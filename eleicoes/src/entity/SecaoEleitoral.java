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
@Table(schema = "eleicoes", name = "secao_eleitoral")
@SequenceGenerator(name = "seq_secao_eleitoral", allocationSize = 1, sequenceName = "eleicoes.seq_secao_eleitoral")
public class SecaoEleitoral {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_secao_eleitoral")
	@Column(name = "idsecao")
	private Integer id;
	
	@Column(name = "numero_secao")
	private Integer numeroSecao;
	
	@Column(name = "local_secao")
	private String localSecao;
	
	@Column(name = "chefe_secao")
	private String chefeSecao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numero_zona")
	private ZonaEleitoral zonaEleitoral;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "secaoEleitoral")
	private List<Eleitor> eleitores = new ArrayList<Eleitor>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "secaoEleitoral")
	private List<Urna> urnas = new ArrayList<Urna>(0);

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroSecao() {
		return numeroSecao;
	}

	public void setNumeroSecao(Integer numeroSecao) {
		this.numeroSecao = numeroSecao;
	}

	public String getLocalSecao() {
		return localSecao;
	}

	public void setLocalSecao(String localSecao) {
		this.localSecao = localSecao;
	}

	public String getChefeSecao() {
		return chefeSecao;
	}

	public void setChefeSecao(String chefeSecao) {
		this.chefeSecao = chefeSecao;
	}

	public ZonaEleitoral getZonaEleitoral() {
		return zonaEleitoral;
	}

	public void setZonaEleitoral(ZonaEleitoral zonaEleitoral) {
		this.zonaEleitoral = zonaEleitoral;
	}

	public List<Eleitor> getEleitores() {
		return eleitores;
	}

	public void setEleitores(List<Eleitor> eleitores) {
		this.eleitores = eleitores;
	}

	public List<Urna> getUrnas() {
		return urnas;
	}

	public void setUrnas(List<Urna> urnas) {
		this.urnas = urnas;
	}
}
