package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P131_LlenandoPiscinas {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringBuilder sbOut = new StringBuilder(1000);
	private static String yo = "YO ";
	private static String vecino = "VECINO ";
	private static String empate = "EMPATE ";

	public static void main(String[] args) throws IOException {
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int piscinaMia = Integer.parseInt(st.nextToken());
			if (piscinaMia == 0) {
				break;
			}
			int llenadoMio = Integer.parseInt(st.nextToken());
			int perdidaMia = Integer.parseInt(st.nextToken());
			int piscinaVecino = Integer.parseInt(st.nextToken());
			if (piscinaVecino == 0) {
				break;
			}
			int llenadoVecino = Integer.parseInt(st.nextToken());
			int perdidaVecino = Integer.parseInt(st.nextToken());

			int viajesMios = 0;
			if (piscinaMia <= llenadoMio || llenadoMio - perdidaMia > 0) {
				int llenoMio = 0;
				while (llenoMio < piscinaMia) {
					viajesMios++;
					llenoMio += llenadoMio;
					if (llenoMio >= piscinaMia) {
						break;
					}
					llenoMio -= perdidaMia;
				}
			} else {
				viajesMios = Integer.MAX_VALUE;
			}
			System.out.println(viajesMios);

			int viajesVecino = 0;
			if (piscinaVecino <= llenadoVecino || llenadoVecino - perdidaVecino > 0) {
				int llenoVecino = 0;
				while (llenoVecino <= piscinaVecino) {
					viajesVecino++;
					llenoVecino += llenadoVecino;
					if (llenoVecino >= piscinaVecino) {
						break;
					}
					llenoVecino -= perdidaVecino;
				}
			} else {
				viajesVecino = Integer.MAX_VALUE;
			}
			System.out.println(viajesVecino);

			if (viajesMios < viajesVecino) {
				sbOut.append(yo).append(viajesMios).append('\n');
			} else if (viajesVecino < viajesMios) {
				sbOut.append(vecino).append(viajesVecino).append('\n');
			} else {
				sbOut.append(empate).append(viajesMios).append('\n');
			}
		}
		System.out.print(sbOut);
	}

}
