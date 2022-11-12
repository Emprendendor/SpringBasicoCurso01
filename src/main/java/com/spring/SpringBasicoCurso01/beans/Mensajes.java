package com.spring.SpringBasicoCurso01.beans;

public class Mensajes {
/**
 *   ojo    Bean hay que declararlo con el constructor vacio
 * 
 * 
 */
	 public  Mensajes(  ) {
	 }
	
	 public  Mensajes( Integer i, String m ) {
		  
			this.numero = i;
			this.mensaje = m;
		}
		
	
	
	 public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	private Integer  numero;
	 private String mensaje;
	
	
}
