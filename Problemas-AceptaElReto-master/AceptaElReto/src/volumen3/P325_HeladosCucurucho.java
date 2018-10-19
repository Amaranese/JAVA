package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P325_HeladosCucurucho {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String ln = "\n";

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder helados = new StringBuilder(10000);
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int cs = Integer.parseInt(st.nextToken());
			int vs = Integer.parseInt(st.nextToken());
			generaHelados(cs, vs, helados);
			helados.replace(helados.length() - 1, helados.length(), ln);
		}
		System.out.print(helados);
	}

	private static void generaHelados(int cs, int vs, StringBuilder helados) {
		generaHeladosAux(cs, vs, helados, new StringBuilder());
	}

	private static void generaHeladosAux(int cs, int vs, StringBuilder helados, StringBuilder sbAux) {
		if (cs == 0 && vs == 0) {
			helados.append(sbAux.toString()).append(' ');
		} else {
			if (cs > 0) {
				generaHeladosAux(cs - 1, vs, helados, sbAux.append('C'));
				sbAux.deleteCharAt(sbAux.length() - 1);
			}
			if (vs > 0) {
				generaHeladosAux(cs, vs - 1, helados, sbAux.append('V'));
				sbAux.deleteCharAt(sbAux.length() - 1);
			}
		}
	}

}
