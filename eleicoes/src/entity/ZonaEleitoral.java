package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "eleicoes", name = "zona_eleitoral")
@SequenceGenerator(name = "seq_zona_eleitoral", allocationSize = 1, sequenceName = "eleicoes.seq_zona_eleitoral")
public class ZonaEleitoral {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_zona_eleitoral")
	@Column(name = "idzona")
	private Integer id;
	
	@Column(name = "cidade_zona")
	private String cidadeZona;
	
	@Column(name = "cep_zona")
	private Integer cepZona;
	
	@Column(name = "numero_zona")
	private Integer numeroZona;
	
	@Column(name = "telefone_zona")
	private Integer telefoneZona;
	
	@Column(name = "abrangencia_zona")
	private String abrangenciaZona;
	
	@Column(name = "uf_zona")
	private String ufZona;
	
	@Column(name = "endereco_zona")
	private String enderecoZona;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "zonaEleitoral")
	private List<Servidor> servidores = new ArrayList<Servidor>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "zonaEleitoral")
	private List<SecaoEleitoral> secoesEleitorais = new ArrayList<SecaoEleitoral>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "zonaEleitoral")
	private List<Eleitor> eleitores = new ArrayList<Eleitor>(0);

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCidadeZona() {
		return cidadeZona;
	}

	public void setCidadeZona(String cidadeZona) {
		this.cidadeZona = cidadeZona;
	}

	public Integer getCepZona() {
		return cepZona;
	}

	public void setCepZona(Integer cepZona) {
		this.cepZona = cepZona;
	}

	public Integer getNumeroZona() {
		return numeroZona;
	}

	public void setNumeroZona(Integer numeroZona) {
		this.numeroZona = numeroZona;
	}

	public Integer getTelefoneZona() {
		return telefoneZona;
	}

	public void setTelefoneZona(Integer telefoneZona) {
		this.telefoneZona = telefoneZona;
	}

	public String getAbrangenciaZona() {
		return abrangenciaZona;
	}

	public void setAbrangenciaZona(String abrangenciaZona) {
		this.abrangenciaZona = abrangenciaZona;
	}

	public String getUfZona() {
		return ufZona;
	}

	public void setUfZona(String ufZona) {
		this.ufZona = ufZona;
	}

	public String getEnderecoZona() {
		return enderecoZona;
	}

	public void setEnderecoZona(String enderecoZona) {
		this.enderecoZona = enderecoZona;
	}

	public List<Servidor> getServidores() {
		return servidores;
	}

	public void setServidores(List<Servidor> servidores) {
		this.servidores = servidores;
	}

	public List<SecaoEleitoral> getSecoesEleitorais() {
		return secoesEleitorais;
	}

	public void setSecoesEleitorais(List<SecaoEleitoral> secoesEleitorais) {
		this.secoesEleitorais = secoesEleitorais;
	}

	public List<Eleitor> getEleitores() {
		return eleitores;
	}

	public void setEleitores(List<Eleitor> eleitores) {
		this.eleitores = eleitores;
	}
}
