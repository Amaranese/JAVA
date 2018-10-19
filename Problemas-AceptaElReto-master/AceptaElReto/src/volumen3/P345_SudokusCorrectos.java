package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P345_SudokusCorrectos {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder(1000);
	static String si = "SI\n";
	static String no = "NO\n";

	
	static class ListaEnteros {

		private boolean[] almacen;
		private int elementos;

		public ListaEnteros(int capacidad) {
			almacen = new boolean[capacidad];
			Arrays.fill(almacen, true);
			elementos = capacidad;
		}

		public void eliminar(int num) {
			if (num > 0 && num <= almacen.length) {
				if (almacen[num - 1]) {
					almacen[num - 1] = false;
					elementos--;
				}
			}
		}

		public boolean esVacio() {
			return elementos == 0;
		}

	}

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for (int c = 0; c < n; c++) {
			int[][] sudoku = new int[9][9];
			boolean sigueCorrecto = true;
			ListaEnteros[] compruebaFilas = new ListaEnteros[9];
			ListaEnteros[] compruebaColumnas = new ListaEnteros[9];
			ListaEnteros[] compruebaRegiones = new ListaEnteros[9];
			for (int i = 0; i < compruebaFilas.length; i++) {
				compruebaFilas[i] = new ListaEnteros(9);
				compruebaColumnas[i] = new ListaEnteros(9);
				compruebaRegiones[i] = new ListaEnteros(9);
			}
			for (int i = 0; i < sudoku.length; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < sudoku[i].length; j++) {
					sudoku[i][j] = Integer.parseInt(st.nextToken());
					compruebaFilas[i].eliminar(sudoku[i][j]);
					compruebaColumnas[j].eliminar(sudoku[i][j]);
				}
			}
			// Comprueba Filas
			for (int i = 0; i < compruebaFilas.length && sigueCorrecto; i++) {
				sigueCorrecto = compruebaFilas[i].esVacio();
			}
			// Comprueba Columnas
			if (sigueCorrecto) {
				for (int i = 0; i < compruebaColumnas.length && sigueCorrecto; i++) {
					sigueCorrecto = compruebaColumnas[i].esVacio();
				}
			}
			// Comprueba Regiones
			if (sigueCorrecto) {
				for (int i = 0; i < sudoku.length; i++) {
					for (int j = 0; j < sudoku[i].length; j++) {
						compruebaRegiones[i / 3 + j / 3 + (i / 3 * 3)].eliminar(sudoku[i][j]);
					}
				}
				for (int i = 0; i < compruebaRegiones.length && sigueCorrecto; i++) {
					sigueCorrecto = compruebaRegiones[i].esVacio();
				}
			}
			if (sigueCorrecto) {
				sb.append(si);
			} else {
				sb.append(no);
			}
		}
		System.out.print(sb);
	}

}
