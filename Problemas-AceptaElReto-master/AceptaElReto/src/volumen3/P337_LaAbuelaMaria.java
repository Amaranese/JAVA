package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P337_LaAbuelaMaria {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sbOut = new StringBuilder(1000);
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer upperTeeth = new StringTokenizer(br.readLine());
			StringTokenizer lowerTeeth = new StringTokenizer(br.readLine());
			boolean fit = true;
			int sum = Integer.parseInt(upperTeeth.nextToken()) + Integer.parseInt(lowerTeeth.nextToken());
			while (upperTeeth.hasMoreTokens() && fit) {
				fit = Integer.parseInt(upperTeeth.nextToken()) + Integer.parseInt(lowerTeeth.nextToken()) == sum;
			}
			if (fit) {
				sbOut.append("SI\n");
			} else {
				sbOut.append("NO\n");
			}
		}
		System.out.print(sbOut.toString());
	}

}
