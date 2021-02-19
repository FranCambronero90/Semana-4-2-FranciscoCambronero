/**
 * 
 */
package com.ucreativa;

/**
 * @author Fran
 *
 */
public interface Actor {

	public static final String NombreArtistico = "Bethoveen";
	public static final int  anniosExperiencia = 20;
	public static final String TipoActor = "Secundario";
	
	
	//Metodos
	
	abstract void actuar();
	abstract void divertir();
	abstract void desaparecer();
	
	static String Identificador() {
		return "Yo soy un Actor";
	}
	
	
	// Overrides y otros
	
	@Override 
	String ToString();
	void finalize() throws Throwable;
}
