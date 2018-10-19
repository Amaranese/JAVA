package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P194_SalvemosAlLinceIberico {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			String carretera = entrada.readLine();
			int libres = 0;
			int tramos = 0;
			int tuneles = 0;
			for (int j = 0; j < carretera.length(); j++) {
				if (carretera.charAt(j) == '.') {
					libres++;
					tramos++;
				} else {
					if (tramos > 0) {
						tramos++;
					}
				}
				if (tramos == 3) {
					if (libres > 0) {
						tuneles++;
					}
					libres = 0;
					tramos = 0;
				}
			}
			if (libres > 0) {
				tuneles++;
			}
			System.out.println(tuneles);
		}
	}

}
