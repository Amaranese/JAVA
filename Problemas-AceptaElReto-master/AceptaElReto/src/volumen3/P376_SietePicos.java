package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P376_SietePicos {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String nStr;
		while (!(nStr = entrada.readLine()).equals("0")) {
			short[] alturas = new short[Short.parseShort(nStr)];
			String[] alturasStr = entrada.readLine().split(" ");
			for (int i = 0; i < alturas.length; i++) {
				alturas[i] = Short.parseShort(alturasStr[i]);
			}
			short picos = 0;
			for (int i = 0; i < alturas.length; i++) {
				int anterior = i == 0 ? alturas.length - 1 : i - 1;
				int siguiente = i == alturas.length - 1 ? 0 : i + 1;
				if (alturas[i] > alturas[anterior] && alturas[i] > alturas[siguiente]) {
					picos++;
				}
			}
			System.out.println(picos);
		}
	}

}
