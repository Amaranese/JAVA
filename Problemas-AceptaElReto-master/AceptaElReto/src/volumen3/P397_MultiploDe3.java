package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P397_MultiploDe3 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sbOut = new StringBuilder(1000);
	static String si = "SI\n";
	static String no = "NO\n";

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			if (Integer.parseInt(br.readLine()) % 3 != 1) {
				sbOut.append(si);
			} else {
				sbOut.append(no);
			}
		}
		System.out.print(sbOut);
	}

}
