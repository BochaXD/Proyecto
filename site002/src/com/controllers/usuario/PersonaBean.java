package com.controllers.usuario;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
//// capa de negocio
@Named("persona") // SE USA DE REFERENCIA PARA INDICAR A LA CLASE PERSONABEAN
@RequestScoped // SIEMPRE FORMULARIOS WEB

public class PersonaBean implements Serializable{ // implementar serializable importar serializable 


	private static final long serialVersionUID=1L; // default
	private String nombre;
	private int edad;
	private String direccion;
	private String correo;
	private String telefono;
	private String estadoCivil;
	
	
	
	
	// Getter&Setter
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

/////////////////////////////////////////	
}// NO TOCAR
