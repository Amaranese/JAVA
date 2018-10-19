package volumen4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P400_DurmiendoAlbergues {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sbOut = new StringBuilder(1000);

	public static void main(String[] args) throws IOException {
		String in;
		while ((in = br.readLine()) != null) {
			int max = 0;
			int beds = 0;
			boolean emptyFirst = in.charAt(0) == '.';
			boolean emptyLast = in.charAt(in.length() - 1) == '.';
			for (int i = 0; i < in.length(); i++) {
				if (in.charAt(i) == 'X') {
					if (emptyFirst) {
						max = Math.max(max, beds - 1);
						emptyFirst = false;
					} else {
						if (beds % 2 == 0) {
							max = Math.max(max, beds / 2 - 1);
						} else {
							max = Math.max(max, beds / 2);
						}
					}
					beds = 0;
				} else {
					if (i == in.length() - 1 && emptyLast) {
						max = Math.max(max, beds);
					} else {
						beds++;
					}
				}

			}
			sbOut.append(max).append('\n'); 
		}
		System.out.print(sbOut);
	}

}
