package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P265_SumaDescendente {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String in;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		while (!(in = br.readLine()).startsWith("0")) {
			int l = in.length();
			int n = Integer.parseInt(in);
			int sum = n;
			while (l > 0) {
				sum += n % (Math.pow(10, --l));
			}
			sb.append(sum + "\n");
		}
		System.out.println(sb.toString());
	}

}
