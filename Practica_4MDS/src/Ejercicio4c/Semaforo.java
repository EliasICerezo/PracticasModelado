/**
 * @(#) Semaforo.java
 */

package Ejercicio4c;

public class Semaforo
{
	private Estado state;
	private Boolean triestable;
        public Semaforo(){
            state=Rojo.getInstance();
            triestable=false;
        }
	public void abrir( )
	{
		state.abrir(this);
	}
	public void cerrar( )
	{
		state.cerrar(this);
	}
	public void setEstado( Estado state )
	{
		this.state=state;
	}
	public Estado getEstado( )
	{
		return state;
	}
	public String estado( )
	{
		return state.estado();
	}
	public boolean getTriestable( )
	{
		return triestable;
	}
	public void setTriestable( Boolean b )
	{
		triestable=b;
	}
	public void cambio(){
            triestable=!triestable;
        }
}
