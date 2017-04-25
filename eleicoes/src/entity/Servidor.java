package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
@Table(schema = "eleicoes", name = "servidor")
@SequenceGenerator(name = "seq_servidor", allocationSize = 1, sequenceName = "eleicoes.seq_servidor")
public class Servidor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_servidor")
	@Column(name = "idservidor")
	private Integer id;
	
	@Column(name = "nome_servidor")
	private String nomeServidor;
	
	@Column(name = "titular_substituto")
	private String titularSubstituto;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "servidor")
	private List<PromotorEleitoral> promotores = new ArrayList<PromotorEleitoral>(0);
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "servidor")
	private List<Chefe> chefes = new ArrayList<Chefe>(0);
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "servidor")
	private List<JuizEleitoral> juizes = new ArrayList<JuizEleitoral>(0);
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "zona_eleitoral_idzona")
	private ZonaEleitoral zonaEleitoral;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeServidor() {
		return nomeServidor;
	}

	public void setNomeServidor(String nomeServidor) {
		this.nomeServidor = nomeServidor;
	}

	public String getTitularSubstituto() {
		return titularSubstituto;
	}

	public void setTitularSubstituto(String titularSubstituto) {
		this.titularSubstituto = titularSubstituto;
	}

	public List<PromotorEleitoral> getPromotores() {
		return promotores;
	}

	public void setPromotores(List<PromotorEleitoral> promotores) {
		this.promotores = promotores;
	}

	public List<Chefe> getChefes() {
		return chefes;
	}

	public void setChefes(List<Chefe> chefes) {
		this.chefes = chefes;
	}

	public List<JuizEleitoral> getJuizes() {
		return juizes;
	}

	public void setJuizes(List<JuizEleitoral> juizes) {
		this.juizes = juizes;
	}

	public ZonaEleitoral getZonaEleitoral() {
		return zonaEleitoral;
	}

	public void setZonaEleitoral(ZonaEleitoral zonaEleitoral) {
		this.zonaEleitoral = zonaEleitoral;
	}

	@Override
	public String toString() {
		return "Servidor [id=" + id + ", nomeServidor=" + nomeServidor
				+ ", titularSubstituto=" + titularSubstituto + "]";
	}
}
