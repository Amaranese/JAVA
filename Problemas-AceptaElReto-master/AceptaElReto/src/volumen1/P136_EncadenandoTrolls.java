package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P136_EncadenandoTrolls {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String datos;
		while (!(datos = entrada.readLine()).startsWith("0")) {
			String[] fuerzaNumEslabones = datos.split(" ");
			System.out.println(
					parteEslabones(Integer.parseInt(fuerzaNumEslabones[0]), Integer.parseInt(fuerzaNumEslabones[1])));
		}
	}

	public static int parteEslabones(int fuerza, int numEslabones) {
		if (numEslabones > 2 * fuerza) {
			int numEslabonesHobbit = numEslabones / 3;
			int numEslabonesEnano = 2 * (numEslabones / 3) + (numEslabones % 3);
			return 1 + parteEslabones(fuerza, numEslabonesHobbit) + parteEslabones(fuerza, numEslabonesEnano);
		}
		return 0;
	}

}
