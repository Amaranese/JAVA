package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P126_DivisoresFactorial {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String valores;
		while (true) {
			valores = entrada.readLine();
			StringTokenizer tokenizer = new StringTokenizer(valores);
			int p = Integer.parseInt(tokenizer.nextToken());
			int n = Integer.parseInt(tokenizer.nextToken());
			if (p < 0 && n < 0) {
				break;
			}
			if (p > 0 && p <= n || p == 1 && n == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
