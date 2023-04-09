package Clases;

public class Partido {

	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1;
	private int golesEquipo2;

	public Resultado getResultadoPartido() { // devuelve el resultado del partido tomando en cuenta el equipo1
		if (golesEquipo1 > golesEquipo2) {
			return Resultado.GANADOR;
		}
		if (golesEquipo1 < golesEquipo2) {
			return Resultado.PERDEDOR;
		} else {
			return Resultado.EMPATE;
		}
	}

	@Override
	public String toString() {
		String resultado = "";

		if (golesEquipo1 > golesEquipo2) {
			resultado = "ganador del partido: " + equipo1.toString() + " con un resultado de " + golesEquipo1 + " a "
					+ golesEquipo2;
		}

		if (golesEquipo1 < golesEquipo2) {
			resultado = "ganador del partido: " + equipo2.toString() + " con un resultado de " + golesEquipo2 + " a "
					+ golesEquipo1;
		}

		if (golesEquipo1 == golesEquipo2) {
			resultado = "el resultado fué un empate con un resultado de " + golesEquipo1 + " a " + golesEquipo2;
		}

		return resultado;
	}

	public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}

	public Partido() {
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

	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
}
