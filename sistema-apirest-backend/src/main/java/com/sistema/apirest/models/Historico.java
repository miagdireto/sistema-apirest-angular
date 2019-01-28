package com.sistema.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_historico")
public class Historico implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	
	private String regiao;
	private String estado;
	private String municipio;
	private String revenda;
	private String produto;
	private String dtcoleta;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getRevenda() {
		return revenda;
	}
	public void setRevenda(String revenda) {
		this.revenda = revenda;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getDtcoleta() {
		return dtcoleta;
	}
	public void setDtcoleta(String dtcoleta) {
		this.dtcoleta = dtcoleta;
	}
	public BigDecimal getCompra() {
		return compra;
	}
	public void setCompra(BigDecimal compra) {
		this.compra = compra;
	}
	public BigDecimal getVenda() {
		return venda;
	}
	public void setVenda(BigDecimal venda) {
		this.venda = venda;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	private BigDecimal compra;
	private BigDecimal venda;	
	private String medida;
	private String bandeira;
	
	
}
