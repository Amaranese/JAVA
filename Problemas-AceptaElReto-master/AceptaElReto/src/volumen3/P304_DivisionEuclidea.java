package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P304_DivisionEuclidea {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder(1000);

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (b == 0) {
				sb.append("DIV0\n");
			} else if (a < 0) {
				int q = a / b;
				if (b > 0) {
					while (b * q > a) {
						q--;
					}
				} else {
					while (b * q > a) {
						q++;
					}
				}
				sb.append(q + " " +  (a - (b * q)) + "\n");
			} else {
				sb.append(a / b + " " + a % b + "\n");
			}
		}
		System.out.print(sb);
	}

}
