package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P196_SudokusVacios {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			entrada.readLine();
			String[] sudoku = new String[9];
			for (int j = 0; j < sudoku.length; j++) {
				sudoku[j] = entrada.readLine();
			}
			if (esValido(sudoku)) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static boolean esValido(String[] sudoku) {
		int casillasVacias = 0;
		for (int i = 0; i < sudoku.length / 2; i++) {
			for (int j = 0; j < sudoku[i].length(); j++) {
				char c1 = sudoku[i].charAt(j);
				char c2 = sudoku[sudoku.length - 1 - i].charAt(sudoku[i].length() - 1 - j);
				if ((c1 == '-' || c2 == '-') && c1 != c2) {
					return false;
				}
				if (c1 == '-') {
					casillasVacias += 2;
				}
			}
		}
		// Fila 5
		for (int i = 0; i < sudoku[4].length() / 2; i++) {
			char c1 = sudoku[4].charAt(i);
			char c2 = sudoku[4].charAt(sudoku[i].length() - 1 - i);
			if ((c1 == '-' || c2 == '-') && c1 != c2) {
				return false;
			}
			if (c1 == '-') {
				casillasVacias += 2;
			}
		}
		// Casilla (5, 5)
		if (sudoku[4].charAt(4) == '-') {
			casillasVacias++;
		}
		return 81 - casillasVacias <= 32;
	}

}
