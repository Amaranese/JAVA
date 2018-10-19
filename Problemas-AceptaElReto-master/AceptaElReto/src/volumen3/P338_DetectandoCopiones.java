package volumen3;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P338_DetectandoCopiones {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		while (entrada.hasNext()) {
			int n = entrada.nextInt();
			int[] examenesVistos = new int[entrada.nextInt()];
			int ultimoVisto = 0;
			int copiasDetectadas = 0;
			int[] memorizados = new int[100000];
			Map<Integer, Integer> copias = new HashMap<>();
			for (int i = 0; i < n; i++) {
				int examen = entrada.nextInt();
				Integer numCopias = copias.get(examen);
				if (numCopias == null) {
					copias.put(examen, 0);
				} else {
					copias.put(examen, numCopias + 1);
				}
				if (memorizados[examen - 1] > 0) {
					copiasDetectadas++;
				}
				// Memorizar examen
				if (examenesVistos[ultimoVisto] != 0) {
					memorizados[examenesVistos[ultimoVisto] - 1]--;
				}
				examenesVistos[ultimoVisto] = examen;
				ultimoVisto = (ultimoVisto + 1) % examenesVistos.length;
				memorizados[examen - 1]++;
			}
			int copiasTotales = 0;
			Collection<Integer> numeroCopias = copias.values();
			for (Integer nCopias : numeroCopias) {
				copiasTotales += nCopias;
			}
			System.out.println(copiasTotales + " " + copiasDetectadas);
		}

	}

}
