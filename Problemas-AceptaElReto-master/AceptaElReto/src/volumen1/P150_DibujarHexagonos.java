package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P150_DibujarHexagonos {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		StringTokenizer st;
		StringBuilder hexagon = new StringBuilder(1000);
		while (!(in = br.readLine()).equals("0 0")) {
			st = new StringTokenizer(in);
			int size = Integer.parseInt(st.nextToken());
			char symbol = st.nextToken().charAt(0);
			int spaces = size;
			int chars = size - 2;
			for (int i = 0; i < 2 * size - 1; i++) {
				if (i < size) {
					spaces--;
					chars += 2;
				} else {
					spaces++;
					chars -= 2;
				}
				for (int j = 0; j < spaces; j++) {
					hexagon.append(' ');
				}
				for (int j = 0; j < chars; j++) {
					hexagon.append(symbol);
				}
				hexagon.append('\n');
			}
		}
		System.out.print(hexagon.toString());
	}

}
