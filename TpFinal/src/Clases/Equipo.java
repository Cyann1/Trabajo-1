package Clases;

public class Equipo {

	private String nombre;

	@Override
	public String toString() {
		return nombre;
	}

	public Equipo(String nombre) {
		this.nombre = nombre;
	}
	
	public Equipo() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
