package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P146_NumerosAfortunados {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static String in;
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		while (!(in = br.readLine()).equals("0")) {
			int n = Integer.parseInt(in);
			boolean[] sieve = new boolean[n];
			int inc = 1;
			int size = n;
			while (inc < size) {
				int count = inc;
				for (int i = 0; i < sieve.length; i++) {
					if (!sieve[i]) {
						if (count == inc) {
							sieve[i] = true;
							size--;
							count = 0;
						} else {
							count++;
						}
					}
				}
				inc++;
			}
			sb.append(n + ":");
			for (int i = sieve.length - 1; i >= 0; i--) {
				if (!sieve[i]) {
					sb.append(" " + (i + 1));
				}
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}

}
