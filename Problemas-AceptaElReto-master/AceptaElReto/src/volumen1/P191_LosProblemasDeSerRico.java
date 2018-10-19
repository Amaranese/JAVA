package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P191_LosProblemasDeSerRico {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sbOut = new StringBuilder(1000);
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int capacity = Integer.parseInt(st.nextToken());
			int difference = Integer.parseInt(st.nextToken());
			int total = capacity;
			for (int j = 1; j < m; j++) {
				capacity -= difference;
				total += capacity;
			}
			sbOut.append(total).append('\n');
		}
		System.out.print(sbOut.toString());
	}

}
