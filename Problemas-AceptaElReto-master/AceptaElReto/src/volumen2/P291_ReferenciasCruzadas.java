package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class P291_ReferenciasCruzadas {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		while (!(in = br.readLine()).startsWith("0")) {
			int n = Integer.parseInt(in);
			TreeMap<String, TreeSet<Integer>> referencias = new TreeMap<>();
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				while (st.hasMoreTokens()) {
					String palabra = st.nextToken().toLowerCase();
					if (palabra.length() > 2) {
						if (!referencias.containsKey(palabra)) {
							referencias.put(palabra, new TreeSet<Integer>());
						}
						referencias.get(palabra).add(i + 1);
					}
				}
			}
			StringBuilder sb = new StringBuilder();
			for (String s : referencias.keySet()) {
				sb.append(s);
				for (Integer i : referencias.get(s)) {
					sb.append(" " + i);
				}
				sb.append("\n");
			}
			System.out.println(sb.toString()+"----");
		}
	}
}
