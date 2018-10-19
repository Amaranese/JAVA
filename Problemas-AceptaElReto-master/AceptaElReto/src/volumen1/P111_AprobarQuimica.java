package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P111_AprobarQuimica {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static int[][] diagramaMoeller = new int[][] { { 2 }, { 2, 6 }, { 2, 6, 10 }, { 2, 6, 10, 14 },
			{ 2, 6, 10, 14 }, { 2, 6, 10 }, { 2, 6 } };

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("unused")
		String elemento;
		while (!(elemento = entrada.readLine()).equals("Exit")) {
			StringBuilder configuracion = new StringBuilder(1000);
			int z = Integer.parseInt(entrada.readLine());
			if (z == 0) {
				System.out.println("1s0");
			} else {
				int nivel = 0;
				int orbital = 0;
				int nivelAux = nivel;
				int orbitalAux = orbital;
				while (z > 0) {
					int electrones = 0;
					if (diagramaMoeller[nivel][orbital] <= z) {
						electrones = diagramaMoeller[nivel][orbital];
						z -= electrones;
					} else {
						electrones = z;
						z = 0;
					}
					configuracion.append(nivel + 1).append(letraOrbital(orbital)).append(electrones).append(' ');
					// Actualizar indices
					if (orbital == 0) {
						if (orbitalAux + 1 == diagramaMoeller[nivelAux].length) {
							nivelAux++;
						} else {
							orbitalAux++;
						}
						orbital = orbitalAux;
						nivel = nivelAux;
					} else {
						orbital--;
						nivel++;
					}
				}
				configuracion.replace(configuracion.length() - 1, configuracion.length(), "");
				System.out.println(configuracion);
			}
		}

	}

	private static char letraOrbital(int indiceOrbital) {
		switch (indiceOrbital) {
		case 0:
			return 's';
		case 1:
			return 'p';
		case 2:
			return 'd';
		default:
			return 'f';
		}
	}

}
