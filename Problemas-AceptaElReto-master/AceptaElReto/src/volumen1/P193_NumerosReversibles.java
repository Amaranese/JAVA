package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P193_NumerosReversibles {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String nStr;
		while (!(nStr = entrada.readLine()).equals("0")) {
			int n = Integer.parseInt(nStr);
			String rStr = new StringBuilder(nStr).reverse().toString();
			boolean reversible = true;
			if (rStr.charAt(0) == '0') {
				reversible = false;
			} else {
				int r = Integer.parseInt(rStr);
				String sStr = Integer.toString(n + r);
				for (int i = 0; i < sStr.length() && reversible; i++) {
					reversible = Character.getNumericValue(sStr.charAt(i)) % 2 != 0;
				}
			}
			if (reversible) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}
	}

}
