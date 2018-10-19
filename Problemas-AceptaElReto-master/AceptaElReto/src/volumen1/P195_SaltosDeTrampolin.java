package volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P195_SaltosDeTrampolin {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String in;
	static StringTokenizer st;
	static float[] saltos;
	static StringBuilder sb = new StringBuilder(10000);

	public static void main(String[] args) throws IOException {
		while ((in = br.readLine()) != null) {
			st = new StringTokenizer(in);
			saltos = new float[7];
			for (int i = 0; i < saltos.length; i++) {
				saltos[i] = Float.parseFloat(st.nextToken());
			}
			Arrays.sort(saltos);
			String meanStr = Float.toString((saltos[2] + saltos[3] + saltos[4]) * 2);
			int i = 0;
			while (meanStr.charAt(i) != '.') {
				sb.append(meanStr.charAt(i));
				i++;
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}

}
