package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P380_MeCaso {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String in;
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws IOException {
		while (!(in = br.readLine()).equals("0")) {
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			out.append(sum + "\n");
		}
		System.out.print(out.toString());
	}

}
