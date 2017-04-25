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
@Table(schema = "eleicoes", name = "senador")
@SequenceGenerator(name = "seq_senador", allocationSize = 1, sequenceName = "eleicoes.seq_senador")
public class Senador {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_senador")
	@Column(name = "idsenador")
	private Integer id;
	
	@Column(name = "uf_senador")
	private String ufSenador;
	
	@Column(name = "sigla_senador")
	private String siglaSenador;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "candidato_idcandidato")
	private Candidato candidato;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUfSenador() {
		return ufSenador;
	}

	public void setUfSenador(String ufSenador) {
		this.ufSenador = ufSenador;
	}

	public String getSiglaSenador() {
		return siglaSenador;
	}

	public void setSiglaSenador(String siglaSenador) {
		this.siglaSenador = siglaSenador;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
}
