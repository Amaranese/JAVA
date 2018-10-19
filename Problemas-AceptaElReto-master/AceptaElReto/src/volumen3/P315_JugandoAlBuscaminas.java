package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P315_JugandoAlBuscaminas {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static String gameOver = "GAME OVER\n";
	static StringBuilder salida = new StringBuilder(10000);

	public static void main(String[] args) throws IOException {
		String valor;
		while ((valor = entrada.readLine()) != null) {
			StringTokenizer tokenizer = new StringTokenizer(valor);
			int filas = Integer.parseInt(tokenizer.nextToken());
			int columnas = Integer.parseInt(tokenizer.nextToken());
			char[][] tablero = new char[filas][columnas];
			for (int i = 0; i < tablero.length; i++) {
				String fila = entrada.readLine();
				for (int j = 0; j < fila.length(); j++) {
					tablero[i][j] = fila.charAt(j);
				}
			}
			char[][] tableroFinal = new char[filas][columnas];
			for (int i = 0; i < tableroFinal.length; i++) {
				Arrays.fill(tableroFinal[i], 'X');
			}
			tokenizer = new StringTokenizer(entrada.readLine());
			int k = Integer.parseInt(tokenizer.nextToken());
			boolean perdida = false;
			for (int i = 0; i < k; i++) {
				tokenizer = new StringTokenizer(entrada.readLine());
				int fila = Integer.parseInt(tokenizer.nextToken());
				int columna = Integer.parseInt(tokenizer.nextToken());
				perdida = encuentraMina(tablero, tableroFinal, fila - 1, columna - 1);
			}
			if (perdida) {
				salida.append(gameOver);
			} else {
				for (int i = 0; i < tableroFinal.length; i++) {
					for (int j = 0; j < tableroFinal[i].length; j++) {
						salida.append(tableroFinal[i][j]);
					}
					salida.append('\n');
				}
			}
		}
		System.out.print(salida);
	}

	private static boolean encuentraMina(char[][] tablero, char[][] tableroFinal, int fila, int columna) {
		if (tablero[fila][columna] == 'D') {
			return false;
		} else {
			if (tablero[fila][columna] == '*') {
				return true;
			} else {
				int minas = 0;
				// Explorar fila superior si es posible
				if (fila > 0) {
					minas += descubreFilas(tablero, fila - 1, columna);
				}
				// Explorar fila inferior si es posible
				if (fila < tablero.length - 1) {
					minas += descubreFilas(tablero, fila + 1, columna);
				}
				// Explorar columna izquierda si es posible
				if (columna > 0) {
					if (tablero[fila][columna - 1] == '*') {
						minas++;
					}
				}
				// Explorar columna derecha si es posible
				if (columna < tablero[0].length - 1) {
					if (tablero[fila][columna + 1] == '*') {
						minas++;
					}
				}
				
				tablero[fila][columna] = 'D';

				if (minas > 0) {
					tableroFinal[fila][columna] = String.valueOf(minas).charAt(0);
				} else {
					// Descubrir celdas contiguas de las celdas contiguas
					if (fila > 0) {
						descubreFilasCeldaContigua(tablero, tableroFinal, fila - 1, columna);
					}
					if (fila < tablero.length - 1) {
						descubreFilasCeldaContigua(tablero, tableroFinal, fila + 1, columna);
					}
					if (columna > 0) {
						encuentraMina(tablero, tableroFinal, fila, columna - 1);
					}
					if (columna < tablero[0].length - 1) {
						encuentraMina(tablero, tableroFinal, fila, columna + 1);
					}
					tableroFinal[fila][columna] = '-';
				}
				return false;
			}
		} 
	}

	private static void descubreFilasCeldaContigua(char[][] tablero, char[][] tableroFinal, int fila, int columna) {
		encuentraMina(tablero, tableroFinal, fila, columna);
		if (columna > 0) {
			encuentraMina(tablero, tableroFinal, fila, columna - 1);
		}
		if (columna < tablero[0].length - 1) {
			encuentraMina(tablero, tableroFinal, fila, columna + 1);
		}
	}

	private static int descubreFilas(char[][] tablero, int fila, int columna) {
		int minas = 0;
		if (tablero[fila][columna] == '*') {
			minas++;
		}
		if (columna > 0) {
			if (tablero[fila][columna - 1] == '*') {
				minas++;
			}
		}
		if (columna < tablero[0].length - 1) {
			if (tablero[fila][columna + 1] == '*') {
				minas++;
			}
		}
		return minas;
	}

}
