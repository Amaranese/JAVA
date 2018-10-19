package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P168_PiezaPerdida {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String in;
	static boolean[] piezas;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		while (!(in = br.readLine()).startsWith("0")) {
			int n = Integer.parseInt(in);
			piezas = new boolean[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				piezas[Integer.parseInt(st.nextToken()) - 1] = true;
			}
			for (int i = 0; i < piezas.length; i++) {
				if (piezas[i] == false) {
					sb.append((i + 1) + "\n");
					break;
				}
			}
		}
		System.out.print(sb.toString());
	}

}
