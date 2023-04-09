import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Clases.Equipo;
import Clases.Partido;
import Clases.Pronostico;
import Clases.Resultado;

public class ProgramaPrincipal {

	public static void main(String[] args) throws IOException {

		Partido partido;
		Equipo equipo1, equipo2;
		ArrayList<Partido> listaPartidos = new ArrayList<Partido>();

		String archivo = "archivos\\resultados.txt"; // ruta del archivo resultados

		// este for sirve para leer el archivo de los resultados

		for (String linea : Files.readAllLines(Paths.get(archivo))) {

			String lineas[] = linea.split(" "); // creo un array con los elementos del archivo de los resultados

			equipo1 = new Equipo(); // instancio el equipo 1
			equipo1.setNombre(lineas[0]);

			equipo2 = new Equipo(); // instancio el equipo 2
			equipo2.setNombre(lineas[3]);

			partido = new Partido(); // instancio el partido
			partido.setEquipo1(equipo1);
			partido.setEquipo2(equipo2);
			partido.setGolesEquipo1(Integer.parseInt(lineas[1]));
			partido.setGolesEquipo2(Integer.parseInt(lineas[2]));

			listaPartidos.add(partido); // cargo el partido en la lista de partidos
		}

		Pronostico pronostico;
		ArrayList<Pronostico> listaPronosticos = new ArrayList<Pronostico>();

		String archivos = "archivos\\pronostico.txt"; // ruta del archivo pronostico

		// este for sirve para leer el archivo de los pronosticos

		for (String linea : Files.readAllLines(Paths.get(archivos))) {

			String lineas[] = linea.split(" "); // creo un array con los elementos del archivo de los pronosticos

			equipo1 = new Equipo(); // instancio el equipo 1
			equipo1.setNombre(lineas[0]);

			equipo2 = new Equipo(); // instancio el equipo 2
			equipo2.setNombre(lineas[4]);

			pronostico = new Pronostico(); // instancio el pronostico
			pronostico.setEquipo1(equipo1);
			pronostico.setEquipo2(equipo2);
			pronostico.setGanaEquipo1(Integer.parseInt(lineas[1]));
			pronostico.setEmpate(Integer.parseInt(lineas[2]));
			pronostico.setGanaEquipo2(Integer.parseInt(lineas[3]));

			listaPronosticos.add(pronostico); // cargo el pronostico en la lista de pronosticos
		}

		// este for sirve para comparar los resultados y los pronosticos

		Resultado resultado = Resultado.EMPATE;
		ArrayList<Resultado> listaResultados = new ArrayList<Resultado>();

		for (int i = 0; i < listaPartidos.size(); i++) {
			resultado = resultado.getResultadoPronostico(listaPartidos.get(i), listaPronosticos.get(i));
			listaResultados.add(resultado);
		}

		// mostramos el puntaje
		System.out.print("Puntaje: " + resultado.getPuntaje(listaResultados));
	}
}
