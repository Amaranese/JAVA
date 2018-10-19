package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P334_GalosRomanosOtrasGentes {

	static String[] origen = new String[] { "GALO\n", "ROMANO\n", "GODO\n", "GRIEGO\n", "NORMANDO\n", "BRETON\n",
			"HISPANO\n", "INDIO\n", "PICTO\n", "MULATO\n", "PLUS ULTRA\n" };
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static String nombre;
	static StringBuilder sb = new StringBuilder(10000);
	static int nOrigen;

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			nombre = br.readLine();
			nOrigen = origenNombre(nombre);
			if (nOrigen == -1) {
				if (nombre.startsWith("MAC")) {
					sb.append(origen[8]);
				} else {
					sb.append(origen[10]);
				}
			} else {
				if (nombre.startsWith("MAC")) {
					sb.append(origen[9]);
				} else {
					sb.append(origen[nOrigen]);
				}
			}
		}
		System.out.print(sb.toString());
	}

	private static int origenNombre(String nombre) {
		if (nombre.endsWith("IX")) {
			return 0;
		}
		if (nombre.endsWith("US") || nombre.endsWith("UM")) {
			return 1;
		}
		if (nombre.endsWith("IC")) {
			return 2;
		}
		if (nombre.endsWith("AS")) {
			return 3;
		}
		if (nombre.endsWith("AF")) {
			return 4;
		}
		if (nombre.endsWith("IS") || nombre.endsWith("OS") || nombre.endsWith("AX")) {
			return 5;
		}
		if (nombre.endsWith("EZ")) {
			return 6;
		}
		if (nombre.endsWith("A")) {
			return 7;
		}
		return -1;
	}

}
