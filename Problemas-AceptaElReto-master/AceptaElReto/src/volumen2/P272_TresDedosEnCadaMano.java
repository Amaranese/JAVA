package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P272_TresDedosEnCadaMano {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder salida = new StringBuilder(100000);

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			int numBase10 = Integer.parseInt(entrada.readLine());
			int unidad = 6;
			StringBuilder numBase6 = new StringBuilder(8);
			while (numBase10 > 5) {
				numBase6.append(numBase10 % unidad);
				numBase10 = numBase10 / unidad;
			}
			numBase6.append(numBase10);
			salida.append(numBase6.reverse()).append('\n');
		}
		System.out.print(salida);
	}

}
