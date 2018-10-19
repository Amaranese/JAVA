package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P101_CuadradosDiabolicosEsotericos {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static StringBuilder salida = new StringBuilder(1000);
	private static String esoterico = "ESOTERICO\n";
	private static String diabolico = "DIABOLICO\n";
	private static String no = "NO\n";

	/**
	 *
	 * Conjunto de enteros de tamaño fijo
	 * 
	 */
	static class ConjuntoEnteros {
		
		private boolean[] almacen;
		private int elementos;

		public ConjuntoEnteros(int capacidad) {
			almacen = new boolean[capacidad];
			elementos = 0;
		}

		public void insertar(int num) {
			if (num > 0 && num <= almacen.length) {
				if (!almacen[num-1]) {
					almacen[num-1] = true;
					elementos++;
				}
			}
		}

		public void eliminar(int num) {
			if (num > 0 && num <= almacen.length) {
				if (almacen[num-1]) {
					almacen[num-1] = false;
					elementos--;
				}
			}
		}

//		public boolean contiene(int num) {
//			return almacen[num-1];
//		}
		
		public boolean esVacio() {
			return elementos == 0;
		}

	}

	public static void main(String[] args) throws IOException {
		String in;
		while (!(in = entrada.readLine()).equals("0")) {
			int n = Integer.parseInt(in);
			StringTokenizer st = new StringTokenizer(entrada.readLine());
			ConjuntoEnteros tablaEnteros = new ConjuntoEnteros(n * n);
			for (int i = 1; i <= n * n; i++) {
				tablaEnteros.insertar(i);
			}
			boolean sigueDiabolico = true;
			int[][] cuadrado = new int[n][n];
			int cmFila0 = 0;
			int[] cmCols = new int[n];
			int cmDP = 0;
			int cmDS = 0;
			for (int i = 0; i < n && sigueDiabolico; i++) {
				int cmFilai = 0;
				for (int j = 0; j < n && sigueDiabolico; j++) {
					cuadrado[i][j] = Integer.parseInt(st.nextToken());
					tablaEnteros.eliminar(cuadrado[i][j]);
					// cm Filas
					if (sigueDiabolico) {
						if (i == 0) {
							cmFila0 += cuadrado[i][j];
						} else {
							cmFilai += cuadrado[i][j];
							// Check
							if (j == n - 1) {
								sigueDiabolico = cmFilai == cmFila0;
							}
						}
					}
					// cm Columnas
					if (sigueDiabolico) {
						cmCols[j] += cuadrado[i][j];
						// Check
						if (i == n - 1) {
							sigueDiabolico = cmCols[j] == cmFila0;
						}
					}
					// cm Diagonales
					if (sigueDiabolico) {
						if (i == j) {
							cmDP += cuadrado[i][j];
						}
						if (i + j == n - 1) {
							cmDS += cuadrado[i][j];
						}
						// Check
						if (i == n - 1) {
							if (j == 0) {
								sigueDiabolico = cmDS == cmFila0;
							}
							if (j == n - 1) {
								sigueDiabolico = cmDP == cmFila0;
							}
						}
					}
				}
			}
			if (sigueDiabolico) {
				if (tablaEnteros.esVacio() && sumasIgualCM2(cuadrado, cmFila0)) {
					salida.append(esoterico);
				} else {
					salida.append(diabolico);
				}
			} else {
				salida.append(no);
			}
		}
		System.out.print(salida);
	}

	private static boolean sumasIgualCM2(int[][] cuadrado, int cm) {
		int cm2 = (4 * cm) / cuadrado.length;
		int ultimo = cuadrado.length - 1;
		int sumEsquinas =
				 	cuadrado[0][0]
				  + cuadrado[0][ultimo]
				  + cuadrado[ultimo][0]
				  + cuadrado[ultimo][ultimo];
		int centro = cuadrado.length / 2;
		int sumaCentroLaterales = 
					cuadrado[0][centro]
				  + cuadrado[centro][0]
				  + cuadrado[centro][ultimo]
				  + cuadrado[ultimo][centro];
		int sumaCentro = cuadrado[centro][centro];
		if (cuadrado.length % 2 == 0) {
			int centroAnterior = centro - 1;
			sumaCentroLaterales +=
						cuadrado[0][centroAnterior]
					  + cuadrado[centroAnterior][0]
					  + cuadrado[centroAnterior][ultimo]
					  + cuadrado[ultimo][centroAnterior];
			sumaCentro +=
						cuadrado[centroAnterior][centroAnterior]
					  + cuadrado[centroAnterior][centro]
					  + cuadrado[centro][centroAnterior];
			return sumEsquinas == cm2 && sumaCentroLaterales == 2 * cm2 && sumaCentro == cm2;
		} else {
			return sumEsquinas == cm2 && sumaCentroLaterales == cm2 && sumaCentro * 4 == cm2;
		}
	}

}
