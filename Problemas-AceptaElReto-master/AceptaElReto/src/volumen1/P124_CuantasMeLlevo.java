package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P124_CuantasMeLlevo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		StringBuilder sb = new StringBuilder();
		while (!(in = br.readLine()).startsWith("0 0")) {
			StringTokenizer st = new StringTokenizer(in);
			String numero0 = st.nextToken();
			String numero1 = st.nextToken();
			int length = Math.max(numero0.length(), numero1.length());
			int[] num0 = new int[length+1];
			int[] num1 = new int[length+1];
			asigna(numero0, num0);
			asigna(numero1, num1);
			int cont = 0;
			for (int i = length; i >= 0; i--) {
				if (num0[i] + num1[i] >= 10) {
					num1[i-1]++;
					cont++;
				}
			}
			sb.append(cont + "\n");
		}
		System.out.print(sb.toString());
	}

	private static void asigna(String numero, int[] num) {
		int pos = num.length - 1;
		for (int i = numero.length() - 1; i >= 0; i--) {
			num[pos] = Character.getNumericValue(numero.charAt(i));
			pos--;
		}
	}

}
