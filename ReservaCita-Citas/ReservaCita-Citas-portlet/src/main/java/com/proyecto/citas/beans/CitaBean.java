package com.proyecto.citas.beans;

public class CitaBean {

	int idCita;
	int idCliente;
	String descripcion;
	int dia;
	int mes;
	int anio;
	int hora;
	int minutos;
	
	public CitaBean(int idCita, int idCliente, String descripcion, int dia, int mes, int anio, int hora, int minutos) {
		super();
		this.idCita = idCita;
		this.idCliente = idCliente;
		this.descripcion = descripcion;
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.hora = hora;
		this.minutos = minutos;
	}
	
	public CitaBean() {
		super();		
	}

	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
}
