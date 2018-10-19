package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P293_Artropodos {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int j = 0;
			int sum = 0;
			while (st.hasMoreTokens()) {
				switch (j) {
				case 0:
					sum += 6 * Integer.parseInt(st.nextToken());
					break;
				case 1:
					sum += 8 * Integer.parseInt(st.nextToken());
					break;
				case 2:
					sum += 10 * Integer.parseInt(st.nextToken());
					break;
				default:
					sum += 2 * Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
				}
				j++;
			}
			sb.append(sum + "\n");
		}
		System.out.print(sb.toString());
	}

}
