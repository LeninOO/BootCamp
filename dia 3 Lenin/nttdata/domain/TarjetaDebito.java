package com.nttdata.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TARJETA_DEBITO")
public class TarjetaDebito {

	/**
	 * id de tarjeta de débito
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDebito;

	/**
	 * numero de tarjeta
	 */
	private Integer nmTarjeta;
	/**
	 * codigo pin
	 */
	private Integer pin;

	/**
	 * fecha de vencimiento
	 */
	private LocalDate fcVencimiento;
	/**
	 * codigo de validación
	 */

	private Integer cdValidacion;


	/**
	 * @return the idDeito
	 */
	public Integer getIdDebito() {
		return this.idDebito;
	}


	/**
	 * @param idDeito the idDeito to set
	 */
	public void setIdDebito(Integer idDebito) {
		this.idDebito = idDebito;
	}


	/**
	 * @return the nmTarjeta
	 */
	public Integer getNmTarjeta() {
		return this.nmTarjeta;
	}


	/**
	 * @param nmTarjeta the nmTarjeta to set
	 */
	public void setNmTarjeta(Integer nmTarjeta) {
		this.nmTarjeta = nmTarjeta;
	}


	/**
	 * @return the pin
	 */
	public Integer getPin() {
		return this.pin;
	}


	/**
	 * @param pin the pin to set
	 */
	public void setPin(Integer pin) {
		this.pin = pin;
	}


	/**
	 * @return the fcVencimiento
	 */
	public LocalDate getFcVencimiento() {
		return this.fcVencimiento;
	}


	/**
	 * @param fcVencimiento the fcVencimiento to set
	 */
	public void setFcVencimiento(LocalDate fcVencimiento) {
		this.fcVencimiento = fcVencimiento;
	}


	/**
	 * @return the cdValidacion
	 */
	public Integer getCdValidacion() {
		return this.cdValidacion;
	}


	/**
	 * @param cdValidacion the cdValidacion to set
	 */
	public void setCdValidacion(Integer cdValidacion) {
		this.cdValidacion = cdValidacion;
	}


}
