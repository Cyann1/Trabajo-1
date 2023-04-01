import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ProgramaPrincipal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*
		Partido unPartido = new Partido();

		Equipo miEquipo = new Equipo();
		miEquipo.nombre = "Argentina";

		Equipo miEquipo2 = new Equipo();
		miEquipo2.nombre = "Arabia";

		unPartido.equipo1 = miEquipo;
		unPartido.equipo2 = miEquipo2;
*/
		ArrayList<Partido> listaPartidos = new ArrayList<Partido>();
		
		Partido unPartido;
		
		Equipo unEquipo1;
		Equipo unEquipo2;
			
		String archivo = "archivos\\resultados";
		for (String linea : Files.readAllLines(Paths.get(archivo))){
		String lineas[]=linea.split(" ");
		
		unPartido = new Partido();
		unEquipo1 = new Equipo();
		unEquipo2 = new Equipo();
		
		unEquipo1.nombre=lineas[0];
		unEquipo2.nombre=lineas[3];
		
		unPartido.equipo1=unEquipo1;
		unPartido.equipo2=unEquipo2;
		
		unPartido.golesEquipo1=Integer.parseInt(lineas[1]);
		unPartido.golesEquipo2=Integer.parseInt(lineas[2]);
		
		listaPartidos.add(unPartido);
					
		}
		
		for(int i=9; i<listaPartidos.size();i++) {
			
			JOptionPane.showMessageDialog(null, listaPartidos.get(i).equipo1.nombre+" "+listaPartidos.get(i).golesEquipo1
					+" "+listaPartidos.get(i).golesEquipo2+" "+listaPartidos.get(i).equipo2.nombre);
			
		}

	}

}
