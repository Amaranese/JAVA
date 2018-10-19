package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P197_MensajeInterceptado {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder(10000);
	static String arrow = " => ";

	public static void main(String[] args) throws IOException {
		String in;
		while ((in = br.readLine()) != null) {
			String aux = new String(in);
			int cont = 0;
			int i = 0;
			while (cont < in.length() / 2) {
				if (i % 2 == 1) {
					cont++;
					String begin = aux.substring(0, cont);
					StringBuilder end = new StringBuilder(aux.substring(cont + 1, aux.length()));
					end = end.insert(end.length() - (cont - 1), in.charAt(i));
					aux = begin.concat(end.toString());
				}
				i++;
			}

			StringBuilder original = new StringBuilder(in.length());
			StringBuilder reverse = new StringBuilder();

			for (int j = 0; j < aux.length(); j++) {
				if (!isVowel(aux.charAt(j))) {
					reverse.append(aux.charAt(j));
				} else {
					original.append(reverse.reverse());
					original.append(aux.charAt(j));
					reverse.setLength(0);
				}
			}
			if (reverse.length() != 0) {
				original.append(reverse.reverse());
			}

			sb.append(in).append(arrow).append(original).append('\n');
			//System.out.println(in + " => " + original);
		}
		System.out.print(sb);
	}

	private static boolean isVowel(char c) {
		return "AEIOUaeiou".indexOf(c) != -1;
	}

}
