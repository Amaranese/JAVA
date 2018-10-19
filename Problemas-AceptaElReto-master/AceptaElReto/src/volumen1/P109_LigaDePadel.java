package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P109_LigaDePadel {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static String fin = "FIN";

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("unused")
		String categoria;
		while (!(categoria = entrada.readLine()).equals(fin)) {
			String partido;
			HashMap<String, Integer> clasificacion = new HashMap<>();
			int partidosJugados = 0;
			while (!(partido = entrada.readLine()).equals(fin)) {
				String[] marcador = partido.split(" ");
				int setsEquipo1 = Integer.parseInt(marcador[1]);
				int setsEquipo2 = Integer.parseInt(marcador[3]);
				puntua(marcador[0], setsEquipo1, marcador[2], setsEquipo2, clasificacion);
				puntua(marcador[2], setsEquipo2, marcador[0], setsEquipo1, clasificacion);
				partidosJugados++;
			}
			boolean empate = false;
			int maximaPuntuacion = 0;
			String ganador = null;
			Set<String> equipos = clasificacion.keySet();
			for (String equipo : equipos) {
				int puntuacion = clasificacion.get(equipo);
				if (puntuacion > maximaPuntuacion) {
					maximaPuntuacion = puntuacion;
					ganador = equipo;
					empate = false;
				} else if (puntuacion == maximaPuntuacion && !empate) {
					empate = true;
				}
			}
			int partidosNoJugados = equipos.size() * (equipos.size() - 1) - partidosJugados;
			if (empate) {
				System.out.println("EMPATE " + partidosNoJugados);
			} else {
				System.out.println(ganador + " " + partidosNoJugados);
			}
		}

	}

	public static void puntua(String equipo1, int setsEquipo1, String equipo2, int setsEquipo2,
			Map<String, Integer> clasificacion) {
		Integer puntosEquipo1 = clasificacion.get(equipo1);
		if (puntosEquipo1 == null) {
			if (setsEquipo1 > setsEquipo2) {
				clasificacion.put(equipo1, 2);
			} else {
				clasificacion.put(equipo1, 1);
			}
		} else {
			if (setsEquipo1 > setsEquipo2) {
				clasificacion.put(equipo1, puntosEquipo1 + 2);
			} else {
				clasificacion.put(equipo1, puntosEquipo1 + 1);
			}
		}
	}

}
