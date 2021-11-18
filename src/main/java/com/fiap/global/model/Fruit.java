package com.fiap.global.model;



import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FRUIT")
@SequenceGenerator(sequenceName = "SEQ_FRUIT", name = "fruit", initialValue = 1, allocationSize = 1)
public class Fruit {

	@Id
	@GeneratedValue(generator = "fruit", strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "nm_fruit", nullable = false)
	private String nome;
	
	@Column(name = "ds_categoria", nullable = false)
	private String categoria;
	
	@Column(name = "nr_lote", nullable = false)
	private int lote;
	
	@Column(name = "dt_analise", nullable = false)
	private Date dataAnalise;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public Date getDataAnalise() {
		return dataAnalise;
	}

	public void setDataAnalise(Date dataAnalise) {
		this.dataAnalise = dataAnalise;
	}

	
	
	public Fruit(Long id, String nome, String categoria, int lote, Date dataAnalise) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.lote = lote;
		this.dataAnalise = dataAnalise;
	}

	public Fruit() {
	}
}
