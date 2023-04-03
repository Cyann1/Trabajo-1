import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ProgramaPrincipal {

	public static void main(String[] args) throws IOException {

		Partido unPartido = new Partido();
		Equipo unEquipo1;
		Equipo unEquipo2;

		ArrayList<Partido> listaPartidos = new ArrayList<Partido>();

		String archivo = "Archivos\\resultados.txt";
		for (String linea : Files.readAllLines(Paths.get(archivo))) {
			String lineas[] = linea.split(" ");

			unPartido = new Partido();
			unEquipo1 = new Equipo();
			unEquipo2 = new Equipo();

			unEquipo1.setNombre(lineas[0]);
			unEquipo2.setNombre(lineas[3]);

			unPartido.setEquipo1(unEquipo1);
			unPartido.setEquipo2(unEquipo2);
			unPartido.setGolesEquipo1(Integer.parseInt(lineas[1]));
			unPartido.setGolesEquipo2(Integer.parseInt(lineas[2]));
			listaPartidos.add(unPartido);

		}

		/*for (int i = 0; i < listaPartidos.size(); i++) {
			JOptionPane.showMessageDialog(null,
					listaPartidos.get(i).getEquipo1().getNombre() + "   " + listaPartidos.get(i).getGolesEquipo1() + "  "
							+ listaPartidos.get(i).getGolesEquipo2() + "  " + listaPartidos.get(i).getEquipo2().getNombre());
		}*/
		
		Pronostico unPronostico;
		Equipo equipo1;
		Equipo equipo2;
		
		ArrayList<Pronostico> listaPronosticos = new ArrayList<Pronostico>();
		
		String archivos = "Archivos\\pronostico.txt";
		for (String linea : Files.readAllLines(Paths.get(archivos))) {
			String lineas[] = linea.split(" ");

			unPronostico = new Pronostico();
			equipo1 = new Equipo();
			equipo2 = new Equipo();
			
			equipo1.setNombre(lineas[0]);
			equipo2.setNombre(lineas[4]);
			
			unPronostico.setEquipo1(equipo1);
			unPronostico.setEquipo2(equipo2);
			unPronostico.setGanaEquipo1(Integer.parseInt(lineas[1]));
			unPronostico.setEmpate(Integer.parseInt(lineas[2]));
			unPronostico.setGanaEquipo2(Integer.parseInt(lineas[3]));
			listaPronosticos.add(unPronostico);
		}
		
		/*for (int i = 0; i < listaPronosticos.size(); i++) {
			JOptionPane.showMessageDialog(null, listaPronosticos.get(i).getEquipo1().getNombre() + "   " + listaPronosticos.get(i).getGanaEquipo1() + "  " + listaPronosticos.get(i).getEmpate() + "  "
					+ listaPronosticos.get(i).getGanaEquipo2() + "  " + listaPronosticos.get(i).getEquipo2().getNombre());
		}*/
	}

}
