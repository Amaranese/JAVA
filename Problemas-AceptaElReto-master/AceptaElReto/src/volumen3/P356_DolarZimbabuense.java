package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P356_DolarZimbabuense {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sbOut = new StringBuilder(1000);
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			long n0 = Long.parseLong(st.nextToken());
			long n1 = Long.parseLong(st.nextToken());
			long n2 = Long.parseLong(st.nextToken());
			if (n0 <= n1 && n1 <= n2) {
				sbOut.append(n0).append(' ').append(n1).append(' ').append(n2);
			} else if (n0 <= n2 && n2 <= n1) {
				sbOut.append(n0).append(' ').append(n2).append(' ').append(n1);
			} else if (n1 <= n0 && n0 <= n2){
				sbOut.append(n1).append(' ').append(n0).append(' ').append(n2);
			} else if (n1 <= n2 && n2 <= n0){
				sbOut.append(n1).append(' ').append(n2).append(' ').append(n0);
			} else if (n2 <= n0 && n0 <= n1) {
				sbOut.append(n2).append(' ').append(n0).append(' ').append(n1);
			} else {
				sbOut.append(n2).append(' ').append(n1).append(' ').append(n0);
			}
			sbOut.append('\n');
		}
		System.out.print(sbOut.toString());
	}

}
