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
@Table(schema = "eleicoes", name = "prefeito")
@SequenceGenerator(name = "seq_prefeito", allocationSize = 1, sequenceName = "eleicoes.seq_prefeito")
public class Prefeito {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_prefeito")
	@Column(name = "idprefeito")
	private Integer id;
	
	@Column(name = "uf_prefeito")
	private String ufPrefeito;
	
	@Column(name = "vice_prefeito")
	private String vicePrefeito;
	
	@Column(name = "cidade_prefeito")
	private String cidade;
	
	@Column(name = "sigla_prefeito")
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

	public String getUfPrefeito() {
		return ufPrefeito;
	}

	public void setUfPrefeito(String ufPrefeito) {
		this.ufPrefeito = ufPrefeito;
	}

	public String getVicePrefeito() {
		return vicePrefeito;
	}

	public void setVicePrefeito(String vicePrefeito) {
		this.vicePrefeito = vicePrefeito;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
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
