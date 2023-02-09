package com.nttdata.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CUENTA")
public class Cuenta {

	/**id de Cuenta bancaria*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCuenta;

	private String titular; //Responsable de los movimientos de la cuenta

    private LocalDate creacioncuenta;//  fecha de creacion de la cuenta

	private String tipocuenta;

	private String tipocliente; //  Cliente  persona natural  o Juridica

    private float saldocuenta;

    private Integer noperaciones  /// Numero de operacion realizada sobre la cuenta

    private String  sedecuenta   //  Donde fue aperturada la cuenta

    private String   prestamosasociados

    private  String  tarjetaasociada //  Tarjeta que han asociado como cuenta primaria

    private  String  clavecuenta     //  Contraseña de  acceso


	public Integer getIdCuenta() {
		return this.idCuenta;
	}

	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String  getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public LocalDate  getCreacioncuenta() {
		return this.creacioncuenta;
	}

	public void setCreacioncuenta(LocalDate creacioncuenta) {
		this.creacioncuenta = creacioncuenta;
	}

	public String getTipocuenta() {
		return this.tipocuenta;
	}

	public void setTipocuenta(String tipocuenta) {
		this.tipocuenta = tipocuenta;
	}

    public String getTipocliente() {
			return this.tipocliente;
		}

		public void setTipocliente(String tipocliente) {
			this.tipocliente = tipocliente;
	}

	public float getSaldocuenta() {
		return this.saldocuenta;
	}

	public void setSaldocuenta(float saldocuenta) {
		this.saldocuenta = saldocuenta;
	}

	public Integer geNoperaciones() {
		return this.noperaciones;
	}

	public void setNoperaciones(Integer noperaciones) {
		this.noperaciones = noperaciones;
	}

	public String  sedecuenta() {
		return this.sedecuenta;
	}

	public void setSedecuenta(String sedecuenta) {
		this.sedecuenta = sedecuenta;
	}

	public String getPrestamosasociados() {
		return this.prestamosasociados;
	}

	public void setPrestamosasociados(String prestamosasociados) {
		this.prestamosasociados = prestamosasociados;
	}

    public String getTarjetaasociada() {
			return this.tarjetaasociada;
		}

	public void setTarjetaasociada(String tarjetaasociada) {
			this.tarjetaasociada = tarjetaasociada;
		}


   public  Integer getClavecuenta(){
	       return this.clavecuenta;
	   }

   public void setClavecuenta(Integer clavecuenta){
	        this.clavecuenta = clavecuenta
   }







}
