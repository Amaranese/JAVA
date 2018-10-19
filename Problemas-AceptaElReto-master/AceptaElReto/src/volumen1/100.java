package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P100_ConstanteDeKaprekar {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < n; i++) {
			String s = entrada.readLine();
			while (s.length() < 4) {
				s = "0" + s;
			}
			int pasos = 0;
			int num = Integer.parseInt(s);
			char[] ascend = s.toCharArray();
			char[] descend = new char[ascend.length];
			while (num != 6174) {
				Arrays.sort(ascend);
				int pos = 0;
				for (int j = ascend.length - 1; j >= 0; j--) {
					descend[pos] = ascend[j];
					pos++;
				}
				num = Integer.parseInt(String.valueOf(descend)) - Integer.parseInt(String.valueOf(ascend));
				if (num == 0) {
					pasos = 8;
					break;
				} else {
					String numRelleno = String.valueOf(num);
					while (numRelleno.length() < 4) {
						numRelleno = "0" + numRelleno;
					}
					ascend = numRelleno.toCharArray();
					pasos++;
				}
			}
			System.out.println(pasos);
		}
	}

}
