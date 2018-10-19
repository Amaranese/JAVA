package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P335_PiramideDeCanicas {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder(10000);

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int l = Integer.parseInt(br.readLine());
			long canicas = 1;
			long aux = 1;
			for (int j = 2; j <= l; j++) {
				canicas += j + aux;
				aux += j;
			}
			sb.append(canicas).append('\n');
		}
		System.out.print(sb);
	}

}
