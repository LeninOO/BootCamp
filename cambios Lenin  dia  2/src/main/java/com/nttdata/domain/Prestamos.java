package com.nttdata.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PRESTAMOS")
public class Prestamos {

	/**id de prestamos*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)


	private Integer idPrestamos;


	private float  TEA; //  % Tasa efectiva  anual de interes

	private Integer cuotas;

	private float   montoprestado;

	private float   saldoinicial;

	private float   saldofinal;

	private LocalDate fechadesembolso;

	private LocalDate fechapagomensual;

    private Integer cuotaspagadas;

    private Integer cuotaspendientes;

	private String titularprestamo;





    public Integer getIdPrestamos() {
			return this.idPrestamos;
		}

	public void setIdPrestamos(Integer idPrestamos) {
			this.idPrestamos = idPrestamos;
	                         }

	public float getTEA() {
		return this.TEA;
	}

	public void setTEA(float TEA) {
		this.TEA = TEA;
	}

	public Integer getCuotas() {
		return this.cuotas;
	}

	public void setCuotas(Integer cuotas) {
		this.cuotas = cuotas;
	}

	public float getMontoprestado() {
		return this.montoprestado;
	}

	public void setMontoprestado(float montoprestado) {
		this.montoprestado = montoprestado;
	}

    public float getSaldoinicial() {
			return this.saldoinicial;
		}

	public void setSaldoinicial(float saldoinicial) {
			this.saldoinicial = saldoinicial;
	}

    public float getSaldofinal() {
				return this.saldofinal;
			}

	public void setSaldofinal(float saldofinal) {
				this.saldofinal = saldofinal;
	                        }

    public LocalDate getFechadesembolso() {
			return this.fechadesembolso;
		}

	public void setFechadesembolso(LocalDate fechadesembolso) {
			this.fechadesembolso = fechadesembolso;
	}


    public LocalDate getFechapagomensual() {
				return this.fechapagomensual;
			}

	public void setFechapagomensual(LocalDate fechapagomensual) {
				this.fechapagomensual = fechapagomensual;
	}

    public Integer getCuotaspagadas() {
		return this.cuotaspagadas;
	}

	public void setCuotaspagadas(Integer cuotaspagadas) {
		this.telefono = cuotaspagadas;
	}


    public Integer getCuotaspendientes() {
			return this.cuotaspendientes;
		}

		public void setCuotaspendientes(Integer cuotaspendientes) {
			this.cuotaspendientes = cuotaspendientes;
	}


	public String getTitularprestamo() {
		return this.titularprestamo;
	}

	public void setTitularprestamo(String titularprestamo) {
		this.titularprestamo = titularprestamo;
	}









}
