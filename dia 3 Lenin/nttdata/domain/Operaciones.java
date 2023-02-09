package com.nttdata.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TRANSACCION")
public class Operaciones  {

	/**id de transaccion*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOperacion;

	/***variable que identifica el nombre de la transaccion // deposito, retiro, transferecias bancarias, pagos de crédito, pagos de tarjeta de crédito **/
	private String dsNombre;

	/***variable que identifica la fecha de transaccion**/
	private LocalDateTime fcOperacion;

	/***variable que identifica la fecha de alta de registro**/
	private LocalDateTime fcAltaFila;

	/***variable que identifica la fecha de baja**/
	private LocalDateTime fcBajaFila;

	/***variable que identifica la fecha de modificación**/
	private LocalDateTime fcModifFila;



	//**********************************
	//**********************************
	//***** MÉTODOS GETTER Y SETTER
	//**********************************
	//***********************************



	/**
	 * @return the idOperacion
	 */
	public Long getIdOperacion() {
		return this.idOperacion;
	}

	/**
	 * @return the dsNombre
	 */
	public String getDsNombre() {
		return this.dsNombre;
	}

	/**
	 * @param dsNombre the dsNombre to set
	 */
	public void setDsNombre(String dsNombre) {
		this.dsNombre = dsNombre;
	}

	/**
	 * @return the fcAltaFila
	 */
	public LocalDateTime getFcAltaFila() {
		return this.fcAltaFila;
	}

	/**
	 * @param fcAltaFila the fcAltaFila to set
	 */
	public void setFcAltaFila(LocalDateTime fcAltaFila) {
		this.fcAltaFila = fcAltaFila;
	}

	/**
	 * @return the fcBajaFila
	 */
	public LocalDateTime getFcBajaFila() {
		return this.fcBajaFila;
	}

	/**
	 * @param fcBajaFila the fcBajaFila to set
	 */
	public void setFcBajaFila(LocalDateTime fcBajaFila) {
		this.fcBajaFila = fcBajaFila;
	}

	/**
	 * @return the fcModifFila
	 */
	public LocalDateTime getFcModifFila() {
		return this.fcModifFila;
	}

	/**
	 * @param fcModifFila the fcModifFila to set
	 */
	public void setFcModifFila(LocalDateTime fcModifFila) {
		this.fcModifFila = fcModifFila;
	}

	/**
	 * @param idOperacion the idOperacion to set
	 */
	public void setIdOperacion(Long idOperacion) {
		this.idOperacion = idOperacion;
	}

	/**
	 * @return the fcOperacion
	 */
	public LocalDateTime getFcOperacion() {
		return this.fcOperacion;
	}

	/**
	 * @param fcOperacion the fcOperacion to set
	 */
	public void setFcOperacion(LocalDateTime fcOperacion) {
		this.fcOperacion = fcOperacion;
	}




}
