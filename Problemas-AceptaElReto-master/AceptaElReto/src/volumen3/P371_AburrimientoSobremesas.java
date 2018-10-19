package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P371_AburrimientoSobremesas {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String in;

	public static void main(String[] args) throws NumberFormatException, IOException {
		while (!(in = br.readLine()).equals("0")) {
			int n = Integer.parseInt(in);
			int cb = 0;
			for (int i = 1; i <= n; i++) {
				cb += 3 * i;
			}
			sb.append(cb + "\n");
		}
		System.out.print(sb.toString());
	}

}
