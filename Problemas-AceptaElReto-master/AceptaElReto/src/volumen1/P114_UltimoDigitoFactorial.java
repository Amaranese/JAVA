package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P114_UltimoDigitoFactorial {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static StringBuilder salida = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(entrada.readLine());
			int res = 1;
			if (num < 5) {
				for (int j = num; j > 0; j--) {
					res *= j;
				}
				res = res % 10;
			} else {
				res = 0;
			}
			salida.append(res + "\n");
		}
		System.out.print(salida.toString());
	}

}
