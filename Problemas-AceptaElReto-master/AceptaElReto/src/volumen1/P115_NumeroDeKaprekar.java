package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P115_NumeroDeKaprekar {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringBuilder sb = new StringBuilder();
	private static String zero = "0";
	private static String no = "NO\n";
	private static String si = "SI\n";

	public static void main(String[] args) throws IOException {
		String in;
		while (!(in = br.readLine()).equals(zero)) {
			int n = Integer.parseInt(in);
			long sqr = (long) n * (long) n;
			String sqrStr = Long.toString(sqr);
			if (sqrStr.length() < 2) {
				if (n == 1) {
					sb.append(si);
				} else {
					sb.append(no);
				}
				continue;
			}
			boolean kaprekar = false;
			for (int i = 1; i < sqrStr.length() && !kaprekar; i++) {
				long n1 = Long.parseLong(sqrStr.substring(0, i));
				long n2 = Long.parseLong(sqrStr.substring(i, sqrStr.length()));
				kaprekar = n1 + n2 == n && n2 != 0;
			}
			if (kaprekar) {
				sb.append(si);
			} else {
				sb.append(no);
			}
		}
		System.out.print(sb);
	}

}
