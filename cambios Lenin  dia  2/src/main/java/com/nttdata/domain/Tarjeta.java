package com.nttdata.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TARJETA")
public class Tarjeta {

	/**id de tarjeta*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTarjeta;

	private Integer pinTarjeta;

	private Integer codigovalidacion;

    private LocalDate vencimiento;

	private String titular;

	private String tipotarjeta;

    private LocalDate fechacorte;

    private Integer limitecredito;

    private LocalDate fechapagomensual;

    private Integer montoconsumido;


	public Integer getIdTarjeta() {
		return this.idTarjeta;
	}

	public void setIdTarjeta(Integer idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public Integer getPinTarjeta() {
		return this.PinTarjeta;
	}

	public void setPinTarjeta(Integer pinTarjeta) {
		this.pinTarjeta = pinTarjeta;
	}

	public String getCodigovalidacion() {
		return this.codigovalidacion;
	}

	public void setCodigovalidacion(Integer codigovalidacion) {
		this.codigovalidacion = codigovalidacion;
	}

	public LocalDate getVencimiento() {
		return this.vencimiento;
	}

	public void setVencimiento(LocalDate vencimiento) {
		this.vencimiento = vencimiento;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}


	public String getTipotarjeta() {
		return this.tipotarjeta;
	}

	public void setTipotarjeta(String tipotarjeta) {
		this.tipotarjeta = tipotarjeta;
	}


    public LocalDate getFechacorte() {
			return this.fechacorte;
		}

	public void setFechacorte(LocalDate fechacorte) {
			this.fechacorte = fechacorte;
		}

   public Integer getLimitecredito() {
   		return this.limitecredito;
   	}

   	public void setLimitecredito(Integer limitecredito) {
   		this.limitecredito = limitecredito;
	}

    public LocalDate getFechapagomensual() {
				return this.fechapagomensual;
			}

	public void setFechapagomensual(LocalDate fechapagomensual) {
				this.fechapagomensual = fechapagomensual;
		}


   public Integer getMontoconsumido() {
      		return this.montoconsumido;
      	}

   public void setMontoconsumido(Integer montoconsumido) {
      		this.montoconsumido = montoconsumido;
            	}



}
