package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P314_TemperaturasExtremas {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			entrada.readLine();
			String[] temperaturasStr = entrada.readLine().split(" ");
			short[] temperaturas = new short[temperaturasStr.length];
			for (int j = 0; j < temperaturas.length; j++) {
				temperaturas[j] = Short.parseShort(temperaturasStr[j]);
			}
			short picos = 0;
			short valles = 0;
			for (int j = 1; j < temperaturas.length - 1; j++) {
				if (temperaturas[j] > temperaturas[j - 1] && temperaturas[j] > temperaturas[j + 1]) {
					picos++;
				} else if (temperaturas[j] < temperaturas[j - 1] && temperaturas[j] < temperaturas[j + 1]) {
					valles++;
				}
			}
			System.out.println(picos + " " + valles);
		}
	}

}
