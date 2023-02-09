package com.nttdata.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="CLIENTE_EMPRESA")
public class ClienteEmpresa {



	/**id de empresa*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEmpresa;


	private String razonSocial;


	private Integer ruc;

	private String direccion;

	private String correo;

	private Integer telefono;

	public Integer getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Integer getRuc() {
		return this.ruc;
	}

	public void setRuc(Integer ruc) {
		this.ruc = ruc;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getTelefono() {
		return this.telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "ClienteEmpresa [idEmpresa=" + this.idEmpresa + ", razonSocial=" + this.razonSocial + ", ruc=" + this.ruc
				+ ", direccion=" + this.direccion + ", correo=" + this.correo + ", telefono=" + this.telefono + "]";
	}





}
