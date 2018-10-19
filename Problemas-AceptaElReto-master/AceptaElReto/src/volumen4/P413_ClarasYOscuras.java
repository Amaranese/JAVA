package volumen4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P413_ClarasYOscuras {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			String[] valores = entrada.readLine().split(" ");
			int ancho = Integer.parseInt(valores[0]);
			int alto = Integer.parseInt(valores[1]);
			int total = ancho * alto;
			int losas = total / 2;
			if (total % 2 == 0) {
				System.out.println(losas + " " + losas);
			} else {
				System.out.println((losas + 1) + " " + losas);
			}
		}
	}

}
