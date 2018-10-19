package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P364_EspionajeNavidad {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String in;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		while (!(in = br.readLine()).equals("FIN")) {
			char[] cs = in.toCharArray();
			for (int i = 0; i < cs.length; i++) {
				if (cs[i] != ' ') {
					cs[i] = cs[i] != 'Z' ? ++cs[i] : 'A';
				}
			}
			sb.append(String.valueOf(cs) + "\n");
		}
		System.out.print(sb.toString());
	}
}
