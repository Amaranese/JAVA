package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P119_EscudosDelEjercitoRomano {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringBuilder sb = new StringBuilder(10000);
	private static String zero = "0";

	public static void main(String[] args) throws IOException {
		String in;
		while (!(in = br.readLine()).equals(zero)) {
			int n = Integer.parseInt(in);
			int shields = 0;
			while (n > 0) {
				int sqrt = (int) Math.sqrt(n);
				shields += sqrt * (sqrt + 4);
				n -= sqrt * sqrt;
			}
			sb.append(shields).append('\n');
		}
		System.out.print(sb);
	}

}
