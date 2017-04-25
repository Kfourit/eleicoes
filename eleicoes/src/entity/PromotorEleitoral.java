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
@Table(schema = "eleicoes", name = "promotor_eleitoral")
@SequenceGenerator(name = "seq_promotor_eleitoral", allocationSize = 1, sequenceName = "eleicoes.seq_promotor_eleitoral")
public class PromotorEleitoral {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_promotor_eleitoral")
	@Column(name = "idpromotor_eleitoral")
	private Integer id;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_inicio_promotor")
	private Date dataInicioPromotor;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_fim_promotor")
	private Date dataFimPromotor;

	@Column(name = "codigo_oab_promotor")
	private Integer CodigoOABPromotor;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "servidor_idservidor", nullable = false)
	private Servidor servidor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataInicioPromotor() {
		return dataInicioPromotor;
	}

	public void setDataInicioPromotor(Date dataInicioPromotor) {
		this.dataInicioPromotor = dataInicioPromotor;
	}

	public Date getDataFimPromotor() {
		return dataFimPromotor;
	}

	public void setDataFimPromotor(Date dataFimPromotor) {
		this.dataFimPromotor = dataFimPromotor;
	}

	public Integer getCodigoOABPromotor() {
		return CodigoOABPromotor;
	}

	public void setCodigoOABPromotor(Integer codigoOABPromotor) {
		CodigoOABPromotor = codigoOABPromotor;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}
}
