/**
 * 
 */
package com.ucreativa;

/**
 * @author Fran
 *
 */
public interface Actor {

	public static final String nombreArtistico = "Jhonny Depp";
	public static final int añosExperiencia = 30;
	public static final String tipo = "Principal";
	
	abstract void actuar();
	
	abstract void divertir();
	
	abstract void desaparecer();
	
	static String identificador() {
		return "Yo soy un actor";

	}

	

}
