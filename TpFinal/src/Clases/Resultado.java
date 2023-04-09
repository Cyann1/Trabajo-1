package Clases;

import java.util.ArrayList;

public enum Resultado {
	GANADOR, PERDEDOR, EMPATE;
	
	Resultado() {
		
	}
	
	// este método compara el resultado del partido con el resultado del pronostico, y devuelve si el pronostico gano, perdio o empato..
	public Resultado getResultadoPronostico(Partido partido, Pronostico pronostico) {
		
		if(partido.getResultadoPartido() == pronostico.getResultadoPronostico()) {
			return GANADOR;
		}
		else
		if(partido.getResultadoPartido() != pronostico.getResultadoPronostico()) {
			return PERDEDOR;
		}
		else {
			return EMPATE;
		}
	}
	
	// este método calcula el puntaje de acuerdo a la cantidad de pronosticos acertados
	public int getPuntaje(ArrayList<Resultado> listaResultados) {
		
		int puntos = 0;
		for(Resultado resultado : listaResultados) {
			if(Resultado.GANADOR == resultado) {
				puntos++;
			}
		}
		return puntos;
	}
}
