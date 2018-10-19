package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P370_La1314 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String[] llave;
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			llave = br.readLine().split("-");
			int izq = Integer.parseInt(llave[0]);
			int der = Integer.parseInt(llave[1]);
			if (izq == (der - 1)) {
				if (izq % 2 == 0) {
					out.append("SI\n");
				} else {
					out.append("NO\n");
				}
			} else if (der == (izq - 1)) {
				if (der % 2 == 0) {
					out.append("SI\n");
				} else {
					out.append("NO\n");
				}
			} else {
				out.append("NO\n");
			}
		}
		System.out.print(out.toString());
	}

}
