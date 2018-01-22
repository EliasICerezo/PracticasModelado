/**
 * @(#) Estado.java
 */

package Ejercicio4b;

public abstract class Estado
{
	public abstract void abrir( Semaforo s );
	
	public abstract void cerrar( Semaforo s );
	
	public abstract String estado( );
	
	
}
