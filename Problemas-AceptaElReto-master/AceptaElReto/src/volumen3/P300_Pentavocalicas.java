package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P300_Pentavocalicas {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String in;
	static StringBuilder out = new StringBuilder();
	static boolean[] vocales = new boolean[] { false, false, false, false, false };
	static int vocalesSinProcesar = 5;

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String in = br.readLine();
			for (int j = 0; j < in.length(); j++) {
				switch (in.charAt(j)) {
				case 'a':
					if (!vocales[0]) {
						vocales[0] = true;
						vocalesSinProcesar--;
					}
					break;
				case 'e':
					if (!vocales[1]) {
						vocales[1] = true;
						vocalesSinProcesar--;
					}
					break;
				case 'i':
					if (!vocales[2]) {
						vocales[2] = true;
						vocalesSinProcesar--;
					}
					break;
				case 'o':
					if (!vocales[3]) {
						vocales[3] = true;
						vocalesSinProcesar--;
					}
					break;
				case 'u':
					if (!vocales[4]) {
						vocales[4] = true;
						vocalesSinProcesar--;
					}
				}
			}
			if (vocalesSinProcesar == 0) {
				out.append("SI\n");
			} else {
				out.append("NO\n");
			}
			for (int j = 0; j < vocales.length; j++) {
				vocales[j] = false;
			}
			vocalesSinProcesar = 5;
		}
		System.out.print(out.toString());
	}

}
