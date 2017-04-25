package entity;

import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "eleicoes", name = "juiz_eleitoral")
@SequenceGenerator(name = "seq_juiz_eleitoral", allocationSize = 1, sequenceName = "eleicoes.seq_juiz_eleitoral")
public class JuizEleitoral {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_juiz_eleitoral")
	@Column(name = "idjuiz")
	private Integer id;
	
	@Column(name = "codigo_oab_juiz")
	private Integer codigoOABJuiz;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_inicio_juiz")
	private Date dataInicioJuiz;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_fim_juiz")
	private Date dataFimJuiz;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "servidor_idservidor", nullable = false)
	private Servidor servidor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCodigoOABJuiz() {
		return codigoOABJuiz;
	}

	public void setCodigoOABJuiz(Integer codigoOABJuiz) {
		this.codigoOABJuiz = codigoOABJuiz;
	}

	public Date getDataInicioJuiz() {
		return dataInicioJuiz;
	}

	public void setDataInicioJuiz(Date dataInicioJuiz) {
		this.dataInicioJuiz = dataInicioJuiz;
	}

	public Date getDataFimJuiz() {
		return dataFimJuiz;
	}

	public void setDataFimJuiz(Date dataFimJuiz) {
		this.dataFimJuiz = dataFimJuiz;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}
}
