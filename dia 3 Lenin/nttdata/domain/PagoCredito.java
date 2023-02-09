package com.nttdata.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PAGOCREDITO")
public class PagoCredito {

	/**id de prestamos*/
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@OneToMany
@JoinColumn(name ="ID_CUENTA")
private Cuenta cuenta;


private Integer idpagocredito;

private LocalDate fcinicio;

private Integer nmcuotas;

private LocalDate fcpagomensual;

private Integer saldoinicial;

private Integer saldoactual;





public Integer getIdPagocredito() {
			return this.idpagocredito;
		}

	public void setIdPagocredito(Integer idpagocredito) {
			this.idpagocredito = idpagocredito;
	                         }



    public LocalDate getFcinicio() {
				return this.fcinicio;
			}

	public void setFcinicio(LocalDate fcinicio) {
				this.fcinicio = fcinicio;
	                         }


    public Integer getNmcuotas() {
				return this.nmcuotas;
			}

	public void setNmcuotas(Integer nmcuotas) {
				this.nmcuotas = nmcuotas;
	                         }


    public LocalDate getFcpagomensual() {
					return this.fcpagomensual;
				}

	public void setFcpagomensual(LocalDate fcpagomensual) {
					this.fcpagomensual = fcpagomensual;
	                         }


    public Integer getSaldoinicial() {
					return this.saldoinicial;
				}

	public void setSaldoinicial(Integer saldoinicial) {
					this.saldoinicial = saldoinicial;
		                         }



    public Integer getSaldoactual() {
						return this.saldoactual;
					}

	public void setSaldoactual(Integer saldoactual) {
						this.saldoactual = saldoactual;
		                         }


}
