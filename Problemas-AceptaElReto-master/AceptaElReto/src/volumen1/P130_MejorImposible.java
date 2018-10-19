package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P130_MejorImposible {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("unused")
		String dimensiones;
		while (!(dimensiones = entrada.readLine()).equals("0")) {
			String[] puntos = entrada.readLine().split(" ");
			int difX = Math.abs(Integer.parseInt(puntos[0]) - Integer.parseInt(puntos[2]));
			int difY = Math.abs(Integer.parseInt(puntos[1]) - Integer.parseInt(puntos[3]));
			if (difX == 0 && difY == 0) {
				System.out.println(0);
			} else if (difX == difY) {
				System.out.println(1);
			} else {
				int difXmod2 = difX % 2;
				int difYmod2 = difY % 2;
				if ((difXmod2 == 0 || difYmod2 != 0) && (difXmod2 != 0 || difYmod2 == 0)) {
					System.out.println(2);
				} else {
					System.out.println("IMPOSIBLE");
				}
			}
		}
	}

}
