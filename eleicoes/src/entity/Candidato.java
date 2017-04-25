package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "eleicoes", name = "candidato")
@SequenceGenerator(name = "seq_candidato", allocationSize = 1, sequenceName = "eleicoes.seq_candidato")
public class Candidato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_candidato")
	@Column(name = "idcandidato")
	private Integer id;

	@Column(name = "partido_candidato")
	private String partido;
	
	@Column(name = "nome_candidato")
	private String nome;
	
	@Column(name = "numero_candidato")
	private Integer numero;
	
	@Column(name = "coligacao_candidato")
	private String coligacao;
	
	@Column(name = "escolaridade_candidato")
	private String escolaridade;
	
	@Column(name = "naturalidade_candidato")
	private String naturalidade;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_nasc_candidato")
	private Date dataNascimento;
	
	@Column(name = "estado_civil_candidato")
	private String estadoCivil;
	
	@Column(name = "num_votos_candidato")
	private Integer numeroDeVotos;
	
	@Column(name = "foto_candidato")
	@Lob
	private byte[] fotoCandidato;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "eleitor_candidato", schema = "eleicoes", joinColumns = { @JoinColumn(name = "candidato_idcandidato", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "eleitor_ideleitor", nullable = false, updatable = false) })
	private List<Eleitor> eleitores = new ArrayList<Eleitor>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidato", cascade = CascadeType.ALL)
	private List<DeputadoFederal> deputadosFederais = new ArrayList<DeputadoFederal>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidato", cascade = CascadeType.ALL)
	private List<DeputadoEstadual> deputadosEstaduais = new ArrayList<DeputadoEstadual>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidato", cascade = CascadeType.ALL)
	private List<Vereador> vereadores = new ArrayList<Vereador>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidato", cascade = CascadeType.ALL)
	private List<Senador> senadores = new ArrayList<Senador>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidato", cascade = CascadeType.ALL)
	private List<Prefeito> prefeitos = new ArrayList<Prefeito>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidato", cascade = CascadeType.ALL)
	private List<Governador> governadores = new ArrayList<Governador>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidato", cascade = CascadeType.ALL)
	private List<Presidente> presidentes = new ArrayList<Presidente>(0);

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getColigacao() {
		return coligacao;
	}

	public void setColigacao(String coligacao) {
		this.coligacao = coligacao;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Integer getNumeroDeVotos() {
		return numeroDeVotos;
	}

	public void setNumeroDeVotos(Integer numeroDeVotos) {
		this.numeroDeVotos = numeroDeVotos;
	}

	public byte[] getFotoCandidato() {
		return fotoCandidato;
	}

	public void setFotoCandidato(byte[] fotoCandidato) {
		this.fotoCandidato = fotoCandidato;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Eleitor> getEleitores() {
		return eleitores;
	}

	public void setEleitores(List<Eleitor> eleitores) {
		this.eleitores = eleitores;
	}

	public List<DeputadoFederal> getDeputadosFederais() {
		return deputadosFederais;
	}

	public void setDeputadosFederais(List<DeputadoFederal> deputadosFederais) {
		this.deputadosFederais = deputadosFederais;
	}

	public List<DeputadoEstadual> getDeputadosEstaduais() {
		return deputadosEstaduais;
	}

	public void setDeputadosEstaduais(List<DeputadoEstadual> deputadosEstaduais) {
		this.deputadosEstaduais = deputadosEstaduais;
	}

	public List<Vereador> getVereadores() {
		return vereadores;
	}

	public void setVereadores(List<Vereador> vereadores) {
		this.vereadores = vereadores;
	}

	public List<Senador> getSenadores() {
		return senadores;
	}

	public void setSenadores(List<Senador> senadores) {
		this.senadores = senadores;
	}

	public List<Prefeito> getPrefeitos() {
		return prefeitos;
	}

	public void setPrefeitos(List<Prefeito> prefeitos) {
		this.prefeitos = prefeitos;
	}

	public List<Governador> getGovernadores() {
		return governadores;
	}

	public void setGovernadores(List<Governador> governadores) {
		this.governadores = governadores;
	}

	public List<Presidente> getPresidentes() {
		return presidentes;
	}

	public void setPresidentes(List<Presidente> presidentes) {
		this.presidentes = presidentes;
	}

	@Override
	public String toString() {
		return "Candidato [id=" + id + ", partido=" + partido + ", nome="
				+ nome + ", numero=" + numero + ", coligacao=" + coligacao
				+ ", escolaridade=" + escolaridade + ", naturalidade="
				+ naturalidade + ", dataNascimento=" + dataNascimento
				+ ", estadoCivil=" + estadoCivil + ", numeroDeVotos="
				+ numeroDeVotos + ", fotoCandidato="
				+ Arrays.toString(fotoCandidato) + ", eleitores=" + eleitores
				+ ", deputadosFederais=" + deputadosFederais
				+ ", deputadosEstaduais=" + deputadosEstaduais
				+ ", vereadores=" + vereadores + ", senadores=" + senadores
				+ ", prefeitos=" + prefeitos + ", governadores=" + governadores
				+ ", presidentes=" + presidentes + "]";
	}
}
