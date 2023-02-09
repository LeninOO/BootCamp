package com.nttdata.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TIPO_CLIENTE")
public class TipoCliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoCliente;



	@ManyToOne
	@JoinColumn(name ="ID_EMPRESA")
	private ClienteEmpresa empresa;


	@ManyToOne
	@JoinColumn(name ="ID_CLIENTE")
	private Cliente cliente;


	public Integer getIdTipoCliente() {
		return this.idTipoCliente;
	}


	public void setIdTipoCliente(Integer idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
	}


	public ClienteEmpresa getEmpresa() {
		return this.empresa;
	}


	public void setEmpresa(ClienteEmpresa empresa) {
		this.empresa = empresa;
	}


	public Cliente getCliente() {
		return this.cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "TipoCliente [idTipoCliente=" + this.idTipoCliente + ", empresa=" + this.empresa + ", cliente=" + this.cliente + "]";
	}




}
