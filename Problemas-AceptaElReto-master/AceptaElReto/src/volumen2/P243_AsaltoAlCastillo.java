package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P243_AsaltoAlCastillo {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder(10000);

	public static void main(String[] args) throws IOException {
		String in;
		while (!(in = br.readLine()).equals("0")) {
			int n = Integer.parseInt(in);
			int configs = 0;
			int sqrtN = (int) Math.sqrt(n);
			for (int i = 1; i <= sqrtN; i++) {
				if (n % i == 0) {
					if (i != n / i) {
						configs += 2;
					} else {
						configs++;
					}
				}
			}
			sb.append(configs).append('\n');
		}
		System.out.print(sb);
	}

}
