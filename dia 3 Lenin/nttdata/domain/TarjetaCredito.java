package com.nttdata.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TARJETA_CREDITO")
public class TarjetaCredito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCredito;
	/**
	 * numero de tarjeta de crédtio
	 */
	private String nmTarjeta;
	/**
	 * codigo pin de tarjeta de crédito
	 */
	private Integer cdPin;
	/**
	 * fecha de vencimiento de tarjeta de crédito
	 */
	private LocalDate fcVencimiento;

	/**
	 * código de validacion de la tarjeta de crédito
	 */
	private Integer cdValidacion;
	/**
	 * fecha de corte de la tarjeta de crédito
	 */
	private LocalDate fcCorte;

	/**
	 * fecha limite de pago mensual de la tarjeta de crédito
	 */
	private LocalDateTime fcLimitePagoMensual;
	/**
	 * saldo actual de la tarjeta de crédito
	 */
	private Long saldoAcual;
	/**
	 * limite de crédito de la tarjeta
	 */
	private Long limCredito;

	/**
	 * @return the idCredito
	 */
	public Integer getIdCredito() {
		return this.idCredito;
	}

	/**
	 * @param idCredito the idCredito to set
	 */
	public void setIdCredito(Integer idCredito) {
		this.idCredito = idCredito;
	}

	/**
	 * @return the nmTarjeta
	 */
	public String getNmTarjeta() {
		return this.nmTarjeta;
	}

	/**
	 * @param nmTarjeta the nmTarjeta to set
	 */
	public void setNmTarjeta(String nmTarjeta) {
		this.nmTarjeta = nmTarjeta;
	}

	/**
	 * @return the cdPin
	 */
	public Integer getCdPin() {
		return this.cdPin;
	}

	/**
	 * @param cdPin the cdPin to set
	 */
	public void setCdPin(Integer cdPin) {
		this.cdPin = cdPin;
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

	/**
	 * @return the fcCorte
	 */
	public LocalDate getFcCorte() {
		return this.fcCorte;
	}

	/**
	 * @param fcCorte the fcCorte to set
	 */
	public void setFcCorte(LocalDate fcCorte) {
		this.fcCorte = fcCorte;
	}

	/**
	 * @return the fcLimitePagoMensual
	 */
	public LocalDateTime getFcLimitePagoMensual() {
		return this.fcLimitePagoMensual;
	}

	/**
	 * @param fcLimitePagoMensual the fcLimitePagoMensual to set
	 */
	public void setFcLimitePagoMensual(LocalDateTime fcLimitePagoMensual) {
		this.fcLimitePagoMensual = fcLimitePagoMensual;
	}

	/**
	 * @return the saldoAcual
	 */
	public Long getSaldoAcual() {
		return this.saldoAcual;
	}

	/**
	 * @param saldoAcual the saldoAcual to set
	 */
	public void setSaldoAcual(Long saldoAcual) {
		this.saldoAcual = saldoAcual;
	}

	/**
	 * @return the limCredito
	 */
	public Long getLimCredito() {
		return this.limCredito;
	}

	/**
	 * @param limCredito the limCredito to set
	 */
	public void setLimCredito(Long limCredito) {
		this.limCredito = limCredito;
	}




}
