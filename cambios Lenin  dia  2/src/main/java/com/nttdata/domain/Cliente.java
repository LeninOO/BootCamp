package com.nttdata.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente {

	/**id de cliente*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;


	private Integer dni;


	private String nombre;

	private String apellido1;

	private String apellido2;


	private String email;

	private Integer telefono;


	private String correo;

	private LocalDate fcNacimiento;

	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getDni() {
		return this.dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefono() {
		return this.telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public LocalDate getFcNacimiento() {
		return this.fcNacimiento;
	}

	public void setFcNacimiento(LocalDate fcNacimiento) {
		this.fcNacimiento = fcNacimiento;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + this.idCliente + ", dni=" + this.dni + ", nombre=" + this.nombre + ", apellido1=" + this.apellido1
				+ ", apellido2=" + this.apellido2 + ", email=" + this.email + ", telefono=" + this.telefono + ", correo=" + this.correo
				+ ", fcNacimiento=" + this.fcNacimiento + "]";
	}









}
