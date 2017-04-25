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
@Table(schema = "eleicoes", name = "chefe")
@SequenceGenerator(name = "seq_chefe", allocationSize = 1, sequenceName = "eleicoes.seq_chefe")
public class Chefe {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_chefe")
	@Column(name = "idchefe")
	private Integer id;

	@Column(name = "cpf_chefe")
	private Integer cpf;

	@Column(name = "rg_chefe")
	private Integer rg;

	@Column(name = "telefone_chefe")
	private Integer telefoneChefe;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "servidor_idservidor", nullable = false)
	private Servidor servidor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	public Integer getTelefoneChefe() {
		return telefoneChefe;
	}

	public void setTelefoneChefe(Integer telefoneChefe) {
		this.telefoneChefe = telefoneChefe;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}
}
