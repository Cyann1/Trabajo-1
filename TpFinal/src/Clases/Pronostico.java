package Clases;

public class Pronostico {

	private Equipo equipo1;
	private Equipo equipo2;
	private int ganaEquipo1;
	private int empate;
	private int ganaEquipo2;

	public Resultado getResultadoPronostico() { // devuelve el resultado del pronostico tomando en cuenta el equipo1
		if (ganaEquipo1 == 1) {
			return Resultado.GANADOR;
		}
		if (ganaEquipo2 == 1) {
			return Resultado.PERDEDOR;
		} else {
			return Resultado.EMPATE;
		}
	}

	@Override
	public String toString() {
		return "...";
	}

	public Pronostico(Equipo equipo1, Equipo equipo2, int ganaEquipo1, int empate, int ganaEquipo2) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.ganaEquipo1 = ganaEquipo1;
		this.empate = empate;
		this.ganaEquipo2 = ganaEquipo2;
	}

	public Pronostico() {
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public int getGanaEquipo1() {
		return ganaEquipo1;
	}

	public void setGanaEquipo1(int ganaEquipo1) {
		this.ganaEquipo1 = ganaEquipo1;
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate(int empate) {
		this.empate = empate;
	}

	public int getGanaEquipo2() {
		return ganaEquipo2;
	}

	public void setGanaEquipo2(int ganaEquipo2) {
		this.ganaEquipo2 = ganaEquipo2;
	}
}
