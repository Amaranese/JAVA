package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P313_FinDeMes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sbOut = new StringBuilder(1000);
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			if (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) >= 0) {
				sbOut.append("SI\n");
			} else {
				sbOut.append("NO\n");
			}
		}
		System.out.print(sbOut.toString());
	}

}
