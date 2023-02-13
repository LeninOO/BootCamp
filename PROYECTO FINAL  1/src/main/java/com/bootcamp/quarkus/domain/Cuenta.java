package com.nttdata.domain;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import com.nttdata.domain.TipoTarjeta;
import com.nttdata.domain.Operaciones;
import com.nttdata.domain.PagoCredito;
@Entity
@Table(name="CUENTA")
public class Cuenta extends PanacheEntity {

	/**id de Cuenta bancaria*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCuenta;

	@ManyToOne
	@JoinColumn(name ="ID_OPERACION")
	private Operaciones operaciones;


	@ManyToOne
	@JoinColumn(name ="ID_TIPO_TARJETA")
	private TipoTarjeta tipoTarjeta;

    @ManyToOne
	@JoinColumn(name ="ID_PAGO_CREDITO")
	private PagoCredito pagoCredito;

    @OneToMany(mappedBy = "cuenta")




	private String nmcuenta; //Responsable de los movimientos de la cuenta

    private String fcaltafila;

	private String fcbajafila; //

	private String fcmodiffila;

    private Integer idtransaccion;

    private Integer idtarjeta;

    private Integer idprestamos;

    private Integer nmcuotas;

    private Integer tjasocprincipal;

    private Integer  tjasocsecundaria;





	public Integer getIdCuenta() {
		return this.idCuenta;
	}

	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}


	public String  getNmcuenta() {
		return this.nmcuenta;
	}

	public void setNmcuenta(String nmcuenta) {
		this.nmcuenta = nmcuenta;
	}

	public String  getFcaltafila() {
		return this.fcaltafila;
	}

	public void setFcaltafila(String fcaltafila) {
		this.fcaltafila = fcaltafila;
	}

    public String  getFcbajafila() {
			return this.fcbajafila;
		}

		public void setFcbajafila(String fcbajafila) {
			this.fcbajafila = fcbajafila;
	}



    public String  getFcmodiffila() {
			return this.fcmodiffila;
		}

		public void setFcmodiffila(String fcmodiffila) {
			this.fcmodiffila = fcmodiffila;
	}


	public Integer getIdtransaccion() {
		return this.idtransaccion;
	}

	public void setIdtransaccion(Integer idtransaccion) {
		this.idtransaccion = idtransaccion;
	}


    public Integer getIdtarjeta() {
			return this.idtarjeta;
		}

		public void setIdtarjeta(Integer idtarjeta) {
			this.idtarjeta = idtarjeta;
	}

    public Integer getIdprestamos() {
				return this.idprestamos;
			}

			public void setIdprestamos(Integer idprestamos) {
				this.idprestamos = idprestamos;
	}

    public Integer getNmcuotas() {
				return this.nmcuotas;
			}

			public void setNmcuotas(Integer nmcuotas) {
				this.nmcuotas = nmcuotas;
	}

    public Integer getTjasocprincipal() {
				return this.tjasocprincipal;
			}

			public void setTjasocprincipal(Integer tjasocprincipal) {
				this.tjasocprincipal = tjasocprincipal;
	}

    public Integer getTjasocsecundaria() {
					return this.tjasocsecundaria;
				}

				public void setTjasocsecundaria(Integer tjasocsecundaria) {
					this.tjasocsecundaria = tjasocsecundaria;
	}



}
