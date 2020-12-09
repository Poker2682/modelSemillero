package com.clearminds.dmo.dtos;

public class Estudiante {

	private String nombre;
	private String apellido;
	private long id;
	
	public Estudiante() {
		
	}

	public Estudiante(String nombre, String apellido, long id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}
	
	public Estudiante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + "]";
	}

}
