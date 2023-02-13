package com.nttdata.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CUENTA_CLIENTE")
public class CuentaCliente extends PanacheEntity{

	/**id de Cuenta bancaria*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCuentaCliente;


	@ManyToOne
	@JoinColumn(name ="ID_CUENTA")
	private Cuenta cuenta;


	@ManyToOne
	@JoinColumn(name ="ID_TIPO_CLIENTE")
	private TipoCliente tipoCliente;

    /**
    #################################Instans  of CuentaCliente  class
    */

    private String fcTransaccion;

	private String fcAltaFila; //

	private String fcBajaFila;

    private Integer fcModFila;


   /**
       #################################  GETTER  and SETTER  #########################################
    */


	public Integer getFcTransaccion() {
		return this.fcTransaccion;
	}

	public void setFcTransaccion(Integer fcTransaccion) {
		this.fcTransaccion = fcTransaccion;
	}


	public Integer getFcAltaFila() {
			return this.fcAltaFila;
		}

		public void setFcAltaFila(Integer fcAltaFila) {
			this.fcAltaFila = fcAltaFila;
		}

    public Integer getFcBajaFila() {
			return this.fcBajaFila;
		}

	public void setFcBajaFila(Integer fcBajaFila) {
			this.fcBajaFila = fcBajaFila;
		}

    public Integer getFcModFila() {
	   			return this.fcModFila;
	   		}

	public void setFcModFila(Integer fcModFila) {
	   			this.fcModFila = fcModFila;
		}



}
