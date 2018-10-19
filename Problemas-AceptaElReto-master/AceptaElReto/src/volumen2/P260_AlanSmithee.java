package volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P260_AlanSmithee {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<Character, Integer> frequenciesLine1;
		StringBuilder sbOut = new StringBuilder(1000);
		for (int i = 0; i < n; i++) {
			frequenciesLine1 = new HashMap<>();
			char[] charsLine0 = br.readLine().toLowerCase().toCharArray();
			char[] charsLine1 = br.readLine().toLowerCase().toCharArray();
			for (int j = 0; j < charsLine0.length; j++) {
				Character c = charsLine0[j];
				if (c != ' ') {
					if (frequenciesLine1.containsKey(c)) {
						frequenciesLine1.put(c, frequenciesLine1.get(c) + 1);
					} else {
						frequenciesLine1.put(c, 1);
					}
				}
			}
			boolean anagram = true;
			for (int j = 0; j < charsLine1.length && anagram; j++) {
				Character c = charsLine1[j];
				if (c != ' ') {
					if (frequenciesLine1.containsKey(c)) {
						frequenciesLine1.put(c, frequenciesLine1.get(c) - 1);
					} else {
						anagram = false;
					}
				}
			}
			if (anagram) {
				for (Integer f : frequenciesLine1.values()) {
					if (f != 0) {
						anagram = false;
						break;
					}
				}
			}
			if (anagram) {
				sbOut.append("SI\n");
			} else {
				sbOut.append("NO\n");
			}
		}
		System.out.print(sbOut.toString());
	}

}
