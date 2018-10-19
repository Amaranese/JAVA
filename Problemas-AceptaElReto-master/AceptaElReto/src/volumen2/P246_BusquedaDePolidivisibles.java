package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P246_BusquedaDePolidivisibles {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String caso;
		while ((caso = entrada.readLine()) != null) {
			int indiceBlanco = caso.indexOf(' ');
			String n = caso.substring(0, indiceBlanco);
			caso = caso.substring(indiceBlanco + 1);
			int d = Integer.parseInt(caso);
			StringBuilder polidivisibles = new StringBuilder();
			busquedaDePolidivisibles(n, d, polidivisibles);
			System.out.print(polidivisibles);
			System.out.println("---");
		}
	}

	private static void busquedaDePolidivisibles(String n, int d, StringBuilder polidivisibles) {
		polidivisibles.append(n).append('\n');
		if (n.length() < d) {
			for (int i = 0; i < 10; i++) {
				busquedaDePolidivisiblesAux(n + i, d, n.length() + 1, polidivisibles);
			}
		}
	}

	private static void busquedaDePolidivisiblesAux(String n, int d, int i, StringBuilder polidivisibles) {
		if (Long.parseLong(n) % n.length() == 0) {
			polidivisibles.append(n).append('\n');
			if (n.length() < d) {
				for (int j = 0; j < 10; j++) {
					busquedaDePolidivisiblesAux(n + j, d, n.length() + 1, polidivisibles);
				}
			}
		}
	}

}
