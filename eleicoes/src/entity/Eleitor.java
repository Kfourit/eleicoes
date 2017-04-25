package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "eleicoes", name = "eleitor")
@SequenceGenerator(name = "seq_eleitor", allocationSize = 1, sequenceName = "eleicoes.seq_eleitor")
public class Eleitor{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_eleitor")
	@Column(name = "ideleitor")
	private Integer id;

	@Column(name = "cpf_eleitor")
	private Integer cpfEleitor;

	@Column(name = "rg_eleitor")
	private Integer rg_eleitor;

	@Column(name = "nome_eleitor")
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_nasc_eleitor")
	private Date dataNascimento;

	@Column(name = "nome_mae_eleitor")
	private String nomeMaeEleitor;

	@Column(name = "naturalidade_eleitor")
	private String naturalidade;

	@Column(name = "estado_civil_eleitor")
	private String estadoCivil;

	@Column(name = "inscricao_eleitor")
	private Integer inscricao;

	@Column(name = "foto_eleitor")
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private byte[] fotoEleitor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "zona_eleitoral_idzona")
	private ZonaEleitoral zonaEleitoral;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "secao_eleitoral_idsecao")
	private SecaoEleitoral secaoEleitoral;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "urna_idurna")
	private Urna urna;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinTable(name = "eleitor_candidato", schema = "eleicoes", joinColumns = { @JoinColumn(name = "eleitor_ideleitor", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "candidato_idcandidato", nullable = false, updatable = false) })
	private List<Candidato> candidatos = new ArrayList<Candidato>(0);

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCpfEleitor() {
		return cpfEleitor;
	}

	public void setCpfEleitor(Integer cpfEleitor) {
		this.cpfEleitor = cpfEleitor;
	}

	public Integer getRg_eleitor() {
		return rg_eleitor;
	}

	public void setRg_eleitor(Integer rg_eleitor) {
		this.rg_eleitor = rg_eleitor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNomeMaeEleitor() {
		return nomeMaeEleitor;
	}

	public void setNomeMaeEleitor(String nomeMaeEleitor) {
		this.nomeMaeEleitor = nomeMaeEleitor;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Integer getInscricao() {
		return inscricao;
	}

	public void setInscricao(Integer inscricao) {
		this.inscricao = inscricao;
	}

	public byte[] getFotoEleitor() {
		return fotoEleitor;
	}

	public void setFotoEleitor(byte[] fotoEleitor) {
		this.fotoEleitor = fotoEleitor;
	}

	public ZonaEleitoral getZonaEleitoral() {
		return zonaEleitoral;
	}

	public void setZonaEleitoral(ZonaEleitoral zonaEleitoral) {
		this.zonaEleitoral = zonaEleitoral;
	}

	public SecaoEleitoral getSecaoEleitoral() {
		return secaoEleitoral;
	}

	public void setSecaoEleitoral(SecaoEleitoral secaoEleitoral) {
		this.secaoEleitoral = secaoEleitoral;
	}

	public Urna getUrna() {
		return urna;
	}

	public void setUrna(Urna urna) {
		this.urna = urna;
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

	@Override
	public String toString() {
		return "Eleitor [id=" + id + ", cpfEleitor=" + cpfEleitor
				+ ", rg_eleitor=" + rg_eleitor + ", nome=" + nome
				+ ", dataNascimento=" + dataNascimento + ", nomeMaeEleitor="
				+ nomeMaeEleitor + ", naturalidade=" + naturalidade
				+ ", estadoCivil=" + estadoCivil + ", inscricao=" + inscricao
				+ ", fotoEleitor=" + Arrays.toString(fotoEleitor)
				+ ", zonaEleitoral=" + zonaEleitoral + ", secaoEleitoral="
				+ secaoEleitoral + ", urna=" + urna + "]";
	}
	
	
}
