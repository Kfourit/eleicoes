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
@Table(schema = "eleicoes", name = "vereador")
@SequenceGenerator(name = "seq_vereador", allocationSize = 1, sequenceName = "eleicoes.seq_vereador")
public class Vereador {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vereador")
	@Column(name = "idvereador")
	private Integer id;
	
	@Column(name = "uf_vereador")
	private String ufVereador;
	
	@Column(name = "sigla_vereador")
	private String siglaVereador;
	
	@Column(name = "cidade_vereador")
	private String cidadeVereador;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "candidato_idcandidato")
	private Candidato candidato;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUfVereador() {
		return ufVereador;
	}

	public void setUfVereador(String ufVereador) {
		this.ufVereador = ufVereador;
	}

	public String getSiglaVereador() {
		return siglaVereador;
	}

	public void setSiglaVereador(String siglaVereador) {
		this.siglaVereador = siglaVereador;
	}

	public String getCidadeVereador() {
		return cidadeVereador;
	}

	public void setCidadeVereador(String cidadeVereador) {
		this.cidadeVereador = cidadeVereador;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
}
