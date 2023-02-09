package com.nttdata.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TRANSACCION")
public class Transaccion  {

	/**id de transaccion*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTransaccion;

	/***variable que identifica el nombre de la transaccion // deposito, retiro, transferecias bancarias, pagos de crédito, pagos de tarjeta de crédito **/
	private String dsNombre;

	/***variable que identifica la fecha de transaccion**/
	private LocalDateTime fcTransaccion;

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

	public String getDsNombre() {
		return this.dsNombre;
	}

	public void setDsNombre(String dsNombre) {
		this.dsNombre = dsNombre;
	}

	public LocalDateTime getFcTransaccion() {
		return this.fcTransaccion;
	}

	public void setFcTransaccion(LocalDateTime fcTransaccion) {
		this.fcTransaccion = fcTransaccion;
	}

	public LocalDateTime getFcAltaFila() {
		return this.fcAltaFila;
	}

	public void setFcAltaFila(LocalDateTime fcAltaFila) {
		this.fcAltaFila = fcAltaFila;
	}

	public LocalDateTime getFcBajaFila() {
		return this.fcBajaFila;
	}

	public void setFcBajaFila(LocalDateTime fcBajaFila) {
		this.fcBajaFila = fcBajaFila;
	}

	public LocalDateTime getFcModifFila() {
		return this.fcModifFila;
	}

	public void setFcModifFila(LocalDateTime fcModifFila) {
		this.fcModifFila = fcModifFila;
	}




}
