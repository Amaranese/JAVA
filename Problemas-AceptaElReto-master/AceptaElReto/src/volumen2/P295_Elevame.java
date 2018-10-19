package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P295_Elevame {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static final int K = 31543;

	public static void main(String[] args) throws IOException {
		String datos;
		while (!(datos = entrada.readLine()).equals("0 0")) {
			String[] valores = datos.split(" ");
			System.out.println(eleva(Integer.parseInt(valores[0]), Integer.parseInt(valores[1])));
		}
	}

	private static int eleva(int x, int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return x % K;
		} else {
			int e = eleva(x, n / 2);
			if (n % 2 == 1) {
				return (((e * e) % K) * (x % K)) % K;
			} else {
				return (e * e) % K;
			}
		}
	}
}
