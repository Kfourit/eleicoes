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
@Table(schema = "eleicoes", name = "deputado_federal")
@SequenceGenerator(name = "seq_deputado_federal", allocationSize = 1, sequenceName = "eleicoes.seq_deputado_federal")
public class DeputadoFederal {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_deputado_federal")
	@Column(name = "iddeputado_federal")
	private Integer id;
	
	@Column(name = "uf_deputado_federal")
	private String uf;
	
	@Column(name = "sigla_deputado_federal")
	private String sigla;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "candidato_idcandidato")
	private Candidato candidato;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
}
