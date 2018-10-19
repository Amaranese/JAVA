package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P170_TriangulosConPiedras {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder(10000);
	static String zero = "0";
	static String in;

	public static void main(String[] args) throws IOException {
		while (!(in = br.readLine()).equals(zero)) {
			int n = Integer.parseInt(in);
			int doble = n * 2;
			int lado = (int) Math.sqrt(doble);
			long triangulo = ((lado * lado - lado) / 2 + lado);
			if (triangulo > n) {
				lado--;
			}
			n -= ((lado * lado - lado) / 2 + lado);
			sb.append(lado).append(' ').append(n).append('\n');
		}
		System.out.print(sb);
	}

}
