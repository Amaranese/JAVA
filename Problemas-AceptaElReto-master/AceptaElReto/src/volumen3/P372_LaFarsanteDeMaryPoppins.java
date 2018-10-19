package volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P372_LaFarsanteDeMaryPoppins {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String in;
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringBuilder auxSb = new StringBuilder(br.readLine());
			if (auxSb.length() != 1) {
				auxSb.reverse();
				char first = auxSb.charAt(0);
				char last = auxSb.charAt(auxSb.length() - 1);
				if (Character.isUpperCase(last)) {
					auxSb.deleteCharAt(auxSb.length() - 1);
					auxSb.append(Character.toLowerCase(last));
					auxSb.deleteCharAt(0);
					auxSb.insert(0, Character.toUpperCase(first));
				}
			}
			out.append(auxSb.toString() + "\n");
		}
		System.out.print(out.toString());
	}

}
