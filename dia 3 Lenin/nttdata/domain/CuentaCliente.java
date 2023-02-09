package com.nttdata.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CUENTA_CLIENTE")
public class Cuenta {

	/**id de Cuenta bancaria*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCuentaCliente;


	@ManyToOne
	@JoinColumns({
                @JoinColumn(name = "ID_CUENTA")
                @JoinColumn(name = "ID_TIPO_CLIENTE")
                    })
	private Cuenta cuenta;
	
	
	

	@ManyToOne
	@JoinColumns({
                @JoinColumn(name = "ID_CUENTA")
                @JoinColumn(name = "ID_TIPO_CLIENTE")
                    })
	private TipoCliente tipoCliente;

	
	private String fcTransaccion; //fecha de la transaccion
        
	
        private String fcAltaFila; // fecha del alta de la cuenta
	

	private String fcBajaFila; // baja de la tabla
	

	private String fcModifFila



	public Integer getIdCuentaCliente() {
		return this.idCuentaCliente;
	}

	public void setIdCuentaCliente(Integer idCuentaCliente) {
		this.idCuentaCliente = idCuentaCliente;
	}


	public String  getFcAltaFila() {
		return this.fcAltaFila;
	}

	public void setFcAltaFila(String fcAltaFila) {
		this.fcAltaFila = fcAltaFila;
	}

        public String  getFcBajafila() {
			return this.fcBajaFila;
		}

	public void setFcBajaFila(String fcBajaFila) {
			this.fcBajaFila = fcBajaFila;
	}



       public String  getFcModifFila() {
			return this.fcModifFila;
		}

	public void setFcModifFila(String fcModifFila) {
			this.fcModifFila = fcModifFila;
	}





}
