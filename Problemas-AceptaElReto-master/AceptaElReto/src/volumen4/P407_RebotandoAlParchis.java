package volumen4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P407_RebotandoAlParchis {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String datos;
		while (!(datos = entrada.readLine()).equals("0 0 0")) {
			String[] valores = datos.split(" ");
			int c = Integer.parseInt(valores[0]);
			int p = Integer.parseInt(valores[1]);
			int t = Integer.parseInt(valores[2]);
			int posicionFinal = p + t;
			if (posicionFinal > c) {
				posicionFinal = c - (posicionFinal - c);
			}
			System.out.println(posicionFinal);
		}
	}

}
