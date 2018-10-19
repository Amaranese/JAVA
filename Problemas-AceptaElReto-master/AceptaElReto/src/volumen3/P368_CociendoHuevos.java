package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P368_CociendoHuevos {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		StringTokenizer st;
		StringBuilder sbOut = new StringBuilder(1000);
		while (!(in = br.readLine()).equals("0 0")) {
			st = new StringTokenizer(in);
			int h = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if (h % c == 0) {
				sbOut.append(10 * (h / c)).append('\n');
			} else {
				sbOut.append(10 * (h / c) + 10).append('\n');
			}
		}
		System.out.print(sbOut.toString());
	}

}
