package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "eleicoes", name = "governador")
@SequenceGenerator(name = "seq_governador", allocationSize = 1, sequenceName = "eleicoes.seq_governador")
public class Governador {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_governador")
	@Column(name = "idgovernador")
	private Integer id;
	
	@Column(name = "vice_governador")
	private String viceGovernador;
	
	@Column(name = "sigla_governador")
	private String sigla;
	
	@Column(name = "uf_governador")
	private String uf;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "candidato_idcandidato")
	private Candidato candidato;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getViceGovernador() {
		return viceGovernador;
	}

	public void setViceGovernador(String viceGovernador) {
		this.viceGovernador = viceGovernador;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	
}
