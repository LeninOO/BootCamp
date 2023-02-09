package com.nttdata.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TIPO_TARJETA")
public class TipoTarjeta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoTarjeta;

	@ManyToOne
	@JoinColumn(name ="ID_CREDITO")
	private TarjetaCredito tjCredito;

	@ManyToOne
	@JoinColumn(name ="ID_DEBITO")
	private TarjetaDebito tjDebito;


	/**
	 * @return the idTipoTarjeta
	 */
	public Integer getIdTipoTarjeta() {
		return this.idTipoTarjeta;
	}


	/**
	 * @param idTipoTarjeta the idTipoTarjeta to set
	 */
	public void setIdTipoTarjeta(Integer idTipoTarjeta) {
		this.idTipoTarjeta = idTipoTarjeta;
	}


	/**
	 * @return the tjCredito
	 */
	public TarjetaCredito getTjCredito() {
		return this.tjCredito;
	}


	/**
	 * @param tjCredito the tjCredito to set
	 */
	public void setTjCredito(TarjetaCredito tjCredito) {
		this.tjCredito = tjCredito;
	}


	/**
	 * @return the tjDebito
	 */
	public TarjetaDebito getTjDebito() {
		return this.tjDebito;
	}


	/**
	 * @param tjDebito the tjDebito to set
	 */
	public void setTjDebito(TarjetaDebito tjDebito) {
		this.tjDebito = tjDebito;
	}



}
